package mySoftEngPrj;

public abstract class Student 
{

	private int ID;
	private String name;
	
	public Student(int i, String n) 
	{
		this.ID = i;
		this.name = n;
	}

	public int getID() 
	{
		return ID;
	}

	public void setID(int iD) 
	{
		ID = iD;
	}

	public String getName() 
	{
		return name;
	}

	public void setName(String name) 
	{
		this.name = name;
	}
	
	public abstract String getType();
}
