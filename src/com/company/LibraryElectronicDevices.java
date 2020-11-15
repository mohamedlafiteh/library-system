package com.company;

import java.util.ArrayList;

public class LibraryElectronicDevices {
    private String deviceName;
    private  String deviceLocation;
    private boolean deviceAvailability;
    ArrayList<LibraryElectronicDevices> devicesInLibrary;

    public LibraryElectronicDevices(String deviceName,String deviceLocation,boolean deviceAvailability){
        this.deviceName=deviceName;
        this.deviceLocation=deviceLocation;
        this.deviceAvailability=deviceAvailability;
        devicesInLibrary=new ArrayList<>();
    }

    public String getDeviceLocation() {
        return deviceLocation;
    }

    public void setDeviceLocation(String deviceLocation) {
        this.deviceLocation = deviceLocation;
    }

    public boolean isDeviceAvailability() {
        return deviceAvailability;
    }

    public void setDeviceAvailability(boolean deviceAvailability) {
        this.deviceAvailability = deviceAvailability;
    }
    public void addDevices(LibraryElectronicDevices device){
        devicesInLibrary.add(device);
    }
   public  void removeDevice(LibraryElectronicDevices device){
        devicesInLibrary.remove(device);
}
    public boolean checkAvailability(LibraryElectronicDevices deviceIn){

            if(devicesInLibrary.contains(deviceIn)){
                return true;
        }
        return  false;
    }
}
