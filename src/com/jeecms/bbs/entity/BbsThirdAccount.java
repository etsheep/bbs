package com.jeecms.bbs.entity;

import com.jeecms.bbs.entity.base.BaseBbsThirdAccount;

public class BbsThirdAccount extends BaseBbsThirdAccount {
	private static final long serialVersionUID = 1L;
	
	public static final String QQ_KEY="openId";
	public static final String SINA_KEY="uid";
	public static final String QQ_PLAT="QQ";
	public static final String SINA_PLAT="SINA";
	public static final String QQ_WEBO_KEY="weboOpenId";
	public static final String QQ_WEBO_PLAT="QQWEBO";
/*[CONSTRUCTOR MARKER BEGIN]*/
	public BbsThirdAccount () {
		super();
	}

	/**
	 * Constructor for primary key
	 */
	public BbsThirdAccount (Long id) {
		super(id);
	}

	/**
	 * Constructor for required fields
	 */
	public BbsThirdAccount (
		Long id,
		String accountKey,
		String username,
		String source) {

		super (
			id,
			accountKey,
			username,
			source);
	}

/*[CONSTRUCTOR MARKER END]*/


}