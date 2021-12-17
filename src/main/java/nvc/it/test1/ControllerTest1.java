package nvc.it.test1;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class ControllerTest1 {
    @RequestMapping(value ="/", method = RequestMethod.GET )
    @ResponseBody
    public String index() {
        return "<center>This root page<br><hr><h1>Hiii</h1></center><hr><a href='/name'>Go to name page</a>";
    }

    @RequestMapping("/name")
    @ResponseBody
    public String name() {
        return "<center>Wansiri M.<br>No 17</center><hr><a href='/'>Go to index page</a>";
    }
    @RequestMapping("/about")
    @ResponseBody
    public String about() {
        return 
        "<center>My name is Wansiri M.</center><hr>"; 
    }


}
