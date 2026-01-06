package com.yeditepe.finalexam.viewmodel

import androidx.compose.runtime.mutableStateListOf
import androidx.lifecycle.ViewModel
import com.yeditepe.finalexam.model.Task

class TaskViewModel : ViewModel() {

    // TODO 1
    val tasks = mutableStateListOf(
        Task(id = 1, title = "Submit Final Project", completed = false),
        Task(id = 2, title = "Study for Exam", completed = false)
    )

    fun toggleTask(taskId: Int) {
        // TODO 2
        val index = tasks.indexOfFirst { it.id == taskId }
        if (index != -1) {
            val task = tasks[index]
            tasks[index] = task.copy(completed = !task.completed)
        }
    }
}
