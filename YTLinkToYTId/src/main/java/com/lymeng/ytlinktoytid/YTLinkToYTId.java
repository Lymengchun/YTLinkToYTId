package com.lymeng.ytlinktoytid;

import android.util.Log;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class YTLinkToYTId {

    public String extractYouTubeID(String ytUrl) {
        if(ytUrl!=null&&ytUrl.length()>0){
            if (!ytUrl.toLowerCase().startsWith("http")){
                if (ytUrl.toLowerCase().startsWith("//")){
                    ytUrl = "http:"+ytUrl;
                }
                if (ytUrl.toLowerCase().startsWith("www.")){
                    ytUrl = "http://"+ytUrl;
                }
            }
        }
        //ytUrl = "www.youtube.com/embed/Fy2AaU4c1sM";
    /*
    http://www.youtube.com/watch?v=0zM4nApSvMg&feature=feedrec_grec_index
    http://www.youtube.com/user/SomeUser#p/a/u/1/QDK8U-VIH_o
    http://www.youtube.com/v/0zM4nApSvMg?fs=1&amp;hl=en_US&amp;rel=0
    http://www.youtube.com/watch?v=0zM4nApSvMg#t=0m10s
    http://www.youtube.com/embed/0zM4nApSvMg?rel=0
    http://www.youtube.com/watch?v=0zM4nApSvMg
    http://youtu.be/0zM4nApSvMg
    */

        String vId = "";
        Pattern pattern = Pattern.compile("^https?://.*(?:youtu.be/|v/|u/\\w/|embed/|watch?v=)([^#&?]*).*$", Pattern.CASE_INSENSITIVE);
        assert ytUrl != null;
        Matcher matcher = pattern.matcher(ytUrl);
        if (matcher.matches()){
            vId = matcher.group(1);
        }

        Log.e("ut url = ", vId+"");

        return vId;
    }
}
