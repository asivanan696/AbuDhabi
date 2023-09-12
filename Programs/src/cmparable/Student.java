package cmparable;

public class Student implements Comparable<Student> {
  int rollno;
  String name;
  int age;
	

	public Student(int rollno,String name,int age) {
		// TODO Auto-generated method stub
		
		
		this.age=age;
		this.name=name;
		this.rollno=rollno;
		
		
		
	}


	


	@Override
	public int compareTo(Student st) {
		// TODO Auto-generated method stub
		
		if(age==st.age)
		return 0;
		else if(age>st.age)
			return 1;
		else
			return -1;
	}



}
