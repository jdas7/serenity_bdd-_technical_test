package com.falabella.config;

import net.thucydides.core.annotations.Steps;
import com.falabella.utils.data.DataProvider;

public abstract class StepBase {
    @Steps(shared = true)
    protected DataProvider dataProvider;
}
