package com.example.android.quizapp2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    int score = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /**
     * This method is called when the order button is clicked.
     */
    public void submitOrder(View view) {
        score = 0;
        validateQuestion1();
        validateQuestion2();
        validateQuestion3();
        vadidateQuestion4();


        Toast.makeText(this, "Your score is " + score + "%", Toast.LENGTH_LONG).show();

    }

    private void validateQuestion1() {
        RadioGroup rgQuestion1 = findViewById(R.id.radiogroup_question_1);

        int checkedAnswer1 = rgQuestion1.getCheckedRadioButtonId();
        RadioButton radioButtonQuestion1 = findViewById(checkedAnswer1);

        if (radioButtonQuestion1.getText().toString().equals("No")) {
            score = score + 25;
        }
    }

    private void  validateQuestion2 () {
        RadioGroup rgQuestion2 = findViewById(R.id.radiobutton_question_2);

        int checkedAnswer2 = rgQuestion2.getCheckedRadioButtonId();
        RadioButton radioButtonQuestion2 = findViewById(checkedAnswer2);

        if (radioButtonQuestion2.getText().toString().equals("No")){
            score = score +25;
        }
    }

    private void validateQuestion3 () {
        RadioGroup rgQuestion3 = findViewById(R.id.radiobutton_question_3);

        int checkekedAnswer3 = rgQuestion3.getCheckedRadioButtonId();
        RadioButton radioButtonQuestion3 = findViewById(checkekedAnswer3);

        if (radioButtonQuestion3.getText().toString().equals("Yes")) {
            score = score +25;
        }
    }

    private void vadidateQuestion4() {
        RadioGroup rgQuestion4 = findViewById(R.id.radiobutton_question_4);

        int checkedAnswer4 = rgQuestion4.getCheckedRadioButtonId();
        RadioButton radioButtonQuestion4 = findViewById(checkedAnswer4);

        if (radioButtonQuestion4.getText().toString().equals("Yes")) {
            score = score +25;
        }

    }
}

