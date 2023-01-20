package lt.techin.kristina.blogging.api.repository;

import lt.techin.kristina.blogging.api.model.BlogEntry;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BlogEntryRepository extends JpaRepository<BlogEntry,Long> {
}
