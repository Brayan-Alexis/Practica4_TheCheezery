package fajardo.brayan.thecheezery

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.content.Intent
import android.widget.Button

class Register_activity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register)

        val btn: Button = findViewById<Button>(R.id.sign_in_btn)

        btn.setOnClickListener {
            var intent: Intent =  Intent(this,MenuActivity::class.java)
            startActivity(intent)
        }
    }
}