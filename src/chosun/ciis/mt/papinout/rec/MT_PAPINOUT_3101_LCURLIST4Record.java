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


public class MT_PAPINOUT_3101_LCURLIST4Record extends java.lang.Object implements java.io.Serializable{

	public String medi_cd;
	public String sect_cd;
	public String matr_cd;
	public String use_qunt;
	public String roll;

	public MT_PAPINOUT_3101_LCURLIST4Record(){}

	public void setMedi_cd(String medi_cd){
		this.medi_cd = medi_cd;
	}

	public void setSect_cd(String sect_cd){
		this.sect_cd = sect_cd;
	}

	public void setMatr_cd(String matr_cd){
		this.matr_cd = matr_cd;
	}

	public void setUse_qunt(String use_qunt){
		this.use_qunt = use_qunt;
	}

	public void setRoll(String roll){
		this.roll = roll;
	}

	public String getMedi_cd(){
		return this.medi_cd;
	}

	public String getSect_cd(){
		return this.sect_cd;
	}

	public String getMatr_cd(){
		return this.matr_cd;
	}

	public String getUse_qunt(){
		return this.use_qunt;
	}

	public String getRoll(){
		return this.roll;
	}
}

/* �ۼ��ð� : Tue Nov 03 00:45:43 KST 2009 */