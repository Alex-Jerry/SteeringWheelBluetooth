package com.joaquinalan.steeringwheelbluetooth.model.bluetooth;

import android.bluetooth.BluetoothDevice;

import java.io.Serializable;

/**
 * Created by joaquinalan on 18/06/2017.
 */

public class Hc05 implements Serializable{
    private BluetoothDevice mBluetoothDevice;

    public Hc05(BluetoothDevice bluetoothDevice) {
        this.mBluetoothDevice = bluetoothDevice;
    }

    public BluetoothDevice getBluetoothDevice() {
        return mBluetoothDevice;
    }
}
