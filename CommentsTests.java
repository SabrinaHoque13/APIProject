package com.spartaglobal.Test;

import com.spartaglobal.HTTPServices.FixerHTTPServices;
import com.spartaglobal.ParsingJSON.CommentsDTO;
import com.spartaglobal.ParsingJSON.CommentsDeserialiser;
import org.junit.BeforeClass;
import org.junit.Test;

public class CommentsTests {

    private static CommentsDeserialiser comments;
    static FixerHTTPServices fixerHTTPServices = new FixerHTTPServices();

    @BeforeClass
    public static void setup() {
        fixerHTTPServices.executeAlbumsGetRequest();
        comments = new CommentsDeserialiser(fixerHTTPServices.getFixerCommentsJSONString());

    }

    @Test
    public void getEmail() {
        for (CommentsDTO comment : comments.CommentsMapped) {
            System.out.println(comment.getEmail());

        }
    }
}
