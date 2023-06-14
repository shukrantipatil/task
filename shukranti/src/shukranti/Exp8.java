package shukranti;

public class Exp8 {
	int id;
	String name;
	int age;
	Exp8(int i,String n)
	{
		id=i;
		name=n;
	}
	Exp8(int i,String n,int a)
	{
		id=i;
		name=n;
		age=a;
	}
	void display()
	{
		System.out.println(id+" "+name + age);
		
	}
	

	
	public static void main(String[] args){
		Exp8 s1=new Exp8(111,"Karan");
		Exp8 s2=new Exp8(222,"Arayan",25);
		s1.display();
		s2.display();
	
	}

}
