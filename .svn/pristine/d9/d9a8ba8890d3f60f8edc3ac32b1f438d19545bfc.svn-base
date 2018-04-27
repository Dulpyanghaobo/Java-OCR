package opencv;

import org.opencv.core.Core;
import org.opencv.core.CvType;
import org.opencv.core.Mat;
import org.opencv.core.Point;
import org.opencv.core.Rect;
import org.opencv.core.Scalar;
import org.opencv.core.Size;
import org.opencv.core.Core.MinMaxLocResult;
import org.opencv.imgcodecs.Imgcodecs;
import org.opencv.imgproc.Imgproc;

/**
 * 对图片进行匹配 旋转 缩放操作
 * 
 * @author Administrator
 * 
 */
public class ImgAmend {
	// 装载库文件
	static {
		System.loadLibrary(Core.NATIVE_LIBRARY_NAME);
	}

	/**
	 * @param mod1
	 *            模板1
	 * @param mod2
	 *            模板2
	 * @param mod
	 *            标准模板（整图）
	 * @param srcImg
	 *            待处理的图片
	 * @param dstSrc
	 *            调整后图片地址
	 */
	public void ImgProcess(String mod1, String mod2, String mod, String srcImg,
			String dstSrc) {
		// 读取图片
		Mat img_mod1 = Imgcodecs.imread(mod1);
		Mat img_mod2 = Imgcodecs.imread(mod2);
		Mat img_mod = Imgcodecs.imread(mod);
		Mat img_src = Imgcodecs.imread(srcImg);
		// 调用ImgAmend方法 实现对图片进行匹配、旋转、缩放的操作
		ImgAmend IA = new ImgAmend();
		Mat dst = IA.tools(img_mod1, img_mod2, img_mod, img_src);
		Imgcodecs.imwrite(dstSrc, dst);
	}

	/**
	 * @param mod1
	 *            模板1
	 * @param mod2
	 *            模板2
	 * @param mod
	 *            标准模板（整图）
	 * @param srcImg
	 *            待处理的图片
	 * @param dstSrc
	 *            调整后图片地址
	 */
	public void ImgProcess(String mod1, String mod2, String mod, Mat srcImg,
			String dstSrc) {
		Mat img_mod1 = Imgcodecs.imread(mod1);
		Mat img_mod2 = Imgcodecs.imread(mod2);
		Mat img_mod = Imgcodecs.imread(mod);
		// 调用ImgAmend方法 实现对图片进行匹配、旋转、缩放的操作
		ImgAmend IA = new ImgAmend();
		Mat dst = IA.tools(img_mod1, img_mod2, img_mod, srcImg);
		Imgcodecs.imwrite(dstSrc, dst);

	}

	/**
	 * @param mod1
	 *            模板1
	 * @param mod2
	 *            模板2
	 * @param mod
	 *            标准模板（整图）
	 * @param srcImg
	 *            待处理的图片
	 * @param dstSrc
	 *            调整后图片地址
	 */
	public void ImgProcess(Mat mod1, Mat mod2, Mat mod, String srcImg,
			String dstSrc) {
		Mat img_src = Imgcodecs.imread(srcImg);
		// 调用ImgAmend方法 实现对图片进行匹配、旋转、缩放的操作
		ImgAmend IA = new ImgAmend();
		Mat dst = IA.tools(mod1, mod2, mod, img_src);
		Imgcodecs.imwrite(dstSrc, dst);

	}

	/**
	 * @param mod1
	 *            模板1
	 * @param mod2
	 *            模板2
	 * @param mod
	 *            标准模板（整图）
	 * @param srcImg
	 *            待处理的图片
	 * @param dstSrc
	 *            调整后图片地址
	 */
	public void ImgProcess(Mat mod1, Mat mod2, Mat mod, Mat srcImg,
			String dstSrc) {
		// 调用ImgAmend方法 实现对图片进行匹配、旋转、缩放的操作
		ImgAmend IA = new ImgAmend();
		Mat dst = IA.tools(mod1, mod2, mod, srcImg);
		Imgcodecs.imwrite(dstSrc, dst);

	}

	/**
	 * 
	 * @param mod1
	 *            模板1
	 * @param mod2
	 *            模板2
	 * @param mod
	 *            标准模板（整图）
	 * @param srcImg
	 *            待处理的图片
	 * @return 调整后图片
	 */
	public Mat ImgProcess2(String mod1, String mod2, String mod, String srcImg) {
		Mat img_mod1 = Imgcodecs.imread(mod1);
		Mat img_mod2 = Imgcodecs.imread(mod2);
		Mat img_mod = Imgcodecs.imread(mod);
		Mat img_src = Imgcodecs.imread(srcImg);
		// 调用ImgAmend方法 实现对图片进行匹配、旋转、缩放的操作
		ImgAmend IA = new ImgAmend();
		Mat img_dst = IA.tools(img_mod1, img_mod2, img_mod, img_src);
		return img_dst;
	}

	/**
	 * @param mod1
	 *            模板1
	 * @param mod2
	 *            模板2
	 * @param mod
	 *            标准模板（整图）
	 * @param srcImg
	 *            待处理的图片
	 * @return 调整后图片
	 */
	public Mat ImgProcess2(String mod1, String mod2, String mod, Mat srcImg) {
		Mat img_mod1 = Imgcodecs.imread(mod1);
		Mat img_mod2 = Imgcodecs.imread(mod2);
		Mat img_mod = Imgcodecs.imread(mod);
		// 调用ImgAmend方法 实现对图片进行匹配、旋转、缩放的操作
		ImgAmend IA = new ImgAmend();
		Mat img_dst = IA.tools(img_mod1, img_mod2, img_mod, srcImg);
		return img_dst;
	}

	/**
	 * @param mod1
	 *            模板1
	 * @param mod2
	 *            模板2
	 * @param mod
	 *            标准模板（整图）
	 * @param srcImg
	 *            待处理的图片
	 * @return 调整后图片
	 */
	public Mat ImgProcess2(Mat mod1, Mat mod2, Mat mod, String srcImg) {
		Mat img_src = Imgcodecs.imread(srcImg);
		// 调用ImgAmend方法 实现对图片进行匹配、旋转、缩放的操作
		ImgAmend IA = new ImgAmend();
		Mat img_dst = IA.tools(mod1, mod2, mod, img_src);
		return img_dst;
	}

	/**
	 * @param mod1
	 *            模板1
	 * @param mod2
	 *            模板2
	 * @param mod
	 *            标准模板（整图）
	 * @param srcImg
	 *            待处理的图片
	 * @return 调整后图片
	 */
	public Mat ImgProcess2(Mat mod1, Mat mod2, Mat mod, Mat srcImg) {
		// 调用ImgAmend方法 实现对图片进行匹配、旋转、缩放的操作
		ImgAmend IA = new ImgAmend();
		Mat img_dst = IA.tools(mod1, mod2, mod, srcImg);
		return img_dst;
	}

	public static double fx = 0;

	/**
	 * 对图片进行匹配 旋转 缩放的操作工具
	 * 
	 * @param mod1
	 *            模板1
	 * @param mod2
	 *            模板2
	 * @param mod
	 *            标准模板（整图）
	 * @param srcImg
	 *            待处理的图片
	 * @return 调整后图片
	 */
	public Mat tools(Mat mod1, Mat mod2, Mat mod, Mat srcImg) {

		// 创建输出图像，输出图像的宽度 = 被查找的图像的宽度 - 模版图像的宽度 + 1，
		// 高度同样符合
		Mat mod_dst1 = new Mat();
		mod_dst1.create(mod.rows() - mod1.rows() + 1, mod.cols() - mod1.cols()
				+ 1, CvType.CV_32FC1);
		// 进行模版匹配 平方差匹配法(CV_TM_SQDIFF)
		Imgproc.matchTemplate(mod, mod1, mod_dst1, Imgproc.TM_SQDIFF);
		// 对结果进行归一化: NORM_MINMAX 减少误差
		Core.normalize(mod_dst1, mod_dst1, 0, 1, Core.NORM_MINMAX);
		// 找矩阵的最小位置的函数是 minMaxLoc函数 定位最匹配的位置
		MinMaxLocResult mmlrMod1;
		mmlrMod1 = Core.minMaxLoc(mod_dst1, new Mat());
		Point minPoint1;
		minPoint1 = mmlrMod1.minLoc;

		// 创建输出图像，输出图像的宽度 = 被查找的图像的宽度 - 模版图像的宽度 + 1，
		// 高度同样符合
		Mat mod_dst2 = new Mat();
		mod_dst2.create(mod.rows() - mod2.rows() + 1, mod.cols() - mod2.cols()
				+ 1, CvType.CV_32FC1);
		// 进行模版匹配 平方差匹配法(CV_TM_SQDIFF)
		Imgproc.matchTemplate(mod, mod2, mod_dst2, Imgproc.TM_SQDIFF);
		// 对结果进行归一化: NORM_MINMAX 减少误差
		Core.normalize(mod_dst2, mod_dst2, 0, 1, Core.NORM_MINMAX);
		// 找矩阵的最小位置的函数是 minMaxLoc函数 定位最匹配的位置
		MinMaxLocResult mmlrMod2;
		mmlrMod2 = Core.minMaxLoc(mod_dst2, new Mat());
		Point minPoint2;
		minPoint2 = mmlrMod2.minLoc;

		double length = (minPoint2.y - minPoint1.y)
				* (minPoint2.y - minPoint1.y) + (minPoint2.x - minPoint1.x)
				* (minPoint2.x - minPoint1.x);
		double lengthMod = Math.sqrt(length);

		// 计算弧度表示的角
		double angle_mod = Math.atan2(minPoint2.y - minPoint1.y, minPoint2.x
				- minPoint1.x);
		// 用角度表示的角
		angle_mod = Math.toDegrees(angle_mod);

		// 创建输出图像，输出图像的宽度 = 被查找的图像的宽度 - 模版图像的宽度 + 1，
		// 高度同样符合
		Mat src_dst1 = new Mat();
		src_dst1.create(srcImg.rows() - mod1.rows() + 1, srcImg.cols()
				- mod1.cols() + 1, CvType.CV_32FC1);
		// 进行模版匹配 平方差匹配法(CV_TM_SQDIFF)
		Imgproc.matchTemplate(srcImg, mod1, src_dst1, Imgproc.TM_SQDIFF);
		// 对结果进行归一化: NORM_MINMAX 减少误差
		Core.normalize(src_dst1, src_dst1, 0, 1, Core.NORM_MINMAX);
		// 找矩阵的最小位置的函数是 minMaxLoc函数 定位最匹配的位置
		MinMaxLocResult mmlrsrc1;
		mmlrsrc1 = Core.minMaxLoc(src_dst1, new Mat());
		Point minPoint_src1;
		minPoint_src1 = mmlrsrc1.minLoc;

		// 创建输出图像，输出图像的宽度 = 被查找的图像的宽度 - 模版图像的宽度 + 1，
		// 高度同样符合
		Mat src_dst2 = new Mat();
		src_dst2.create(srcImg.rows() - mod2.rows() + 1, srcImg.cols()
				- mod2.cols() + 1, CvType.CV_32FC1);
		// 进行模版匹配 平方差匹配法(CV_TM_SQDIFF)
		Imgproc.matchTemplate(srcImg, mod2, src_dst2, Imgproc.TM_SQDIFF);
		// 对结果进行归一化: NORM_MINMAX 减少误差
		Core.normalize(src_dst2, src_dst2, 0, 1, Core.NORM_MINMAX);
		// 找矩阵的最小位置的函数是 minMaxLoc函数 定位最匹配的位置
		MinMaxLocResult mmlrsrc2;
		mmlrsrc2 = Core.minMaxLoc(src_dst2, new Mat());
		Point minPoint_src2;
		minPoint_src2 = mmlrsrc2.minLoc;

		double length1 = (minPoint_src2.y - minPoint_src1.y)
				* (minPoint_src2.x - minPoint_src1.x)
				+ (minPoint2.x - minPoint1.x) * (minPoint2.x - minPoint1.x);
		double lengthSrc = Math.sqrt(length1);

		// 旋转中心 坐标原点为图像左上端点
		Point center = new Point(srcImg.cols() / 2, srcImg.rows() / 2);
		// 计算弧度表示的角
		double angle = Math.atan2(minPoint_src2.y - minPoint_src1.y,
				minPoint_src2.x - minPoint_src1.x);
		// 用角度表示的角
		angle = Math.toDegrees(angle);
		// // 计算旋转角度 单位为度°，顺时针为负，逆时针为正
		angle = angle - angle_mod;
		// 缩放尺度 返回旋转/放缩矩阵
		double scale = 1;
		// 计算旋转加缩放的仿射矩阵
		Mat M = Imgproc.getRotationMatrix2D(center, angle, scale);
		Mat dst1 = new Mat();
		// 对图像做仿射变换 得到旋转后摆正的图片
		Imgproc.warpAffine(srcImg, dst1, M, new Size(srcImg.width(), srcImg
				.height()), 1, 0, new Scalar(255, 255, 255));

		Mat dst = new Mat();
		// double per = lengthMod/lengthSrc;
		double per = lengthSrc / lengthMod;
		double fy;
		if (per > 0) {
			fx = per;
		} else {
			System.out.println("百分比不正确！！！");
		}
		fy = fx;
		int width = mod.width();
		int height = mod.height();
		// 对模板图片进行缩放
		Imgproc.resize(mod, dst, new Size(width * fx, height * fy), fx, fy, 3);
		return dst1;
	}
}
