package com.example.android_app_02.ui.theme

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material.Card
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.unit.dp
import coil.compose.AsyncImage
import com.example.android_app_02.model.Article

@Composable
fun NewsApp(listArticle: List<Article>){
    LazyColumn{
        items(listArticle){ article ->
            NewsCard(article = article)
        }
    }
}

@Composable
fun NewsCard(article: Article) {
    Card(
        elevation = 8.dp,
        modifier = Modifier.padding(8.dp)
    ) {
        Column()
        {
            AsyncImage(
                model = article.urlToImage,
                contentDescription = "news image",
                modifier = Modifier.fillMaxWidth(),
                contentScale = ContentScale.Crop
            )
            Text(text = article.title)
        }
    }
}