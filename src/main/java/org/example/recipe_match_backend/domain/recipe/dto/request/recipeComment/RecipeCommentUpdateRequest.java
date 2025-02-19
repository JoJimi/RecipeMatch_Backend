package org.example.recipe_match_backend.domain.recipe.dto.request.recipeComment;

import lombok.*;

@NoArgsConstructor(access = AccessLevel.PROTECTED)
@AllArgsConstructor
@Builder
@Getter
public class RecipeCommentUpdateRequest {
    private String userUid;
    private String content;
}
