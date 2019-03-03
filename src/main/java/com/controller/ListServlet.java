package com.controller;

import com.model.entities.Necklace;
import com.model.service.util.Util;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class ListServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        Necklace necklace  = Necklace.getInstance();
        Util util = new Util();
        if ( necklace.getNecklace().isEmpty()){
            necklace.makeNecklace();
        }


      req.setAttribute("necklace",necklace.getNecklace());
       req.setAttribute("findStonesTransparencyInRange",util.findStonesTransparencyInRange(0,100,necklace.getNecklace()));
        req.setAttribute("sortByCost", util.sortByCost(necklace.getNecklace()));
        req.setAttribute("sumOfCost",util.sumOfCost(necklace.getNecklace()));
        req.setAttribute("sumOfWeight",util.sumOfWeight(necklace.getNecklace()));

        RequestDispatcher requestDispatcher = req.getRequestDispatcher("/view/list.jsp");
        requestDispatcher.forward(req,resp);

    }
}
