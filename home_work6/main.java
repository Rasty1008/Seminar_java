package home_work6;


import java.util.HashSet;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        NoteBook note1 = new NoteBook("Intel Core i5 6400", "RTX 3090",
                "HP", "Omen 15s3", "Windows 10", 4, 500, 35000);
        NoteBook note2 = new NoteBook("Intel Core i5 7400", "RTX 2070",
                "Acer", "Aspire 12377", "Windows 10", 4, 500, 39000);
        NoteBook note3 = new NoteBook("Intel Core i5 7400", "RTX 1030",
                "Acer", "Aspire 11s9", "Ubuntu", 4, 1000, 45000);
        NoteBook note4 = new NoteBook("Ryzen 5 3600", "RX 5500",
                "Asus", "ROG 1030", "NoOS", 8, 320, 70000);
        NoteBook note5 = new NoteBook("Ryzen 5 5500U", "RX 5600",
                "Asus", "ROG 1030", "NoOS", 8, 500, 65000);
        NoteBook note6 = new NoteBook("Intel Core i7 8700k", "GTX 1080",
                "Asus", "ROG 1030", "NoOS", 8, 750, 70000);
        NoteBook note7 = new NoteBook("Intel Core i9 9900k", "RTX 4090",
                "Huawei", "15.6Hs15", "Windows 11", 8, 1000, 60000);
        NoteBook note8 = new NoteBook("Ryzen 3 3500U", "noGPU",
                "Huawei", "15.6Hs15", "Linux", 16, 500, 85000);
        NoteBook note9 = new NoteBook("Intel Core i5 6400", "RTX 3090",
                "HP", "Omen 15s3", "Windows 10", 16, 500, 90000);
        NoteBook note10 = new NoteBook("Intel Core i5 7400", "RTX 2070",
                "Acer", "Aspire 12377", "Windows 10", 16, 1000, 100000);
        NoteBook note11 = new NoteBook("Intel Core i5 7400", "RTX 1030",
                "Acer", "Aspire 11s9", "Ubuntu", 32, 1000, 120000);
        NoteBook note12 = new NoteBook("Ryzen 5 3600", "RX 5500",
                "Asus", "ROG 1030", "NoOS", 16, 500, 13500);
        NoteBook note13 = new NoteBook("Ryzen 5 5500U", "RX 5600",
                "Asus", "ROG 1030", "NoOS", 4, 320, 10000);
        NoteBook note14 = new NoteBook("Intel Core i7 8700k", "GTX 1080",
                "Asus", "ROG 1030", "NoOS", 4, 500, 25000);
        NoteBook note15 = new NoteBook("Intel Core i9 9900k", "RTX 4090",
                "Huawei", "15.6Hs15", "Windows 11", 6, 1000, 33000);
        NoteBook note16 = new NoteBook("Ryzen 3 3500U", "noGPU",
                "Huawei", "15.6Hs15", "Linux", 6, 500, 33500);
        HashSet<NoteBook> all_NoteBooks = new HashSet<>();
        all_NoteBooks.add(note1);
        all_NoteBooks.add(note2);
        all_NoteBooks.add(note3);
        all_NoteBooks.add(note4);
        all_NoteBooks.add(note5);
        all_NoteBooks.add(note6);
        all_NoteBooks.add(note7);
        all_NoteBooks.add(note8);
        all_NoteBooks.add(note9);
        all_NoteBooks.add(note10);
        all_NoteBooks.add(note11);
        all_NoteBooks.add(note12);
        all_NoteBooks.add(note13);
        all_NoteBooks.add(note14);
        all_NoteBooks.add(note15);
        all_NoteBooks.add(note16);
        main_menu(all_NoteBooks);
    }

    public static void main_menu(HashSet<NoteBook> all_NoteBooks) {
        System.out.println("====================############=======================");
        System.out.println("?????????? ???????????????????? ?? ?????? ?????????????? ??????????????????");
        boolean flag = false;
        while (!flag) {
            System.out.println("====================############=======================");
            System.out.println("""
                    1. ?????????????? ???????? ??????????????
                    2. ?????????????????????????? ??????????????
                    3. ???????????????? ??????????????""");
            System.out.print("???????????????? ?????????????????????? ?????????? ????????: ");
            Scanner s = new Scanner(System.in);
            String change = s.next();
            if (change.equals("1") || change.equals("2") || change.equals("3")) {
                if (change.equals("1")) {
                    for (NoteBook p : all_NoteBooks) {
                        p.info();
                    }
                } else if (change.equals("2")) {
                    flag = true;
                    filter_menu(all_NoteBooks);
                } else {
                    System.out.println("---------------");
                    System.out.println("???????????????? ????????????");
                    System.out.println("---------------");
                    flag = true;
                }
            } else {
                System.out.println("----------------------");
                System.out.println("???????????? ???????????? ???????? ??????");
                System.out.println("----------------------");
            }
        }
    }

    public static void filter_menu(HashSet<NoteBook> all_NoteBooks) {
        HashSet<NoteBook> filter = new HashSet<>();
        boolean flag = false;
        while (!flag) {
            System.out.println("====================############=======================");
            System.out.println("""
                    1. ?????????????????????????? ???? ????????
                    2. ?????????????????????????? ???? ???????????????????? ??????
                    3. ?????????????????????????? ???? ???????????? ???????????????? ??????????
                    4. ?????????????? ???? ?????????? ?????????????? ?????????? ????????????????????
                    5. ???????????????? ?????????????????? ????????????????????
                    6. ???????????????? ???????? ????????????????????
                    """);
            System.out.print("???????????????? ?????????????????????? ?????????? ????????: ");
            Scanner s = new Scanner(System.in);
            String change = s.next();
            if (change.equals("1") || change.equals("2") || change.equals("3") || change.equals("4")
                    || change.equals("5") || change.equals("6")) {
                switch (change) {
                    case "1" -> price_sort(all_NoteBooks, filter);
                    case "2" -> ram_sort(all_NoteBooks, filter);
                    case "3" -> hdd_sort(all_NoteBooks, filter);
                    case "4" -> {
                        if (!filter.isEmpty()) {
                            for (NoteBook p : filter) {
                                p.info();
                            }
                        } else {
                            System.out.println("-----------------------------");
                            System.out.println("?????? ?????????????????? ?????????????????????????????? ?????????? ???????????????? " +
                                    "?????? ???? ?????????????? ?????????????????? ????????????????????");
                            System.out.println("-----------------------------");
                        }
                    }
                    case "5" -> {
                        filter.clear();
                        System.out.println("-----------------------------");
                        System.out.println("?????????????????? ???????????????????? ????????????????");
                        System.out.println("-----------------------------");
                    }
                    default -> {
                        flag = true;
                        main_menu(all_NoteBooks);
                    }
                }
            } else {
                System.out.println("----------------------");
                System.out.println("???????????? ???????????? ???????? ??????");
                System.out.println("----------------------");
            }
        }
    }

    public static void price_sort(HashSet<NoteBook> all_NoteBooks, HashSet<NoteBook> filter) {
        System.out.println("====================############=======================");
        Scanner s = new Scanner(System.in);
        int min_price_int = 0;
        int max_price_int = 0;
        boolean flag = false;
        while (!flag) {
            System.out.print("?????????????? ?????????????????????? ????????: ");
            String min_price = s.next();
            if (isDigit(min_price)) {
                min_price_int = Integer.parseInt(min_price);
                flag = true;
            } else {
                System.out.println("------------------");
                System.out.println("???? ?????????? ???? ??????????!!!");
                System.out.println("------------------");
            }
        }
        flag = false;
        while (!flag) {
            System.out.print("?????????????? ???????????????????????? ????????: ");
            String max_price = s.next();
            if (isDigit(max_price)) {
                max_price_int = Integer.parseInt(max_price);
                flag = true;
            } else {
                System.out.println("------------------");
                System.out.println("???? ?????????? ???? ??????????!!!");
                System.out.println("------------------");
            }
        }
        if (filter.isEmpty()) {
            for (NoteBook p : all_NoteBooks) {
                if (p.price <= max_price_int && p.price >= min_price_int) {
                    filter.add(p);
                }
            }
        } else {
            HashSet<NoteBook> support_filter = new HashSet<>(filter);
            filter.clear();
            for (NoteBook p : support_filter) {
                if (p.price <= max_price_int && p.price >= min_price_int) {
                    filter.add(p);
                }
            }
        }
    }

    public static void ram_sort(HashSet<NoteBook> all_NoteBooks, HashSet<NoteBook> filter) {
        System.out.println("====================############=======================");
        Scanner s = new Scanner(System.in);
        int min_ram_int = 0;
        int max_ram_int = 0;
        boolean flag = false;
        while (!flag) {
            System.out.print("?????????????? ?????????????????????? ?????????? ?????????????????????? ????????????: ");
            String min_ram = s.next();
            if (isDigit(min_ram)) {
                min_ram_int = Integer.parseInt(min_ram);
                flag = true;
            } else {
                System.out.println("------------------");
                System.out.println("???? ?????????? ???? ??????????!!!");
                System.out.println("------------------");
            }
        }
        flag = false;
        while (!flag) {
            System.out.print("?????????????? ???????????????????????? ?????????? ?????????????????????? ????????????: ");
            String max_ram = s.next();
            if (isDigit(max_ram)) {
                max_ram_int = Integer.parseInt(max_ram);
                flag = true;
            } else {
                System.out.println("------------------");
                System.out.println("???? ?????????? ???? ??????????!!!");
                System.out.println("------------------");
            }
        }
        if (filter.isEmpty()) {
            for (NoteBook p : all_NoteBooks) {
                if (p.ram_size <= max_ram_int && p.ram_size >= min_ram_int) {
                    filter.add(p);
                }
            }
        } else {
            HashSet<NoteBook> support_filter = new HashSet<>(filter);
            filter.clear();
            for (NoteBook p : support_filter) {
                if (p.ram_size <= max_ram_int && p.ram_size >= min_ram_int) {
                    filter.add(p);
                }
            }
        }
    }

    public static void hdd_sort(HashSet<NoteBook> all_NoteBooks, HashSet<NoteBook> filter) {
        System.out.println("====================############=======================");
        Scanner s = new Scanner(System.in);
        int min_hdd_int = 0;
        int max_hdd_int = 0;
        boolean flag = false;
        while (!flag) {
            System.out.print("?????????????? ?????????????????????? ?????????? ???????????????? ??????????: ");
            String min_hdd = s.next();
            if (isDigit(min_hdd)) {
                min_hdd_int = Integer.parseInt(min_hdd);
                flag = true;
            } else {
                System.out.println("------------------");
                System.out.println("???? ?????????? ???? ??????????!!!");
                System.out.println("------------------");
            }
        }
        flag = false;
        while (!flag) {
            System.out.print("?????????????? ???????????????????????? ?????????? ???????????????? ??????????: ");
            String max_hdd = s.next();
            if (isDigit(max_hdd)) {
                max_hdd_int = Integer.parseInt(max_hdd);
                flag = true;
            } else {
                System.out.println("------------------");
                System.out.println("???? ?????????? ???? ??????????!!!");
                System.out.println("------------------");
            }
        }
        if (filter.isEmpty()) {
            for (NoteBook p : all_NoteBooks) {
                if (p.hdd_size <= max_hdd_int && p.hdd_size >= min_hdd_int) {
                    filter.add(p);
                }
            }
        } else {
            HashSet<NoteBook> support_filter = new HashSet<>(filter);
            filter.clear();
            for (NoteBook p : support_filter) {
                if (p.hdd_size <= max_hdd_int && p.hdd_size >= min_hdd_int) {
                    filter.add(p);
                }
            }
        }
    }

    private static boolean isDigit(String s) throws NumberFormatException {
        try {
            Integer.parseInt(s);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }
}