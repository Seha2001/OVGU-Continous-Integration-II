import org.junit.Assert;
import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class PrimeCheckTest {
  // --------------------------------------------------------------- //
  @Test
  public void TestNegativeNumbers() {
    for (int i = -10; i < 0; ++i) {
      assertEquals("Test negative number " + i, false, PrimeCheck.isPrime(i));
    }
  }

  // --------------------------------------------------------------- //
  @Test
  public void TestEdgeCases() {
    assertEquals("Test 0", false, PrimeCheck.isPrime(0));
    assertEquals("Test 1", false, PrimeCheck.isPrime(1));
    assertEquals("Test 2", true, PrimeCheck.isPrime(2));
  }

  // --------------------------------------------------------------- //
  @Test
  public void testPrimes() {
    int[] prime = {2, 3, 5, 7};
    for (int i = 0; i < prime.length; i++) {
      assertEquals("Test prime" + prime, true, PrimeCheck.isPrime(prime[i]));
    }
  }

  // --------------------------------------------------------------- //
  @Test
  public void testNonPrimes() {
    int[] notprime = {0, 4, 6, 8};
    for (int i = 0; i < notprime.length; i++) {
      assertEquals("nicht prime" + notprime, false, PrimeCheck.isPrime(notprime[i]));
    }
  }
}
