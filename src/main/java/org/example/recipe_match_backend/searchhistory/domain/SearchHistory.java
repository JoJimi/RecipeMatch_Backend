package org.example.recipe_match_backend.searchhistory.domain;

import jakarta.persistence.*;
import lombok.*;
import org.example.recipe_match_backend.recipe.domain.Recipe;
import org.example.recipe_match_backend.type.CategoryType;
import org.example.recipe_match_backend.user.domain.User;

@Getter
@AllArgsConstructor
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Builder
@Entity
public class SearchHistory {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "user_id")
    private User user;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "recipe_id")
    private Recipe recipe;

    @Enumerated(EnumType.STRING)
    private CategoryType categoryType;

}
