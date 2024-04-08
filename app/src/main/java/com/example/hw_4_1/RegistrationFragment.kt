package com.example.hw_4_1

import android.annotation.SuppressLint
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.example.hw_4_1.databinding.FragmentRegistrationBinding




class RegistrationFragment : Fragment() {

    private lateinit var binding: FragmentRegistrationBinding


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentRegistrationBinding.inflate(inflater, container, false)
        return binding.root
    }

    @SuppressLint("RestrictedApi")
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.buttonSend.setOnClickListener {
            val name = binding.etName.text.toString()
            val email = binding.etEmail.text.toString()
            val password = binding.etPassword.text.toString()

          val user = User(name, email, password)
            val action = RegistrationFragmentDirections.actionRegistrationFragmentToResultFragment(user)
            findNavController().navigate(action)
        }

        }
    }







