package com.aegamesi.java_visualizer.ui;

import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Point;
import java.awt.Rectangle;

class Constants {
	static final Color colorBackground = new Color(0xFF, 0xFF, 0xFF);
	static final Color colorText = new Color(0x0, 0x0, 0x0);

	static final Color colorFrameBG = new Color(0xF7, 0xF7, 0xF7);
	static final Color colorFrameBGFirst = new Color(0xE2, 0xEB, 0xF6);
	static final Color colorFrameOutline = new Color(0xAA, 0xAA, 0xAA);

	static final Color colorHeapKey = new Color(0xFA, 0xEB, 0xBF);
	static final Color colorHeapVal = new Color(0xFF, 0xFF, 0xC6);
	static final Color colorHeapLabel = new Color(0x55, 0x55, 0x55);
	static final Color colorHeapBorder = new Color(0x88, 0x88, 0x88);

	static final Color colorPointer = new Color(0x00, 0x55, 0x83);
	static final Color colorPointerInactive = new Color(0xCC, 0xCC, 0xCC);
	static final Color colorPointerSelected = new Color(0xE9, 0x3F, 0x34);

	static final Font fontTitle = new Font(Font.SANS_SERIF, Font.BOLD, 14);
	static final Font fontUI = new Font(Font.SANS_SERIF, Font.PLAIN, 12);
	static final Font fontUIMono = new Font(Font.MONOSPACED, Font.PLAIN, 12);
	static final Font fontUISmall = new Font(Font.SANS_SERIF, Font.PLAIN, 10);

	static final int padOuter = 8;
	static final int padTitle = 16;
	static final int padCenter = 64;
	static final int padStackVertical = 8;
	static final int padHeapVertical = 8;
	static final int padHeapHorizontal = 16;
	static final int padHeapContinuation = 32;
	static final int padHeapMap = 4;

	static final int pointerSrcRadius = 3;
	static final int pointerWidth = 16;

	static final Dimension maxDimension = new Dimension(Integer.MAX_VALUE, Integer.MAX_VALUE);

	/**
	 * Returns the Bounds of the component, relative to this panel.
	 */
	static Rectangle getRelativeBounds(Component parent, Component c) {
		Rectangle r = c.getBounds();
		c = c.getParent();
		while (c != null && c != parent) {
			Point loc = c.getLocation();
			r.translate(loc.x, loc.y);
			c = c.getParent();
		}
		if (c == null) {
			return null;
		}
		return r;
	}
}
