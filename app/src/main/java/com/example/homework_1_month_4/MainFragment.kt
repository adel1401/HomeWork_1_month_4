package com.example.homework_1_month_4

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.example.homework_1_month_4.databinding.FragmentMainBinding

class MainFragment : Fragment(), MainAdapter.Result {
    private val binding : FragmentMainBinding by lazy {
        FragmentMainBinding.inflate(layoutInflater)
    }
    private val list= ArrayList<Int>()
    private val listItem= ArrayList<Int>()
    private val adapter: MainAdapter by lazy { MainAdapter(this) }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return binding.root
    }


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        list.clear()
        listItem.clear()
        list.add(R.drawable.img)
        list.add(R.drawable.img_1)
        list.add(R.drawable.img_2)
        list.add(R.drawable.img_2)
        list.add(R.drawable.img)
        list.add(R.drawable.img_1)
        list.add(R.drawable.img)
        list.add(R.drawable.img_2)
        list.add(R.drawable.img_1)
        list.add(R.drawable.img)
        list.add(R.drawable.img_2)
        list.add(R.drawable.img)
        list.add(R.drawable.img_1)
        list.add(R.drawable.img)
        list.add(R.drawable.img_1)
        list.add(R.drawable.img_1)
        adapter.setList(list)
        binding.rvAnimal.adapter= adapter


        binding.btnResult.setOnClickListener {
            val bundle = Bundle()
            bundle.putIntegerArrayList("image", listItem)
            findNavController().navigate(R.id.secondFragment, bundle)
        }


    }

    override fun onClick(image: Int) {
        listItem.add(image)
    }

}