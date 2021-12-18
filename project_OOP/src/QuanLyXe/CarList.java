package QuanLyXe;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class CarList {
    private static ArrayList<Car> listCars;
    //    private static SmallCar[] smallcars;
//    private static Truck[] trucks;
    private int total;

    // ham main de chay chuong trinh
    public static void main(String[] args) {
        int choice;

        listCars = new ArrayList<Car>();


        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("=================MENU=================");
            System.out.println("1.Them oto moi.");
            System.out.println("2.In Danh Sach oto co trong bai.");
            System.out.println("3.Tinh tong tien.");
            System.out.println("0.Thoat ung dung");
            System.out.println("Lua chon cua ban ?");

            choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {

                case (0):
                    System.out.println("thoat ra, Xin cam on");
                    break;
                case (1):
                    ThemXe();
                    break;
                case (2):
                    InDS();
                    break;
                case (3):
                    Tong(listCars);
            }

        } while (choice != 0);

    }

///// CAC YEU CAU CUA DE BAI//////

    ///0. in DAnh SAch
    public static void InDS() {
        Car[] cars = new Car[listCars.size()];
        listCars.toArray(cars);
        for (int i = 0; i < cars.length; i++) {
            System.out.println("Xe so " + (i + 1) + ":");
            cars[i].InThongTin();
        }
    }

    //1.Them xe oto
    public static void ThemXe() {
        int choice;

        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("Nhap loai xe:");
            System.out.println("1.Xe con");
            System.out.println("2.Xe tai");
            choice = scanner.nextInt();
        } while (choice != 1 && choice != 2);

        if (choice == 1) {
            System.out.println("Nhap bien so xe:");
            int CarNum = scanner.nextInt();

            scanner.nextLine();

            System.out.println("Nhap chu xe:");
            String CarOwner = scanner.nextLine();

            System.out.println("nhap nam muon xe duoc trong:");
            int year = scanner.nextInt();

            SmallCar newsmallcar = new SmallCar(CarNum, CarOwner, year);
            listCars.add(newsmallcar);


        }
        if (choice == 2) {
            System.out.println("Nhap bien so xe:");
            int CarNum = scanner.nextInt();

            scanner.nextLine();

            System.out.println("Nhap chu xe:");
            String CarOwner = scanner.nextLine();

            System.out.println("nhap nam muon xe duoc trong:");
            int year = scanner.nextInt();

            System.out.println("Nhap trong tai:");
            int weight = scanner.nextInt();
            Truck newtruck = new Truck(CarNum, CarOwner, year, weight);
            listCars.add(newtruck);
        }
    }

    //Tinh Tong tien 1 thang
    public static void Tong(ArrayList<Car> list) {
        Car[] cars = new Car[listCars.size()];
        list.toArray(cars);

        Scanner input = new Scanner(System.in);
        System.out.println("Nhap so thang de tinh chi phi:");
        double month = input.nextDouble();


        double Tong = 0;
        for (int j = 0; j < cars.length; j++) {
            Tong += cars[j].getPrice();
        }
        Tong = Tong * month;
        System.out.println("Tong: " + Tong);


    }
}