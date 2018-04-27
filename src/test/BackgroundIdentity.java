package test;

import opencv.ModelIntercept;

import org.opencv.core.Core;
import org.opencv.core.Mat;
import org.opencv.imgcodecs.Imgcodecs;

import tessdata.ToWord;

public class BackgroundIdentity {
	//60
	//装载库文件
			static {
				System.loadLibrary(Core.NATIVE_LIBRARY_NAME);
			}
	public static void main(String[] args) {
		Mat img_src = new Mat();
		img_src = Imgcodecs.imread("G:/workspace/imgopencv/background_identity/src33.jpg");
		ModelIntercept mi = new ModelIntercept();
		mi.modelInit("src//background_identity.xml", 
				"G:/workspace/imgopencv/background_identity/mod.jpg",
				"G:/workspace/imgopencv/background_identity/mod1.jpg",
				"G:/workspace/imgopencv/background_identity/mod2.jpg");
		mi.interceptImg(img_src, "G:/workspace/imgopencv/background_identity/",60);
		ToWord tw = new ToWord();
		tw.init();
		System.out.println("检法机关："+tw.imgtoword("G:/workspace/imgopencv/background_identity/img_1.jpg", ""));
		System.out.println("有效日期："+tw.imgtoword("G:/workspace/imgopencv/background_identity/img_2.jpg", ""));

	}

}
