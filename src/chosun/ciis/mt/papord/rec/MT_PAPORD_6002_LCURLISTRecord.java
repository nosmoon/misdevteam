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


public class MT_PAPORD_6002_LCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String cmpy_cd;
	public String papcmpy_cd;
	public String papcmpy_nm;
	public double ordr_ratio;
	public double ordr_wgt;
	public double sum_ratio;

	public MT_PAPORD_6002_LCURLISTRecord(){}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setPapcmpy_cd(String papcmpy_cd){
		this.papcmpy_cd = papcmpy_cd;
	}

	public void setPapcmpy_nm(String papcmpy_nm){
		this.papcmpy_nm = papcmpy_nm;
	}

	public void setOrdr_ratio(double ordr_ratio){
		this.ordr_ratio = ordr_ratio;
	}

	public void setOrdr_wgt(double ordr_wgt){
		this.ordr_wgt = ordr_wgt;
	}

	public void setSum_ratio(double sum_ratio){
		this.sum_ratio = sum_ratio;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getPapcmpy_cd(){
		return this.papcmpy_cd;
	}

	public String getPapcmpy_nm(){
		return this.papcmpy_nm;
	}

	public double getOrdr_ratio(){
		return this.ordr_ratio;
	}

	public double getOrdr_wgt(){
		return this.ordr_wgt;
	}

	public double getSum_ratio(){
		return this.sum_ratio;
	}
}

/* �ۼ��ð� : Thu Apr 16 22:42:19 KST 2009 */