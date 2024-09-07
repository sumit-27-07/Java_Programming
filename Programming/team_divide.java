package accenture;

import java.util.ArrayList;

public class team_divide {

	public static void main(String[] args) {
		String str="1 5 -2 22 33 -7";
		String[] stri=str.split(" ");
		ArrayList<Integer> al=new ArrayList<>();
		for(int i=0;i<stri.length;i++) {
			al.add(Integer.parseInt(stri[i]));
		}
		int t1=0,t2=0;
		while(!al.isEmpty()) {
			if(al.get(0)>al.get(al.size()-1)) {
				t1+=al.get(0);
				al.remove(0);
			}
			else {
				t1+=al.get(al.size()-1);
				al.remove(al.size()-1);
			}
			if(al.isEmpty()) {
				break;
			}
			else {
				if(al.get(0)>al.get(al.size()-1)) {
					t2+=al.get(0);
					al.remove(0);
				}
				else {
					t2+=al.get(al.size()-1);
					al.remove(al.size()-1);
				}
			}
			
		}
		System.out.println(Math.abs(t1-t2));
	}

}
