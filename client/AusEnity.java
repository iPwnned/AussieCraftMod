
package aussiecraft.client;

import net.minecraft.entity.EnumCreatureAttribute;
import net.minecraft.entity.ai.EntityAIAttackOnCollide;
import net.minecraft.entity.ai.EntityAIBreakDoor;
import net.minecraft.entity.ai.EntityAIHurtByTarget;
import net.minecraft.entity.ai.EntityAILookIdle;
import net.minecraft.entity.ai.EntityAIMoveThroughVillage;
import net.minecraft.entity.ai.EntityAIMoveTwardsRestriction;
import net.minecraft.entity.ai.EntityAINearestAttackableTarget;
import net.minecraft.entity.ai.EntityAISwimming;
import net.minecraft.entity.ai.EntityAIWander;
import net.minecraft.entity.ai.EntityAIWatchClosest;
import net.minecraft.entity.monster.EntityMob;
import net.minecraft.entity.passive.EntityVillager;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.world.World;

public class AusEnity extends EntityMob{

	public AusEnity(World par1World) {
		super(par1World);
this.texture = "/Mod/mobs/me.png";
this.moveSpeed = 0.5F;
this.getNavigator().setBreakDoors(true);
this.tasks.addTask(0, new EntityAISwimming(this));
this.tasks.addTask(1, new EntityAIBreakDoor(this));
this.tasks.addTask(2, new EntityAIAttackOnCollide(this, EntityPlayer.class, this.moveSpeed, false));
this.tasks.addTask(3, new EntityAIAttackOnCollide(this, EntityVillager.class, this.moveSpeed, true));
this.tasks.addTask(4, new EntityAIMoveTwardsRestriction(this, this.moveSpeed));
this.tasks.addTask(5, new EntityAIMoveThroughVillage(this, this.moveSpeed, false));
this.tasks.addTask(6, new EntityAIWander(this, this.moveSpeed));
this.tasks.addTask(7, new EntityAIWatchClosest(this, EntityPlayer.class, 8.0F));
this.tasks.addTask(7, new EntityAILookIdle(this));
this.targetTasks.addTask(1, new EntityAIHurtByTarget(this, false));
this.targetTasks.addTask(2, new EntityAINearestAttackableTarget(this, EntityPlayer.class, 16.0F, 0, true));
this.targetTasks.addTask(2, new EntityAINearestAttackableTarget(this, EntityVillager.class, 16.0F, 0, false));
	}

	@Override
	public int getMaxHealth() {
		return 20;
	}
public int getAttackStrength(){
		return 4;
	}

    public int getTotalArmorValue()
    {
    	return 4;
    }

 public EnumCreatureAttribute getCreatureAttribute(){
    	return EnumCreatureAttribute.UNDEAD;
    }
}