package com.example.ejemplo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import layout.Myname


class MainActivity : AppCompatActivity() {
    val Myname: Myname =Myname(name="name1", nickname="nickname1")
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
    private  fun addNickname(view:View){
        binding.apply {
            myName?nickName = name_editText.Text.toString()
            invalidateAll()
            name_editText.visibility = View.GONE
            name_button.visibility = View.GONE
            name_editText = View.VISIBLE
        }
        }
    }
}
