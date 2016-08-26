class Data_Base extends Thread
{
	public String MAJOR;
	public String ID;
	public String NAME;
	public String PASS;

	public void MAJOR(String m)
	{
		MAJOR = m;
	}
	
	public void ID(String i)
	{
		ID = i;
	}

	public void NAME(String n)
	{
		NAME = n;
	}

	public void PASS(String p)
	{
		PASS = p;
	}

	public String MAJOR_print()
	{
		return MAJOR;
	}
	
	public String ID_print()
	{
		return ID;
	}

	public String NAME_print()
	{
		return NAME;
	}

	public String PASS_print()
	{
		return PASS;
	}
}
	