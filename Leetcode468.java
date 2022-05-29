public class Leetcode468 {
    public String validIPAddress(String queryIP) {
        if (queryIP.length() > 39)
            return "Neither";
        if (queryIP.contains(".")) {
            if (queryIP.startsWith(".") || queryIP.endsWith("."))
                return "Neither";
            var ip = queryIP.split("\\.");
            if (ip.length != 4)
                return "Neither";
            for (int i = 0; i < 4; i++) {
                if (ip[i].length() == 0)
                    return "Neither";
                for (int j = 0; j < ip[i].length(); j++) {
                    if (ip[i].charAt(j) < '0' || ip[i].charAt(j) > '9')
                        return "Neither";
                }
                int cnt = valueOf(ip[i]);
                if (cnt > 255 || cnt < 0 || (cnt == 0 && ip[i].length() > 1))
                    return "Neither";
            }
            return "IPv4";
        } else if (queryIP.contains(":")) {
            if (queryIP.startsWith(":") || queryIP.endsWith(":"))
                return "Neither";
            System.out.println("cc");
            var ip = queryIP.split(":");
            System.out.println(ip.length);
            if (ip.length != 8)
                return "Neither";
            for (int i = 0; i < 8; i++) {
                if (ip[i].length() < 1 || ip[i].length() > 4)
                    return "Neither";
                if (!ip[i].matches("[0-9a-fA-F]*"))
                    return "Neither";
            }
            return "IPv6";
        }
        return "Neither";
    }

    // 2001:0db8:85a3:0000:0000:8a2e:0370:7334
    // 02001:0db8:85a3:0000:0000:8a2e:0370:7334
    int valueOf(String s) {
        if (s.length() > 1 && s.charAt(0) == '0')
            return -1;
        return Integer.valueOf(s);
    }
}
