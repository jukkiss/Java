public class TelevisionViewer {
    public static void main(String[] args) {
        Television myTV = new Television();
        myTV.pressOnOff();

        for (int day = 1; day <= 10; day++) {
            System.out.println("Woke up, day " + day);

            if (!myTV.isOn())
                myTV.pressOnOff();

            boolean tired = false;

            while (!tired) {
                System.out.println("Watching channel " + myTV.getChannel());

                int nextChannel = (myTV.getChannel() == 10) ? 1 : myTV.getChannel() + 1;
                myTV.setChannel(nextChannel);

                if (myTV.getChannel() % 4 == 0)
                    tired = true;
            }

            myTV.pressOnOff();

            System.out.println("Falling asleep");
        }
    }
}
