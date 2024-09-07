//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class fizzbuzz {
    public static void main(String[] args) {

        for (int i = 1; i < 500; i++){
            if ((i % 5 == 0) && (i % 7 == 0)){
                System.out.println("fizzbuzz");
            }
            else if(i % 5 == 0){
                System.out.println("fizz");
            }
            else if(i % 7 == 0){
                System.out.println("buzz");
            }
            else {
                System.out.println(i);
            }

        }


    }
}