package Collections;


import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

class IntSection{
    private Set<Integer> set1;
    private Set<Integer> set2;

    public IntSection(Set<Integer> set1, Set<Integer> set2) {
        this.set1 = set1;
        this.set2 = set2;
    }

    public Set<Integer> getSet1() {
        return set1;
    }

    public void setSet1(Set<Integer> set1) {
        this.set1 = set1;
    }

    public Set<Integer> getSet2() {
        return set2;
    }

    public void setSet2(Set<Integer> set2) {
        this.set2 = set2;
    }
    Scanner scanner=new Scanner(System.in);

    public void addele(){
        System.out.println("Enter the total number elements to be Present in the Set");
        Integer N= scanner.nextInt();
        int i=0;
        while(i<N) {
            System.out.println("Element to be added in set1");
            Integer ele = scanner.nextInt();
            set1.add(ele);
            System.out.println("Element to be added in set2");
            Integer ele1 = scanner.nextInt();
            set2.add(ele1);
            i++;
        }
    }
    public void commonele(){
        System.out.println("The common elements are:");
        set1.retainAll(set2);

        System.out.println(set1);
    }
}
public class Intersection {
    public static void main(String[]args){
        IntSection intSection=new IntSection(new HashSet<>(),new HashSet<>());
        intSection.addele();
        intSection.commonele();

    }
}
