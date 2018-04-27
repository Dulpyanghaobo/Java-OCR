package test;

import opencv.ModelIntercept;

import org.opencv.core.Core;
import org.opencv.core.Mat;
import org.opencv.imgcodecs.Imgcodecs;

import tessdata.ToWord;

public class TestIdentity {
	//装载库文件
		static {
			System.loadLibrary(Core.NATIVE_LIBRARY_NAME);
		}
	public static void main(String[] args) {
		//阈值100
		Mat img_src = new Mat();
		img_src = Imgcodecs.imread("G:/workspace/imgopencv/identity/src7.jpg");
		ModelIntercept mi = new ModelIntercept();
		mi.modelInit("src//identity.xml", 
				"G:/workspace/imgopencv/identity/mod.jpg",
				"G:/workspace/imgopencv/identity/mod1.jpg",
				"G:/workspace/imgopencv/identity/mod2.jpg");
		mi.interceptImg(img_src, "G:/workspace/imgopencv/identity/",100);
		ToWord tw = new ToWord();
		tw.init();
		System.out.println("姓名："+tw.imgtoword("G:/workspace/imgopencv/identity/img_1.jpg", ""));
		System.out.println("性别："+tw.imgtoword("G:/workspace/imgopencv/identity/img_2.jpg", ""));
		System.out.println("民族："+tw.imgtoword("G:/workspace/imgopencv/identity/img_3.jpg", ""));
		System.out.println("年："+tw.imgtoword("G:/workspace/imgopencv/identity/img_4.jpg", ""));
		System.out.println("月："+tw.imgtoword("G:/workspace/imgopencv/identity/img_5.jpg", ""));
		System.out.println("日："+tw.imgtoword("G:/workspace/imgopencv/identity/img_6.jpg", ""));
		System.out.println("住址："+tw.imgtoword("G:/workspace/imgopencv/identity/img_7.jpg", ""));
		System.out.println("公民身份号码："+tw.imgtoword("G:/workspace/imgopencv/identity/img_8.jpg", ""));
		
//		Mat img_src = new Mat();
//		img_src = Imgcodecs.imread("G:/workspace/imgopencv/identity1/yue.jpg");
//		ModelIntercept mi = new ModelIntercept();
//		mi.modelInit("src//identity1.xml", 
//				"G:/workspace/imgopencv/identity1/mod.jpg",
//				"G:/workspace/imgopencv/identity1/mod1.jpg",
//				"G:/workspace/imgopencv/identity1/mod2.jpg");
//		mi.interceptImg(img_src, "G:/workspace/imgopencv/identity1/");
//		ToWord tw = new ToWord();
//		tw.init();
//		System.out.println(tw.imgtoword("G:/workspace/imgopencv/identity1/img_1.jpg", ""));
//		System.out.println(tw.imgtoword("G:/workspace/imgopencv/identity1/img_2.jpg", ""));
//		System.out.println(tw.imgtoword("G:/workspace/imgopencv/identity1/img_3.jpg", ""));
//		System.out.println(tw.imgtoword("G:/workspace/imgopencv/identity1/img_4.jpg", ""));
//		System.out.println(tw.imgtoword("G:/workspace/imgopencv/identity1/img_5.jpg", ""));
//		System.out.println(tw.imgtoword("G:/workspace/imgopencv/identity1/img_6.jpg", ""));
		
		
		
//		Mat img_src = new Mat();
//		img_src = Imgcodecs.imread("G:/workspace/imgopencv/identity/yue2.jpg");
//		ModelIntercept mi = new ModelIntercept();
//		mi.modelInit("src//identity.xml", 
//				"G:/workspace/imgopencv/identity/mod.jpg",
//				"G:/workspace/imgopencv/identity/mod1.jpg",
//				"G:/workspace/imgopencv/identity/mod2.jpg");
//		mi.interceptImg(img_src, "G:/workspace/imgopencv/identity/");
//		ToWord tw = new ToWord();
//		tw.init();
//		System.out.println(tw.imgtoword("G:/workspace/imgopencv/identity/img_1.jpg", ""));
//		System.out.println(tw.imgtoword("G:/workspace/imgopencv/identity/img_2.jpg", ""));
//		System.out.println(tw.imgtoword("G:/workspace/imgopencv/identity/img_3.jpg", ""));
//		System.out.println(tw.imgtoword("G:/workspace/imgopencv/identity/img_4.jpg", ""));
//		System.out.println(tw.imgtoword("G:/workspace/imgopencv/identity/img_5.jpg", ""));
//		System.out.println(tw.imgtoword("G:/workspace/imgopencv/identity/img_6.jpg", ""));
	}

}
