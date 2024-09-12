package vn.edu.usth.usthweather;

import android.os.Bundle;
import android.util.Log;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.fragment.app.FragmentTransaction;
import androidx.viewpager.widget.PagerAdapter;

public class WeatherActivity extends AppCompatActivity {
    private static final String TAG = "Weather";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        PagerAdapter adapter = new HomeFragmentPagerAdapter(getSupportFragmentManager());
        androidx.viewpager.widget.ViewPager pager = (androidx.viewpager.widget.ViewPager) findViewById(R.id.myViewPager);
        pager.setOffscreenPageLimit(3);
        pager.setAdapter(adapter);

//        WeatherFragment weatherFragment = new WeatherFragment();
//        ForecastFragment forecastFragment = new ForecastFragment();
//
//
//        FragmentTransaction addLayout = getSupportFragmentManager().beginTransaction();
//
//        addLayout.add(R.id.main,weatherFragment);
//        addLayout.add(R.id.main, forecastFragment);
//
//        addLayout.commit();

        Log.i(TAG, "On Create");
    }

    @Override
    protected void onStart(){
        super.onStart();
        Log.i(TAG, "On Start");
    }

    @Override
    protected void onResume(){
        super.onResume();
        Log.i(TAG, "On Resume");
    }

    @Override
    protected void onPause(){
        super.onPause();
        Log.i(TAG, "On Pause");
    }

    @Override
    protected void onStop(){
        super.onStop();
        Log.i(TAG, "On Stop");
    }

    @Override
    protected void onDestroy(){
        super.onDestroy();
        Log.i(TAG, "On Destroy");
    }
}