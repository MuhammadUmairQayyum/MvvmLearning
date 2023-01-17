package com.androidapp.mvvmtraining.viewModel;

import android.app.Application;

import androidx.annotation.NonNull;
import androidx.lifecycle.AndroidViewModel;

import com.androidapp.mvvmtraining.model.CustomerModel;

public class CustomerViewModel extends AndroidViewModel {

    CustomerModel customerModel;
    public CustomerViewModel(@NonNull Application application) {
        super(application);
        customerModel = new CustomerModel("Umair","26","Abdul Qayyum","Sahiwal","923464488921");
    }


    public CustomerModel GetCustomer()
    {
        return this.customerModel;

    }
}
