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


package chosun.ciis.as.aset.rec;

import java.sql.*;
import chosun.ciis.as.aset.dm.*;
import chosun.ciis.as.aset.ds.*;

/**
 * 
 */


public class AS_ASET_1901_LCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String chg_dt;
	public String aset_tot_cnt;
	public String eis_fix;
	public String eis_pers;
	public String eis_fix_dt_tm;

	public AS_ASET_1901_LCURLISTRecord(){}

	public void setChg_dt(String chg_dt){
		this.chg_dt = chg_dt;
	}

	public void setAset_tot_cnt(String aset_tot_cnt){
		this.aset_tot_cnt = aset_tot_cnt;
	}

	public void setEis_fix(String eis_fix){
		this.eis_fix = eis_fix;
	}

	public void setEis_pers(String eis_pers){
		this.eis_pers = eis_pers;
	}

	public void setEis_fix_dt_tm(String eis_fix_dt_tm){
		this.eis_fix_dt_tm = eis_fix_dt_tm;
	}

	public String getChg_dt(){
		return this.chg_dt;
	}

	public String getAset_tot_cnt(){
		return this.aset_tot_cnt;
	}

	public String getEis_fix(){
		return this.eis_fix;
	}

	public String getEis_pers(){
		return this.eis_pers;
	}

	public String getEis_fix_dt_tm(){
		return this.eis_fix_dt_tm;
	}
}

/* �ۼ��ð� : Mon Aug 10 20:45:46 KST 2009 */