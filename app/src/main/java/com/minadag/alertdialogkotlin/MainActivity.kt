package com.minadag.alertdialogkotlin

import android.content.DialogInterface
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.appcompat.app.AlertDialog

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Toast -> kisa zamanli kucuk bildirim uyari mesaji
        // AlertDialog -> uyari mesaji
        // Snackbar

        //Context
        //ActivityContext -> this
        //ApplicationContext -> application

        Toast.makeText(this@MainActivity,"Hello!", Toast.LENGTH_LONG).show()
    }

    fun save (view: View){
        val alert = AlertDialog.Builder(this@MainActivity)
        alert.setTitle("Title")
        alert.setMessage("Message")
        alert.setPositiveButton("YES",object : DialogInterface.OnClickListener{
            override fun onClick(dialog: DialogInterface?, which: Int) {
                Toast.makeText(this@MainActivity,"Saved!",Toast.LENGTH_LONG).show()
            }

        })
        alert.setNegativeButton("NO"){dialog, which ->
            Toast.makeText(this@MainActivity,"Not Saved!",Toast.LENGTH_LONG).show()
        }
        alert.show()

    }
}