import java.sql.SQLOutput;

public class Inheritence {

    public static void main(String[] args) {
        Children c=new Children();
        System.out.println("Parent...");
        System.out.println(c.pName);
        System.out.println(c.pNo);
        System.out.println("child..");
        System.out.println(c.cNo);
        System.out.println(c.cName);
        System.out.println();
        Parent p=new Parent();
        System.out.println(p.pNo);
        System.out.println(p.pName);
    }
}
class Children extends Parent{
     int cNo=1;
     String cName="child";
}
class Parent{
     int pNo=1;
     String pName="Parent";
}
