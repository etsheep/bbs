package com.jeecms.bbs.entity;

import com.jeecms.bbs.entity.base.BaseBbsConfig;

public class BbsConfig extends BaseBbsConfig {
	private static final long serialVersionUID = 1L;
	/**
	 * 关闭注册
	 */
	public static final short REGISTER_CLOSE = 0;
	/**
	 * 开发注册
	 */
	public static final short REGISTER_OPEN = 1;
	/**
	 * 邀请注册
	 */
	public static final short REGISTER_INVITATION = 2;


	/* [CONSTRUCTOR MARKER BEGIN] */
	public BbsConfig () {
		super();
	}

	/**
	 * Constructor for primary key
	 */
	public BbsConfig (Integer id) {
		super(id);
	}

	/**
	 * Constructor for required fields
	 */
	public BbsConfig (
		Integer id,
		BbsUser lastUser,
		com.jeecms.bbs.entity.BbsUserGroup registerGroup,
		com.jeecms.bbs.entity.BbsUserGroup defaultGroup,
		String defAvatar,
		Integer avatarWidth,
		Integer avatarHeight,
		Integer topicCountPerPage,
		Integer postCountPerPage,
		String keywords,
		String description,
		Short registerStatus,
		Integer topicHotCount,
		Integer postToday,
		Integer postYesterday,
		Integer postMax,
		java.util.Date postMaxDate,
		Integer topicTotal,
		Integer postTotal,
		Integer userTotal) {

		super (
			id,
			lastUser,
			registerGroup,
			defaultGroup,
			defAvatar,
			avatarWidth,
			avatarHeight,
			topicCountPerPage,
			postCountPerPage,
			keywords,
			description,
			registerStatus,
			topicHotCount,
			postToday,
			postYesterday,
			postMax,
			postMaxDate,
			topicTotal,
			postTotal,
			userTotal);
	}

	/* [CONSTRUCTOR MARKER END] */

}