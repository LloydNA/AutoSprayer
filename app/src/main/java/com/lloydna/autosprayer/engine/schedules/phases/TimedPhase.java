package com.lloydna.autosprayer.engine.schedules.phases;

import com.lloydna.autosprayer.engine.schedules.phase_activation_conditions.TimedPhaseActivationCondition;

public class TimedPhase extends Phase{
    public TimedPhase(float minTargetHumidity,float maxTargetHumidity, int activationHour24Format, int deactivationHour24Format){
        activationCondition = new TimedPhaseActivationCondition(minTargetHumidity,maxTargetHumidity,activationHour24Format,deactivationHour24Format);
    }
    public TimedPhase(TimedPhaseActivationCondition activationCondition){
        this.activationCondition = activationCondition;
    }

    @Override
    public void enablePhaseIfNeeded() { //singleton pending
        //TODO
    }

    @Override
    public boolean checkForValidPhaseDecorator(PhaseKind candidatePhaseKind) {
        return true;
    }

    @Override
    public boolean checkForValidPhaseDecorator() {
        return schedule.checkForValidPhaseDecorator(PhaseKind.TIMED_PHASE);
    }
}
