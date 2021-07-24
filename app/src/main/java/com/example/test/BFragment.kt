package com.example.test

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import android.widget.Toast
import androidx.navigation.NavController
import androidx.navigation.NavDirections
import androidx.navigation.fragment.findNavController
import androidx.navigation.fragment.navArgs

//In class, : means extends
class BFragment : Fragment() {

    //In function, : means the return value
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_b, container, false)
        val tvName = view.findViewById<TextView>(R.id.tvName)

        //unsafe method
        //val name = arguments?.getString("personName")
        //tvName.text = name

        //safe method
        val args = BFragmentArgs.fromBundle(requireArguments())
        tvName.text = args.personName

        return view
    }

}