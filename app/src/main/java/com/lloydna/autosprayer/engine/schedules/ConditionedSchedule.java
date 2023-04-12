package com.lloydna.autosprayer.engine.schedules;

import com.lloydna.autosprayer.engine.schedules.phases.PhaseKind;

public class ConditionedSchedule extends Schedule{
    public ConditionedSchedule(String name){
        this.name = name;
        allowedPhases = PhaseKind.CONDITIONED_PHASE;
    }

    public ConditionedSchedule(){
        this.name = "A conditioned schedule";
        allowedPhases = PhaseKind.CONDITIONED_PHASE;
    }

    @Override
    public boolean checkForValidPhaseDecorator(PhaseKind candidatePhaseKind){
        return candidatePhaseKind == allowedPhases;
    }

}
