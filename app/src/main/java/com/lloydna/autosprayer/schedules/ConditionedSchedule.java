package com.lloydna.autosprayer.schedules;

import com.lloydna.autosprayer.schedules.phases.PhaseKind;

public class ConditionedSchedule extends Schedule{
    public ConditionedSchedule(String name){
        this.name = name;
        allowedPhases = PhaseKind.CONDITIONED_PHASE;
        schedule = null;
    }

    public ConditionedSchedule(){
        this.name = "A conditioned schedule";
        allowedPhases = PhaseKind.CONDITIONED_PHASE;
        schedule = null;
    }

    @Override
    public boolean checkForValidPhaseDecorator(PhaseKind candidatePhaseKind){
        return candidatePhaseKind == allowedPhases;
    }
}
