package com.example.tyrestoresizer

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    var increase: Boolean=false
    var percent: Double=0.0
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val ans:Button=findViewById(R.id.submitAnswer)
        val oW: EditText=findViewById(R.id.oldWidth)
        val oP: EditText=findViewById(R.id.oldProfile)
        val oD: EditText=findViewById(R.id.oldDiameter)
        val nW: EditText=findViewById(R.id.newWidth)
        val nP: EditText=findViewById(R.id.newProfile)
        val nD: EditText=findViewById(R.id.newDiameter)
        val oldTyres:TextView=findViewById(R.id.oldTyre)
        val newTyres:TextView=findViewById(R.id.newTyre)
        val percentText:TextView=findViewById(R.id.percentResult)

        val mmText:TextView=findViewById(R.id.mmResult)
        ans.setOnClickListener {

            val oldD:Double= getOd(oW.text.toString().toDouble(),oP.text.toString().toDouble(),oD.text.toString().toDouble())
            val newD:Double= getOd(nW.text.toString().toDouble(),nP.text.toString().toDouble(),nD.text.toString().toDouble())
            oldTyres.text=oldD.toString()
            newTyres.text=newD.toString()
            val changeInD=newD-oldD
            if (changeInD>0)
            {
                increase=true
                percent=changeInD*100/oldD
                mmText.text=changeInD.toString()

            }
            else{
                percent=-100*changeInD/oldD
                mmText.text=(-1*changeInD).toString()
            }
            if (percent>2.0){
                Toast.makeText(this,"Warning Change is more than 2!",Toast.LENGTH_LONG).show()
            }
            percentText.text=percent.toString()



        }

    }


}
//Width x Aspect Ratio = Section Height
//Section Height x 2 = Combined Section Height
//Combined Section Height + Wheel Diameter = Tyre Diameter

fun getOd(width: Double, aRatio: Double, diameter: Double): Double {
    val ratio:Double = aRatio / 100
    val sHeight:Double = width * ratio
    val cSectionHeight :Double= sHeight * 2
    return cSectionHeight + (diameter * 25.4)
}
