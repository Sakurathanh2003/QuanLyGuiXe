package com.example.quanlyguixe.screen.main.home;

import androidx.lifecycle.ViewModelProvider;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import android.view.LayoutInflater;
import com.example.quanlyguixe.R;
import com.example.quanlyguixe.databinding.FragmentHomeBinding;
import com.example.quanlyguixe.util.base.BaseFragment;

public class HomeFragment extends BaseFragment<FragmentHomeBinding> {
    private HomeViewModel homeViewModel;
    private HomeAdapter homeAdapter;
    @Override
    public FragmentHomeBinding inflateViewBinding(LayoutInflater inflater) {
        return FragmentHomeBinding.inflate(inflater);
    }

    @Override
    protected void initScreenData() {
        homeViewModel = new ViewModelProvider(this).get(HomeViewModel.class);
        homeAdapter = new HomeAdapter();

        viewBinding.recyclerViewHomeFragment.setAdapter(homeAdapter);
    }

    @Override
    protected void addEvent() {
        homeAdapter.setOnClickItemListener((item) -> {
            NavController navController = Navigation.findNavController(getActivity(), R.id.nav_host_fragment_content_main);
            navController.popBackStack(R.id.nav_home, false);

            switch (item.getScreenCategory()) {
                case REPORT_SCREEN:
                    navController.navigate(R.id.action_nav_home_to_nav_reports_detail);
                    break;
                case TICKET_SCREEN:
                    navController.navigate(R.id.action_nav_home_to_nav_list_tickets);
                    break;
                case EMPLOYEE_SCREEN:
                    navController.navigate(R.id.action_nav_home_to_nav_list_employee);
                    break;
                case PARKING_LOTS_SCREEN:
                    navController.navigate(R.id.action_nav_home_to_nav_list_parking_lots);
                    break;
                case SHIFT_MANAGER_SCREEN:
                    navController.navigate(R.id.action_nav_home_to_nav_list_shift_manager);
                    break;
                case CHECK_IN_OUT_VEHICLE:
                    navController.navigate(R.id.action_nav_home_to_nav_checkin_checkout_vehicle);
                    break;
                default:
                    break;
            }
        });
    }

    @Override
    protected void bindToViewModel() {
        homeViewModel.getListScreenEntries().observe(this, listScreenEntries -> {
            homeAdapter.submitList(listScreenEntries);
        });
    }
}