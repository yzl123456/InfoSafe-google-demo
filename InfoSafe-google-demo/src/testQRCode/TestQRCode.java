package testQRCode;
/**
 * 其他2个类都是网上拉的，二维码的工具类，使用该二维码模块要先导入jar包，在lib目录下有，右键该jar包 build-path-->add to path
	 * 生成二维码(内嵌LOGO)
	 * 
	 * @param content
	 *            内容（即url的地址）
	 * @param imgPath
	 *            LOGO地址
	 * @param destPath
	 *            存放目录
	 * @param needCompress
	 *            是否压缩LOGO
	 * @throws Exception
	 public static void encode(String content, String imgPath, String destPath,
			boolean needCompress) 
 *   只需要调用上面函数，给4个参数就好了
 */

public class TestQRCode {
	public static void main(String[] args) throws Exception {
        String text = "http://www.baidu.com";
        //谷歌验证器的url:  secretKey为对应生成的密钥要加入到二维码中
        //String url="otpauth://totp/Google%3Ayourname@gmail.com?secret="+secretKey+"&issuer=Google";
        QRCodeUtil.encode(text, "h:/png/qq.png", "h:/png", true);
    }
}
