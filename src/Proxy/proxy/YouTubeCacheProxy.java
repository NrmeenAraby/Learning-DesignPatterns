package Proxy.proxy;

import Proxy.some_cool_media_library.ThirdPartyYouTubeLib;
import Proxy.some_cool_media_library.Video;

import java.util.HashMap;

public class YouTubeCacheProxy implements ThirdPartyYouTubeLib {

    private ThirdPartyYouTubeLib realYoutubeService;  //real service
    HashMap<String,Video> cachePopular =new HashMap<>();
    HashMap<String,Video> cacheAll =new HashMap<>();
    public YouTubeCacheProxy(ThirdPartyYouTubeLib realYoutubeService){
        this.realYoutubeService=realYoutubeService;
    }
    @Override
    public HashMap<String, Video> popularVids() {
        if(cachePopular.isEmpty()){
            cachePopular=realYoutubeService.popularVids();
        }
        else{
            System.out.println("Retrieved list from cache");
        }
        return cachePopular;
    }

    @Override
    public Video getVideo(String videoId) {
        Video video=cacheAll.get(videoId);
        if(video==null){
            video=realYoutubeService.getVideo(videoId);
            cacheAll.put(videoId,video);
        }else{
            System.out.println("Retrieved video '" + videoId + "' from cache.");
        }
        return video;
    }

    public void reset(){
        cachePopular.clear();
        cacheAll.clear();
    }
}
