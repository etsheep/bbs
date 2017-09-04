package com.jeecms.bbs.entity;

import com.jeecms.bbs.entity.base.BaseBbsReportExt;



public class BbsReportExt extends BaseBbsReportExt {
	private static final long serialVersionUID = 1L;

/*[CONSTRUCTOR MARKER BEGIN]*/
	public BbsReportExt () {
		super();
	}

	/**
	 * Constructor for primary key
	 */
	public BbsReportExt (Integer id) {
		super(id);
	}

	/**
	 * Constructor for required fields
	 */
	public BbsReportExt (
		Integer id,
		BbsUser reportUser,
		BbsReport report,
		java.util.Date reportTime) {

		super (
			id,
			reportUser,
			report,
			reportTime);
	}

/*[CONSTRUCTOR MARKER END]*/


}