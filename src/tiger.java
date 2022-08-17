public class tiger extends animals{
    private int year;
    public tiger(int speed, int year) {
        super(speed);
        this.year = year;
    }
    public int getYear(){
        return year;
    }
    @Override
    public void print(){
        System.out.println(getInfo() + "\nyear:" + year);
    }
}
