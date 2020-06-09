/**
 * Project Software Engineering - using git
 */
package mySoftEngPrj;

/**
 * @author Ronaldo PC
 *
 */
public class myAppLab 
{
	private static final int NUM_STUDENT = 4;

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Student[] aStudent = new Student[NUM_STUDENT];

		aStudent[0] = new UndergraduateStudent(1234567, "Student #1");
		aStudent[1] = new UndergraduateStudent(2345678, "Student #2");
		aStudent[2] = new GraduateStudent(3456789, "Student #3");
		aStudent[3] = new GraduateStudent(4567890, "Student #4");
		
		// this code was inserted after change to branch
		System.out.println("Information - program has started!\n");
		
		for (int i=0; i<aStudent.length; i++)
		{
			String message = aStudent[i].getName() + "(" + 
					aStudent[i].getID() + ") is a/an " + 
					aStudent[i].getType() + " student, paying ";
			
			if (aStudent[i].getType().equalsIgnoreCase("UndergraudateStudent"))
				message += ((UndergraduateStudent)aStudent[i]).getTuition() 
					+ " for tuition fee.";
			else
				message += ((GraduateStudent)aStudent[i]).getTuition() 
				+ " for tuition fee.";
			
			System.out.println(message);
		}

		// this code was inserted after change to branch
		System.out.println("\nInformation - program has finished!");
	}
}