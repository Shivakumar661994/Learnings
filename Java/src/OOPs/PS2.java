package OOPs;

public class PS2 extends PS3{

	int a; //class variable
	public PS2(int a) 	{
//		instance variable
		super(a);
		this.a=a;
	}

	public int increment() {

		a=a+1;
		return a;
	}
	
	public int decrement() {
		
		a=a-1;
		return a;
	}
}
