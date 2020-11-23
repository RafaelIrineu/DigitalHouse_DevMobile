package com.rafaelirineu.exercicioapiaula35.category.view

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.rafaelirineu.exercicioapiaula35.R

class CategoryFragment : Fragment() {

    private lateinit var _categoryAdapter: CategoryAdapter

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.fragment_category, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val categoryRecycler = view.findViewById<RecyclerView>(R.id.recyclerViewFragmentCategory)
        val viewManager = LinearLayoutManager(view.context)

        categoryRecycler.apply{
            setHasFixedSize(true)
            layoutManager = viewManager
            adapter = _categoryAdapter
        }
    }

}