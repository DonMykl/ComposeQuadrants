package com.example.composequadrants

import androidx.compose.ui.graphics.Color
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
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
                    DisplayQuadrants()
                }
            }
        }
    }
}

@Composable
fun Quadrants(
    modifier: Modifier = Modifier,
    title: String,
    description: String,
    backgroundColor: Color) {
    Column (
        modifier = modifier
            .fillMaxSize()
            .background(backgroundColor)
            .padding(all = 16.dp),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally) {
        Text(
            modifier = Modifier
                .padding(bottom = 16.dp),
            text = title,
            fontWeight = FontWeight.Bold
        )
        Text(
            text = description,
            textAlign = TextAlign.Justify
        )
    }
}

@Composable
fun DisplayQuadrants(modifier: Modifier = Modifier) {
    Column (Modifier.fillMaxSize()) {
        Row(Modifier.weight(1f)){
            Quadrants(
                title = stringResource(id = R.string.text_composable_text),
                description = stringResource(id = R.string.text_composable_description),
                backgroundColor = Color(0xFFEADDFF),
                modifier = Modifier.weight(1f)
            )
            Quadrants(
                title = stringResource(id = R.string.image_composable_text),
                description = stringResource(id = R.string.image_composable_description) ,
                backgroundColor = Color(0xFFD0BCFF),
                modifier = Modifier.weight(1f))
        }
        Row(Modifier.weight(1f)){
                Quadrants(
                    title = stringResource(R.string.row_composable_text),
                    description = stringResource(R.string.row_composable_description),
                    backgroundColor = Color(0xFFB69DF8),
                    modifier = modifier.weight(1f))
            Quadrants(
                title = stringResource(R.string.column_composable_text),
                description = stringResource(R.string.column_composable_description),
                backgroundColor = Color(0xFFF6EDFF),
                modifier = modifier.weight(1f))
            }
        }

    }




@Preview(showBackground = true)
@Composable
fun DisplayQuadrantsPreview() {
    ComposeQuadrantsTheme {
        DisplayQuadrants()
    }
}

