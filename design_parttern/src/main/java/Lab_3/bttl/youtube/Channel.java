package Lab_3.bttl.youtube;

import java.util.ArrayList;
import java.util.List;

public class Channel {
    private String name;
    private List<Video> videos;
    private List<Observer> observers;
    private Video video;

    public Channel(String name) {
        this.name = name;
        this.videos = new ArrayList<>();
        this.observers = new ArrayList<>();
    }

    public void notifiAll(){
        for(Observer observer:observers){
            observer.update();
        }
    }

    public void register(Observer observer){

    }

    public void cancel(Observer observer){

    }

    public void addVideo(Video video){

    }

    public void changeName(String newName){
        setName(newName);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
