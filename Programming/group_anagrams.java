package accenture;
import java.util.*;
public class group_anagrams {

	public static void main(String[] args) {
		String[] input= {"eat","tea","tan","ate","nat","bat"};
		
		HashMap<String,ArrayList<String>> hm=new HashMap<>();
		for(int i=0;i<input.length;i++) {
			String xy=input[i];
			char[] cx=xy.toCharArray();
			Arrays.sort(cx);
			String x=new String(cx);
			if(!hm.containsKey(x)) {
				hm.put(x, new ArrayList<String>());
			}
			hm.get(x).add(input[i]);
		}
		System.out.println(new ArrayList<>(hm.values()));
		/*ArrayList<ArrayList<String>> res=new ArrayList<>();
		for(int i=0;i<input.length;i++) {
			HashSet<Character> hs=new HashSet<>();
			ArrayList<String> sr=new ArrayList<>();
			sr.add(input[i]);
			for(int j=0;j<input[i].length();j++) {
				hs.add(input[i].charAt(j));
			}
			for(int k=i+1;k<input.length;k++) {
				boolean ch=true;
				for(int m=0;m<input[k].length();m++) {
					if(!hs.contains(input[k].charAt(m))) {
						ch=false;
						break;
					}
				}
				if(ch) {
					sr.add(input[k]);
					int c=k;
					for(int n=k;n+1<input.length && input[n].length()!=0;n++) {
						input[n]=input[n+1];
						c++;
					}
					input[c]="";
				}
			}
			res.add(sr);
		}
		System.out.println(res);*/
	}

}
