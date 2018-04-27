package test;

import org.opencv.core.Core;
import org.opencv.core.Mat;
import org.opencv.imgcodecs.Imgcodecs;

import tessdata.ToWord;

public class test {
	static {
		System.loadLibrary(Core.NATIVE_LIBRARY_NAME);
	}
    public static void main(String[] args) {
    	Mat img_src = new Mat();
		img_src = Imgcodecs.imread("G:/workspace/imgopencv/testModel2/mod1.jpg");
    	ToWord tw = new ToWord();
    	tw.init();
		System.out.println(tw.imgtoword(img_src));
    	
    	
//    	ToWord tw = new ToWord();
//    	tw.init();
//    	System.out.println(tw.imgtoword("C:\\apache-tomcat-7.0.57\\webapps\\picture\\upload\\check1.jpg", ""));
//    	System.out.println(tw.imgtoword("C:\\apache-tomcat-7.0.57\\webapps\\picture\\upload\\check2.jpg", ""));
//		System.out.println(tw.imgtoword("C:\\apache-tomcat-7.0.57\\webapps\\picture\\upload\\check3.jpg", ""));
//		System.out.println(tw.imgtoword("C:\\apache-tomcat-7.0.57\\webapps\\picture\\upload\\check4.jpg", ""));
//		System.out.println(tw.imgtoword("C:\\apache-tomcat-7.0.57\\webapps\\picture\\upload\\check5.jpg", ""));
//		System.out.println(tw.imgtoword("C:\\apache-tomcat-7.0.57\\webapps\\picture\\upload\\check6.jpg", ""));
//		System.out.println(tw.imgtoword("C:\\apache-tomcat-7.0.57\\webapps\\picture\\upload\\check7.jpg", ""));
    	/*
    	ITesseract instance = new Tesseract();       
         instance.setDatapath("C:\\Users\\Administrator\\Desktop\\tess4jexp\\ORC_test\\bin\\tessdata");  
         instance.setLanguage("chi_sim"); 
        File imageFile = new File("C:\\Temp\\2.jpg");
        try {
        	System.out.println("无异常");
            String result = instance.doOCR(imageFile);
            System.out.println(result);
        } catch (TesseractException e) {
        	System.out.println("有异常");
            System.err.println(e.getMessage());
        }
        */
    }
}
