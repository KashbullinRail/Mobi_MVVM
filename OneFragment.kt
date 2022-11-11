package com.example.mobi_mvvm

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.View
import by.kirich1409.viewbindingdelegate.viewBinding
import com.example.mobi_mvvm.databinding.FragmentOneBinding


class OneFragment : Fragment(R.layout.fragment_one) {

    private val binding by viewBinding(FragmentOneBinding::bind)

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.btnNextTwo.setOnClickListener {
            var bundle = Bundle()
            bundle.putString("KEY", "NavFragmentTwo")
            (activity as MainActivity)
                .navController
                .navigate(R.id.action_oneFragment_to_twoFragment, bundle)
        }
    }

    override fun onStart() {
        super.onStart()



    }

}