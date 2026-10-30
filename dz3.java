public class Student {
    public static void main(String[] args) {
        int glasses=0;
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        while (true) {
        System.out.print("Введите год: ");        
            int year = scanner.nextInt(); 
        System.out.print("Введите количество дней: ");        
            int day = scanner.nextInt(); 
            int quantityDey = (year%400==0) || (year%4==0&&year%100 !=0) ? 366 : 365;
//            int quantityDey = result ==1 ? 366 : 365;          
            if (day==quantityDey) {
                glasses +=1;              
            } else {
                System.out.println("Неправильно! В этом году" +quantityDey+ " дней!");
                System.out.println("Набрано очков:"+glasses);
                break;
            }
        }
    }
}    
