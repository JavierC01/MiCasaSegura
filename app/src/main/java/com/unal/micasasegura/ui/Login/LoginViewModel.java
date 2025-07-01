package com.unal.micasasegura.ui.Login;

import androidx.lifecycle.ViewModel;

public class LoginViewModel extends ViewModel {
    private static String model;
        public LoginViewModel() {
            model = "LoginViewModel";

        }
        public static String getModel() {
            return model;
        }

}
