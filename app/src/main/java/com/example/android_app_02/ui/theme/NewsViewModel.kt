package com.example.android_app_02.ui.theme

import android.util.Log
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.android_app_02.model.Article
import com.example.android_app_02.network.Api
import kotlinx.coroutines.launch

class NewsViewModel : ViewModel() {
    var newsUiState: List<Article> by mutableStateOf(listOf())
    init{
        getTopHeadLines()
    }
    fun getTopHeadLines(){
        viewModelScope.launch {
            val response = Api.newsAPIService.getTopHeadline()
            val articles = response.articles

            articles.forEach{article:Article ->
                Log.d("response", article.title)
            }
            newsUiState = response.articles
        }
    }
}