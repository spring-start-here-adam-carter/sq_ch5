package services;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Service;
import repositories.CommentRepository;

@Service
@Lazy
public class CommentService {

    private final CommentRepository commentRepository;

    public CommentService(CommentRepository commentRepository) {
        this.commentRepository = commentRepository;
        System.out.println("CommentService instance created!");
    }

    public CommentRepository getCommentRepository() {
        return commentRepository;
    }
}
