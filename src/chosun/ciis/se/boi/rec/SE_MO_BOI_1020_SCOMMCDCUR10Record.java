/***************************************************************************************************
* 파일명 : SE_MO_BOI_1020_SCOMMCDCUR10Record.java_모바일용
* 기능 : 센터관리-센터정보관리-상세
* 작성일자 : 2017-04-13
* 작성자 : 장선희
***************************************************************************************************/
/***************************************************************************************************
* 수정내역 :
* 수정자 :
* 수정일자 :
* 백업 :
***************************************************************************************************/


package chosun.ciis.se.boi.rec;

import java.sql.*;
import chosun.ciis.se.boi.dm.*;
import chosun.ciis.se.boi.ds.*;

/**
 *
 */


public class SE_MO_BOI_1020_SCOMMCDCUR10Record extends java.lang.Object implements java.io.Serializable{

	public String cd;
	public String cdnm;
	public String cd_abrv_nm;

	public SE_MO_BOI_1020_SCOMMCDCUR10Record(){}

	public void setCd(String cd){
		this.cd = cd;
	}

	public void setCdnm(String cdnm){
		this.cdnm = cdnm;
	}

	public void setCd_abrv_nm(String cd_abrv_nm){
		this.cd_abrv_nm = cd_abrv_nm;
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
}

/* 작성시간 : Thu Apr 13 17:05:09 KST 2017 */