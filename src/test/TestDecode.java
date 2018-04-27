package test;

import opencv.Img;

import org.opencv.core.Core;
import org.opencv.core.Mat;
import org.opencv.imgcodecs.Imgcodecs;

public class TestDecode {
	//装载库文件
	static {
		System.loadLibrary(Core.NATIVE_LIBRARY_NAME);
	}

	/**
	 * 测试彩图解密
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		// 测试1
		Mat image_src = new Mat();
		image_src = Imgcodecs.imread("G:/imgopencv/test/2.jpg");
		Img tool = new Img();
		tool.decode(image_src, "G:/imgopencv/test/3.jpg");

		// //测试2
		// Img tool = new Img();
		// tool.decode("E:/imgopencv/test/2.jpg", "E:/imgopencv/test/3.jpg");
	}

}
