public class main {
    public static void main(String[] args) {
        Student[] students = new Student[6];
        students[0] = new Student("TA", "17020111", "K32CCG", "mail.com");
        students[1] = new Student("TA", "17020112", "K32CCC", "mail.com");
        students[2] = new Student("TA", "17020113", "K32CCE", "mail.com");
        students[3] = new Student("TA", "17020114", "K32CCE", "mail.com");
        students[4] = new Student("TA", "17020115", "K32CCG", "mail.com");
        students[5] = new Student("TA", "17020116", "K32CCC", "mail.com");
        StudentManagement studentManagement = new StudentManagement(students, students.length);
        studentManagement.removeStudent("17020113");
        studentManagement.removeStudent("17020116");
        System.out.println(studentManagement.studentsByGroup());
    }
}
