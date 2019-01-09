/***************************************************************************************************
* 파일명   : PS_S_PRINT_INIT.java
* 기능     : 출력 - 초기 화면
* 작성일자 : 2006-02-01
* 작성자   : 전현표 
***************************************************************************************************/
/***************************************************************************************************
* 수정내역 :
* 수정자   :
* 수정일자 :   
* 백업     :   
***************************************************************************************************/


package chosun.ciis.ps.pbs.print.rec;

import java.sql.*;
import chosun.ciis.ps.pbs.print.dm.*;
import chosun.ciis.ps.pbs.print.ds.*;

/**
 * 출력 - 초기 화면
 *
 */

public class PS_S_PRINT_INITMEDICDLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String cicodeval;
	public String cicdnm;
	public String cicdynm;
	public String ciymgbcd;
	public String cicdgb;

	public PS_S_PRINT_INITMEDICDLISTRecord(){}

	public void setCicodeval(String cicodeval){
		this.cicodeval = cicodeval;
	}

	public void setCicdnm(String cicdnm){
		this.cicdnm = cicdnm;
	}

	public void setCicdynm(String cicdynm){
		this.cicdynm = cicdynm;
	}

	public void setCiymgbcd(String ciymgbcd){
		this.ciymgbcd = ciymgbcd;
	}

	public void setCicdgb(String cicdgb){
		this.cicdgb = cicdgb;
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

	public String getCiymgbcd(){
		return this.ciymgbcd;
	}

	public String getCicdgb(){
		return this.cicdgb;
	}
}

/* 작성시간 : Wed May 06 11:07:41 KST 2009 */