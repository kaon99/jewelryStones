package com.model.service.util;

import com.model.entities.Necklace;
import com.model.entities.Stone;

import java.util.List;

public class TextCreatorUtil {

   public  static String printer (List stones){
        StringBuilder sb = new StringBuilder();

        if (stones != null && !stones.isEmpty()) {
            sb.append("<ui>");

            for (Object s : stones) {
                sb.append("<li>" + s + "</li>");
            }
            sb.append("</ui>");


        }

        return sb.toString();
    }
}