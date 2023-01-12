import java.util.ArrayList;
import java.util.List;

public final class Student{
    private List grades=new ArrayList<>();
    String name;

    public Student(String name, List grades) {
        this.name = name;
        for (int i=0;i<grades.size();i++)
        {
            if((int)grades.get(i)>=2 && (int)grades.get(i)<=5)
                grades.add(grades.get(i));
            else throw new IllegalArgumentException("Одна из оценок некорректная");

        }
    }
    public void addGrade(int grade){
        if(grade>=2&&grade<=5) grades.add(grade);
    }

    public String toString() {
        return "Student{" + " grades =" + grades + ", name=" + name + '}';
    }
}
