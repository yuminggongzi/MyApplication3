package com.example.freezufang;

import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.RadioGroup;

import com.example.freezufang.Adapter.MyFragmetPagerAdapter.MyFragmetPagerAdapter;
import com.example.freezufang.fragment.FabuFragment;
import com.example.freezufang.fragment.FujinFragment;
import com.example.freezufang.fragment.IndexFragment;
import com.example.freezufang.fragment.WodeFragment;

public class MainActivity extends AppCompatActivity {
    ViewPager viewPager;
    MyFragmetPagerAdapter adapter = null;
    RadioGroup radioGroup;
    FabuFragment fabu_fragment;
    FujinFragment fujin_fragment;
    IndexFragment index_fragment;
    WodeFragment wode_fragment;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initialFragments();
        setListener();
    }
    private void setListener() {
        viewPager.addOnPageChangeListener(new ViewPager.OnPageChangeListener() {
            @Override
            public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {
            }

            @Override
            public void onPageSelected(int position) {
                switch (position) {
                    case 0:
                        //第一个页面被选中
                        //把第一个单选按钮的选中状态设置真
                        radioGroup.check(R.id.radiobutton_index);
                        break;
                    case 1:
                        radioGroup.check(R.id.radiobutton_fabu);
                        break;
                    case 2:
                        radioGroup.check(R.id.radiobutton_fujin);
                        break;
                    case 3:
                        radioGroup.check(R.id.radiobutton_wode);
                        break;
                    default:
                        break;
                }
            }

            @Override
            public void onPageScrollStateChanged(int state) {
            }
        });
        //为radio_group添加监听
        radioGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(
                    RadioGroup radioGroup,
                    int i) {
                switch (i) {
                    case R.id.radiobutton_index:
                        viewPager.setCurrentItem(0, false);
                        break;
                    case R.id.radiobutton_fabu:
                        viewPager.setCurrentItem(1, false);
                        break;
                    case R.id.radiobutton_fujin:
                        viewPager.setCurrentItem(2,false);
                        break;
                    case R.id.radiobutton_wode:
                        viewPager.setCurrentItem(3,false);
                        break;
                }
            }
        });
    }

    private void initialFragments() {
        radioGroup = (RadioGroup)
                findViewById(R.id.radioGroup_Bottom);
        viewPager = (ViewPager)
                findViewById(R.id.viewPager_Main);
        adapter = new MyFragmetPagerAdapter(
                getSupportFragmentManager());
        fabu_fragment = new FabuFragment();
        fujin_fragment = new FujinFragment();
        index_fragment = new IndexFragment();
        wode_fragment = new WodeFragment();

        //将创建好fragment添加到适配器集合中

        viewPager.setAdapter(adapter);

        adapter.addFragment(index_fragment);
        adapter.addFragment(fujin_fragment);
        adapter.addFragment(fabu_fragment);
        adapter.addFragment(wode_fragment);
        //设置viewpager当前选中项
        viewPager.setCurrentItem(0, true);
    }
}
