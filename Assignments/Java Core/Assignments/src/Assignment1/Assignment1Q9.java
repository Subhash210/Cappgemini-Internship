package Assignment;

public class Assignment1Q9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s1 = new Student(10,20,30);
		Student s2 = new Student(10,20,30);
		Student s3 = new Student(10,20,30);
		
		Student[] students = {s1,s2,s3};
		Student student = new Student();
		
		int[] marksA=new int[3];
		for(int i=0;i<students.length;i++) {
			marksA[i]=10;
		}
		int[] marksB=new int[3];
		for(int i=0;i<students.length;i++) {
			marksB[i]=20;
		}
		int[] marksC=new int[3];
		for(int i=0;i<students.length;i++) {
			marksC[i]=30;
		}
		System.out.println(student.studentsTotalMarksInAllSubjects(students));
		System.out.println(student.studentsAverageMarksInAllSubjects(students));
		System.out.println(student.subjectATotalByStudents(marksA));
		System.out.println(student.subjectAAverageByStudents(marksA));
		System.out.println(student.subjectBTotalByStudents(marksB));
		System.out.println(student.subjectBAverageByStudents(marksB));
		System.out.println(student.subjectCTotalByStudents(marksC));
		System.out.println(student.subjectCAverageByStudents(marksC));
	}

}

class Student {
    private int subjectA,subjectB,subjectC;
    

    public Student(int subjectA, int subjectB, int subjectC) {
		super();
		this.subjectA = subjectA;
		this.subjectB = subjectB;
		this.subjectC = subjectC;
	}
    

	public Student() {}


	public int getSubjectA() {
		return subjectA;
	}


	public void setSubjectA(int subjectA) {
		this.subjectA = subjectA;
	}


	public int getSubjectB() {
		return subjectB;
	}


	public void setSubjectB(int subjectB) {
		this.subjectB = subjectB;
	}


	public int getSubjectC() {
		return subjectC;
	}


	public void setSubjectC(int subjectC) {
		this.subjectC = subjectC;
	}


	public int studentsTotalMarksInAllSubjects(Student[] students) {
    	int totalmarks=0;
    	for(int i=0;i<students.length;i++) {
    		totalmarks =totalmarks+students[i].subjectA+students[i].subjectB+students[i].subjectC;
    	}
    	return totalmarks;
    }

    public double studentsAverageMarksInAllSubjects(Student[] students) {
    	int avgmarks =0;
    	for(int i=0;i<students.length;i++) {
    		avgmarks =avgmarks+students[i].subjectA+students[i].subjectB+students[i].subjectC;
    	}
    	return avgmarks/3;
    }
    public int[] subjectWiseMarks(Student[] students,String subjectName) {
    	int arr[] = new int[3];
    	if(subjectName.equals(subjectA)) {
    		for(int i=0;i<students.length;i++) {
    			arr[i]=students[i].subjectA;
    		}
    	}
    	else if(subjectName.equals(subjectB)) {
    		for(int i=0;i<students.length;i++) {
    			arr[i]=students[i].subjectB;
    		}
    	}
    	else {
    		for(int i=0;i<students.length;i++) {
    			arr[i]=students[i].subjectC;
    		}
    	}
    	return arr;
    }
    public int subjectATotalByStudents(int[] marks) {
    	int total = 0;
    	for(int i=0;i<marks.length;i++) {
    		total+=marks[i];
    	}
    	return total;
    }
    public int subjectBTotalByStudents(int[] marks) {
    	int total = 0;
    	for(int i=0;i<marks.length;i++) {
    		total+=marks[i];
    	}
    	return total;
    }
    public int subjectCTotalByStudents(int[] marks) {
    	int total = 0;
    	for(int i=0;i<marks.length;i++) {
    		total+=marks[i];
    	}
    	return total;
    }

   public int subjectTotalByStudents(int[] marks) {
	   int sum=0;
	   for(int i=0;i<marks.length;i++) {
		   sum+=marks[i];
	   }
	   return sum;
   }

    public double subjectAAverageByStudents(int[] marks) {
    	int total =0;
    	for(int i=0;i<marks.length;i++) {
    		total+=marks[i];
    	}
    	return total/3;
    }
    public double subjectBAverageByStudents(int[] marks) {
    	int total =0;
    	for(int i=0;i<marks.length;i++) {
    		total+=marks[i];
    	}
    	return total/3;
    }
    public double subjectCAverageByStudents(int[] marks) {
    	int total =0;
    	for(int i=0;i<marks.length;i++) {
    		total+=marks[i];
    	}
    	return total/3;
    }

}