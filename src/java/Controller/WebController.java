/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author User
 */
@WebServlet(name = "WebController", urlPatterns = {
    "/WebController"
})
public class WebController extends HttpServlet {
        protected void processRequest(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
            response.setContentType("text/html;charset=UTF-8");
        }
                
    
}
