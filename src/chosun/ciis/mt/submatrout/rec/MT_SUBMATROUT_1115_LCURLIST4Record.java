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


package chosun.ciis.mt.submatrout.rec;

import java.sql.*;
import chosun.ciis.mt.submatrout.dm.*;
import chosun.ciis.mt.submatrout.ds.*;

/**
 * 
 */


public class MT_SUBMATROUT_1115_LCURLIST4Record extends java.lang.Object implements java.io.Serializable{

	public String matr_clsf;
	public String matr_clsf_nm;
	public String matr_cd;
	public String matr_nm;

	public MT_SUBMATROUT_1115_LCURLIST4Record(){}

	public void setMatr_clsf(String matr_clsf){
		this.matr_clsf = matr_clsf;
	}

	public void setMatr_clsf_nm(String matr_clsf_nm){
		this.matr_clsf_nm = matr_clsf_nm;
	}

	public void setMatr_cd(String matr_cd){
		this.matr_cd = matr_cd;
	}

	public void setMatr_nm(String matr_nm){
		this.matr_nm = matr_nm;
	}

	public String getMatr_clsf(){
		return this.matr_clsf;
	}

	public String getMatr_clsf_nm(){
		return this.matr_clsf_nm;
	}

	public String getMatr_cd(){
		return this.matr_cd;
	}

	public String getMatr_nm(){
		return this.matr_nm;
	}
}

/* �ۼ��ð� : Thu Aug 20 17:46:57 KST 2009 */