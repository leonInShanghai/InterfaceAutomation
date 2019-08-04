package info.itest;

import static org.junit.Assert.assertEquals;

import java.io.IOException;

import org.junit.Test;

import com.alibaba.fastjson.JSON;

import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

/**
 * Copyright (c) 2019年6月5日 Leon All rights reserved. 
 *
 * Description: 程序的入口
 * 
 * 测试技术社区：http://www.testpub.cn/
 * 测试教程网：www.testclass.net 
 * 
 * ↓ant中com.sun.tools.javac.Main is not on the classpath问题的解决方案 
 * https://blog.csdn.net/ws7896/article/details/44158297
 * 
 * junit生成测试报告 文章
 * https://www.cnblogs.com/Jourly/p/6900124.html
 */
public class V2exAPITest {

	@Test
	public void nodeApi() throws IOException {
		
		//创建 okhttp对象 
		OkHttpClient client = new OkHttpClient();
		
		//创建并遍历数组  数组中的元素用作请求的拼接参数
		for (String nodeName : new String[] {"php","python","qna"}) {
			
			//发送get请求 
			Request request = new Request.Builder()
					.url("https://www.v2ex.com/api/nodes/show.json?name="+nodeName)
					.get()
					.build();
			
			//执行网络请求并返回结果
			Response response = client.newCall(request).execute();
			
			V2exNode v2exNode = JSON.parseObject(response.body().string(),V2exNode.class);
			
			System.out.println(v2exNode.getName()+" : "+nodeName);
			
			//断言 请求回来的 name对象 和拼接的参数 nodeName一样
			assertEquals(v2exNode.getName(),nodeName);
		}

	}

}
