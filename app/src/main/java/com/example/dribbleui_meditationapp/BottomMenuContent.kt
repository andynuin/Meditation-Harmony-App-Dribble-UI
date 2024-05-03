package com.example.dribbleui_meditationapp

import androidx.annotation.DrawableRes

data class BottomMenuContent(
    val title: String,
    @DrawableRes val IconId: Int,
    val contentDescription: String,
)