/**
 * Copyright © 2020 SCF. All rights reserved
 * @ Study 
 * @author WangY
 * 2020年5月21日
 */
package com.simple.threadPool;

/** 
* @ClassName: A 
* @Description: TODO
* @date: 2020年5月21日  
*/
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class NewSingleThreadExecutorTest {

	public static void main(String[] args) {
		// 创建一个单线程化的线程池
		ExecutorService singleThreadExecutor = Executors.newSingleThreadExecutor();
		for (int i = 0; i < 50; i++) {
			final int index = i;
			singleThreadExecutor.execute(new Runnable() {
				public void run() {
					try {
						// 结果依次输出，相当于顺序执行各个任务
						System.out.println(Thread.currentThread().getName() + "正在被执行,打印的值是:" + index);
						Thread.sleep(500);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
			});
		}
	}

}