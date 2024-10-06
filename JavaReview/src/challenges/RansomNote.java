package challenges;

import java.util.Arrays;

//given two strings return true if ransom note can be created from letters from magazine
public class RansomNote {
	public static void main (String[] args) {
		
		System.out.println(find("aa", "abhabb"));
		
	}
	public static boolean find(String ransomNote, String magazine) {
		var magazineArray = magazine.toCharArray();
		var ransomNoteArray = ransomNote.toCharArray();
		var ransomNoteIndex=0;
		
		Arrays.sort(magazineArray);
		Arrays.sort(ransomNoteArray);
		
		for(int i=0; i<magazineArray.length; i++) {
			if (magazineArray[i]==ransomNoteArray[ransomNoteIndex])
				ransomNoteIndex++;
			
			if (ransomNoteIndex >= ransomNote.length())
				return true;
			
		}
		return false;
		
	}
}
