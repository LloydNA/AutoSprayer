package com.lloydna.autosprayer.engine.schedules;

import com.lloydna.autosprayer.engine.schedules.phases.PhaseKind;

public class UniversalSchedule extends Schedule{
    public UniversalSchedule(String name){
        this.name = name;
        allowedPhases = PhaseKind.UNIVERSAL_PHASE;
    }

    public UniversalSchedule(){
        this.name = "A universal schedule";
        allowedPhases = PhaseKind.UNIVERSAL_PHASE;
    }

    @Override
    public boolean checkForValidPhaseDecorator(PhaseKind candidatePhaseKind){
        return true;
    }

}
