package test;

import opencv.DFTUtil;

import org.opencv.core.Core;
import org.opencv.core.Mat;
import org.opencv.imgcodecs.Imgcodecs;
import org.opencv.imgproc.Imgproc;

public class TestScreen {
	//装载库文件
	static {
		System.loadLibrary(Core.NATIVE_LIBRARY_NAME);
	}

	/**
	 * 对截图进行解密测试
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		// 初始化参数
		DFTUtil img = DFTUtil.getInstance();
		Mat image_src = new Mat();
		Mat image_tmp = new Mat();
		image_src = Imgcodecs.imread("E:/imgopencv/test1/1.jpg");
		Imgproc.cvtColor(image_src, image_tmp, Imgproc.COLOR_RGB2GRAY);
		Mat image_new = new Mat();
		image_new = img.transformImage(image_tmp);
		Imgcodecs.imwrite("E:/imgopencv/test1/2.jpg", image_new);

		// image_src = Imgcodecs.imread("E:/imgopencv/test1/r1.jpg");
		// Imgproc.cvtColor(image_src, image_tmp, Imgproc.COLOR_RGB2GRAY);
		// Mat image_new = new Mat();
		// image_new = img.transformImage(image_tmp);
		// Imgcodecs.imwrite("E:/imgopencv/test1/rr1.jpg",image_new);

		// image_src = Imgcodecs.imread("E:/imgopencv/test1/r2.jpg");
		// Imgproc.cvtColor(image_src, image_tmp, Imgproc.COLOR_RGB2GRAY);
		// Mat image_new = new Mat();
		// image_new = img.transformImage(image_tmp);
		// Imgcodecs.imwrite("E:/imgopencv/test1/rr2.jpg",image_new);

		// image_src = Imgcodecs.imread("E:/imgopencv/test1/r3.jpg");
		// Imgproc.cvtColor(image_src, image_tmp, Imgproc.COLOR_RGB2GRAY);
		// Mat image_new = new Mat();
		// image_new = img.transformImage(image_tmp);
		// Imgcodecs.imwrite("E:/imgopencv/test1/rr3.jpg",image_new);

		// image_src = Imgcodecs.imread("E:/imgopencv/test1/r4.jpg");
		// Imgproc.cvtColor(image_src, image_tmp, Imgproc.COLOR_RGB2GRAY);
		// Mat image_new = new Mat();
		// image_new = img.transformImage(image_tmp);
		// Imgcodecs.imwrite("E:/imgopencv/test1/rr4.jpg",image_new);

		// image_src = Imgcodecs.imread("E:/imgopencv/test1/r5.jpg");
		// Imgproc.cvtColor(image_src, image_tmp, Imgproc.COLOR_RGB2GRAY);
		// Mat image_new = new Mat();
		// image_new = img.transformImage(image_tmp);
		// Imgcodecs.imwrite("E:/imgopencv/test1/rr5.jpg",image_new);

		// image_src = Imgcodecs.imread("E:/imgopencv/test1/r6.jpg");
		// Imgproc.cvtColor(image_src, image_tmp, Imgproc.COLOR_RGB2GRAY);
		// Mat image_new = new Mat();
		// image_new = img.transformImage(image_tmp);
		// Imgcodecs.imwrite("E:/imgopencv/test1/rr6.jpg",image_new);

		// image_src = Imgcodecs.imread("E:/imgopencv/test1/r7.jpg");
		// Imgproc.cvtColor(image_src, image_tmp, Imgproc.COLOR_RGB2GRAY);
		// Mat image_new = new Mat();
		// image_new = img.transformImage(image_tmp);
		// Imgcodecs.imwrite("E:/imgopencv/test1/rr7.jpg",image_new);

		// image_src = Imgcodecs.imread("E:/imgopencv/test1/r8.jpg");
		// Imgproc.cvtColor(image_src, image_tmp, Imgproc.COLOR_RGB2GRAY);
		// Mat image_new = new Mat();
		// image_new = img.transformImage(image_tmp);
		// Imgcodecs.imwrite("E:/imgopencv/test1/rr8.jpg",image_new);

		// image_src = Imgcodecs.imread("E:/imgopencv/test1/r9.jpg");
		// Imgproc.cvtColor(image_src, image_tmp, Imgproc.COLOR_RGB2GRAY);
		// Mat image_new = new Mat();
		// image_new = img.transformImage(image_tmp);
		// Imgcodecs.imwrite("E:/imgopencv/test1/rr9.jpg",image_new);

		// image_src = Imgcodecs.imread("E:/imgopencv/test1/r10.jpg");
		// Imgproc.cvtColor(image_src, image_tmp, Imgproc.COLOR_RGB2GRAY);
		// Mat image_new = new Mat();
		// image_new = img.transformImage(image_tmp);
		// Imgcodecs.imwrite("E:/imgopencv/test1/rr10.jpg",image_new);
	}

}
