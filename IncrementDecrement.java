public class IncrementDecrement {
    
    public static void main(String[] args) {
        incrementDecrement();
        incrementOrder();
        incrementOrderTest();
    }

    public static void incrementDecrement() {
        int value = 1;
        
        value = value + 1;
        System.out.println("First Increment: " + value);

        value += 1;
        System.out.println("Second Increment: " + value);

        value++;
        System.out.println("Third Increment: " + value);

        value = value - 1;
        System.out.println("First Decrement: " + value);

        value -= 1;
        System.out.println("Second Decrement: " + value);

        value--;
        System.out.println("Third Decrement: " + value);
        
        System.out.println("-------------------------------");
    }

    public static void incrementOrder() {
        int value = 1;

        value++;
        System.out.println("First: " + value);

        System.out.println("Second: " + value++); 

        System.out.println("Third: " + value);

        System.out.println("First: " + (++value)); 

        System.out.println("-------------------------------");
    }

    public static void incrementOrderTest() {
        int value = 1;

        ++value; 
        value++; 

        System.out.println("First: " + value);
        
        System.out.println("-------------------------------");
    }
}
