package com.example.mobi_mvvm

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.TextView
import com.example.mobi_mvvm.databinding.FragmentOneBinding
import com.example.mobi_mvvm.databinding.FragmentTwoBinding

class TwoFragment : Fragment() {

    private val btnNextThree: Button by lazy { requireActivity().findViewById(R.id.btn_next_three) }
    private val btnBackOne: Button by lazy { requireActivity().findViewById(R.id.btn_back_one) }
    private val tvFrag2:TextView by lazy { requireActivity().findViewById(R.id.tvFrag2) }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_two, container, false)
    }

    override fun onStart() {
        super.onStart()

        tvFrag2.text = arguments?.getString("KEY")

        btnBackOne.setOnClickListener {
            (activity as MainActivity).navController.navigate(R.id.action_twoFragment_to_oneFragment)
        }

        btnNextThree.setOnClickListener {
            (activity as MainActivity).navController.navigate(R.id.action_twoFragment_to_threeFragment)
        }

    }

}