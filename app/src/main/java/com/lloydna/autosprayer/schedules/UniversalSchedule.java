package com.lloydna.autosprayer.schedules;

import com.lloydna.autosprayer.schedules.phases.PhaseKind;

public class UniversalSchedule extends Schedule{
    public UniversalSchedule(String name){
        this.name = name;
        allowedPhases = PhaseKind.UNIVERSAL_PHASE;
        schedule = null;
    }

    public UniversalSchedule(){
        this.name = "A universal schedule";
        allowedPhases = PhaseKind.UNIVERSAL_PHASE;
        schedule = null;
    }

    @Override
    public boolean checkForValidPhaseDecorator(PhaseKind candidatePhaseKind){
        return true;
    }
}
