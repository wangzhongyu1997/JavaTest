/**
 * Created by chuntiao on 17-1-19.
 */
public class MainDo {
    public static void main(String[]arg)
    {
        Base base=new Base();
        Child child=new Child();



        System.out.println("base.speak() :");
        base.speak();
        System.out.println("child.speak() :");
        child.speak();

        System.out.println("name in base:"+base.name);
        System.out.println("name in child:"+child.name);
        base=child;
        System.out.println("name in base after  base=child; :"+base.name);

        base=(Base)child;
        System.out.println("name in base after  base=(Base)child; :"+base.name);
        System.out.println("base.speak()  after  base=(Base)child;:");//
        base.speak();
    }
}
