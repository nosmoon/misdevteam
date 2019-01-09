/***************************************************************************************************
* 파일명 : SP_PS_S_MEDI_UPRC.java
* 기능 :   코드관리-매체단가관리 초기화면
* 작성일자 : 2004-02-20
* 작성자 : 김건호 
***************************************************************************************************/
/***************************************************************************************************
* 수정내역 :
* 수정자 :
* 수정일자 : 
* 백업 :  
***************************************************************************************************/


package chosun.ciis.ps.pbs.code.rec;

import java.sql.*;
import chosun.ciis.ps.pbs.code.dm.*;
import chosun.ciis.ps.pbs.code.ds.*;

/**
 * 코드관리-매체단가관리 초기화면
 *
 */


public class PS_S_MEDI_UPRCMEDICDCURRecord extends java.lang.Object implements java.io.Serializable{

	public String ciymgbcd;
	public String cicdgb;
	public String cicodeval;
	public String cicdnm;
	public String cicdynm;

	public PS_S_MEDI_UPRCMEDICDCURRecord(){}

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

/* 작성시간 : Fri Feb 20 10:26:59 KST 2004 */