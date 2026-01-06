package com.yeditepe.finalexam.repository

import com.yeditepe.finalexam.api.TaskApi
import com.yeditepe.finalexam.model.Task
class TaskRepository(private val api: TaskApi) {

        suspend fun fetchTasks(): List<Task> {


            val taskDtoList = api.getTasks()


            return taskDtoList.map { dto ->
                Task(
                    title = dto.title,
                    description = dto.description,
                    completed = dto.completed
                )
            }
        }
    }
