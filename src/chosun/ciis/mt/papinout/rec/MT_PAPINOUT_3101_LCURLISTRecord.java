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


package chosun.ciis.mt.papinout.rec;

import java.sql.*;
import chosun.ciis.mt.papinout.dm.*;
import chosun.ciis.mt.papinout.ds.*;

/**
 * 
 */


public class MT_PAPINOUT_3101_LCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String matr_cd;
	public String matr_nm;
	public String paper_clsf_cd;
	public String grp;

	public MT_PAPINOUT_3101_LCURLISTRecord(){}

	public void setMatr_cd(String matr_cd){
		this.matr_cd = matr_cd;
	}

	public void setMatr_nm(String matr_nm){
		this.matr_nm = matr_nm;
	}

	public void setPaper_clsf_cd(String paper_clsf_cd){
		this.paper_clsf_cd = paper_clsf_cd;
	}

	public void setGrp(String grp){
		this.grp = grp;
	}

	public String getMatr_cd(){
		return this.matr_cd;
	}

	public String getMatr_nm(){
		return this.matr_nm;
	}

	public String getPaper_clsf_cd(){
		return this.paper_clsf_cd;
	}

	public String getGrp(){
		return this.grp;
	}
}

/* �ۼ��ð� : Tue Nov 03 00:45:43 KST 2009 */