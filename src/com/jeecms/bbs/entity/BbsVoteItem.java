package com.jeecms.bbs.entity;

import com.jeecms.bbs.entity.base.BaseBbsVoteItem;



public class BbsVoteItem extends BaseBbsVoteItem {
	private static final long serialVersionUID = 1L;
	
	public int getPercent() {
		Integer totalCount = getTopic().getTotalCount();
		if (totalCount != null && totalCount != 0) {
			return (getVoteCount() * 100) / totalCount;
		} else {
			return 0;
		}
	}
	
	public void init(){
		if(getVoteCount()==null){
			setVoteCount(0);
		}
	}

/*[CONSTRUCTOR MARKER BEGIN]*/
	public BbsVoteItem () {
		super();
	}

	/**
	 * Constructor for primary key
	 */
	public BbsVoteItem (Integer id) {
		super(id);
	}

	/**
	 * Constructor for required fields
	 */
	public BbsVoteItem (
		Integer id,
		com.jeecms.bbs.entity.BbsVoteTopic topic,
		String name,
		Integer voteCount) {

		super (
			id,
			topic,
			name,
			voteCount);
	}

/*[CONSTRUCTOR MARKER END]*/


}