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


package chosun.ciis.is.bas.rec;

import java.sql.*;
import chosun.ciis.is.bas.dm.*;
import chosun.ciis.is.bas.ds.*;

/**
 * 
 */


public class IS_BAS_1010_LCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String cmpy_cd;
	public String std_cd;
	public String seq;
	public String rvord_uprc;
	public String dstb_scat_uprc;
	public String build_scat_uprc;
	public String etc_scat_uprc;
	public String incmg_pers_ip;
	public String incmg_pers;
	public String incmg_dt_tm;
	public String chg_pers;
	public String chg_dt_tm;

	public IS_BAS_1010_LCURLISTRecord(){}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setStd_cd(String std_cd){
		this.std_cd = std_cd;
	}

	public void setSeq(String seq){
		this.seq = seq;
	}

	public void setRvord_uprc(String rvord_uprc){
		this.rvord_uprc = rvord_uprc;
	}

	public void setDstb_scat_uprc(String dstb_scat_uprc){
		this.dstb_scat_uprc = dstb_scat_uprc;
	}

	public void setBuild_scat_uprc(String build_scat_uprc){
		this.build_scat_uprc = build_scat_uprc;
	}

	public void setEtc_scat_uprc(String etc_scat_uprc){
		this.etc_scat_uprc = etc_scat_uprc;
	}

	public void setIncmg_pers_ip(String incmg_pers_ip){
		this.incmg_pers_ip = incmg_pers_ip;
	}

	public void setIncmg_pers(String incmg_pers){
		this.incmg_pers = incmg_pers;
	}

	public void setIncmg_dt_tm(String incmg_dt_tm){
		this.incmg_dt_tm = incmg_dt_tm;
	}

	public void setChg_pers(String chg_pers){
		this.chg_pers = chg_pers;
	}

	public void setChg_dt_tm(String chg_dt_tm){
		this.chg_dt_tm = chg_dt_tm;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getStd_cd(){
		return this.std_cd;
	}

	public String getSeq(){
		return this.seq;
	}

	public String getRvord_uprc(){
		return this.rvord_uprc;
	}

	public String getDstb_scat_uprc(){
		return this.dstb_scat_uprc;
	}

	public String getBuild_scat_uprc(){
		return this.build_scat_uprc;
	}

	public String getEtc_scat_uprc(){
		return this.etc_scat_uprc;
	}

	public String getIncmg_pers_ip(){
		return this.incmg_pers_ip;
	}

	public String getIncmg_pers(){
		return this.incmg_pers;
	}

	public String getIncmg_dt_tm(){
		return this.incmg_dt_tm;
	}

	public String getChg_pers(){
		return this.chg_pers;
	}

	public String getChg_dt_tm(){
		return this.chg_dt_tm;
	}
}

/* �ۼ��ð� : Tue Apr 17 20:23:13 KST 2012 */