package mySoftEngPrj;

public class GraduateStudent extends Student implements TuitionPaid 
{

	public GraduateStudent(int i, String n)
	{
		super(i, n);
	}
	
	@Override
	public double getTuition() 
	{
		return 6000.0;
	}

	@Override
	public String getType() 
	{
		return "GraduateStudent";
	}
}