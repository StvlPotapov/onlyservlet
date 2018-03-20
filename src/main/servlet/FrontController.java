import interfaces.Action;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;


public class FrontController extends HttpServlet {

    private static final long serialVersionUID = 1L;

    protected void doGet(HttpServletRequest request,
                         HttpServletResponse response) throws ServletException, IOException {
        try {
            Action action = AbstractActionFactory.getInstance().getAction(request);
            String view = action.execute(request, response);

            getServletContext().getRequestDispatcher(view).forward(request, response);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }


}

