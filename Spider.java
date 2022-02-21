package spider;

import com.gargoylesoftware.htmlunit.WebClient;
import com.gargoylesoftware.htmlunit.html.HtmlButton;
import com.gargoylesoftware.htmlunit.html.HtmlPage;
import com.gargoylesoftware.htmlunit.html.HtmlPasswordInput;
import com.gargoylesoftware.htmlunit.html.HtmlTextInput;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Element;

import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;

public class Spider {
    static String uri = "http://192.168.11.166/zentao/user-login.html";
    static String taskNum;
    static String projectName;
    public static void main(String[] args) {
        taskNum = args[0];
        projectName = args[1];
        System.out.println(args[0]);
        System.out.println(args[1]);
        try {
            login();
        }catch (Exception e){
            System.out.println(e);
        }
    }
    public static void login() throws IOException {
        //var uri = "http://192.168.11.166/zentao/user-login.html";
        var webclient = new WebClient();
        webclient.getOptions().setCssEnabled(false);
        webclient.getOptions().setJavaScriptEnabled(false);
        HtmlPage htmlPage = webclient.getPage(uri);
        var form = htmlPage.getForms().get(0);

        HtmlTextInput acconut = form.getInputByName("account");
        HtmlPasswordInput password = form.getInputByName("password");
        HtmlButton submit = (HtmlButton) htmlPage.getElementById("submit");

        acconut.setValueAttribute("liushuai");
        password.setValueAttribute("liu342423");
        HtmlPage index = submit.click();
        System.out.println(index.getBody());

        var taskuri = "http://192.168.11.166/zentao/task-view-"+taskNum;
        HtmlPage taskPage = webclient.getPage(taskuri);
        var docu = Jsoup.parse(taskPage.asXml());
        //Element link = docu.getElementById("mainContent").getElementsByTag("a").get(0);
        Element link =docu.select("ul.files-list").get(0).getElementsByTag("a").get(0);
        var fileLink = "http://192.168.11.166"+link.attr("href");

        URL url = new URL(fileLink);
        BufferedReader reader = new BufferedReader(new InputStreamReader(url.openStream()));
        String filename = "D:\\git-dev\\"+projectName+"\\updatelist.txt";
        FileWriter writer = new FileWriter(filename);
        String s;
        while ((s = reader.readLine()) != null){
            writer.append(s+"\r\n");
        }

        reader.close();writer.close();
        webclient.close();
    }
}