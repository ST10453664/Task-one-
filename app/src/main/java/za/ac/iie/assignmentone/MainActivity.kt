package za.ac.iie.assignmentone

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView◙

class MainActivity : AppCompatActivity() {
    //declare
    private lateinit var ButtonSearch: Button
    private lateinit var ResultTextview: TextView
    private lateinit var ageInput: EditText
    private lateinit var ButtonClear: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        //initialise
        ButtonSearch = findViewById(R.id.ButtonSearch)
        ButtonClear = findViewById(R.id.ButtonClear)
        ageInput = findViewById(R.id.ageInput)
        ResultTextview = findViewById(R.id.ResultTextview)

        ButtonSearch.setOnClickListener {
            val ageString =
                ageInput.text.toString()
            val age =
                ageString.toIntOrNull()

            if (age != null && age in 20..100) {
                val historicalFigure = when (age) {
                    50 -> "Michael Jackson"
                    40 -> "Paul Walker"
                    55 -> "Julius Ceaser"
                    78 -> "Mahatma Gandhi"
                    95 -> "Nelson Mandela"
                    96 -> "Queen Elizabeth"
                    42 -> "Elvis Presley"
                    25 -> "Tupac Shakur"
                    32 -> "Alexander the Great"
                    51 -> "Napoleon Bonaparte"
                    else -> null
                }

                val message =
                    if (historicalFigure != null) {
                        "You share the same age as $historicalFigure."
                    } else {
                        "NO historical figure found with the age entered."
                    }
                ResultTextview.text = message
            } else {
                ResultTextview.text = "Invalid input, please enter a valid age between 20 and 100."
            }
        }
        ButtonClear.setOnClickListener { ageInput.text.clear()
        ResultTextview.text = ""
        }

        }
    }
