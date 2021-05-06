package divinerpg.client.models.vanilla;


import com.google.common.collect.*;
import divinerpg.entities.vanilla.overworld.*;
import net.minecraft.client.renderer.entity.model.*;
import net.minecraft.client.renderer.model.*;
import net.minecraft.entity.*;
import net.minecraft.util.math.*;
import net.minecraftforge.api.distmarker.*;

@OnlyIn(Dist.CLIENT)
public class ModelJackOMan<T extends Entity> extends SegmentedModel<T> {
	public final ModelRenderer Head;
	public final ModelRenderer Body;
	public final ModelRenderer RightArm;
	public final ModelRenderer LeftArm;
	public final ModelRenderer RightLeg;
	public final ModelRenderer LeftLeg;
	public float swimAnimation;

	public ModelJackOMan() {
		texWidth = 64;
		texHeight = 64;

		Head = new ModelRenderer(this);
		Head.setPos(0.0F, 0.0F, 0.0F);
		setRotationAngle(Head, -0.1047F, 0.0873F, 0.0F);
		Head.texOffs(0, 0).addBox(-4.0F, -8.0F, -4.0F, 8.0F, 8.0F, 8.0F, 0.0F, false);
		Head.texOffs(32, 0).addBox(-4.0F, -8.0F, -4.0F, 8.0F, 8.0F, 8.0F, 0.5F, false);

		Body = new ModelRenderer(this);
		Body.setPos(0.0F, 0.0F, 0.0F);
		Body.texOffs(16, 16).addBox(-4.0F, 0.0F, -2.0F, 8.0F, 12.0F, 4.0F, 0.0F, false);
		Body.texOffs(16, 32).addBox(-4.0F, 0.0F, -2.0F, 8.0F, 12.0F, 4.0F, 0.25F, false);

		RightArm = new ModelRenderer(this);
		RightArm.setPos(-5.0F, 2.0F, 0.0F);
		setRotationAngle(RightArm, -0.1745F, 0.0F, 0.0F);
		RightArm.texOffs(40, 16).addBox(-3.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F, 0.0F, false);
		RightArm.texOffs(40, 32).addBox(-3.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F, 0.25F, false);

		LeftArm = new ModelRenderer(this);
		LeftArm.setPos(5.0F, 2.0F, 0.0F);
		setRotationAngle(LeftArm, 0.2094F, 0.0F, 0.0F);
		LeftArm.texOffs(32, 48).addBox(-1.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F, 0.0F, false);
		LeftArm.texOffs(48, 48).addBox(-1.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F, 0.25F, false);

		RightLeg = new ModelRenderer(this);
		RightLeg.setPos(-1.9F, 12.0F, 0.0F);
		setRotationAngle(RightLeg, 0.192F, 0.0F, 0.0349F);
		RightLeg.texOffs(0, 16).addBox(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, 0.0F, false);
		RightLeg.texOffs(0, 32).addBox(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, 0.25F, false);

		LeftLeg = new ModelRenderer(this);
		LeftLeg.setPos(1.9F, 12.0F, 0.0F);
		setRotationAngle(LeftLeg, -0.1745F, 0.0F, -0.0349F);
		LeftLeg.texOffs(16, 48).addBox(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, 0.0F, false);
		LeftLeg.texOffs(0, 48).addBox(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, 0.25F, false);
	}

	public void prepareMobModel(T entityIn, float limbSwing, float limbSwingAmount, float partialTick) {
		EntityJackOMan ent = (EntityJackOMan) entityIn;
		this.swimAnimation = ent.getSwimAmount(partialTick);
		super.prepareMobModel(entityIn, limbSwing, limbSwingAmount, partialTick);
	}
	public void setupAnim(T entityIn, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
		boolean flag1 = entityIn.isVisuallySwimming();
		this.Head.yRot = netHeadYaw * ((float)Math.PI / 180F);

		this.Body.yRot = 0.0F;
		this.RightArm.zRot = 0.0F;
		this.RightArm.xRot = -5.0F;
		this.LeftArm.zRot = 0.0F;
		this.LeftArm.xRot = 5.0F;
		float f = 1.0F;

		if (f < 1.0F) {
			f = 1.0F;
		}

		this.RightArm.xRot = MathHelper.cos(limbSwing * 0.6662F + (float)Math.PI) * 2.0F * limbSwingAmount * 0.5F / f;
		this.LeftArm.xRot = MathHelper.cos(limbSwing * 0.6662F) * 2.0F * limbSwingAmount * 0.5F / f;
		this.RightArm.zRot = 0.0F;
		this.LeftArm.zRot = 0.0F;
		this.RightLeg.xRot = MathHelper.cos(limbSwing * 0.6662F) * 1.4F * limbSwingAmount / f;
		this.LeftLeg.xRot = MathHelper.cos(limbSwing * 0.6662F + (float)Math.PI) * 1.4F * limbSwingAmount / f;
		this.RightLeg.yRot = 0.0F;
		this.LeftLeg.yRot = 0.0F;
		this.RightLeg.zRot = 0.0F;
		this.LeftLeg.zRot = 0.0F;
		if (this.riding) {
			this.RightArm.xRot += (-(float)Math.PI / 5F);
			this.LeftArm.xRot += (-(float)Math.PI / 5F);
			this.RightLeg.xRot = -1.4137167F;
			this.RightLeg.yRot = ((float)Math.PI / 10F);
			this.RightLeg.zRot = 0.07853982F;
			this.LeftLeg.xRot = -1.4137167F;
			this.LeftLeg.yRot = (-(float)Math.PI / 10F);
			this.LeftLeg.zRot = -0.07853982F;
		}

		this.RightArm.yRot = 0.0F;
		this.LeftArm.yRot = 0.0F;
			this.Body.xRot = 0.0F;
			this.RightLeg.zRot = 0.1F;
			this.LeftLeg.zRot = 0.1F;
			this.RightLeg.yRot = 12.0F;
			this.LeftLeg.yRot = 12.0F;
			this.Head.yRot = 0.0F;
			this.Body.yRot = 0.0F;
			this.LeftArm.yRot = 2.0F;
			this.RightArm.yRot = 2.0F;

		ModelHelper.bobArms(this.RightArm, this.LeftArm, ageInTicks);

		float f7 = 0.3F;
		float f5 = 0.33333334F;
		this.LeftLeg.xRot = MathHelper.lerp(this.swimAnimation, this.LeftLeg.xRot, 0.3F * MathHelper.cos(limbSwing * 0.33333334F + (float)Math.PI));
		this.RightLeg.xRot = MathHelper.lerp(this.swimAnimation, this.RightLeg.xRot, 0.3F * MathHelper.cos(limbSwing * 0.33333334F));
	}

    @Override
    public Iterable<ModelRenderer> parts() {
        return ImmutableList.of(Head, Body, RightArm, LeftArm, RightLeg, LeftLeg);
    }

    public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.xRot = x;
		modelRenderer.yRot = y;
		modelRenderer.zRot = z;
	}
}