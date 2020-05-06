package divinerpg.objects.entities.assets.model.twilight;

import divinerpg.objects.entities.assets.model.ItemModel;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.util.math.MathHelper;


public class ModelSoulFiend extends ItemModel {
    ModelRenderer head;
    ModelRenderer body;
    ModelRenderer rightarmext;
    ModelRenderer leftarmext;
    ModelRenderer rightlegcap;
    ModelRenderer leftlegcap;
    ModelRenderer Shape1;
    ModelRenderer Shape2;
    ModelRenderer Shape3;
    ModelRenderer Shape4;
    ModelRenderer Shape5;
    ModelRenderer Shape6;
    ModelRenderer Shape7;
    ModelRenderer Shape8;
    ModelRenderer Shape9;
    ModelRenderer Shape10;
    ModelRenderer back;
    ModelRenderer back2;
    ModelRenderer back3;
    ModelRenderer back4;
    ModelRenderer leftleg;
    ModelRenderer rightleg;
    ModelRenderer leftarm;
    ModelRenderer rightarm;
    ModelRenderer leftfoot;
    ModelRenderer rightfoot;
    ModelRenderer back5;
    ModelRenderer back6;
    ModelRenderer back7;
    ModelRenderer back8;
    ModelRenderer back9;
    ModelRenderer back10;
    ModelRenderer back11;
    ModelRenderer back12;

    public ModelSoulFiend()
    {
        textureWidth = 64;
        textureHeight = 32;

        head = new ModelRenderer(this, 0, 0);
        head.addBox(-4F, -8F, -4F, 8, 8, 8);
        head.setRotationPoint(0F, 0F, 0F);
        head.setTextureSize(64, 32);
        head.mirror = true;
        setRotation(head, 0F, 0F, 0F);
        body = new ModelRenderer(this, 16, 16);
        body.addBox(-4F, 0F, -2F, 8, 12, 4);
        body.setRotationPoint(0F, 0F, 0F);
        body.setTextureSize(64, 32);
        body.mirror = true;
        setRotation(body, 0F, 0F, 0F);
        rightarmext = new ModelRenderer(this, 40, 16);
        rightarmext.addBox(1F, -2F, -2F, 3, 3, 4);
        rightarmext.setRotationPoint(-8F, 2F, 0F);
        rightarmext.setTextureSize(64, 32);
        rightarmext.mirror = true;
        setRotation(rightarmext, 0F, 0F, 0F);
        leftarmext = new ModelRenderer(this, 40, 16);
        leftarmext.addBox(-4F, -2F, -2F, 3, 3, 4);
        leftarmext.setRotationPoint(8F, 2F, 0F);
        leftarmext.setTextureSize(64, 32);
        leftarmext.mirror = true;
        setRotation(leftarmext, 0F, 0F, 0F);
        rightlegcap = new ModelRenderer(this, 0, 16);
        rightlegcap.addBox(-3F, -4F, -3F, 6, 5, 6);
        rightlegcap.setRotationPoint(-4F, 12F, 0F);
        rightlegcap.setTextureSize(64, 32);
        rightlegcap.mirror = true;
        setRotation(rightlegcap, 0F, 0F, 0F);
        leftlegcap = new ModelRenderer(this, 0, 16);
        leftlegcap.addBox(-3F, -4F, -3F, 6, 5, 6);
        leftlegcap.setRotationPoint(4F, 12F, 0F);
        leftlegcap.setTextureSize(64, 32);
        leftlegcap.mirror = true;
        setRotation(leftlegcap, 0F, 0F, 0F);
        Shape1 = new ModelRenderer(this, 8, 0);
        Shape1.addBox(0F, 0F, 0F, 2, 2, 5);
        Shape1.setRotationPoint(2F, -8F, -9F);
        Shape1.setTextureSize(64, 32);
        Shape1.mirror = true;
        setRotation(Shape1, 0F, 0F, 0F);
        Shape2 = new ModelRenderer(this, 8, 0);
        Shape2.addBox(0F, 0F, 0F, 2, 2, 5);
        Shape2.setRotationPoint(-4F, -8F, -9F);
        Shape2.setTextureSize(64, 32);
        Shape2.mirror = true;
        setRotation(Shape2, 0F, 0F, 0F);
        Shape3 = new ModelRenderer(this, 9, 0);
        Shape3.addBox(0F, 0F, 0F, 4, 2, 2);
        Shape3.setRotationPoint(4F, -6F, -4F);
        Shape3.setTextureSize(64, 32);
        Shape3.mirror = true;
        setRotation(Shape3, 0F, 0F, 0F);
        Shape4 = new ModelRenderer(this, 9, 0);
        Shape4.addBox(0F, 0F, 0F, 4, 2, 2);
        Shape4.setRotationPoint(-8F, -6F, -4F);
        Shape4.setTextureSize(64, 32);
        Shape4.mirror = true;
        setRotation(Shape4, 0F, 0F, 0F);
        Shape5 = new ModelRenderer(this, 9, 0);
        Shape5.addBox(0F, 0F, 0F, 4, 2, 2);
        Shape5.setRotationPoint(4F, -3F, -4F);
        Shape5.setTextureSize(64, 32);
        Shape5.mirror = true;
        setRotation(Shape5, 0F, 0F, 0F);
        Shape6 = new ModelRenderer(this, 9, 0);
        Shape6.addBox(0F, 0F, 0F, 4, 2, 2);
        Shape6.setRotationPoint(-8F, -3F, -4F);
        Shape6.setTextureSize(64, 32);
        Shape6.mirror = true;
        setRotation(Shape6, 0F, 0F, 0F);
        Shape7 = new ModelRenderer(this, 8, 0);
        Shape7.addBox(0F, 0F, 0F, 2, 2, 5);
        Shape7.setRotationPoint(6F, -6F, -9F);
        Shape7.setTextureSize(64, 32);
        Shape7.mirror = true;
        setRotation(Shape7, 0F, 0F, 0F);
        Shape8 = new ModelRenderer(this, 8, 0);
        Shape8.addBox(0F, 0F, 0F, 2, 2, 5);
        Shape8.setRotationPoint(6F, -3F, -9F);
        Shape8.setTextureSize(64, 32);
        Shape8.mirror = true;
        setRotation(Shape8, 0F, 0F, 0F);
        Shape9 = new ModelRenderer(this, 8, 0);
        Shape9.addBox(0F, 0F, 0F, 2, 2, 5);
        Shape9.setRotationPoint(-8F, -6F, -9F);
        Shape9.setTextureSize(64, 32);
        Shape9.mirror = true;
        setRotation(Shape9, 0F, 0F, 0F);
        Shape10 = new ModelRenderer(this, 8, 0);
        Shape10.addBox(0F, 0F, 0F, 2, 2, 5);
        Shape10.setRotationPoint(-8F, -3F, -9F);
        Shape10.setTextureSize(64, 32);
        Shape10.mirror = true;
        setRotation(Shape10, 0F, 0F, 0F);
        back = new ModelRenderer(this, 4, 0);
        back.addBox(0F, 0F, 0F, 4, 4, 5);
        back.setRotationPoint(-2F, 4F, 2F);
        back.setTextureSize(64, 32);
        back.mirror = true;
        setRotation(back, 0F, 0F, 0F);
        back2 = new ModelRenderer(this, 34, 26);
        back2.addBox(0F, 0F, 0F, 12, 2, 2);
        back2.setRotationPoint(-12F, 13F, 4F);
        back2.setTextureSize(64, 32);
        back2.mirror = true;
        setRotation(back2, 0F, 0F, -0.6108652F);
        back3 = new ModelRenderer(this, 15, 25);
        back3.addBox(0F, 0F, 0F, 9, 2, 2);
        back3.setRotationPoint(8F, 4F, 5F);
        back3.setTextureSize(64, 32);
        back3.mirror = true;
        setRotation(back3, 0F, 0F, -1.570796F);
        back4 = new ModelRenderer(this, 15, 25);
        back4.addBox(0F, -1F, 0F, 9, 2, 2);
        back4.setRotationPoint(-9F, 4F, 5F);
        back4.setTextureSize(64, 32);
        back4.mirror = true;
        setRotation(back4, 0F, 0F, -1.570796F);
        leftleg = new ModelRenderer(this, 0, 16);
        leftleg.addBox(-2F, 0F, -2F, 4, 12, 4);
        leftleg.setRotationPoint(4F, 12F, 0F);
        leftleg.setTextureSize(64, 32);
        leftleg.mirror = true;
        setRotation(leftleg, 0F, 0F, 0F);
        rightleg = new ModelRenderer(this, 0, 16);
        rightleg.addBox(-2F, 0F, -2F, 4, 12, 4);
        rightleg.setRotationPoint(-4F, 12F, 0F);
        rightleg.setTextureSize(64, 32);
        rightleg.mirror = true;
        setRotation(rightleg, 0F, 0F, 0F);
        leftarm = new ModelRenderer(this, 40, 3);
        leftarm.addBox(-1F, -2F, -2F, 4, 20, 4);
        leftarm.setRotationPoint(8F, 2F, 0F);
        leftarm.setTextureSize(64, 32);
        leftarm.mirror = true;
        setRotation(leftarm, 0F, 0F, 0F);
        rightarm = new ModelRenderer(this, 40, 3);
        rightarm.addBox(-3F, -2F, -2F, 4, 20, 4);
        rightarm.setRotationPoint(-8F, 2F, 0F);
        rightarm.setTextureSize(64, 32);
        rightarm.mirror = true;
        setRotation(rightarm, 0F, 0F, 0F);
        leftfoot = new ModelRenderer(this, 0, 16);
        leftfoot.addBox(-3F, 9F, -3F, 6, 3, 6);
        leftfoot.setRotationPoint(4F, 12F, 0F);
        leftfoot.setTextureSize(64, 32);
        leftfoot.mirror = true;
        setRotation(leftfoot, 0F, 0F, 0F);
        rightfoot = new ModelRenderer(this, 0, 16);
        rightfoot.addBox(-3F, 9F, -3F, 6, 3, 6);
        rightfoot.setRotationPoint(-4F, 12F, 0F);
        rightfoot.setTextureSize(64, 32);
        rightfoot.mirror = true;
        setRotation(rightfoot, 0F, 0F, 0F);
        back5 = new ModelRenderer(this, 4, 0);
        back5.addBox(0F, 0F, 0F, 4, 4, 5);
        back5.setRotationPoint(-2F, 0F, 2F);
        back5.setTextureSize(64, 32);
        back5.mirror = true;
        setRotation(back5, 0F, 0F, 0F);
        back6 = new ModelRenderer(this, 8, 0);
        back6.addBox(0F, 0F, 0F, 5, 2, 2);
        back6.setRotationPoint(2F, 0F, 5F);
        back6.setTextureSize(64, 32);
        back6.mirror = true;
        setRotation(back6, 0F, 0F, 0F);
        back7 = new ModelRenderer(this, 15, 25);
        back7.addBox(0F, 0F, 0F, 9, 2, 2);
        back7.setRotationPoint(5F, 0F, 5F);
        back7.setTextureSize(64, 32);
        back7.mirror = true;
        setRotation(back7, 0F, 0F, -1.570796F);
        back8 = new ModelRenderer(this, 8, 0);
        back8.addBox(0F, 0F, 0F, 5, 2, 2);
        back8.setRotationPoint(-7F, 0F, 5F);
        back8.setTextureSize(64, 32);
        back8.mirror = true;
        setRotation(back8, 0F, 0F, 0F);
        back9 = new ModelRenderer(this, 15, 25);
        back9.addBox(0F, -1F, 0F, 9, 2, 2);
        back9.setRotationPoint(-6F, 0F, 5F);
        back9.setTextureSize(64, 32);
        back9.mirror = true;
        setRotation(back9, 0F, 0F, -1.570796F);
        back10 = new ModelRenderer(this, 42, 5);
        back10.addBox(0F, 0F, 0F, 8, 2, 2);
        back10.setRotationPoint(-10F, 4F, 5F);
        back10.setTextureSize(64, 32);
        back10.mirror = true;
        setRotation(back10, 0F, 0F, 0F);
        back11 = new ModelRenderer(this, 42, 5);
        back11.addBox(0F, 0F, 0F, 8, 2, 2);
        back11.setRotationPoint(2F, 4F, 5F);
        back11.setTextureSize(64, 32);
        back11.mirror = true;
        setRotation(back11, 0F, 0F, 0F);
        back12 = new ModelRenderer(this, 34, 26);
        back12.addBox(0F, 0F, 0F, 12, 2, 2);
        back12.setRotationPoint(2F, 6F, 4F);
        back12.setTextureSize(64, 32);
        back12.mirror = true;
        setRotation(back12, 0F, 0F, 0.6108652F);
    }

    @Override
    protected void render(float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch, float scale) {
    	setRotationAngles(limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch, scale);
    	head.render(scale);
        body.render(scale);
        rightarmext.render(scale);
        leftarmext.render(scale);
        rightlegcap.render(scale);
        leftlegcap.render(scale);
        Shape1.render(scale);
        Shape2.render(scale);
        Shape3.render(scale);
        Shape4.render(scale);
        Shape5.render(scale);
        Shape6.render(scale);
        Shape7.render(scale);
        Shape8.render(scale);
        Shape9.render(scale);
        Shape10.render(scale);
        back.render(scale);
        back2.render(scale);
        back3.render(scale);
        back4.render(scale);
        leftleg.render(scale);
        rightleg.render(scale);
        leftarm.render(scale);
        rightarm.render(scale);
        leftfoot.render(scale);
        rightfoot.render(scale);
        back5.render(scale);
        back6.render(scale);
        back7.render(scale);
        back8.render(scale);
        back9.render(scale);
        back10.render(scale);
        back11.render(scale);
        back12.render(scale);
    }

    private void setRotation(ModelRenderer model, float x, float y, float z)
    {
        model.rotateAngleX = x;
        model.rotateAngleY = y;
        model.rotateAngleZ = z;
    }

    public void setRotationAngles(float var1, float var2, float var3, float var4, float var5, float var6)
    {
        this.rightarm.rotateAngleX = MathHelper.cos(var1 * 0.6662F + (float)Math.PI) * 2.0F * var2 * 0.5F;
        this.rightarmext.rotateAngleX = MathHelper.cos(var1 * 0.6662F + (float)Math.PI) * 2.0F * var2 * 0.5F;

        this.leftarm.rotateAngleX = MathHelper.cos(var1 * 0.6662F) * 2.0F * var2 * 0.5F;
        this.leftarmext.rotateAngleX = MathHelper.cos(var1 * 0.6662F) * 2.0F * var2 * 0.5F;

        this.rightarm.rotateAngleZ = 0.0F;
        this.leftarm.rotateAngleZ = 0.0F;

        this.rightleg.rotateAngleX = MathHelper.cos(var1 * 0.6662F) * 1.4F * var2;
        this.rightfoot.rotateAngleX = MathHelper.cos(var1 * 0.6662F) * 1.4F * var2;
        this.rightlegcap.rotateAngleX = MathHelper.cos(var1 * 0.6662F) * 1.4F * var2;

        this.leftleg.rotateAngleX = MathHelper.cos(var1 * 0.6662F + (float)Math.PI) * 1.4F * var2;
        this.leftfoot.rotateAngleX = MathHelper.cos(var1 * 0.6662F + (float)Math.PI) * 1.4F * var2;
        this.leftlegcap.rotateAngleX = MathHelper.cos(var1 * 0.6662F + (float)Math.PI) * 1.4F * var2;

        this.rightleg.rotateAngleY = 0.0F;
        this.leftleg.rotateAngleY = 0.0F;
    }
}
