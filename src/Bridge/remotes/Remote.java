package Bridge.remotes;

import Bridge.devices.Device;

// the abstraction hierarchy (the controller )
public abstract class Remote {
    protected Device device;
    public  Remote(Device device){
        this.device=device;
    }

    public void power() {
        System.out.println("Remote: power toggle");
        if(device.isEnabled()){
            device.disable();
        }
        else {
            device.enable();
        }
    }
    public abstract void volumeUp();
   public void channelUp() {
        System.out.println("Remote: channel up");
        device.setChannel(device.getChannel()+1);
    }
}
