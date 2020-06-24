package eu.tutorial.initialproject

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // get reference to button
        val btn_click_me = findViewById(R.id.button ) as Button
        // set on-click listener
        btn_click_me.setOnClickListener {
            Toast.makeText(this@MainActivity, "மலை.", Toast.LENGTH_SHORT).show()
        }

    }
}