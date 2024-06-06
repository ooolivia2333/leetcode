
import java.util.Arrays;

public class countDaysWithoutMeetings {
    public int countDays(int days, int[][] meetings) {
        Arrays.sort(meetings, (a, b) -> Integer.compare(a[0], b[0]));
        int curr = 1;
        int ans = 0;
        for (int i = 0; i < meetings.length; i++) {
            if (meetings[i][1] < curr) continue;
            if (meetings[i][0] > curr) ans += meetings[i][0] - curr;
            curr = meetings[i][1]+1;
        }
        if (curr <= days) ans += days - curr + 1;
        return ans;
    }

    public static void main(String[] args) {
        int[][] meetings = new int[][]{{3, 49}, {23, 44}, {21, 56}, {26, 55}, {23, 52}, {2, 9}, {1, 48}, {3, 31}};
        countDaysWithoutMeetings countDaysWithoutMeetings = new countDaysWithoutMeetings();
        System.out.println(countDaysWithoutMeetings.countDays(57, meetings));
    }
}
