package GenericUtility;

import java.util.Random;

/**
 * This class contain java specific methods
 * @author user
 *
 */
public class JavaUtility {
	/**
	 * this method will generete a random value for every run
	 */
	public int                                                                                                         getRandomNum()
	{
		Random ran = new Random();
		int value =ran.nextInt(100);
		return value;
	}
}
