import java.util.HashMap;
import java.util.Iterator;

public class countPuntuatioin {
	// ToDo : To Find the words and characters occurs
	
		static void	findTheDuplicatesOccurence(String str){
			HashMap<String, Integer> hm = new HashMap<>();
			String[] s =str.split(" ");	
			for(String tempString : s) {
				if(hm.get(tempString) != null)
					hm.put(tempString,hm.get(tempString)+1);
				else
				    hm.put(tempString, +1);
			}
			Iterator<String> tempString = hm.keySet().iterator();
			while(tempString.hasNext()) {
				String temp = tempString.next();
				if(hm.get(temp)>1) {
				System.out.println("the word "+ temp + " appears " + hm.get(temp)+ " times ");	
				}
			}
		}
			static void findTheNoOfCharacters(String s1) {
				
				HashMap<Character,Integer>hm = new HashMap<>();
				for (int i = 0; i < s1.length(); i++) {
					char c = s1.charAt(i);
					if(hm.get(c) != null) {
						hm.put(c, hm.get(c)+1);
					}
					else {
						hm.put(c,+1);
					}
				}
					System.out.print(hm);	
			}
		public static void main(String[] args) {
			findTheDuplicatesOccurence("im a java java coder coder");
			findTheNoOfCharacters("iam a java master");
			
		}
}

