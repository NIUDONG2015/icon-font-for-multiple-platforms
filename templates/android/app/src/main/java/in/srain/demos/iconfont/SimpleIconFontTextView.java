package in.srain.demos.iconfont;

import android.content.Context;
import android.graphics.Typeface;
import android.util.AttributeSet;
import android.widget.TextView;

public class SimpleIconFontTextView extends TextView {
    static Typeface sTypeface;

    public SimpleIconFontTextView(Context context) {
        super(context);
        initView();
    }

    public SimpleIconFontTextView(Context context, AttributeSet attrs) {
        super(context, attrs);
        initView();
    }

    public SimpleIconFontTextView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        initView();
    }

    private void initView() {
        if (sTypeface == null) {
            // "$font_name".ttf
            sTypeface = Typeface.createFromAsset(getContext().getAssets(), "{{ font_name }}.ttf");
        }
        setTypeface(sTypeface);
    }
}
