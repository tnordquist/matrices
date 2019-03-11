package edu.cnm.deepdive;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class MatricesTest {

  private static final int[][] INPUT_ARR_3 = {{2, 4, 6}, {8, 10, 12},
      {14, 16, 18}};
  private static final int[][] EXPECTED_ARR_3 = {{14, 8, 2}, {16, 10, 4},
      {18, 12, 6}};
  private static final int[][] INPUT_ARR_2 = {{1, 2}, {4, 3}};
  private static final int[][] EXPECTED_ARR_2 = {{4, 1}, {3, 2}};
  private static final int[][] INPUT_ARR_1 = {{-1}};
  private static final int[][] EXPECTED_ARR_1 = {{-1}};


  @Test
  void rotate() {

    assertArrayEquals(EXPECTED_ARR_1, Matrices.rotate(INPUT_ARR_1));
    assertArrayEquals(EXPECTED_ARR_2, Matrices.rotate(INPUT_ARR_2));
    assertArrayEquals(EXPECTED_ARR_3, Matrices.rotate(INPUT_ARR_3));

  }

  @Test
  void rotateInPlace() {

    assertArrayEquals(EXPECTED_ARR_1, Matrices.rotate(INPUT_ARR_1));
    assertArrayEquals(EXPECTED_ARR_2, Matrices.rotate(INPUT_ARR_2));
    assertArrayEquals(EXPECTED_ARR_3, Matrices.rotate(INPUT_ARR_3));

  }
}
