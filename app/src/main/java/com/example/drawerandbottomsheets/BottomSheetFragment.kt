package com.example.drawerandbottomsheets

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.LinearLayout
import com.google.android.material.bottomsheet.BottomSheetBehavior
import com.google.android.material.bottomsheet.BottomSheetDragHandleView

class BottomSheetFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_bottom_sheet, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        controller()

    }

    private fun controller() {

        val bottomSheet:LinearLayout=requireView().findViewById(R.id.bottomSheet)
        val bottomSheetBehavior=BottomSheetBehavior.from(bottomSheet)

        bottomSheetBehavior.addBottomSheetCallback(object :BottomSheetBehavior.BottomSheetCallback(){
            override fun onStateChanged(bottomSheet: View, newState: Int) {

                when(newState){

                    BottomSheetBehavior.STATE_HIDDEN->{}
                    BottomSheetBehavior.STATE_EXPANDED->{}
                    BottomSheetBehavior.STATE_COLLAPSED->{}

                }

            }

            override fun onSlide(bottomSheet: View, slideOffset: Float) {}

        })

    }

}