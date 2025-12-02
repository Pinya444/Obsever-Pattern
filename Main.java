public class Main {
    public static void main(String[] args) {

        NewsAgency agency = new NewsAgency();

        // Create subscribers
        Subscriber alice = new Subscriber("Alice");
        Subscriber bob = new Subscriber("Bob");
        Subscriber claire = new Subscriber("Claire");

        // Subscribe users
        agency.subscribe(alice);
        agency.subscribe(bob);
        agency.subscribe(claire);

        // Publish breaking news
        agency.publishNews("Global markets surge after major tech breakthrough!");

        // Bob leaves the subscription
        agency.unsubscribe(bob);

        // New subscriber joins
        Subscriber david = new Subscriber("David");
        agency.subscribe(david);

        // Publish second news update
        agency.publishNews("Historic peace agreement signed today!");
    }
}
