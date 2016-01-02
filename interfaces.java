// Interfaces

interface Driveable {
    boolean startEngine();
    void stopEngine();
    float accelerate(float acc);
    boolean turn(String dir);
}

// Class AutoMobile
class AutoMobile implements Driveable {
    public boolean startEngine() {
        System.out.println("Automobile Engine started.");
        return true;
    }

    public void stopEngine() {
        System.out.println("Automobile Engine stopped.");
    }

    public float accelerate(float acc) {
        System.out.println("Engine accelerated.");
        return (float) 1.0;
    }

    public boolean turn(String dir) {
        System.out.println("Automobile turned.");
        return true;
    }

    public void wash() {
        System.out.println("Automobile washed.");
    }
}

// Class - LawnMower
class LawnMower implements Driveable {
    public boolean startEngine() {
        System.out.println("LawnMower Engine started.");
        return true;
    }

    public void stopEngine() {
        System.out.println("LawnMower Engine stopped.");
    }

    public float accelerate(float acc) {
        System.out.println("Engine accelerated.");
        return (float) 1.0;
    }

    public boolean turn(String dir) {
        System.out.println("Automobile turned.");
        return true;
    }
}

class test {
    public static void main(String[] args) {
        AutoMobile auto = new AutoMobile();
        LawnMower  lm = new LawnMower();

        Driveable vehicle;

        vehicle = auto;
        vehicle.startEngine();
        vehicle.stopEngine();

        auto = (AutoMobile)vehicle;
        auto.wash();

        vehicle = lm;
        vehicle.startEngine();
        vehicle.stopEngine();
    }
}