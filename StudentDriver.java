package Student;

import java.util.Scanner;

public class StudentDriver {

	Student s;
	Student[] s1 = new Student[5];
	Scanner sc = new Scanner(System.in);

	public void addStudent() {
		for (int i = 0; i < s1.length; i++) {
			if (s1[i] == null) {
				System.out.println("Enter ID Number");
				int id = sc.nextInt();
				System.out.println("Enter Student Name");
				String name = sc.next();
				s = new Student(id, name);
				s1[i] = s;
				System.out.println("Student Added Successfully.");
				return;
			}
		}
		System.out.println("Database is Full.");

	}

	public void removeStudent() {
		System.out.println("Enter ID");
		int id = sc.nextInt();
		for (int i = 0; i < s1.length; i++) {
			Student s = s1[i];
			if (s.id == id) {
				s1[i] = null;
				System.out.println("Student is Removed Successfully.");
				return;
			}
		}
		System.out.println("Id is Not Found");
	}

	public void displayStudent() {
		for (int i = 0; i < s1.length; i++) {

			if (s1[i] != null) {
				System.out.println(s1[i]);
			}
		}

	}

	public void searchStudent() {
		System.out.println("Enter id");
		int id = sc.nextInt();//
		for (int i = 0; i < s1.length; i++) {
			if (s1[i] != null) {
				Student s = s1[i];
				if (s.id == id) {
					System.out.println(s.name);
					System.out.println("Marks");
					int[] marks = s.marks;
					for (int j = 0; j < marks.length; j++) {
						System.out.println(marks[j]);
					}
					return;
				}
			}

		}
		System.out.println("Id Is Not Found");
	}

	public void dynamic() {
		System.out.println("1.Pass List 		2.Fail List");
		switch (sc.nextInt()) {
			case 1: {

				for (int i = 0; i < s1.length; i++) {
					int c = 0;
					if (s1[i] != null) {
						Student s = s1[i];
						int[] marks = s.marks;
						for (int j = 0; j < marks.length; j++) {
							if (marks[j] >= 35)
								c++;
						}
						if (c == 5) {
							System.out.println("All Subject Clear Congratulations...:- " + s);
						}
					}
				}
				break;
			}
			case 2: {
				System.out.println(
						"1. 1 Backlog List   2. 2 Backlog List  3. 3 Backlog List   4. 4 BacklogList  5. All Backlog List");
				switch (sc.nextInt()) {

					case 1: {
						for (int i = 0; i < s1.length; i++) {
							int c = 0;
							if (s1[i] != null) {
								Student s = s1[i];
								int[] marks = s.marks;
								for (int j = 0; j < marks.length; j++) {
									if (marks[j] <= 35)
										c++;
								}
								if (c == 1) {
									System.out.println("Failed in One Subject Students :- " + s);
								}
							}
						}
						break;
					}
					case 2: {
						for (int i = 0; i < s1.length; i++) {
							int c = 0;
							if (s1[i] != null) {
								Student s = s1[i];
								int[] marks = s.marks;
								for (int j = 0; j < marks.length; j++) {
									if (marks[j] <= 35)
										c++;
								}
								if (c == 2) {

									System.out.println("Failed in Two Subject" + s);
								}
							}
						}
						break;
					}
					case 3: {
						for (int i = 0; i < s1.length; i++) {
							int c = 0;
							if (s1[i] != null) {
								Student s = s1[i];
								int[] marks = s.marks;
								for (int j = 0; j < marks.length; j++) {
									if (marks[j] <= 35)
										c++;
								}
								if (c == 3) {

									System.out.println("Failed in Three Subject" + s);
								}
							}
						}
						break;
					}
					case 4: {
						for (int i = 0; i < s1.length; i++) {
							int c = 0;
							if (s1[i] != null) {
								Student s = s1[i];
								int[] marks = s.marks;
								for (int j = 0; j < marks.length; j++) {
									if (marks[j] <= 35)
										c++;
								}
								if (c == 4) {

									System.out.println("Failed in Four Subject" + s);

								}
							}
						}
						break;
					}
					case 5: {
						for (int i = 0; i < s1.length; i++) {
							int c = 0;
							if (s1[i] != null) {
								Student s = s1[i];
								int[] marks = s.marks;
								for (int j = 0; j < marks.length; j++) {
									if (marks[j] <= 35)
										c++;
								}
								if (c == 5) {

									System.out.println("Failed in ALL Subject" + s);
								}
							}
						}
						break;
					}

				}
			}
		}

	}
}