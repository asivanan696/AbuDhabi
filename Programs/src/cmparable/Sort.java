package cmparable;

import java.util.ArrayList;
import java.util.Collections;

public class Sort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Student> al=new ArrayList<Student>();
		al.add(new Student(101,"Vijay",23));
		al.add(new Student(101,"ajay",23));
		al.add(new Student(101,"arun",43));
		Collections.sort(al);
		
		for(Student st:al) {
			System.out.println( st.rollno+" "+st.name+" "+st.age);
		}

	}

}
