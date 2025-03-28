package vcmsa.ci.mealplanner

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        //Declaring variables

        val txtInput = findViewById<EditText>(R.id.txtInput)
        val txtOutput = findViewById<TextView>(R.id.txtOutput)
        val btnSuggest = findViewById<Button>(R.id.BtnSuggest)
        val btnReset = findViewById<Button>(R.id.btnReset)


        btnSuggest.setOnClickListener {//Beginning of if statement
            if (txtInput.text.toString()== "Morning;Breakfast") {
                txtOutput.text =
                    "2 scrambled eggs,2 slices of buttered toast and a glass of milk"
            } else if (txtInput.text.toString() =="Morning;snack "){
                txtOutput.text="1 banana and a glass of water"
            }else if ( txtInput.text.toString()=="Afternoon;lunch "){
                txtOutput.text="Chicken and rice with a glass of orange juice"
            }else if (txtInput.text.toString()=="Afternoon;Breakfast"){
                txtOutput.text="Half a slab of Cadbury top deck mint flavoured chocolate"
            }else if (txtInput.text.toString()=="Dinner; main course"){
                txtOutput.text="large bowl of homemade spaghetti bolognaise "
            }else if (txtInput.text.toString()=="After dinner snack"){
                txtOutput.text="A small serving of caramel ice cream with sprinkles"
            }else{
                Toast.makeText(this,"Please enter a valid time of day",Toast.LENGTH_SHORT).show()

            }//end of if statement

            btnReset.setOnClickListener {//clearing inputs and outputs
                txtInput.text.clear()
                txtOutput.text= ""
            }


        }
    }



}