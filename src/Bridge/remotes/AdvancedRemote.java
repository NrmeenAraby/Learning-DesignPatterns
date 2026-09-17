package Bridge.remotes;

import Bridge.devices.Device;

public class AdvancedRemote extends Remote{

    public AdvancedRemote(Device device){
        super(device);
    }
    @Override
    public void volumeUp() {
        System.out.println("Remote: volume up");
        device.setVolume(device.getVolume()+10);
    }
    public void mute(){
        System.out.println("Remote: mute");
        device.setVolume(0);
    }
}
