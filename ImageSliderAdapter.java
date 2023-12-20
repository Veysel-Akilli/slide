package com.example.slide;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;

public class ImageSliderAdapter extends FragmentStatePagerAdapter {

    private final int[] images;

    public ImageSliderAdapter(FragmentManager fm, int[] images) {
        super(fm, BEHAVIOR_RESUME_ONLY_CURRENT_FRAGMENT);
        this.images = images;
    }

    @Override
    public Fragment getItem(int position) {
        return new ImageSliderFragment(images[position]);
    }

    @Override
    public int getCount() {
        return images.length;
    }
}