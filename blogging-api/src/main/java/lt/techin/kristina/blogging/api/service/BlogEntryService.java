package lt.techin.kristina.blogging.api.service;

import lt.techin.kristina.blogging.api.model.BlogEntry;
import lt.techin.kristina.blogging.api.repository.BlogEntryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

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

    public List<BlogEntry> getAllBlogEntriesOrdered() {
        return blogEntryRepository.findAllByOrderByCreatedDateDesc();
    }

    public Optional<BlogEntry> getBlogEntryById(Long id) {
        return blogEntryRepository.findById(id);
    }

    public BlogEntry createBlogEntry(BlogEntry blogEntry) {
        return blogEntryRepository.save(blogEntry);
    }

    public Optional<BlogEntry> getBlogEntryByTitle(String title) {
        return blogEntryRepository.findByTitle(title);
    }
}
