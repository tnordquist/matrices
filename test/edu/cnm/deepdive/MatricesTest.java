package edu.cnm.deepdive;

import static org.junit.jupiter.api.Assertions.*;

import java.util.stream.Stream;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

@DisplayName("Should pass the method parameters provided by the rotate() & "
    + "rotateInPlace methods")
class MatricesTest {

  private static final int[][] INPUT_ARR_3 = {{2, 4, 6}, {8, 10, 12},
      {14, 16, 18}};
  private static final int[][] EXPECTED_ARR_3 = {{14, 8, 2}, {16, 10, 4},
      {18, 12, 6}};
  private static final int[][] INPUT_ARR_2 = {{1, 2}, {4, 3}};
  private static final int[][] EXPECTED_ARR_2 = {{4, 1}, {3, 2}};
  private static final int[][] INPUT_ARR_1 = {{-1}};
  private static final int[][] EXPECTED_ARR_1 = {{-1}};

  @DisplayName("Should calculate the correct 2d array")
  @ParameterizedTest(name = "{index} => input={0}, output={1}")
  @MethodSource("rotate")
  static void rotate(int[][] input, int[][] output) {
    assertEquals(output, Matrices.rotate(input));
  }

  private static Stream<Arguments> rotate() {
    return Stream.of(
        Arguments.of(INPUT_ARR_1, EXPECTED_ARR_1),
        Arguments.of(INPUT_ARR_2, EXPECTED_ARR_2),
        Arguments.of(INPUT_ARR_3, EXPECTED_ARR_3)

    );

  }



  @DisplayName("Should calculate the correct 2d array")
  @ParameterizedTest(name = "{index} => input={0}, output={1}")
  @MethodSource("rotateInPlace")
  static void rotateInPlace(int[][] input, int[][] output) {
    Matrices.rotateInPlace(input);
    assertEquals(output, input);
  }

  private static Stream<Arguments> rotateInPlace() {
    return Stream.of(
        Arguments.of(INPUT_ARR_1, EXPECTED_ARR_1),
        Arguments.of(INPUT_ARR_2, EXPECTED_ARR_2),
        Arguments.of(INPUT_ARR_3, EXPECTED_ARR_3)

    );

  }
}