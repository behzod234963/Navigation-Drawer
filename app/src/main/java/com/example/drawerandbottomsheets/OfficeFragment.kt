package com.example.drawerandbottomsheets

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.LinearLayout
import android.widget.RelativeLayout
import com.example.drawerandbottomsheets.databinding.FragmentHomeBinding
import com.example.drawerandbottomsheets.databinding.FragmentOfficeBinding
import com.google.android.material.bottomsheet.BottomSheetBehavior
class OfficeFragment : Fragment() {
    lateinit var binding: FragmentOfficeBinding
    lateinit var bottomSheetBehavior: BottomSheetBehavior<View>
    private var state=false

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding= FragmentOfficeBinding.inflate(layoutInflater,container,false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val bottomSheet=view.findViewById<LinearLayout>(R.id.rlDesignBottomSheet)
        bottomSheetBehavior= BottomSheetBehavior.from(bottomSheet)
        state=true

        binding.btnButton.setOnClickListener {

            if (state){

                bottomSheetBehavior.state = BottomSheetBehavior.STATE_EXPANDED
                state=false
                binding.btnButton.text="Collapse"

            }else{

                bottomSheetBehavior.state= BottomSheetBehavior.STATE_COLLAPSED
                state=true
                binding.btnButton.text="Expand"

            }

        }

    }
}