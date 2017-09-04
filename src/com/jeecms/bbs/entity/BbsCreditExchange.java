package com.jeecms.bbs.entity;

import com.jeecms.bbs.entity.base.BaseBbsCreditExchange;



public class BbsCreditExchange extends BaseBbsCreditExchange {
	private static final long serialVersionUID = 1L;

/*[CONSTRUCTOR MARKER BEGIN]*/
	public BbsCreditExchange () {
		super();
	}

	/**
	 * Constructor for primary key
	 */
	public BbsCreditExchange (Integer id) {
		super(id);
	}

	/**
	 * Constructor for required fields
	 */
	public BbsCreditExchange (
		Integer id,
		Integer expoint,
		Integer exprestige,
		Boolean pointoutavailable,
		Boolean pointinavailable,
		Boolean prestigeoutavailable,
		Boolean prestigeinavailable,
		Float exchangetax,
		Integer miniBalance) {

		super (
			id,
			expoint,
			exprestige,
			pointoutavailable,
			pointinavailable,
			prestigeoutavailable,
			prestigeinavailable,
			exchangetax,
			miniBalance);
	}

/*[CONSTRUCTOR MARKER END]*/


}