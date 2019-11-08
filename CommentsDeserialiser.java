package com.spartaglobal.ParsingJSON;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;

public class CommentsDeserialiser {


    public CommentsDTO[] CommentsMapped;

    public CommentsDeserialiser(String jsonString) {
        ObjectMapper objectMapper = new ObjectMapper();
        try {
            CommentsMapped = objectMapper.readValue(jsonString, CommentsDTO[].class);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

