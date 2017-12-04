package net.juanjoalvarez.kidsprogramming

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.view.View
import android.widget.Button

class ConditionActivity : AppCompatActivity() {

    var condition: Condition = ConditionUnset()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_condition)

        val butClickListener = View.OnClickListener {
            fun onClick(v: View) {
                // XXX set as button or change the type of ConditionTouch/Drag params
                condition = ConditionTouch(v.id)
            }
        }

        val btnCat: Button = findViewById<Button>(R.id.button_cat)
        val btnDog : Button = findViewById<Button>(R.id.button_dog)
        val btnBird: Button = findViewById<Button>(R.id.button_bird)
        val btnFlower: Button = findViewById<Button>(R.id.button_flower)

        btnCat.setOnClickListener(butClickListener)
        btnDog.setOnClickListener(butClickListener)
        btnBird.setOnClickListener(butClickListener)
        btnFlower.setOnClickListener(butClickListener)
    }
}
