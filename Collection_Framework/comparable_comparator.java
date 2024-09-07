package Collection_Framework;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Comparator;

class student implements Comparable<student>
{
	String name;
	int roll;
	public student(String name,int roll) {
		this.name=name;
		this.roll=roll;
	}
	@Override
	public int compareTo(student o) {
		return this.roll-o.roll;
	}
	
	@Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", rollNo=" + roll +
                '}';
    }
	
	
}
class sortbyname implements Comparator<student>{
	public int compare(student a,student b) {
		return a.name.compareTo(b.name);
	}
}
public class comparable_comparator {

	public static void main(String[] args) {
		 List<student> list = new ArrayList<>();

	        list.add(new student("varun", 2));
	        list.add(new student("Ramesh", 4));
	        list.add(new student("Shivam", 3));
	        System.out.println(list);
	        Collections.sort(list);
	        System.out.println(list);
	        
	        Collections.sort(list, new sortbyname());
	        System.out.println(list);
	        
	        
		
	}

}
