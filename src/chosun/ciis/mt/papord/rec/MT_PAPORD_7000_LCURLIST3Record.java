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


package chosun.ciis.mt.papord.rec;

import java.sql.*;
import chosun.ciis.mt.papord.dm.*;
import chosun.ciis.mt.papord.ds.*;

/**
 * 
 */


public class MT_PAPORD_7000_LCURLIST3Record extends java.lang.Object implements java.io.Serializable{

	public String fac_clsf;
	public String matr_nm;
	public String roll_wgt;

	public MT_PAPORD_7000_LCURLIST3Record(){}

	public void setFac_clsf(String fac_clsf){
		this.fac_clsf = fac_clsf;
	}

	public void setMatr_nm(String matr_nm){
		this.matr_nm = matr_nm;
	}

	public void setRoll_wgt(String roll_wgt){
		this.roll_wgt = roll_wgt;
	}

	public String getFac_clsf(){
		return this.fac_clsf;
	}

	public String getMatr_nm(){
		return this.matr_nm;
	}

	public String getRoll_wgt(){
		return this.roll_wgt;
	}
}

/* �ۼ��ð� : Wed Nov 25 10:58:57 KST 2009 */