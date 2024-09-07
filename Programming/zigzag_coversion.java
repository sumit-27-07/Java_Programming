package hit;
class Sol1 {
    public static void convert(String s, int numRows) {
        int n=numRows;
        char[][] arr = new char[n][s.length()];
        for(int a=0;a<n;a++){
            for(int b=0;b<s.length();b++){
                arr[a][b]='*';
            }
        }
        int i=-1,j,k=0;
        while(k<s.length()){
            i++;
            for(j=0;j<numRows && k<s.length();j++){
                arr[j][i]=s.charAt(k);
                k++;
            }
            j--;
            while(j!=1 && k<s.length()){
                j=j-1;
                i=i+1;
                arr[j][i]=s.charAt(k);
                k++;
            }
        }
        for(int a=0;a<numRows;a++){
            for(int b=0;b<s.length();b++){
                System.out.print(arr[a][b]+" ");
            }
            System.out.println();
        }
    }
}
public class zigzag_coversion {

	public static void main(String[] args) {
		Sol1.convert("abcdef",2);

	}

}
