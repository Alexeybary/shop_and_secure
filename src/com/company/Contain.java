package com.company;

import java.util.*;
import java.util.stream.Collectors;

class MyContainer<T extends Worker> extends ArrayList<T> {
    public List<String> printAllElements() {
        List listA = new ArrayList();
        for (int i = 0; i < this.size(); i++) {
            listA.add(this.get(i).organisation);
        }
        return listA;
    }
    public void printAll(){
        System.out.println("Collection:");
        for (int i = 0 ; i < this.size() ; i++){
            this.get(i).print();
        }
    }
    public List<T> sorted_by_salary() {
        List<T> sorted = this.stream().sorted((first, second) -> Double.compare(first.method_of_sum(), second.method_of_sum())).collect(Collectors.toList());
        return sorted;
    }
    public List<T> sorted_by_salarycoef(){
        List<T> sorted=this.stream().sorted((first,second)->Double.compare(first.method_of_sum()/first.coef,second.method_of_sum()/second.coef)).collect(Collectors.toList());
        return sorted;
    }
    public double Sum_of_salary(String organisations){
        OptionalDouble od = this.stream().filter(first-> first.organisation.equals(organisations)).mapToDouble(Worker::method_of_sum).average();
        if (od.isPresent()){
            return od.getAsDouble();
        }
        else{
            throw new NoSuchElementException();
        }
    }
}
