package testQRCode;
/**
 * ����2���඼���������ģ���ά��Ĺ����࣬ʹ�øö�ά��ģ��Ҫ�ȵ���jar������libĿ¼���У��Ҽ���jar�� build-path-->add to path
	 * ���ɶ�ά��(��ǶLOGO)
	 * 
	 * @param content
	 *            ���ݣ���url�ĵ�ַ��
	 * @param imgPath
	 *            LOGO��ַ
	 * @param destPath
	 *            ���Ŀ¼
	 * @param needCompress
	 *            �Ƿ�ѹ��LOGO
	 * @throws Exception
	 public static void encode(String content, String imgPath, String destPath,
			boolean needCompress) 
 *   ֻ��Ҫ�������溯������4�������ͺ���
 */

public class TestQRCode {
	public static void main(String[] args) throws Exception {
        String text = "http://www.baidu.com";
        //�ȸ���֤����url:  secretKeyΪ��Ӧ���ɵ���ԿҪ���뵽��ά����
        //String url="otpauth://totp/Google%3Ayourname@gmail.com?secret="+secretKey+"&issuer=Google";
        QRCodeUtil.encode(text, "h:/png/qq.png", "h:/png", true);
    }
}
