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


package chosun.ciis.mc.budg.rec;

import java.sql.*;
import chosun.ciis.mc.budg.dm.*;
import chosun.ciis.mc.budg.ds.*;

/**
 * 
 */


public class MC_BUDG_6034_LCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String exec_no;
	public String clos_yn;
	public String fix_yn;
	public String to_char_incmg_dt_tm;

	public MC_BUDG_6034_LCURLISTRecord(){}

	public void setExec_no(String exec_no){
		this.exec_no = exec_no;
	}

	public void setClos_yn(String clos_yn){
		this.clos_yn = clos_yn;
	}

	public void setFix_yn(String fix_yn){
		this.fix_yn = fix_yn;
	}

	public void setTo_char_incmg_dt_tm(String to_char_incmg_dt_tm){
		this.to_char_incmg_dt_tm = to_char_incmg_dt_tm;
	}

	public String getExec_no(){
		return this.exec_no;
	}

	public String getClos_yn(){
		return this.clos_yn;
	}

	public String getFix_yn(){
		return this.fix_yn;
	}

	public String getTo_char_incmg_dt_tm(){
		return this.to_char_incmg_dt_tm;
	}
}

/* �ۼ��ð� : Tue May 12 11:25:54 KST 2009 */