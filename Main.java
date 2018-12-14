public class Main
{
  public static void main (String[]args)
  {
    scenario1();
    scenario2();
  }
  public static void scenario1()
  {
// Condition: Probability of rolling a 6, on a single 6-sided die:
// Probability: 1/6 or 16.7%
    System.out.println ("Scenario: Expected result 16.7%");
    int numTrue = 0;
    int numFalse = 0;
    int count = 100000;
    for (int i = 0; i < count; i++)
      {
	int result = (int) Math.floor (Math.random () * 6) + 1;

	if (result == 6)
	  {
	    numTrue++;
	  }
	else
	  {
	    numFalse++;
	  }
      }
    System.out.println ("Count of True : " + numTrue);
    System.out.println ("Count of False : " + numFalse);
    System.out.println ("Condition reached " + ((float) numTrue / (float) count) * 100 + "%\n");
  }
    public static void scenario2()
  {
// Condition: Probability of rolling an even or greater than five, on a single 10-sided die:
// Probability: 7/10
    System.out.println ("Scenario: Expected result 70%");
    int numTrue = 0;
    int numFalse = 0;
    int count = 100000;
    for (int i = 0; i < count; i++)
      {
	int result = (int) Math.floor (Math.random () * 10) + 1;

	if ((result % 2) == 0 || result > 5)
	  {
	    numTrue++;
	  }
	else
	  {
	    numFalse++;
	  }
      }
    System.out.println ("Count of True : " + numTrue);
    System.out.println ("Count of False : " + numFalse);
    System.out.println ("Condition reached " + ((float) numTrue / (float) count) * 100 + "%\n");
  }
}


// Output
// Scenario: Expected result 16.7%
// Count of True : 16507
// Count of False : 83493
// Condition reached 16.507%
