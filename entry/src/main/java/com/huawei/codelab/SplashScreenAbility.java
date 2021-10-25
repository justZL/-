package com.huawei.codelab;

import com.huawei.codelab.slice.SplashScreenAbilitySlice;
import ohos.aafwk.ability.Ability;
import ohos.aafwk.content.Intent;

public class SplashScreenAbility extends Ability {
    @Override
    public void onStart(Intent intent) {
        super.onStart(intent);
        super.setMainRoute(SplashScreenAbilitySlice.class.getName());
    }
}