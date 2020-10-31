package schoolmanagementsystem;

public class Student {

  static int counter = 0;

  //Fields

  //Access: public, protected, package level, private,

  public String rollNo;
  public String name;
  public String address;
  public String phoneNumber;


  //constructors

  public Student() {
    counter ++;
    System.out.println("Student creation in progress");
  }

  public Student(String rollNo, String name, String address, String phoneNumber) {
    counter++;
    this.rollNo = rollNo;
    this.name = name;
    this.address = address;
    this.phoneNumber = phoneNumber;
  }


  //method
  void print() {
    System.out.println(this.name + "'s Data : " + this.rollNo + ", " + this.address + ", " + this.phoneNumber);
  }


}
