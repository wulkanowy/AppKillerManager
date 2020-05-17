package com.thelittlefireman.appkillermanager.devices;

import android.content.Context;
import android.content.Intent;

import androidx.annotation.DrawableRes;

import com.thelittlefireman.appkillermanager.utils.Manufacturer;

public interface DeviceBase {
    boolean isThatRom();

    Manufacturer getDeviceManufacturer();

    boolean isActionPowerSavingAvailable(Context context);

    boolean isActionAutoStartAvailable(Context context);

    boolean isActionNotificationAvailable(Context context);

    boolean needToUseAlongWithActionDoseMode();

    Intent getActionPowerSaving(Context context);

    Intent getActionAutoStart(Context context);

    // FIXME IS IT REALLY NEEDED ? ==> REPLACE BY OTHER FUNCTION ?
    Intent getActionNotification(Context context);

    // TODO ADD FOR MEMORY OPTIMIZATION : https://github.com/00aj99/CRomAppWhitelist
    String getExtraDebugInformations(Context context);

    @DrawableRes
    int getHelpImagePowerSaving();

    @DrawableRes
    int getHelpImageAutoStart();

    @DrawableRes
    int getHelpImageNotification();
}
