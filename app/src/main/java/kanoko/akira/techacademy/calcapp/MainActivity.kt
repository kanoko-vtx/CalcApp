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

        // input1,2が空白だったらアラート表示
        // input2が0だったらアラート
        if (input1.text.isEmpty() or input2.text.isEmpty()) {
            val Snackbar = Snackbar.make(rootlayout, "数字を入力してください", Snackbar.LENGTH_LONG)
            Snackbar.show()
        } else {
            if (input2.text.toString().toInt() == 0) {
                val Snackbar = Snackbar.make(rootlayout, "input2には0以外の数字を入力してください", Snackbar.LENGTH_LONG)
                Snackbar.show()
            }
        }

//        val anserView: TextView = findViewById(R.id.anser)

//        val input1str :EditText = findViewById(R.id.input1) as EditText
//        val num1 = input1str.text.toString().toDouble()

//        val input2str :EditText = findViewById(R.id.input2) as EditText
//        val num2 = input2str.text.toString().toDouble()

        // textbox1.2が空だったら警告

        when(v.id){
            R.id.plus -> {
//                val r = num1 + num2
//                Log.d("calclog","$num1,$num2,$r")
                Log.d("calclog","足す")
//                anserView.text = r.toString()
            }
            R.id.minus -> {
//                val r = num1 - num2
//                Log.d("calclog","$num1,$num2,$r")
                Log.d("calclog","引く")
//                anserView.text = r.toString()
            }
            R.id.multiply -> {
//                val r = num1 * num2
//                Log.d("calclog","$num1,$num2,$r")
            Log.d("calclog","掛ける")
//                anserView.text = r.toString()
            }
            R.id.divide -> {
//                val r = num1 / num2
//                Log.d("calclog","$num1,$num2,$r")
            Log.d("calclog","割る")
//                anserView.text = r.toString()
            }
        }

    }

}
