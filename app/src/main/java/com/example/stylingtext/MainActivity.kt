package com.example.stylingtext

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.SpanStyle
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.withStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            LearnTExt()

        }
    }
}

@Composable
fun LearnTExt(modifier: Modifier = Modifier) {
    val midfont = FontFamily(
        Font(R.font.lexend_mid)
    )
    Box(
        modifier = modifier
            .fillMaxSize()
            .background(Color(0xFF101010))
    ) {
        Text(
            modifier = modifier.fillMaxSize(),
            text = buildAnnotatedString {
                withStyle(
                    style = SpanStyle(
                        color = Color.Green, fontSize = 50.sp
                    )
                ) {
                    append("j")
                }

                append("etpack ")

                        withStyle(
                            style = SpanStyle(
                                color = Color.Green, fontSize = 50.sp
                            )
                        ) {
                            append("c")
                        }
                        append("ompose")

                    },
                    textAlign = TextAlign.Center,
                    color = Color.Yellow,
                    fontSize = 30.sp,
                    fontWeight = FontWeight.Bold,
                    fontStyle = FontStyle.Italic,
                )


            }


    }


@Preview
@Composable
private fun Prev() {
    LearnTExt()

}
