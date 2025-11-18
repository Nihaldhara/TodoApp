package com.nihaldhara.todoapp

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.em
import androidx.compose.ui.unit.sp
import com.nihaldhara.todoapp.ui.theme.TodoAppTheme

@Composable
fun MainPage(modifier: Modifier) {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(MaterialTheme.colorScheme.background),
        horizontalAlignment = Alignment.CenterHorizontally,
    ) {
        Text(
            modifier = Modifier
                .padding(vertical = 32.dp, horizontal = 16.dp)
                .fillMaxWidth(),
            text = "My Todo App",
            color = MaterialTheme.colorScheme.primary,
            textAlign = TextAlign.Center,
            lineHeight = 1.em,
            fontSize = 64.sp,
        )
    }
}

@Preview(showBackground = true)
@Composable
fun MainPagePreview() {
    TodoAppTheme() {
        MainPage(Modifier)
    }
}