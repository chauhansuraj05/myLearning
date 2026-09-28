//package mobile;
//
//import java.util.Scanner;
//
//public class MobileShopDriver {
//

//    Mobile sell(Mobile m) {
//        return m;
//    }
//
//    public static void main(String[] args) {
//
//        Scanner sc = new Scanner(System.in);
//        MobileShopDriver driver = new MobileShopDriver();
//        Mobile mobile = null;
//
//        System.out.println("===== WELCOME TO MOBILE SHOP =====");
//
//        while (mobile == null) {
//
//            System.out.println("1. Vivo");
//            System.out.println("2. Samsung");
//            System.out.println("3. iPhone");
//            int brand = sc.nextInt();
//
//            switch (brand) {
//
//                case 1:
//                    System.out.println("1. Y32  2. X200  3. V5");
//                    switch (sc.nextInt()) {
//                        case 1: mobile = driver.sell(new VivoY32()); break;
//                        case 2: mobile = driver.sell(new VivoX200()); break;
//                        case 3: mobile = driver.sell(new VivoV5()); break;
//                    }
//                    break;
//
//                case 2:
//                    System.out.println("1. S22  2. S23  3. S24");
//                    switch (sc.nextInt()) {
//                        case 1: mobile = driver.sell(new S22()); break;
//                        case 2: mobile = driver.sell(new S23()); break;
//                        case 3: mobile = driver.sell(new S24()); break;
//                    }
//                    break;
//
//                case 3:
//                    System.out.println("1. 15 Pro  2. 16 Pro  3. 17 Pro");
//                    switch (sc.nextInt()) {
//                        case 1: mobile = driver.sell(new I15Pro()); break;
//                        case 2: mobile = driver.sell(new I16Pro()); break;
//                        case 3: mobile = driver.sell(new I17Pro()); break;
//                    }
//                    break;
//            }
//        }
//
//        mobile.printDetails();
//        sc.close();
//    }
//}
