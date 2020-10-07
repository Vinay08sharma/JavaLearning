import java.io.ObjectInputStream.GetField;
import java.util.HashMap;

public class HashMapDemo {

	
	
	public static HashMap<String,String> getCredentialHasMap()
	{
		HashMap<String, String> user = new HashMap<String, String>();
		
		user.put("admin", "vinay:vinay123");
		user.put("delivery","pankaj:pankaj123");
		user.put("supervisor", "sachin:sachin123");
		user.put("executive", "vikas:vikas123");
		return user;
	}
	
	public static void main(String[] args) {
		
		
		System.out.println(getCredentialHasMap());
		System.out.println(getUserName("delivery"));
		System.out.println(getpassword("delivery"));
	}
	
	
	public static String getUserName(String role)
	{
		String userNameData =getCredentialHasMap().get(role);
		return userNameData.split(":")[0];
	}
	
	public static String getpassword(String role)
	{
		String pwdData = getCredentialHasMap().get(role);
		return pwdData.split(":")[1];
	}
}
