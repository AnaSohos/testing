package com.mycompany.tracker;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Tracker trac = new Tracker();
        System.out.println("1 - Добавить заявку\n" + "2 - Заменить заявку \n" + "3 - Удалить заявку \n" + "4 - Отобразить список заявок \n" + "5 - Поиск заявки имени \n" + "6 - Выйти из программы\n");
        Scanner scan = new Scanner(System.in);

        while (scan.hasNext()) {
            switch (scan.nextInt()) {
                case 1: {
                    Scanner scan1 = new Scanner(System.in);
                    String name = scan1.next();
                    Item item = new Item(name);
                    trac.add(item);
                    break;

                }
                case 2: {
                    System.out.println("Введите id заявки который хотите поменять!");
                    Scanner scan2 = new Scanner(System.in);
                    int ds = scan2.nextInt();
                    System.out.println("Введите название новой заявки!");
                    Scanner scan3 = new Scanner(System.in);
                    String newName = scan3.nextLine();
                    Item item1 = new Item(ds, newName);
                    trac.returnItem(ds, item1);
                    
                    break;
                }
                case 3: {
                    System.out.println("Введите ID заявки которую хотите удалить!");
                    Scanner scan4 = new Scanner(System.in);
                    int num_del = scan4.nextInt();
                    trac.deleteItem(num_del);
                    break;

                }
                case 4: {
                    System.out.println("ВСЕ ЗАЯВКИ:" + trac.findAll());
                    break;
                }
                case 5: {
                    System.out.println("Введите имя заявки!");
                    Scanner scan3 = new Scanner(System.in);
                    String all = scan3.nextLine();
                    System.out.println(trac.findByName(all));

                    break;
                }
                case 6: {
                   return;
                   
                }
                 default:{

                    break;
                }

            }
        }
         scan.close();
       
    }

}
