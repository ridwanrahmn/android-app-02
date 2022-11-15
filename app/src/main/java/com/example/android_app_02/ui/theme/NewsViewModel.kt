package com.example.android_app_02.ui.theme

import android.util.Log
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.android_app_02.model.Article
import com.example.android_app_02.network.Api
import kotlinx.coroutines.launch

class NewsViewModel : ViewModel() {
    init{
        getlistNews()
    }
    fun getlistNews(){
        viewModelScope.launch {
            val response = Api.newsAPIService.getTopHeadline()
            val articles = response.articles

            articles.forEach{article:Article ->
                Log.d("response", article.toString())
            }
        }
    }
}