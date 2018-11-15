import java.util.*;

class Student_stack<T>
{
	int num=0;
	int tos, i, pus;

	Object [] Student;

	public void n_push(int n)
	{
		num = n;
		tos=0;
		Student = new Object[num];
	}
	public void add(int n)
	{
		num = n;
	}
	public void push(T item)
	{
		if(tos == num)
		{
			return;
		}

		Student[tos] = item;
		tos++;
	}
	public void PUSH(T ii, int pus)
	{
		Student[pus] = ii;
	}
	public void del(int d)
	{
		for(i=d; i<tos; i++)
		{
			if(i+1 != tos)
			{
				Student[i] = Student[i+1];
			}
		}
		tos--; 
	}
	public T print(int p)
	{
		if(tos == 0)
		{
			return null;
		}
		return (T)Student[p];
	}
}

class Score_stack<T>
{
	int num=0;
	int tos, i, pus;

	Object [] Score;

	public void n_push(int n)
	{
		num = n;
		tos=0;
		Score = new Object[num];
	}
	public void add(int n)
	{
		num = n;
	}
	public void push(T item)
	{
		if(tos == num)
		{
			return;
		}

		Score[tos] = item;
		tos++;
	}
	public void PUSH(T ii, int pus)
	{
		Score[pus] = ii;
	}
	public void del(int d)
	{
		for(i=d; i<tos; i++)
		{
			if(i+1 != tos)
			{
				Score[i] = Score[i+1];
			}
		}
		tos--; 
	}
	public T print(int p)
	{
		if(tos == 0)
		{
			return null;
		}
		return (T)Score[p];
	}
}
 
class Data_Base
{
	public int total = 0;
	public int L_total = 0;
	public int A = 0, B = 0, C = 0, D = 0, E = 0, F = 0, G = 0, H = 0, I = 0, J = 0, K = 0, L = 0, M = 0, N = 0;

	public String now_major;
	public String now_name;
	public String now_id;
	public String now_pass;

	public ArrayList<String> MAJOR = new ArrayList<String>();
	public ArrayList<String> ID = new ArrayList<String>();
	public ArrayList<String> NAME = new ArrayList<String>();
	public ArrayList<String> PASS = new ArrayList<String>();
	public ArrayList<String> GRADE = new ArrayList<String>();
	public ArrayList<String> CREDIT1 = new ArrayList<String>();
	public ArrayList<String> CREDIT2 = new ArrayList<String>();
	public ArrayList<String> CREDIT3 = new ArrayList<String>();
	public ArrayList<String> CREDIT4 = new ArrayList<String>();
	public ArrayList<String> CREDIT5 = new ArrayList<String>();
	public ArrayList<String> SCORE11 = new ArrayList<String>();
	public ArrayList<String> SCORE12 = new ArrayList<String>();
	public ArrayList<String> SCORE21 = new ArrayList<String>();
	public ArrayList<String> SCORE22 = new ArrayList<String>();
	public ArrayList<String> SCORE31 = new ArrayList<String>();
	public ArrayList<String> SCORE32 = new ArrayList<String>();
	public ArrayList<String> SCORE41 = new ArrayList<String>();
	public ArrayList<String> SCORE42 = new ArrayList<String>();
	public ArrayList<String> SCHOLARSHIP = new ArrayList<String>();
	public ArrayList<String> RECOGNITION1 = new ArrayList<String>();
	public ArrayList<String> RECOGNITION2 = new ArrayList<String>();
	
	public ArrayList<String> RECOGNITION = new ArrayList<String>();
	public ArrayList<String> R_ID = new ArrayList<String>();
	public ArrayList<String> R_CHECK = new ArrayList<String>();
	
	public ArrayList<String> Notice = new ArrayList<String>();

	public ArrayList<String> NUMBER = new ArrayList<String>();
	public ArrayList<String> FIELD = new ArrayList<String>();
	public ArrayList<String> TITLE = new ArrayList<String>();
	public ArrayList<String> CREDIT = new ArrayList<String>();
	public ArrayList<String> PROFESSOR = new ArrayList<String>();
	public ArrayList<String> SEASON = new ArrayList<String>();
	public Vector<Student_stack> STUDENT = new Vector<Student_stack>();
	public Vector<Score_stack> SCORE = new Vector<Score_stack>();
}
	