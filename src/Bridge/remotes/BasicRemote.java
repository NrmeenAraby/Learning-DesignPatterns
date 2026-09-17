package Bridge.remotes;

import Bridge.devices.Device;

public class BasicRemote extends Remote{

    public BasicRemote(Device device){
        super(device);
    }


    @Override
    public void volumeUp() {
        System.out.println("Remote: volume up");
        device.setVolume(device.getVolume()+5);
    }


}
