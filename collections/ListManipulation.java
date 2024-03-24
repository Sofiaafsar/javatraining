package Collections;
import java.util.*;


class operations{
   private List<Integer>list;
    Scanner scanner=new Scanner(System.in);
    public List<Integer> getList() {
        return list;
    }

    public void setList(List<Integer> list) {
        this.list = list;
    }

    public operations(List<Integer> list) {
        this.list = list;
    }

    public void addelement(){

        int i = 0;
        while(i<10){
            System.out.println("Enter the Element");
            Integer ele= scanner.nextInt();
            list.add(ele);
            i++;
        }


   }
   public void  removeelement(){
       System.out.println("Enter the Element to be removed ");
        Integer ele=scanner.nextInt();
        list.remove(ele);
   }
   public Integer index(int target){
        for(int i=0;i < list.size();i++){
            if(list.get(i) ==target){
                System.out.println("The element is present in the index "+i);
                return i;
            }
        }

        return -1;
   }
   public void display(){
       System.out.println("The Elements in the List are ");
        for(int i=0;i< list.size();i++){
            System.out.println(list.get(i));
        }
   }

}
public class ListManipulation {
    public static void main(String[]args) {


        operations op = new operations(new ArrayList<>());
        op.addelement();
        op.removeelement();
        op.index(2);
        op.display();

    }

}
