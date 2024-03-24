package Collections;
import java.util.*;


class studentgrades{
    private Map<String, List<Integer>>mp;
    Scanner scanner=new Scanner(System.in);
    public Map<String, List<Integer>> getMp() {
        
        return mp;
    }

    public void setMp(Map<String, List<Integer>> mp) {
        
        this.mp = mp;
    }

    public studentgrades(Map<String, List<Integer>> mp) {
        
        this.mp = mp;
    }

    public void addelement() {
        int i = 0;
        int j;

        while (i < 3) {
            System.out.println("Enter the name of the student:");
            String str = scanner.next();
            List<Integer> li = new ArrayList<>(); // Create a new list for each student

            j = 0;
            while (j < 5) {
                System.out.println("Enter the element to be added in the list:");
                Integer e = scanner.nextInt();
                li.add(e);
                j++;
            }
            mp.put(str, li); // Add the list to the map with the student's name as key
            i++;
        }
    }
    public void removeelement(){
        System.out.println("Enter the Element to be removed:");
        String str= scanner.next();
        mp.remove(str);

    }
    public void display(){
        System.out.println("The Key Value pairs in the Map are:");
        System.out.println(mp.entrySet());

    }
}
public class Mappopulation {
    public static void main(String[]args){
        studentgrades sg=new studentgrades(new HashMap<>());
        sg.addelement();
        sg.removeelement();
        sg.display();
    }
}
