/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.curs.asteroids;

import android.os.Bundle;
import android.preference.PreferenceActivity;

/**
 *
 * @author maximiliano
 */
public class Preferencias extends PreferenceActivity {

    /**
     * Called when the activity is first created.
     */
    @Override
    public void onCreate(Bundle icicle) {
        super.onCreate(icicle);
        // ToDo add your GUI initialization code here   
         addPreferencesFromResource(R.xml.preferencias);
    }
}
