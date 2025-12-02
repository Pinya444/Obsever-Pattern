public class Subscriber implements SubscriberObserver {

    private String subscriberName;

    public Subscriber(String name) {
        this.subscriberName = name;
    }

    @Override
    public void update(String breakingNews) {
        System.out.println("Hello " + subscriberName + "!");
        System.out.println("Breaking News: " + breakingNews);
        System.out.println("--------------------------");
    }

    public String getSubscriberName() {
        return subscriberName;
    }
}
