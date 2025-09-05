import java.util.*;

public class Main {

	/*
	static class Arr {
		int age;
		String name;
		
		public Arr(int age, String name) {
			this.age = age;
			this.name = name;
		}
	}
	*/
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = Integer.parseInt(sc.nextLine());
		
		/*
		Arr[] arr = new Arr[n];
		
		for(int i = 0; i < n; i++) {
//			int age = Integer.parseInt(sc.nextLine());
			int age = sc.nextInt();
			String name = sc.nextLine();
			arr[i] = new Arr(age, name);
		}
		
		Arrays.sort(arr, (a, b) -> {
			//if(a.age == b.age) return a.name.compareTo(b.name);
			return a.age - b.age;
		});
		
		for (Arr a : arr) {
            System.out.println(a.age + a.name);
        }
		*/
		
		String[][] arr = new String[n][2];
		
		for(int i = 0; i < n; i++) {
			arr[i][0] = sc.next();
			arr[i][1] = sc.nextLine().trim();
		}
		
		Arrays.sort(arr, (a, b) -> {
			return Integer.parseInt(a[0]) - Integer.parseInt(b[0]);
		});
		
		for(String a[] : arr) {
			System.out.println(a[0] + " " + a[1]);
		}
		
	}

}

