package com.yun.mycalculator

import android.app.AlertDialog
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        txtLabel.text = "Enter your numbers:"
        txtResult.text = "Let's calculate"
    }

    fun Click(sender:View){
        var result:Int = etText.text.toString().toInt() + etText2.text.toString().toInt()

        /* AlertDialog
        val builder = AlertDialog.Builder(this)
        builder.setTitle("Result")
        builder.setMessage(result)
        builder.setPositiveButton("click") { _, _ -> null }
        builder.show()*/

        /* Toast
        Toast.makeText(this,result,Toast.LENGTH_SHORT).show()*/

        var intent = Intent(this, Main2Activity::class.java)
        intent.putExtra("result", result.toString())
        startActivity(intent)
    }
}
