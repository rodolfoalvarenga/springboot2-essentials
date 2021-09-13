package academy.devdojo.springboot2.requests;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class AnimePostRequestBody {

    @NotEmpty(message = "The anime name cannot be empty")
    @NotNull(message = "The anime name cannot be null")
    @Schema(description = "This is the Anime's name", example = "Tensei Shittara Slime Datta Ken", required = true)
    private String name;

}
