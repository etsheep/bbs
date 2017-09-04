package com.jeecms.bbs.entity.base;

import java.io.Serializable;

/**
 * This is an object that contains data related to the jb_user table. Do not
 * modify this class because it will be overwritten if the configuration file
 * related to this class is modified.
 * 
 * @hibernate.class table="jb_user"
 */

public abstract class BaseBbsUser implements Serializable {

	public static String REF = "BbsUser";
	public static String PROP_INTRODUCTION = "introduction";
	public static String PROP_REPLY_COUNT = "replyCount";
	public static String PROP_LAST_LOGIN_IP = "lastLoginIp";
	public static String PROP_SIGNED = "signed";
	public static String PROP_PROHIBIT_POST = "prohibitPost";
	public static String PROP_GRADE_TODAY = "gradeToday";
	public static String PROP_DISABLED = "disabled";
	public static String PROP_PRIME_COUNT = "primeCount";
	public static String PROP_GROUP = "group";
	public static String PROP_UPLOAD_TODAY = "uploadToday";
	public static String PROP_LOGIN_COUNT = "loginCount";
	public static String PROP_REGISTER_TIME = "registerTime";
	public static String PROP_UPLOAD_TOTAL = "uploadTotal";
	public static String PROP_AVATAR = "avatar";
	public static String PROP_LAST_LOGIN_TIME = "lastLoginTime";
	public static String PROP_UPLOAD_DATE = "uploadDate";
	public static String PROP_EMAIL = "email";
	public static String PROP_UPLOAD_SIZE = "uploadSize";
	public static String PROP_PROHIBIT_TIME = "prohibitTime";
	public static String PROP_AVATAR_TYPE = "avatarType";
	public static String PROP_POINT = "point";
	public static String PROP_TOPIC_COUNT = "topicCount";
	public static String PROP_ADMIN = "admin";
	public static String PROP_ID = "id";
	public static String PROP_REGISTER_IP = "registerIp";
	public static String PROP_POST_TODAY = "postToday";
	public static String PROP_USERNAME = "username";
	public static String PROP_LAST_POST_TIME = "lastPostTime";

	// constructors
	public BaseBbsUser() {
		initialize();
	}

	/**
	 * Constructor for primary key
	 */
	public BaseBbsUser(Integer id) {
		this.setId(id);
		initialize();
	}

	/**
	 * Constructor for required fields
	 */
	public BaseBbsUser(Integer id,
			com.jeecms.bbs.entity.BbsUserGroup group,
			String username, java.util.Date registerTime,
			String registerIp, Integer loginCount,
			Long uploadTotal, Integer uploadToday,
			Integer uploadSize, Boolean admin,
			Boolean disabled, Long point,
			Short avatarType, Integer topicCount,
			Integer replyCount, Integer primeCount,
			Integer postToday, Short prohibitPost) {

		this.setId(id);
		this.setGroup(group);
		this.setUsername(username);
		this.setRegisterTime(registerTime);
		this.setRegisterIp(registerIp);
		this.setLoginCount(loginCount);
		this.setUploadTotal(uploadTotal);
		this.setUploadToday(uploadToday);
		this.setUploadSize(uploadSize);
		this.setAdmin(admin);
		this.setDisabled(disabled);
		this.setPoint(point);
		this.setAvatarType(avatarType);
		this.setTopicCount(topicCount);
		this.setReplyCount(replyCount);
		this.setPrimeCount(primeCount);
		this.setPostToday(postToday);
		this.setProhibitPost(prohibitPost);
		initialize();
	}

	protected void initialize() {
	}

	private int hashCode = Integer.MIN_VALUE;

	// primary key
	private Integer id;

	// fields
	private String username;
	private String email;
	private java.util.Date registerTime;
	private String registerIp;
	private java.util.Date lastLoginTime;
	private String lastLoginIp;
	private Integer loginCount;
	private Long uploadTotal;
	private Integer uploadToday;
	private Integer uploadSize;
	private java.sql.Date uploadDate;
	private Boolean admin;
	private Boolean disabled;
	private Long point;
	private Long prestige;
	private String introduction;
	private String signed;
	private String avatar;
	private Short avatarType;
	private Integer topicCount;
	private Integer replyCount;
	private Integer primeCount;
	private Integer postToday;
	private java.util.Date lastPostTime;
	private Short prohibitPost;
	private java.util.Date prohibitTime;
	private Integer gradeToday;
	private Integer magicPacketSize;
	private String sessionId;
	private Boolean official;

	// one to one
	private com.jeecms.bbs.entity.BbsUserOnline userOnline;

	// many to one
	private com.jeecms.bbs.entity.BbsUserGroup group;
	
	private com.jeecms.bbs.entity.BbsUserActiveLevel activeLevel;

	// collections
	private java.util.Map<String, String> attr;
	private java.util.Set<com.jeecms.bbs.entity.BbsUserExt> userExtSet;
	private java.util.Set<com.jeecms.bbs.entity.BbsLoginLog> loginLogs;
	private java.util.Set<com.jeecms.bbs.entity.BbsMemberMagic> memberMagics;
	
	private java.util.Set<com.jeecms.bbs.entity.BbsOperation> operations;
	private java.util.Set<com.jeecms.bbs.entity.BbsSession> sessions;
	private java.util.Set<com.jeecms.bbs.entity.BbsFriendShip> myFriends;
	private java.util.Set<com.jeecms.bbs.entity.BbsFriendShip> toFriends;

	/**
	 * Return the unique identifier of this class
	 * 
	 * @hibernate.id generator-class="assigned" column="user_id"
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
	 * Return the value associated with the column: username
	 */
	public String getUsername() {
		return username;
	}

	/**
	 * Set the value related to the column: username
	 * 
	 * @param username
	 *            the username value
	 */
	public void setUsername(String username) {
		this.username = username;
	}

	/**
	 * Return the value associated with the column: email
	 */
	public String getEmail() {
		return email;
	}

	/**
	 * Set the value related to the column: email
	 * 
	 * @param email
	 *            the email value
	 */
	public void setEmail(String email) {
		this.email = email;
	}

	/**
	 * Return the value associated with the column: register_time
	 */
	public java.util.Date getRegisterTime() {
		return registerTime;
	}

	/**
	 * Set the value related to the column: register_time
	 * 
	 * @param registerTime
	 *            the register_time value
	 */
	public void setRegisterTime(java.util.Date registerTime) {
		this.registerTime = registerTime;
	}

	/**
	 * Return the value associated with the column: register_ip
	 */
	public String getRegisterIp() {
		return registerIp;
	}

	/**
	 * Set the value related to the column: register_ip
	 * 
	 * @param registerIp
	 *            the register_ip value
	 */
	public void setRegisterIp(String registerIp) {
		this.registerIp = registerIp;
	}

	/**
	 * Return the value associated with the column: last_login_time
	 */
	public java.util.Date getLastLoginTime() {
		return lastLoginTime;
	}

	/**
	 * Set the value related to the column: last_login_time
	 * 
	 * @param lastLoginTime
	 *            the last_login_time value
	 */
	public void setLastLoginTime(java.util.Date lastLoginTime) {
		this.lastLoginTime = lastLoginTime;
	}

	/**
	 * Return the value associated with the column: last_login_ip
	 */
	public String getLastLoginIp() {
		return lastLoginIp;
	}

	/**
	 * Set the value related to the column: last_login_ip
	 * 
	 * @param lastLoginIp
	 *            the last_login_ip value
	 */
	public void setLastLoginIp(String lastLoginIp) {
		this.lastLoginIp = lastLoginIp;
	}

	/**
	 * Return the value associated with the column: login_count
	 */
	public Integer getLoginCount() {
		return loginCount;
	}

	/**
	 * Set the value related to the column: login_count
	 * 
	 * @param loginCount
	 *            the login_count value
	 */
	public void setLoginCount(Integer loginCount) {
		this.loginCount = loginCount;
	}

	/**
	 * Return the value associated with the column: upload_total
	 */
	public Long getUploadTotal() {
		return uploadTotal;
	}

	/**
	 * Set the value related to the column: upload_total
	 * 
	 * @param uploadTotal
	 *            the upload_total value
	 */
	public void setUploadTotal(Long uploadTotal) {
		this.uploadTotal = uploadTotal;
	}

	/**
	 * Return the value associated with the column: UPLOAD_TODAY
	 */
	public Integer getUploadToday() {
		return uploadToday;
	}

	/**
	 * Set the value related to the column: UPLOAD_TODAY
	 * 
	 * @param uploadToday
	 *            the UPLOAD_TODAY value
	 */
	public void setUploadToday(Integer uploadToday) {
		this.uploadToday = uploadToday;
	}

	/**
	 * Return the value associated with the column: upload_size
	 */
	public Integer getUploadSize() {
		return uploadSize;
	}

	/**
	 * Set the value related to the column: upload_size
	 * 
	 * @param uploadSize
	 *            the upload_size value
	 */
	public void setUploadSize(Integer uploadSize) {
		this.uploadSize = uploadSize;
	}

	/**
	 * Return the value associated with the column: upload_date
	 */
	public java.sql.Date getUploadDate() {
		return uploadDate;
	}

	/**
	 * Set the value related to the column: upload_date
	 * 
	 * @param uploadDate
	 *            the upload_date value
	 */
	public void setUploadDate(java.sql.Date uploadDate) {
		this.uploadDate = uploadDate;
	}

	/**
	 * Return the value associated with the column: is_admin
	 */
	public Boolean getAdmin() {
		return admin;
	}

	/**
	 * Set the value related to the column: is_admin
	 * 
	 * @param admin
	 *            the is_admin value
	 */
	public void setAdmin(Boolean admin) {
		this.admin = admin;
	}

	/**
	 * Return the value associated with the column: is_disabled
	 */
	public Boolean getDisabled() {
		return disabled;
	}

	/**
	 * Set the value related to the column: is_disabled
	 * 
	 * @param disabled
	 *            the is_disabled value
	 */
	public void setDisabled(Boolean disabled) {
		this.disabled = disabled;
	}

	/**
	 * Return the value associated with the column: POINT
	 */
	public Long getPoint() {
		return point;
	}

	/**
	 * Set the value related to the column: POINT
	 * 
	 * @param point
	 *            the POINT value
	 */
	public void setPoint(Long point) {
		this.point = point;
	}

	public Long getPrestige() {
		return prestige;
	}

	public void setPrestige(Long prestige) {
		this.prestige = prestige;
	}

	/**
	 * Return the value associated with the column: INTRODUCTION
	 */
	public String getIntroduction() {
		return introduction;
	}

	/**
	 * Set the value related to the column: INTRODUCTION
	 * 
	 * @param introduction
	 *            the INTRODUCTION value
	 */
	public void setIntroduction(String introduction) {
		this.introduction = introduction;
	}

	/**
	 * Return the value associated with the column: SIGNED
	 */
	public String getSigned() {
		return signed;
	}

	/**
	 * Set the value related to the column: SIGNED
	 * 
	 * @param signed
	 *            the SIGNED value
	 */
	public void setSigned(String signed) {
		this.signed = signed;
	}

	/**
	 * Return the value associated with the column: AVATAR
	 */
	public String getAvatar() {
		return avatar;
	}

	/**
	 * Set the value related to the column: AVATAR
	 * 
	 * @param avatar
	 *            the AVATAR value
	 */
	public void setAvatar(String avatar) {
		this.avatar = avatar;
	}

	/**
	 * Return the value associated with the column: AVATAR_TYPE
	 */
	public Short getAvatarType() {
		return avatarType;
	}

	/**
	 * Set the value related to the column: AVATAR_TYPE
	 * 
	 * @param avatarType
	 *            the AVATAR_TYPE value
	 */
	public void setAvatarType(Short avatarType) {
		this.avatarType = avatarType;
	}

	/**
	 * Return the value associated with the column: TOPIC_COUNT
	 */
	public Integer getTopicCount() {
		return topicCount;
	}

	/**
	 * Set the value related to the column: TOPIC_COUNT
	 * 
	 * @param topicCount
	 *            the TOPIC_COUNT value
	 */
	public void setTopicCount(Integer topicCount) {
		this.topicCount = topicCount;
	}

	/**
	 * Return the value associated with the column: REPLY_COUNT
	 */
	public Integer getReplyCount() {
		return replyCount;
	}

	/**
	 * Set the value related to the column: REPLY_COUNT
	 * 
	 * @param replyCount
	 *            the REPLY_COUNT value
	 */
	public void setReplyCount(Integer replyCount) {
		this.replyCount = replyCount;
	}

	/**
	 * Return the value associated with the column: PRIME_COUNT
	 */
	public Integer getPrimeCount() {
		return primeCount;
	}

	/**
	 * Set the value related to the column: PRIME_COUNT
	 * 
	 * @param primeCount
	 *            the PRIME_COUNT value
	 */
	public void setPrimeCount(Integer primeCount) {
		this.primeCount = primeCount;
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
	 * Return the value associated with the column: LAST_POST_TIME
	 */
	public java.util.Date getLastPostTime() {
		return lastPostTime;
	}

	/**
	 * Set the value related to the column: LAST_POST_TIME
	 * 
	 * @param lastPostTime
	 *            the LAST_POST_TIME value
	 */
	public void setLastPostTime(java.util.Date lastPostTime) {
		this.lastPostTime = lastPostTime;
	}

	/**
	 * Return the value associated with the column: PROHIBIT_POST
	 */
	public Short getProhibitPost() {
		return prohibitPost;
	}

	/**
	 * Set the value related to the column: PROHIBIT_POST
	 * 
	 * @param prohibitPost
	 *            the PROHIBIT_POST value
	 */
	public void setProhibitPost(Short prohibitPost) {
		this.prohibitPost = prohibitPost;
	}

	/**
	 * Return the value associated with the column: PROHIBIT_TIME
	 */
	public java.util.Date getProhibitTime() {
		return prohibitTime;
	}

	/**
	 * Set the value related to the column: PROHIBIT_TIME
	 * 
	 * @param prohibitTime
	 *            the PROHIBIT_TIME value
	 */
	public void setProhibitTime(java.util.Date prohibitTime) {
		this.prohibitTime = prohibitTime;
	}

	/**
	 * Return the value associated with the column: GRADE_TODAY
	 */
	public Integer getGradeToday() {
		return gradeToday;
	}

	/**
	 * Set the value related to the column: GRADE_TODAY
	 * 
	 * @param gradeToday
	 *            the GRADE_TODAY value
	 */
	public void setGradeToday(Integer gradeToday) {
		this.gradeToday = gradeToday;
	}
	


	public Integer getMagicPacketSize() {
		return magicPacketSize;
	}

	public void setMagicPacketSize(Integer magicPacketSize) {
		this.magicPacketSize = magicPacketSize;
	}
	
	public String getSessionId() {
		return sessionId;
	}

	public void setSessionId(String sessionId) {
		this.sessionId = sessionId;
	}
	
	public Boolean getOfficial() {
		return official;
	}

	public void setOfficial(Boolean official) {
		this.official = official;
	}

	public com.jeecms.bbs.entity.BbsUserOnline getUserOnline() {
		return userOnline;
	}

	public void setUserOnline(com.jeecms.bbs.entity.BbsUserOnline userOnline) {
		this.userOnline = userOnline;
	}

	/**
	 * Return the value associated with the column: group_id
	 */
	public com.jeecms.bbs.entity.BbsUserGroup getGroup() {
		return group;
	}

	/**
	 * Set the value related to the column: group_id
	 * 
	 * @param group
	 *            the group_id value
	 */
	public void setGroup(com.jeecms.bbs.entity.BbsUserGroup group) {
		this.group = group;
	}
	
	public com.jeecms.bbs.entity.BbsUserActiveLevel getActiveLevel() {
		return activeLevel;
	}

	public void setActiveLevel(com.jeecms.bbs.entity.BbsUserActiveLevel activeLevel) {
		this.activeLevel = activeLevel;
	}

	public java.util.Map<String, String> getAttr() {
		return attr;
	}

	public void setAttr(java.util.Map<String, String> attr) {
		this.attr = attr;
	}

	/**
	 * Return the value associated with the column: userExtSet
	 */
	public java.util.Set<com.jeecms.bbs.entity.BbsUserExt> getUserExtSet() {
		return userExtSet;
	}

	/**
	 * Set the value related to the column: userExtSet
	 * 
	 * @param userExtSet
	 *            the userExtSet value
	 */
	public void setUserExtSet(
			java.util.Set<com.jeecms.bbs.entity.BbsUserExt> userExtSet) {
		this.userExtSet = userExtSet;
	}

	public java.util.Set<com.jeecms.bbs.entity.BbsLoginLog> getLoginLogs() {
		return loginLogs;
	}

	public void setLoginLogs(
			java.util.Set<com.jeecms.bbs.entity.BbsLoginLog> loginLogs) {
		this.loginLogs = loginLogs;
	}

	

	public java.util.Set<com.jeecms.bbs.entity.BbsMemberMagic> getMemberMagics() {
		return memberMagics;
	}

	public void setMemberMagics(
			java.util.Set<com.jeecms.bbs.entity.BbsMemberMagic> memberMagics) {
		this.memberMagics = memberMagics;
	}
	
	public java.util.Set<com.jeecms.bbs.entity.BbsOperation> getOperations() {
		return operations;
	}

	public void setOperations(
			java.util.Set<com.jeecms.bbs.entity.BbsOperation> operations) {
		this.operations = operations;
	}

	public java.util.Set<com.jeecms.bbs.entity.BbsSession> getSessions() {
		return sessions;
	}

	public void setSessions(java.util.Set<com.jeecms.bbs.entity.BbsSession> sessions) {
		this.sessions = sessions;
	}
	
	public java.util.Set<com.jeecms.bbs.entity.BbsFriendShip> getMyFriends() {
		return myFriends;
	}

	public void setMyFriends(
			java.util.Set<com.jeecms.bbs.entity.BbsFriendShip> myFriends) {
		this.myFriends = myFriends;
	}

	public java.util.Set<com.jeecms.bbs.entity.BbsFriendShip> getToFriends() {
		return toFriends;
	}

	public void setToFriends(
			java.util.Set<com.jeecms.bbs.entity.BbsFriendShip> toFriends) {
		this.toFriends = toFriends;
	}

	public boolean equals(Object obj) {
		if (null == obj)
			return false;
		if (!(obj instanceof com.jeecms.bbs.entity.BbsUser))
			return false;
		else {
			com.jeecms.bbs.entity.BbsUser bbsUser = (com.jeecms.bbs.entity.BbsUser) obj;
			if (null == this.getId() || null == bbsUser.getId())
				return false;
			else
				return (this.getId().equals(bbsUser.getId()));
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