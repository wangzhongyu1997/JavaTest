/**
 * Created by chuntiao on 17-1-19.
 */
public class Child extends Base {
    String name;
    String a;

    Child()
    {
        this.name="Child heiheihei";
        this.a="you you you";
    }
    @Override
    void speak() {
       System.out.println("Hello from child");
    }
}
