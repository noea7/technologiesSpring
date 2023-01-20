package lt.techin.kristina.blogging.api.controller;

import lt.techin.kristina.blogging.api.model.BlogEntry;
import lt.techin.kristina.blogging.api.service.BlogEntryService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/v1/blogEntries")
public class BlogEntryController {

    BlogEntryService blogEntryService;

    public BlogEntryController(BlogEntryService blogEntryService) {
        this.blogEntryService = blogEntryService;
    }

    @GetMapping
    private List<BlogEntry> getAllBlogEntries() {
        return blogEntryService.getAllBlogEntries();
    }
}
