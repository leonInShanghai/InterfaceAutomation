package info.itest;

import static org.junit.Assert.assertEquals;

import java.io.IOException;

import org.junit.Test;

import com.alibaba.fastjson.JSON;

import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

/**
 * Copyright (c) 2019��6��5�� Leon All rights reserved. 
 *
 * Description: ��������
 * 
 * ���Լ���������http://www.testpub.cn/
 * ���Խ̳�����www.testclass.net 
 * 
 * ��ant��com.sun.tools.javac.Main is not on the classpath����Ľ������ 
 * https://blog.csdn.net/ws7896/article/details/44158297
 * 
 * junit���ɲ��Ա��� ����
 * https://www.cnblogs.com/Jourly/p/6900124.html
 */
public class V2exAPITest {

	@Test
	public void nodeApi() throws IOException {
		
		//���� okhttp���� 
		OkHttpClient client = new OkHttpClient();
		
		//��������������  �����е�Ԫ�����������ƴ�Ӳ���
		for (String nodeName : new String[] {"php","python","qna"}) {
			
			//����get���� 
			Request request = new Request.Builder()
					.url("https://www.v2ex.com/api/nodes/show.json?name="+nodeName)
					.get()
					.build();
			
			//ִ���������󲢷��ؽ��
			Response response = client.newCall(request).execute();
			
			V2exNode v2exNode = JSON.parseObject(response.body().string(),V2exNode.class);
			
			System.out.println(v2exNode.getName()+" : "+nodeName);
			
			//���� ��������� name���� ��ƴ�ӵĲ��� nodeNameһ��
			assertEquals(v2exNode.getName(),nodeName);
		}

	}

}
