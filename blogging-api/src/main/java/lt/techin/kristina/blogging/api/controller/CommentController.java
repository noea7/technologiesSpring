package lt.techin.kristina.blogging.api.controller;

import lt.techin.kristina.blogging.api.dto.CommentDto;
import lt.techin.kristina.blogging.api.model.Comment;
import lt.techin.kristina.blogging.api.service.CommentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/blogEntries/comments")
public class CommentController {

    @Autowired
    CommentService commentService;

    public CommentController(CommentService commentService) {
        this.commentService = commentService;
    }

    @GetMapping
    public List<Comment> getAllComments() {
        return commentService.getAllComments();
    }

    @GetMapping("/{blogEntryId}")
    public List<Comment> getCommentsByBlogEntryId(@PathVariable Long blogEntryId) {
        return commentService.getCommentsByBlogEntryId(blogEntryId);
    }

    @PostMapping("/{blogEntryId}")
    public ResponseEntity<Comment> createComment(@PathVariable Long blogEntryId, @RequestBody CommentDto commentDto) {
        return ResponseEntity.ok(commentService.createComment(blogEntryId, commentDto));
    }
}
