package com.unal.micasasegura.ui.Register;

import androidx.lifecycle.ViewModel;

public class RegisterViewModel extends ViewModel {
    private static String model;
    public RegisterViewModel() {
        model = "RegisterViewModel";

    }
    public static String getModel() {
        return model;
    }

}
