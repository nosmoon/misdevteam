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


package chosun.ciis.is.agr.rec;

import java.sql.*;
import chosun.ciis.is.agr.dm.*;
import chosun.ciis.is.agr.ds.*;

/**
 * 
 */


public class IS_AGR_2410_LCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String t_no;
	public String indt_cd_nm;
	public String cnt;
	public String qunt_tot;
	public String suply_amt_tot;

	public IS_AGR_2410_LCURLISTRecord(){}

	public void setT_no(String t_no){
		this.t_no = t_no;
	}

	public void setIndt_cd_nm(String indt_cd_nm){
		this.indt_cd_nm = indt_cd_nm;
	}

	public void setCnt(String cnt){
		this.cnt = cnt;
	}

	public void setQunt_tot(String qunt_tot){
		this.qunt_tot = qunt_tot;
	}

	public void setSuply_amt_tot(String suply_amt_tot){
		this.suply_amt_tot = suply_amt_tot;
	}

	public String getT_no(){
		return this.t_no;
	}

	public String getIndt_cd_nm(){
		return this.indt_cd_nm;
	}

	public String getCnt(){
		return this.cnt;
	}

	public String getQunt_tot(){
		return this.qunt_tot;
	}

	public String getSuply_amt_tot(){
		return this.suply_amt_tot;
	}
}

/* �ۼ��ð� : Fri Jun 01 10:40:29 KST 2012 */