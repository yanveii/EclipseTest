
import java.util.LinkedList;
import java.util.Queue;


public class PalindromeNumber {

	public static void main(String[] args){
		int x=102;
		System.out.print((new PalindromeNumber()).isPalindrome(x));	
	}
	public boolean isPalindrome(int x){
		Queue<Integer> qu = new LinkedList<>();
		if(x<0){
			return false;
		}
		else{
		 int temp=x;
		 while(temp!=0){
			 qu.add(temp%10);
		    	temp/=10;
		 }
		 int rev=0;
		 while(!qu.isEmpty()){
			   rev=rev*10+qu.remove();
			   System.out.println("此轮输出的结果为："+rev);
		 }
		 if(rev==x){
			 System.out.println("L1要判断的数x="+x+","+"翻转之后的结果rev="+rev);
			 return true;
		 }else{
			 System.out.println("L2要判断的数x="+x+","+"翻转之后的结果rev="+rev);
			 return false;
		 }
		}  	

	}
}
