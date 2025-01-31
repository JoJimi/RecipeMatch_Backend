package org.example.recipe_match_backend.domain.recipe.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.example.recipe_match_backend.domain.recipe.domain.RecipeIngredient;

@AllArgsConstructor
@NoArgsConstructor
@Getter
public class RecipeIngredientDto {

    private String quantity;
    private String IngredientName;

    public RecipeIngredientDto(RecipeIngredient recipeIngredient){
        this.quantity = recipeIngredient.getQuantity();
        this.IngredientName = recipeIngredient.getIngredient().getIngredientName();
    }

}
