package com.example.mobi_mvvm

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import com.example.mobi_mvvm.databinding.FragmentThreeBinding
import com.example.mobi_mvvm.databinding.FragmentTwoBinding

class ThreeFragment : Fragment() {

    private val btnBackTwo: Button by lazy { requireActivity().findViewById(R.id.btn_back_two) }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_three, container, false)
    }

    override fun onStart() {
        super.onStart()

        btnBackTwo.setOnClickListener {
            (activity as MainActivity).navController.navigate(R.id.action_threeFragment_to_twoFragment)
        }

    }

}