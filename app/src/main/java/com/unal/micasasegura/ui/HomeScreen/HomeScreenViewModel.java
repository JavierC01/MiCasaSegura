package com.unal.micasasegura.ui.HomeScreen;

import androidx.lifecycle.ViewModel;

public class HomeScreenViewModel extends ViewModel {
    private static String model;
    public HomeScreenViewModel() {
        model = "HomeScreenViewModel";

    }
    public static String getModel() {
        return model;
    }

}
