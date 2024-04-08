package com.example.hw_4_1

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.hw_4_1.databinding.FragmentResultBinding


@Suppress("DEPRECATION")
class ResultFragment : Fragment() {
    private lateinit var binding: FragmentResultBinding


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentResultBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val user = requireArguments().getParcelable<User>("user")

        if (user != null) {
            val name = user.name
            val email = user.email
            val password = user.password

            binding.tvName.text = name
            binding.tvEmail.text = email
            binding.tvPassword.text = password
        }
    }
}
