package kanoko.akira.techacademy.calcapp

import android.content.Intent
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

        try {
            val anserView: TextView = findViewById(R.id.anser)
            val input1str= findViewById(R.id.input1) as EditText
            val input1double = input1str.text.toString().toDouble()
            val input2str :EditText = findViewById(R.id.input2) as EditText
            val input2double = input2str.text.toString().toDouble()
            Log.d("calclog","imput1 $input1double, imput2 $input2double")

            when(v.id){
                R.id.plus -> {
                    val r = input1double + input2double
                    Log.d("calclog","足す $input1double + $input2double = $r")
                    anserView.text = r.toString()
                }

                R.id.minus -> {
                    val r = input1double - input2double
                    Log.d("calclog","引く $input1double - $input2double = $r")
                    anserView.text = r.toString()
                }

                R.id.multiply -> {
                    val r = input1double * input2double
                    Log.d("calclog","掛ける $input1double - $input2double = $r")
                    anserView.text = r.toString()
                }

                R.id.divide -> {
                    // 0の場合アラート
                    if (input2double == 0.0) {
                        val Snackbar = Snackbar.make(rootlayout, "input2には0以外の数字を入力してください", Snackbar.LENGTH_LONG)
                        Snackbar.show()
                        return
                    } else {
                        val r = input1double / input2double
                        Log.d("calclog","割る $input1double - $input2double = $r")
                        anserView.text = r.toString()
                    }
                }
            }

            // 画面遷移
            val intent = Intent(this, SecondActivity::class.java)
            intent.putExtra("VALUE1", anserView.text.toString())
            val value1 = anserView.text.toString()
            Log.d("calclog", "$value1")
            startActivity(intent)

        } catch (e: Exception) {
            // input1,2が空白だったらアラート表示
            if (input1.text.isEmpty() or input2.text.isEmpty()) {
                val Snackbar = Snackbar.make(rootlayout, "数字を入力してください", Snackbar.LENGTH_LONG)
                Snackbar.show()
            }
        }

    }
}