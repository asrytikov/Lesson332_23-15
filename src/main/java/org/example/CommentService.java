package org.example;

import org.springframework.stereotype.Service;

import java.util.logging.Logger;

@Service
public class CommentService {

    private Logger logger = Logger.getLogger(CommentService.class.getName());

    public String publishComment(Comment comment){
        logger.info("Publish comment: " + comment.getText());
        return "SUCCESS";
    }

    @ToLog
    public String deleteComment(Comment comment){
        logger.info("Delete comment: " + comment.getText());
        return "SUCCESS";
    }

    public String editComment(Comment comment){
        logger.info("Edit comment: " + comment.getText());
        return "SUCCESS";
    }

    public void setLogger(Logger logger) {
        this.logger = logger;
    }
}
