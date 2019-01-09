/***************************************************************************************************
* 파일명 : .java
* 기능 : 독자우대-구독신청
* 작성일자 : 2007-05-22
* 작성자 : 김대섭
***************************************************************************************************/
/***************************************************************************************************
* 수정내역 :
* 수정자 :
* 수정일자 :
* 백업 : 
***************************************************************************************************/


package chosun.ciis.mc.budg.rec;

import java.sql.*;
import chosun.ciis.mc.budg.dm.*;
import chosun.ciis.mc.budg.ds.*;

/**
 * 
 */


public class MC_BUDG_6020_MCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String exec_no;
	public String clos_yn;
	public String fix_yn;
	public String to_char_date;

	public MC_BUDG_6020_MCURLISTRecord(){}

	public void setExec_no(String exec_no){
		this.exec_no = exec_no;
	}

	public void setClos_yn(String clos_yn){
		this.clos_yn = clos_yn;
	}

	public void setFix_yn(String fix_yn){
		this.fix_yn = fix_yn;
	}

	public void setTo_char_date(String to_char_date){
		this.to_char_date = to_char_date;
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

	public String getTo_char_date(){
		return this.to_char_date;
	}
}

/* 작성시간 : Thu May 14 09:42:36 KST 2009 */