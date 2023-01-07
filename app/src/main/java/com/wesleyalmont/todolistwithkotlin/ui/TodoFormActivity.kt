package com.wesleyalmont.todolistwithkotlin.ui

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.wesleyalmont.todolistwithkotlin.dao.TodoDao
import com.wesleyalmont.todolistwithkotlin.databinding.ActivityTodoFormBinding
import com.wesleyalmont.todolistwithkotlin.model.Todo

class TodoFormActivity : AppCompatActivity() {

    private lateinit var binding: ActivityTodoFormBinding;

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityTodoFormBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnSave.setOnClickListener {
            val title = binding.edTodo.text.toString()
            val description = binding.edDescriptrion.text.toString()
            val complete = binding.cbComplete.isChecked

            val todo = Todo(complete = complete, title = title, description = description)

            val todoDao = TodoDao()
            todoDao.saveTodo(todo)
            finish()
        }
    }
}