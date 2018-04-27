package opencv;

import org.opencv.core.Core;
import org.opencv.core.CvType;
import org.opencv.core.Mat;
import org.opencv.core.Rect;
import org.opencv.imgcodecs.Imgcodecs;
import org.opencv.imgproc.Imgproc;

public class Interception {
	// 装载库文件
	static {
		System.loadLibrary(Core.NATIVE_LIBRARY_NAME);
	}

	/**
	 * 截取一张图片的固定部分图像并保存
	 * 
	 * @param srcImg
	 *            原图，要截取的图
	 * @param img1
	 *            输出车主姓名图片的地址
	 * @param img2
	 *            输出联系电话托盘的地址
	 * @param img3
	 *            输出车型及排量的地址
	 * @param img4
	 *            输出车架号的地址
	 * @param img5
	 *            输出行驶里程的地址
	 * @param img6
	 *            输出经销商名称的地址
	 * @param img7
	 *            输出电话托盘的地址
	 * @param img8
	 *            输出经销商盖章的地址
	 * @param img9
	 *            输出客户签字的地址
	 */
	public void Interception(String srcImg, String img1, String img2,
			String img3, String img4, String img5, String img6, String img7,
			String img8, String img9) {
		// 读取原图片
		Mat img_src = new Mat();
		img_src = Imgcodecs.imread(srcImg);
		Mat img_mid = new Mat();
		// 将读取的原图片转为灰图
		Imgproc.cvtColor(img_src, img_mid, Imgproc.COLOR_RGB2GRAY);
		Mat img_mid1 = new Mat();
		// 对图片进行二值化处理 手动指定一个阈值，以此阈值来进行二值化处理
		// type /* value = value > threshold ? max_value : 0 */
		Imgproc.threshold(img_mid, img_mid1, 200, 255, 0);
		// 复制原图片到指定大小的新图片（也是为了不破坏原图片）
		// 宽*高
		Mat img_copy = new Mat(img_src.width(), img_src.height(), CvType
				.depth(1));
		img_mid1.copyTo(img_copy);

//		Imgcodecs.imwrite("E:/imgopencv/screenshot/binary_0098.jpg", img_copy);

		// 设置剪切图片的位置并输出图片 rect(左上角点的坐标和矩形的宽和高)
		// img1 车主姓名
		Rect rect1 = new Rect(270, 307, 196, 30);
		Mat img_name = new Mat(img_copy, rect1);
		Imgcodecs.imwrite(img1, img_name);
		// imag2 联系电话
		Rect rect2 = new Rect(630, 307, 240, 33);
		Mat img_telNum = new Mat(img_copy, rect2);
		Imgcodecs.imwrite(img2, img_telNum);
		// img3 车型及排量
		Rect rect3 = new Rect(270, 373, 200, 33);
		Mat img_car = new Mat(img_copy, rect3);
		Imgcodecs.imwrite(img3, img_car);
		// img4 车架号
		Rect rect4 = new Rect(640, 373, 300, 33);
		Mat img_vin = new Mat(img_copy, rect4);
		Imgcodecs.imwrite(img4, img_vin);
		// img5 车牌号码
		Rect rect5 = new Rect(270, 405, 200, 28);
		Mat img_num = new Mat(img_copy, rect5);
		Imgcodecs.imwrite(img5, img_num);
		// img6 行驶里程
		Rect rect6 = new Rect(640, 405, 200, 28);
		Mat mileage = new Mat(img_copy, rect6);
		Imgcodecs.imwrite(img6, mileage);
		// img7 经销商名称
		Rect rect7 = new Rect(273, 685, 420, 32);
		Mat Dealer_name = new Mat(img_copy, rect7);
		Imgcodecs.imwrite(img7, Dealer_name);
		// img8 经销商盖章
		Rect rect8 = new Rect(296, 888, 242, 218);
		Mat stamp = new Mat(img_copy, rect8);
		Imgcodecs.imwrite(img8, stamp);
		// img9 客户签字
		Rect rect9 = new Rect(660, 888, 242, 218);
		Mat sign = new Mat(img_copy, rect9);
		Imgcodecs.imwrite(img9, sign);

	}

	/**
	 * 重载
	 * 
	 * 截取一张图片的固定部分图像并保存
	 * 
	 * @param srcImg
	 *            原图，要截取的图
	 * @param img1
	 *            输出车主姓名图片的地址
	 * @param img2
	 *            输出联系电话托盘的地址
	 * @param img3
	 *            输出车型及排量的地址
	 * @param img4
	 *            输出车架号的地址
	 * @param img5
	 *            输出行驶里程的地址
	 * @param img6
	 *            输出经销商名称的地址
	 * @param img7
	 *            输出电话托盘的地址
	 * @param img8
	 *            输出经销商盖章的地址
	 * @param img9
	 *            输出客户签字的地址
	 */
	public void Interception(Mat srcImg, String img1, String img2, String img3,
			String img4, String img5, String img6, String img7, String img8,
			String img9) {
		Mat img_mid = new Mat();
		// 将读取的原图片转为灰图
		Imgproc.cvtColor(srcImg, img_mid, Imgproc.COLOR_RGB2GRAY);
		Mat img_mid1 = new Mat();
		// 对图片进行二值化处理 手动指定一个阈值，以此阈值来进行二值化处理
		// type /* value = value > threshold ? max_value : 0 */
		Imgproc.threshold(img_mid, img_mid1, 200, 255, 0);
		// 复制原图片到指定大小的新图片（也是为了不破坏原图片）
		// 宽*高
		Mat img_copy = new Mat(srcImg.width(), srcImg.height(), CvType.depth(1));
		img_mid1.copyTo(img_copy);

		// Imgcodecs.imwrite("E:/imgopencv/screenshot/binary_0098.jpg",
		// img_copy);

		// 设置剪切图片的位置并输出图片 rect(左上角点的坐标和矩形的宽和高)
		// img1 车主姓名
		Rect rect1 = new Rect(270, 307, 196, 30);
		Mat img_name = new Mat(img_copy, rect1);
		Imgcodecs.imwrite(img1, img_name);
		// imag2 联系电话
		Rect rect2 = new Rect(630, 307, 240, 33);
		Mat img_telNum = new Mat(img_copy, rect2);
		Imgcodecs.imwrite(img2, img_telNum);
		// img3 车型及排量
		Rect rect3 = new Rect(270, 373, 200, 33);
		Mat img_car = new Mat(img_copy, rect3);
		Imgcodecs.imwrite(img3, img_car);
		// img4 车架号
		Rect rect4 = new Rect(640, 373, 300, 33);
		Mat img_vin = new Mat(img_copy, rect4);
		Imgcodecs.imwrite(img4, img_vin);
		// img5 车牌号码
		Rect rect5 = new Rect(270, 405, 200, 28);
		Mat img_num = new Mat(img_copy, rect5);
		Imgcodecs.imwrite(img5, img_num);
		// img6 行驶里程
		Rect rect6 = new Rect(640, 405, 200, 28);
		Mat mileage = new Mat(img_copy, rect6);
		Imgcodecs.imwrite(img6, mileage);
		// img7 经销商名称
		Rect rect7 = new Rect(273, 685, 420, 32);
		Mat Dealer_name = new Mat(img_copy, rect7);
		Imgcodecs.imwrite(img7, Dealer_name);
		// img8 经销商盖章
		Rect rect8 = new Rect(296, 888, 242, 218);
		Mat stamp = new Mat(img_copy, rect8);
		Imgcodecs.imwrite(img8, stamp);
		// img9 客户签字
		Rect rect9 = new Rect(660, 888, 242, 218);
		Mat sign = new Mat(img_copy, rect9);
		Imgcodecs.imwrite(img9, sign);
	}

	/**
	 * 截取一张未二值化的图片的固定部分图像并保存
	 * 
	 * @param srcImg
	 *            原图，要截取的图
	 * @param img1
	 *            输出车主姓名图片的地址
	 * @param img2
	 *            输出联系电话托盘的地址
	 * @param img3
	 *            输出车型及排量的地址
	 * @param img4
	 *            输出车架号的地址
	 * @param img5
	 *            输出行驶里程的地址
	 * @param img6
	 *            输出经销商名称的地址
	 * @param img7
	 *            输出电话托盘的地址
	 * @param img8
	 *            输出经销商盖章的地址
	 * @param img9
	 *            输出客户签字的地址
	 */
	public void InterceptionSrc(String srcImg, String img1, String img2,
			String img3, String img4, String img5, String img6, String img7,
			String img8, String img9) {
		// 读取原图片
		Mat img_src = new Mat();
		img_src = Imgcodecs.imread(srcImg);
		// 复制原图片到指定大小的新图片（也是为了不破坏原图片）
		// 宽*高
		Mat img_copy = new Mat(img_src.width(), img_src.height(), CvType
				.depth(1));
		img_src.copyTo(img_copy);
//		Imgcodecs.imwrite("E:/imgopencv/screenshotSrc/src_0098.jpg", img_copy);
		// 设置剪切图片的位置并输出图片 rect(左上角点的坐标和矩形的宽和高)
		// img1 车主姓名
		Rect rect1 = new Rect(270, 307, 196, 30);
		Mat img_name = new Mat(img_copy, rect1);
		Imgcodecs.imwrite(img1, img_name);
		// imag2 联系电话
		Rect rect2 = new Rect(630, 307, 240, 33);
		Mat img_telNum = new Mat(img_copy, rect2);
		Imgcodecs.imwrite(img2, img_telNum);
		// img3 车型及排量
		Rect rect3 = new Rect(270, 373, 200, 33);
		Mat img_car = new Mat(img_copy, rect3);
		Imgcodecs.imwrite(img3, img_car);
		// img4 车架号
		Rect rect4 = new Rect(640, 373, 300, 33);
		Mat img_vin = new Mat(img_copy, rect4);
		Imgcodecs.imwrite(img4, img_vin);
		// img5 车牌号码
		Rect rect5 = new Rect(270, 405, 200, 28);
		Mat img_num = new Mat(img_copy, rect5);
		Imgcodecs.imwrite(img5, img_num);
		// img6 行驶里程
		Rect rect6 = new Rect(640, 405, 200, 28);
		Mat mileage = new Mat(img_copy, rect6);
		Imgcodecs.imwrite(img6, mileage);
		// img7 经销商名称
		Rect rect7 = new Rect(273, 685, 420, 32);
		Mat Dealer_name = new Mat(img_copy, rect7);
		Imgcodecs.imwrite(img7, Dealer_name);
		// img8 经销商盖章
		Rect rect8 = new Rect(296, 888, 242, 218);
		Mat stamp = new Mat(img_copy, rect8);
		Imgcodecs.imwrite(img8, stamp);
		// img9 客户签字
		Rect rect9 = new Rect(660, 888, 242, 218);
		Mat sign = new Mat(img_copy, rect9);
		Imgcodecs.imwrite(img9, sign);

	}

}
