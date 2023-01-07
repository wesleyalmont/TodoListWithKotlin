package com.wesleyalmont.todolistwithkotlin.ui

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import com.wesleyalmont.todolistwithkotlin.dao.TodoDao
import com.wesleyalmont.todolistwithkotlin.databinding.ActivityMainBinding
import com.wesleyalmont.todolistwithkotlin.ui.adapters.TodoListAdapter

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)


        binding.fab.setOnClickListener {
            val intent = Intent(this, TodoFormActivity::class.java)
            startActivity(intent)
        }
    }

    override fun onResume() {
        super.onResume()

        val todoDao = TodoDao()
        val rvTodoList = binding.rvTodoList
        rvTodoList.layoutManager = LinearLayoutManager(this)
        rvTodoList.adapter = TodoListAdapter(context = this, todoDao.getAllTodos())

    }
}