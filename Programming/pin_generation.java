package accenture;
import java.util.*;
//Question: max freq of large num + min freqf of small num + max number+ min number
public class pin_generation {
	public static int pin(int input1,int input2,int input3) {
		int[] frequency=new int[10];
		ArrayList<Integer> digit=new ArrayList<>();
		extract_digit(input1,digit,frequency);
		extract_digit(input2,digit,frequency);
		extract_digit(input3,digit,frequency);
		
		int min_num=Collections.min(digit);
		int max_num=Collections.max(digit);
		return maxfreq(frequency)*1000+minfreq(frequency)*100+max_num*10+min_num;
	}
	public static void extract_digit(int num,ArrayList<Integer> digit,int[] frequency) {
		while(num>0) {
			int d=num%10;
			digit.add(d);
			frequency[d]++;
			num/=10;
		}
	}
	public static int maxfreq(int[] frequency) {
		int max=Integer.MIN_VALUE,maxn=-1;
		for(int i=1;i<frequency.length;i++) {
			if(max<=frequency[i] || (max==frequency[i] && maxn<i)) {
				max=frequency[i];
				maxn=i;
			}
		}
		return maxn;
	}
	public static int minfreq(int[] frequency) {
		int min=Integer.MAX_VALUE,minn=10;
		for(int i=1;i<frequency.length;i++) {
			if(frequency[i]>0 && (frequency[i]<min || (frequency[i]==min && i<minn))) {
				min=frequency[i];
				minn=i;
			}
		}
		return minn;
	}
	public static void main(String[] args) {
		System.out.println(pin(1274, 5283, 1937));

	}

}
