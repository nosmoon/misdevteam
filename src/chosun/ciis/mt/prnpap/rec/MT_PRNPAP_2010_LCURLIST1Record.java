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


package chosun.ciis.mt.prnpap.rec;

import java.sql.*;
import chosun.ciis.mt.prnpap.dm.*;
import chosun.ciis.mt.prnpap.ds.*;

/**
 * 
 */


public class MT_PRNPAP_2010_LCURLIST1Record extends java.lang.Object implements java.io.Serializable{

	public String real_matr_clsf;
	public String matr_clsf;

	public MT_PRNPAP_2010_LCURLIST1Record(){}

	public void setReal_matr_clsf(String real_matr_clsf){
		this.real_matr_clsf = real_matr_clsf;
	}

	public void setMatr_clsf(String matr_clsf){
		this.matr_clsf = matr_clsf;
	}

	public String getReal_matr_clsf(){
		return this.real_matr_clsf;
	}

	public String getMatr_clsf(){
		return this.matr_clsf;
	}
}

/* �ۼ��ð� : Sat May 23 18:00:58 KST 2009 */