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


public class MT_PAPINOUT_2216_LCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String matr_cd;
	public String roll_wgt;

	public MT_PAPINOUT_2216_LCURLISTRecord(){}

	public void setMatr_cd(String matr_cd){
		this.matr_cd = matr_cd;
	}

	public void setRoll_wgt(String roll_wgt){
		this.roll_wgt = roll_wgt;
	}

	public String getMatr_cd(){
		return this.matr_cd;
	}

	public String getRoll_wgt(){
		return this.roll_wgt;
	}
}

/* �ۼ��ð� : Fri May 01 09:27:43 KST 2009 */