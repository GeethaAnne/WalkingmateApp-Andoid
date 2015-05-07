

package geetha.WalkingMate;

import geetha.WalkingMate.R;
import android.content.Context;
import android.preference.EditTextPreference;
import android.util.AttributeSet;


public class Weight extends MetricsEdit {

	public Weight(Context context) {
		super(context);
	}
	public Weight(Context context, AttributeSet attr) {
		super(context, attr);
	}
	public Weight(Context context, AttributeSet attr, int defStyle) {
		super(context, attr, defStyle);
	}

	protected void initPreferenceDetails() {
		mTitleResource = R.string.body_weight_setting_title;
		mMetricUnitsResource = R.string.kilograms;
		mImperialUnitsResource = R.string.pounds;
	}
}

