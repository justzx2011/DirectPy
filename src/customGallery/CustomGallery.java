package customGallery;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.widget.Gallery;

public class CustomGallery extends Gallery {
	public CustomGallery(Context context, AttributeSet attrs) {
		super(context, attrs);
	}
	public boolean onFling (MotionEvent e1, MotionEvent e2, float velocityX, float velocityY) {
		return false;
	}
}