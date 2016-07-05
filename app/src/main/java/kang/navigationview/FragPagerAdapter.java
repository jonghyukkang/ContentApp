package kang.navigationview;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.content.ContextCompat;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.style.ImageSpan;

/**
 * Created by kangjonghyuk on 2016. 7. 4..
 */
public class FragPagerAdapter extends FragmentPagerAdapter{
    final int PAGE_COUNT = 2;
    private String tabTitles[] = new String[] { "연락처", "메일"};
    private Context mContext;
    private int[] imageResId = { R.drawable.call, R.drawable.mail};

    public FragPagerAdapter(FragmentManager fm, Context context){
        super(fm);
        this.mContext = context;
    }

    @Override
    public int getCount() {
        return PAGE_COUNT;
    }

    @Override
    public Fragment getItem(int position) {
        Fragment fragment;

        switch(position){
            case 0 :
                fragment = new Fragment_phone();
                return fragment;
            case 1 :
                fragment = new Fragment_mail();
                return fragment;
        }
        return null;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        Drawable image = mContext.getResources().getDrawable(imageResId[position]);
        image.setBounds(0, 0, image.getIntrinsicWidth(), image.getIntrinsicHeight());

        SpannableString sb = new SpannableString("     " + tabTitles[position]);
        ImageSpan imageSpan = new ImageSpan(image, ImageSpan.ALIGN_BASELINE);
        sb.setSpan(imageSpan, 0, 2, Spannable.SPAN_EXCLUSIVE_EXCLUSIVE);

        return sb;
    }
}
