package net.juanjoalvarez.kidsprogramming

import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.widget.Button

class ActivatorActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_activator)

        val btnIf: Button = findViewById<Button>(R.id.button_when)
        val btnWhile: Button = findViewById<Button>(R.id.button_while)
        val btnUntil: Button = findViewById<Button>(R.id.button_until)
        val ret = Intent()

        btnIf.setOnClickListener {
            setResult(Activator.When.ordinal, ret)
            finish()
        }

        btnWhile.setOnClickListener {
            setResult(Activator.While.ordinal, ret)
            finish()
        }

        btnUntil.setOnClickListener {
            setResult(Activator.Until.ordinal, ret)
            finish()
        }
    }
}
