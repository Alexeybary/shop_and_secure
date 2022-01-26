package com.company;

public class Security extends Worker {
    double secure_square;
     final int constant=54;


    @Override
    public double method_of_sum() {
        double salary=constant*this.coef*secure_square;
        salary = Math.round(salary * 100.0) / 100.0;
        return salary;
    }

    @Override
    public void print() {
        System.out.println(this.surname+this.organisation+this.coef+this.secure_square);
    }

    Security(String surname_, String organisation_, double coef_, double secure_square_) {
        super(surname_,organisation_,coef_);
        secure_square=secure_square_;
    }


    @Override
    public String toString() {
        return surname +organisation;
    }
}
