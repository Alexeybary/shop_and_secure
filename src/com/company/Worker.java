package com.company;

public abstract class Worker {
    String surname;
    String organisation;
    double coef;

    abstract public double method_of_sum();

    private double averageScore;
    Worker(String surname_, String organisation_, double coef_){
surname=surname_;
organisation=organisation_;
coef=coef_;
    }

    public abstract void print();
}
