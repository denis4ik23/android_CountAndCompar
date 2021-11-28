package com.app.countandcompar;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class PlusResult extends AppCompatActivity {
    TextView answer;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_plus_result);

        answer = (TextView) findViewById(R.id.textView3);

        answer.setText("В разработке...");//String.valueOf(1)
    }
    public void returnPlus(View view) {
        Intent intent;
        intent = new Intent(PlusResult.this, MainActivity.class);
        startActivity(intent);}
}