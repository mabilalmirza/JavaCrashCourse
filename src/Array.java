public class Array {

  public static void main(String[] args) {

//    String[] names = new String[4];
//    names[0] = "Talha";
//    names[1] = "Huzaifa";
//    names[2] = "Aetisam";
//    names[3] = "Hassan";

    String[] names = { "Talha", "Huzaifa", "Aetisam", "Hassan" };

//    for(int i = 0; i < names.length; i++) {
//      System.out.println(names[i]);
//    }

    //For each loop
    for (String name: names) {
      System.out.println(name);
    }

//    System.out.println(names[10]); // Index out of bound

    int[] marks = {95, 60, 65, 99};
    for (int mark : marks) {
      System.out.println(mark);
    }

  }

}
