package lt.techin.kristina.blogging.api.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.CreatedDate;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import java.time.LocalDateTime;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class BlogEntry {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank
    @Column(unique = true)
    private String title;

    private String text;

    @CreatedDate
    private LocalDateTime createdDate;

    public BlogEntry(String title, String text) {
        this.title = title;
        this.text = text;
    }

    @PrePersist
    public void postConstruct() {
        createdDate = LocalDateTime.now();
    }


}
