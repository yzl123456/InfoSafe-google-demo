package testGoogleValidate;

import java.util.Date;

public class TestGoogleValidate {
	public static void main(String[] args) {
		//������demo����ֱ�Ӱѷ���˵�����д����Ϊ����֤��������ɵĶ�̬�����Ƿ���app��һ�£��������޸ģ�Ψһ�����Ӷ�ӦΨһ����Կ
		String seed="1234987612349876";//Ҫ����16λ������
		//����������˵�seed������ͨ��base 32���ɵ���Կ�����Ƕ�ά��url�������Կ
		String pngs_key=googleValidate.createCredentials(seed);
		//result�Ƿ���˸��ݱ�������ӽ���һ���㷨����õ��Ķ�̬���룬Ҳ���Ƿ���˵Ķ�̬����
		int result=googleValidate.calculateCode(seed.getBytes(), new Date().getTime()/30000);
		//��APP���������ɵ���Կ����ɨ�뻷�ڣ���֤app�˵Ķ�̬�����Ƿ����������ķ������˵Ķ�̬����һ��
		System.out.printf("%06d",result);
	}
}
