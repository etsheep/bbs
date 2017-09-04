package com.jeecms.bbs.entity.base;

import java.io.Serializable;
import java.util.HashSet;

import com.jeecms.bbs.entity.BbsCommonMagic;
import com.jeecms.bbs.entity.BbsPostType;

/**
 * This is an object that contains data related to the BBS_USER_GROUP table. Do
 * not modify this class because it will be overwritten if the configuration
 * file related to this class is modified.
 * 
 * @hibernate.class table="BBS_USER_GROUP"
 */

public abstract class BaseBbsUserGroup implements Serializable {

	public static String REF = "BbsUserGroup";
	public static String PROP_TYPE = "type";
	public static String PROP_SITE = "site";
	public static String PROP_IMG_PATH = "imgPath";
	public static String PROP_POINT = "point";
	public static String PROP_DEFAULT = "default";
	public static String PROP_NAME = "name";
	public static String PROP_GRADE_NUM = "gradeNum";
	public static String PROP_ID = "id";

	// constructors
	public BaseBbsUserGroup() {
		initialize();
	}

	/**
	 * Constructor for primary key
	 */
	public BaseBbsUserGroup(Integer id) {
		this.setId(id);
		initialize();
	}

	/**
	 * Constructor for required fields
	 */
	public BaseBbsUserGroup(Integer id,
			com.jeecms.core.entity.CmsSite site, String name,
			Short type, Long point,
			Boolean m_default, Integer gradeNum) {

		this.setId(id);
		this.setSite(site);
		this.setName(name);
		this.setType(type);
		this.setPoint(point);
		this.setDefault(m_default);
		this.setGradeNum(gradeNum);
		initialize();
	}

	protected void initialize() {
	}

	private int hashCode = Integer.MIN_VALUE;

	// primary key
	private Integer id;

	// fields
	private String name;
	private Short type;
	private String imgPath;
	private Long point;
	private Boolean m_default;
	private Integer gradeNum;
	private Integer magicPacketSize;

	// many to one
	private com.jeecms.core.entity.CmsSite site;

	// collections
	private java.util.Map<String, String> perms;
	private java.util.Set<BbsPostType> postTypes;
	private java.util.Set<BbsCommonMagic> magics;
	private java.util.Set<BbsCommonMagic> beUsedMagics;

	/**
	 * Return the unique identifier of this class
	 * 
	 * @hibernate.id generator-class="native" column="GROUP_ID"
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
	 * Return the value associated with the column: NAME
	 */
	public String getName() {
		return name;
	}

	/**
	 * Set the value related to the column: NAME
	 * 
	 * @param name
	 *            the NAME value
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * Return the value associated with the column: GROUP_TYPE
	 */
	public Short getType() {
		return type;
	}

	/**
	 * Set the value related to the column: GROUP_TYPE
	 * 
	 * @param type
	 *            the GROUP_TYPE value
	 */
	public void setType(Short type) {
		this.type = type;
	}

	/**
	 * Return the value associated with the column: GROUP_IMG
	 */
	public String getImgPath() {
		return imgPath;
	}

	/**
	 * Set the value related to the column: GROUP_IMG
	 * 
	 * @param imgPath
	 *            the GROUP_IMG value
	 */
	public void setImgPath(String imgPath) {
		this.imgPath = imgPath;
	}

	/**
	 * Return the value associated with the column: GROUP_POINT
	 */
	public Long getPoint() {
		return point;
	}

	/**
	 * Set the value related to the column: GROUP_POINT
	 * 
	 * @param point
	 *            the GROUP_POINT value
	 */
	public void setPoint(Long point) {
		this.point = point;
	}

	/**
	 * Return the value associated with the column: IS_DEFAULT
	 */
	public Boolean getDefault() {
		return m_default;
	}

	/**
	 * Set the value related to the column: IS_DEFAULT
	 * 
	 * @param m_default
	 *            the IS_DEFAULT value
	 */
	public void setDefault(Boolean m_default) {
		this.m_default = m_default;
	}

	/**
	 * Return the value associated with the column: GRADE_NUM
	 */
	public Integer getGradeNum() {
		return gradeNum;
	}

	/**
	 * Set the value related to the column: GRADE_NUM
	 * 
	 * @param gradeNum
	 *            the GRADE_NUM value
	 */
	public void setGradeNum(Integer gradeNum) {
		this.gradeNum = gradeNum;
	}
	

	public Integer getMagicPacketSize() {
		return magicPacketSize;
	}

	public void setMagicPacketSize(Integer magicPacketSize) {
		this.magicPacketSize = magicPacketSize;
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

	/**
	 * Return the value associated with the column: perms
	 */
	public java.util.Map<String, String> getPerms() {
		return perms;
	}

	/**
	 * Set the value related to the column: perms
	 * 
	 * @param perms
	 *            the perms value
	 */
	public void setPerms(java.util.Map<String, String> perms) {
		this.perms = perms;
	}

	public java.util.Set<BbsPostType> getPostTypes() {
		return postTypes;
	}

	public void setPostTypes(java.util.Set<BbsPostType> postTypes) {
		this.postTypes = postTypes;
	}

	public java.util.Set<BbsCommonMagic> getMagics() {
		return magics;
	}

	public void setMagics(java.util.Set<BbsCommonMagic> magics) {
		this.magics = magics;
	}
	
	public java.util.Set<BbsCommonMagic> getBeUsedMagics() {
		return beUsedMagics;
	}

	public void setBeUsedMagics(java.util.Set<BbsCommonMagic> beUsedMagics) {
		this.beUsedMagics = beUsedMagics;
	}

	public boolean equals(Object obj) {
		if (null == obj)
			return false;
		if (!(obj instanceof com.jeecms.bbs.entity.BbsUserGroup))
			return false;
		else {
			com.jeecms.bbs.entity.BbsUserGroup bbsUserGroup = (com.jeecms.bbs.entity.BbsUserGroup) obj;
			if (null == this.getId() || null == bbsUserGroup.getId())
				return false;
			else
				return (this.getId().equals(bbsUserGroup.getId()));
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