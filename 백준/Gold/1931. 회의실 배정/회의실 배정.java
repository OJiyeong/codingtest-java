import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class Main {

	public static void main(String[] args) {
//		System.out.println("실행됨");

		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();

		int[][] meeting = new int[n][2];

		for (int i = 0; i < n; i++) {
			meeting[i][0] = sc.nextInt();
			meeting[i][1] = sc.nextInt();
		}

		Arrays.sort(meeting, (a, b) -> {
			if (a[1] == b[1])
				return a[0] - b[0];
			return a[1] - b[1];
		});

		int cnt = 0;
		int endTime = 0;

		for (int i = 0; i < meeting.length; i++) {
			if (endTime <= meeting[i][0]) {
				endTime = meeting[i][1];
				cnt++;
			}
		}
		System.out.println(cnt);
	}

}
