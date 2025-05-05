                                                                         CODE 1
interface Display {
    void show();
}

interface Aircraft extends Display {
    String aircraftType();
    int calculateCapacity();
}

class PassengerJet implements Aircraft {
    private int rows;
    private int seatsPerRow;

    public PassengerJet(int rows, int seatsPerRow) {
        this.rows = rows;
        this.seatsPerRow = seatsPerRow;
    }

    public String aircraftType() {
        return "Passenger Jet";
    }

    public int calculateCapacity() {
        return rows * seatsPerRow;
    }

    public void show() {
        System.out.println("Type: " + aircraftType());
        System.out.println("Capacity: " + calculateCapacity() + " passengers");
    }
}

// CargoPlane class
class CargoPlane implements Aircraft {
    private double length;
    private double width;

    public CargoPlane(double length, double width) {
        this.length = length;
        this.width = width;
    }

    public String aircraftType() {
        return "Cargo Plane";
    }

    public int calculateCapacity() {
        double area = length * width;
        return (int)(area / 1.5); 
    }

    public void show() {
        System.out.println("Type: " + aircraftType());
        System.out.println("Equivalent Capacity: " + calculateCapacity() + " passengers");
    }
}


class PrivateJet implements Aircraft {
    private int seats;

    public PrivateJet(int seats) {
        this.seats = seats;
    }

    public String aircraftType() {
        return "Private Jet";
    }

    public int calculateCapacity() {
        return seats;
    }

    public void show() {
        System.out.println("Type: " + aircraftType());
        System.out.println("Capacity: " + calculateCapacity() + " luxury seats");
    }
}

public class AirlineManagement {
    public static void main(String[] args) {
        PassengerJet jet = new PassengerJet(30, 6);
        CargoPlane cargo = new CargoPlane(40.0, 5.0);
        PrivateJet privateJet = new PrivateJet(8);

        System.out.println("---- Passenger Jet ----");
        jet.show();

        System.out.println("\n---- Cargo Plane ----");
        cargo.show();

        System.out.println("\n---- Private Jet ----");
        privateJet.show();
    }
}

