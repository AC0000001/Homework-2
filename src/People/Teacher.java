package People;

public class Teacher extends People{
    int t_id;
    int sCount;
    String course;

    Student []studentList = new Student[10];//学生们

    boolean is_Choose(int id){
        for(int i = 0; i < studentList.length; i ++)
            if(studentList[i].s_id == id)
                return true;
        return false;
    }

    float get_Avarage(){
        float res = 0;
        for(int i = 0; i < sCount; i ++){
            res += this.studentList[i].scoremap.get(this.course);
        }

        return res / sCount;
    }


}
