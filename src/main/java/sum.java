
public class sum {

    public static void main(String[] args) {
        System.out.println(sum_method());
    }

    public static float sum_method(){
        float sum = 0, member;
        float n = 2;

        while (true){
            member = 1/(n*n + n - 2);
            if (member < 0.000001){
                break;
            }
            sum += member;
            n += 1;
        }
        return sum;
    }
}