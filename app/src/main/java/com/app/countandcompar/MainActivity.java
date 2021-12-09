package com.app.countandcompar;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);// первое при загрузке приложения активити
    }
    /** обработчик нажатия на кнопку " + "
     * при нажатии на кнопку " + " переходит из текущего активити (MainActivity) в новое (MainActivityPlus)
     * */
    public void onClickPlus(View view) {
        Intent intent;
        intent = new Intent(MainActivity.this, MainActivityPlus.class);
        startActivity(intent);
    }
}