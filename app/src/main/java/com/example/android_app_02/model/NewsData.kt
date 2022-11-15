package com.example.android_app_02.model


data class NewsData(
    val articles: List<Article>,
    val status: String,
    val totalResult: Int
)
