package com.example.android_app_02

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.viewModels
import com.example.android_app_02.ui.theme.NewsApp
import com.example.android_app_02.ui.theme.NewsViewModel

class MainActivity : ComponentActivity() {
    val newsModel = viewModels<NewsViewModel>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            NewsApp(newsModel.value.newsUiState)
        }
    }
}

/*@Composable
fun Greeting(name: String) {
    val newsViewModel: NewsViewModel = viewModel()
    Text(text = "Hello $name!")
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    Android_app_02Theme {
        Greeting("Android")
    }
}*/