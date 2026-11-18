import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Course c1=new Course(101,"Java Programming",15000);
        Course c2=new Course(102,"Python Programming",12000);
        Course c3=new Course(103,"Reac Programming",15000);
        Course c4=new Course(104,"Angular Programming",12000);
        Course c5=new Course(105,"SQL Programming",8000);
        List<Course> courses=new ArrayList<>();

        courses.add(c1);
        courses.add(c2);
        courses.add(c3);
        courses.add(c4);
        courses.add(c5);

        System.out.println("Total number of courses: " + courses.size());
        System.out.println();
        System.out.println("Display course list");
        courses.forEach(System.out :: println);
        System.out.println();

        System.out.println("Courses in ascending order by fees : ");
        sortCourses(courses, "ascending");
        System.out.println();

        System.out.println("Courses in descending order by fees : ");
        sortCourses(courses, "descending");
        System.out.println();

    }

    static void sortCourses(List<Course> courses,String direction){
        Collections.sort(courses, new CourseUtility(direction));
        for(Course c : courses){
            System.out.println(c);
        }
    }


}
