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


package chosun.ciis.mt.etcimpt.rec;

import java.sql.*;
import chosun.ciis.mt.etcimpt.dm.*;
import chosun.ciis.mt.etcimpt.ds.*;

/**
 * 
 */


public class MT_ETCIMPT_1101_LCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String seq;
	public String yy;
	public String cmpy_cd;
	public String leas_clsf;

	public MT_ETCIMPT_1101_LCURLISTRecord(){}

	public void setSeq(String seq){
		this.seq = seq;
	}

	public void setYy(String yy){
		this.yy = yy;
	}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setLeas_clsf(String leas_clsf){
		this.leas_clsf = leas_clsf;
	}

	public String getSeq(){
		return this.seq;
	}

	public String getYy(){
		return this.yy;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getLeas_clsf(){
		return this.leas_clsf;
	}
}

/* �ۼ��ð� : Tue May 19 11:08:52 KST 2009 */