//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Test test=new Test();
        test.run();
        for (int i=0;i<100000;i++){
            System.out.println("hello ");
        }
        System.out.println(Thread.currentThread().getName());
        System.out.println("hello chen singh how are u");
        System.out.println("are you done work");
    }
}