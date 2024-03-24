package Interface;


import java.util.Scanner;

interface Libraryitem{
    void borrow(String name);
}
interface Libraryuser{
    void borrow1(Libraryitem libraryitem);
}
class Book implements Libraryitem{
    int ID;

    public Book(int ID) {
        this.ID = ID;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    @Override
    public void borrow(String name) {
        System.out.println("The Book with id "+ID+" has been borrowed by "+name);
    }
}
class DVD implements Libraryitem{
    int ID;

    public DVD(int ID) {
        this.ID = ID;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    @Override
    public void borrow(String name) {
        System.out.println("The DVD with id "+ID+" has been borrowed by "+name);
    }
}
class Librarymember implements Libraryuser{
    String name="Riya";
    @Override
    public void borrow1(Libraryitem libraryitem) {
        libraryitem.borrow(name);
    }
}
public class Library {
    public static void main(String[]args){
        Book bks=new Book(101);
        bks.borrow("Sofia");
        DVD dvd=new DVD(102);
        Librarymember lm=new Librarymember();
        lm.borrow1(bks);
        lm.borrow1(dvd);
    }
}

