package com.vividseats.servlet;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class BadApi extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        try (PrintWriter pw = new PrintWriter(resp.getOutputStream())) {
            pw.write(System.getenv("CONFIG"));
            pw.flush();
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

}
