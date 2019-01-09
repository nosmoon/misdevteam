/***************************************************************************************************
 * 파일명   : PS_S_SEPBK_INFODM.java
 * 기능     : 코드-단행본 등록 상세내역
 * 작성일자 : 2004-09-21
 * 작성자   : 김상옥
 **************************************************************************************************/
 /**************************************************************************************************
 * 수정내역 :
 * 수정자   :
 * 수정일자 :
 * 백업     : 
 **************************************************************************************************/



package chosun.ciis.ps.pbs.code.rec;

import java.sql.*;
import chosun.ciis.ps.pbs.code.dm.*;
import chosun.ciis.ps.pbs.code.ds.*;

/**
 * 코드-단행본 등록 상세내역
 */

public class PS_S_SEPBK_INFOABSENCEYNCURRecord extends java.lang.Object implements java.io.Serializable{

	public String ciymgbcd;
	public String cicdgb;
	public String cicodeval;
	public String cicdnm;
	public String cicdynm;

	public PS_S_SEPBK_INFOABSENCEYNCURRecord(){}

	public void setCiymgbcd(String ciymgbcd){
		this.ciymgbcd = ciymgbcd;
	}

	public void setCicdgb(String cicdgb){
		this.cicdgb = cicdgb;
	}

	public void setCicodeval(String cicodeval){
		this.cicodeval = cicodeval;
	}

	public void setCicdnm(String cicdnm){
		this.cicdnm = cicdnm;
	}

	public void setCicdynm(String cicdynm){
		this.cicdynm = cicdynm;
	}

	public String getCiymgbcd(){
		return this.ciymgbcd;
	}

	public String getCicdgb(){
		return this.cicdgb;
	}

	public String getCicodeval(){
		return this.cicodeval;
	}

	public String getCicdnm(){
		return this.cicdnm;
	}

	public String getCicdynm(){
		return this.cicdynm;
	}
}

/* 작성시간 : Mon Jan 31 14:22:14 KST 2005 */