public class Condition {

  public static void main(String[] args) {

    int percent = 95;

    char grade;
    if (percent >= 90) {
      grade = 'A';
    } else if (percent >= 80) {
      grade = 'B';
    } else if (percent >= 70) {
      grade = 'C';
    } else if (percent >= 60) {
      grade = 'D';
    } else if (percent >= 50) {
      grade = 'E';
    } else {
      grade = 'F';
    }

    System.out.println("Grade : " + grade);

//    if (grade == 'A') {
//      System.out.println("100,000/-");
//    } else if (grade == 'B') {
//      System.out.println("70,000/-");
//    } else if (grade == 'C') {
//      System.out.println("50,000/-");
//    } else {
//      System.out.println("Faarigh");
//    }

    switch (grade) {
      case 'A':
        System.out.println("100,000/-");
        break;
      case 'B':
        System.out.println("70,000/-");
        break;
      case 'C':
        System.out.println("50,000/-");
        break;
      default:
        System.out.println("Faarigh");
    }


  }



}
