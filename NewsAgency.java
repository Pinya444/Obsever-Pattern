import java.util.ArrayList;
import java.util.List;

public class NewsAgency implements NewsAgencySubject {

    private List<Subscriber> subscribers = new ArrayList<>();

    @Override
    public void subscribe(Subscriber subscriber) {
        subscribers.add(subscriber);
        System.out.println(subscriber.getSubscriberName() + " subscribed.");
    }

    @Override
    public void unsubscribe(Subscriber subscriber) {
        subscribers.remove(subscriber);
        System.out.println(subscriber.getSubscriberName() + " unsubscribed.");
    }

    @Override
    public void notifySubscribers(String news) {
        for (Subscriber subscriber : subscribers) {
            subscriber.update(news);
        }
    }

    public void publishNews(String news) {
        System.out.println("\n🗞 Publishing News: " + news);
        notifySubscribers(news);
    }
}
