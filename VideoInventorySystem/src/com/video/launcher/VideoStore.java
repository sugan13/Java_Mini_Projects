package com.video.launcher;

public class VideoStore extends Video {
    int count=0, sum=0;
    float avg = 0.0f;
    void addVideo(String vname){
        this.title = vname;
        this.flag = true;
        this.avgRate = 0.0f;
    }
    void checkOut(String check){
        boolean b = checked();
        if (b)
            this.flag = false;
        else
            System.out.println("Video is not available");
    }
    void returnVideo(String returnVideo){
        boolean b = returned();
        if (b)
            this.flag = true;
        else
            System.out.println("Video is already available");
    }
    void receiveRating(int rate){
        boolean b = rating();
        if (b){
            count++;
            sum = rate;
        }
        else{
            count++;
            sum = sum + rate;
        }
        avg = sum/count;
        this.avgRate = avg;
    }
    void listInventory(int numberOfVideos){
        System.out.print(this.title+"\t");
        if (flag)
            System.out.print("Available\t");
        else
            System.out.print("Not available\t");
        System.out.print(this.avgRate+"\t");
        System.out.println();
    }
}
