package lt.techin.kristina.blogging.api.service;

import lt.techin.kristina.blogging.api.model.BlogEntry;
import lt.techin.kristina.blogging.api.repository.BlogEntryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BlogEntryService {

    @Autowired
    BlogEntryRepository blogEntryRepository;

    public BlogEntryService(BlogEntryRepository blogEntryRepository) {
        this.blogEntryRepository = blogEntryRepository;
    }

    public List<BlogEntry> getAllBlogEntries() {
        return blogEntryRepository.findAll();
    }
}
