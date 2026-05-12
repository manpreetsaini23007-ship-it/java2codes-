class transport{
    void move(){
        System.out.println("Transport moves");
    }
    void fuel(){
        System.out.println("Transport uses fuel");
    }
}
class bus extends transport{
    void move(){
        System.out.println("bus moves on road");
    }
    void fuel(){
        System.out.println("bus consumes diesel");
    }
}
class train extends transport{
    void move(){
        System.out.println("train moves on track");
    }
    void fuel(){
        System.out.println("train consumes coal");
    }
}
class aeroplane extends transport{
    void move(){
        System.out.println("aeroplane moves in air");
    }
    void fuel(){
        System.out.println("aeroplane consumes aviation fuel");
    }
}
public class overriding{
    public static void main(String[] args){
        transport t1 = new bus();
        t1.move();
        t1.fuel();

        transport t2 = new train();
        t2.move();
        t2.fuel();

        transport t3 = new aeroplane();
        t3.move();
        t3.fuel();  
    }
}
