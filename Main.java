public class Main
{
  public static void main (String[]args)
  {
    scenario1();
    scenario2();
    scenario3();
    scenario4();
    scenario5();
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
// Probability: 1/6 or 16.7%
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
  public static void scenario3()
  {
    System.out.println ("Scenario: Expected result 25%");
    int numTrue = 0;
    int numFalse = 0;
    int count = 100000;
    for (int i = 0; i < count; i++)
      {
	int result1 = (int) Math.floor (Math.random () * 6) + 1;
	int result2 = (int) Math.floor (Math.random () * 6) + 1;

	if ((result1 % 2) == 0 && result2 % 2 != 0)
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
    public static void scenario4()
  {
    System.out.println ("Scenario: Expected result 35%");
    int numTrue = 0;
    int numFalse = 0;
    int count = 100000;
    for (int i = 0; i < count; i++)
      {
	int result1 = (int) Math.floor (Math.random () * 6) + 1;
	int result2 = (int) Math.floor (Math.random () * 6) + 1;
	int result3 = (int) Math.floor (Math.random () * 6) + 1;

	if (result1 == 1 || result1 == 2 && result2 == 3 || result2 == 4 && result3 == 5 || result3 == 6)
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
   public static void scenario5()
  {
    System.out.println ("Scenario: Expected result 27.75%");
    int numTrue = 0;
    int numFalse = 0;
    int count = 100000;
    for (int i = 0; i < count; i++)
      {
	int result1 = (int) Math.floor (Math.random () * 6) + 1;
	int result2 = (int) Math.floor (Math.random () * 6) + 1;
	int result3 = (int) Math.floor (Math.random () * 6) + 1;
	int result4 = (int) Math.floor (Math.random () * 6) + 1;

	if (result1 != result2 && result1 != result3 && result1 != result4 && result2 != result3 && result2 != result4 && result3 != result4)
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


