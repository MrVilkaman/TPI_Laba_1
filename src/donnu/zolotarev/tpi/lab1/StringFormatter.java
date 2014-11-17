package donnu.zolotarev.tpi.lab1;

public class StringFormatter {


    private static final String PROTOCOL = "http://";
    private static final String PROTOCOL_SECURE = "https://";

    public String webString(String s) throws NullPointerException{
        if (s == null){
            throw new NullPointerException();
        }
        String newUrl;
        boolean haveSecure  = s.contains("secure");
        boolean haveProtocol  = s.contains("http");

        if (!haveProtocol){
            if (!haveSecure){
                newUrl = PROTOCOL.concat(s);
            }else{
                newUrl = PROTOCOL_SECURE.concat(s);
            }
        }else{
            newUrl = s;
        }

        return newUrl;
    }
}
