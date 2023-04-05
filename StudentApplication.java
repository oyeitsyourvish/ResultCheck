package Student;

import java.util.Scanner;

public class StudentApplication {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		StudentDriver sd = new StudentDriver();
		for (;;) {
			System.out.println(
					"1.Add Student  2.Remove Student  3.Display  4.Search Student  5.Check Pass Failed List     6.exit");
			switch (sc.nextInt()) {
				case 1: {
					sd.addStudent();
					break;
				}
				case 2: {
					sd.removeStudent();
					break;
				}
				case 3: {
					sd.displayStudent();
					break;
				}
				case 4: {
					sd.searchStudent();
					break;
				}
				case 5: {
					sd.dynamic();
					break;
				}
				case 6: {
					System.err.println("Appication is closed");
					return;
				}

			}
		}
	}

}