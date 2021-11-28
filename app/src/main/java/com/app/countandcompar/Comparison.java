package com.app.countandcompar;

public class Comparison implements Operation{
    @Override
    public int calculate(int a, int b) {
        if(a > b){
            return 1;
    } else if(a < b){
        return -1;
        } else {
            return 0;
        }
    }
}
