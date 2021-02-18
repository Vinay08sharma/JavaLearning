import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class DuplicateWordsInString {

	public static void main(String[] args) {

		DuplicateValue("JAVA IS JAVA AND I WANT TO LEARN JAVA");
		
	}
	
	public static void DuplicateValue(String inputString)
	{
		
		String[] formattedString = inputString.split(" ");
		
		
		Map<String, Integer> wordCount = new HashMap<String, Integer>();
		
		for(String word : formattedString)
		{
			if(wordCount.containsKey(word))
			{
				wordCount.put(word, wordCount.get(word)+1);
			}
			else
			{
				wordCount.put(word, 1);
			}
		}
		
		Set<String> str = wordCount.keySet();
		
//		for(String s : str)
//		{
//			if(wordCount.get(s)>1)
//			{
//			System.out.println();
//			}
//		}
		
		str.forEach(s ->{
			if(wordCount.get(s)>1)
			{
				System.out.println(s + " : "+wordCount.get(s));
			}
			
		});

		System.out.println("======================================");
		//Need to print all the words with counts

		for(String s1 : str){
			System.out.println(s1 +" : "+wordCount.get(s1) );
		}
		
		
	}

}
