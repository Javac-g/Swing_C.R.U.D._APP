import java.util.ArrayList;
import java.util.List;

public class Service {
    List<Student> datalist = new ArrayList<>();


    public void create(Integer id, String name,String group,Integer M,Integer H,Integer E){
        Student student = new Student();

        student.setName(name);
        student.setGroup(group);
        student.setId(id);
        student.getGrades().setM(M);
        student.getGrades().setH(H);
        student.getGrades().setE(E);
        datalist.add(student);

    }
    public Student read(Integer id){
        for (Student student:datalist){
            if (student.getId().equals(id)){
                return student;
            }
        }
        return null;
    }
    public Student update(Integer Findid, String name,String group,Integer M,Integer H,Integer E,Integer id){
        Student student = read(Findid);

        if (student != null){
            student.setName(name);
            student.setGroup(group);
            student.setId(id);
            student.getGrades().setM(M);
            student.getGrades().setH(H);
            student.getGrades().setE(E);
            return student;
        }
        return null;
    }
    public Integer delete(Integer id){
        int index = -1;
        for (int i = 0; i < datalist.size(); i++){
            if (datalist.get(i).getId().equals(id)){
                index = i;
            }
        }
        if (index != -1){
            datalist.remove(index);
            return index;
        }
        return null;
    }
}
