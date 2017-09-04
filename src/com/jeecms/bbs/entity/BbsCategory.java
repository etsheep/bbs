package com.jeecms.bbs.entity;

import com.jeecms.bbs.entity.base.BaseBbsCategory;

public class BbsCategory extends BaseBbsCategory {
	private static final long serialVersionUID = 1L;

	/* [CONSTRUCTOR MARKER BEGIN] */
	public BbsCategory () {
		super();
	}

	/**
	 * Constructor for primary key
	 */
	public BbsCategory (Integer id) {
		super(id);
	}

	/**
	 * Constructor for required fields
	 */
	public BbsCategory (
		Integer id,
		com.jeecms.core.entity.CmsSite site,
		String path,
		String title,
		Integer priority,
		Integer forumCols) {

		super (
			id,
			site,
			path,
			title,
			priority,
			forumCols);
	}

	/* [CONSTRUCTOR MARKER END] */

}