package test;

import org.opencv.core.Core;
import org.opencv.core.Mat;
import org.opencv.core.Point;
import org.opencv.core.Scalar;
import org.opencv.core.Size;
import org.opencv.imgcodecs.Imgcodecs;
import org.opencv.imgproc.Imgproc;

public class Rotate {
	//装载库文件
	static {
		System.loadLibrary(Core.NATIVE_LIBRARY_NAME);
	}
	/**
	 * 图片旋转
	 */
	public static void main(String[] args) {
		Mat image_compare = new Mat();
		image_compare = Imgcodecs.imread("G:/imgopencv/test2/0098.jpg");
		// 旋转中心
		Point center = new Point(image_compare.cols()/2,image_compare.rows()/2);
		// 旋转角度 正值表示逆时针旋转。
		double angle = 4;
		// 缩放尺度
		double scale = 1;
		//计算旋转加缩放的仿射矩阵
		Mat M = Imgproc.getRotationMatrix2D(center, angle, scale);
		Mat dst = new Mat();
		//对图像做仿射变换
		Imgproc.warpAffine(image_compare, dst, M, new Size(image_compare.width(),image_compare.height()), 1, 0, new Scalar(255,255,255));
 		Imgcodecs.imwrite("G:/imgopencv/test3/0011.jpg", dst);

	}

}
