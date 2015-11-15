package pw.uyjulian.AntiFireAndIce.litemod;

import java.io.File;
import java.util.Random;

import net.minecraft.block.BlockFire;
import net.minecraft.block.BlockIce;
import net.minecraft.block.state.IBlockState;
import net.minecraft.util.BlockPos;
import net.minecraft.world.World;

import com.mumfrey.liteloader.LiteMod;
import com.mumfrey.liteloader.transformers.event.EventInfo;

public class LiteModAntiFireAndIce implements LiteMod {

	@Override
	public String getName() {
		return "LiteModFireAndIce";
	}

	@Override
	public String getVersion() {
		return "v1.0";
	}

	@Override
	public void init(File configPath) {

	}

	@Override
	public void upgradeSettings(String version, File configPath, File oldConfigPath) {

	}
	
	public static void BlockFireInit(EventInfo<BlockFire> eventinfo) {
		eventinfo.cancel();
	}
	
	public static void BlockIceUpdateTick(EventInfo<BlockIce> eventinfo, World worldIn, BlockPos pos, IBlockState state, Random rand) {
		eventinfo.cancel(); 
	}

}
