package com.lloydna.autosprayer.schedules.phases;

import com.lloydna.autosprayer.schedules.phase_activation_conditions.ConditionedPhaseActivationCondition;
import com.lloydna.autosprayer.schedules.phase_activation_conditions.PhaseActivationCondition;
import com.lloydna.autosprayer.schedules.phase_activation_conditions.TimedPhaseActivationCondition;

public class TimedPhase extends Phase{
    public TimedPhase(float minTargetHumidity,float maxTargetHumidity, int activationHour24Format, int deactivationHour24Format){
        activationCondition = new TimedPhaseActivationCondition(minTargetHumidity,maxTargetHumidity,activationHour24Format,deactivationHour24Format);
    }
    public TimedPhase(TimedPhaseActivationCondition activationCondition){
        this.activationCondition = activationCondition;
    }

    @Override
    public void enablePhaseIfNeeded() {
        //TODO
    }

    @Override
    public boolean checkForValidPhaseDecorator(PhaseKind candidatePhaseKind) {
        return true;
    }
}
