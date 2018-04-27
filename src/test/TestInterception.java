package test;

import opencv.ImgAmend;
import opencv.Interception;

public class TestInterception {
	/**
	 * 测试截取一张图片的固定部分图像并保存
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
//		ImgAmend ia = new ImgAmend();
//		ia.ImgProcess(
//				"G:/imgopencv/screenshot/mod1.jpg",
//				"G:/imgopencv/screenshot/mod2.jpg",
//				"G:/imgopencv/screenshot/mod.jpg",
//				"G:/imgopencv/screenshot/8.jpg",
//				"G:/imgopencv/screenshot/dst3.jpg");
		// 测试1
		Interception inter1 = new Interception();
		inter1.Interception("G:/imgopencv/screenshot/dst3.jpg",
				"G:/imgopencv/screenshot/0098_1.jpg",
				"G:/imgopencv/screenshot/0098_2.jpg",
				"G:/imgopencv/screenshot/0098_3.jpg",
				"G:/imgopencv/screenshot/0098_4.jpg",
				"G:/imgopencv/screenshot/0098_5.jpg",
				"G:/imgopencv/screenshot/0098_6.jpg",
				"G:/imgopencv/screenshot/0098_7.jpg",
				"G:/imgopencv/screenshot/0098_8.jpg",
				"G:/imgopencv/screenshot/0098_9.jpg");
//		inter1.InterceptionSrc("E:/imgopencv/screenshotSrc/0103.jpg",
//				"E:/imgopencv/screenshotSrc/0098_1.jpg",
//				"E:/imgopencv/screenshotSrc/0098_2.jpg",
//				"E:/imgopencv/screenshotSrc/0098_3.jpg",
//				"E:/imgopencv/screenshotSrc/0098_4.jpg",
//				"E:/imgopencv/screenshotSrc/0098_5.jpg",
//				"E:/imgopencv/screenshotSrc/0098_6.jpg",
//				"E:/imgopencv/screenshotSrc/0098_7.jpg",
//				"E:/imgopencv/screenshotSrc/0098_8.jpg",
//				"E:/imgopencv/screenshotSrc/0098_9.jpg");
		// 测试2
		// Interception inter = new Interception();
		// Mat image_src = new Mat();
		// image_src =
		// Imgcodecs.imread("E:/imgopencv/test2/screenshot/src1.jpg");
		// inter.Interception(image_src);
	}

}
