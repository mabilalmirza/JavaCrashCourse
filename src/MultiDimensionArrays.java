public class MultiDimensionArrays {

  public static void main(String[] args) {

    int[][] table = {
      {20, 30, 50, 40},   //0
      {95, 35, 90, 30},   //1
      {75, 65, 10, 30}    //2
    };

//    System.out.println(table[0][0]);
//    System.out.println(table[0][1]);
//    System.out.println(table[0][2]);
//    System.out.println(table[0][3]);
//
//    System.out.println(table[1][0]);
//    System.out.println(table[1][1]);
//    System.out.println(table[1][2]);
//    System.out.println(table[1][3]);
//
//    System.out.println(table[2][0]);
//    System.out.println(table[2][1]);
//    System.out.println(table[2][2]);
//    System.out.println(table[2][3]);

//    for (int r = 0; r < table.length; r++) {
//      System.out.println(table[r][0]);
//      System.out.println(table[r][1]);
//      System.out.println(table[r][2]);
//      System.out.println(table[r][3]);
//    }

//    int[] firstRow = table[0];
//    System.out.println(firstRow[0]);
//    System.out.println(firstRow[1]);
//    System.out.println(firstRow[2]);
//    System.out.println(firstRow[3]);

    for (int r = 0; r < table.length; r++) {
      int[] row = table[r];
      for (int c = 0; c < row.length; c++) {
        System.out.print(row[c] + " ");
      }
      System.out.println();
    }
  }
}
