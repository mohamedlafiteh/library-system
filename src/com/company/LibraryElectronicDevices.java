package com.company;

import java.util.ArrayList;

public class LibraryElectronicDevices {
    private String deviceName;
    private  String deviceLocation;
    private boolean deviceAvailability;
    ArrayList<LibraryElectronicDevices> devicesInLibrary;

    public LibraryElectronicDevices(){
        this.deviceName="";
        this.deviceLocation="";
        this.deviceAvailability=false;
        devicesInLibrary=new ArrayList<>();
    }
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

    public String getDeviceName() {
        return deviceName;
    }

    public void setDeviceName(String deviceName) {
        this.deviceName = deviceName;
    }

    public boolean getDeviceAvailability() {
       return  deviceAvailability ;
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
    public String printDeviceDetails(LibraryElectronicDevices device){
        String details ="";
        if(devicesInLibrary.contains(device)){

            details+= "The Device name is " + device.getDeviceName() + "\n";
            details+= "The Device location is " + device.getDeviceLocation() + "\n";
            details+= "The Device availability " + device.getDeviceAvailability() + "\n";
        }else {
            details+="Sorry the device is not available";
        }
        return  details;
    }
}
