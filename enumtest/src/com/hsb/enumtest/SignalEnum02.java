package com.hsb.enumtest;

/**
 * 用法二：switch JDK1.6之前的switch语句只支持int,char,enum类型，使用枚举，能让我们的代码可读性更强。
 * 
 * @author Administrator
 *
 */
enum Signal {

	GREEN, YELLOW, RED
}

public class SignalEnum02 {
	Signal color = Signal.RED;

	public void change() {
		switch (color) {
		case RED:
			color = Signal.GREEN;
			break;
		case YELLOW:
			color = Signal.RED;
			break;
		case GREEN:
			color = Signal.YELLOW;
			break;
		}
		System.out.println(color);
	}

}
