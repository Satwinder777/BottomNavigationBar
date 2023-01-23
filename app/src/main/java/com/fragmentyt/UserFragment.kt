package com.fragmentyt

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.navigation.fragment.findNavController


class UserFragment : Fragment() {


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_user, container, false)

//        val btn = view.findViewById<Button>(R.id.button3)
//
//        btn.setOnClickListener {
//            findNavController().navigate(R.id.action_userFragment_to_placeholder2)
//        }
        return view

    }}