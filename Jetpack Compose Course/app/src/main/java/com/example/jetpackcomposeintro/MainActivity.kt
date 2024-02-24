package com.example.jetpackcomposeintro

import android.annotation.SuppressLint
import android.os.Bundle
import android.widget.Toast
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.aspectRatio
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.requiredWidth
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.itemsIndexed
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Button
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Snackbar
import androidx.compose.material3.SnackbarHost
import androidx.compose.material3.SnackbarHostState
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.jetpackcomposeintro.ui.theme.JetpackComposeIntroTheme
import kotlinx.coroutines.launch
import kotlin.random.Random

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            part7()
            /* // continue to part 6
            Column(Modifier.fillMaxSize()) {
                val color = remember {
                    mutableStateOf(Color.Yellow)
                }
                part6(
                    modifier = Modifier
                        .weight(1f)
                        .fillMaxSize()
                )
                {
                    color.value = it
                }
                Box(
                    modifier = Modifier
                        .background(color.value)
                        .weight(1f)
                        .fillMaxSize()
                )
            }
             */
        ///////////////////////
        // Android Docs tutorial
        }
    }
}

// ANDROID COMPOSE TUTORIAL //

/* Lesson 2: layouts */

data class Message(val author: String, val body: String)

@Composable
fun MessageCard(msg : Message){
    Row(modifier = Modifier
        // Add padding around the message
        .padding(all = 8.dp)) {
        val painter = painterResource(id = R.drawable.grievous)
        Image(painter = painter,
            contentDescription = "AuthorImage",
            modifier = Modifier
                // Set image size to 40 dp
                .size(40.dp)
                // Clip image to be shaped as a circle
                .clip(CircleShape))
        // Add a horizontal space between the image and the column
        Spacer(modifier = Modifier.width(8.dp))

        Column {
            Text(text = "Author: ${msg.author}")
            // Add a vertical space between the author and message
            Spacer(modifier = Modifier.height(8.dp))
            Text(text = "Message: ${msg.body}")
        }
    }
}
@Preview
@Composable
fun PreviewMessageCard(){
    MessageCard(msg = Message(author = "Grievous", body = "General Kenobi!"))
}


/* Lesson 3: Material Design */



// PHILIPP LACKNER YT TUTORIAL //

// Rows, Columns and Basic Sizing - part 2
@Composable
fun part2() {
    Row(
        modifier = Modifier
            .width(200.dp)
            .height(300.dp)
            .background(Color.Green),
        horizontalArrangement = Arrangement.SpaceEvenly,
        verticalAlignment = Alignment.CenterVertically
    ) {
        Text("Hello")
        Text("World")
    }
}

// Modifiers - part 3
@Composable
fun part3() {
    Column(
        modifier = Modifier
            .background(Color.Green)
            .fillMaxHeight(0.5f)
            .fillMaxWidth()
            .padding(top = 16.dp)
            .border(5.dp, Color.Magenta)
//            .requiredWidth(600.dp)
    ) {
        Text("Hello", modifier = Modifier
            .offset(0.dp, 20.dp)
            .clickable { })
        Spacer(modifier = Modifier.height(50.dp))
        Text("World")

    }
}

// State - part 6
@Composable
fun part6(
    modifier: Modifier = Modifier,
    updateColor: (Color) -> Unit
) {
    Box(modifier = modifier
        .background(Color.Red)
        .clickable {
            updateColor(
                Color(
                    Random.nextFloat(),
                    Random.nextFloat(),
                    Random.nextFloat(),
                    1f
                )
            )
        })
}

// Textfields, Buttons & Showing Snackbars - part 7
@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun part7() {
    var textFieldState by remember { mutableStateOf("") }
    val snackbarHostState = remember { SnackbarHostState() }
    val scope = rememberCoroutineScope()

    Scaffold(
        modifier = Modifier.fillMaxSize(),
        snackbarHost = { SnackbarHost(snackbarHostState) }) {
        Column(
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center,
            modifier = Modifier
                .fillMaxSize()
                .padding(horizontal = 30.dp)
        ) {
            TextField(
                value = textFieldState,
                label = {
                    Text("Enter your name")
                },
                onValueChange = {
                    textFieldState = it
                },
                singleLine = true,
                modifier = Modifier.fillMaxWidth()
            )
            Spacer(modifier = Modifier.height(16.dp))
            Button(onClick = {
                scope.launch { snackbarHostState.showSnackbar("Hello $textFieldState!") }
            }) {
                Text("Pls greet me!")
            }
        }
    }
}

// Lists & Lazy Column - part 8
@Composable
fun part8() {
    LazyColumn {
        itemsIndexed(
            listOf("This", "is", "Jetpack", "Compose")
        ){index, string ->
            Text(
                text = string,
                fontSize = 24.sp,
                fontWeight = FontWeight.Bold,
                textAlign = TextAlign.Center,
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(vertical = 24.dp)
            )
        }

    }
}

// ConstraintLayout - part 9