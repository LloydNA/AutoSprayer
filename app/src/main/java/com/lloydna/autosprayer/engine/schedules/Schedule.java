package com.lloydna.autosprayer.engine.schedules;

import android.util.Log;

import com.lloydna.autosprayer.engine.schedules.phase_activation_conditions.PhaseActivationCondition;
import com.lloydna.autosprayer.engine.schedules.phases.PhaseKind;

import java.util.List;

public abstract class Schedule{
    public static int MAX_PHASES = 4;

    protected String name = "error schedule!";
    protected PhaseKind allowedPhases;
    protected PhaseActivationCondition activationCondition;

    public String getName(){
        return name;
    }
    public List<Schedule> getPeriods(){
        return null;
    }

    public abstract boolean checkForValidPhaseDecorator(PhaseKind candidatePhaseKind);
    public boolean checkForValidPhaseDecorator(){
        return true;
    }

    public void enablePhaseIfNeeded(){
        Log.i(ConditionedSchedule.class.getName(),"No remaining phases to enable");
    };

    //schedules can be decorated by phases, and there will be two phase kinds for now in each phase, strategy for activation condition
}

