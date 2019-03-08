package com.controller;

import com.model.constants.Text;
import com.model.entities.Necklace;
import com.controller.servletUtils.TextCreatorUtil;
import com.model.service.util.NecklaceUtil;
import com.model.service.util.SortUtil;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Locale;

public class ListServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        Necklace necklace = Necklace.getInstance();
        Locale locale = new Locale("uk", "UA");
        if (necklace.getNecklace().isEmpty()) {
            NecklaceUtil.makeNecklace();
        }
        req.setAttribute("necklacePrint", TextCreatorUtil.showMessages(locale, "input.string.necklace"));
        req.setAttribute("necklace", TextCreatorUtil.printer(necklace.getNecklace()));
        req.setAttribute("rangePrint", TextCreatorUtil.showMessages(locale, "input.string.range"));
        req.setAttribute("findStonesTransparencyInRange", TextCreatorUtil.printer(SortUtil.findStonesTransparencyInRange(0, 100, necklace.getNecklace())));
        req.setAttribute("sortPrint", TextCreatorUtil.showMessages(locale, "input.string.sort"));
        req.setAttribute("sortByCost", TextCreatorUtil.printer(SortUtil.sortByCost(necklace.getNecklace())));
        req.setAttribute("sumOfCostPrint", TextCreatorUtil.showMessages(locale, "input.string.sumofcost"));
        req.setAttribute("sumOfCost", SortUtil.sumOfCost(necklace.getNecklace()));
        req.setAttribute("sumOfWeightPrint", TextCreatorUtil.showMessages(locale, "input.string.sumofweight"));
        req.setAttribute("sumOfWeight", SortUtil.sumOfWeight(necklace.getNecklace()));

        RequestDispatcher requestDispatcher = req.getRequestDispatcher("/view/list.jsp");
        requestDispatcher.forward(req, resp);

    }
}
