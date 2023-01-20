package lt.techin.kristina.blogging.api.controller;

import lt.techin.kristina.blogging.api.dto.BlogEntryDto;
import lt.techin.kristina.blogging.api.dto.mapper.BlogEntryMapper;
import lt.techin.kristina.blogging.api.model.BlogEntry;
import lt.techin.kristina.blogging.api.service.BlogEntryService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

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

    @GetMapping("/ordered")
    private List<BlogEntry> getAllBlogEntriesOrdered() {
        return blogEntryService.getAllBlogEntriesOrdered();
    }

    @GetMapping("/{blogEntryId}")
    private Optional<BlogEntry> getBlogEntryById(@PathVariable Long blogEntryId) {
        return blogEntryService.getBlogEntryById(blogEntryId);
    }

    @PostMapping
    private ResponseEntity<BlogEntry> createBlogEntry(@RequestBody BlogEntryDto blogEntryDto) {
        return ResponseEntity.ok(blogEntryService.createBlogEntry(BlogEntryMapper.toBlogEntry(blogEntryDto)));
    }
}
