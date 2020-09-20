public class main {
    public static void main(String[] args) {
        Student uet_student = new Student("Nguyen Van An", "17020001", "K62CC", "uet@vnu.edu.vn");
        String result = uet_student.getInfo();
        System.out.println(result + "\n");

        Student[] students = new Student[6];
        students[0] = new Student("TA", "17020111", "K32CCG", "vnu@mail.com");
        students[1] = new Student("TB", "17020112", "K32CCC", "vnu@mail.com");
        students[2] = new Student("TC", "17020113", "K32CCE", "vnu@mail.com");
        students[3] = new Student("TA", "17020114", "K32CCE", "vnu@mail.com");
        students[4] = new Student("TD", "17020115", "K32CCG", "vnu@mail.com");
        students[5] = new Student("TG", "17020116", "K32CCC", "vnu@mail.com");
        StudentManagement studentManagement = new StudentManagement();
        studentManagement.removeStudent("17020113");
        studentManagement.removeStudent("17020116");
        System.out.println(studentManagement.studentsByGroup());
    }
}
