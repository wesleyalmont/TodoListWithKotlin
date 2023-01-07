package com.wesleyalmont.todolistwithkotlin.model

data class Todo(
    val complete: Boolean,
    val title: String,
    val description: String
)