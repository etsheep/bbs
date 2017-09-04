package com.jeecms.bbs.entity;

import com.jeecms.bbs.entity.base.BaseBbsGrade;



public class BbsGrade extends BaseBbsGrade {
	private static final long serialVersionUID = 1L;

/*[CONSTRUCTOR MARKER BEGIN]*/
	public BbsGrade () {
		super();
	}

	/**
	 * Constructor for primary key
	 */
	public BbsGrade (Integer id) {
		super(id);
	}

	/**
	 * Constructor for required fields
	 */
	public BbsGrade (
		Integer id,
		BbsPost post,
		BbsUser grader) {

		super (
			id,
			post,
			grader);
	}

/*[CONSTRUCTOR MARKER END]*/


}