package com.video.launcher;
public class Video {
    String title;
    float avgRate = 0.0f;
    boolean flag = false;
    boolean checked() {
        if (flag)
            return true;
        else
            return false;
    }
    boolean returned(){
        if (flag)
            return false;
        else
            return true;
    }
    boolean rating(){
        if (avgRate == 0.0f)
            return true;
        else
            return false;
    }

}
