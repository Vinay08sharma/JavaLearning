
public class SingletonDemo {
	

	private static SingletonDemo singleton_ref = null;
	
	public String str;
	
	private SingletonDemo()  // Private Constructor
	{
		str = "This is Singleton Class";
	}
	
	public static SingletonDemo getInstance() //it has the returntype of the object of the class (Lazy Intitalization)
	{
		if(singleton_ref==null)
			singleton_ref = new SingletonDemo();
			return singleton_ref;
		
	}
	
	public static void main(String[] args) {
	SingletonDemo x	=SingletonDemo.getInstance();
	SingletonDemo y	=SingletonDemo.getInstance();
		
	x.str = (x.str).toUpperCase();
		
	System.out.println(x.str);
	System.out.println(y.str);

	}

}
