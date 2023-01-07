package com.wesleyalmont.todolistwithkotlin.ui

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import com.wesleyalmont.todolistwithkotlin.databinding.ActivityMainBinding
import com.wesleyalmont.todolistwithkotlin.model.Todo
import com.wesleyalmont.todolistwithkotlin.ui.adapters.TodoListAdapter

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val rvTodoList = binding.rvTodoList
        rvTodoList.layoutManager = LinearLayoutManager(this)

        val tempTodoList = listOf<Todo>(
            Todo(false, "Comprar pão", "Mãe pediu para comprar pão até 11h"),
            Todo(false, "Ir ao mercado", "Mercado fecha as 21h")
        )

        rvTodoList.adapter = TodoListAdapter(context = this, tempTodoList)

        binding.fab.setOnClickListener {
            val intent = Intent(this, TodoFormActivity::class.java)
            startActivity(intent)
        }
    }
}