package com.lloydna.autosprayer.engine.schedules.phases;

import com.lloydna.autosprayer.engine.schedules.phase_activation_conditions.ConditionedPhaseActivationCondition;

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
        return schedule.checkForValidPhaseDecorator();
    }

    @Override
    public boolean checkForValidPhaseDecorator() {
        return schedule.checkForValidPhaseDecorator(PhaseKind.CONDITIONED_PHASE);
    }
}
