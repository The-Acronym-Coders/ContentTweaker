package com.blamejared.contenttweaker.items.functions;

import com.blamejared.contenttweaker.items.wrappers.*;
import com.blamejared.crafttweaker.api.annotations.*;
import com.blamejared.crafttweaker.api.item.*;
import com.blamejared.crafttweaker.impl.blocks.*;
import com.blamejared.crafttweaker.impl.entity.player.*;
import org.openzen.zencode.java.*;

@ZenRegister
@FunctionalInterface
@ZenCodeType.Name("mods.contenttweaker.item.ToolTypeFunction")
public interface ToolTypeFunction {
    @ZenCodeType.Method
    int getHarvestLevel(IItemStack stack, MCToolType type, @ZenCodeType.Nullable MCPlayerEntity playerEntity, @ZenCodeType.Nullable MCBlockState state);
}
