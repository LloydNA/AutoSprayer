package com.lloydna.autosprayer.schedules;

import com.lloydna.autosprayer.schedules.phases.PhaseKind;

public class TimedSchedule extends Schedule{
    public TimedSchedule(String name){
        this.name = name;
        allowedPhases = PhaseKind.TIMED_PHASE;
        schedule = null;
    }

    public TimedSchedule(){
        this.name = "A timed schedule";
        allowedPhases = PhaseKind.TIMED_PHASE;
        schedule = null;
    }

    @Override
    public boolean checkForValidPhaseDecorator(PhaseKind candidatePhaseKind){
        return candidatePhaseKind == allowedPhases;
    }
}
