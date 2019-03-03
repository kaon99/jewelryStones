package com.controller;

import com.model.entities.Necklace;
import com.model.service.util.TextCreatorUtil;
import com.model.service.util.SortUtil;

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

        if ( necklace.getNecklace().isEmpty()){
            necklace.makeNecklace();
        }

        req.setAttribute("necklace", TextCreatorUtil.printer(necklace.getNecklace()));
       req.setAttribute("findStonesTransparencyInRange", TextCreatorUtil.printer(SortUtil.findStonesTransparencyInRange(0,100,necklace.getNecklace())));
        req.setAttribute("sortByCost", TextCreatorUtil.printer(SortUtil.sortByCost(necklace.getNecklace())));
        req.setAttribute("sumOfCost", SortUtil.sumOfCost(necklace.getNecklace()));
        req.setAttribute("sumOfWeight", SortUtil.sumOfWeight(necklace.getNecklace()));

        RequestDispatcher requestDispatcher = req.getRequestDispatcher("/view/list.jsp");
        requestDispatcher.forward(req,resp);

    }
}
