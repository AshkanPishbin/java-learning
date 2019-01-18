package reflections.week09;

import java.util.List;

public class StudentSummerizer {

    List<Students> studentsList = new StudentReader().getStudents();
public Long displayBoysAndGirls(){
    return studentsList.stream()
            .filter(s->s.getGender()=="boy" )
            .count();

}
}
