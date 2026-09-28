package mobile;

import java.util.Scanner;

public class MobileShopDriver {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        MobileShop shop = new MobileShop();
        Mobile mobile = null;

        System.out.println("===== WELCOME TO MOBILE SHOP =====");

        while (mobile == null) {

            System.out.println("\nChoose Brand:");
            System.out.println("1. Vivo");
            System.out.println("2. Samsung");
            System.out.println("3. iPhone");
            System.out.print("Enter choice: ");
            int brand = sc.nextInt();

            switch (brand) {

              
                case 1:
                    System.out.println("Choose Vivo Model:");
                    System.out.println("1. Y32");
                    System.out.println("2. X200");
                    System.out.println("3. V5");
                    System.out.print("Enter choice: ");
                    int v = sc.nextInt();

                    switch (v) {
                        case 1: mobile = shop.sell(new VivoY32()); break;
                        case 2: mobile = shop.sell(new VivoX200()); break;
                        case 3: mobile = shop.sell(new VivoV5()); break;
                        default:
                            System.out.println("❌ Invalid Vivo Model, try again");
                    }
                    break;

                // ---------- SAMSUNG ----------
                case 2:
                    System.out.println("Choose Samsung Model:");
                    System.out.println("1. S22");
                    System.out.println("2. S23");
                    System.out.println("3. S24");
                    System.out.print("Enter choice: ");
                    int s = sc.nextInt();

                    switch (s) {
                        case 1: mobile = shop.sell(new S22()); break;
                        case 2: mobile = shop.sell(new S23()); break;
                        case 3: mobile = shop.sell(new S24()); break;
                        default:
                            System.out.println("❌ Invalid Samsung Model, try again");
                    }
                    break;

              
                case 3:
                    System.out.println("Choose iPhone Model:");
                    System.out.println("1. 15 Pro");
                    System.out.println("2. 16 Pro");
                    System.out.println("3. 17 Pro");
                    System.out.print("Enter choice: ");
                    int i = sc.nextInt();

                    switch (i) {
                        case 1: mobile = shop.sell(new I15Pro()); break;
                        case 2: mobile = shop.sell(new I16Pro()); break;
                        case 3: mobile = shop.sell(new I17Pro()); break;
                        default:
                            System.out.println("❌ Invalid iPhone Model, try again");
                    }
                    break;

               
                default:
                    System.out.println("❌ Invalid Brand Choice, try again");
            }
        }

    
        System.out.println("\n--- Purchase Details ---");
        mobile.printDetails();

        sc.close();
    }
}
