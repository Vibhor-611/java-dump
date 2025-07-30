import java.util.Scanner;

    public class scases {
      public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        int ch = scanner.nextInt();
        switch (ch){
            case 1:System.out.println("samosa");
            break;
            case 2:System.out.println("burger");
            break;
            case 3:System.out.println("pizza");
            break;
            default:System.out.println("we realize she is sleeping");
        }

      }
    }