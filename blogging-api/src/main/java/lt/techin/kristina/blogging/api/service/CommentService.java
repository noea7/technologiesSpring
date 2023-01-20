package lt.techin.kristina.blogging.api.service;

import lt.techin.kristina.blogging.api.dto.CommentDto;
import lt.techin.kristina.blogging.api.dto.mapper.CommentMapper;
import lt.techin.kristina.blogging.api.model.BlogEntry;
import lt.techin.kristina.blogging.api.model.Comment;
import lt.techin.kristina.blogging.api.repository.BlogEntryRepository;
import lt.techin.kristina.blogging.api.repository.CommentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CommentService {

    @Autowired
    CommentRepository commentRepository;

    @Autowired
    BlogEntryRepository blogEntryRepository;

    public CommentService(CommentRepository commentRepository, BlogEntryRepository blogEntryRepository) {
        this.commentRepository = commentRepository;
        this.blogEntryRepository = blogEntryRepository;
    }


    public List<Comment> getAllComments() {
        return commentRepository.findAll();
    }

    public List<Comment> getCommentsByBlogEntryId (Long blogEntryId) {
        BlogEntry blogEntry = blogEntryRepository.findById(blogEntryId).orElseThrow();
        return commentRepository.findAllByBlogEntry(blogEntry);
    }

    public Comment createComment(Long blogEntryId, CommentDto commentDto) {

        BlogEntry blogEntry = blogEntryRepository.findById(blogEntryId).orElseThrow();
        Comment newComment = CommentMapper.toComment(commentDto);
        newComment.setBlogEntry(blogEntry);
        return commentRepository.save(newComment);
    }
}
