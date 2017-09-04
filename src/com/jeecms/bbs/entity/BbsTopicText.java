package com.jeecms.bbs.entity;

import com.jeecms.bbs.entity.base.BaseBbsTopicText;



public class BbsTopicText extends BaseBbsTopicText {
	private static final long serialVersionUID = 1L;

/*[CONSTRUCTOR MARKER BEGIN]*/
	public BbsTopicText () {
		super();
	}

	/**
	 * Constructor for primary key
	 */
	public BbsTopicText (Integer id) {
		super(id);
	}

	/**
	 * Constructor for required fields
	 */
	public BbsTopicText (
		Integer id,
		String title) {

		super (
			id,
			title);
	}

/*[CONSTRUCTOR MARKER END]*/


}