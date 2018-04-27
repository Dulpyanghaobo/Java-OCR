package opencv;

import java.io.FileInputStream;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import org.dom4j.Document;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;
import org.opencv.core.Core;
import org.opencv.core.CvType;
import org.opencv.core.Mat;
import org.opencv.core.Rect;
import org.opencv.imgcodecs.Imgcodecs;
import org.opencv.imgproc.Imgproc;

public class ModelIntercept {
	// 装载库文件
	static {
		System.loadLibrary(Core.NATIVE_LIBRARY_NAME);
	}

	/**
	 * 初始化参数
	 * 
	 * @param xmlPath
	 *            xml模板的路径
	 * @param mod
	 *            标准模板
	 * @param mod1
	 *            模板1（小）
	 * @param mod2
	 *            模板2（小）
	 */
	private Mat img_mod1;
	private Mat img_mod2;
	private Mat img_mod;
	private String xml_Path;

	public void modelInit(String xmlPath, String mod, String mod1, String mod2) {
		img_mod = Imgcodecs.imread(mod);
		img_mod1 = Imgcodecs.imread(mod1);
		img_mod2 = Imgcodecs.imread(mod2);
		xml_Path = xmlPath;
	}

	/**
	 * 对图片进行截取
	 * 
	 * @param img
	 *            原图片 待处理图片
	 * @param outPath
	 *            截取图片存储的路径
	 */
	public void interceptImg(Mat img, String outPath,double thresh) {
		ModelIntercept mi = new ModelIntercept();
		// 1.摆正图片
		ImgAmend ia = new ImgAmend();
		// 调用方法ImgProcess2 对图片进行匹配、旋转、缩放操作
		Mat srcImg = ia.ImgProcess2(img_mod1, img_mod2, img_mod, img);
		try {
			// 使用SAXReader读取xml文档并生成Document对象
			SAXReader reader = new SAXReader();
			// "src\\model.xml"
			Document doc = reader.read(new FileInputStream(xml_Path));
			// 获取根元素
			Element root = doc.getRootElement();
			// 将model.xml文档中的信息解析出来并以一个Element保存，
			// 并把它们存入集合
			List<Element> eles = root.elements();
			for (Element eleCorr : eles) {

				// 解析横坐标x1
				int x1 = Integer.parseInt(eleCorr.elementText("x1"));
				// 解析纵坐标y1
				int y1 = Integer.parseInt(eleCorr.elementText("y1"));
				// 解析宽
				int width = Integer.parseInt(eleCorr.elementText("width"));
				// 解析高
				int height = Integer.parseInt(eleCorr.elementText("height"));

				// 将坐标和截取图片的宽高扩大缩小后四舍五入到整数位
				double per = ImgAmend.fx;
				BigDecimal x = new BigDecimal(x1 * per);
				x1 = x.setScale(0, BigDecimal.ROUND_HALF_UP).intValue();
				BigDecimal y = new BigDecimal(y1 * per);
				y1 = y.setScale(0, BigDecimal.ROUND_HALF_UP).intValue();
				BigDecimal wid = new BigDecimal(width * per);
				width = wid.setScale(0, BigDecimal.ROUND_HALF_UP).intValue();
				BigDecimal hei = new BigDecimal(height * per);
				height = hei.setScale(0, BigDecimal.ROUND_HALF_UP).intValue();

				// 解析输出图片名称
				Element pathEle = eleCorr.element("outname");
				String outname = pathEle.getText();
				// 调用对图片进行截取前的处理的方法
				Mat img_pro = mi.imgPreprocess(srcImg,thresh);
				// 调用intercept方法 对图片进行截取
				Mat out_img = mi.intercept(img_pro, x1, y1, width, height);
				// 将截取的图片存到指定路径
				Imgcodecs.imwrite(outPath + outname, out_img);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * 对图片进行截取
	 * 
	 * @param src
	 *            原图片地址 待处理图片地址
	 * @param outPath
	 *            截取图片存储的路径
	 */
	public void interceptImg(String src, String outPath,double thresh) {
		Mat img = Imgcodecs.imread(src);
		ModelIntercept mi = new ModelIntercept();
		// 1.摆正图片
		ImgAmend ia = new ImgAmend();
		// 调用方法ImgProcess2 对图片进行匹配、旋转、缩放操作
		Mat srcImg = ia.ImgProcess2(img_mod1, img_mod2, img_mod, img);
		try {
			// 使用SAXReader读取xml文档并生成Document对象
			SAXReader reader = new SAXReader();
			// "src\\model.xml"
			Document doc = reader.read(new FileInputStream(xml_Path));
			// 获取根元素
			Element root = doc.getRootElement();
			// 将model.xml文档中的信息解析出来并以一个Element保存，
			// 并把它们存入集合
			List<Element> eles = root.elements();
			for (Element eleCorr : eles) {

				// 解析横坐标x1
				int x1 = Integer.parseInt(eleCorr.elementText("x1"));
				// 解析纵坐标y1
				int y1 = Integer.parseInt(eleCorr.elementText("y1"));
				// 解析宽
				int width = Integer.parseInt(eleCorr.elementText("width"));
				// 解析高
				int height = Integer.parseInt(eleCorr.elementText("height"));

				// 将坐标和截取图片的宽高扩大缩小后四舍五入到整数位
				double per = ImgAmend.fx;
				BigDecimal x = new BigDecimal(x1 * per);
				x1 = x.setScale(0, BigDecimal.ROUND_HALF_UP).intValue();
				BigDecimal y = new BigDecimal(y1 * per);
				y1 = y.setScale(0, BigDecimal.ROUND_HALF_UP).intValue();
				BigDecimal wid = new BigDecimal(width * per);
				width = wid.setScale(0, BigDecimal.ROUND_HALF_UP).intValue();
				BigDecimal hei = new BigDecimal(height * per);
				height = hei.setScale(0, BigDecimal.ROUND_HALF_UP).intValue();

				// 解析输出图片名称
				Element pathEle = eleCorr.element("outname");
				String outname = pathEle.getText();
				// 调用对图片进行截取前的处理的方法
				Mat img_pro = mi.imgPreprocess(srcImg,thresh);
				// 调用intercept方法 对图片进行截取
				Mat out_img = mi.intercept(img_pro, x1, y1, width, height);
				// 将截取的图片存到指定路径
				Imgcodecs.imwrite(outPath + outname, out_img);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
/**
 * 对图片进行截取
 * @param img 待处理的图片
 * @return 截取后的图片
 */
	public List<Mat> interceptMat(Mat img,double thresh){
		ModelIntercept mi = new ModelIntercept();
		// 1.摆正图片
		ImgAmend ia = new ImgAmend();
		// 调用方法ImgProcess2 对图片进行匹配、旋转、缩放操作
		Mat srcImg = ia.ImgProcess2(img_mod1, img_mod2, img_mod, img);
		//创建一个装生成mat的集合
		List<Mat> listMat = new ArrayList<Mat>();
		try {
			// 使用SAXReader读取xml文档并生成Document对象
			SAXReader reader = new SAXReader();
			// "src\\model.xml"
			Document doc = reader.read(new FileInputStream(xml_Path));
			// 获取根元素
			Element root = doc.getRootElement();
			// 将model.xml文档中的信息解析出来并以一个Element保存，
			// 并把它们存入集合
			List<Element> eles = root.elements();
			for (Element eleCorr : eles) {

				// 解析横坐标x1
				int x1 = Integer.parseInt(eleCorr.elementText("x1"));
				// 解析纵坐标y1
				int y1 = Integer.parseInt(eleCorr.elementText("y1"));
				// 解析宽
				int width = Integer.parseInt(eleCorr.elementText("width"));
				// 解析高
				int height = Integer.parseInt(eleCorr.elementText("height"));

				// 将坐标和截取图片的宽高扩大缩小后四舍五入到整数位
				double per = ImgAmend.fx;
				BigDecimal x = new BigDecimal(x1 * per);
				x1 = x.setScale(0, BigDecimal.ROUND_HALF_UP).intValue();
				BigDecimal y = new BigDecimal(y1 * per);
				y1 = y.setScale(0, BigDecimal.ROUND_HALF_UP).intValue();
				BigDecimal wid = new BigDecimal(width * per);
				width = wid.setScale(0, BigDecimal.ROUND_HALF_UP).intValue();
				BigDecimal hei = new BigDecimal(height * per);
				height = hei.setScale(0, BigDecimal.ROUND_HALF_UP).intValue();

				// 解析输出图片名称
				Element pathEle = eleCorr.element("outname");
				String outname = pathEle.getText();
				// 调用对图片进行截取前的处理的方法
				Mat img_pro = mi.imgPreprocess(srcImg,thresh);
				// 调用intercept方法 对图片进行截取
				Mat out_img = mi.intercept(img_pro, x1, y1, width, height);
				listMat.add(out_img);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return listMat;
	}
/**
 * 对图片进行截取
 * @param src  带处理的图片地址
 * @return 截取后的图片
 */
	public List<Mat> interceptMat(String src,double thresh){
		Mat img = Imgcodecs.imread(src);
		ModelIntercept mi = new ModelIntercept();
		// 1.摆正图片
		ImgAmend ia = new ImgAmend();
		// 调用方法ImgProcess2 对图片进行匹配、旋转、缩放操作
		Mat srcImg = ia.ImgProcess2(img_mod1, img_mod2, img_mod, img);
		//创建一个装生成mat的集合
		List<Mat> listMat = new ArrayList<Mat>();
		try {
			// 使用SAXReader读取xml文档并生成Document对象
			SAXReader reader = new SAXReader();
			// "src\\model.xml"
			Document doc = reader.read(new FileInputStream(xml_Path));
			// 获取根元素
			Element root = doc.getRootElement();
			// 将model.xml文档中的信息解析出来并以一个Element保存，
			// 并把它们存入集合
			List<Element> eles = root.elements();
			for (Element eleCorr : eles) {

				// 解析横坐标x1
				int x1 = Integer.parseInt(eleCorr.elementText("x1"));
				// 解析纵坐标y1
				int y1 = Integer.parseInt(eleCorr.elementText("y1"));
				// 解析宽
				int width = Integer.parseInt(eleCorr.elementText("width"));
				// 解析高
				int height = Integer.parseInt(eleCorr.elementText("height"));

				// 将坐标和截取图片的宽高扩大缩小后四舍五入到整数位
				double per = ImgAmend.fx;
				BigDecimal x = new BigDecimal(x1 * per);
				x1 = x.setScale(0, BigDecimal.ROUND_HALF_UP).intValue();
				BigDecimal y = new BigDecimal(y1 * per);
				y1 = y.setScale(0, BigDecimal.ROUND_HALF_UP).intValue();
				BigDecimal wid = new BigDecimal(width * per);
				width = wid.setScale(0, BigDecimal.ROUND_HALF_UP).intValue();
				BigDecimal hei = new BigDecimal(height * per);
				height = hei.setScale(0, BigDecimal.ROUND_HALF_UP).intValue();

				// 解析输出图片名称
				Element pathEle = eleCorr.element("outname");
				String outname = pathEle.getText();
				// 调用对图片进行截取前的处理的方法
				Mat img_pro = mi.imgPreprocess(srcImg,thresh);
				// 调用intercept方法 对图片进行截取
				Mat out_img = mi.intercept(img_pro, x1, y1, width, height);
				listMat.add(out_img);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return listMat;
	}

	/**
	 * 对初始化图片进行处理 转为灰图与二值化后的图片
	 * 
	 * @param img
	 *            待处理的图片
	 * @return 对图片转为灰图与二值化后的图片
	 */
	public Mat imgPreprocess(Mat img,double thresh) {
		Mat img_mid = new Mat();
		// 将图片转为灰图
		Imgproc.cvtColor(img, img_mid, Imgproc.COLOR_RGB2GRAY);
		Mat img_prepro = new Mat();
		// 对图片进行二值化处理 手动指定一个阈值，以此阈值来进行二值化处理
		// type /* value = value > threshold ? max_value : 0 */
		Imgproc.threshold(img_mid, img_prepro, thresh, 255, 0);
		return img_prepro;
	}

	/**
	 * 截取指定位置的图片 工具
	 * 
	 * @param img
	 *            待截取图片
	 * @param x1
	 *            左上角点的x坐标
	 * @param y1
	 *            左上角点的y坐标
	 * @param width
	 *            截取图片的宽度
	 * @param height
	 *            截取图片的高度
	 * @return 截取的图片
	 */
	public Mat intercept(Mat img, int x1, int y1, int width, int height) {
		// 复制原图片到指定大小的新图片（也是为了不破坏原图片）
		// 宽*高
		Mat img_copy = new Mat(img.width(), img.height(), CvType.depth(1));
		img.copyTo(img_copy);
		// 设置剪切图片的位置并输出图片 rect(左上角点的坐标和矩形的宽和高)
		Rect rect = new Rect(x1, y1, width, height);
		Mat img_mat = new Mat(img_copy, rect);
		return img_mat;
	}

	/**
	 * 讲图片保存到指定位置
	 * 
	 * @param img
	 *            待保存图片
	 * @param path
	 *            图片保存路径
	 */
	public void savaIntercept(Mat img, String path) {
		Imgcodecs.imwrite(path, img);
	}

}
