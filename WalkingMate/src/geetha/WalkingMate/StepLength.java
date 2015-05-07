
package geetha.WalkingMate;

import geetha.WalkingMate.R;
import android.content.Context;
import android.preference.EditTextPreference;
import android.util.AttributeSet;


public class StepLength extends MetricsEdit {

	public StepLength(Context context) {
		super(context);
	}
	public StepLength(Context context, AttributeSet attr) {
		super(context, attr);
	}
	public StepLength(Context context, AttributeSet attr, int defStyle) {
		super(context, attr, defStyle);
	}

	protected void initPreferenceDetails() {
		mTitleResource = R.string.step_length_setting_title;
		mMetricUnitsResource = R.string.centimeters;
		mImperialUnitsResource = R.string.inches;
	}
}

