public class TaskScheduler {
    public static void main(String[] args) {
        char tasks[] = {'A', 'A', 'A', 'A', 'A', 'A', 'B', 'C', 'D', 'E', 'F', 'G'};
        int K = 2;
        int res = leastInterval(tasks.length , K , tasks);
        System.out.println(res);
    }

    static int leastInterval(int n, int K, char tasks[]) {
        int[] arr = new int[26];

        for (int i = 0; i < n; i++)
            arr[tasks[i] - 'A']++;

        int max = arr[0], ind = 0;

        for (int i = 1; i < 26; i++)
            if (max < arr[i]) {
                max = arr[i];
                ind = i;
            }

        int idle_time = (max - 1) * K;

        for (int i = 0; i < 26; i++) {
            if (i == ind)
                continue;
            idle_time -= Math.min(max - 1, arr[i]);
        }

        idle_time = Math.max(0, idle_time);

        return idle_time + n;
    }
}
