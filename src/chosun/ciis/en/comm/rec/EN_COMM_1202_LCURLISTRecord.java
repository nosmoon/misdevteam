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


package chosun.ciis.en.comm.rec;

import java.sql.*;
import chosun.ciis.en.comm.dm.*;
import chosun.ciis.en.comm.ds.*;

/**
 * 
 */


public class EN_COMM_1202_LCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String evnt_rcpm_unit_clsf;
	public String evnt_rcpm_unit_clsf_nm;

	public EN_COMM_1202_LCURLISTRecord(){}

	public void setEvnt_rcpm_unit_clsf(String evnt_rcpm_unit_clsf){
		this.evnt_rcpm_unit_clsf = evnt_rcpm_unit_clsf;
	}

	public void setEvnt_rcpm_unit_clsf_nm(String evnt_rcpm_unit_clsf_nm){
		this.evnt_rcpm_unit_clsf_nm = evnt_rcpm_unit_clsf_nm;
	}

	public String getEvnt_rcpm_unit_clsf(){
		return this.evnt_rcpm_unit_clsf;
	}

	public String getEvnt_rcpm_unit_clsf_nm(){
		return this.evnt_rcpm_unit_clsf_nm;
	}
}

/* �ۼ��ð� : Fri May 22 09:35:37 KST 2009 */