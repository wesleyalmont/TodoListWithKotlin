package com.wesleyalmont.todolistwithkotlin.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.wesleyalmont.todolistwithkotlin.R
import com.wesleyalmont.todolistwithkotlin.databinding.ActivityMainBinding
import com.wesleyalmont.todolistwithkotlin.databinding.ActivityTodoFormBinding

class TodoFormActivity : AppCompatActivity() {
   private lateinit var binding : ActivityTodoFormBinding;
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityTodoFormBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnSave.setOnClickListener{
            finish()
        }
    }
}