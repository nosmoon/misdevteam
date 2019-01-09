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


package chosun.ciis.mt.etcimpt.rec;

import java.sql.*;
import chosun.ciis.mt.etcimpt.dm.*;
import chosun.ciis.mt.etcimpt.ds.*;

/**
 * 
 */


public class MT_ETCIMPT_1201_LCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String case_nm;
	public String sub_seq;

	public MT_ETCIMPT_1201_LCURLISTRecord(){}

	public void setCase_nm(String case_nm){
		this.case_nm = case_nm;
	}

	public void setSub_seq(String sub_seq){
		this.sub_seq = sub_seq;
	}

	public String getCase_nm(){
		return this.case_nm;
	}

	public String getSub_seq(){
		return this.sub_seq;
	}
}

/* 작성시간 : Tue May 19 14:21:25 KST 2009 */