import java.util.ArrayList;

public class School {
	static School instance = new School();

	ArrayList<Student> studentList = new ArrayList<>();
	ArrayList<Subject> subjectList = new ArrayList<>();

	public static School getInstance() {
		if (instance == null) {
			instance = new School();
		} return instance;
	}
	
	public void addSubjectList(Subject subject) {
		subjectList.add(subject);
	}

	public void addStudentList(Student student) {
		studentList.add(student);
	}

	public ArrayList<Student> getStudentList() {
		return studentList;
	}



	public ArrayList<Subject> getSubjectList() {
		return subjectList;
	}

	public void setSubjectList(ArrayList<Subject> subjectList) {
		this.subjectList = subjectList;
	}

}
