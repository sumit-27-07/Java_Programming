package hit;

import java.util.Map;
import java.util.TreeMap;

class sol {
    public int getKth(int lo, int hi, int k) {
        TreeMap<Integer,Integer> tm=new TreeMap<Integer,Integer>();
        for(int i=lo;i<=hi;i++){
            int x=i,c=0;
            while(x>1){
                if(x%2==0){
                    x=x/2;
                    c++;
                }
                else{
                    x=3*x+1;
                    c++;
                }
            }
            tm.put(i,c);
        }
        //int h=0;
        for(Map.Entry<Integer,Integer> entry : tm.entrySet()){
        	System.out.println("Key = " + entry.getKey() + ", Value = " + entry.getValue()); 
            /*h++;
            if(h==(k-1)){
                return entry.getValue();
            }*/
        }
        return 0;
    }
}
public class sorted_power {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		sol s=new sol();
		s.getKth(11, 15, 2);
	}

}
