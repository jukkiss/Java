public class Television {
    private boolean isOn = false;
    private int channel = 1;

    public void pressOnOff() {
        isOn = !isOn;
    }

    public boolean isOn() {
        return isOn;
    }

    public void setChannel(int newChannel) {
        if (isOn) {
            channel = newChannel;
        }
    }

    public int getChannel() {
        return channel;
    }
}
