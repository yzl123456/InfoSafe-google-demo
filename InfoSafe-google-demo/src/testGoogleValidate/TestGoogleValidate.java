package testGoogleValidate;

import java.util.Date;

public class TestGoogleValidate {
	public static void main(String[] args) {
		//由于是demo，我直接把服务端的种子写死，为了验证服务端生成的动态密码是否与app端一致，可自行修改，唯一的种子对应唯一的密钥
		String seed="1234987612349876";//要求是16位纯数字
		//传入服务器端的seed参数，通过base 32生成的密钥，就是二维码url里面的密钥
		String pngs_key=googleValidate.createCredentials(seed);
		//result是服务端根据保存的种子进行一种算法运算得到的动态密码，也就是服务端的动态密码
		int result=googleValidate.calculateCode(seed.getBytes(), new Date().getTime()/30000);
		//在APP端输入生成的密钥代替扫码环节，验证app端的动态密码是否与程序输出的服务器端的动态密码一致
		System.out.printf("%06d",result);
	}
}
