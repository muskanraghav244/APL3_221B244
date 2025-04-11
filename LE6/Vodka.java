class Vodka extends Decorator {
    Vodka(Offering offering) {
        this.offering = offering;
    }
    
    int getPrice() {
        return offering.getPrice() + 65;
    }
    
    String getName() {
        return offering.getName() + " with Vodka";
    }
}