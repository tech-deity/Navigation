package com.example.esocial.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.navigation.fragment.findNavController
import com.example.esocial.R

class LoginFragment : Fragment() {


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment
        val view= inflater.inflate(R.layout.fragment_login, container, false)
        val movetoRegister : TextView = view.findViewById(R.id.register_tv)
        movetoRegister.setOnClickListener{
            findNavController().navigate(R.id.action_loginFragment_to_register)
        }

        return view
    }


}