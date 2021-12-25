package People;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {

        Teacher teacher = new Teacher();
        teacher.course = "math";
        teacher.sCount = 2;

        Student student01 = new Student();
        student01.scoremap.put("math", 98);
        student01.s_id = 01;
        student01.name = "lisi";

        Student student02 = new Student();
        student02.scoremap.put("math", 80);
        student02.s_id = 02;
        student02.name = "dann";

        teacher.studentList[0] = student01;
        teacher.studentList[1] = student02;


        System.out.println("平均分： " + teacher.get_Avarage());
//        System.out.println(teacher.studentList[0].scoremap.get(teacher.course));
    }

}
