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


package chosun.ciis.as.com.rec;

import java.sql.*;
import chosun.ciis.as.com.dm.*;
import chosun.ciis.as.com.ds.*;

/**
 * 
 */


public class AS_COM_1100_LCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String dlco_no;
	public String dlco_clsf_cd;

	public AS_COM_1100_LCURLISTRecord(){}

	public void setDlco_no(String dlco_no){
		this.dlco_no = dlco_no;
	}

	public void setDlco_clsf_cd(String dlco_clsf_cd){
		this.dlco_clsf_cd = dlco_clsf_cd;
	}

	public String getDlco_no(){
		return this.dlco_no;
	}

	public String getDlco_clsf_cd(){
		return this.dlco_clsf_cd;
	}
}

/* 작성시간 : Wed Mar 04 10:44:08 KST 2009 */