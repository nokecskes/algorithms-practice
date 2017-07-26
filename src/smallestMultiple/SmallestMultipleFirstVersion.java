package smallestMultiple;

/*
* 2520 is the smallest number that can be divided by each of the numbers from 1 to 10 without any remainder.
* What is the smallest positive number that is evenly divisible by all of the numbers from 1 to 20?
*/

public class SmallestMultipleFirstVersion {

  public static void main(String[] args) {
    int maxDivider = 20;
    int smallestMultiple = findSmallestMultiple(maxDivider);
    System.out.println(smallestMultiple);
  }

  public static int findSmallestMultiple(int maxDivider) {
    for (int i = maxDivider; i < Integer.MAX_VALUE; i += maxDivider) {
      int currentNumberToDivide = i;
      if (isSmallestMultiple(currentNumberToDivide, maxDivider)) {
        return currentNumberToDivide;
      }
    }
    return -1;
  }

  private static boolean isSmallestMultiple(int numberToDivide, int maxDivider) {
    for (int j = 2; j < maxDivider; j++) {
      if (numberToDivide % j != 0) {
        return false;
      }
    }
    return true;
  }


}
