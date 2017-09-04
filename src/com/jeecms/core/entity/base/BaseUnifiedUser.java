package com.jeecms.core.entity.base;

import java.io.Serializable;


/**
 * This is an object that contains data related to the jo_user table.
 * Do not modify this class because it will be overwritten if the configuration file
 * related to this class is modified.
 *
 * @hibernate.class
 *  table="jo_user"
 */

public abstract class BaseUnifiedUser  implements Serializable {

	public static String REF = "UnifiedUser";
	public static String PROP_LOGIN_COUNT = "loginCount";
	public static String PROP_REGISTER_TIME = "registerTime";
	public static String PROP_PASSWORD = "password";
	public static String PROP_LAST_LOGIN_IP = "lastLoginIp";
	public static String PROP_EMAIL = "email";
	public static String PROP_RESET_KEY = "resetKey";
	public static String PROP_LAST_LOGIN_TIME = "lastLoginTime";
	public static String PROP_RESET_PWD = "resetPwd";
	public static String PROP_ID = "id";
	public static String PROP_REGISTER_IP = "registerIp";
	public static String PROP_USERNAME = "username";


	// constructors
	public BaseUnifiedUser () {
		initialize();
	}

	/**
	 * Constructor for primary key
	 */
	public BaseUnifiedUser (Integer id) {
		this.setId(id);
		initialize();
	}

	/**
	 * Constructor for required fields
	 */
	public BaseUnifiedUser (
		Integer id,
		String username,
		String password,
		java.util.Date registerTime,
		String registerIp,
		Integer loginCount) {

		this.setId(id);
		this.setUsername(username);
		this.setPassword(password);
		this.setRegisterTime(registerTime);
		this.setRegisterIp(registerIp);
		this.setLoginCount(loginCount);
		initialize();
	}

	protected void initialize () {}



	private int hashCode = Integer.MIN_VALUE;

	// primary key
	private Integer id;

	// fields
	private String username;
	private String email;
	private String password;
	private java.util.Date registerTime;
	private String registerIp;
	private java.util.Date lastLoginTime;
	private String lastLoginIp;
	private Integer loginCount;
	private String resetKey;
	private String resetPwd;
	private java.util.Date errorTime;
	private Integer errorCount;
	private String errorIp;
	
	private Boolean activation;
	private String activationCode;



	/**
	 * Return the unique identifier of this class
     * @hibernate.id
     *  generator-class="identity"
     *  column="user_id"
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
	 * Return the value associated with the column: username
	 */
	public String getUsername () {
		return username;
	}

	/**
	 * Set the value related to the column: username
	 * @param username the username value
	 */
	public void setUsername (String username) {
		this.username = username;
	}


	/**
	 * Return the value associated with the column: email
	 */
	public String getEmail () {
		return email;
	}

	/**
	 * Set the value related to the column: email
	 * @param email the email value
	 */
	public void setEmail (String email) {
		this.email = email;
	}


	/**
	 * Return the value associated with the column: password
	 */
	public String getPassword () {
		return password;
	}

	/**
	 * Set the value related to the column: password
	 * @param password the password value
	 */
	public void setPassword (String password) {
		this.password = password;
	}


	/**
	 * Return the value associated with the column: register_time
	 */
	public java.util.Date getRegisterTime () {
		return registerTime;
	}

	/**
	 * Set the value related to the column: register_time
	 * @param registerTime the register_time value
	 */
	public void setRegisterTime (java.util.Date registerTime) {
		this.registerTime = registerTime;
	}


	/**
	 * Return the value associated with the column: register_ip
	 */
	public String getRegisterIp () {
		return registerIp;
	}

	/**
	 * Set the value related to the column: register_ip
	 * @param registerIp the register_ip value
	 */
	public void setRegisterIp (String registerIp) {
		this.registerIp = registerIp;
	}


	/**
	 * Return the value associated with the column: last_login_time
	 */
	public java.util.Date getLastLoginTime () {
		return lastLoginTime;
	}

	/**
	 * Set the value related to the column: last_login_time
	 * @param lastLoginTime the last_login_time value
	 */
	public void setLastLoginTime (java.util.Date lastLoginTime) {
		this.lastLoginTime = lastLoginTime;
	}


	/**
	 * Return the value associated with the column: last_login_ip
	 */
	public String getLastLoginIp () {
		return lastLoginIp;
	}

	/**
	 * Set the value related to the column: last_login_ip
	 * @param lastLoginIp the last_login_ip value
	 */
	public void setLastLoginIp (String lastLoginIp) {
		this.lastLoginIp = lastLoginIp;
	}


	/**
	 * Return the value associated with the column: login_count
	 */
	public Integer getLoginCount () {
		return loginCount;
	}

	/**
	 * Set the value related to the column: login_count
	 * @param loginCount the login_count value
	 */
	public void setLoginCount (Integer loginCount) {
		this.loginCount = loginCount;
	}


	/**
	 * Return the value associated with the column: reset_key
	 */
	public String getResetKey () {
		return resetKey;
	}

	/**
	 * Set the value related to the column: reset_key
	 * @param resetKey the reset_key value
	 */
	public void setResetKey (String resetKey) {
		this.resetKey = resetKey;
	}


	/**
	 * Return the value associated with the column: reset_pwd
	 */
	public String getResetPwd () {
		return resetPwd;
	}

	/**
	 * Set the value related to the column: reset_pwd
	 * @param resetPwd the reset_pwd value
	 */
	public void setResetPwd (String resetPwd) {
		this.resetPwd = resetPwd;
	}
	
	public java.util.Date getErrorTime() {
		return errorTime;
	}

	public void setErrorTime(java.util.Date errorTime) {
		this.errorTime = errorTime;
	}

	public Integer getErrorCount() {
		return errorCount;
	}

	public void setErrorCount(Integer errorCount) {
		this.errorCount = errorCount;
	}

	public String getErrorIp() {
		return errorIp;
	}

	public void setErrorIp(String errorIp) {
		this.errorIp = errorIp;
	}

	public Boolean getActivation() {
		return activation;
	}

	public void setActivation(Boolean activation) {
		this.activation = activation;
	}

	public String getActivationCode() {
		return activationCode;
	}

	public void setActivationCode(String activationCode) {
		this.activationCode = activationCode;
	}

	public boolean equals (Object obj) {
		if (null == obj) return false;
		if (!(obj instanceof com.jeecms.core.entity.UnifiedUser)) return false;
		else {
			com.jeecms.core.entity.UnifiedUser unifiedUser = (com.jeecms.core.entity.UnifiedUser) obj;
			if (null == this.getId() || null == unifiedUser.getId()) return false;
			else return (this.getId().equals(unifiedUser.getId()));
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