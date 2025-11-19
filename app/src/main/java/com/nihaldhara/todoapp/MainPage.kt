package com.nihaldhara.todoapp

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Button
import androidx.compose.material3.Card
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.em
import androidx.compose.ui.unit.sp
import com.nihaldhara.todoapp.ui.theme.TodoAppTheme

@Composable
fun MainPage(modifier: Modifier) {
    var taskInput by remember { mutableStateOf("") }

    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(MaterialTheme.colorScheme.background),
        horizontalAlignment = Alignment.CenterHorizontally,
    ) {
        Text(
            modifier = Modifier
                .padding(vertical = 64.dp, horizontal = 16.dp)
                .fillMaxWidth(),
            text = "My Todo App",
            color = MaterialTheme.colorScheme.primary,
            textAlign = TextAlign.Center,
            lineHeight = 1.em,
            fontSize = 64.sp,
        )

        Row(
            modifier = Modifier.padding(horizontal = 16.dp),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.SpaceBetween
        ) {
            TextField(
                value = taskInput,
                onValueChange = { taskInput = it },
                label = { Text("New Task") }
            )
            IconButton(
                modifier = Modifier.padding(8.dp),
                onClick = {}
            ) {
                Icon(
                    modifier = Modifier
                        .size(64.dp),
                    painter = painterResource(R.drawable.add_circle),
                    contentDescription = "Add task icon button"
                )
            }
        }

        Column() {
            TodoCard(Modifier.padding(16.dp), taskName = "Task Name")
        }

    }
}

@Preview(showBackground = true)
@Composable
fun MainPagePreview() {
    TodoAppTheme() {
        MainPage(Modifier)
    }
}