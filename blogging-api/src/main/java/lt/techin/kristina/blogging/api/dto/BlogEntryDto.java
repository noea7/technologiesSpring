package lt.techin.kristina.blogging.api.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotBlank;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class BlogEntryDto {

    @NotBlank
    private String title;

    private String text;
}
