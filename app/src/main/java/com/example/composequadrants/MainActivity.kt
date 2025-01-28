package com.example.composequadrants

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.composequadrants.ui.theme.ComposeQuadrantsTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            ComposeQuadrantsTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                    ) {
                    FirstQuadrant(modifier = Modifier.padding(8.dp), title = stringResource(
                        id = R.string.text_composable_text), 
                        description = stringResource(id = R.string.text_description_text))
                }
            }
        }
    }
}

@Composable
fun FirstQuadrant(modifier: Modifier = Modifier, title: String, description: String) {
    modifier.padding(start = 16.dp,
        end = 16.dp,
        top = 16.dp,
        bottom = 16.dp)
    Column (modifier = modifier,
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally) {
        Text(
            modifier = Modifier
                .padding(bottom = 16.dp),
            text = title,
            fontWeight = FontWeight.Bold
        )
        Text(
            modifier = Modifier,
            text = description,
            textAlign = TextAlign.Justify
        )
    }
}

@Preview(showBackground = true)
@Composable
fun FirstQuadrantPreview() {
    ComposeQuadrantsTheme {
        FirstQuadrant( title = "Text Composable" , description = "Displays text and follows the recommended Material Design guidelines." )
    }
}

