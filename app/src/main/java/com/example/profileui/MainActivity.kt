package com.example.profileui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    // Declare UI elements
    private lateinit var profileImage: ImageView
    private lateinit var textName: TextView
    private lateinit var textBio: TextView
    private lateinit var btnEdit: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_profile)

        // Connect Kotlin code to XML IDs
        profileImage = findViewById(R.id.profile_image)
        textName = findViewById(R.id.text_name)
        textBio = findViewById(R.id.text_bio)
        btnEdit = findViewById(R.id.btn_edit)

        // Optional: Set text dynamically (no function needed)
        // textName.text = "Patricia Quiambao"
        // textBio.text = "Junior Android Developer | Learning UI/UX Design"
    }
}