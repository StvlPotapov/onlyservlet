import interfaces.Action;
import javafx.beans.NamedArg;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.ArrayList;
import java.util.List;

import javax.enterprise.context.RequestScoped;
import javax.inject.Named;

@RequestScoped
@Named
public class ListUsersAction implements Action {

    public String execute(HttpServletRequest request,
                          HttpServletResponse response) {
        List<String> userList = new ArrayList<String>();
        userList.add("Борис Гр");
        userList.add("Джонн Ленон");
        userList.add("Paul Mack");
        request.setAttribute("listusers", userList);
        return "/WEB-INF/listusers.jsp";

    }
}
