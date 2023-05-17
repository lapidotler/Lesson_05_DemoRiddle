package sg.edu.rp.c346.id22024044.lesson_05_demoriddle;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import sg.edu.rp.c346.id22024044.lesson_05_demoriddle.R;

public class AnswerActivity2 extends AppCompatActivity {

    TextView tvAnswer2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_answer2);

        tvAnswer2 = findViewById(R.id.textView2);

        Intent intendReceived = getIntent();
        String questionsSelected = intendReceived.getStringExtra("Question");
        tvAnswer2.setText(questionsSelected + " answer is: Gone");

    }
}