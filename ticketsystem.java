                                                                         CODE 2
// Abstract class
abstract class VisitorPass {
    abstract int calculateTicketPrice(int numberOfVisitors);
}

// VIPPass class
class VIPPass extends VisitorPass {
    public int calculateTicketPrice(int numberOfVisitors) {
        return numberOfVisitors * 500; // e.g., VIP ticket is Rs. 500
    }
}

// FamilyPass class
class FamilyPass extends VisitorPass {
    public int calculateTicketPrice(int numberOfVisitors) {
        if (numberOfVisitors >= 4) {
            return numberOfVisitors * 300; // Family discount
        } else {
            return numberOfVisitors * 350; // Less discount
        }
    }
}

// GeneralPass class
class GeneralPass extends VisitorPass {
    public int calculateTicketPrice(int numberOfVisitors) {
        return numberOfVisitors * 200; // Regular ticket price
    }
}

// Main class
public class TicketSystem {
    public static void main(String[] args) {
        // Create objects
        VIPPass vip = new VIPPass();
        FamilyPass family = new FamilyPass();
        GeneralPass general = new GeneralPass();

        // Sample inputs
        int vipVisitors = 2;
        int familyVisitors = 5;
        int generalVisitors = 3;

        // Calculate and display prices
        System.out.println("VIP Ticket Price: Rs. " + vip.calculateTicketPrice(vipVisitors));
        System.out.println("Family Ticket Price: Rs. " + family.calculateTicketPrice(familyVisitors));
        System.out.println("General Ticket Price: Rs. " + general.calculateTicketPrice(generalVisitors));
    }
}

