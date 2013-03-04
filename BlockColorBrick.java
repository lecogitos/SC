package SC;

import java.util.Random;
import net.minecraft.block.Block;
import net.minecraft.block.BlockSand;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.Entity;
import net.minecraft.entity.item.EntityFallingSand;
import net.minecraft.util.AxisAlignedBB;
import net.minecraft.util.DamageSource;
import net.minecraft.world.World;

public class BlockColorBrick extends Block
{
    public BlockColorBrick(int par1, int par2)
    {
        super(par1, par2, Material.rock);
        setHardness(2.0F);
        setResistance(10.0F);
        setStepSound(soundStoneFootstep);
        setCreativeTab(CreativeTabs.tabBlock);
        setTextureFile("/SC/terrain.png");
    }
}
