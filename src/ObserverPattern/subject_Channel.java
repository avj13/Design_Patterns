package ObserverPattern;

import java.util.ArrayList;
import java.util.List;

public class subject_Channel {
    private List<observer_Subscriber> subList = new ArrayList<>();
    private String title;

    public subject_Channel(String title) {
        this.title = title;
    }

    public void subscribe(observer_Subscriber sub){
        subList.add(sub);
    }

    public void unsubscribe(observer_Subscriber sub){
        subList.remove(sub);
    }

    public void notifySubscriber()
    {
        for(observer_Subscriber s: subList)
           s.update();
    }

    //event that will trigger the notify action to all users.
    public void upload(String title){
        this.title = title;
        notifySubscriber();
    }
}
