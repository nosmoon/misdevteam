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


package chosun.ciis.hd.srch.rec;

import java.sql.*;
import chosun.ciis.hd.srch.dm.*;
import chosun.ciis.hd.srch.ds.*;

/**
 * 
 */


public class HD_SRCH_1601_LCURLIST2Record extends java.lang.Object implements java.io.Serializable{

	public String offi_nm;
	public String in_cmpy_dt;
	public String lvcmpy_dt;
	public String lvcmpy_resn;
	public String duty_yydd;

	public HD_SRCH_1601_LCURLIST2Record(){}

	public void setOffi_nm(String offi_nm){
		this.offi_nm = offi_nm;
	}

	public void setIn_cmpy_dt(String in_cmpy_dt){
		this.in_cmpy_dt = in_cmpy_dt;
	}

	public void setLvcmpy_dt(String lvcmpy_dt){
		this.lvcmpy_dt = lvcmpy_dt;
	}

	public void setLvcmpy_resn(String lvcmpy_resn){
		this.lvcmpy_resn = lvcmpy_resn;
	}

	public void setDuty_yydd(String duty_yydd){
		this.duty_yydd = duty_yydd;
	}

	public String getOffi_nm(){
		return this.offi_nm;
	}

	public String getIn_cmpy_dt(){
		return this.in_cmpy_dt;
	}

	public String getLvcmpy_dt(){
		return this.lvcmpy_dt;
	}

	public String getLvcmpy_resn(){
		return this.lvcmpy_resn;
	}

	public String getDuty_yydd(){
		return this.duty_yydd;
	}
}

/* �ۼ��ð� : Thu Oct 08 18:16:01 KST 2009 */