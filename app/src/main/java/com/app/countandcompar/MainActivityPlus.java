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
    TextView numbRandom1;//вью для первой цифры
    TextView numbRandom2;// вью для второй цифры
    TextView result1;// вью результат 1
    TextView result2;//... 2
    TextView result3;//... 3
    final int numberRandom1 = numberRandom(10);//присваиваем значение первой переменной из класса рандом
    final int numberRandom2 = numberRandom(10);// ... второй (i - границы рандома (от 0 до 10 в данном примере))

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_plus);

        numbRandom1 = (TextView) findViewById(R.id.numbRandom1);// инициилизируем вью для первого значения
        numbRandom2 = (TextView) findViewById(R.id.numbRandom2);//... второго
        result1 = (TextView) findViewById(R.id.textView8);//... для результата 1
        result2 = (TextView) findViewById(R.id.textView9);//...2
        result3 = (TextView) findViewById(R.id.textView10);//...3

        numbRandom1.setText(String.valueOf(numberRandom1));//выводим на экран первое значение
        numbRandom2.setText(String.valueOf(numberRandom2));//... второе

        int a = numberRandom1;//записываем первое значение в переменную а
        int b = numberRandom2;//...второе... в b
        int c = a + b;//записываем правильный результат в переменную с

        String[] list = new String[3];//создаем массив на 3 элемента
        list[0] = String.valueOf(c + 1);//записываем первое неправильный результат в массив
        list[1] = String.valueOf(c + 2);//... второй
        list[2] = String.valueOf(c);//записываем правильный результат в массив

        List<String> answersList = Arrays.asList(list);//создаем список и передаем ему значения массива
        Collections.shuffle(answersList);//исползуем метод shuffle() для перемешивания списка
        String[] shuffledAnswers = answersList.toArray(list);//создаем новый массив и передаем ему перемешанный список

        result1.setText(String.valueOf(shuffledAnswers[0]));// выводим первый элемент для выбора результата сложения
        result2.setText(String.valueOf(shuffledAnswers[1]));//... второй
        result3.setText(String.valueOf(shuffledAnswers[2]));//... третий
    }
/** " + " обработчик нажатия на кнопку с результатами сложения
 * при нажатии на первый, второй или третий результат программма
 * переходит из текущего активити (MainActivityPlus) в новое (PlusResult), где будет указан результат выбора (правильно или нет)
* */
    public void onClickPlusResult(View view) {

        Intent intent;
        intent = new Intent(MainActivityPlus.this, PlusResult.class);
        startActivity(intent);
    }
}