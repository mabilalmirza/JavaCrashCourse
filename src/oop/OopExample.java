package oop;

import utils.MathUtils;

public class OopExample {

  public static void main(String[] args) {

    StudentMarks akhtar = new StudentMarks();
    akhtar.name = "Akhtar";
    akhtar.english = 56;
    akhtar.urdu = 95;
    akhtar.math = 20;
    akhtar.processMarks();


    StudentMarks nouman = new StudentMarks();
    nouman.name = "Nouman";
    nouman.english = 97;
    nouman.urdu = 52;
    nouman.math = 67;
    nouman.processMarks();


    Human alex = new Human();
    alex.name = "Alex Norton";
    alex.height = 6.5F;
    alex.address = "201 Bakers Street";
    alex.gender = "Male";

    alex.speak();
    alex.walk();

    MathUtils.add(1, 2);

  }



}
