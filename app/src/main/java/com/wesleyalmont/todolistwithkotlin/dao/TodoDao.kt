package com.wesleyalmont.todolistwithkotlin.dao

import com.wesleyalmont.todolistwithkotlin.model.Todo

class TodoDao {

    fun saveTodo(todo: Todo){
        todos.add(todo)
    }

    fun removeTodo(id: Int ){
        todos.removeAt(id)
    }

    fun getAllTodos(): List<Todo>{
        return todos.toList()
    }

    companion object {
        private val todos = mutableListOf<Todo>()
    }
}