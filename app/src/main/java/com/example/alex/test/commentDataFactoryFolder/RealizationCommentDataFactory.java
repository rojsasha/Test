package com.example.alex.test.commentDataFactoryFolder;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class RealizationCommentDataFactory implements CommentDataFactory<Map> {


    @Override
    public Map createComemntStructure(List<Comment> comments) {

        Map<Integer, Comment> map = new HashMap<>();
        for (int i = 0; i < comments.size(); i++) {
            for (int j = 0; j < comments.size(); j++) {
                if (comments.get(i).getUserId() == comments.get(j).getReplyTo()){
                    Comment comment = new Comment();
                }
                    map.put(i, comments.get(i).setComment(comments.get(j)));

            }
        }
        return map;
    }


}
