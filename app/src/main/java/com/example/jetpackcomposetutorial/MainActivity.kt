package com.example.jetpackcomposetutorial

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.jetpackcomposetutorial.ui.theme.JetpackComposeTutorialTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            JetpackComposeTutorialTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                    Greeting("Jetpack Compose tutorial")
                }
            }
        }
    }
}

@Composable
fun Greeting(name: String) {
    val image= painterResource(id = R.drawable.bg_compose_background)
    Box {
        Image(
            painter = image,
            contentDescription = null,
            modifier=Modifier.fillMaxHeight(),
            alignment = Alignment.TopCenter,

        )
        Column {
            Text(
                text = name,
                modifier = Modifier
                    .padding(start = 16.dp, top = 136.dp),
                fontSize = 24.sp
            )
            Text(
                text="Jetpack Compose is a modern toolkit for building native Android UI. " +
                        "Compose simplifies and accelerates UI development on Android with less code, powerful tools, and intuitive Kotlin APIs.",
                modifier=Modifier
                    .padding(start= 19.dp, top= 20.dp, end=16.dp),
                textAlign = TextAlign.Justify
            )
            Text(
                text="In this tutorial, you build a simple UI component with declarative functions. " +
                        "You call Compose functions to say what elements you want and the Compose compiler does the rest. " +
                        "Compose is built around Composable functions. These functions let you define your app's UI programmatically because they let you describe how it should look and provide data dependencies, rather than focus on the process of the UI's construction, such as initializing an element and then attaching it to a parent. " +
                        "To create a Composable function, you add the @Composable annotation to the function name.",
                modifier = Modifier
                    .padding(start=19.dp, top=10.dp, end=16.dp),
                textAlign = TextAlign.Justify
            )
        }
    }
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    JetpackComposeTutorialTheme {
        Greeting("Jetpack Compose tutorial")
    }
}