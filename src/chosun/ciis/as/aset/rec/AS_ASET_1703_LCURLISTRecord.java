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


public class AS_ASET_1703_LCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String dlco_clsf_cd;
	public String dlco_ern;
	public String dlco_nm;
	public String misu_amt;

	public AS_ASET_1703_LCURLISTRecord(){}

	public void setDlco_clsf_cd(String dlco_clsf_cd){
		this.dlco_clsf_cd = dlco_clsf_cd;
	}

	public void setDlco_ern(String dlco_ern){
		this.dlco_ern = dlco_ern;
	}

	public void setDlco_nm(String dlco_nm){
		this.dlco_nm = dlco_nm;
	}

	public void setMisu_amt(String misu_amt){
		this.misu_amt = misu_amt;
	}

	public String getDlco_clsf_cd(){
		return this.dlco_clsf_cd;
	}

	public String getDlco_ern(){
		return this.dlco_ern;
	}

	public String getDlco_nm(){
		return this.dlco_nm;
	}

	public String getMisu_amt(){
		return this.misu_amt;
	}
}

/* �ۼ��ð� : Tue Mar 31 20:44:10 KST 2009 */