package com.example.android.sunshine.app;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;

/**
 * Created by ben on 10.04.16.
 */
public class WeatherImage {

    public static Bitmap getBitmap(Context context, int weatherId) {

        if (weatherId >= 200 && weatherId <= 232) {
            return BitmapFactory.decodeResource(context.getResources(), R.drawable.art_storm);
        } else if (weatherId >= 300 && weatherId <= 321) {
            return BitmapFactory.decodeResource(context.getResources(), R.drawable.art_light_rain);
        } else if (weatherId >= 500 && weatherId <= 504) {
            return BitmapFactory.decodeResource(context.getResources(), R.drawable.art_rain);
        } else if (weatherId == 511) {
            return BitmapFactory.decodeResource(context.getResources(), R.drawable.art_snow);
        } else if (weatherId >= 520 && weatherId <= 531) {
            return BitmapFactory.decodeResource(context.getResources(), R.drawable.art_rain);
        } else if (weatherId >= 600 && weatherId <= 622) {
            return BitmapFactory.decodeResource(context.getResources(), R.drawable.art_rain);
        } else if (weatherId >= 701 && weatherId <= 761) {
            return BitmapFactory.decodeResource(context.getResources(), R.drawable.art_fog);
        } else if (weatherId == 761 || weatherId == 781) {
            return BitmapFactory.decodeResource(context.getResources(), R.drawable.art_storm);
        } else if (weatherId == 800) {
            return BitmapFactory.decodeResource(context.getResources(), R.drawable.art_clear);
        } else if (weatherId == 801) {
            return BitmapFactory.decodeResource(context.getResources(), R.drawable.art_light_clouds);
        } else if (weatherId >= 802 && weatherId <= 804) {
            return BitmapFactory.decodeResource(context.getResources(), R.drawable.art_clouds);
        } else {
            return null;
        }
    }

}
