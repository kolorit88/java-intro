
public class sum {

    public static void main(String[] args) {


        float sum = 0, member;
        float n = 2;

        while (true){
            member = 1/(n*n + n - 2);
            System.out.println(member);
            if (member < 0.000001){
                break;
            }
            sum += member;
            n += 1;
        }
        System.out.println(sum);
    }
}