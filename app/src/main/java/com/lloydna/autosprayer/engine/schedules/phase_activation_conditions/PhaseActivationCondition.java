package com.lloydna.autosprayer.engine.schedules.phase_activation_conditions;

import android.util.Pair;

public abstract class PhaseActivationCondition{
    float minTargetHumidity;
    float maxTargetHumidity;
    int activationHour24Format;
    int deactivationHour24Format;

    public abstract boolean isPhaseNeedToBeActive(float currentHumidity, int currentTime); //probablemente estos parametros ya no se necesiten por el singleton

    public Pair<Float,Float> getMinMaxHumidityParams(){
        return new Pair<>(minTargetHumidity,maxTargetHumidity);
    }

    public Pair<Integer,Integer> getActiveHoursRange24Format(){
        return new Pair<>(0,23);
    }
}
