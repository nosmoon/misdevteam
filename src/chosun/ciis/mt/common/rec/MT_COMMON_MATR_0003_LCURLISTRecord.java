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


package chosun.ciis.mt.common.rec;

import java.sql.*;
import chosun.ciis.mt.common.dm.*;
import chosun.ciis.mt.common.ds.*;

/**
 * 
 */


public class MT_COMMON_MATR_0003_LCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String matr_cd;
	public String ern;
	public String matr_nm;
	public String dlco_nm;
	public String dlco_no;

	public MT_COMMON_MATR_0003_LCURLISTRecord(){}

	public void setMatr_cd(String matr_cd){
		this.matr_cd = matr_cd;
	}

	public void setErn(String ern){
		this.ern = ern;
	}

	public void setMatr_nm(String matr_nm){
		this.matr_nm = matr_nm;
	}

	public void setDlco_nm(String dlco_nm){
		this.dlco_nm = dlco_nm;
	}

	public void setDlco_no(String dlco_no){
		this.dlco_no = dlco_no;
	}

	public String getMatr_cd(){
		return this.matr_cd;
	}

	public String getErn(){
		return this.ern;
	}

	public String getMatr_nm(){
		return this.matr_nm;
	}

	public String getDlco_nm(){
		return this.dlco_nm;
	}

	public String getDlco_no(){
		return this.dlco_no;
	}
}

/* �ۼ��ð� : Wed Sep 02 16:31:38 KST 2009 */