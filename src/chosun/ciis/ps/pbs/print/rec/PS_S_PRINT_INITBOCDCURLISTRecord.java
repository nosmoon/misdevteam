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

public class PS_S_PRINT_INITBOCDCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String bocd;
	public String bonm;
	public String deptcd;
	public String sellnetclsf;

	public PS_S_PRINT_INITBOCDCURLISTRecord(){}

	public void setBocd(String bocd){
		this.bocd = bocd;
	}

	public void setBonm(String bonm){
		this.bonm = bonm;
	}

	public void setDeptcd(String deptcd){
		this.deptcd = deptcd;
	}

	public void setSellnetclsf(String sellnetclsf){
		this.sellnetclsf = sellnetclsf;
	}

	public String getBocd(){
		return this.bocd;
	}

	public String getBonm(){
		return this.bonm;
	}

	public String getDeptcd(){
		return this.deptcd;
	}

	public String getSellnetclsf(){
		return this.sellnetclsf;
	}
}

/* 작성시간 : Wed May 06 11:07:41 KST 2009 */