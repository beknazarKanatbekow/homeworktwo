public class Main {
    public static void main(String[] args) {
        printable print[] = {createObject("oneObject"), createObject("twoObject"), createObject("threeObject")};
        for (printable printable: print){
            printable.print();
        }
    }

    public static printable createObject(String className) {
        switch (className) {
            case "oneObject":
                eagle eagle = new eagle  (  112, 150);
                return eagle;

            case "twoObject":
                tiger tiger = new tiger(65, 12);
                return tiger;

            case "threeObject":
                lion lion = new lion(85, "Panthera leo persica");
                return lion;
        }
        return null;
    }
}