# YTLinkToYTId
 ```
	dependencies {
	
	        implementation 'com.github.Lymengchun:YTLinkToYTId:Tag'
		
	}
  ```
  # Type of link
  ```
    ytUrl = "www.youtube.com/embed/Fy2AaU4c1sM";
    
    http://www.youtube.com/watch?v=0zM4nApSvMg&feature=feedrec_grec_index
    http://www.youtube.com/user/SomeUser#p/a/u/1/QDK8U-VIH_o
    http://www.youtube.com/v/0zM4nApSvMg?fs=1&amp;hl=en_US&amp;rel=0
    http://www.youtube.com/watch?v=0zM4nApSvMg#t=0m10s
    http://www.youtube.com/embed/0zM4nApSvMg?rel=0
    http://www.youtube.com/watch?v=0zM4nApSvMg
    http://youtu.be/0zM4nApSvMg
 ```
# Implement
     YTLinkToYTId ytLinkToYTId = new YTLinkToYTId();
     Log.d("Demo","ytid:"+ytLinkToYTId.extractYouTubeID("http://www.youtube.com/embed/0zM4nApSvMg?rel=0"));
	
