package kanoko.akira.techacademy.calcapp

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_main.*
import android.support.design.widget.Snackbar
import android.util.Log
import android.widget.EditText

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
        val num1edittext1 = findViewById<EditText>(R.id.textbox1)
        val num1 = num1edittext1.text.toString().toInt()
        val num1edittext2 = findViewById<EditText>(R.id.textbox2)
        val num2 = num1edittext2.text.toString().toInt()

        // num2が0だったら警告

        // textbox1.2が空だったら警告

        if (textbox1.text.isNotBlank() or textbox2.text.isNotBlank()) {

        }else{
            val Snackbar = Snackbar.make(rootlayout, "数字を入力してください", Snackbar.LENGTH_LONG)
            Snackbar.show()
        }

        when(v.id){
            R.id.plus -> {
                val r = num1 + num2
                Log.d("calclog","$num1, $num2, $r")
                anserView.text = getString(r)
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
