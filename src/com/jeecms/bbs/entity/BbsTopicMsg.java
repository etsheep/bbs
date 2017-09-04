package com.jeecms.bbs.entity;

import com.jeecms.bbs.entity.base.BaseBbsTopicMsg;



public class BbsTopicMsg extends BaseBbsTopicMsg {
	private static final long serialVersionUID = 1L;

/*[CONSTRUCTOR MARKER BEGIN]*/
	public BbsTopicMsg () {
		super();
	}

	/**
	 * Constructor for primary key
	 */
	public BbsTopicMsg (Integer id) {
		super(id);
	}

	/**
	 * Constructor for required fields
	 */
	public BbsTopicMsg (
		Integer id,
		BbsTopic topic,
		Boolean status) {

		super (
			id,
			topic,
			status);
	}

/*[CONSTRUCTOR MARKER END]*/


}