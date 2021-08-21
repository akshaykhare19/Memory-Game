package com.project.memorygame

import android.content.Context
import android.util.AttributeSet
import android.widget.FrameLayout

//Custom FrameLayout class to make a square frame layout
class SquareFrameLayout : FrameLayout {

    constructor(context: Context) : super(context)
    constructor(context: Context, attrs: AttributeSet) : super(context, attrs)

    override fun onMeasure(widthMeasureSpec: Int, heightMeasureSpec: Int) {
        super.onMeasure(widthMeasureSpec, heightMeasureSpec)

        val width = measuredWidth
        setMeasuredDimension(width, width)

    }
}