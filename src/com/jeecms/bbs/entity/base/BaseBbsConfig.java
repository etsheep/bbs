package com.jeecms.bbs.entity.base;

import java.io.Serializable;


/**
 * This is an object that contains data related to the BBS_CONFIG table.
 * Do not modify this class because it will be overwritten if the configuration file
 * related to this class is modified.
 *
 * @hibernate.class
 *  table="BBS_CONFIG"
 */

public abstract class BaseBbsConfig  implements Serializable {

	public static String REF = "BbsConfig";
	public static String PROP_AVATAR_WIDTH = "avatarWidth";
	public static String PROP_POST_MAX = "postMax";
	public static String PROP_AVATAR_HEIGHT = "avatarHeight";
	public static String PROP_SITE = "site";
	public static String PROP_DEF_AVATAR = "defAvatar";
	public static String PROP_REGISTER_GROUP = "registerGroup";
	public static String PROP_TOPIC_TOTAL = "topicTotal";
	public static String PROP_LAST_USER = "lastUser";
	public static String PROP_REGISTER_RULE = "registerRule";
	public static String PROP_DEFAULT_GROUP = "defaultGroup";
	public static String PROP_POST_MAX_DATE = "postMaxDate";
	public static String PROP_KEYWORDS = "keywords";
	public static String PROP_POST_YESTERDAY = "postYesterday";
	public static String PROP_AUTO_REGISTER = "autoRegister";
	public static String PROP_REGISTER_STATUS = "registerStatus";
	public static String PROP_POST_TOTAL = "postTotal";
	public static String PROP_TOPIC_COUNT_PER_PAGE = "topicCountPerPage";
	public static String PROP_DESCRIPTION = "description";
	public static String PROP_TOPIC_HOT_COUNT = "topicHotCount";
	public static String PROP_USER_TOTAL = "userTotal";
	public static String PROP_POST_COUNT_PER_PAGE = "postCountPerPage";
	public static String PROP_ID = "id";
	public static String PROP_POST_TODAY = "postToday";


	// constructors
	public BaseBbsConfig () {
		initialize();
	}

	/**
	 * Constructor for primary key
	 */
	public BaseBbsConfig (Integer id) {
		this.setId(id);
		initialize();
	}

	/**
	 * Constructor for required fields
	 */
	public BaseBbsConfig (
		Integer id,
		com.jeecms.bbs.entity.BbsUser lastUser,
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

		this.setId(id);
		this.setLastUser(lastUser);
		this.setRegisterGroup(registerGroup);
		this.setDefaultGroup(defaultGroup);
		this.setDefAvatar(defAvatar);
		this.setAvatarWidth(avatarWidth);
		this.setAvatarHeight(avatarHeight);
		this.setTopicCountPerPage(topicCountPerPage);
		this.setPostCountPerPage(postCountPerPage);
		this.setKeywords(keywords);
		this.setDescription(description);
		this.setRegisterStatus(registerStatus);
		this.setTopicHotCount(topicHotCount);
		this.setPostToday(postToday);
		this.setPostYesterday(postYesterday);
		this.setPostMax(postMax);
		this.setPostMaxDate(postMaxDate);
		this.setTopicTotal(topicTotal);
		this.setPostTotal(postTotal);
		this.setUserTotal(userTotal);
		initialize();
	}

	protected void initialize () {}



	private int hashCode = Integer.MIN_VALUE;

	// primary key
	private Integer id;

	// fields
	private String defAvatar;
	private Integer avatarWidth;
	private Integer avatarHeight;
	private Integer topicCountPerPage;
	private Integer postCountPerPage;
	private String keywords;
	private String description;
	private Short registerStatus;
	private String registerRule;
	private Integer topicHotCount;
	private Integer postToday;
	private Integer postYesterday;
	private Integer postMax;
	private java.util.Date postMaxDate;
	private Integer topicTotal;
	private Integer postTotal;
	private Integer userTotal;
	private Boolean autoRegister;
	private Boolean emailValidate;

	// one to one
	private com.jeecms.core.entity.CmsSite site;

	// many to one
	private com.jeecms.bbs.entity.BbsUser lastUser;
	private com.jeecms.bbs.entity.BbsUserGroup registerGroup;
	private com.jeecms.bbs.entity.BbsUserGroup defaultGroup;
	



	/**
	 * Return the unique identifier of this class
     * @hibernate.id
     *  generator-class="foreign"
     *  column="CONFIG_ID"
     */
	public Integer getId () {
		return id;
	}

	/**
	 * Set the unique identifier of this class
	 * @param id the new ID
	 */
	public void setId (Integer id) {
		this.id = id;
		this.hashCode = Integer.MIN_VALUE;
	}




	/**
	 * Return the value associated with the column: DEF_AVATAR
	 */
	public String getDefAvatar () {
		return defAvatar;
	}

	/**
	 * Set the value related to the column: DEF_AVATAR
	 * @param defAvatar the DEF_AVATAR value
	 */
	public void setDefAvatar (String defAvatar) {
		this.defAvatar = defAvatar;
	}


	/**
	 * Return the value associated with the column: AVATAR_WIDTH
	 */
	public Integer getAvatarWidth () {
		return avatarWidth;
	}

	/**
	 * Set the value related to the column: AVATAR_WIDTH
	 * @param avatarWidth the AVATAR_WIDTH value
	 */
	public void setAvatarWidth (Integer avatarWidth) {
		this.avatarWidth = avatarWidth;
	}


	/**
	 * Return the value associated with the column: AVATAR_HEIGHT
	 */
	public Integer getAvatarHeight () {
		return avatarHeight;
	}

	/**
	 * Set the value related to the column: AVATAR_HEIGHT
	 * @param avatarHeight the AVATAR_HEIGHT value
	 */
	public void setAvatarHeight (Integer avatarHeight) {
		this.avatarHeight = avatarHeight;
	}


	/**
	 * Return the value associated with the column: TOPIC_COUNT_PER_PAGE
	 */
	public Integer getTopicCountPerPage () {
		return topicCountPerPage;
	}

	/**
	 * Set the value related to the column: TOPIC_COUNT_PER_PAGE
	 * @param topicCountPerPage the TOPIC_COUNT_PER_PAGE value
	 */
	public void setTopicCountPerPage (Integer topicCountPerPage) {
		this.topicCountPerPage = topicCountPerPage;
	}


	/**
	 * Return the value associated with the column: POST_COUNT_PER_PAGE
	 */
	public Integer getPostCountPerPage () {
		return postCountPerPage;
	}

	/**
	 * Set the value related to the column: POST_COUNT_PER_PAGE
	 * @param postCountPerPage the POST_COUNT_PER_PAGE value
	 */
	public void setPostCountPerPage (Integer postCountPerPage) {
		this.postCountPerPage = postCountPerPage;
	}


	/**
	 * Return the value associated with the column: KEYWORDS
	 */
	public String getKeywords () {
		return keywords;
	}

	/**
	 * Set the value related to the column: KEYWORDS
	 * @param keywords the KEYWORDS value
	 */
	public void setKeywords (String keywords) {
		this.keywords = keywords;
	}


	/**
	 * Return the value associated with the column: DESCRIPTION
	 */
	public String getDescription () {
		return description;
	}

	/**
	 * Set the value related to the column: DESCRIPTION
	 * @param description the DESCRIPTION value
	 */
	public void setDescription (String description) {
		this.description = description;
	}


	/**
	 * Return the value associated with the column: REGISTER_STATUS
	 */
	public Short getRegisterStatus () {
		return registerStatus;
	}

	/**
	 * Set the value related to the column: REGISTER_STATUS
	 * @param registerStatus the REGISTER_STATUS value
	 */
	public void setRegisterStatus (Short registerStatus) {
		this.registerStatus = registerStatus;
	}


	/**
	 * Return the value associated with the column: REGISTER_RULE
	 */
	public String getRegisterRule () {
		return registerRule;
	}

	/**
	 * Set the value related to the column: REGISTER_RULE
	 * @param registerRule the REGISTER_RULE value
	 */
	public void setRegisterRule (String registerRule) {
		this.registerRule = registerRule;
	}


	/**
	 * Return the value associated with the column: TOPIC_HOT_COUNT
	 */
	public Integer getTopicHotCount () {
		return topicHotCount;
	}

	/**
	 * Set the value related to the column: TOPIC_HOT_COUNT
	 * @param topicHotCount the TOPIC_HOT_COUNT value
	 */
	public void setTopicHotCount (Integer topicHotCount) {
		this.topicHotCount = topicHotCount;
	}


	/**
	 * Return the value associated with the column: CACHE_POST_TODAY
	 */
	public Integer getPostToday () {
		return postToday;
	}

	/**
	 * Set the value related to the column: CACHE_POST_TODAY
	 * @param postToday the CACHE_POST_TODAY value
	 */
	public void setPostToday (Integer postToday) {
		this.postToday = postToday;
	}


	/**
	 * Return the value associated with the column: CACHE_POST_YESTERDAY
	 */
	public Integer getPostYesterday () {
		return postYesterday;
	}

	/**
	 * Set the value related to the column: CACHE_POST_YESTERDAY
	 * @param postYesterday the CACHE_POST_YESTERDAY value
	 */
	public void setPostYesterday (Integer postYesterday) {
		this.postYesterday = postYesterday;
	}


	/**
	 * Return the value associated with the column: CACHE_POST_MAX
	 */
	public Integer getPostMax () {
		return postMax;
	}

	/**
	 * Set the value related to the column: CACHE_POST_MAX
	 * @param postMax the CACHE_POST_MAX value
	 */
	public void setPostMax (Integer postMax) {
		this.postMax = postMax;
	}


	/**
	 * Return the value associated with the column: CACHE_POST_MAX_DATE
	 */
	public java.util.Date getPostMaxDate () {
		return postMaxDate;
	}

	/**
	 * Set the value related to the column: CACHE_POST_MAX_DATE
	 * @param postMaxDate the CACHE_POST_MAX_DATE value
	 */
	public void setPostMaxDate (java.util.Date postMaxDate) {
		this.postMaxDate = postMaxDate;
	}


	/**
	 * Return the value associated with the column: CACHE_TOPIC_TOTAL
	 */
	public Integer getTopicTotal () {
		return topicTotal;
	}

	/**
	 * Set the value related to the column: CACHE_TOPIC_TOTAL
	 * @param topicTotal the CACHE_TOPIC_TOTAL value
	 */
	public void setTopicTotal (Integer topicTotal) {
		this.topicTotal = topicTotal;
	}


	/**
	 * Return the value associated with the column: CACHE_POST_TOTAL
	 */
	public Integer getPostTotal () {
		return postTotal;
	}

	/**
	 * Set the value related to the column: CACHE_POST_TOTAL
	 * @param postTotal the CACHE_POST_TOTAL value
	 */
	public void setPostTotal (Integer postTotal) {
		this.postTotal = postTotal;
	}


	/**
	 * Return the value associated with the column: CACHE_USER_TOTAL
	 */
	public Integer getUserTotal () {
		return userTotal;
	}

	/**
	 * Set the value related to the column: CACHE_USER_TOTAL
	 * @param userTotal the CACHE_USER_TOTAL value
	 */
	public void setUserTotal (Integer userTotal) {
		this.userTotal = userTotal;
	}


	/**
	 * Return the value associated with the column: AUTO_REGISTER
	 */
	public Boolean getAutoRegister () {
		return autoRegister;
	}

	/**
	 * Set the value related to the column: AUTO_REGISTER
	 * @param autoRegister the AUTO_REGISTER value
	 */
	public void setAutoRegister (Boolean autoRegister) {
		this.autoRegister = autoRegister;
	}
	


	public Boolean getEmailValidate() {
		return emailValidate;
	}

	public void setEmailValidate(Boolean emailValidate) {
		this.emailValidate = emailValidate;
	}

	/**
	 * Return the value associated with the column: site
	 */
	public com.jeecms.core.entity.CmsSite getSite () {
		return site;
	}

	/**
	 * Set the value related to the column: site
	 * @param site the site value
	 */
	public void setSite (com.jeecms.core.entity.CmsSite site) {
		this.site = site;
	}


	/**
	 * Return the value associated with the column: last_user_id
	 */
	public com.jeecms.bbs.entity.BbsUser getLastUser () {
		return lastUser;
	}

	/**
	 * Set the value related to the column: last_user_id
	 * @param lastUser the last_user_id value
	 */
	public void setLastUser (com.jeecms.bbs.entity.BbsUser lastUser) {
		this.lastUser = lastUser;
	}


	/**
	 * Return the value associated with the column: REGISTER_GROUP_ID
	 */
	public com.jeecms.bbs.entity.BbsUserGroup getRegisterGroup () {
		return registerGroup;
	}

	/**
	 * Set the value related to the column: REGISTER_GROUP_ID
	 * @param registerGroup the REGISTER_GROUP_ID value
	 */
	public void setRegisterGroup (com.jeecms.bbs.entity.BbsUserGroup registerGroup) {
		this.registerGroup = registerGroup;
	}


	/**
	 * Return the value associated with the column: DEFAULT_GROUP_ID
	 */
	public com.jeecms.bbs.entity.BbsUserGroup getDefaultGroup () {
		return defaultGroup;
	}

	/**
	 * Set the value related to the column: DEFAULT_GROUP_ID
	 * @param defaultGroup the DEFAULT_GROUP_ID value
	 */
	public void setDefaultGroup (com.jeecms.bbs.entity.BbsUserGroup defaultGroup) {
		this.defaultGroup = defaultGroup;
	}
	

	public boolean equals (Object obj) {
		if (null == obj) return false;
		if (!(obj instanceof com.jeecms.bbs.entity.BbsConfig)) return false;
		else {
			com.jeecms.bbs.entity.BbsConfig bbsConfig = (com.jeecms.bbs.entity.BbsConfig) obj;
			if (null == this.getId() || null == bbsConfig.getId()) return false;
			else return (this.getId().equals(bbsConfig.getId()));
		}
	}

	public int hashCode () {
		if (Integer.MIN_VALUE == this.hashCode) {
			if (null == this.getId()) return super.hashCode();
			else {
				String hashStr = this.getClass().getName() + ":" + this.getId().hashCode();
				this.hashCode = hashStr.hashCode();
			}
		}
		return this.hashCode;
	}


	public String toString () {
		return super.toString();
	}


}