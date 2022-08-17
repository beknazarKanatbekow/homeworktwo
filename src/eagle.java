public class eagle extends animals{
    private int height;
    public eagle(int speed, int height) {
        super(speed);
        this.height = height;
    }

    public int getHeight() {
        return height;
    }
    @Override
    public void print(){
        System.out.println(getInfo() + "\nheight:" + height);
    }
}
