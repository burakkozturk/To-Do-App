import java.util.Scanner;

public class Main {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            ToDoApp toDoApp = new ToDoApp();

            while (true) {
                System.out.println();
                System.out.println("Yapilacaklar Listesi Uygulamasi");
                System.out.println("1. Gorev Ekle");
                System.out.println("2. Gorev Sil");
                System.out.println("3. Gorevleri Listele");
                System.out.println("0. Cikis");
                System.out.print("Seciminizi yapin: ");

                int choice = scanner.nextInt();
                scanner.nextLine(); // Boşluğu temizle

                switch (choice) {
                    case 1:
                        System.out.print("Gorevi girin: ");
                        String task = scanner.nextLine();
                        toDoApp.addTask(task);
                        break;
                    case 2:
                        System.out.print("Silinecek gorevin indeksini girin: ");
                        int index = scanner.nextInt();
                        toDoApp.removeTask(index - 1);
                        break;
                    case 3:
                        toDoApp.displayTasks();
                        break;
                    case 0:
                        System.out.println("Uygulama kapatiliyor...");
                        System.exit(0);// Çalışmayı durdurur..
                        break;
                    default:
                        System.out.println("Gecersiz secenek!");
                }
            }
        }
    }
