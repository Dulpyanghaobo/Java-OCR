package test;

import opencv.ImgAmend;

import org.opencv.core.Mat;
import org.opencv.imgcodecs.Imgcodecs;

public class TestAmend {

	/**
	 * 测试图片处理
	 * @param args
	 */
	public static void main(String[] args) {
		ImgAmend ia = new ImgAmend();
		ia.ImgProcess(
				"C:/Users/Dulp/Desktop/imgopencv/pic/mod1.jpg",
				"C:/Users/Dulp/Desktop/imgopencv/pic/mod2.jpg",
				"C:/Users/Dulp/Desktop/imgopencv/pic/mod.jpg",
				"C:/Users/Dulp/Desktop/imgopencv/pic/src.jpg",
				"C:/Users/Dulp/Desktop/imgopencv/pic/dst3.jpg");
	
		
	}

}
