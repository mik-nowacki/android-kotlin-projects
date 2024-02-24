package com.example.spartapp

import android.content.Intent
import android.os.Bundle
import android.widget.Toast
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.tooling.preview.Preview
import com.example.spartapp.ui.theme.SpartAppTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            GoToWorkoutActivityButton()
        }
    }
}

@Composable
fun GoToWorkoutActivityButton() {
    val context = LocalContext.current
    Button(onClick = {
        context.startActivity(Intent(context, WorkoutActivity::class.java))
    }) {
        Text(text = "Workout")
    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {

}