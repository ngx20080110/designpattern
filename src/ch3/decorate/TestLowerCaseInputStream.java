package ch3.decorate;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

import org.junit.Test;

public class TestLowerCaseInputStream {

	@Test
	public void test() {
		int c;
		try {
			InputStream in = new LowerCaseInputStream(new BufferedInputStream(new FileInputStream("d:/test.html")));
			while ((c = in.read()) > 0) {
				System.out.print((char)c);
			}
			in.close();
		}
		catch (IOException e) {
			e.printStackTrace();
		}
	}
}
