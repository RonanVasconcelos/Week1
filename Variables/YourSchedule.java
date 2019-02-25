
package Week1.Variables;

public class YourSchedule {
    public static void main(String[] args) {
        String course1 = "English III";
        String course2 = "Precalculus";
        String course3 = "Music Theory";
        String course4 = "Biotechnology";
        String course5 = "Principles of Technology I";
        String course6 = "Latin II";
        String course7 = "AP US History";
        String course8 = "Business Computer Infomation Systems";
        String teacher1 = "Ms. Lapan";
        String teacher2 = "Mrs. Gideon";
        String teacher3 = "Mr. Davis";
        String teacher4 = "Ms. Palmer";
        String teacher5 = "Ms. Garcia";
        String teacher6 = "Mrs. Barnett";
        String teacher7 = "Ms. Johannessen";
        String teacher8 = "Mr. James";

        System.out.println("+-----------------------------------------------------------+");

        String[] nameCourses = {course1, course2, course3, course4, course5, course6, course7, course8};
        String[] nameTeachers = {teacher1, teacher2, teacher3, teacher4, teacher5, teacher6, teacher7, teacher8};

        for (int i = 0; i < nameCourses.length; i++) {
            System.out.println(String.format("|[%d] %36s | %15s |", i+1, nameCourses[i], nameTeachers[i]));
        }

        System.out.println("+-----------------------------------------------------------+");

    }
}





