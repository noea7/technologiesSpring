package lt.techin.kristina.blogging.api.dto.mapper;

import lt.techin.kristina.blogging.api.dto.CommentDto;
import lt.techin.kristina.blogging.api.model.Comment;

public class CommentMapper {

    public static Comment toComment(CommentDto commentDto) {

        Comment comment = new Comment();
        comment.setAuthor(commentDto.getAuthor());
        comment.setMessage(commentDto.getMessage());

        return comment;
    }

    public static CommentDto toCommentDto(Comment comment) {

        CommentDto commentDto = new CommentDto();
        commentDto.setAuthor(comment.getAuthor());
        commentDto.setMessage(comment.getMessage());

        return commentDto;
    }
}
