import java.util.*;

public class Main {

	public static void main(String[] args) {
//		System.out.println("입력\n");
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		
		PriorityQueue<Integer> pQ = new PriorityQueue<>((a, b) -> {
			int absA = Math.abs(a);
			int absB = Math.abs(b);
			if (absA == absB) return  a - b;
			return absA - absB;
		});
		
		for(int i = 0; i < n; i++) {
			int num = sc.nextInt();
			sc.nextLine();
			
			if(num != 0) pQ.offer(num);
			else {
				if(!pQ.isEmpty()) System.out.println(pQ.poll());
				else System.out.println(0);
			}
		}
		
//		System.out.println("종료");
	}
}
