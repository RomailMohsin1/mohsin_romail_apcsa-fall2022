//(c) A+ Computer Science
//www.apluscompsci.com
//Name -
//Date -


public class FirstLastVowel
{
	private static String vowels = "aeiouAEIOU";
   public static String go( String a ){
	   String firstLet = a.substring(0,1);
	   String lastLet = a.substring(a.length()-1);
	   if (vowels.contains(firstLet) || vowels.contains(lastLet)){
		   return "yes";
	   }
	   return "no";
	   }
	}
   
	
