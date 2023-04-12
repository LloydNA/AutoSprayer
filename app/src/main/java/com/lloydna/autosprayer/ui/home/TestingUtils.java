package com.lloydna.autosprayer.ui.home;

import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.Discouraged;

public class TestingUtils {
    @Discouraged(message = "For testing purposes only")
    public static ViewGroup getParent(View view) {
        return (ViewGroup) view.getParent();
    }

    @Discouraged(message = "For testing purposes only")
    public static void removeView(View view) {
        ViewGroup parent = getParent(view);
        if (parent != null) {
            parent.removeView(view);
        }
    }

    @Discouraged(message = "For testing purposes only")
    public static void replaceView(View currentView, View newView) {
        ViewGroup parent = getParent(currentView);
        if (parent == null) {
            return;
        }
        final int index = parent.indexOfChild(currentView);
        removeView(currentView);
        removeView(newView);
        parent.addView(newView, index);
    }
}
