package net.divinerpg.client.render.entity.vanilla.model;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.util.MathHelper;


public class ModelIceMan extends ModelBase
{
	ModelRenderer head;
    ModelRenderer body;
    ModelRenderer legRBT;
    ModelRenderer legLBT;
    ModelRenderer legRFT;
    ModelRenderer legLFT;
    ModelRenderer udders;
    ModelRenderer legRMT;
    ModelRenderer legLMT;
    ModelRenderer legLF;
    ModelRenderer legRF;
    ModelRenderer legLM;
    ModelRenderer legLB;
    ModelRenderer legRM;
    ModelRenderer legRB;
    ModelRenderer body1;
    ModelRenderer body2;
    ModelRenderer body3;
    ModelRenderer body4;
    ModelRenderer body5;
    ModelRenderer body7;
    ModelRenderer body6;
    ModelRenderer body8;
    ModelRenderer body9;
    ModelRenderer body10;
    ModelRenderer body11;
    ModelRenderer body12;
    ModelRenderer body13;
    ModelRenderer body14;
    ModelRenderer body15;
    ModelRenderer body16;
    ModelRenderer body17;
    ModelRenderer body18;
    ModelRenderer body19;
    ModelRenderer body20;
    ModelRenderer body21;
    ModelRenderer body22;
    ModelRenderer body23;
    ModelRenderer body24;
    ModelRenderer body25;
    ModelRenderer body26;

    public ModelIceMan()
    {
    	textureWidth = 64;
    	textureHeight = 32;

    	head = new ModelRenderer(this, 0, 0);
    	head.addBox(-4F, -4F, -6F, 8, 8, 11);
    	head.setRotationPoint(0F, 6F, -13F);
    	head.setTextureSize(64, 32);
    	head.mirror = true;
    	setRotation(head, 0F, 0F, 0F);
    	body = new ModelRenderer(this, 32, 6);
    	body.addBox(-6F, -10F, -7F, 2, 5, 2);
    	body.setRotationPoint(12F, -4F, 17F);
    	body.setTextureSize(64, 32);
    	body.mirror = true;
    	setRotation(body, 0.7853982F, 0F, 0F);
    	legRBT = new ModelRenderer(this, 32, 18);
    	legRBT.addBox(-4F, -4F, -2F, 5, 4, 5);
    	legRBT.setRotationPoint(-3F, 12F, 8F);
    	legRBT.setTextureSize(64, 32);
    	legRBT.mirror = true;
    	setRotation(legRBT, 0F, 0F, 0F);
    	legLBT = new ModelRenderer(this, 32, 18);
    	legLBT.addBox(-1F, -4F, -2F, 5, 4, 5);
    	legLBT.setRotationPoint(3F, 12F, 8F);
    	legLBT.setTextureSize(64, 32);
    	legLBT.mirror = true;
    	setRotation(legLBT, 0F, 0F, 0F);
    	legRFT = new ModelRenderer(this, 32, 18);
    	legRFT.addBox(-4F, -4F, -3F, 5, 4, 5);
    	legRFT.setRotationPoint(-3F, 12F, -5F);
    	legRFT.setTextureSize(64, 32);
    	legRFT.mirror = true;
    	setRotation(legRFT, 0F, 0F, 0F);
    	legLFT = new ModelRenderer(this, 32, 18);
    	legLFT.addBox(-1F, -4F, -3F, 5, 4, 5);
    	legLFT.setRotationPoint(3F, 12F, -5F);
    	legLFT.setTextureSize(64, 32);
    	legLFT.mirror = true;
    	setRotation(legLFT, 0F, 0F, 0F);
    	udders = new ModelRenderer(this, 52, 0);
    	udders.addBox(-2F, -3F, 0F, 4, 6, 2);
    	udders.setRotationPoint(0F, 14F, 6F);
    	udders.setTextureSize(64, 32);
    	udders.mirror = true;
    	setRotation(udders, 1.570796F, 0F, 0F);
    	legRMT = new ModelRenderer(this, 32, 17);
    	legRMT.addBox(-1F, -4F, 0F, 5, 4, 6);
    	legRMT.setRotationPoint(-6F, 12F, -1.733333F);
    	legRMT.setTextureSize(64, 32);
    	legRMT.mirror = true;
    	setRotation(legRMT, 0F, 0F, 0F);
    	legLMT = new ModelRenderer(this, 32, 17);
    	legLMT.addBox(0F, -4F, 0F, 5, 4, 6);
    	legLMT.setRotationPoint(2F, 12F, -1.7F);
    	legLMT.setTextureSize(64, 32);
    	legLMT.mirror = true;
    	setRotation(legLMT, 0F, 0F, 0F);
    	legLF = new ModelRenderer(this, 0, 16);
    	legLF.addBox(-1F, 0F, -3F, 4, 12, 4);
    	legLF.setRotationPoint(3F, 12F, -5F);
    	legLF.setTextureSize(64, 32);
    	legLF.mirror = true;
    	setRotation(legLF, 0F, 0F, 0F);
    	legRF = new ModelRenderer(this, 0, 16);
    	legRF.addBox(-3F, 0F, -3F, 4, 12, 4);
    	legRF.setRotationPoint(-3F, 12F, -5F);
    	legRF.setTextureSize(64, 32);
    	legRF.mirror = true;
    	setRotation(legRF, 0F, 0F, 0F);
    	legLM = new ModelRenderer(this, 0, 15);
    	legLM.addBox(0F, 0F, 0F, 4, 12, 5);
    	legLM.setRotationPoint(2F, 12F, -1.7F);
    	legLM.setTextureSize(64, 32);
    	legLM.mirror = true;
    	setRotation(legLM, 0F, 0F, 0F);
    	legLB = new ModelRenderer(this, 0, 16);
    	legLB.addBox(-1F, 0F, -2F, 4, 12, 4);
    	legLB.setRotationPoint(3F, 12F, 8F);
    	legLB.setTextureSize(64, 32);
    	legLB.mirror = true;
    	setRotation(legLB, 0F, 0F, 0F);
    	legRM = new ModelRenderer(this, 0, 15);
    	legRM.addBox(0F, 0F, 0F, 4, 12, 5);
    	legRM.setRotationPoint(-6F, 12F, -1.733333F);
    	legRM.setTextureSize(64, 32);
    	legRM.mirror = true;
    	setRotation(legRM, 0F, 0F, 0F);
    	legRB = new ModelRenderer(this, 0, 16);
    	legRB.addBox(-3F, 0F, -2F, 4, 12, 4);
    	legRB.setRotationPoint(-3F, 12F, 8F);
    	legRB.setTextureSize(64, 32);
    	legRB.mirror = true;
    	setRotation(legRB, 0F, 0F, 0F);
    	body1 = new ModelRenderer(this, 20, 26);
    	body1.addBox(-6F, -10F, -7F, 3, 3, 3);
    	body1.setRotationPoint(12F, 5F, 18F);
    	body1.setTextureSize(64, 32);
    	body1.mirror = true;
    	setRotation(body1, 1.570796F, 0F, 0F);
    	body2 = new ModelRenderer(this, 20, 4);
    	body2.addBox(-6F, -10F, -7F, 12, 18, 10);
    	body2.setRotationPoint(0F, 5F, 2F);
    	body2.setTextureSize(64, 32);
    	body2.mirror = true;
    	setRotation(body2, 1.570796F, 0F, 0F);
    	body3 = new ModelRenderer(this, 20, 26);
    	body3.addBox(-6F, -10F, -7F, 3, 3, 3);
    	body3.setRotationPoint(12F, 2F, 2F);
    	body3.setTextureSize(64, 32);
    	body3.mirror = true;
    	setRotation(body3, 1.570796F, 0F, 0F);
    	body4 = new ModelRenderer(this, 32, 6);
    	body4.addBox(-6F, -10F, -7F, 2, 18, 2);
    	body4.setRotationPoint(12F, -4F, -4F);
    	body4.setTextureSize(64, 32);
    	body4.mirror = true;
    	setRotation(body4, 2.356194F, 0F, 0F);
    	body5 = new ModelRenderer(this, 32, 6);
    	body5.addBox(-6F, -10F, -7F, 4, 3, 4);
    	body5.setRotationPoint(11F, 14F, 6F);
    	body5.setTextureSize(64, 32);
    	body5.mirror = true;
    	setRotation(body5, -2.356194F, 0F, 0F);
    	body7 = new ModelRenderer(this, 20, 26);
    	body7.addBox(-6F, -10F, -7F, 3, 3, 3);
    	body7.setRotationPoint(-3F, 2F, 2F);
    	body7.setTextureSize(64, 32);
    	body7.mirror = true;
    	setRotation(body7, 1.570796F, 0F, 0F);
    	body6 = new ModelRenderer(this, 20, 26);
    	body6.addBox(-6F, -10F, -7F, 3, 3, 3);
    	body6.setRotationPoint(-3F, 5F, 18F);
    	body6.setTextureSize(64, 32);
    	body6.mirror = true;
    	setRotation(body6, 1.570796F, 0F, 0F);
    	body8 = new ModelRenderer(this, 32, 6);
    	body8.addBox(-6F, -10F, -7F, 3, 3, 4);
    	body8.setRotationPoint(7F, 7F, 5F);
    	body8.setTextureSize(64, 32);
    	body8.mirror = true;
    	setRotation(body8, -2.356194F, 0F, 0F);
    	body9 = new ModelRenderer(this, 32, 6);
    	body9.addBox(-6F, -10F, -7F, 2, 18, 2);
    	body9.setRotationPoint(-2F, -4F, -4F);
    	body9.setTextureSize(64, 32);
    	body9.mirror = true;
    	setRotation(body9, 2.356194F, 0F, 0F);
    	body10 = new ModelRenderer(this, 32, 6);
    	body10.addBox(-6F, -10F, -7F, 2, 5, 2);
    	body10.setRotationPoint(-2F, -4F, 17F);
    	body10.setTextureSize(64, 32);
    	body10.mirror = true;
    	setRotation(body10, 0.7853982F, 0F, 0F);
    	body11 = new ModelRenderer(this, 20, 26);
    	body11.addBox(-6F, -10F, -7F, 3, 3, 3);
    	body11.setRotationPoint(-3F, 5F, 8F);
    	body11.setTextureSize(64, 32);
    	body11.mirror = true;
    	setRotation(body11, 1.570796F, 0F, 0F);
    	body12 = new ModelRenderer(this, 32, 6);
    	body12.addBox(-6F, -10F, -7F, 2, 18, 2);
    	body12.setRotationPoint(-2F, -1F, 2F);
    	body12.setTextureSize(64, 32);
    	body12.mirror = true;
    	setRotation(body12, 2.356194F, 0F, 0F);
    	body13 = new ModelRenderer(this, 32, 6);
    	body13.addBox(-6F, -10F, -7F, 2, 5, 2);
    	body13.setRotationPoint(-2F, -1F, 23F);
    	body13.setTextureSize(64, 32);
    	body13.mirror = true;
    	setRotation(body13, 0.7853982F, 0F, 0F);
    	body14 = new ModelRenderer(this, 20, 26);
    	body14.addBox(-6F, -10F, -7F, 3, 3, 3);
    	body14.setRotationPoint(12F, 5F, 8F);
    	body14.setTextureSize(64, 32);
    	body14.mirror = true;
    	setRotation(body14, 1.570796F, 0F, 0F);
    	body15 = new ModelRenderer(this, 32, 6);
    	body15.addBox(-6F, -10F, -7F, 2, 18, 2);
    	body15.setRotationPoint(12F, -1F, 2F);
    	body15.setTextureSize(64, 32);
    	body15.mirror = true;
    	setRotation(body15, 2.356194F, 0F, 0F);
    	body16 = new ModelRenderer(this, 32, 6);
    	body16.addBox(-6F, -10F, -7F, 2, 5, 2);
    	body16.setRotationPoint(12F, -1F, 23F);
    	body16.setTextureSize(64, 32);
    	body16.mirror = true;
    	setRotation(body16, 0.7853982F, 0F, 0F);
    	body17 = new ModelRenderer(this, 32, 6);
    	body17.addBox(-6F, -10F, -7F, 2, 9, 2);
    	body17.setRotationPoint(12F, 14F, 5F);
    	body17.setTextureSize(64, 32);
    	body17.mirror = true;
    	setRotation(body17, -2.356194F, 0F, 0F);
    	body18 = new ModelRenderer(this, 32, 6);
    	body18.addBox(-6F, -10F, -7F, 1, 9, 2);
    	body18.setRotationPoint(8F, 7F, 4F);
    	body18.setTextureSize(64, 32);
    	body18.mirror = true;
    	setRotation(body18, -2.356194F, 0F, 0F);
    	body19 = new ModelRenderer(this, 32, 6);
    	body19.addBox(-6F, -10F, -7F, 4, 3, 4);
    	body19.setRotationPoint(-3F, 14F, 6F);
    	body19.setTextureSize(64, 32);
    	body19.mirror = true;
    	setRotation(body19, -2.356194F, 0F, 0F);
    	body20 = new ModelRenderer(this, 32, 6);
    	body20.addBox(-6F, -10F, -7F, 2, 9, 2);
    	body20.setRotationPoint(-2F, 14F, 5F);
    	body20.setTextureSize(64, 32);
    	body20.mirror = true;
    	setRotation(body20, -2.356194F, 0F, 0F);
    	body21 = new ModelRenderer(this, 32, 6);
    	body21.addBox(-6F, -10F, -7F, 3, 3, 4);
    	body21.setRotationPoint(2F, 7F, 5F);
    	body21.setTextureSize(64, 32);
    	body21.mirror = true;
    	setRotation(body21, -2.356194F, 0F, 0F);
    	body22 = new ModelRenderer(this, 32, 6);
    	body22.addBox(-6F, -10F, -7F, 1, 9, 2);
    	body22.setRotationPoint(3F, 7F, 4F);
    	body22.setTextureSize(64, 32);
    	body22.mirror = true;
    	setRotation(body22, -2.356194F, 0F, 0F);
    	body23 = new ModelRenderer(this, 32, 6);
    	body23.addBox(-6F, -10F, -7F, 3, 3, 4);
    	body23.setRotationPoint(2F, 14F, 6F);
    	body23.setTextureSize(64, 32);
    	body23.mirror = true;
    	setRotation(body23, -2.356194F, 0F, 0F);
    	body24 = new ModelRenderer(this, 32, 6);
    	body24.addBox(-6F, -10F, -7F, 1, 9, 2);
    	body24.setRotationPoint(3F, 14F, 5F);
    	body24.setTextureSize(64, 32);
    	body24.mirror = true;
    	setRotation(body24, -2.356194F, 0F, 0F);
    	body25 = new ModelRenderer(this, 32, 6);
    	body25.addBox(-6F, -10F, -7F, 1, 9, 2);
    	body25.setRotationPoint(8F, 14F, 5F);
    	body25.setTextureSize(64, 32);
    	body25.mirror = true;
    	setRotation(body25, -2.356194F, 0F, 0F);
    	body26 = new ModelRenderer(this, 32, 6);
    	body26.addBox(-6F, -10F, -7F, 3, 3, 4);
    	body26.setRotationPoint(7F, 14F, 6F);
    	body26.setTextureSize(64, 32);
    	body26.mirror = true;
    	setRotation(body26, -2.356194F, 0F, 0F);
    }

    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
    {
    	super.render(entity, f, f1, f2, f3, f4, f5);
    	setRotationAngles(f, f1, f2, f3, f4, f5);
    	head.render(f5);
    	body.render(f5);
    	legRBT.render(f5);
    	legLBT.render(f5);
    	legRFT.render(f5);
    	legLFT.render(f5);
    	udders.render(f5);
    	legRMT.render(f5);
    	legLMT.render(f5);
    	legLF.render(f5);
    	legRF.render(f5);
    	legLM.render(f5);
    	legLB.render(f5);
    	legRM.render(f5);
    	legRB.render(f5);
    	body1.render(f5);
    	body2.render(f5);
    	body3.render(f5);
    	body4.render(f5);
    	body5.render(f5);
    	body7.render(f5);
    	body6.render(f5);
    	body8.render(f5);
    	body9.render(f5);
    	body10.render(f5);
    	body11.render(f5);
    	body12.render(f5);
    	body13.render(f5);
    	body14.render(f5);
    	body15.render(f5);
    	body16.render(f5);
    	body17.render(f5);
    	body18.render(f5);
    	body19.render(f5);
    	body20.render(f5);
    	body21.render(f5);
    	body22.render(f5);
    	body23.render(f5);
    	body24.render(f5);
    	body25.render(f5);
    	body26.render(f5);
    }

    private void setRotation(ModelRenderer model, float x, float y, float z)
    {
    	model.rotateAngleX = x;
    	model.rotateAngleY = y;
    	model.rotateAngleZ = z;
    }

    public void setRotationAngles(float var1, float var2, float var3, float var4, float var5, float var6)
    {
    	this.legRB.rotateAngleX = MathHelper.cos(var1 * 0.6662F) * 1.4F * var2;
    	this.legRBT.rotateAngleX = MathHelper.cos(var1 * 0.6662F) * 1.4F * var2;
    	this.legRM.rotateAngleX = MathHelper.cos(var1 * 0.6662F) * 1.4F * var2;
    	this.legRMT.rotateAngleX = MathHelper.cos(var1 * 0.6662F) * 1.4F * var2;
    	this.legRF.rotateAngleX = MathHelper.cos(var1 * 0.6662F) * 1.4F * var2;
    	this.legRFT.rotateAngleX = MathHelper.cos(var1 * 0.6662F) * 1.4F * var2;
    	
    	this.legLB.rotateAngleX = MathHelper.cos(var1 * 0.6662F + (float)Math.PI) * 1.4F * var2;
    	this.legLBT.rotateAngleX = MathHelper.cos(var1 * 0.6662F + (float)Math.PI) * 1.4F * var2;
    	this.legLM.rotateAngleX = MathHelper.cos(var1 * 0.6662F + (float)Math.PI) * 1.4F * var2;
    	this.legLMT.rotateAngleX = MathHelper.cos(var1 * 0.6662F + (float)Math.PI) * 1.4F * var2;
    	this.legLF.rotateAngleX = MathHelper.cos(var1 * 0.6662F + (float)Math.PI) * 1.4F * var2;
    	this.legLFT.rotateAngleX = MathHelper.cos(var1 * 0.6662F + (float)Math.PI) * 1.4F * var2;
    }
}
