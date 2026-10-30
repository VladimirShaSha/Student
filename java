public class Student {
    public static void main(String[] args) {
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        int weight; //Вес
        int Cost; //Стоимость
        System.out.print("Здравствуйте");
        System.out.print("Введите стоимость товара в рублях ");
        Cost = scanner.nextInt();
        System.out.print("Введите вес товара в килограммах ");
        weight = scanner.nextInt();
        int duty=calculateCustoms(weight, Cost); //Пошлина
        System.out.print("Пошлина составит: "+duty);
    }


    public static int calculateCustoms (int weight, int Cost) {
        int result = weight*100+(int) (Cost*0.01);
        return result;
    }
}
