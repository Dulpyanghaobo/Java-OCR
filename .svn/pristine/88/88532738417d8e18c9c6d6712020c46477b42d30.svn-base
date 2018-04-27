package test;

import org.opencv.core.Core;
import org.opencv.core.CvType;
import org.opencv.core.Mat;

/**
 * 测试环境是否搭好，结果为单位矩阵即搭好。
 * 
 * @author Administrator
 * 
 */
public class Main {
	// 装载库文件
	static {
		System.loadLibrary(Core.NATIVE_LIBRARY_NAME);
	}

	public static void main(String[] args) {
		// 3*3 单位矩阵
		Mat mat = Mat.eye(3, 3, CvType.CV_8UC1);
		System.out.println(mat.dump());
	}

}
