
public class StudentInfoApplication {
	GenerateGradeReport report = new GenerateGradeReport();
	Subject korean;
	Subject math;
	School mySchool = School.getInstance();

	public static void main(String[] args) {
		StudentInfoApplication test = new StudentInfoApplication();
		test.createSubject();
		test.createStudent();

	}

	public void createSubject() {

		korean = new Subject("국어", Define.KOREAN);
		math = new Subject("수학", Define.MATH);

		mySchool.addSubjectList(korean);
		mySchool.addSubjectList(math);
		
	}

	public void createStudent() {
		Student student1 = new Student(10001, "김성현", korean);
		Student student2 = new Student(10002, "정민구", math);
		Student student3 = new Student(10003, "신정호", korean);
		Student student4 = new Student(10004, "김은애", math);
		Student student5 = new Student(10005, "김용수", korean);

		mySchool.addStudentList(student1);
		mySchool.addStudentList(student2);
		mySchool.addStudentList(student3);
		mySchool.addStudentList(student4);
		mySchool.addStudentList(student5);

		korean.addStudentList(student1);
		korean.addStudentList(student2);
		korean.addStudentList(student3);
		korean.addStudentList(student4);
		korean.addStudentList(student5);

		math.addStudentList(student1);
		math.addStudentList(student2);
		math.addStudentList(student3);
		math.addStudentList(student4);
		math.addStudentList(student5);

		addScoreForStudent(student1, korean, 96);
		addScoreForStudent(student1, math, 100);
		
		addScoreForStudent(student1, korean, 92);
		addScoreForStudent(student1, math, 84);
		
		addScoreForStudent(student1, korean, 91);
		addScoreForStudent(student1, math, 81);
		
		addScoreForStudent(student1, korean, 76);
		addScoreForStudent(student1, math, 56);
		
		addScoreForStudent(student1, korean, 37);
		addScoreForStudent(student1, math, 99);
		
		
	}

	public void addScoreForStudent(Student student, Subject subject, int point) {
		Score score = new Score(student.getStudentId(), subject, point);
		student.addSubjectScore(score);
	}
	
}
