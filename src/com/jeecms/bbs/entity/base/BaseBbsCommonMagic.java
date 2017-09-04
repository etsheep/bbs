package com.jeecms.bbs.entity.base;

import java.io.Serializable;


/**
 * This is an object that contains data related to the bbs_common_magic table.
 * Do not modify this class because it will be overwritten if the configuration file
 * related to this class is modified.
 *
 * @hibernate.class
 *  table="bbs_common_magic"
 */

public abstract class BaseBbsCommonMagic  implements Serializable {

	public static String REF = "BbsCommonMagic";
	public static String PROP_DESCRIPTION = "description";
	public static String PROP_NUM = "num";
	public static String PROP_USEPEROID = "useperoid";
	public static String PROP_CREDIT = "credit";
	public static String PROP_USENUM = "usenum";
	public static String PROP_SUPPLYNUM = "supplynum";
	public static String PROP_DISPLAYORDER = "displayorder";
	public static String PROP_AVAILABLE = "available";
	public static String PROP_NAME = "name";
	public static String PROP_WEIGHT = "weight";
	public static String PROP_USEEVENT = "useevent";
	public static String PROP_PRICE = "price";
	public static String PROP_SALEVOLUME = "salevolume";
	public static String PROP_ID = "id";
	public static String PROP_IDENTIFIER = "identifier";
	public static String PROP_SUPPLYTYPE = "supplytype";


	// constructors
	public BaseBbsCommonMagic () {
		initialize();
	}

	/**
	 * Constructor for primary key
	 */
	public BaseBbsCommonMagic (Integer id) {
		this.setId(id);
		initialize();
	}

	/**
	 * Constructor for required fields
	 */
	public BaseBbsCommonMagic (
		Integer id,
		Boolean available,
		String name,
		String identifier,
		String description,
		Byte displayorder,
		Byte credit,
		Integer price,
		Integer num,
		Integer salevolume,
		Integer supplytype,
		Integer supplynum,
		Integer useperoid,
		Integer usenum,
		Integer weight,
		Boolean useevent) {

		this.setId(id);
		this.setAvailable(available);
		this.setName(name);
		this.setIdentifier(identifier);
		this.setDescription(description);
		this.setDisplayorder(displayorder);
		this.setCredit(credit);
		this.setPrice(price);
		this.setNum(num);
		this.setSalevolume(salevolume);
		this.setSupplytype(supplytype);
		this.setSupplynum(supplynum);
		this.setUseperoid(useperoid);
		this.setUsenum(usenum);
		this.setWeight(weight);
		this.setUseevent(useevent);
		initialize();
	}

	protected void initialize () {}



	private int hashCode = Integer.MIN_VALUE;

	// primary key
	private Integer id;

	// fields
	private Boolean available;
	private String name;
	private String identifier;
	private String description;
	private Byte displayorder;
	private Byte credit;
	private Integer price;
	private Integer num;
	private Integer salevolume;
	private Integer supplytype;
	private Integer supplynum;
	private Integer useperoid;
	private Integer usenum;
	private Integer weight;
	private Boolean useevent;

	// collections
	private java.util.Set<com.jeecms.bbs.entity.BbsUser> users;
	private java.util.Set<com.jeecms.bbs.entity.BbsUserGroup> useGroups;
	private java.util.Set<com.jeecms.bbs.entity.BbsUserGroup> toUseGroups;



	/**
	 * Return the unique identifier of this class
     * @hibernate.id
     *  generator-class="native"
     *  column="magicid"
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
	 * Return the value associated with the column: available
	 */
	public Boolean getAvailable () {
		return available;
	}

	/**
	 * Set the value related to the column: available
	 * @param available the available value
	 */
	public void setAvailable (Boolean available) {
		this.available = available;
	}


	/**
	 * Return the value associated with the column: name
	 */
	public String getName () {
		return name;
	}

	/**
	 * Set the value related to the column: name
	 * @param name the name value
	 */
	public void setName (String name) {
		this.name = name;
	}


	/**
	 * Return the value associated with the column: identifier
	 */
	public String getIdentifier () {
		return identifier;
	}

	/**
	 * Set the value related to the column: identifier
	 * @param identifier the identifier value
	 */
	public void setIdentifier (String identifier) {
		this.identifier = identifier;
	}


	/**
	 * Return the value associated with the column: description
	 */
	public String getDescription () {
		return description;
	}

	/**
	 * Set the value related to the column: description
	 * @param description the description value
	 */
	public void setDescription (String description) {
		this.description = description;
	}


	/**
	 * Return the value associated with the column: displayorder
	 */
	public Byte getDisplayorder () {
		return displayorder;
	}

	/**
	 * Set the value related to the column: displayorder
	 * @param displayorder the displayorder value
	 */
	public void setDisplayorder (Byte displayorder) {
		this.displayorder = displayorder;
	}


	/**
	 * Return the value associated with the column: credit
	 */
	public Byte getCredit () {
		return credit;
	}

	/**
	 * Set the value related to the column: credit
	 * @param credit the credit value
	 */
	public void setCredit (Byte credit) {
		this.credit = credit;
	}


	/**
	 * Return the value associated with the column: price
	 */
	public Integer getPrice () {
		return price;
	}

	/**
	 * Set the value related to the column: price
	 * @param price the price value
	 */
	public void setPrice (Integer price) {
		this.price = price;
	}


	/**
	 * Return the value associated with the column: num
	 */
	public Integer getNum () {
		return num;
	}

	/**
	 * Set the value related to the column: num
	 * @param num the num value
	 */
	public void setNum (Integer num) {
		this.num = num;
	}


	/**
	 * Return the value associated with the column: salevolume
	 */
	public Integer getSalevolume () {
		return salevolume;
	}

	/**
	 * Set the value related to the column: salevolume
	 * @param salevolume the salevolume value
	 */
	public void setSalevolume (Integer salevolume) {
		this.salevolume = salevolume;
	}


	/**
	 * Return the value associated with the column: supplytype
	 */
	public Integer getSupplytype () {
		return supplytype;
	}

	/**
	 * Set the value related to the column: supplytype
	 * @param supplytype the supplytype value
	 */
	public void setSupplytype (Integer supplytype) {
		this.supplytype = supplytype;
	}


	/**
	 * Return the value associated with the column: supplynum
	 */
	public Integer getSupplynum () {
		return supplynum;
	}

	/**
	 * Set the value related to the column: supplynum
	 * @param supplynum the supplynum value
	 */
	public void setSupplynum (Integer supplynum) {
		this.supplynum = supplynum;
	}


	/**
	 * Return the value associated with the column: useperoid
	 */
	public Integer getUseperoid () {
		return useperoid;
	}

	/**
	 * Set the value related to the column: useperoid
	 * @param useperoid the useperoid value
	 */
	public void setUseperoid (Integer useperoid) {
		this.useperoid = useperoid;
	}


	/**
	 * Return the value associated with the column: usenum
	 */
	public Integer getUsenum () {
		return usenum;
	}

	/**
	 * Set the value related to the column: usenum
	 * @param usenum the usenum value
	 */
	public void setUsenum (Integer usenum) {
		this.usenum = usenum;
	}


	/**
	 * Return the value associated with the column: weight
	 */
	public Integer getWeight () {
		return weight;
	}

	/**
	 * Set the value related to the column: weight
	 * @param weight the weight value
	 */
	public void setWeight (Integer weight) {
		this.weight = weight;
	}


	/**
	 * Return the value associated with the column: useevent
	 */
	public Boolean getUseevent () {
		return useevent;
	}

	/**
	 * Set the value related to the column: useevent
	 * @param useevent the useevent value
	 */
	public void setUseevent (Boolean useevent) {
		this.useevent = useevent;
	}


	/**
	 * Return the value associated with the column: users
	 */
	public java.util.Set<com.jeecms.bbs.entity.BbsUser> getUsers () {
		return users;
	}

	/**
	 * Set the value related to the column: users
	 * @param users the users value
	 */
	public void setUsers (java.util.Set<com.jeecms.bbs.entity.BbsUser> users) {
		this.users = users;
	}


	/**
	 * Return the value associated with the column: useGroups
	 */
	public java.util.Set<com.jeecms.bbs.entity.BbsUserGroup> getUseGroups () {
		return useGroups;
	}

	/**
	 * Set the value related to the column: useGroups
	 * @param useGroups the useGroups value
	 */
	public void setUseGroups (java.util.Set<com.jeecms.bbs.entity.BbsUserGroup> useGroups) {
		this.useGroups = useGroups;
	}
	
	public java.util.Set<com.jeecms.bbs.entity.BbsUserGroup> getToUseGroups() {
		return toUseGroups;
	}

	public void setToUseGroups(
			java.util.Set<com.jeecms.bbs.entity.BbsUserGroup> toUseGroups) {
		this.toUseGroups = toUseGroups;
	}

	public boolean equals (Object obj) {
		if (null == obj) return false;
		if (!(obj instanceof com.jeecms.bbs.entity.BbsCommonMagic)) return false;
		else {
			com.jeecms.bbs.entity.BbsCommonMagic bbsCommonMagic = (com.jeecms.bbs.entity.BbsCommonMagic) obj;
			if (null == this.getId() || null == bbsCommonMagic.getId()) return false;
			else return (this.getId().equals(bbsCommonMagic.getId()));
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