package net.juanjoalvarez.kidsprogramming

import android.support.v7.app.AppCompatActivity
import android.os.Bundle

class CodeActivity : AppCompatActivity() {

    var behaviours: List<Behaviour> = listOf()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_code)
    }
}
