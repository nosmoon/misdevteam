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


public class MT_SUBMATROUT_1500_LCURLIST3Record extends java.lang.Object implements java.io.Serializable{

	public String owh_dt;
	public String fac_clsf;
	public String fac_clsf_nm;
	public String qunt;

	public MT_SUBMATROUT_1500_LCURLIST3Record(){}

	public void setOwh_dt(String owh_dt){
		this.owh_dt = owh_dt;
	}

	public void setFac_clsf(String fac_clsf){
		this.fac_clsf = fac_clsf;
	}

	public void setFac_clsf_nm(String fac_clsf_nm){
		this.fac_clsf_nm = fac_clsf_nm;
	}

	public void setQunt(String qunt){
		this.qunt = qunt;
	}

	public String getOwh_dt(){
		return this.owh_dt;
	}

	public String getFac_clsf(){
		return this.fac_clsf;
	}

	public String getFac_clsf_nm(){
		return this.fac_clsf_nm;
	}

	public String getQunt(){
		return this.qunt;
	}
}

/* �ۼ��ð� : Tue Oct 06 18:33:37 KST 2009 */