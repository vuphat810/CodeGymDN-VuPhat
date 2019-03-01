public class TV {
    int channel = 1;
    int volumeLevel = 1;
    boolean on = false;

    public TV() {
    }

    public void setChannel(int channel) {
        this.channel = channel;
    }

    public void setVolumeLevel(int volumeLevel) {
        this.volumeLevel = volumeLevel;
    }
    public void turnOn() {
        on = true;
    }
    public void turnOff() {
        on = false;
    }
}


