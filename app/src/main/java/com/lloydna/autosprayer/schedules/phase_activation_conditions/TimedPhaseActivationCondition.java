package com.lloydna.autosprayer.schedules.phase_activation_conditions;

import android.util.Pair;

public class TimedPhaseActivationCondition extends PhaseActivationCondition{
    public TimedPhaseActivationCondition(float minTargetHumidity,float maxTargetHumidity, int activationHour24Format, int deactivationHour24Format){
        this.minTargetHumidity = minTargetHumidity;
        this.maxTargetHumidity = maxTargetHumidity;
        this.activationHour24Format = activationHour24Format;
        this.deactivationHour24Format = deactivationHour24Format;
    }

    @Override
    public boolean isPhaseNeedToBeActive(float currentHumidity, int currentTime){
        return currentTime>=activationHour24Format && currentTime<deactivationHour24Format && (currentHumidity<minTargetHumidity || currentHumidity>maxTargetHumidity);
    }

    @Override
    public Pair<Integer,Integer> getActiveHoursRange24Format(){
        return new Pair<>(activationHour24Format,deactivationHour24Format);
    }

}
