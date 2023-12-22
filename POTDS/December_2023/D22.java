package December_2023;

import java.util.*;

public class D22 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of meetings: ");
        int N = sc.nextInt();

        int[] S = new int[N];
        int[] F = new int[N];

        System.out.println("Enter the start time of the meetings: ");
        for (int i = 0; i < N; i++) {
            S[i] = sc.nextInt();
        }

        System.out.println("Enter the end time of the meetings: ");
        for (int i = 0; i < N; i++) {
            F[i] = sc.nextInt();
        }

        ArrayList<Integer> ans = maxMeetings(N, S, F);

        System.out.println("The maximum number of meetings that can be held are: ");
        for (int i = 0; i < ans.size(); i++) {
            System.out.print(ans.get(i) + " ");
        }

        sc.close();
    }

    public static ArrayList<Integer> maxMeetings(int N, int[] S, int[] F) {
        ArrayList<meeting> meet = new ArrayList<>();

        for (int i = 0; i < S.length; i++) {
            meet.add(new meeting(S[i], F[i], i + 1));
        }

        Collections.sort(meet, new meetingComparator());

        int limit = meet.get(0).end;

        ArrayList<Integer> ans = new ArrayList<>();

        ans.add(meet.get(0).pos);

        for (int i = 1; i < S.length; i++) {
            if (meet.get(i).start > limit) {
                ans.add(meet.get(i).pos);
                limit = meet.get(i).end;
            }
        }

        Collections.sort(ans);

        return ans;
    }
}

class meeting {
    int start;
    int end;
    int pos;

    meeting(int start, int last, int pos) {
        this.start = start;
        this.end = last;
        this.pos = pos;
    }
}

class meetingComparator implements Comparator<meeting> {
    @Override
    public int compare(meeting o1, meeting o2) {
        if (o1.end < o2.end)
            return -1;
        else if (o1.end > o2.end)
            return 1;
        else if (o1.pos < o2.pos)
            return -1;
        return 1;
    }
}