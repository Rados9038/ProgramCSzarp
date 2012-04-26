public class Hello{
  public static void main(String[] args){
	int liczba = 0;
	while (liczba<100) {
		
		liczba+=1;		
		if(liczba %4==0&&liczba%10!=0&&liczba%8!=0)
			System.out.println(liczba);	
		}
		
    

  }
}