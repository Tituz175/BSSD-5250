package com.example.tt_bssd5250_hw12

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.constraintlayout.widget.ConstraintSet

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val constraintLayout = ConstraintLayout(this)
        constraintLayout.setBackgroundColor(Color.WHITE)
        constraintLayout.id = View.generateViewId()

        val textView = TextView(this)
        textView.text = "Select Color"
        textView.setTextColor(Color.GRAY)
        textView.id = View.generateViewId()

        val blueButton = Button(this)
        blueButton.text = "BLUE"
        blueButton.setBackgroundColor(Color.BLUE)
        blueButton.id = View.generateViewId()
        blueButton.setOnClickListener(View.OnClickListener {
            constraintLayout.setBackgroundColor(Color.BLUE)
        })

        val redButton = Button(this)
        redButton.text = "RED"
        redButton.setBackgroundColor(Color.RED)
        redButton.id = View.generateViewId()
        redButton.setOnClickListener(View.OnClickListener {
            constraintLayout.setBackgroundColor(Color.RED)
        })

        val greenButton = Button(this)
        greenButton.text = "GREEN"
        greenButton.setBackgroundColor(Color.GREEN)
        greenButton.id = View.generateViewId()
        greenButton.setOnClickListener(View.OnClickListener {
            constraintLayout.setBackgroundColor(Color.GREEN)
        })

        constraintLayout.addView(textView)
        constraintLayout.addView(blueButton)
        constraintLayout.addView(redButton)
        constraintLayout.addView(greenButton)

        setContentView(constraintLayout)

        val constraintSet = ConstraintSet()
        val parentId = ConstraintSet.PARENT_ID

        constraintSet.constrainHeight(textView.id, ConstraintSet.WRAP_CONTENT)
        constraintSet.constrainWidth(textView.id, ConstraintSet.WRAP_CONTENT)

        constraintSet.connect(textView.id, ConstraintSet.TOP, parentId, ConstraintSet.TOP)
        constraintSet.connect(textView.id, ConstraintSet.BOTTOM, parentId, ConstraintSet.BOTTOM)
        constraintSet.connect(textView.id, ConstraintSet.LEFT, parentId, ConstraintSet.LEFT)
        constraintSet.connect(textView.id, ConstraintSet.RIGHT, parentId, ConstraintSet.RIGHT)

        constraintSet.constrainHeight(blueButton.id, ConstraintSet.WRAP_CONTENT)
        constraintSet.constrainWidth(blueButton.id, ConstraintSet.WRAP_CONTENT)

        constraintSet.connect(blueButton.id, ConstraintSet.TOP, textView.id, ConstraintSet.BOTTOM)
        constraintSet.connect(blueButton.id, ConstraintSet.LEFT, parentId, ConstraintSet.LEFT)
        constraintSet.connect(blueButton.id, ConstraintSet.RIGHT, parentId, ConstraintSet.RIGHT)

        constraintSet.constrainHeight(redButton.id, ConstraintSet.WRAP_CONTENT)
        constraintSet.constrainWidth(redButton.id, ConstraintSet.WRAP_CONTENT)

        constraintSet.connect(redButton.id, ConstraintSet.TOP, blueButton.id, ConstraintSet.BOTTOM)
        constraintSet.connect(redButton.id, ConstraintSet.LEFT, parentId, ConstraintSet.LEFT)
        constraintSet.connect(redButton.id, ConstraintSet.RIGHT, parentId, ConstraintSet.RIGHT)

        constraintSet.constrainHeight(greenButton.id, ConstraintSet.WRAP_CONTENT)
        constraintSet.constrainWidth(greenButton.id, ConstraintSet.WRAP_CONTENT)

        constraintSet.connect(greenButton.id, ConstraintSet.TOP, redButton.id, ConstraintSet.BOTTOM)
        constraintSet.connect(greenButton.id, ConstraintSet.LEFT, parentId, ConstraintSet.LEFT)
        constraintSet.connect(greenButton.id, ConstraintSet.RIGHT, parentId, ConstraintSet.RIGHT)

        constraintSet.applyTo(constraintLayout)

    }
}