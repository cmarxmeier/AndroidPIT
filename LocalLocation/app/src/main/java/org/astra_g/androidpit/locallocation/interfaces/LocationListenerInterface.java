package org.astra_g.androidpit.locallocation.interfaces;

import android.location.Location;

public interface LocationListenerInterface {
    void onLocationChanged(Location location);

    void onStatusChanged(String provider);

    void onProviderEnabled(String provider);

    void onProviderDisabled(String provider);
}
