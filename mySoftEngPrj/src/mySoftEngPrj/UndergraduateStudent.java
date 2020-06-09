package mySoftEngPrj;

public class UndergraduateStudent extends Student implements TuitionPaid 
{

	public UndergraduateStudent(int i, String n) 
	{
		super(i, n);
	}

	@Override
	public double getTuition()
	{
		return 4000.0;
	}

	@Override
	public String getType() 
	{
		return "UndergraudateStudent";
	}
}