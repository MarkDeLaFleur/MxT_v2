package com.markd.mxt_v2

import android.os.Bundle
import android.util.Log
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.size
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.markd.mxt_v2.ui.theme.MxT_v2Theme
import org.opencv.android.OpenCVLoader


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        if (!OpenCVLoader.initDebug()) Log.e("OpenCVError", "Unable to load OpenCV!")
        else   Log.d("OpenCVGood", "OpenCV loaded Successfully!")


        super.onCreate(savedInstanceState)
        setContent {
            MxT_v2Theme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Greeting("Android")
                }
            }
        }
    }
}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    val imageModifier = Modifier
        .size(10.dp)
        .border(BorderStroke(1.dp, Color.White))
        .background(Color.White)

    Image(
        painter = painterResource(id = R.drawable.ic_doublethree_wide),
        contentDescription = "nookie",modifier =imageModifier

    )
    Text(
        text = "Hello $name!",
        modifier = modifier
    )

}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    MxT_v2Theme {
        Greeting("Android")
    }
}