/***************************************************************************************************
* ���ϸ� : .java
* ��� : ���ڿ��-������û
* �ۼ����� : 2007-05-22
* �ۼ��� : ��뼷
***************************************************************************************************/
/***************************************************************************************************
* �������� :
* ������ :
* �������� :
* ��� : 
***************************************************************************************************/


package chosun.ciis.is.bus.rec;

import java.sql.*;
import chosun.ciis.is.bus.dm.*;
import chosun.ciis.is.bus.ds.*;

/**
 * 
 */


public class IS_BUS_1330_LCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String wkcd;
	public String dept_cd_nm;
	public String vip_busn_acty_rept;
	public String vip_busn_plan;

	public IS_BUS_1330_LCURLISTRecord(){}

	public void setWkcd(String wkcd){
		this.wkcd = wkcd;
	}

	public void setDept_cd_nm(String dept_cd_nm){
		this.dept_cd_nm = dept_cd_nm;
	}

	public void setVip_busn_acty_rept(String vip_busn_acty_rept){
		this.vip_busn_acty_rept = vip_busn_acty_rept;
	}

	public void setVip_busn_plan(String vip_busn_plan){
		this.vip_busn_plan = vip_busn_plan;
	}

	public String getWkcd(){
		return this.wkcd;
	}

	public String getDept_cd_nm(){
		return this.dept_cd_nm;
	}

	public String getVip_busn_acty_rept(){
		return this.vip_busn_acty_rept;
	}

	public String getVip_busn_plan(){
		return this.vip_busn_plan;
	}
}

/* �ۼ��ð� : Tue Jun 19 20:22:02 KST 2012 */