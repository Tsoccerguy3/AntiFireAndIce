package pw.uyjulian.AntiFireAndIce.litemod;

import com.mumfrey.liteloader.core.runtime.Obf;

public class ObfTableAntiFireAndIce extends Obf {
	public static ObfTableAntiFireAndIce BlockIce = new ObfTableAntiFireAndIce("net/minecraft/block/BlockIce","axb");
	public static ObfTableAntiFireAndIce BlockFire = new ObfTableAntiFireAndIce("net/minecraft/block/BlockFire","avx");
	public static ObfTableAntiFireAndIce World = new ObfTableAntiFireAndIce("net/minecraft/world/World","aqu");
	public static ObfTableAntiFireAndIce BlockPos = new ObfTableAntiFireAndIce("net/minecraft/util/BlockPos","dt");
	public static ObfTableAntiFireAndIce IBlockState = new ObfTableAntiFireAndIce("net/minecraft/block/state/IBlockState","bec");

	public static ObfTableAntiFireAndIce BlockFire_init = new ObfTableAntiFireAndIce("func_149843_e","j", "init");
	public static ObfTableAntiFireAndIce BlockIce_updateTick = new ObfTableAntiFireAndIce("func_180650_b","b", "updateTick");
	
	
	protected ObfTableAntiFireAndIce(String seargeName, String obfName) {
		super(seargeName, obfName);
	}
	
	protected ObfTableAntiFireAndIce(String seargeName, String obfName, String mcpName) {
		super(seargeName, obfName, mcpName);
	}
}
