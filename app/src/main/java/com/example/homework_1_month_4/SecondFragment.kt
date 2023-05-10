package com.example.homework_1_month_4

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.homework_1_month_4.databinding.FragmentSecondBinding

class SecondFragment : Fragment(), MainAdapter.Result {

    private  val binding: FragmentSecondBinding by lazy {
        FragmentSecondBinding.inflate(layoutInflater)
    }
    private  val adapter: MainAdapter by lazy {
        MainAdapter(this)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        if (arguments != null){
            val list = arguments?.getIntegerArrayList("image")
            list?.let { adapter.setList(it) }
            binding.rvAnimal.adapter = adapter
        }
    }

    override fun onClick(image: Int) {

    }

}