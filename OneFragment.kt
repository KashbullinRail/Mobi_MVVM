package com.example.mobi_mvvm

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import com.example.mobi_mvvm.databinding.FragmentOneBinding


class OneFragment : Fragment() {
    private val btnOne:Button by lazy { requireActivity().findViewById(R.id.btn_next_two) }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_one, container, false)
    }

    override fun onStart() {
        super.onStart()

        btnOne.setOnClickListener {
            var bundle = Bundle()
            bundle.putString("KEY", "NavFragmentTwo")
            (activity as MainActivity)
                .navController
                .navigate(R.id.action_oneFragment_to_twoFragment, bundle)
        }

    }

}