package tessdata;

import java.awt.image.BufferedImage;
import java.io.File;

import net.sourceforge.tess4j.ITesseract;
import net.sourceforge.tess4j.Tesseract;
import net.sourceforge.tess4j.TesseractException;

import org.opencv.core.Mat;

public class  ToWord {
	
	public  ITesseract instance;
	
	public  void init(){
		instance = new Tesseract();
		//URL url = ClassLoader.getSystemResource("tessdata");
		//String path = url.getPath().substring(1);
		//System.out.println("project:"+project+"\\tessdata");
		instance.setDatapath("G:\\workspace\\imgopencv\\src\\tessdata");
		instance.setLanguage("chi_sim");
//		instance.setLanguage("chi_sim+normal");
		
	}
	/**
	 * 识别图片中的字
	 * @param path  待识别图片路径
	 * @param project  
	 * @return  识别出的字符串
	 */
	public String imgtoword(String path,String project) {
		String result = "";
		
		//System.out.println("path:"+path);
		File imageFile = new File(path);
		try {
			result = instance.doOCR(imageFile);
			//System.out.println(result);
		} catch (TesseractException e) {
			System.err.println(e.getMessage());
		}
		return result;
	}
	/**
	 * 识别图片中的字
	 * @param mat  待识别的图片
	 * @return 识别出的字符串
	 */
	public String imgtoword(Mat mat){
		BufferedImage bi = new MatToBufImg(mat,".jpg").getImage();
		String result = "";
		try{
			result = instance.doOCR(bi);
			result = result.trim();
		}catch (TesseractException e){
			e.printStackTrace();
		}
		return result;
	}
	
}
