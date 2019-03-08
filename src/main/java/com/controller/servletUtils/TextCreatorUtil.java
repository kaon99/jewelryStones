package com.controller.servletUtils;

import java.util.List;
import java.util.Locale;
import java.util.ResourceBundle;

public class TextCreatorUtil {

    public static String printer(List stones) {
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

    public static String showMessages(Locale locale, String key) {
        ResourceBundle bundle =
                ResourceBundle.getBundle("messages", locale);
        return bundle.getString(key);

    }
}