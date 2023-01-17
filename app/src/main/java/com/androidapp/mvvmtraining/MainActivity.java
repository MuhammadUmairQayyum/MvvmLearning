package com.androidapp.mvvmtraining;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelProviders;

import android.os.Bundle;

import com.androidapp.mvvmtraining.databinding.ActivityMainBinding;
import com.androidapp.mvvmtraining.viewModel.CustomerViewModel;

public class MainActivity extends AppCompatActivity {

    ActivityMainBinding activityMainBinding;
    CustomerViewModel customerViewModel;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        activityMainBinding = DataBindingUtil.setContentView(this,R.layout.activity_main);

        customerViewModel = ViewModelProviders.of(this).get(CustomerViewModel.class);
        activityMainBinding.setCustomerModel(customerViewModel.GetCustomer());
//        setContentView(R.layout.activity_main);
    }
}