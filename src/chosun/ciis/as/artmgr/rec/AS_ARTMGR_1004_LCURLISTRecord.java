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


package chosun.ciis.as.artmgr.rec;

import java.sql.*;
import chosun.ciis.as.artmgr.dm.*;
import chosun.ciis.as.artmgr.ds.*;

/**
 * 
 */


public class AS_ARTMGR_1004_LCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String cmpy_cd;
	public String art_prod_no;
	public String art_prod_seq;
	public String chg_dt;
	public String chg_remk;

	public AS_ARTMGR_1004_LCURLISTRecord(){}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setArt_prod_no(String art_prod_no){
		this.art_prod_no = art_prod_no;
	}

	public void setArt_prod_seq(String art_prod_seq){
		this.art_prod_seq = art_prod_seq;
	}

	public void setChg_dt(String chg_dt){
		this.chg_dt = chg_dt;
	}

	public void setChg_remk(String chg_remk){
		this.chg_remk = chg_remk;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getArt_prod_no(){
		return this.art_prod_no;
	}

	public String getArt_prod_seq(){
		return this.art_prod_seq;
	}

	public String getChg_dt(){
		return this.chg_dt;
	}

	public String getChg_remk(){
		return this.chg_remk;
	}
}

/* �ۼ��ð� : Mon Mar 09 17:45:53 KST 2009 */