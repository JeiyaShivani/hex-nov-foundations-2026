//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Assignment3 {
    public static void main(String[] args) {
        int[] attendance= {80,88,98,76,89,91,93,82,87,92};
        int[] dp=new int[10];
        dp[0]=attendance[0];

        for (int i = 2; i <dp.length; i++) {
            dp[i]=dp[i-1]+attendance[i];
        }
        System.out.println("Attendance from day 3 to day 7"+(dp[6]-dp[1]));

        int high = attendance[0];
        for (int i = 1; i < attendance.length;i++) {
            if (attendance[i] > high) {
                high =attendance[i];
            }
        }
        System.out.println("Highest Attendance:"+high);

    }
}