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


public class MT_SUBMATROUT_1116_LCURLIST3Record extends java.lang.Object implements java.io.Serializable{

	public String matr_cd;
	public String medi_cd;
	public String sect_cd;
	public String qunt;

	public MT_SUBMATROUT_1116_LCURLIST3Record(){}

	public void setMatr_cd(String matr_cd){
		this.matr_cd = matr_cd;
	}

	public void setMedi_cd(String medi_cd){
		this.medi_cd = medi_cd;
	}

	public void setSect_cd(String sect_cd){
		this.sect_cd = sect_cd;
	}

	public void setQunt(String qunt){
		this.qunt = qunt;
	}

	public String getMatr_cd(){
		return this.matr_cd;
	}

	public String getMedi_cd(){
		return this.medi_cd;
	}

	public String getSect_cd(){
		return this.sect_cd;
	}

	public String getQunt(){
		return this.qunt;
	}
}

/* �ۼ��ð� : Fri Aug 21 16:04:33 KST 2009 */