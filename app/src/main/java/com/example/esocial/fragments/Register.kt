package com.example.esocial.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.example.esocial.R

class Register : Fragment() {


    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment
        val view= inflater.inflate(R.layout.fragment_register, container, false)

        dia()

//        val dialoguebtn:Button=view.findViewById(R.id.dia_btn)
//        dialoguebtn.setOnClickListener {
//
//        }
        return view
    }

    private fun dia() {

           // findNavController().navigate(R.id.action_register_to_dialogueFragment)

    }


}