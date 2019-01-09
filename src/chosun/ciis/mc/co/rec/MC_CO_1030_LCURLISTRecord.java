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


package chosun.ciis.mc.co.rec;

import java.sql.*;
import chosun.ciis.mc.co.dm.*;
import chosun.ciis.mc.co.ds.*;

/**
 * 
 */


public class MC_CO_1030_LCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String cd;
	public String cdnm;
	public String cd_cdnm;

	public MC_CO_1030_LCURLISTRecord(){}

	public void setCd(String cd){
		this.cd = cd;
	}

	public void setCdnm(String cdnm){
		this.cdnm = cdnm;
	}

	public void setCd_cdnm(String cd_cdnm){
		this.cd_cdnm = cd_cdnm;
	}

	public String getCd(){
		return this.cd;
	}

	public String getCdnm(){
		return this.cdnm;
	}

	public String getCd_cdnm(){
		return this.cd_cdnm;
	}
}

/* 작성시간 : Thu May 14 10:29:00 KST 2009 */