import java.util.Scanner;
import java.util.Stack;
public class Assignment4 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        Stack<String> learners =new Stack<>();
        boolean x=true;
        while (x) {
            System.out.println("1 Enroll learner");
            System.out.println("2 Undo last enrollment");
            System.out.println("3 Show last enrollment");
            System.out.println("4 Exit");
            System.out.print("Enter your choice: ");
            int choice =sc.nextInt();
            sc.nextLine();
            switch (choice) {
                case 1:
                    System.out.println("Enter learner name ");
                    String name = sc.nextLine();
                    learners.push(name);
                    System.out.println("Enrolled " + name);
                    break;
                    case 2:
                        if (learners.isEmpty()) {
                            System.out.println("undo not possible.");
                            }
                        else {
                            String undone = learners.pop();
                            System.out.println("Undone: " + undone);
                        }
                        break;
                   case 3:
                       if (learners.isEmpty()) {
                           System.out.println("list empty");
                       }
                       else {
                           System.out.println("Last enrollment: " + learners.peek());
                       }
                       break;
                   case 4:
                       System.out.println("Exiting");
                       x= false;
                       break;
                        default:
                            System.out.println("Invalid choice");
                    }
                }

            }
        }


