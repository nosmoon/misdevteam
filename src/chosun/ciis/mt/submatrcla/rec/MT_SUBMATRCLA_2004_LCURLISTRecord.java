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


package chosun.ciis.mt.submatrcla.rec;

import java.sql.*;
import chosun.ciis.mt.submatrcla.dm.*;
import chosun.ciis.mt.submatrcla.ds.*;

/**
 * 
 */


public class MT_SUBMATRCLA_2004_LCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String matr_nm;
	public String std_modl;
	public String purc_uprc;
	public String unit;

	public MT_SUBMATRCLA_2004_LCURLISTRecord(){}

	public void setMatr_nm(String matr_nm){
		this.matr_nm = matr_nm;
	}

	public void setStd_modl(String std_modl){
		this.std_modl = std_modl;
	}

	public void setPurc_uprc(String purc_uprc){
		this.purc_uprc = purc_uprc;
	}

	public void setUnit(String unit){
		this.unit = unit;
	}

	public String getMatr_nm(){
		return this.matr_nm;
	}

	public String getStd_modl(){
		return this.std_modl;
	}

	public String getPurc_uprc(){
		return this.purc_uprc;
	}

	public String getUnit(){
		return this.unit;
	}
}

/* �ۼ��ð� : Wed Jul 08 20:48:59 KST 2009 */