package com.example.jogodavelha

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.Toast
import java.nio.channels.spi.AbstractSelectionKey

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun btClick(view: View){
        val btSelecionado = view as Button
        var cellID = 0

        when (btSelecionado.id){
            R.id.button1 -> cellID=1
            R.id.button2 -> cellID=2
            R.id.button3 -> cellID=3
            R.id.button4 -> cellID=4
            R.id.button5 -> cellID=5
            R.id.button6 -> cellID=6
            R.id.button7 -> cellID=7
            R.id.button8 -> cellID=8
            R.id.button9 -> cellID=9
        }
        //Toast.makeText(this,"ID:"+cellID, Toast.LENGTH_SHORT).show()
        playGame(cellID, btSelecionado)
    }
    var player1 = ArrayList<Int>()
    var player2 = ArrayList<Int>()

    var activePlayer=1
    fun playGame(cellID:Int, btSelecionado:Button){

        if (activePlayer == 1){
            btSelecionado.text="X"
            btSelecionado.setBackgroundColor(Color.BLUE)
            player1.add(cellID)
            activePlayer = 2
        }else{
            btSelecionado.text = "O"
            btSelecionado.setBackgroundColor(Color.GREEN)
            player2.add(cellID)
            activePlayer = 1
        }
        btSelecionado.isEnabled = false
    }
}