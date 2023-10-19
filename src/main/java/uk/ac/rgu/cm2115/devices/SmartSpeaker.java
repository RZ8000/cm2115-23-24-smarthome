package uk.ac.rgu.cm2115.devices;

public class SmartSpeaker extends Device implements Playable, Adjustable {

    private boolean playing;
    private int volume;


    public SmartSpeaker(String name) {
        super(name);
        this.playing = false;
        this.volume = 5;
    }

    @Override
    public void turnUp() {
        this.volume++;
        System.out.println("Volume is set to " + this.volume);
    }

    @Override
    public void turnDown() {
        if(this.volume > 0){
            this.volume--;
        } 
        System.out.println("Volume is set to " + this.volume);
    }

    @Override
    public void play() {
        this.playing = true;
        System.out.println(this.name + " is playing");
    }

    @Override
    public void stop() {
        this.playing = false;
        System.out.println(this.name + " has stopped");
    }


    @Override
    public String getStatus() {
        String playingMsg;
        if(this.playing){
            playingMsg = " is playing at volume " + this.volume;
        }else{
            playingMsg = " is not playing";
        }

        return playingMsg;
    }
    
}
