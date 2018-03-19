import interfaces.Action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class HomeAction implements Action {
    public String execute(HttpServletRequest request, HttpServletResponse response) {
        return "/WEB-INF/home.jsp";
    }
}
