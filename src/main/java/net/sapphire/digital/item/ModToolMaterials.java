package net.sapphire.digital.item;

import net.minecraft.item.ToolMaterial;
import net.minecraft.recipe.Ingredient;

;public enum ModToolMaterials implements ToolMaterial {
    DIGI_COPPER;

    @Override
    public int getDurability() {
        return 3031;
    }

    @Override
    public float getMiningSpeedMultiplier() {
        return 13;
    }

    @Override
    public float getAttackDamage() {
        return 50;
    }

    @Override
    public int getMiningLevel() {
        return 9;
    }

    @Override
    public int getEnchantability() {
        return 17;
    }

    @Override
    public Ingredient getRepairIngredient() {
        return Ingredient.ofItems(ModItems.DIGI_COPPER);
    }
}