package com.video.launcher;

import java.util.Scanner;

public class VideoStoreLauncher {
    public static void main(String[] args) {
        boolean loop = true;
        int numberOfVideos = 0;
        VideoStore[] v = new VideoStore[10];
        Scanner sc = new Scanner(System.in);
        while (loop){
            System.out.println("1.Add Videos\n2.Insert Rating\n3.Checkout Videos\n4.Return Videos\n5.Display Videos\n6.Exit\nSelect An Option:");
            int option = sc.nextInt();
            switch (option){
                case 1:
                    System.out.println("Enter the number of videos:");
                    numberOfVideos = sc.nextInt();
                    for (int i=0;i<numberOfVideos;i++){
                        System.out.println("Enter the name of v"+i);
                        v[i]=new VideoStore();
                        String vname = sc.next();
                        v[i].addVideo(vname);
                    }
                    break;
                case 2:
                    System.out.println("Enter the number of rating");
                    int totalRating = sc.nextInt();
                    for(int i=0;i<totalRating;i++){
                        for (int j=0;j<numberOfVideos;j++){
                            int rate = sc.nextInt();
                            v[j].receiveRating(rate);
                        }
                    }
                    break;
                case 3:
                    System.out.println("Enter the name of the video to check:");
                    String check =sc.next();
                    for (int i=0;i<numberOfVideos;i++){
                        if (check.equalsIgnoreCase(v[i].title))
                            v[i].checkOut(check);
                    }
                    break;
                case 4:
                    System.out.println("Enter the name of the video to return:");
                    String returnVideo = sc.next();
                    for (int i=0;i<numberOfVideos;i++){
                        if (returnVideo.equalsIgnoreCase(v[i].title))
                            v[i].returnVideo(returnVideo);
                    }
                    break;
                case 5:
                    System.out.println("Video Title\tVideo Status\tVideo Rating");
                    for (int i=0;i<numberOfVideos;i++){
                        v[i].listInventory(numberOfVideos);
                    }
                    break;
                case 6:
                    loop=false;
                    break;
                    default:
                        System.out.println("Invalid Option");
            }
        }
    }
}
