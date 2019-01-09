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


public class HD_AFFR_6013_LCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String rptv_posi_cd;

	public HD_AFFR_6013_LCURLISTRecord(){}

	public void setRptv_posi_cd(String rptv_posi_cd){
		this.rptv_posi_cd = rptv_posi_cd;
	}

	public String getRptv_posi_cd(){
		return this.rptv_posi_cd;
	}
}

/* 작성시간 : Fri Jul 10 17:23:40 KST 2009 */