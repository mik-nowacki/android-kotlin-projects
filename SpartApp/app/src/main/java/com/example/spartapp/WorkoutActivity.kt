package com.example.spartapp

import android.os.Bundle
import android.widget.CalendarView
import android.widget.Toast
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.material3.BottomSheetScaffold
import androidx.compose.material3.Button
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.ModalBottomSheet
import androidx.compose.material3.ModalNavigationDrawer
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.rememberBottomSheetScaffoldState
import androidx.compose.material3.rememberModalBottomSheetState
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.spartapp.ui.theme.SpartAppTheme
import kotlinx.coroutines.launch

class WorkoutActivity : ComponentActivity() {
    @OptIn(ExperimentalMaterial3Api::class)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            // EXAMPLE 1 //
//            val sheetState = rememberModalBottomSheetState()
//            var isSheetOpen by rememberSaveable {
//                mutableStateOf(false)
//            }
//            Box(
//                modifier = Modifier.fillMaxSize(),
//                contentAlignment = Alignment.Center
//            ) {
//                Button(onClick = {
//                    isSheetOpen = true
//                }) {
//                    Text(text = "Open sheet")
//                }
//            }
//            if (isSheetOpen) {
//                ModalBottomSheet(
//                    sheetState = sheetState,
//                    onDismissRequest = { isSheetOpen = false }) {
//                    Image(
//                        painter = painterResource(
//                            id = R.drawable.ic_launcher_foreground
//                        ),
//                        contentDescription = null
//                    )
//                }
//            }
            // EXAMPLE 2 //
            Column(
                modifier = Modifier.fillMaxSize(),
                horizontalAlignment = Alignment.CenterHorizontally,
                verticalArrangement = Arrangement.SpaceEvenly
            ) {
                Button(onClick = {
                    Toast.makeText(
                        this@WorkoutActivity,
                        "BRUH",
                        Toast.LENGTH_SHORT
                    ).show()
                }) {
                    Text(text = "SELECT WORKOUT")
                }
                Button(onClick = {
                    Toast.makeText(
                        this@WorkoutActivity,
                        "BRUH",
                        Toast.LENGTH_SHORT
                    ).show()
                }) {
                    Text(text = "START WORKOUT")
                }
            }

            val scaffoldState = rememberBottomSheetScaffoldState()
            BottomSheetScaffold(scaffoldState = scaffoldState, sheetContent = {
                Box(
                    modifier = Modifier
                        .fillMaxWidth()
                        .height(48.dp)
                ) {
                    Row(
                        modifier = Modifier.matchParentSize(),
                        horizontalArrangement = Arrangement.SpaceEvenly
                    ) {
                        Button(onClick = {
                            Toast.makeText(
                                this@WorkoutActivity,
                                "History",
                                Toast.LENGTH_SHORT
                            ).show()
                        }) {
                            Text(text = "History")
                        }
                        Button(onClick = {
                            Toast.makeText(
                                this@WorkoutActivity,
                                "Timer",
                                Toast.LENGTH_SHORT
                            ).show()
                        }) {
                            Text(text = "Timer")
                        }
                        Button(onClick = {
                            Toast.makeText(
                                this@WorkoutActivity,
                                "Rep counter",
                                Toast.LENGTH_SHORT
                            ).show()
                        }) {
                            Text(text = "Rep counter")
                        }
                    }
                }
            }) {}
        }
    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview3() {
}