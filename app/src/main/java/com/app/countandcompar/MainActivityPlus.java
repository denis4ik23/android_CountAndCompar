package com.app.countandcompar;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import static com.app.countandcompar.NumberRandom.numberRandom;

public class MainActivityPlus extends AppCompatActivity {
    TextView numbRandom1;
    TextView numbRandom2;
    TextView result1;
    TextView result2;
    TextView result3;
    final int numberRandom1 = numberRandom(10);
    final int numberRandom2 = numberRandom(10);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_plus);

        numbRandom1 = (TextView) findViewById(R.id.numbRandom1);
        numbRandom2 = (TextView) findViewById(R.id.numbRandom2);

        result1 = (TextView) findViewById(R.id.textView8);
        result2 = (TextView) findViewById(R.id.textView9);
        result3 = (TextView) findViewById(R.id.textView10);

        numbRandom1.setText(String.valueOf(numberRandom1));
        numbRandom2.setText(String.valueOf(numberRandom2));

        int a = numberRandom1;
        int b = numberRandom2;
        int c = a + b;

        String[] list = new String[3];
        list[0] = String.valueOf(c + 1);
        list[1] = String.valueOf(c + 2);
        list[2] = String.valueOf(c);

        List<String> answersList = Arrays.asList(list);
        Collections.shuffle(answersList);
        String[] shuffledAnswers = answersList.toArray(list);

        result1.setText(String.valueOf(shuffledAnswers[0]));
        result2.setText(String.valueOf(shuffledAnswers[1]));
        result3.setText(String.valueOf(shuffledAnswers[2]));
    }
    public void onClickPlusResult(View view) {
        Intent intent;
        intent = new Intent(MainActivityPlus.this, PlusResult.class);
        startActivity(intent);}
}