package com.lloydna.autosprayer.schedules.phase_activation_conditions;

public class ConditionedPhaseActivationCondition extends PhaseActivationCondition{
    public ConditionedPhaseActivationCondition(float minTargetHumidity,float maxTargetHumidity){
        this.minTargetHumidity = minTargetHumidity;
        this.maxTargetHumidity = maxTargetHumidity;
    }

    @Override
    public boolean isPhaseNeedToBeActive(float currentHumidity,int currentTime){
        return currentHumidity<minTargetHumidity || currentHumidity>maxTargetHumidity;
    }
}
