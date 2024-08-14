package com.example.quanlyguixe.screen.check_in_out_vehicle;

import android.view.LayoutInflater;

import androidx.navigation.NavController;

import com.example.quanlyguixe.databinding.FragmentCheckInOutVehicleBinding;
import com.example.quanlyguixe.util.base.BaseFragment;

import javax.inject.Inject;

public class CheckInCheckOutVehicleViewModel extends BaseFragment<FragmentCheckInOutVehicleBinding> {

    @Inject
    NavController navController;

    @Override
    public FragmentCheckInOutVehicleBinding inflateViewBinding(LayoutInflater inflater) {
        return FragmentCheckInOutVehicleBinding.inflate(inflater);
    }

    @Override
    protected void initScreenData() {

    }

    @Override
    protected void addEvent() {
//        viewBinding.buttonCheckInVehicle.setOnClickListener(view -> {
//            navController.navigate(R.id.action_nav_checkin_checkout_vehicle_to_nav_checkin_vehicle);
//        });
//
//        viewBinding.buttonCheckOutVehicle.setOnClickListener(view -> {
//            navController.navigate(R.id.action_nav_checkin_checkout_vehicle_to_nav_checkout_vehicle);
//        });
    }

    @Override
    protected void bindToViewModel() {
        /* no-op */
    }
}