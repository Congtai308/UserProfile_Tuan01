package ut.edu.UserProfile

import android.os.Bundle
import android.widget.ImageButton
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val backButton = findViewById<ImageButton>(R.id.backButton)
        val editButton = findViewById<ImageButton>(R.id.editButton)

        backButton.setOnClickListener {
            Toast.makeText(this, "Back pressed", Toast.LENGTH_SHORT).show()
        }

        editButton.setOnClickListener {
            Toast.makeText(this, "Edit clicked", Toast.LENGTH_SHORT).show()
        }
    }
}