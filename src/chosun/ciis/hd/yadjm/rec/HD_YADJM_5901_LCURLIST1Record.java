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


package chosun.ciis.hd.yadjm.rec;

import java.sql.*;
import chosun.ciis.hd.yadjm.dm.*;
import chosun.ciis.hd.yadjm.ds.*;

/**
 * 
 */


public class HD_YADJM_5901_LCURLIST1Record extends java.lang.Object implements java.io.Serializable{

	public String emp_no;
	public String faml_seq;
	public String obcl_pers_clsf;

	public HD_YADJM_5901_LCURLIST1Record(){}

	public void setEmp_no(String emp_no){
		this.emp_no = emp_no;
	}

	public void setFaml_seq(String faml_seq){
		this.faml_seq = faml_seq;
	}

	public void setObcl_pers_clsf(String obcl_pers_clsf){
		this.obcl_pers_clsf = obcl_pers_clsf;
	}

	public String getEmp_no(){
		return this.emp_no;
	}

	public String getFaml_seq(){
		return this.faml_seq;
	}

	public String getObcl_pers_clsf(){
		return this.obcl_pers_clsf;
	}
}

/* �ۼ��ð� : Wed Jan 22 17:46:04 KST 2014 */