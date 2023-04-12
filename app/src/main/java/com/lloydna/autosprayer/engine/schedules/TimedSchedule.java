package com.lloydna.autosprayer.engine.schedules;

import com.lloydna.autosprayer.engine.schedules.phases.PhaseKind;

public class TimedSchedule extends Schedule{
    public TimedSchedule(String name){
        this.name = name;
        allowedPhases = PhaseKind.TIMED_PHASE;
    }

    public TimedSchedule(){
        this.name = "A timed schedule";
        allowedPhases = PhaseKind.TIMED_PHASE;
    }

    @Override
    public boolean checkForValidPhaseDecorator(PhaseKind candidatePhaseKind){
        return candidatePhaseKind == allowedPhases;
    }

}
