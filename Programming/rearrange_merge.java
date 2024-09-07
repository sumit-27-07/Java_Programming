package accenture;

public class rearrange_merge {

	public static void main(String[] args) {
		String str1="sumitxy";
		String str2="kumar";
		int n1=str1.length(),n2=str2.length();
		int i=0,n=n1+n2;
		int j=n-1;
		int min=(n1<n2)?n1:n2;
		char[] res=new char[n];
		while(i<min) {
			if(str1.charAt(i)<str2.charAt(i)) {
				res[i]=str1.charAt(i);
				res[j]=str2.charAt(i);
				i++;
				j--;
			}
			else {
				res[j]=str1.charAt(i);
				res[i]=str2.charAt(i);
				i++;
				j--;
			}
		}
		while(min<n1) {
			res[i]=str1.charAt(i);
			i++;
			n1--;
		}
		while(min<n2) {
			res[i]=str2.charAt(i);
			i++;
			n2--;
		}
		System.out.println(res);
	}

}
