package com.yeditepe.finalexam.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.rememberNavController

@Composable
fun AppNavGraph() {

    val navController = rememberNavController()

    NavHost(
        navController = navController,
        startDestination = "tasks"
    ) {

        // TODO 1
        composable("tasks") {
            TasksScreen(navController = navController)
        }

        // TODO 2
        composable(
            route = "taskDetail/{title}",
            arguments = listOf(
                navArgument("title") { type = NavType.StringType }
            )
        ) { backStackEntry ->
            val title =
                backStackEntry.arguments?.getString("title") ?: ""

            TaskDetailScreen(title = title)
        }
    }
}
