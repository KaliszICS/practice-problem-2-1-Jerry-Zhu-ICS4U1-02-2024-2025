public class PracticeProblem {

	public static void main(String args[]) {

	}
public static int find(int[] arr, int num){
	int index = -1;
	for(int i = 0; i < arr.length; i++){
		if (arr[i] == num){
			return i;
		}
	}
	return index;
}
	
public static int findLast(String[] arr, String phrase){
	int index = -1;
	for(int i = 0; i < arr.length; i++){
		if(arr[i].equals(phrase)){
			index = i;
		}
	}
	return index;
}

public static int findSecond(char[] arr, char c){
	int index = -1;
	int counter = 0;
	for(int i = 0; i < arr.length; i++){

		if(arr[i] == c && counter < 2){
			index = i;
			counter++;
		}
	}
	return index;
}
}
