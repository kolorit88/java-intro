
public class palindrom {

    public static void main(String[] args) {
        System.out.println(is_pal("a roza ypala na lapy azora".replaceAll(" ", "")));


    }


    public static boolean is_pal(String var){
        String variable = var;

        boolean flag = true;
        for (int i = 1; i <= variable.length(); i++){
            if (variable.charAt(variable.length() - i) != variable.charAt(i - 1)){
                flag = false;
                break;
            }

        }
        return flag;

    }


}
