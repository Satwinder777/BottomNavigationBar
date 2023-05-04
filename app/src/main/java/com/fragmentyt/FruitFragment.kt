package com.fragmentyt

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.navigation.fragment.findNavController


class FruitFragment : Fragment() {


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_fruit, container, false)

//        val btn = view.findViewById<Button>(R.id.JuiceBar)
//
//        btn.setOnClickListener {
//            findNavController().navigate(R.id.action_fruitFragment_to_cartFragment)
//        }
        return view

    }}