import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = Integer.parseInt(sc.nextLine());
		String[] arr = new String[n];
		
		for(int i = 0; i < n; i++) {
			arr[i] = sc.nextLine();
		}
		
		Arrays.sort(arr, (a, b) -> {
			if(a.length() == b.length()) return a.compareTo(b);
			return a.length() - b.length();
			});
		
		List<String> list = new ArrayList<>();

		for (String c : arr) {
		    if (!list.contains(c)) {
		        list.add(c);
		        System.out.println(c);
		    }
		}
	}

}
