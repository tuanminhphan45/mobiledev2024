package vn.edu.usth.usthweather;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;


public class HomeFragmentPagerAdapter extends FragmentPagerAdapter {
    private final int PAGE_COUNT = 3;
    private String titles[] = new String[] {"Hanoi", "Paris", "Toulouse"};

    public HomeFragmentPagerAdapter(FragmentManager fm){
        super(fm);
    }

    @Override
    public int getCount(){
        return PAGE_COUNT;
    }

    @Override
    public androidx.fragment.app.Fragment getItem(int page){
        // returns an instance of Fragment corresponding to the specified page
        switch (page){
            case 0: return WeatherFragment.newInstance("","");
            case 1: return WeatherAndForecastFragment.newInstance("","");
            case 2: return ForecastFragment.newInstance("","");
        }
        return new Fragment();
    }

    @Override
    public CharSequence getPageTitle(int page){
        // returns a tab title corresponding to the specified page
        return titles[page];
    }
}
