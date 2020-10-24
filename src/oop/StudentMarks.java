package oop;

public class StudentMarks {

  public String name;
  public int english;
  public int urdu;
  public int math;

  public void processMarks() {

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
        name, english, urdu, math,
        totalMarks, percentage, grade);

  }

}
