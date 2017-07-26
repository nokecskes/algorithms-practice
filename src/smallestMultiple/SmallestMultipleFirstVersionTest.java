package smallestMultiple;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class SmallestMultipleFirstVersionTest {

  SmallestMultipleFirstVersion smallestMultipleFirstVersion = new SmallestMultipleFirstVersion();

  @Test
  public void findSmallestMultiple_to10() {
    int maxDivider = 10;
    int expectedResult = 2520;
    assertEquals(expectedResult, smallestMultipleFirstVersion.findSmallestMultiple(maxDivider));
  }

  @Test
  public void findSmallestMultiple_to20() {
    int maxDivider = 20;
    int expectedResult = 232792560;
    assertEquals(expectedResult, smallestMultipleFirstVersion.findSmallestMultiple(maxDivider));
  }


}