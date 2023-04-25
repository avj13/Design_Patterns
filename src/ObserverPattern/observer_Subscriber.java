package ObserverPattern;

public class observer_Subscriber {
    private String name;
    private subject_Channel channel;

    public observer_Subscriber(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public subject_Channel getChannel() {
        return channel;
    }

    public void subscribeChannel(subject_Channel channel) {
        this.channel = channel;
    }

    public void update() {
        System.out.println("Hi " + name + ",New Video Uploaded");
    }


}
