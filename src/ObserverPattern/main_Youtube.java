package ObserverPattern;

public class main_Youtube {
    public static void main(String[] args)
    {
        subject_Channel news_live = new subject_Channel("News Live");

        observer_Subscriber s1 = new observer_Subscriber("A1");
        observer_Subscriber s2 = new observer_Subscriber("B1");
        observer_Subscriber s3 = new observer_Subscriber("C1");
        observer_Subscriber s4 = new observer_Subscriber("D1");
        observer_Subscriber s5 = new observer_Subscriber("E1");

        // channel subscribed by users
        news_live.subscribe(s1);
        news_live.subscribe(s2);
        news_live.subscribe(s3);
        news_live.subscribe(s4);
        news_live.subscribe(s5);

        //users get to know which channel to be subscribed
        s1.subscribeChannel(news_live);
        s2.subscribeChannel(news_live);
        s3.subscribeChannel(news_live);
        s4.subscribeChannel(news_live);
        s5.subscribeChannel(news_live);

        news_live.upload("My new Video");



    }
}
