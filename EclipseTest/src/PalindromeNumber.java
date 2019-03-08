
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
			   System.out.println("��������Ľ��Ϊ��"+rev);
		 }
		 if(rev==x){
			 System.out.println("L1Ҫ�жϵ���x="+x+","+"��ת֮��Ľ��rev="+rev);
			 return true;
		 }else{
			 System.out.println("L2Ҫ�жϵ���x="+x+","+"��ת֮��Ľ��rev="+rev);
			 return false;
		 }
		}  	

	}
}
