package com.example.asynctaskproject

import android.os.Bundle
import android.view.View
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity


class MainActivity : AppCompatActivity()
{
    private var mTextView: TextView? = null
    private val TEXT_STATE = "currentText"


    override fun onCreate(savedInstanceState: Bundle?)
    {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        mTextView = findViewById(R.id.textView1)
    }

    fun startTask(view: View)
    {
        mTextView?.setText("Napping")

        // Start the AsyncTask.
        val task = SimpleAsyncTask(mTextView).execute()
    }

    override fun onSaveInstanceState(outState: Bundle) {
        super.onSaveInstanceState(outState)
        // Save the state of the TextView
        outState.putString(TEXT_STATE, mTextView!!.text.toString())
    }
}
