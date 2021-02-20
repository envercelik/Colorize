package com.envercelik.colorize

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.core.content.ContextCompat
import com.envercelik.colorize.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding:ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)


        setListeners()
    }

    private fun setListeners() {
        val clickAbleViews:List<View> = listOf(
            binding.boxOneText,
            binding.boxTwoText,
            binding.boxThreeText,
            binding.boxFourText,
            binding.boxFiveText,

            binding.buttonRed,
            binding.buttonYellow,
            binding.buttonGreen
        )

        for (item in clickAbleViews) {
            item.setOnClickListener { makeColored(it) }
        }
    }


    private fun makeColored(it: View?) {

        when(it!!.id) {

            R.id.box_one_text -> it.setBackgroundColor(Color.DKGRAY)
            R.id.box_two_text -> it.setBackgroundColor(Color.GRAY)
            R.id.box_three_text -> it.setBackgroundColor(Color.BLUE)
            R.id.box_four_text -> it.setBackgroundColor(Color.RED)
            R.id.box_five_text -> it.setBackgroundColor(Color.MAGENTA)

            R.id.button_green -> binding.boxThreeText.setBackgroundColor(ContextCompat.getColor(this,R.color.my_green))
            R.id.button_yellow -> binding.boxFourText.setBackgroundColor(ContextCompat.getColor(this,R.color.my_yellow))
            R.id.button_red -> binding.boxFiveText.setBackgroundColor(ContextCompat.getColor(this,R.color.my_red))        }
    }



}