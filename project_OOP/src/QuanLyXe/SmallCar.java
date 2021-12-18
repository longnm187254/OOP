package QuanLyXe;

import java.time.Year;

public class SmallCar extends Car {
    private final static int SmallCarPrice = 1000000;

    public SmallCar(int carNumber, String carOwner, int year) {
        super(carNumber, carOwner, year);
    }

    public SmallCar() {
    }


    @Override
    public double PriceCalculate() {
        Price = SmallCarPrice;
        if (Year > 5) {
            Price = Price - (Price * 0.2);
        }
        setPrice(Price);
        return Price;
    }

    public void InThongTin() {
        System.out.println("Loai xe: xe con  " + "||Bien so Xe:" + getCarNumber()  +
                "||Chu xe:" + getCarOwner() + " " +
                "||nam duoc trong:" + getYear() + " " +
                "||Tien:" + PriceCalculate());
    }
}
