package practice01;
public class Game369 {
	public static void main(String[] args) {
		
		
		
		int clapCount=0;
		
		for(int i=1;i<=100;i++){
			String s = String.valueOf(i);
			for(int j=0;j<s.length();j++){
				char c = s.charAt(j);
				if(c=='3'||c=='6'||c=='9'){
					clapCount++;
				}
			}
			if(clapCount>0){
				System.out.print(i+" ");
				for(int k=0;k<clapCount;k++){
					System.out.print("짝");
				}
				System.out.println();
			}
			
			clapCount=0;
		}
		
		
		
		
		
	/*	
	 	int number = 36942;
		char c = s.charAt(2);
		System.out.println(c);
		
		int clapCount = 0;
		if(c=='3'||c=='6'||c=='9'){
			clapCount++;
		}
		
		*/
	}
}
