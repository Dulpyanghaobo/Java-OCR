package opencv;

import java.util.ArrayList;
import java.util.List;

import org.opencv.core.Core;
import org.opencv.core.Mat;
import org.opencv.core.Point;
import org.opencv.core.Scalar;
import org.opencv.imgcodecs.Imgcodecs;
import org.opencv.imgproc.Imgproc;

/**
 * 对图片的加密 解密
 * 
 * @author Administrator
 */
public class Img {
	// 装载库文件
	static {
		System.loadLibrary(Core.NATIVE_LIBRARY_NAME);
	}

	// 图片加密（要加密的图片，加密图片上写的内容，加密后的图片存储位置）
	public void encrypt(Mat sourceImg, String message, String address) {
		// 初始化参数
		DFTUtil img = DFTUtil.getInstance();
		// 创建image_des 表示已加密的图
		Mat image_des = new Mat();
		// 获取原图
		Mat image_tmp = new Mat();
		Imgproc.cvtColor(sourceImg, image_tmp, Imgproc.COLOR_BGR2RGB);

		// 创建通道
		List<Mat> Channels = new ArrayList<Mat>();
		List<Mat> Channelse = new ArrayList<Mat>();
		// 分离通道
		Core.split(image_tmp, Channels);
		// 单个通道图
		Mat image_b = new Mat();
		Mat image_g = new Mat();
		Mat image_r = new Mat();

		Mat image_be = new Mat();
		Mat image_ge = new Mat();
		Mat image_re = new Mat();

		// 获取通道
		image_b = Channels.get(0);
		image_g = Channels.get(1);
		image_r = Channels.get(2);

		// 对单通道进行加密
		image_be = encryptImg(image_b, message);
		image_re = encryptImg(image_r, message);
		image_ge = encryptImg(image_g, message);

		Channelse.add(image_re);
		Channelse.add(image_ge);
		Channelse.add(image_be);
		// 合并通道
		Core.merge(Channelse, image_des);
		Imgcodecs.imwrite(address, image_des);
	}

	// 图片加密（加要密的图片存储位置，加密后的图片存储位置，加密图片上写的内容）
	public void encrypt(String sourceImg, String address, String message) {
		// 初始化参数
		DFTUtil img = DFTUtil.getInstance();
		// image_des 已加密的图
		Mat image_des = new Mat();
		// 获取原图
		Mat image_tmp = new Mat();
		// 获取要加密的图片
		String src = sourceImg;
		// 读取原图
		Mat image_src = Imgcodecs.imread(src);
		Imgproc.cvtColor(image_src, image_tmp, Imgproc.COLOR_BGR2RGB);
		// 创建通道
		List<Mat> Channels = new ArrayList<Mat>();
		List<Mat> Channelse = new ArrayList<Mat>();
		// 分离通道
		Core.split(image_tmp, Channels);
		// 单个通道图
		Mat image_b = new Mat();
		Mat image_g = new Mat();
		Mat image_r = new Mat();

		Mat image_be = new Mat();
		Mat image_ge = new Mat();
		Mat image_re = new Mat();

		// 获取通道
		image_b = Channels.get(0);
		image_g = Channels.get(1);
		image_r = Channels.get(2);
		// 对单通道进行加密
		image_be = encryptImg(image_b, message);
		image_re = encryptImg(image_r, message);
		image_ge = encryptImg(image_g, message);

		Channelse.add(image_re);
		Channelse.add(image_ge);
		Channelse.add(image_be);
		// 合并通道
		Core.merge(Channelse, image_des);
		Imgcodecs.imwrite(address, image_des);
	}

	// 图片加密（要加密的图片，加密图片上写的内容）
	public Mat encrypt(Mat sourceImg, String message) {
		// 初始化参数
		DFTUtil img = DFTUtil.getInstance();
		// image_des 已加密的图
		Mat image_des = new Mat();
		// 获取原图
		Mat image_tmp = new Mat();
		Imgproc.cvtColor(sourceImg, image_tmp, Imgproc.COLOR_BGR2RGB);
		// 创建通道
		List<Mat> Channels = new ArrayList<Mat>();
		List<Mat> Channelse = new ArrayList<Mat>();
		// 分离通道
		Core.split(image_tmp, Channels);
		// 单个通道图
		Mat image_b = new Mat();
		Mat image_g = new Mat();
		Mat image_r = new Mat();

		Mat image_be = new Mat();
		Mat image_ge = new Mat();
		Mat image_re = new Mat();

		// 获取通道
		image_b = Channels.get(0);
		image_g = Channels.get(1);
		image_r = Channels.get(2);
		// 对单通道进行加密
		image_be = encryptImg(image_b, message);
		image_re = encryptImg(image_r, message);
		image_ge = encryptImg(image_g, message);

		Channelse.add(image_re);
		Channelse.add(image_ge);
		Channelse.add(image_be);
		// 合并通道
		Core.merge(Channelse, image_des);
		return image_des;
	}

	// 图片加密（要加密的图片，加密图片上写的内容）
	public Mat encrypt(String sourceImg, String message) {
		// 初始化参数
		DFTUtil img = DFTUtil.getInstance();
		// image_des 已加密的图
		Mat image_des = new Mat();
		// 获取原图
		Mat image_tmp = new Mat();
		// 获取要加密的图片
		String src = sourceImg;
		// 获取原图
		Mat image_src = Imgcodecs.imread(src);
		Imgproc.cvtColor(image_src, image_tmp, Imgproc.COLOR_BGR2RGB);
		// 创建通道
		List<Mat> Channels = new ArrayList<Mat>();
		List<Mat> Channelse = new ArrayList<Mat>();
		// 分离通道
		Core.split(image_tmp, Channels);
		// 单个通道图
		Mat image_b = new Mat();
		Mat image_g = new Mat();
		Mat image_r = new Mat();

		Mat image_be = new Mat();
		Mat image_ge = new Mat();
		Mat image_re = new Mat();

		// 获取通道
		image_b = Channels.get(0);
		image_g = Channels.get(1);
		image_r = Channels.get(2);
		// 对单通道进行加密
		image_be = encryptImg(image_b, message);
		image_re = encryptImg(image_r, message);
		image_ge = encryptImg(image_g, message);

		Channelse.add(image_re);
		Channelse.add(image_ge);
		Channelse.add(image_be);
		// 合并通道
		Core.merge(Channelse, image_des);
		return image_des;
	}

	// 图片解密（要解密的图片，解密后图片的存储位置）
	public void decode(Mat encryptImg, String decodeImg) {
		// 初始化参数
		DFTUtil img = DFTUtil.getInstance();
		Mat image_tmp = new Mat();
		Imgproc.cvtColor(encryptImg, image_tmp, Imgproc.COLOR_RGB2GRAY);
		decodeImg(image_tmp, decodeImg);
	}

	// 图片解密（要解密的图片存储位置，解密后图片的存储位置）
	public void decode(String encryptImg, String decodeImg) {
		// 初始化参数
		DFTUtil img = DFTUtil.getInstance();
		Mat image_src = new Mat();
		// 获取加密图片
		String src = encryptImg;
		// 获取原图
		image_src = Imgcodecs.imread(src);
		Mat image_tmp = new Mat();
		Imgproc.cvtColor(image_src, image_tmp, Imgproc.COLOR_RGB2GRAY);
		decodeImg(image_tmp, decodeImg);
	}

	// 解密工具
	public void decodeImg(Mat encryptImg, String decodeImg) {
		// 初始化参数
		DFTUtil img = DFTUtil.getInstance();
		// image_new 新图
		Mat image_new = new Mat();
		// 获取解密文件
		String decode = decodeImg;
		// 傅里叶变换
		image_new = img.transformImage(encryptImg);
		Imgcodecs.imwrite(decode, image_new);
	}

	// 加密工具
	public Mat encryptImg(Mat sourceImg, String message) {
		// 初始化参数
		DFTUtil img = DFTUtil.getInstance();
		Mat image_new = new Mat();
		// 第一次傅里叶转换
		image_new = img.transformImage(sourceImg);
		// 傅里叶的逆转换
		image_new = img.antitransformImage();
		// 在转换的图片上写文字
		img.transformImageWithText(image_new, message, new Point(10, 150), 2.0,
				new Scalar(0, 225, 225));
		// 获取加密的图片 傅里叶逆变换
		Mat resultImg = img.antitransformImage();
		//返回加密的图片
		return resultImg;
	}

}
