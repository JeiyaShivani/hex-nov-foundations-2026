import java.util.ArrayList;
import java.util.List;

public class Course {
    int id;
    String name;
    int fees;

    Course(int id, String name, int fees){
        this.id=id;
        this.name=name;
        this.fees=fees;
    }

    @Override
    public String toString() {
        return "The course{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", fee=" + fees +
                '}';
    }
}
