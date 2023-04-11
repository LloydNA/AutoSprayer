package com.lloydna.autosprayer.schedules;

import com.lloydna.autosprayer.schedules.phase_activation_conditions.PhaseActivationCondition;
import com.lloydna.autosprayer.schedules.phases.PhaseKind;

import java.util.ArrayList;
import java.util.List;

public abstract class Schedule{
    public static int MAX_PHASES = 4;

    String name = "error schedule!";
    PhaseKind allowedPhases;

    Schedule schedule;
    PhaseActivationCondition activationCondition;

    public List<Schedule> getPeriods(){
        List<Schedule> periods = new ArrayList<>();

        if(schedule != null)
            periods.addAll(schedule.getPeriods());

        return periods;
    }

    public abstract boolean checkForValidPhaseDecorator(PhaseKind candidatePhaseKind);

    //schedules can be decorated by phases, and there will be two phase kinds for now in each phase, strategy for activation condition
}

