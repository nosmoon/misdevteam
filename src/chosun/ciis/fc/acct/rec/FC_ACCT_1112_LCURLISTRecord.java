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


package chosun.ciis.fc.acct.rec;

import java.sql.*;
import chosun.ciis.fc.acct.dm.*;
import chosun.ciis.fc.acct.ds.*;

/**
 * 
 */


public class FC_ACCT_1112_LCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String busn_dt;
	public String wkdy_nm;
	public String busn_dd_clsf_cd_nm;
	public String busn_dd_clsf_cd;
	public String wkdy_cd;

	public FC_ACCT_1112_LCURLISTRecord(){}

	public void setBusn_dt(String busn_dt){
		this.busn_dt = busn_dt;
	}

	public void setWkdy_nm(String wkdy_nm){
		this.wkdy_nm = wkdy_nm;
	}

	public void setBusn_dd_clsf_cd_nm(String busn_dd_clsf_cd_nm){
		this.busn_dd_clsf_cd_nm = busn_dd_clsf_cd_nm;
	}

	public void setBusn_dd_clsf_cd(String busn_dd_clsf_cd){
		this.busn_dd_clsf_cd = busn_dd_clsf_cd;
	}

	public void setWkdy_cd(String wkdy_cd){
		this.wkdy_cd = wkdy_cd;
	}

	public String getBusn_dt(){
		return this.busn_dt;
	}

	public String getWkdy_nm(){
		return this.wkdy_nm;
	}

	public String getBusn_dd_clsf_cd_nm(){
		return this.busn_dd_clsf_cd_nm;
	}

	public String getBusn_dd_clsf_cd(){
		return this.busn_dd_clsf_cd;
	}

	public String getWkdy_cd(){
		return this.wkdy_cd;
	}
}

/* �ۼ��ð� : Mon Apr 06 15:24:02 KST 2009 */