package com.example.appneww;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;

import com.example.appneww.suckhoe.suckhoeFragment;
import com.example.appneww.thegioi.thegioiFragment;
import com.example.appneww.thoisu.thoisuFragment;

public class ViewPagerAdapter extends FragmentStatePagerAdapter {

public ViewPagerAdapter(@NonNull FragmentManager fm, int behavior) {
    super(fm, behavior);
}

@NonNull
@Override
public Fragment getItem(int position) {
    switch (position){
        case 0:
            return new suckhoeFragment();
        case 1:
            return new thegioiFragment();
        case 2:
            return new thoisuFragment();
        default:
            return new suckhoeFragment();
    }

}

@Override
public int getCount() {
    return 3;
}

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        String title = "";
        switch (position){
            case 0:
                title = "suckhoe";
                break;
            case 1:
                title = "thegioi";
                break;
            case 2:
                title = "thoisu";
                break;
        }
        return title;
    }
}
