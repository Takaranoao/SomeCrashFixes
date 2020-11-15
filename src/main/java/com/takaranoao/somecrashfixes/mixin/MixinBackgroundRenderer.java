package com.takaranoao.somecrashfixes.mixin;

import net.minecraft.client.render.BackgroundRenderer;
import net.minecraft.client.render.Camera;
import net.minecraft.client.world.ClientWorld;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(BackgroundRenderer.class)
public abstract class MixinBackgroundRenderer {
    @Inject(method = "render", at = @At("INVOKE"), cancellable = true)
    private static void MixinRender(Camera camera, float f, ClientWorld clientWorld, int i, float g, CallbackInfo ci) {
        if (!camera.isReady() || camera.getFocusedEntity() == null) ci.cancel();
    }
}
