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


package chosun.ciis.sp.sal.rec;

import java.sql.*;
import chosun.ciis.sp.sal.dm.*;
import chosun.ciis.sp.sal.ds.*;

/**
 * 
 */


public class SP_SAL_2720_LCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String dlco_nm;
	public String adms_dstc_cd_nm;
	public String stot_amt;

	public SP_SAL_2720_LCURLISTRecord(){}

	public void setDlco_nm(String dlco_nm){
		this.dlco_nm = dlco_nm;
	}

	public void setAdms_dstc_cd_nm(String adms_dstc_cd_nm){
		this.adms_dstc_cd_nm = adms_dstc_cd_nm;
	}

	public void setStot_amt(String stot_amt){
		this.stot_amt = stot_amt;
	}

	public String getDlco_nm(){
		return this.dlco_nm;
	}

	public String getAdms_dstc_cd_nm(){
		return this.adms_dstc_cd_nm;
	}

	public String getStot_amt(){
		return this.stot_amt;
	}
}

/* �ۼ��ð� : Tue Aug 21 20:49:34 KST 2012 */