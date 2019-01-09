/***************************************************************************************************
* 파일명 : SE_COMM_1100_MCURLISTRecord.java
* 기능 :  지국정보 조회 팝업
* 작성일자 : 2009.03.03
* 작성자 :   김대준
***************************************************************************************************/
/***************************************************************************************************
* 수정내역 :
* 수정자 :
* 수정일자 :
* 백업 : 
***************************************************************************************************/


package chosun.ciis.se.comm.rec;

import java.sql.*;
import chosun.ciis.se.comm.dm.*;
import chosun.ciis.se.comm.ds.*;

/**
 * 
 */


public class SE_COMM_1100_MCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String cd		;
	public String cdnm		;
	public String cd_abrv_nm;
	
	public SE_COMM_1100_MCURLISTRecord(){}

	public String getCd() {
		return cd;
	}

	public void setCd(String cd) {
		this.cd = cd;
	}

	public String getCd_abrv_nm() {
		return cd_abrv_nm;
	}

	public void setCd_abrv_nm(String cd_abrv_nm) {
		this.cd_abrv_nm = cd_abrv_nm;
	}

	public String getCdnm() {
		return cdnm;
	}

	public void setCdnm(String cdnm) {
		this.cdnm = cdnm;
	}

	
}

/* 작성시간 : Tue Mar 03 17:43:55 KST 2009 */