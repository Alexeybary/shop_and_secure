package com.company;

import java.io.Console;
import java.io.File;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class Main {



    public static void readSecurity(File fileSecurity, MyContainer secure) throws IOException, NoSuchElementException {
        Scanner scanner = new Scanner(fileSecurity);
        String surname, organisation;
        int coef;
        double secure_square;
        while (scanner.hasNext()) {
            surname = scanner.next();
            organisation = scanner.next();
            coef = Integer.parseInt(scanner.next());
            secure_square = Double.parseDouble(scanner.next());

            secure.add(new Security(surname, organisation, coef, secure_square));
        }
        System.out.println("Reading from file successfully done!");
    }
    public static void readSaleman(File fileSecurity, MyContainer saler) throws IOException, NoSuchElementException {
        Scanner scanner = new Scanner(fileSecurity);
        String surname, organisation;
        int coef;
        double good_salary;
        while (scanner.hasNext()) {
            surname = scanner.next();
            organisation = scanner.next();
            coef = Integer.parseInt(scanner.next());
            good_salary = Double.parseDouble(scanner.next());
            saler.add(new Saler(surname, organisation, coef,good_salary));
        }
        System.out.println("Reading from file successfully done!");
    }
    public static void main(String[] args) throws IOException {
        File file1=new File("filename.txt");
        File file2=new File("filename2.txt");

        MyContainer<Security> securities = new MyContainer<>();
        MyContainer<Saler> salers = new MyContainer<>();
        readSecurity(file1,securities);
        readSaleman(file2,salers);
        securities.printAll();
        salers.printAll();
        System.out.println(securities.printAllElements());
        System.out.println(salers.printAllElements());
        System.out.println(securities.sorted_by_salary());
        System.out.println(salers.sorted_by_salary());
        System.out.println(securities.sorted_by_salarycoef());
        System.out.println(salers.sorted_by_salarycoef());
        System.out.println(salers.Sum_of_salary("dodo"));
    }
}

