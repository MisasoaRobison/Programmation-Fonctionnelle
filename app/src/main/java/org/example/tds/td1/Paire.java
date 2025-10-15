// Misasoa ROBISON - 45009085

public class Paire <T,V>{  
    private T x; 
    private V y;

    public Paire (T x, V y){
        this.x = x;
        this.y = y;
    }
    public T fst(){
        return x;
    }

    public V snd(){
        return y;
    }

    public <Y> Paire <Y, V> changeFst(Y valueY){
        return new Paire<>(valueY, this.y);
    }

    public <Z> Paire <T, Z> changeSnd(Z valueZ){
        return new Paire<>(this.x, valueZ);
    }

    @Override
    public String toString(){
        String response;
        String typeFst = (x != null) ? x.getClass().getSimpleName() : "null";
        String typeSnd = (y != null) ? y.getClass().getSimpleName() : "null";
        response = "(" + x + ", " + y + ") :: Paire[" + typeFst + ", " + typeSnd + "]";
        return response;
    }

    public static void main(String[] args) {
        Paire <Integer, String> p1= new Paire<>(1, "un");
        Paire <Double, String> p2 = p1.changeFst(1.0);
        Paire <Double, Paire<Integer, String>> p3 = p2.changeSnd(p1);
        System.out.println(p1);
        System.out.println(p2);
        System.out.println(p3);

    }

}