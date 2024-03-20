
package Inheritance;
import java.util.*;
class account{
    protected long accno;
    protected double accbalance;
    protected String accholder;

    public account(long accno, double accbalance, String accholder)
    {
        this.accno = accno;
        this.accbalance = accbalance;
        this.accholder = accholder;
    }

}
class Savingsacc extends account{

    public Savingsacc(long accno, double accbalance, String accholder) {
        super(accno, accbalance, accholder);

    }

   public void calculateinterest(int noofyears,double ROI){
        double interest= (accbalance*noofyears*ROI)/100;
        System.out.println("the interest amt is "+interest);
    }

}

class currentsacc extends account{

    public currentsacc(long accno, double accbalance, String accholder) {
        super(accno, accbalance, accholder);
    }

    public void overdraft( double overdraftROI){
        double overdraftinterest= (accbalance*overdraftROI)/365;
        System.out.println("the overdraft interest amt is "+overdraftinterest);
    }

}
public class Onlinebankingsystem {
    public static void main(String[]args){
        Savingsacc savacc=new Savingsacc(123456,540000.45,"Joey");
        savacc.calculateinterest(2,7.4);
        currentsacc curr=new currentsacc(123456,540000.45,"Joey");
        curr.overdraft(8.2);

    }
}
