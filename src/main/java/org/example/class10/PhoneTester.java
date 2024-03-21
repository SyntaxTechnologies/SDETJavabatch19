package org.example.class10;

public class PhoneTester {
    public static void main(String[] args) {
        Phone samsung=new Phone();
        samsung.make="Samsung";
        samsung.model="note 330";
        samsung.color="Blue";
        samsung.price=1100;
        samsung.screenSIze=6.5;
        System.out.println(samsung.make);
        System.out.println(samsung.model);
        System.out.println(samsung.color);
        System.out.println(samsung.price);
        System.out.println(samsung.screenSIze);
        samsung.sendText();
        samsung.makePhoneCall();
        samsung.takePhotos();

        System.out.println();

        Phone iPhone=new Phone();
        iPhone.make="Iphone";
        iPhone.model="Iphone 14 Pro";
        iPhone.color="Blue";
        iPhone.price=4100;
        iPhone.screenSIze=6.0;
        System.out.println(iPhone.make);
        System.out.println(iPhone.model);
        System.out.println(iPhone.color);
        System.out.println(iPhone.price);
        System.out.println(iPhone.screenSIze);
        iPhone.sendText();
        iPhone.makePhoneCall();
        iPhone.takePhotos();

        System.out.println();

        Phone pixel=new Phone();
        pixel.make="Pixel";
        pixel.model="Pixel 330";
        pixel.color="Blue";
        pixel.price=1500;
        pixel.screenSIze=6.3;
        System.out.println(pixel.make);
        System.out.println(pixel.model);
        System.out.println(pixel.color);
        System.out.println(pixel.price);
        System.out.println(pixel.screenSIze);
        pixel.sendText();
        pixel.makePhoneCall();
        pixel.takePhotos();
    }
}
