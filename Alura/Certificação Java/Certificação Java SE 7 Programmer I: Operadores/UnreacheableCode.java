public class UnreacheableCode {
    public int metodo(){
        if(x > 200){
            return 10;
        }
        throw new RuntimeException();

        if(false){
            return 10;
        }
        throw new RuntimeException();
    }
}
