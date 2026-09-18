package Proxy.some_cool_media_library;

import java.util.HashMap;

public interface ThirdPartyYouTubeLib {
    HashMap<String, Video> popularVids ();

    Video getVideo(String videoId);
}
