package net.juanjoalvarez.kidsprogramming

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class CodeActivity : AppCompatActivity() {

    var behaviours: List<Behaviour> = listOf()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_code)

        val btn_activator: Button = findViewById<Button>(R.id.button_activator)
        val btn_condition: Button = findViewById<Button>(R.id.button_condition)
        val btn_actions: Button = findViewById<Button>(R.id.button_actions)

        btn_activator.setOnClickListener {
            val activatorIntent = Intent(this, ActivatorActivity::class.java)
            startActivity(activatorIntent)
        }

        btn_condition.setOnClickListener {
            val conditionIntent = Intent(this, ConditionActivity::class.java)
            startActivity(conditionIntent)
        }

        btn_actions.setOnClickListener {
            val actionsIntent = Intent(this, ActionsActivity::class.java)
            startActivity(actionsIntent)
        }
    }
}
