package pw.uyjulian.AntiFireAndIce.litemod;

import java.util.Random;

import com.mumfrey.liteloader.transformers.event.Event;
import com.mumfrey.liteloader.transformers.event.EventInjectionTransformer;
import com.mumfrey.liteloader.transformers.event.MethodInfo;
import com.mumfrey.liteloader.transformers.event.inject.MethodHead;

public class EventTransformerAntiFireAndIce extends EventInjectionTransformer {

	@Override
	protected void addEvents() {
		this.addEvent(Event.getOrCreate("FireAndIce_BlockFire_init", true), new MethodInfo(ObfTableAntiFireAndIce.BlockFire, ObfTableAntiFireAndIce.BlockFire_init, Void.TYPE), new MethodHead()).addListener(new MethodInfo("pw.uyjulian.FireAndIce.litemod.LiteModAntiFireAndIce", "BlockFireInit"));
		this.addEvent(Event.getOrCreate("FireAndIce_BlockIce_UpdateTick", true), new MethodInfo(ObfTableAntiFireAndIce.BlockIce, ObfTableAntiFireAndIce.BlockIce_updateTick, Void.TYPE, ObfTableAntiFireAndIce.World, ObfTableAntiFireAndIce.BlockPos, ObfTableAntiFireAndIce.IBlockState, "java/util/Random"), new MethodHead()).addListener(new MethodInfo("pw.uyjulian.FireAndIce.litemod.LiteModAntiFireAndIce", "BlockFireInit"));
		
	}

}
