package com.unal.micasasegura.ui.Home;

import androidx.lifecycle.ViewModel;

public class HomeViewModel extends ViewModel {
    private static String model;
    public HomeViewModel() {
        model = "HomeViewModel";

    }
    public static String getModel() {
        return model;
    }

}
