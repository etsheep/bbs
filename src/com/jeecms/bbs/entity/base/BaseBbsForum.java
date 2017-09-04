package com.jeecms.bbs.entity.base;

import java.io.Serializable;

/**
 * This is an object that contains data related to the BBS_FORUM table. Do not
 * modify this class because it will be overwritten if the configuration file
 * related to this class is modified.
 * 
 * @hibernate.class table="BBS_FORUM"
 */

public abstract class BaseBbsForum implements Serializable {

	public static String REF = "BbsForum";
	public static String PROP_FORUM_RULE = "forumRule";
	public static String PROP_SITE = "site";
	public static String PROP_LAST_POST = "lastPost";
	public static String PROP_TOPIC_TOTAL = "topicTotal";
	public static String PROP_GROUP_VIEWS = "groupViews";
	public static String PROP_KEYWORDS = "keywords";
	public static String PROP_PRIORITY = "priority";
	public static String PROP_POINT_REPLY = "pointReply";
	public static String PROP_POINT_PRIME = "pointPrime";
	public static String PROP_POST_TOTAL = "postTotal";
	public static String PROP_GROUP_TOPICS = "groupTopics";
	public static String PROP_GROUP_REPLIES = "groupReplies";
	public static String PROP_LAST_TIME = "lastTime";
	public static String PROP_OUTER_URL = "outerUrl";
	public static String PROP_DESCRIPTION = "description";
	public static String PROP_TOPIC_LOCK_LIMIT = "topicLockLimit";
	public static String PROP_MODERATORS = "moderators";
	public static String PROP_PATH = "path";
	public static String PROP_POINT_TOPIC = "pointTopic";
	public static String PROP_CATEGORY = "category";
	public static String PROP_LAST_REPLY = "lastReply";
	public static String PROP_TITLE = "title";
	public static String PROP_ID = "id";
	public static String PROP_POST_TODAY = "postToday";

	// constructors
	public BaseBbsForum() {
		initialize();
	}

	/**
	 * Constructor for primary key
	 */
	public BaseBbsForum(Integer id) {
		this.setId(id);
		initialize();
	}

	/**
	 * Constructor for required fields
	 */
	public BaseBbsForum(Integer id,
			com.jeecms.bbs.entity.BbsCategory category,
			com.jeecms.core.entity.CmsSite site, String path,
			String title, Integer topicLockLimit,
			Integer priority, Integer topicTotal,
			Integer postTotal, Integer postToday,
			Integer pointTopic, Integer pointReply,
			Integer pointPrime) {

		this.setId(id);
		this.setCategory(category);
		this.setSite(site);
		this.setPath(path);
		this.setTitle(title);
		this.setTopicLockLimit(topicLockLimit);
		this.setPriority(priority);
		this.setTopicTotal(topicTotal);
		this.setPostTotal(postTotal);
		this.setPostToday(postToday);
		this.setPointTopic(pointTopic);
		this.setPointReply(pointReply);
		this.setPointPrime(pointPrime);
		initialize();
	}

	protected void initialize() {
	}

	private int hashCode = Integer.MIN_VALUE;

	// primary key
	private Integer id;

	// fields
	private String path;
	private String title;
	private String description;
	private String keywords;
	private String forumRule;
	private Integer topicLockLimit;
	private Integer priority;
	private Integer topicTotal;
	private Integer postTotal;
	private Integer postToday;
	private String outerUrl;
	private Integer pointTopic;
	private Integer pointReply;
	private Integer pointPrime;
	private Integer prestigeTopic;
	private Integer prestigeReply;
	private Integer prestigePrime0;
	private Integer prestigePrime1;
	private Integer prestigePrime2;
	private Integer prestigePrime3;
	private Boolean pointAvailable;
	private Boolean prestigeAvailable;
	private java.util.Date lastTime;
	private String moderators;
	private String groupViews;
	private String groupTopics;
	private String groupReplies;

	// many to one
	private com.jeecms.bbs.entity.BbsPost lastPost;
	private com.jeecms.bbs.entity.BbsUser lastReply;
	private com.jeecms.bbs.entity.BbsCategory category;
	private com.jeecms.core.entity.CmsSite site;

	// collections
	private java.util.Set<com.jeecms.bbs.entity.BbsPostType> postTypes;

	/**
	 * Return the unique identifier of this class
	 * 
	 * @hibernate.id generator-class="native" column="FORUM_ID"
	 */
	public Integer getId() {
		return id;
	}

	/**
	 * Set the unique identifier of this class
	 * 
	 * @param id
	 *            the new ID
	 */
	public void setId(Integer id) {
		this.id = id;
		this.hashCode = Integer.MIN_VALUE;
	}

	/**
	 * Return the value associated with the column: PATH
	 */
	public String getPath() {
		return path;
	}

	/**
	 * Set the value related to the column: PATH
	 * 
	 * @param path
	 *            the PATH value
	 */
	public void setPath(String path) {
		this.path = path;
	}

	/**
	 * Return the value associated with the column: TITLE
	 */
	public String getTitle() {
		return title;
	}

	/**
	 * Set the value related to the column: TITLE
	 * 
	 * @param title
	 *            the TITLE value
	 */
	public void setTitle(String title) {
		this.title = title;
	}

	/**
	 * Return the value associated with the column: DESCRIPTION
	 */
	public String getDescription() {
		return description;
	}

	/**
	 * Set the value related to the column: DESCRIPTION
	 * 
	 * @param description
	 *            the DESCRIPTION value
	 */
	public void setDescription(String description) {
		this.description = description;
	}

	/**
	 * Return the value associated with the column: KEYWORDS
	 */
	public String getKeywords() {
		return keywords;
	}

	/**
	 * Set the value related to the column: KEYWORDS
	 * 
	 * @param keywords
	 *            the KEYWORDS value
	 */
	public void setKeywords(String keywords) {
		this.keywords = keywords;
	}

	/**
	 * Return the value associated with the column: FORUM_RULE
	 */
	public String getForumRule() {
		return forumRule;
	}

	/**
	 * Set the value related to the column: FORUM_RULE
	 * 
	 * @param forumRule
	 *            the FORUM_RULE value
	 */
	public void setForumRule(String forumRule) {
		this.forumRule = forumRule;
	}

	/**
	 * Return the value associated with the column: TOPIC_LOCK_LIMIT
	 */
	public Integer getTopicLockLimit() {
		return topicLockLimit;
	}

	/**
	 * Set the value related to the column: TOPIC_LOCK_LIMIT
	 * 
	 * @param topicLockLimit
	 *            the TOPIC_LOCK_LIMIT value
	 */
	public void setTopicLockLimit(Integer topicLockLimit) {
		this.topicLockLimit = topicLockLimit;
	}

	/**
	 * Return the value associated with the column: PRIORITY
	 */
	public Integer getPriority() {
		return priority;
	}

	/**
	 * Set the value related to the column: PRIORITY
	 * 
	 * @param priority
	 *            the PRIORITY value
	 */
	public void setPriority(Integer priority) {
		this.priority = priority;
	}

	/**
	 * Return the value associated with the column: TOPIC_TOTAL
	 */
	public Integer getTopicTotal() {
		return topicTotal;
	}

	/**
	 * Set the value related to the column: TOPIC_TOTAL
	 * 
	 * @param topicTotal
	 *            the TOPIC_TOTAL value
	 */
	public void setTopicTotal(Integer topicTotal) {
		this.topicTotal = topicTotal;
	}

	/**
	 * Return the value associated with the column: POST_TOTAL
	 */
	public Integer getPostTotal() {
		return postTotal;
	}

	/**
	 * Set the value related to the column: POST_TOTAL
	 * 
	 * @param postTotal
	 *            the POST_TOTAL value
	 */
	public void setPostTotal(Integer postTotal) {
		this.postTotal = postTotal;
	}

	/**
	 * Return the value associated with the column: POST_TODAY
	 */
	public Integer getPostToday() {
		return postToday;
	}

	/**
	 * Set the value related to the column: POST_TODAY
	 * 
	 * @param postToday
	 *            the POST_TODAY value
	 */
	public void setPostToday(Integer postToday) {
		this.postToday = postToday;
	}

	/**
	 * Return the value associated with the column: OUTER_URL
	 */
	public String getOuterUrl() {
		return outerUrl;
	}

	/**
	 * Set the value related to the column: OUTER_URL
	 * 
	 * @param outerUrl
	 *            the OUTER_URL value
	 */
	public void setOuterUrl(String outerUrl) {
		this.outerUrl = outerUrl;
	}

	/**
	 * Return the value associated with the column: POINT_TOPIC
	 */
	public Integer getPointTopic() {
		return pointTopic;
	}

	/**
	 * Set the value related to the column: POINT_TOPIC
	 * 
	 * @param pointTopic
	 *            the POINT_TOPIC value
	 */
	public void setPointTopic(Integer pointTopic) {
		this.pointTopic = pointTopic;
	}

	/**
	 * Return the value associated with the column: POINT_REPLY
	 */
	public Integer getPointReply() {
		return pointReply;
	}

	/**
	 * Set the value related to the column: POINT_REPLY
	 * 
	 * @param pointReply
	 *            the POINT_REPLY value
	 */
	public void setPointReply(Integer pointReply) {
		this.pointReply = pointReply;
	}

	/**
	 * Return the value associated with the column: POINT_PRIME
	 */
	public Integer getPointPrime() {
		return pointPrime;
	}

	/**
	 * Set the value related to the column: POINT_PRIME
	 * 
	 * @param pointPrime
	 *            the POINT_PRIME value
	 */
	public void setPointPrime(Integer pointPrime) {
		this.pointPrime = pointPrime;
	}

	public Integer getPrestigePrime0() {
		return prestigePrime0;
	}

	public void setPrestigePrime0(Integer prestigePrime0) {
		this.prestigePrime0 = prestigePrime0;
	}

	public Integer getPrestigeTopic() {
		return prestigeTopic;
	}

	public void setPrestigeTopic(Integer prestigeTopic) {
		this.prestigeTopic = prestigeTopic;
	}

	public Integer getPrestigeReply() {
		return prestigeReply;
	}

	public void setPrestigeReply(Integer prestigeReply) {
		this.prestigeReply = prestigeReply;
	}

	public Integer getPrestigePrime1() {
		return prestigePrime1;
	}

	public void setPrestigePrime1(Integer prestigePrime1) {
		this.prestigePrime1 = prestigePrime1;
	}

	public Integer getPrestigePrime2() {
		return prestigePrime2;
	}

	public void setPrestigePrime2(Integer prestigePrime2) {
		this.prestigePrime2 = prestigePrime2;
	}

	public Integer getPrestigePrime3() {
		return prestigePrime3;
	}

	public void setPrestigePrime3(Integer prestigePrime3) {
		this.prestigePrime3 = prestigePrime3;
	}

	public Boolean getPointAvailable() {
		return pointAvailable;
	}

	public void setPointAvailable(Boolean pointAvailable) {
		this.pointAvailable = pointAvailable;
	}

	public Boolean getPrestigeAvailable() {
		return prestigeAvailable;
	}

	public void setPrestigeAvailable(Boolean prestigeAvailable) {
		this.prestigeAvailable = prestigeAvailable;
	}

	/**
	 * Return the value associated with the column: LAST_TIME
	 */
	public java.util.Date getLastTime() {
		return lastTime;
	}

	/**
	 * Set the value related to the column: LAST_TIME
	 * 
	 * @param lastTime
	 *            the LAST_TIME value
	 */
	public void setLastTime(java.util.Date lastTime) {
		this.lastTime = lastTime;
	}

	/**
	 * Return the value associated with the column: moderators
	 */
	public String getModerators() {
		return moderators;
	}

	/**
	 * Set the value related to the column: moderators
	 * 
	 * @param moderators
	 *            the moderators value
	 */
	public void setModerators(String moderators) {
		this.moderators = moderators;
	}

	/**
	 * Return the value associated with the column: group_views
	 */
	public String getGroupViews() {
		return groupViews;
	}

	/**
	 * Set the value related to the column: group_views
	 * 
	 * @param groupViews
	 *            the group_views value
	 */
	public void setGroupViews(String groupViews) {
		this.groupViews = groupViews;
	}

	/**
	 * Return the value associated with the column: group_topics
	 */
	public String getGroupTopics() {
		return groupTopics;
	}

	/**
	 * Set the value related to the column: group_topics
	 * 
	 * @param groupTopics
	 *            the group_topics value
	 */
	public void setGroupTopics(String groupTopics) {
		this.groupTopics = groupTopics;
	}

	/**
	 * Return the value associated with the column: group_replies
	 */
	public String getGroupReplies() {
		return groupReplies;
	}

	/**
	 * Set the value related to the column: group_replies
	 * 
	 * @param groupReplies
	 *            the group_replies value
	 */
	public void setGroupReplies(String groupReplies) {
		this.groupReplies = groupReplies;
	}

	/**
	 * Return the value associated with the column: POST_ID
	 */
	public com.jeecms.bbs.entity.BbsPost getLastPost() {
		return lastPost;
	}

	/**
	 * Set the value related to the column: POST_ID
	 * 
	 * @param lastPost
	 *            the POST_ID value
	 */
	public void setLastPost(com.jeecms.bbs.entity.BbsPost lastPost) {
		this.lastPost = lastPost;
	}

	/**
	 * Return the value associated with the column: replyer_id
	 */
	public com.jeecms.bbs.entity.BbsUser getLastReply() {
		return lastReply;
	}

	/**
	 * Set the value related to the column: replyer_id
	 * 
	 * @param lastReply
	 *            the replyer_id value
	 */
	public void setLastReply(com.jeecms.bbs.entity.BbsUser lastReply) {
		this.lastReply = lastReply;
	}

	/**
	 * Return the value associated with the column: CATEGORY_ID
	 */
	public com.jeecms.bbs.entity.BbsCategory getCategory() {
		return category;
	}

	/**
	 * Set the value related to the column: CATEGORY_ID
	 * 
	 * @param category
	 *            the CATEGORY_ID value
	 */
	public void setCategory(com.jeecms.bbs.entity.BbsCategory category) {
		this.category = category;
	}

	/**
	 * Return the value associated with the column: site_id
	 */
	public com.jeecms.core.entity.CmsSite getSite() {
		return site;
	}

	/**
	 * Set the value related to the column: site_id
	 * 
	 * @param site
	 *            the site_id value
	 */
	public void setSite(com.jeecms.core.entity.CmsSite site) {
		this.site = site;
	}

	public java.util.Set<com.jeecms.bbs.entity.BbsPostType> getPostTypes() {
		return postTypes;
	}

	public void setPostTypes(
			java.util.Set<com.jeecms.bbs.entity.BbsPostType> postTypes) {
		this.postTypes = postTypes;
	}

	public boolean equals(Object obj) {
		if (null == obj)
			return false;
		if (!(obj instanceof com.jeecms.bbs.entity.BbsForum))
			return false;
		else {
			com.jeecms.bbs.entity.BbsForum bbsForum = (com.jeecms.bbs.entity.BbsForum) obj;
			if (null == this.getId() || null == bbsForum.getId())
				return false;
			else
				return (this.getId().equals(bbsForum.getId()));
		}
	}

	public int hashCode() {
		if (Integer.MIN_VALUE == this.hashCode) {
			if (null == this.getId())
				return super.hashCode();
			else {
				String hashStr = this.getClass().getName() + ":"
						+ this.getId().hashCode();
				this.hashCode = hashStr.hashCode();
			}
		}
		return this.hashCode;
	}

	public String toString() {
		return super.toString();
	}

}