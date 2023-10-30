package com.example.dogeducationapp

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.fragment.app.setFragmentResultListener
import androidx.navigation.fragment.findNavController
import com.example.dogeducationapp.databinding.Fragment1Binding

class Fragment1 : Fragment() {

    private lateinit var binding: Fragment1Binding
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        return Fragment1Binding.inflate(inflater, container, false).apply {
            binding = this
        }.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.next.setOnClickListener {
            findNavController().navigate(Fragment1Directions.actionFragment1ToFragment2())
        }
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setFragmentResultListener("CONTRACT_KEY_USED_BY_ANDROID_TO_BIND_COMMUNICATION_BETWEEN_FRAGMENTS") { requestKey, bundle ->
            Toast.makeText(this.requireActivity(), "Result is ${bundle.getString("result", "")}", Toast.LENGTH_LONG).show()
        }
    }
}