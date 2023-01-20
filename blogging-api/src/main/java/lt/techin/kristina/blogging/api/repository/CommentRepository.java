package lt.techin.kristina.blogging.api.repository;

import lt.techin.kristina.blogging.api.model.BlogEntry;
import lt.techin.kristina.blogging.api.model.Comment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CommentRepository extends JpaRepository<Comment, Long> {

    List<Comment> findAllByBlogEntry(BlogEntry blogEntry);
}
