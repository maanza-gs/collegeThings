package com.example.ca2lt.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.navigation.NavController
import androidx.navigation.Navigation
import com.example.ca2lt.R
import com.example.ca2lt.databinding.FragmentRegisterBinding
import com.google.firebase.auth.FirebaseAuth


class Register : Fragment() {

    private lateinit var navController: NavController
    private lateinit var mAuth: FirebaseAuth
    private lateinit var binding: FragmentRegisterBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = FragmentRegisterBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)


//        init(view)


        binding.study.setOnClickListener {
            val name = binding.name.text.toString()
            val rollno = binding.sid.text.toString()
            val course = binding.course.text.toString()
            val branch = binding.branch.text.toString()

            if (name.isNotEmpty() && rollno.isNotEmpty() && course.isNotEmpty()) {
                navController.navigate(R.id.action_register_to_studying)
                }
//            } else
//                Toast.makeText(context, "Empty fields are not allowed", Toast.LENGTH_SHORT).show()
        }

    }

//
//    private fun init(view: View) {
//        navController = Navigation.findNavController(view)
//        mAuth = FirebaseAuth.getInstance()
//    }
}