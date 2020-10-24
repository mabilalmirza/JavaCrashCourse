package oop;

public class StructuredProgrammingExample {


  public static void main(String[] args) {

    int totalStudents = 5;

    String[] names = {"A", "B", "C", "D", "E"};
    int[] english = {75, 60, 89, 20, 35};
    int[] urdu = {80, 98, 65 ,15 ,45};
    int[] math = {90, 65 ,94, 32 ,56};

    for (int i = 0; i < totalStudents; i++) {
      processMarks(names[i], english[i], urdu[i], math[i]);
    }

  }

  private static void processMarks(String name, int english, int urdu, int math) {

    int totalMarks = english + urdu + math;
    int percentage = totalMarks * 100 / 300;

    char grade;

    if (percentage >= 85) {
      grade = 'A';
    } else if (percentage >= 70) {
      grade = 'B';
    } else if (percentage >= 50) {
      grade = 'C';
    } else {
      grade = 'F';
    }

    System.out.printf(
        "%s :: English = %d, Urdu = %d, Math = %d, Total = %d, Percentage = %d, Grade = %c%n",
        name, english, urdu, math, totalMarks, percentage, grade);

  }


}
