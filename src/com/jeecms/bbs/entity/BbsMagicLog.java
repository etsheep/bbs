package com.jeecms.bbs.entity;

import com.jeecms.bbs.entity.base.BaseBbsMagicLog;



public class BbsMagicLog extends BaseBbsMagicLog {
	private static final long serialVersionUID = 1L;

/*[CONSTRUCTOR MARKER BEGIN]*/
	public BbsMagicLog () {
		super();
	}

	/**
	 * Constructor for primary key
	 */
	public BbsMagicLog (Integer id) {
		super(id);
	}

	/**
	 * Constructor for required fields
	 */
	public BbsMagicLog (
		Integer id,
		com.jeecms.bbs.entity.BbsCommonMagic magic,
		BbsUser user,
		java.util.Date logTime) {

		super (
			id,
			magic,
			user,
			logTime);
	}

/*[CONSTRUCTOR MARKER END]*/


}