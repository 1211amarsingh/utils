package com.example.viewer.permission_util;

import java.util.ArrayList;

public abstract class PermissionCallback {

    public abstract void onPermissionResult(ArrayList<Status> permissions);
}
