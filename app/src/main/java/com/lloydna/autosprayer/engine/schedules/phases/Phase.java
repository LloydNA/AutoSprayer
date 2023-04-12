package com.lloydna.autosprayer.engine.schedules.phases;

import com.lloydna.autosprayer.engine.schedules.Schedule;

public abstract class Phase extends Schedule { //talvez esto cambie por el singleton utilitario
    Schedule schedule;

    @Override
    public abstract void enablePhaseIfNeeded();

    @Override
    public abstract boolean checkForValidPhaseDecorator(PhaseKind candidatePhaseKind);

    @Override
    public abstract boolean checkForValidPhaseDecorator();
}
