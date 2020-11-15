# SomeCrashFixes

fix
```
---- Minecraft Crash Report ----
// There are four lights!

Time: 11/15/20, 8:44 AM
Description: Unexpected error

java.lang.NullPointerException: Unexpected error
	at net.optifine.CustomColors.getWorldSkyColor(CustomColors.java:1537)
	at net.minecraft.class_758.method_3210(class_758.java:89)
	at com.mamiyaotaru.voxelmap.Map.getSkyColor(Map.java:1037)
	at com.mamiyaotaru.voxelmap.Map.calculateCurrentLightAndSkyColor(Map.java:1008)
	at com.mamiyaotaru.voxelmap.Map.onTickInGame(Map.java:703)
	at com.mamiyaotaru.voxelmap.VoxelMap.onTickInGame(VoxelMap.java:189)
	at com.mamiyaotaru.voxelmap.fabricmod.FabricModVoxelMap.renderOverlay(FabricModVoxelMap.java:74)
	at net.minecraft.class_329.handler$zfh000$onRenderGameOverlay(class_329.java:2831)
	at net.minecraft.class_329.method_1753(class_329.java:439)
	at net.minecraft.class_757.method_3192(class_757.java:765)
	at net.minecraft.class_310.method_1523(class_310.java:1048)
	at net.minecraft.class_310.method_1514(class_310.java:681)
	at net.minecraft.client.main.Main.main(Main.java:215)
	at java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke0(Native Method)
	at java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:62)
	at java.base/jdk.internal.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)
	at java.base/java.lang.reflect.Method.invoke(Method.java:566)
	at net.fabricmc.loader.game.MinecraftGameProvider.launch(MinecraftGameProvider.java:224)
	at net.fabricmc.loader.launch.knot.Knot.init(Knot.java:141)
	at net.fabricmc.loader.launch.knot.KnotClient.main(KnotClient.java:27)
	at java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke0(Native Method)
	at java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:62)
	at java.base/jdk.internal.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)
	at java.base/java.lang.reflect.Method.invoke(Method.java:566)
	at org.multimc.onesix.OneSixLauncher.launchWithMainClass(OneSixLauncher.java:196)
	at org.multimc.onesix.OneSixLauncher.launch(OneSixLauncher.java:231)
	at org.multimc.EntryPoint.listen(EntryPoint.java:143)
	at org.multimc.EntryPoint.main(EntryPoint.java:34)
```
