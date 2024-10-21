package assignment3;

public class Main {
    public static void main(String[] args) {
        // Create instances of the receivers (smart devices)
        TV livingRoomTV = new TV();
        Stereo stereo = new Stereo();
        Light livingRoomLight = new Light();

        // Create command objects for the devices
        Command tvOn = new TurnTVOn(livingRoomTV);
        Command stereoVolumeUp = new SetVolume(stereo, 10);
        Command lightDim = new DimLights(livingRoomLight, 50);

        // Create the remote control
        RemoteControl remote = new RemoteControl();

        // Assign commands to buttons on the remote
        remote.setCommand(0, tvOn, new NoCommand());        // TV on only
        remote.setCommand(1, stereoVolumeUp, new NoCommand());  // Stereo volume
        remote.setCommand(2, lightDim, new NoCommand());       // Dim lights

        // Simulate pressing buttons
        System.out.println("Pressing TV ON button...");
        remote.pressOnButton(0);

        System.out.println("\nPressing Stereo Volume button...");
        remote.pressOnButton(1);

        System.out.println("\nPressing Light Dim button...");
        remote.pressOnButton(2);

        // Test the undo button
        System.out.println("\nPressing UNDO button...");
        remote.pressUndoButton();
    }
}