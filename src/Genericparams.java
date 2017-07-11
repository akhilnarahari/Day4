/**
 * Created by narahara on 7/8/2017.
 */
class vehicle{
    String regnum;
    vehicle(String regnum){
        this.regnum=regnum;
        System.out.println(regnum);
    }
}
class insurance{
    int amount;
    insurance(int amount){
        this.amount=amount;
        System.out.println(amount);
    }

}
class gener<M,N>{
    M a;
    N b;
    gener(M a,N b){
        this.a=a;
        this.b=b;
    }
    void prin(){
        System.out.println("successfull");
    }
}
public class Genericparams {
    public static void main(String args[]) {
        vehicle v = new vehicle("762879");
        insurance i = new insurance(7627689);
        gener<vehicle, insurance> g=new gener<>(v,i);
        g.prin();
    }
}
