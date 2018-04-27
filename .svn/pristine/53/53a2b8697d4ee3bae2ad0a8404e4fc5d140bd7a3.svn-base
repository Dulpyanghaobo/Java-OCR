package test;

import java.util.List;

import opencv.ModelIntercept;

import org.opencv.core.Core;
import org.opencv.core.Mat;
import org.opencv.imgcodecs.Imgcodecs;

import tessdata.ToWord;

public class TestModelIntercept {
	//装载库文件
	static {
		System.loadLibrary(Core.NATIVE_LIBRARY_NAME);
	}

	public static void main(String[] args) {
		Mat img_src = new Mat();
		img_src = Imgcodecs.imread("G:/workspace/imgopencv/testModel2/src.jpg");
		ModelIntercept mi = new ModelIntercept();
		mi.modelInit("src//model2.xml",
				"G:/workspace/imgopencv/testModel2/mod.jpg", 
				"G:/workspace/imgopencv/testModel2/mod1.jpg",
				"G:/workspace/imgopencv/testModel2/mod2.jpg");
		
		List<Mat> list = mi.interceptMat(img_src,200);
		long a=System.currentTimeMillis();
		ToWord tw = new ToWord();
		tw.init();
		System.out.println(tw.imgtoword(list.get(0)));
		System.out.println(tw.imgtoword(list.get(1)));
		System.out.println(tw.imgtoword(list.get(2)));
		System.out.println(tw.imgtoword(list.get(3)));
		long b=System.currentTimeMillis();
		System.out.println("识别时间："+(b-a)+"毫秒");
		
	
		
	}

}
