package edu.cnm.deepdive;

public class Matrices {

  static int num;

  public static int[][] rotate(int[][] data) {

    num = data.length;
    int[][] rotated = new int[data.length][data.length];

    for (int i = 0; i < data.length; i++) {
      for (int j = 0; j < data.length; j++) {

        rotated[i][j] = data[num-1-j][i];
      }

    }
    return rotated;
  }

  public static void rotateInPlace(int[][] data) {

    int num = data.length;

    for (int i = 0; i < num / 2; i++) {
      for (int j = i; j < num - i - 1; j++) {

        int temp = data[i][j];
        data[i][j] = data[num - 1 - j][i];
        data[num - 1 - j][i] = data[num - 1 - i][num - 1 - j];
        data[num - 1 - i][num - 1 - j] = data[j][num - 1 - i];
        data[j][num - 1 - i] = temp;
      }
    }
  }

}