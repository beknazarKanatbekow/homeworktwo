public class animals implements printable {
    private int speed;

    public animals(int speed){
        this.speed = speed;
    }
    public String getInfo(){
        return "speed" + speed;
    }
    @Override
    public void print(){

    }
}
