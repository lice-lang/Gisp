package org.glavo.gisp.helper;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Glavo on 17-8-13.
 *
 * @author Glavo
 * @since 0.1.0
 */
public class StringUtilsTest {
	@Test
	public void testEscape() {
		assertEquals(
				StringUtils.escape(
						"abc"
				),
				"abc"
		);

		assertEquals(
				StringUtils.escape(
						"abc\\n123"
				),
				"abc\n123"
		);

		assertEquals(
				StringUtils.escape(
						"abc\\t\\n\\u0061"
				),
				"abc\t\n\u0061"
		);
	}
}
