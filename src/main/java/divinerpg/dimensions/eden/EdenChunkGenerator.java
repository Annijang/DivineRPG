package divinerpg.dimensions.eden;

import divinerpg.dimensions.IslandChunkGeneratorBase;
import divinerpg.registry.BlockRegistry;
import divinerpg.utils.DRPGStructureHandler;
import divinerpg.world.structures.WorldGenCustomStructures;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.WorldEntitySpawner;
import net.minecraft.world.biome.Biome;

public class EdenChunkGenerator extends IslandChunkGeneratorBase {

    private static final DRPGStructureHandler edenStructure = new DRPGStructureHandler("twilight/sunstorm_dungeon");

    public EdenChunkGenerator(World world) {
        super(world, BlockRegistry.twilightStone, BlockRegistry.edenGrass, BlockRegistry.edenDirt);
    }

    @Override
    public void populate(int chunkX, int chunkZ) {
        this.rand.setSeed(this.world.getSeed());
        long k = this.rand.nextLong() / 2L * 2L + 1L;
        long l = this.rand.nextLong() / 2L * 2L + 1L;
        this.rand.setSeed(chunkX * k + chunkZ * l ^ this.world.getSeed());

        int baseX = chunkX * 16 + 1;
        int baseZ = chunkZ * 16 + 1;
        BlockPos pos = new BlockPos(baseX, 0, baseZ);
        Biome biome = this.world.getBiome(new BlockPos(baseX, 0, baseZ));

        if(this.rand.nextInt(30) == 0) {
            int x = baseX + rand.nextInt(16);
            int z = baseZ + rand.nextInt(16);
            int y = world.getHeight(x, z);

            if(this.world.getBlockState(new BlockPos(x + 3, y, z + 3)).getBlock() == BlockRegistry.edenGrass) {
                edenStructure.generate(world, this.rand, new BlockPos(x, y, z));
                System.out.println("Eden structure generated at: " + x + " " + y + " " + z);
            }
        }

        this.rand.setSeed(chunkX * k + chunkZ * l ^ this.world.getSeed());
        biome.decorate(this.world, this.rand, pos);
        WorldEntitySpawner.performWorldGenSpawning(this.world, biome, baseX + 8, baseZ + 8, 16, 16, this.rand);
    }

}
