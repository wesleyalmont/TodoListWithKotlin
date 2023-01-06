package com.wesleyalmont.todolistwithkotlin.ui.adapters

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.wesleyalmont.todolistwithkotlin.R
import com.wesleyalmont.todolistwithkotlin.databinding.TodoItemBinding
import com.wesleyalmont.todolistwithkotlin.model.Todo

class TodoListAdapter(
    private val context: Context,
    private val todos: List<Todo>
) : RecyclerView.Adapter<TodoListAdapter.ViewHolder>() {

    class ViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        val binding = TodoItemBinding.bind(view)
        fun bindingData(todo: Todo) {
//            binding.rbCheckTodo.text = todo.complete.toString()
            binding.tvTitle.text = todo.title
            binding.tvDescription.text = todo.description
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val inflater = LayoutInflater.from(context)
        val inflate = inflater.inflate(R.layout.todo_item, parent, false)
        return ViewHolder(inflate)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val todo = todos[position]
        holder.bindingData(todo)
    }

    override fun getItemCount(): Int = todos.size


}
