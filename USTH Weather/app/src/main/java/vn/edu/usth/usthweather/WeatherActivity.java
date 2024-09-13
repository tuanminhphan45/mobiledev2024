package vn.edu.usth.usthweather;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.FrameLayout;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager2.widget.ViewPager2;

import com.google.android.material.tabs.TabLayout;
import com.google.android.material.tabs.TabLayoutMediator;

public class WeatherActivity extends AppCompatActivity {
    private static final String TAG = "Weather";
    private TabLayout tabLayout;
    private ViewPager2 viewPager2;
    private HomeFragmentPagerAdapter homeFragmentPagerAdapter;
    private FrameLayout frameLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tabLayout = findViewById(R.id.tabLayout);
        viewPager2 = findViewById(R.id.myViewPager);

        homeFragmentPagerAdapter = new HomeFragmentPagerAdapter(this);
        viewPager2.setAdapter(homeFragmentPagerAdapter);
        frameLayout = findViewById(R.id.frameLayout);


        new TabLayoutMediator(tabLayout, viewPager2, (tab, position) -> {
            switch (position) {
                case 0:
                    tab.setText("Weather");
                    break;
                case 1:
                    tab.setText("Forecast");
                    break;
                case 2:
                    tab.setText("Weather_Forecast");
                    break;
            }
        }).attach();

        viewPager2.registerOnPageChangeCallback(new ViewPager2.OnPageChangeCallback() {
            @Override
            public void onPageSelected(int position) {
                super.onPageSelected(position);
                viewPager2.setVisibility(View.VISIBLE);
                frameLayout.setVisibility(View.GONE);
            }
        });

        Log.i(TAG, "On Create");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.i(TAG, "On Start");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.i(TAG, "On Resume");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.i(TAG, "On Pause");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.i(TAG, "On Stop");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.i(TAG, "On Destroy");
    }
}
