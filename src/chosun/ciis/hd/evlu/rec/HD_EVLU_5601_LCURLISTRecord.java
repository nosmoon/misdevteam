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


package chosun.ciis.hd.evlu.rec;

import java.sql.*;
import chosun.ciis.hd.evlu.dm.*;
import chosun.ciis.hd.evlu.ds.*;

/**
 * 
 */


public class HD_EVLU_5601_LCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String rnum;
	public String evlu_step_clsf;
	public String rfl_ratio;
	public String remk;

	public HD_EVLU_5601_LCURLISTRecord(){}

	public void setRnum(String rnum){
		this.rnum = rnum;
	}

	public void setEvlu_step_clsf(String evlu_step_clsf){
		this.evlu_step_clsf = evlu_step_clsf;
	}

	public void setRfl_ratio(String rfl_ratio){
		this.rfl_ratio = rfl_ratio;
	}

	public void setRemk(String remk){
		this.remk = remk;
	}

	public String getRnum(){
		return this.rnum;
	}

	public String getEvlu_step_clsf(){
		return this.evlu_step_clsf;
	}

	public String getRfl_ratio(){
		return this.rfl_ratio;
	}

	public String getRemk(){
		return this.remk;
	}
}

/* �ۼ��ð� : Fri Jun 05 10:11:41 KST 2009 */