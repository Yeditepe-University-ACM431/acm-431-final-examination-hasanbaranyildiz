package com.yeditepe.finalexam.ui

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.navigation.NavController
import com.yeditepe.finalexam.model.Task
import com.yeditepe.finalexam.viewmodel.TaskViewModel

@Composable
fun TaskListScreen(viewModel: TaskViewModel = viewModel()) {


    val tasks by viewModel.tasks.observeAsState(emptyList())

    Column {
        tasks.forEach { task ->
            Text(
                text = "${task.title} - ${if (task.completed) "Completed" else "Not Completed"}"
            )
        }
    }
}

@Composable
fun TaskRow(task: Task, navController: NavController) {

    Text(
        text = task.title,
        modifier = Modifier.clickable {
            // TODO 3
            navController.navigate("taskDetail/${task.title}")
        }
    )
}

