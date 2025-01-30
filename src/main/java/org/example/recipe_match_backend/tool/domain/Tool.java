package org.example.recipe_match_backend.tool.domain;

import jakarta.persistence.*;
import lombok.*;
import org.example.recipe_match_backend.recipe.domain.RecipeTool;
import org.example.recipe_match_backend.user.domain.UserTool;

import java.util.ArrayList;
import java.util.List;

@Getter
@AllArgsConstructor
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Builder
@Entity
public class Tool {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(unique = true)
    private String toolName;

    @OneToMany(mappedBy = "tool", cascade = CascadeType.PERSIST,orphanRemoval = true)
    private List<RecipeTool> recipeTools = new ArrayList<>();

    @OneToMany(mappedBy = "tool", cascade = CascadeType.PERSIST)
    private List<UserTool> userTools = new ArrayList<>();

    public void addRecipeTool(RecipeTool recipeTool) {
        this.recipeTools.add(recipeTool);
    }

}

