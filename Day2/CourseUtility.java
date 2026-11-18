import java.util.Comparator;

public class CourseUtility implements Comparator<Course> {

    String direction;
    String str;

    CourseUtility(String direction){
        this.direction=direction;
    }



    public int compare(Course a,Course b) {
        if(direction.equals("ascending")){
            if(a.fees > b.fees){
                return 1;
            }
            else  if(a.fees < b.fees){
                return -1;
            }
            else{
                return 0;
            }
        }
        else{
            if(a.fees < b.fees){
                return 1;
            }
            else if(a.fees > b.fees){
                return -1;
            }
            else {
                return 0;
            }
        }
    }

}
