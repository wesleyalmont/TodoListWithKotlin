package com.wesleyalmont.todolistwithkotlin.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.wesleyalmont.todolistwithkotlin.R
import com.wesleyalmont.todolistwithkotlin.databinding.ActivityMainBinding
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
            Toast.makeText(this, todo.toString(), Toast.LENGTH_SHORT).show()

//            finish()
        }
    }
}