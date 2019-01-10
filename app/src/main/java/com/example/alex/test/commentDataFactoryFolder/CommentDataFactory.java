package com.example.alex.test.commentDataFactoryFolder;


import java.util.List;
import java.util.Map;

public interface CommentDataFactory<T extends Map> {
    T createComemntStructure(List<Comment> comments);
}
