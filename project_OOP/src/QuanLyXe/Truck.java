package QuanLyXe;

public class Truck extends Car {
    private int weight;
    private final static int HeSoTien = 700000;

    public Truck(int carNumber, String carOwner, int year, int weight) {
        super(carNumber, carOwner, year);
        this.weight = weight;
    }

    public Truck(int weight) {
        this.weight = weight;
    }

    public Truck() {
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    @Override
    public double PriceCalculate() {
        Price = weight * HeSoTien;
        if (Year > 5) {
            Price = Price - (Price * 0.25);
        }
        setPrice(Price);
        return Price;

    }

    public void InThongTin() {
        System.out.println("Loai xe:Xe tai   " + "||Bien So Xe:" + getCarNumber() +
                "||Chu xe:" + getCarOwner() + " " +
                "||nam duoc trong:" + getYear() + " " +
                "||trong tai:" + getWeight() + " " +
                "||Tien:" + PriceCalculate());
    }


}
