import java.io.FileInputStream;
import java.io.IOException;


public class Task1{
	public static void main(String[] args){
		try{
			FileInputStream input = new FileInputStream("Task1.txt");
			int i;
			int counter =1;
			while((i=input.read())!=-1){
				if((char)i==' '){
					counter+=1;
				}
			}
			System.out.println(counter);
		}catch(IOException e){
			System.out.println(e);
		}
	}
}