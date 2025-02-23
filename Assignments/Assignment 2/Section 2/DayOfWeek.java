public class DayOfWeek { 
    public static void main(String[] args) { 
        int day = 4; // You can change this value to test different days

        switch(day) { 
            case 1: 
                System.out.println("Monday");
                switch("weekday") {
                    case "weekday":
                        System.out.println("It's a weekday");
                        break;
                }
                break;
            case 2: 
                System.out.println("Tuesday");
                switch("weekday") {
                    case "weekday":
                        System.out.println("It's a weekday");
                        break;
                }
                break;
            case 3: 
                System.out.println("Wednesday");
                switch("weekday") {
                    case "weekday":
                        System.out.println("It's a weekday");
                        break;
                }
                break;
            case 4: 
                System.out.println("Thursday");
                switch("weekday") {
                    case "weekday":
                        System.out.println("It's a weekday");
                        break;
                }
                break;
            case 5: 
                System.out.println("Friday");
                switch("weekday") {
                    case "weekday":
                        System.out.println("It's a weekday");
                        break;
                }
                break;
            case 6: 
                System.out.println("Saturday");
                switch("weekend") {
                    case "weekend":
                        System.out.println("It's a weekend");
                        break;
                }
                break;
            case 7: 
                System.out.println("Sunday");
                switch("weekend") {
                    case "weekend":
                        System.out.println("It's a weekend");
                        break;
                }
                break;
            default: 
                System.out.println("Invalid day");
                break;
        } 
    } 
}
