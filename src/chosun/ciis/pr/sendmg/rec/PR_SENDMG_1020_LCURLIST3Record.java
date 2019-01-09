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


package chosun.ciis.pr.sendmg.rec;

import java.sql.*;
import chosun.ciis.pr.sendmg.dm.*;
import chosun.ciis.pr.sendmg.ds.*;

/**
 * 
 */


public class PR_SENDMG_1020_LCURLIST3Record extends java.lang.Object implements java.io.Serializable{

	public String cd;
	public String cdnm;
	public String cd_abrv_nm;
	public String cd_abrv_cdnm;

	public PR_SENDMG_1020_LCURLIST3Record(){}

	public void setCd(String cd){
		this.cd = cd;
	}

	public void setCdnm(String cdnm){
		this.cdnm = cdnm;
	}

	public void setCd_abrv_nm(String cd_abrv_nm){
		this.cd_abrv_nm = cd_abrv_nm;
	}

	public void setCd_abrv_cdnm(String cd_abrv_cdnm){
		this.cd_abrv_cdnm = cd_abrv_cdnm;
	}

	public String getCd(){
		return this.cd;
	}

	public String getCdnm(){
		return this.cdnm;
	}

	public String getCd_abrv_nm(){
		return this.cd_abrv_nm;
	}

	public String getCd_abrv_cdnm(){
		return this.cd_abrv_cdnm;
	}
}

/* 작성시간 : Thu Jun 18 17:41:50 KST 2009 */