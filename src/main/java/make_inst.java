
public class make_inst {

    public static void main(String[] args) {
        System.out.println(reverser("make install"));
    }
    public static String reverser(String variable) {
        String tmp = "";
        for (int i = 1; i <= variable.length(); i++){
            tmp += variable.charAt(variable.length() - i);
        }
        return tmp;
    }

}
