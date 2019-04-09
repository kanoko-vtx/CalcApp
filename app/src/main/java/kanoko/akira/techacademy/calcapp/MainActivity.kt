package kanoko.akira.techacademy.calcapp

import android.content.DialogInterface
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity(), View.OnClickListener {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        plus.setOnClickListener(this)
        minus.setOnClickListener(this)
        multiply.setOnClickListener(this)
        divide.setOnClickListener(this)

    }

    override fun onClick(v: View) {

        val anserView: TextView = findViewById(R.id.anser)

        when(v.id){
            R.id.plus -> {
                anserView.text = "足す"
            }
            R.id.minus -> {
                anserView.text = "引く"
            }
            R.id.multiply -> {
                anserView.text = "掛ける"
            }
            R.id.divide -> {
                anserView.text = "割る"
            }

        }



    }

}
