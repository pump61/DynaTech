package net.guizhanss.minecraft.dynatech.utils;

import me.profelements.dynatech.fluids.FluidStack;
import net.guizhanss.guizhanlib.utils.StringUtil;
import org.bukkit.NamespacedKey;

import javax.annotation.Nonnull;

public class FluidUtils {

    private FluidUtils() {
    }

    @Nonnull
    public static String getFluidType(@Nonnull String fluidName){
        return switch (fluidName) {
            case "WATER" -> "Água";
            case "LAVA" -> "Lava";
            case "NO_FLUID" -> "Sem líquido";
            default -> fluidName;
        };
    }

    @Nonnull
    public static String getFluidType(@Nonnull NamespacedKey fluid) {
        if (fluid.equals(FluidStack.LAVA_FLUID)) {
            return "Lava";
        } else if (fluid.equals(FluidStack.WATER_FLUID)) {
            return "Água";
        } else if (fluid.equals(FluidStack.MILK_FLUID)) {
            return "Leite";
        } else if (fluid.equals(FluidStack.POTION_FLUID)) {
            return "Poção";
        } else {
            return StringUtil.humanize(fluid.toString());
        }
    }
}
