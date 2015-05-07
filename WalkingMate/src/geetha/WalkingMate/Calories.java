
package geetha.WalkingMate;



public class Calories implements StepListener {

    public interface Listener {
        public void valueChanged(float value);
        public void passValue();
    }
    private Listener mListener;
    
  

    private static double KMCONSTANT = 0.708;
    private static double MILESCONSTANT = 0.517;

    private double mCalories = 0;
    
    WalkingSettings mSettings;
    Utils mUtils;
    
    boolean mIsMetric;
    boolean mIsRunning;
    float mStepLength;
    float mBodyWeight;

    public Calories(Listener listener, WalkingSettings settings, Utils utils) {
        mListener = listener;
        mUtils = utils;
        mSettings = settings;
        reloadSettings();
    }
    public void setCalories(float calories) {
        mCalories = calories;
        notifyListener();
    }
    public void reloadSettings() {
        mIsMetric = mSettings.isMetric();
        mIsRunning = mSettings.isRunning();
        mStepLength = mSettings.getStepLength();
        mBodyWeight = mSettings.getBodyWeight();
        notifyListener();
    }
    public void resetValues() {
        mCalories = 0;
    }
    
    public void isMetric(boolean isMetric) {
        mIsMetric = isMetric;
    }
    public void setStepLength(float stepLength) {
        mStepLength = stepLength;
    }
    
    public void onStep() {
        
        if (mIsMetric) {
            mCalories += 
                (mBodyWeight * ( KMCONSTANT))
                // Distance:
                * mStepLength // centimeters
                / 100000.0; // centimeters/kilometer
        }
        else {
            mCalories += 
                (mBodyWeight * ( MILESCONSTANT))
                // Distance:
                * mStepLength // inches
                / 63360.0; // inches/mile            
        }
        
        notifyListener();
    }
    
    private void notifyListener() {
        mListener.valueChanged((float)mCalories);
    }
    
    public void passValue() {
        
    }
    
    
        
    
    

}

