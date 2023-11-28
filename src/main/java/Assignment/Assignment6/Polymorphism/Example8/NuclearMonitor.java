package Assignment.Assignment6.Polymorphism.Example8;


public class NuclearMonitor {
    static int nowT = 10000;

    public static void main(String[] args) {
        try {
            ReactorMonitor();
            return;
        } catch (TemperatureException e) {
            System.out.println();
            System.out.println(e.getMessage() + ": " + e.getTemperature());
        } finally {
            System.out.println("원자로 셧다운");
        }
    }

    static int Mutation() {
        int amount;
        amount = (int)(Math.random() * 1000);
        return amount;
    }

    static int Control( ) {
        int temp=0;
        switch ((int)(Math.random() * 3)) {
            case 0: temp = -500; 	break;
            case 1: temp = 0; 	break;
            case 2: temp = 500;	break;
        }
        return temp;
    }

    static void ReactorMonitor( ) throws TemperatureException {
        TemperatureException e;
        while (true) {
            if (nowT > 15000) {
                TemperatureException e1 = new TemperatureException();
                e1.setTemperature(nowT);
                throw e1;
            } else if (nowT > 12000) {
                nowT += Control();
                System.out.println("경고: " + nowT);
            } else {
                System.out.println();
                System.out.println("정상: " + nowT);
                nowT += Mutation();
            }
        }
    }
}