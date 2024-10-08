package com.example.tic_tac_toe
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import com.example.tic_tac_toe.R.*

class MainActivity : AppCompatActivity() {

    private var currentPlayer = "X" // Variable to keep track of the current player

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(layout.activity_main)

        // Get references to your buttons
        val buttons = arrayOf(
            findViewById<Button>(id.button1),
            findViewById<Button>(id.button2),
            findViewById<Button>(id.button3),
            findViewById<Button>(id.button4),
            findViewById<Button>(id.button5),
            findViewById<Button>(id.button6),
            findViewById<Button>(id.button7),
            findViewById<Button>(id.button8),
            findViewById<Button>(id.button9)
        )

        // Set click listeners for each button
        buttons.forEach { button ->
            button.setOnClickListener {
                onButtonClick(button)
            }
        }
    }

    // Function that handles the button click
    private fun onButtonClick(button: Button) {
        if (button.text.isEmpty()) {  // Check if the button hasn't been clicked yet
            if (currentPlayer == "X") {
                button.setBackgroundResource(drawable.x)  // Set "X" image
                currentPlayer = "O"  // Switch to player "O"
            } else {
                button.setBackgroundResource(drawable.o)  // Set "O" image
                currentPlayer = "X"  // Switch to player "X"
            }
            button.isClickable = false  // Disable further clicks on this button
        }
    }
}
