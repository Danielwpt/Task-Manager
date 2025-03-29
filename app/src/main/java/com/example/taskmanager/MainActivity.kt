package com.example.taskmanager

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.taskmanager.ui.theme.TaskManagerTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            TaskManagerTheme {

            }
        }
    }
}

@Preview(showSystemUi = true)
@Composable
fun TaskManagerMainScreen(modifier : Modifier = Modifier) {
    Column(
        modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center) {
        CompletedTaskImage(modifier)
        CompletedTaskText(modifier)
    }
}

@Composable
fun CompletedTaskImage(modifier : Modifier = Modifier) {
    Image(
        painter = painterResource(id = R.drawable.ic_task_completed),
        contentDescription = stringResource(id = R.string.task_completed_title)
    )
}

@Composable
fun CompletedTaskText(modifier : Modifier = Modifier) {
    Text(
        text = stringResource(id = R.string.task_completed_title),
        fontWeight = FontWeight.Bold,
        modifier = modifier.padding(0.dp, 24.dp, 0.dp, 8.dp)
    )

    Text(
        text = stringResource(id = R.string.nice_work_text),
        fontSize = 16.sp
    )
}