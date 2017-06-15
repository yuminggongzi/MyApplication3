package com.example.dazhongdianping.UI.Adapter;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;

import com.example.dazhongdianping.UI.Fragment.FragmentFour;
import com.example.dazhongdianping.UI.Fragment.FragmentThere;
import com.example.dazhongdianping.UI.Fragment.FragmentTow;
import com.example.dazhongdianping.UI.Fragment.Fragmentone;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by tarenar on 2017/6/15.
 */

public class IndexAdapter extends FragmentPagerAdapter {
    List<Fragment> fragmentList;
    public IndexAdapter(FragmentManager fm) {
        super(fm);
        fragmentList = new ArrayList<Fragment>();
        fragmentList.add(new Fragmentone());
        fragmentList.add(new FragmentTow());
        fragmentList.add(new FragmentThere());
        fragmentList.add(new FragmentFour());
    }

    @Override
    public Fragment getItem(int position) {
        return null;
    }

    @Override
    public int getCount() {
        return 0;
    }
}
