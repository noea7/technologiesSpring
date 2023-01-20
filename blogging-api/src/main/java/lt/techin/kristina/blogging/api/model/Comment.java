package lt.techin.kristina.blogging.api.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.CreatedDate;

import javax.annotation.PostConstruct;
import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.time.LocalDateTime;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Comment {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private String author;

    private String message;

    @ManyToOne
    @NotNull
    private BlogEntry blogEntry;

    @CreatedDate
    private LocalDateTime createdDate;


    public Comment(String author, String message, BlogEntry blogEntry) {
        this.author = author;
        this.message = message;
        this.blogEntry = blogEntry;
    }

    @PostConstruct
    private void postConstruct() {
        createdDate = LocalDateTime.now();
    }
}
