package com.jeecms.bbs.entity;

import com.jeecms.bbs.entity.base.BaseBbsUserActiveLevel;



public class BbsUserActiveLevel extends BaseBbsUserActiveLevel {
	private static final long serialVersionUID = 1L;

/*[CONSTRUCTOR MARKER BEGIN]*/
	public BbsUserActiveLevel () {
		super();
	}

	/**
	 * Constructor for primary key
	 */
	public BbsUserActiveLevel (Integer id) {
		super(id);
	}

	/**
	 * Constructor for required fields
	 */
	public BbsUserActiveLevel (
		Integer id,
		String levelName,
		Long requiredHour) {

		super (
			id,
			levelName,
			requiredHour);
	}

/*[CONSTRUCTOR MARKER END]*/


}