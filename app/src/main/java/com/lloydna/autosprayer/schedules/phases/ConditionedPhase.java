package com.lloydna.autosprayer.schedules.phases;

import com.lloydna.autosprayer.schedules.phase_activation_conditions.ConditionedPhaseActivationCondition;
import com.lloydna.autosprayer.schedules.phase_activation_conditions.PhaseActivationCondition;

public class ConditionedPhase extends Phase{

    public ConditionedPhase(float minTargetHumidity,float maxTargetHumidity){
        activationCondition = new ConditionedPhaseActivationCondition(minTargetHumidity,maxTargetHumidity);
    }
    public ConditionedPhase(ConditionedPhaseActivationCondition activationCondition){
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
