
package com.huawei.codelab;

import com.huawei.codelab.slice.DrawAbilitySlice;

import ohos.aafwk.ability.Ability;
import ohos.aafwk.content.Intent;

/**
 * MainAbility
 *
 * @since 2021-04-06
 */
public class DrawAbility extends Ability {
    @Override
    public void onStart(Intent intent) {
        super.onStart(intent);
        super.setMainRoute(DrawAbilitySlice.class.getName());
    }
}
