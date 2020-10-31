package schoolmanagementsystem;

import utils.MathUtils;

public class SchoolSystem {

  public static void main(String[] args) {

    System.out.println("Welcome to School Management System");

    Student abubakar = new Student();
    abubakar.rollNo = "MITF07M029";
    abubakar.name = "Abubakar";
    abubakar.address = "Kotli Bhutta";
    abubakar.phoneNumber = "03000-0000000";
    abubakar.print();
//    printStudent(abubakar);
//    System.out.println("Abubakar's Data : " + abubakar.name + ", " + abubakar.rollNo + ", " + abubakar.address + ", " + abubakar.phoneNumber);

    Student bilal = new Student();
    bilal.rollNo = "MITF07M022";
    bilal.name = "Muhammad Bilal Mirza";
    bilal.address = "Kot Fareed";
    bilal.phoneNumber = "0321-7190072";
    bilal.print();
//    printStudent(bilal);
//    System.out.println("Bilal's Data : " + bilal.name + ", " + bilal.rollNo + ", " + bilal.address + ", " + bilal.phoneNumber);

    Student tariq = new Student("MITF07M027", "Tariq Mahmood", "Aarifwaala", "032200000000");
    tariq.print();
//    printStudent(tariq);
//    System.out.println("Tariq's Data : " + tariq.name + ", " + tariq.rollNo + ", " + tariq.address + ", " + tariq.phoneNumber);


    tariq.address = "AwanTown, Lahore";
    tariq.print();
//    printStudent(tariq);
//    System.out.println("Tariq's Data : " + tariq.name + ", " + tariq.rollNo + ", " + tariq.address + ", " + tariq.phoneNumber);

    Student ashraf = new Student();
    ashraf.print();

    int total = MathUtils.add(5, 95);
    System.out.println(total);

    int diff = MathUtils.subtract(95, 5);
    System.out.println(diff);

    int product = MathUtils.multiply(85, 5);
    System.out.println(product);

    int div = MathUtils.divide(62, 2);
    System.out.println(div);

    AccountsSystem.main(args);

    System.out.println(Student.counter);

  }




}
