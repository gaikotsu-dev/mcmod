package com.sample.mod.entity;

import net.minecraft.entity.EntityAgeable;
import net.minecraft.entity.EntityLiving;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.ai.EntityAIAvoidEntity;
import net.minecraft.entity.ai.EntityAIFollowParent;
import net.minecraft.entity.ai.EntityAILookIdle;
import net.minecraft.entity.ai.EntityAIMate;
import net.minecraft.entity.ai.EntityAIPanic;
import net.minecraft.entity.ai.EntityAISwimming;
import net.minecraft.entity.ai.EntityAITempt;
import net.minecraft.entity.ai.EntityAIWatchClosest2;
import net.minecraft.entity.item.EntityItem;
import net.minecraft.entity.passive.EntityAnimal;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.DamageSource;
import net.minecraft.util.EnumHand;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.SoundEvent;
import net.minecraft.util.datafix.DataFixer;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.MathHelper;
import net.minecraft.world.World;

public class EntitySample extends EntityAnimal {

    private BlockPos spawnPosition;
    int counter=0;

    public EntitySample(World worldIn)
    {
        super(worldIn);
        super.setSize(1.0F, 1.0F);
    }

    public static void registerFixesSample(DataFixer fixer)
    {
        EntityLiving.registerFixesMob(fixer, EntitySample.class);
    }

    @SuppressWarnings({ "unchecked", "rawtypes" })
    protected void initEntityAI()
    {
        this.tasks.addTask(0, new EntityAISwimming(this));
        this.tasks.addTask(1, new EntityAIPanic(this, 2.0D));
        this.tasks.addTask(1, new EntityAITempt(this, 1.25D, Items.DIAMOND, false));
        this.tasks.addTask(2, new EntityAIMate(this, 1.0D));
        this.tasks.addTask(3, new EntityAITempt(this, 1.25D, Items.WHEAT, false));
        this.tasks.addTask(3, new EntityAIAvoidEntity(this, EntityPlayer.class, 8F, 1.8D, 2.4D));
        this.tasks.addTask(4, new EntityAIFollowParent(this, 1.25D));
        this.tasks.addTask(6, new EntityAIWatchClosest2(this, EntityPlayer.class, 20.0F, 100F));
        this.tasks.addTask(7, new EntityAILookIdle(this));
    }

    public void onUpdate()
    {
        super.onUpdate();

        if(!this.getEntityWorld().isAnyPlayerWithinRangeAt(posX, posY, posZ, 5D))
            this.motionY *= 0.6000000238418579D;

        if(rand.nextInt(10000)<1) {
            if(!world.isRemote)
                this.dropItem(Items.BEEF, 4);
        }
    }

    protected void applyEntityAttributes()
    {
        super.applyEntityAttributes();
        this.getEntityAttribute(SharedMonsterAttributes.MAX_HEALTH).setBaseValue(13.0D);
    }

    protected void updateAITasks()
    {
        super.updateAITasks();
        if (this.spawnPosition != null && (!this.world.isAirBlock(this.spawnPosition) || this.spawnPosition.getY() < 1))
        {
            this.spawnPosition = null;
        }
        if (this.spawnPosition == null || this.rand.nextInt(30) == 0 || this.spawnPosition.distanceSq((double)((int)this.posX), (double)((int)this.posY), (double)((int)this.posZ)) < 4.0D)
        {
            this.spawnPosition = new BlockPos((int)this.posX + this.rand.nextInt(7) - this.rand.nextInt(7), (int)this.posY + this.rand.nextInt(6) - 2, (int)this.posZ + this.rand.nextInt(7) - this.rand.nextInt(7));
        }
        if(!this.getEntityWorld().isAnyPlayerWithinRangeAt(posX, posY, posZ, 5D))
        {
            double d0 = (double)this.spawnPosition.getX() + 0.5D - this.posX;
            double d1 = (double)this.spawnPosition.getY() + 0.1D - this.posY;
            double d2 = (double)this.spawnPosition.getZ() + 0.5D - this.posZ;
            this.motionX += (Math.signum(d0) * 0.5D - this.motionX) * 0.10000000149011612D;
            this.motionY += (Math.signum(d1) * 0.699999988079071D - this.motionY) * 0.10000000149011612D;
            this.motionZ += (Math.signum(d2) * 0.5D - this.motionZ) * 0.10000000149011612D;
            float f = (float)(MathHelper.atan2(this.motionZ, this.motionX) * (180D / Math.PI)) - 90.0F;
            float f1 = MathHelper.wrapDegrees(f - this.rotationYaw);
            this.moveForward = 0.5F;
            this.rotationYaw += f1;
        }
    }

    public void onLivingUpdate()
    {
        super.onLivingUpdate();
        this.world.profiler.startSection("looting");
        if (!this.world.isRemote &&  !this.dead && net.minecraftforge.event.ForgeEventFactory.getMobGriefingEvent(this.world, this))
        {
            for (EntityItem entityitem : this.world.getEntitiesWithinAABB(EntityItem.class, this.getEntityBoundingBox().grow(1.0D, 0.0D, 1.0D)))
            {
                if (!entityitem.isDead && !entityitem.getItem().isEmpty())
                {
                    this.updateEquipmentIfNeeded(entityitem);
                }
            }
        }
        this.world.profiler.endSection();
    }

    protected void updateEquipmentIfNeeded(EntityItem itemEntity)
    {
        ItemStack itemstack = itemEntity.getItem();
        Item item = itemstack.getItem();

        if(item == Items.BEEF && counter>400) {
            itemEntity.setDead();
            world.spawnEntity(new EntityItem(world, posX, posY, posZ, new ItemStack(Blocks.DIAMOND_BLOCK)));
            counter=0;
        }
        counter++;
    }

    public boolean processInteract(EntityPlayer player, EnumHand hand)
    {
        ItemStack itemstack = player.getHeldItem(hand);
        if (itemstack.getItem() == Items.DIAMOND && !this.isChild())
        {

            if (!player.capabilities.isCreativeMode)
            {
                itemstack.shrink(1);
            }

            if(!world.isRemote)
                this.dropItem(Items.GOLDEN_APPLE, 4);
            return true;
        }
        else
        {
            return super.processInteract(player, hand);
        }
    }

    @Override
    public EntityAgeable createChild(EntityAgeable ageable) {
        return new EntitySample(this.world);
    }

    @Override
    public void fall(float distance, float damageMultiplier)
    {
    }

    protected ResourceLocation getLootTable()
    {
        return new ResourceLocation("testmod","sample");
    }

    public float getEyeHeight()
    {
        return this.height;
    }
}
