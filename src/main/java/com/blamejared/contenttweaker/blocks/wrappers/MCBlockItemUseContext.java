package com.blamejared.contenttweaker.blocks.wrappers;

import com.blamejared.crafttweaker.api.annotations.*;
import com.blamejared.crafttweaker.api.item.*;
import com.blamejared.crafttweaker.impl.entity.player.*;
import com.blamejared.crafttweaker.impl.item.*;
import com.blamejared.crafttweaker.impl.util.*;
import net.minecraft.item.*;
import net.minecraft.util.math.*;
import org.openzen.zencode.java.*;

import javax.annotation.*;
import java.util.*;

@ZenRegister
@ZenCodeType.Name("mods.contenttweaker.block.MCBlockItemUseContext")
public class MCBlockItemUseContext {
    
    private final BlockItemUseContext internal;
    
    public MCBlockItemUseContext(BlockItemUseContext internal) {
        this.internal = internal;
    }
    
    @ZenCodeType.Method
    @ZenCodeType.Getter("internal")
    public BlockItemUseContext getInternal() {
        return internal;
    }
    
    @ZenCodeType.Method
    @ZenCodeType.Getter("pos")
    public MCBlockPos getPos() {
        final BlockPos pos = internal.getPos();
        return new MCBlockPos(pos);
    }
    
    @ZenCodeType.Method
    @ZenCodeType.Getter("canPlace")
    public boolean canPlace() {
        return internal.canPlace();
    }
    
    @ZenCodeType.Method
    @ZenCodeType.Getter("replacingClickedOnBlock")
    public boolean replacingClickedOnBlock() {
        return internal.replacingClickedOnBlock();
    }
    
    @ZenCodeType.Method
    @ZenCodeType.Getter("nearestLookingDirection")
    public MCDirection getNearestLookingDirection() {
        return new MCDirection(internal.getNearestLookingDirection());
    }
    
    @ZenCodeType.Method
    @ZenCodeType.Getter("nearestLookingDirections")
    public MCDirection[] getNearestLookingDirections() {
        return Arrays.stream(internal.getNearestLookingDirections())
                .map(MCDirection::new)
                .toArray(MCDirection[]::new);
    }
    
    @ZenCodeType.Method
    @ZenCodeType.Getter("face")
    public MCDirection getFace() {
        return new MCDirection(internal.getFace());
    }
    
    /*
    @ZenCodeType.Getter
    @ZenCodeType.Method
    public Vec3d getHitVec() {
        return internal.getHitVec();
    }
     */
    
    @ZenCodeType.Method
    @ZenCodeType.Getter
    public boolean func_221533_k() {
        return internal.func_221533_k();
    }
    
    @ZenCodeType.Method
    @ZenCodeType.Getter("item")
    public IItemStack getItem() {
        return new MCItemStackMutable(internal.getItem());
    }
    
    
    @Nullable
    @ZenCodeType.Method
    @ZenCodeType.Getter("player")
    public MCPlayerEntity getPlayer() {
        return new MCPlayerEntity(internal.getPlayer());
    }
    
    /*
    @ZenCodeType.Getter
    @ZenCodeType.Method
    public Hand getHand() {
        return internal.getHand();
    }
    
    @Getter
    @Method
    public MCWorld getWorld() {
        return internal.getWorld();
    }
    
     */
    
    @ZenCodeType.Method
    @ZenCodeType.Getter("placementHorizontalFacint")
    public MCDirection getPlacementHorizontalFacing() {
        return new MCDirection(internal.getPlacementHorizontalFacing());
    }
    
    @ZenCodeType.Method
    @ZenCodeType.Getter("playerSneaking")
    public boolean isPlacerSneaking() {
        return internal.isPlacerSneaking();
    }
    
    @ZenCodeType.Method
    @ZenCodeType.Getter("placementYaw")
    public float getPlacementYaw() {
        return internal.getPlacementYaw();
    }
}
