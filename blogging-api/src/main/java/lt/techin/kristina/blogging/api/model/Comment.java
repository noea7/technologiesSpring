package lt.techin.kristina.blogging.api.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.CreatedDate;

import javax.persistence.*;
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
    @JoinColumn(name="blog_entry_id")
    private BlogEntry blogEntry;

    @CreatedDate
    private LocalDateTime createdDate;


    public Comment(String author, String message, BlogEntry blogEntry) {
        this.author = author;
        this.message = message;
        this.blogEntry = blogEntry;
    }

    @PrePersist
    private void postConstruct() {
        createdDate = LocalDateTime.now();
    }
}
