package com.lloydna.autosprayer.schedules.phases;

import com.lloydna.autosprayer.schedules.Schedule;
import com.lloydna.autosprayer.schedules.phase_activation_conditions.PhaseActivationCondition;

public abstract class Phase extends Schedule { //talvez esto cambie por el singleton utilitario
    PhaseActivationCondition activationCondition;

    public abstract void enablePhaseIfNeeded();
}
