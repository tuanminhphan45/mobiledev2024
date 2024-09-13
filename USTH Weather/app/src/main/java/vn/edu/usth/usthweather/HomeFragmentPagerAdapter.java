package vn.edu.usth.usthweather;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.viewpager2.adapter.FragmentStateAdapter;

public class HomeFragmentPagerAdapter extends FragmentStateAdapter {

    public HomeFragmentPagerAdapter(@NonNull FragmentActivity fa) {
        super(fa);
    }

    @NonNull
    @Override
    public Fragment createFragment(int position) {
        switch (position) {
            case 0:
                return new WeatherFragment();
            case 1:
                return new ForecastFragment();
            case 2:
                return new WeatherAndForecastFragment();
            default:
                return new WeatherAndForecastFragment();
        }
    }

    @Override
    public int getItemCount() {
        return 3;
    }
}
