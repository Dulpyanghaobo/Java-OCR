package tessdata;

import java.awt.image.BufferedImage;
import java.io.ByteArrayInputStream;
import java.io.InputStream;

import javax.imageio.ImageIO;

import org.opencv.core.Core;
import org.opencv.core.Mat;
import org.opencv.core.MatOfByte;
import org.opencv.imgcodecs.Imgcodecs;

public class MatToBufImg {
	Mat matrix;
	MatOfByte mob;
	String fileExten;

	
	/**
	 * 讲mat类型的图片转为BufImg类型的图片
	 *  The file extension string should be ".jpg", ".png", etc
	 * @param amatrix  要转换的mat类型图片
	 * @param fileExtension  图片的扩展类型
	 */
	public MatToBufImg(Mat amatrix, String fileExtension) {
		matrix = amatrix;
		fileExten = fileExtension;
		mob = new MatOfByte();
	}

	/**
	 * 获取bufferedImage的图片
	 * 
	 * @return 返回bufferedImage的图片
	 */
	public BufferedImage getImage() {
		// convert the matrix into a matrix of bytes appropriate for
		// this file extension
		Imgcodecs.imencode(fileExten, matrix, mob);
		// convert the "matrix of bytes" into a byte array
		byte[] byteArray = mob.toArray();
		BufferedImage bufImage = null;
		try {
			InputStream in = new ByteArrayInputStream(byteArray);
			bufImage = ImageIO.read(in);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return bufImage;
	}
}
