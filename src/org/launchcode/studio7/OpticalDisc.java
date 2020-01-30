package org.launchcode.studio7;

public interface OpticalDisc {
    String spinDisc();
    String writeData();
    String readData();
    Boolean loadedInfo();
    Boolean eject();
}
