package collections;

import java.util.ArrayList;
import java.util.List;
class Person{
    String name;
    long phNo;

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", phNo=" + phNo +
                '}';
    }

    public Person(String name, long phNo){
        this.name=name;
        this.phNo=phNo;
    }
}
public class Arraylist {
    static List<Integer> list=new ArrayList<>();
    public static void main(String[] args) {
        list.add(1);
        list.add(2);
        for(int i:list){
            System.out.println(i);
        }
        Person p1=new Person("kumar Swamy",93936945121L);
        Person p2=new Person("sasi",941541155774L);
        List<Person> personList=new ArrayList<>();
        personList.add(p1);
        personList.add(p2);
        for(Person p:personList){
            System.out.println(p);
        }

    }


}
