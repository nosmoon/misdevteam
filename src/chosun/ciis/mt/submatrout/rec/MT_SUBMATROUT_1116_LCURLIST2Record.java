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


public class MT_SUBMATROUT_1116_LCURLIST2Record extends java.lang.Object implements java.io.Serializable{

	public String matr_cd;
	public String matr_nm;

	public MT_SUBMATROUT_1116_LCURLIST2Record(){}

	public void setMatr_cd(String matr_cd){
		this.matr_cd = matr_cd;
	}

	public void setMatr_nm(String matr_nm){
		this.matr_nm = matr_nm;
	}

	public String getMatr_cd(){
		return this.matr_cd;
	}

	public String getMatr_nm(){
		return this.matr_nm;
	}
}

/* �ۼ��ð� : Fri Aug 21 16:04:33 KST 2009 */