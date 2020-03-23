package z_eam;

public class asd1 {

	
	
	 static int[] shuffle (int arr[]){
		int a = (int)(Math.random()*9)+1;
		
		for(int i=0; i<arr.length; i++){
			int temp=0;
			temp = arr[i];
			arr[i] = arr[a];
			arr[a] = temp;
			
			
		}	return arr;
			
			
			
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	public static void main(String[] args) {
		int[] original = {1,2,3,4,5,6,7,8,9};
		System.out.println(java.util.Arrays.toString(original)); 
		int[] result = shuffle(original);
		System.out.println(java.util.Arrays.toString(result)); }

}
