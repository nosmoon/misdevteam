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


public class HD_EVLU_5900_LCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String evlu_yy;
	public String tms_clsf;
	public String evlu_pers_emp_no_tms;
	public String evlu_pers_gbn;

	public HD_EVLU_5900_LCURLISTRecord(){}

	public void setEvlu_yy(String evlu_yy){
		this.evlu_yy = evlu_yy;
	}

	public void setTms_clsf(String tms_clsf){
		this.tms_clsf = tms_clsf;
	}

	public void setEvlu_pers_emp_no_tms(String evlu_pers_emp_no_tms){
		this.evlu_pers_emp_no_tms = evlu_pers_emp_no_tms;
	}

	public void setEvlu_pers_gbn(String evlu_pers_gbn){
		this.evlu_pers_gbn = evlu_pers_gbn;
	}

	public String getEvlu_yy(){
		return this.evlu_yy;
	}

	public String getTms_clsf(){
		return this.tms_clsf;
	}

	public String getEvlu_pers_emp_no_tms(){
		return this.evlu_pers_emp_no_tms;
	}

	public String getEvlu_pers_gbn(){
		return this.evlu_pers_gbn;
	}
}

/* �ۼ��ð� : Mon Jun 08 19:55:58 KST 2009 */