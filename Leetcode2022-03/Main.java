import java.util.*;
import java.util.List;
//huawei paper exam
import java.awt.*;

public class Main {

    public static void main(String[] args) throws AWTException {
        if (SystemTray.isSupported()) {
            Main nd = new Main();
            nd.displayTray();
        } else { 
            System.err.println("System tray not supported!");
        }
    }

    public void displayTray() throws AWTException {
        //Obtain only one instance of the SystemTray object
        SystemTray tray = SystemTray.getSystemTray();

        //If the icon is a file
        Image image = Toolkit.getDefaultToolkit().createImage("icon.png");
        //Alternative (if the icon is on the classpath):
        //Image image = Toolkit.getDefaultToolkit().createImage(getClass().getResource("icon.png"));

        TrayIcon trayIcon = new TrayIcon(image, "Tray Demo");
        //Let the system resize the image if needed
        trayIcon.setImageAutoSize(true);
        //Set tooltip text for the tray icon
        trayIcon.setToolTip("System tray icon demo");
        tray.add(trayIcon);

        trayIcon.displayMessage("Hello, World", "notification demo", TrayIcon.MessageType.INFO);
    }

}


class test01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count = 0;
        String[] s = sc.nextLine().split(" ");
        int[] a = new int[s.length];
        for (int i = 0; i < s.length; i++) {
            a[i] = Integer.parseInt(s[i]);
        }
        int i = 0, copy = 0;
        boolean flag = false;
        while (i < s.length) {
            if (a[i] == 1) {
                if (!flag) count++;
                else {
                    count = 1;
                    flag = false;
                }
            } else if (a[i] == 2 && flag) {
                copy = count;
            } else if (a[i] == 3 && flag) {
                copy = count;
                count = 0;
                flag = false;
            } else if (a[i] == 4) {
                if (!flag) count += copy;
                else {
                    count = copy;
                    flag = false;
                }
            } else flag = true;
            i++;
        }
        System.out.println(count);
    }//1 5 2 2 4
}

class test02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean flag = false;
        String s = sc.next();
        if (!s.matches("[a-z0-9]+") || (s.charAt(s.length() - 1) > '0' && s.charAt(s.length() - 1) <= '9'))
            System.out.println("!error");
        else {
            StringBuffer sb = new StringBuffer();
            int t = 0, i = 0;
            char c = 0;
            for (i = 0; i < s.length(); i++) {
                if (s.charAt(i) >= '0' && s.charAt(i) <= '9') {
                    if (s.charAt(i) <= '2' && t == 0) {
                        System.out.println("!error");
                        flag = true;
                        break;
                    } else t = t * 10 + s.charAt(i) - '0';
                } else if (t > 0) {
                    if (s.charAt(i) == c) {
                        System.out.println("!error");
                        flag = true;
                    } else {
                        for (int j = 1; j <= t; j++)
                            sb.append(s.charAt(i));
                        t = 0;
                        c = s.charAt(i);
                    }
                } else {
                    if (s.charAt(i) == c) {
                        System.out.println("!error");
                        flag = true;
                    } else if (i >= 2 && s.charAt(i - 2) == s.charAt(i - 1) && s.charAt(i - 1) == s.charAt(i)) {
                        System.out.println("!error");
                        flag = true;
                    } else sb.append(s.charAt(i));
                }
            }
            if (!flag) {
                if (t == 0) System.out.println(sb.toString());
                else System.out.println("!error");
            }
        }
    }
}

class test03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] s = sc.next().split(",");
        String[] regular = sc.next().split(",");
        Map<String, List<String>> map = new HashMap<>();
        Set<String> set = new LinkedHashSet<>();
        for (int i = 0; i < s.length; i++) {
            String[] temp = s[i].split("-");
            set.add(temp[0]);
            set.add(temp[1]);
            if (map.containsKey(temp[1])) {
                map.get(temp[1]).add(temp[0]);
            } else {
                List<String> list = new ArrayList<>();
                list.add(temp[0]);
                map.put(temp[1], list);
            }
        }
        for (int i = 0; i < regular.length; i++) {
            String temp = regular[i];
            if (set.contains(temp)) set.remove(temp);
            if (map.containsKey(temp)) {
                for (String str : map.get(temp)) {
                    if (set.contains(str)) set.remove(str);
                }
                map.remove(temp);
            }
        }
        if (set.size() > 0) {
            Iterator<String> i = set.iterator();
            while (i.hasNext()) {
                System.out.print(i.next());
                if (i.hasNext()) System.out.printf(",");
            }
        } else System.out.print(",");
    }
}