package com.company;

public class Saler extends Worker {
double good_salary;
final int coef_const=20;
    Saler(String surname_, String organisation_, double coef_,double good_salary_) {
        super(surname_, organisation_, coef_);
        good_salary=good_salary_;
    }

    @Override
    public void print() {

    }


    @Override
    public double method_of_sum() {
        double salary = this.coef * good_salary * coef_const / 100;
        salary = Math.round(salary * 100.0) / 100.0;
        return salary;
    }
    @Override
    public String toString() {
        return surname +organisation;
    }
}
