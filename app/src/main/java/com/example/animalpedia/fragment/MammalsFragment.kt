package com.example.animalpedia.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.GridLayoutManager
import com.example.animalpedia.R
import com.example.animalpedia.adapter.AnimalpediaAdapter
import com.example.animalpedia.data.DataAnimalpedia
import com.example.animalpedia.databinding.FragmentMammalsBinding

class MamaliaFragment : Fragment() {

    private var _binding : FragmentMammalsBinding? = null

    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentMammalsBinding.inflate(inflater, container, false)

        binding.rvMammals.apply {
            setHasFixedSize(true)
            layoutManager = GridLayoutManager(context, 2)
            adapter = AnimalpediaAdapter(DataAnimalpedia.listMammals)
        }
        return binding.root
    }

    override fun onDestroy() {
        super.onDestroy()
        _binding = null
    }
}