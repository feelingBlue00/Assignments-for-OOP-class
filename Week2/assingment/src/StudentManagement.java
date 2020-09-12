public class StudentManagement {
    private Student[] students = new Student[100];
    private int index = 0;

    public StudentManagement(Student[] students, int index) {
        this.students = students;
        this.index = index;
    }

    public static boolean sameGroup(Student s1, Student s2) {
        if (s1.getGroup().equals(s2.getGroup())) {
            return true;
        }
        return false;
    }

    public void addStudent(Student newStudent) {
        if (index < students.length) {
            students[index] = newStudent;
            index++;
        }
    }

    public String studentsByGroup() {
        String result = "";
        for (int i = 0; i < index; i++) {
            if (result.indexOf(students[i].getGroup()) == -1) {
                result += students[i].getGroup() + "\n" + students[i].getInfo() + "\n";
                for (int j = i + 1; j < index; j++) {
                    if (sameGroup(students[i], students[j])) {
                        result += students[j].getInfo() + "\n";
                    }
                }
            }
        }
        return result;
    }

    public void removeStudent(String id) {
        for (int i = 0; i < index; i++) {
            if (id.equals(students[i].getId())) {
                if (i == index-1) {
                    students[i] = null;
                } else {
                    students[i] = students[i + 1];
                    for (int j = i; j < index - 1; j++) {
                        students[j] = students[j + 1];
                    }
                }
                index--;
                break;
            }
        }
    }

    public void display(Student[] students) {
        for (int i = 0; i < index; i++) {
            System.out.println(students[i].getInfo());
        }
    }
}
