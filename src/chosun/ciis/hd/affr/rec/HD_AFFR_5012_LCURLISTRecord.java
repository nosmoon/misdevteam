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


package chosun.ciis.hd.affr.rec;

import java.sql.*;
import chosun.ciis.hd.affr.dm.*;
import chosun.ciis.hd.affr.ds.*;

/**
 * 
 */


public class HD_AFFR_5012_LCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String nm_engl;
	public String email_id;
	public String ptph_no;

	public HD_AFFR_5012_LCURLISTRecord(){}

	public void setNm_engl(String nm_engl){
		this.nm_engl = nm_engl;
	}

	public void setEmail_id(String email_id){
		this.email_id = email_id;
	}

	public void setPtph_no(String ptph_no){
		this.ptph_no = ptph_no;
	}

	public String getNm_engl(){
		return this.nm_engl;
	}

	public String getEmail_id(){
		return this.email_id;
	}

	public String getPtph_no(){
		return this.ptph_no;
	}
}

/* 작성시간 : Thu Jul 02 14:46:44 KST 2009 */