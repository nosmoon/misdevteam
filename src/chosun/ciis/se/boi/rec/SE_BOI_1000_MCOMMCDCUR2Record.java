/***************************************************************************************************
* 파일명 : .java
* 기능 : 판매시스템
* 작성일자 : 2009-02-18
* 작성자 : 배창희
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


public class SE_BOI_1000_MCOMMCDCUR2Record extends java.lang.Object implements java.io.Serializable{

	public String cd;
	public String cdnm;
	public String chrg_pers;
	public String chrg_persnm;

	public SE_BOI_1000_MCOMMCDCUR2Record(){}

	public void setCd(String cd){
		this.cd = cd;
	}

	public void setCdnm(String cdnm){
		this.cdnm = cdnm;
	}

	public void setChrg_pers(String chrg_pers){
		this.chrg_pers = chrg_pers;
	}

	public void setChrg_persnm(String chrg_persnm){
		this.chrg_persnm = chrg_persnm;
	}

	public String getCd(){
		return this.cd;
	}

	public String getCdnm(){
		return this.cdnm;
	}

	public String getChrg_pers(){
		return this.chrg_pers;
	}

	public String getChrg_persnm(){
		return this.chrg_persnm;
	}
}

/* 작성시간 : Thu Jun 11 11:52:04 KST 2009 */