public class Browser {
    public void navigate(String address){
     String ip = findIdAddress(address);
     String html = sendHttpRequest(ip);
    }

    private String sendHttpRequest(String ip) {
        return "<html></html>";
    }

    private String findIdAddress(String address) {
        return "127.0.0.1";
    }
}
