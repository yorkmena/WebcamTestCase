package org.test;

import org.testng.annotations.Test;

import com.github.sarxos.webcam.Webcam;

public class DemoWebcam {

	@Test
	public void test()
	{
		
		Webcam webcam = Webcam.getDefault();
		if (webcam != null) {
			System.out.println("Webcam: " + webcam.getName());
		} else {
			System.out.println("No webcam detected");
		}
	}
}
