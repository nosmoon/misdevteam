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


package chosun.ciis.hd.vaca.rec;

import java.sql.*;
import chosun.ciis.hd.vaca.dm.*;
import chosun.ciis.hd.vaca.ds.*;

/**
 * 
 */


public class HD_VACA_1502_LCURLIST2Record extends java.lang.Object implements java.io.Serializable{

	public String emp_no;
	public String appm_vaca_plan_dt;

	public HD_VACA_1502_LCURLIST2Record(){}

	public void setEmp_no(String emp_no){
		this.emp_no = emp_no;
	}

	public void setAppm_vaca_plan_dt(String appm_vaca_plan_dt){
		this.appm_vaca_plan_dt = appm_vaca_plan_dt;
	}

	public String getEmp_no(){
		return this.emp_no;
	}

	public String getAppm_vaca_plan_dt(){
		return this.appm_vaca_plan_dt;
	}
}

/* �ۼ��ð� : Thu Jul 16 13:26:31 KST 2009 */