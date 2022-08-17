public class lion extends  animals{
    private String breed;
    public lion(int speed, String breed) {
        super(speed);
        this.breed = breed;
    }
    public String getBreed(){
        return breed;
    }
    @Override
    public void print(){
        System.out.println(getInfo() +"\nbreed:" + breed);
    }
}

