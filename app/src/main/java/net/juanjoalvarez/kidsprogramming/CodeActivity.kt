package net.juanjoalvarez.kidsprogramming

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

val REQUEST_ACTIVATOR: Int = 1
val REQUEST_CONDITION: Int = 2
val REQUEST_ACTION: Int = 3

class CodeActivity : AppCompatActivity() {

    private lateinit var btnPlay: Button
    private var behaviour = Behaviour(Activator.Unset, ConditionUnset(), ActionUnset())

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_code)

        val btnActivator: Button = findViewById<Button>(R.id.button_activator)
        val btnCondition: Button = findViewById<Button>(R.id.button_condition)
        val btnAction: Button = findViewById<Button>(R.id.button_action)
        btnPlay = findViewById<Button>(R.id.button_play)
        btnPlay.isEnabled = false

        btnActivator.setOnClickListener {
            val activatorIntent = Intent(this, ActivatorActivity::class.java)
            startActivityForResult(activatorIntent, REQUEST_ACTIVATOR)
        }

        btnCondition.setOnClickListener {
            val conditionIntent = Intent(this, ConditionActivity::class.java)
            startActivityForResult(conditionIntent, REQUEST_CONDITION)
        }

        btnAction.setOnClickListener {
            val actionIntent = Intent(this, ActionActivity::class.java)
            startActivityForResult(actionIntent, REQUEST_ACTION)
        }
    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)

        when (requestCode) {
            REQUEST_ACTIVATOR -> behaviour.activator = Activator.values()[resultCode]
            REQUEST_CONDITION -> println("condition")
            REQUEST_ACTION -> println("action")
        }
        checkPlayReady()
    }

    fun checkPlayReady() {
        if (behaviour.activator != Activator.Unset) {
            btnPlay.isEnabled = true
        } else {
            btnPlay.isEnabled = false
        }
    }
}
