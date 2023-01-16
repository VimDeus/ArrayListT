import java.util.ArrayList;
import java.util.Arrays;

public class ArrayVsArrayList {

	public static void main(String[] args) {
		
		
		
		
		String[] friendsArray = new String[4];
		
	
		

		
		ArrayList<String> friendsArrayList = 
				new ArrayList<>(Arrays.asList("John", "Chris", "eric", "Luke"));
		
		// get ele
		System.out.println(friendsArray[1]);
		System.out.println(friendsArrayList.get(1));
		//get size
		
		System.out.println(friendsArray.length);
		System.out.println(friendsArrayList.size());
		//Add Element
		friendsArrayList.add("Mitch");
		System.out.println(friendsArrayList.get(4));
		//set element
		friendsArray[0] = "Carl";
		System.out.println(friendsArray[0]);
		friendsArrayList.set(0, "Carl");
		System.out.println(friendsArrayList.get(0));
		
		//Remove An Element
		friendsArrayList.remove("Chris");
		System.out.println(friendsArrayList.get(1));
		
		//Print
		System.out.println(friendsArray);
		System.out.println(friendsArrayList);
		
	}

}
