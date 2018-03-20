import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TestAction implements interfaces.Action {
    public String execute(HttpServletRequest request, HttpServletResponse response) {
        Map<Long, Client> testHashMap = new HashMap<Long, Client>();
        testHashMap.put(1L,new Client("1Name", "1Lastname"));
        request.setAttribute("test",testHashMap);
        return "/WEB-INF/test.jsp";
    }
}
