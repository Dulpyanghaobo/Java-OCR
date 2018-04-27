package test;

import opencv.Img;

import org.opencv.core.Core;
import org.opencv.core.Mat;
import org.opencv.imgcodecs.Imgcodecs;

public class TestEncrypt {
	//装载库文件
	static {
		System.loadLibrary(Core.NATIVE_LIBRARY_NAME);
	}

	/**
	 * 测试彩图加密
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		// //测试1
		Mat image_src = new Mat();
		image_src = Imgcodecs.imread("G:/imgopencv/test/1.jpg");
		Img tool = new Img();
		tool.encrypt(image_src, "uftutf59305", "G:/imgopencv/test/2.jpg");

		// //测试2
		// Img tool = new Img();
		// tool.encrypt("E:/imgopencv/test/1.jpg","E:/imgopencv/test/2.jpg"
		// ,"hello4646");
	}

}
