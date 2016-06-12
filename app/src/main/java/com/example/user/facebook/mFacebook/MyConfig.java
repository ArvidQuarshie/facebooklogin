package com.example.user.facebook.mFacebook;

import android.Manifest;

import com.sromku.simple.fb.Permission;
import com.sromku.simple.fb.SimpleFacebookConfiguration;

/**
 * Created by user on 6/12/16.
 */
public class MyConfig {

    Permission [] permissions = new Permission[] {Permission.EMAIL};
    static final String APP_ID = "237165640002099";

    public SimpleFacebookConfiguration getMyConfigs() {

        SimpleFacebookConfiguration configs = new SimpleFacebookConfiguration.Builder()
                .setAppId(APP_ID)
                .setNamespace("facebook")
                .setPermissions(permissions)
                .build();
        return configs;
    }

    }

