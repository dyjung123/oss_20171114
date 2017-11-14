import java.util.Iterator;
import java.util.Scanner;
import java.util.Vector;

public class HowtouseVector {
    public static void main(String[] args) {
        int num, sum=0;
        Vector<Integer> vec = new Vector<Integer>();
        Iterator it1;
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.print("강수량 입력 (0 입력시 종료)>> ");
            num = sc.nextInt();
            if (num == 0) break;
            sum += num;
            vec.add(num);
            it1 = vec.iterator();
            while(it1.hasNext()) {
                System.out.print(it1.next() + " ");
            }
            System.out.println("\n현재 평균 " + sum / vec.size());
        }

    }
}
