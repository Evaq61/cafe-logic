public class CafeJava {
    public static void main (String[] args) {
        // APP VARIABLES
        // Lines of text that will appear in the app
        String generalGreeting = "Welcome to Cafe Java, ";
        String pendingMessage = ", your order will be ready shortly.";
        String readyMessage = ", your order is ready.";
        String displayTotalMessage = "Your total is $";

        // Menu variables
        double mochaPrice = 4.50;
        double dripCoffeePrice = 4.75;
        double lattePrice = 5;
        double cappuccinoPrice = 2.00;

        // Customer name variables
        String customer1 = "Cindhuri";
        String customer2 = "Sam";
        String customer3 = "Jimmy";
        String customer4 = "Noah";


        // Order completions
        boolean isReadyOrder1 = false; // cindi
        boolean isReadyOrder2 = false; // sam
        boolean isReadyOrder3 = false; // jimmy
        boolean isReadyOrder4 = false; // noah

        // APP INTERACTION SIMULATION

        System.out.println(generalGreeting + customer1); // "Welcome to Cafe Java, Cindhuri"
        // System.out.println(customer1 + pendingMessage); // "Cindhuri, your order will be ready shortly"

        // checking Cindi's Order Status
        if (isReadyOrder1 == true){ 
            System.out.println (customer1 + readyMessage +" "+ displayTotalMessage + dripCoffeePrice); // It's ready
        } else{
            System.out.println (customer1 + pendingMessage); // not ready
        }
        // checking Noah's Order Status
        if (isReadyOrder4 == true){ 
            System.out.println (customer4 + readyMessage +" "+ displayTotalMessage + cappuccinoPrice); // It's ready
        } else{
            System.out.println (customer4 + pendingMessage); // not ready
        }
        
        // checking Sam's Order
        if (isReadyOrder2 == true){
            double sum = lattePrice*2;
            System.out.println (customer2 + readyMessage +" "+ displayTotalMessage + sum); // It's ready
        } else{
            System.out.println (customer2 + pendingMessage); // not ready
        }

        // checking Jimmy's Order
        if (dripCoffeePrice > lattePrice){ // checking Noah's Order Status
            System.out.println ("Sorry, " + customer4 + ". We owe you $" + (dripCoffeePrice - lattePrice) + " back"); // coffe costs more than latte
        } else{
            System.out.println ("Sorry, " + customer4 + ". You still owe us $" + (lattePrice - dripCoffeePrice) + " for your order"); // latte cost more than coffe
        }

    }
}