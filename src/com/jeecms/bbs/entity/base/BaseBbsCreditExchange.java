package com.jeecms.bbs.entity.base;

import java.io.Serializable;


/**
 * This is an object that contains data related to the bbs_credit_exchange table.
 * Do not modify this class because it will be overwritten if the configuration file
 * related to this class is modified.
 *
 * @hibernate.class
 *  table="bbs_credit_exchange"
 */

public abstract class BaseBbsCreditExchange  implements Serializable {

	public static String REF = "BbsCreditExchange";
	public static String PROP_PRESTIGEINAVAILABLE = "prestigeinavailable";
	public static String PROP_POINTINAVAILABLE = "pointinavailable";
	public static String PROP_POINTOUTAVAILABLE = "pointoutavailable";
	public static String PROP_PRESTIGEOUTAVAILABLE = "prestigeoutavailable";
	public static String PROP_MINI_BALANCE = "miniBalance";
	public static String PROP_ID = "id";
	public static String PROP_EXCHANGETAX = "exchangetax";
	public static String PROP_EXPOINT = "expoint";
	public static String PROP_EXPRESTIGE = "exprestige";


	// constructors
	public BaseBbsCreditExchange () {
		initialize();
	}

	/**
	 * Constructor for primary key
	 */
	public BaseBbsCreditExchange (Integer id) {
		this.setId(id);
		initialize();
	}

	/**
	 * Constructor for required fields
	 */
	public BaseBbsCreditExchange (
		Integer id,
		Integer expoint,
		Integer exprestige,
		Boolean pointoutavailable,
		Boolean pointinavailable,
		Boolean prestigeoutavailable,
		Boolean prestigeinavailable,
		Float exchangetax,
		Integer miniBalance) {

		this.setId(id);
		this.setExpoint(expoint);
		this.setExprestige(exprestige);
		this.setPointoutavailable(pointoutavailable);
		this.setPointinavailable(pointinavailable);
		this.setPrestigeoutavailable(prestigeoutavailable);
		this.setPrestigeinavailable(prestigeinavailable);
		this.setExchangetax(exchangetax);
		this.setMiniBalance(miniBalance);
		initialize();
	}

	protected void initialize () {}



	private int hashCode = Integer.MIN_VALUE;

	// primary key
	private Integer id;

	// fields
	private Integer expoint;
	private Integer exprestige;
	private Boolean pointoutavailable;
	private Boolean pointinavailable;
	private Boolean prestigeoutavailable;
	private Boolean prestigeinavailable;
	private Float exchangetax;
	private Integer miniBalance;



	/**
	 * Return the unique identifier of this class
     * @hibernate.id
     *  generator-class="assigned"
     *  column="eid"
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
	 * Return the value associated with the column: expoint
	 */
	public Integer getExpoint () {
		return expoint;
	}

	/**
	 * Set the value related to the column: expoint
	 * @param expoint the expoint value
	 */
	public void setExpoint (Integer expoint) {
		this.expoint = expoint;
	}


	/**
	 * Return the value associated with the column: exprestige
	 */
	public Integer getExprestige () {
		return exprestige;
	}

	/**
	 * Set the value related to the column: exprestige
	 * @param exprestige the exprestige value
	 */
	public void setExprestige (Integer exprestige) {
		this.exprestige = exprestige;
	}


	/**
	 * Return the value associated with the column: pointoutavailable
	 */
	public Boolean getPointoutavailable () {
		return pointoutavailable;
	}

	/**
	 * Set the value related to the column: pointoutavailable
	 * @param pointoutavailable the pointoutavailable value
	 */
	public void setPointoutavailable (Boolean pointoutavailable) {
		this.pointoutavailable = pointoutavailable;
	}


	/**
	 * Return the value associated with the column: pointinavailable
	 */
	public Boolean getPointinavailable () {
		return pointinavailable;
	}

	/**
	 * Set the value related to the column: pointinavailable
	 * @param pointinavailable the pointinavailable value
	 */
	public void setPointinavailable (Boolean pointinavailable) {
		this.pointinavailable = pointinavailable;
	}


	/**
	 * Return the value associated with the column: prestigeoutavailable
	 */
	public Boolean getPrestigeoutavailable () {
		return prestigeoutavailable;
	}

	/**
	 * Set the value related to the column: prestigeoutavailable
	 * @param prestigeoutavailable the prestigeoutavailable value
	 */
	public void setPrestigeoutavailable (Boolean prestigeoutavailable) {
		this.prestigeoutavailable = prestigeoutavailable;
	}


	/**
	 * Return the value associated with the column: prestigeinavailable
	 */
	public Boolean getPrestigeinavailable () {
		return prestigeinavailable;
	}

	/**
	 * Set the value related to the column: prestigeinavailable
	 * @param prestigeinavailable the prestigeinavailable value
	 */
	public void setPrestigeinavailable (Boolean prestigeinavailable) {
		this.prestigeinavailable = prestigeinavailable;
	}


	/**
	 * Return the value associated with the column: exchangetax
	 */
	public Float getExchangetax () {
		return exchangetax;
	}

	/**
	 * Set the value related to the column: exchangetax
	 * @param exchangetax the exchangetax value
	 */
	public void setExchangetax (Float exchangetax) {
		this.exchangetax = exchangetax;
	}


	/**
	 * Return the value associated with the column: mini_balance
	 */
	public Integer getMiniBalance () {
		return miniBalance;
	}

	/**
	 * Set the value related to the column: mini_balance
	 * @param miniBalance the mini_balance value
	 */
	public void setMiniBalance (Integer miniBalance) {
		this.miniBalance = miniBalance;
	}



	public boolean equals (Object obj) {
		if (null == obj) return false;
		if (!(obj instanceof com.jeecms.bbs.entity.BbsCreditExchange)) return false;
		else {
			com.jeecms.bbs.entity.BbsCreditExchange bbsCreditExchange = (com.jeecms.bbs.entity.BbsCreditExchange) obj;
			if (null == this.getId() || null == bbsCreditExchange.getId()) return false;
			else return (this.getId().equals(bbsCreditExchange.getId()));
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