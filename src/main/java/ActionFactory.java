import interfaces.Action;

import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.Map;

public class ActionFactory {

    private Map<String, Action> actions = new HashMap<String, Action>();
    private Action action;

    public ActionFactory() {
        actions.put("GET/servlet", new HomeAction());
        actions.put("GET/servlet/listusers", new ListUsersAction());
        actions.put("GET/servlet/test", new TestAction());

    }

    public synchronized Action getAction(HttpServletRequest request) {
        String path = request.getServletPath() + request.getPathInfo();
        String actionKey = request.getMethod() + path;
        System.out.println(actionKey);
        action = actions.get(actionKey);
        if (action == null) {
            action = actions.get("GET/servlet");
        }

        return action;
    }


}
