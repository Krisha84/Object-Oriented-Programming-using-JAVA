import java.util.*;
class Student{
	int id_no;
	int no_of_subjects_registed;
	int[] subject_code;
	int[] subject_credits;
	char[] grade_pbtained;
	double spi;

	public Student(){
		Scanner sc=new Scanneer(System.in);
		System.out.println("Enter ID no : ");
		id_no=sc.nextInt();
		System.out.println("Enter no of subject registed : ");
		no_of_subjects_registed=sc.nextInt();

		subject_code=new int[no_of_subjects_registed];
		subject_credits=new int[no_of_subjects_registed];
		grade_pbtained=new int[no_of_subjects_registed];

		for(int i=0;i<no_of_subjects_registed;i++){
			System.out.println("Enter Subject code for suject : ");
			subject_code[i]=sc.nextInt();
			System.out.println("Enter Subject credits for subject : ");
			subject_credits[i]=sc.nextInt();
			System.out.println("Enter Subject grade pbtained for subject : ");
			grade_pbtained[i]=sc.nextLine();
		}
	}

	public double calculate_spi{
		//logic to calculate spi
		return 0.0;
	}
}
 public class DemoClass{
 	public static void public static void main(String[] args) {
 		Scanner sc=new Scanner(System.in);
 		System.out.println("Enter numer of student : ");
 		int n=sc.nextInt();

 		Student[] students = new Student[n];

 		for(inti=0;i<n;i++){
 			student[i]=new Student();

 		}
 		for(int i=0;i<n;i++){
 			double spi=sc.nextDouble();
 		}
 	}
 }