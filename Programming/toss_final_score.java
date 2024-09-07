package accenture;

public class toss_final_score {

	public static void main(String[] args) {
		String toss="HTHHTTHTHHHT";
		int score=0,c=0;
		for(int i=0;i<toss.length();i++) {
			if(toss.charAt(i)=='H') {
				score+=2;
				c++;
				if(c==3) {
					break;
				}
			}
			else {
				score=score-1;
				c=0;
			}
		}
		System.out.println(score);
	}

}
