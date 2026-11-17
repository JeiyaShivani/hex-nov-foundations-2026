import java.util.ArrayDeque;
import java.util.Queue;

public class Assign5 {
    public static void main(String[] args) {
        String[] learners={"a","b","c","d","e"};
        String[] batch=new String[3];//null

        Queue<String> waitlist=new ArrayDeque<>();

        for(int i=0;i<3;i++){
            if(batch[i]==null){
                batch[i]=learners[i];
            }
        }
        if(learners.length>3){
            for(int i=3;i<learners.length;i++) {
                waitlist.add(learners[i]);
            }
        }




    }
}
