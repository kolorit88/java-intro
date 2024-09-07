
public class palindrom {
    public static void main(String[] args) {

        String variable = "a roza ypala na lapy azora".replaceAll(" ", "");
        boolean flag = true;
        for (int i = 1; i <= variable.length(); i++){
            if (variable.charAt(variable.length() - i) != variable.charAt(i - 1)){
                flag = false;
                break;
            }

        }
        System.out.println(flag);


    }


}
