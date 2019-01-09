/***************************************************************************************************
* 파일명 : SL_L_BOMEDICURCOMMLISTRecord.java
* 기능 : 지국취급매체 목록조회
* 작성일자 : 2003-12-27
* 작성자 : 김영윤
***************************************************************************************************/
/***************************************************************************************************
* 수정내역 :
* 수정자 :
* 수정일자 :
* 백업 :
***************************************************************************************************/


package chosun.ciis.ss.sal.common.rec;

import java.sql.*;
import chosun.ciis.ss.sal.common.dm.*;
import chosun.ciis.ss.sal.common.ds.*;

/**
 * 지국취급매체 목록
 *
 */
public class SL_L_BOMEDICURCOMMLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String medicd;
	public String cicdnm;
	public String cimgtcd2;
	public int subsuprc;

	public SL_L_BOMEDICURCOMMLISTRecord(){}

	public void setMedicd(String medicd){
		this.medicd = medicd;
	}

	public void setCicdnm(String cicdnm){
		this.cicdnm = cicdnm;
	}

	public void setCimgtcd2(String cimgtcd2){
		this.cimgtcd2 = cimgtcd2;
	}

	public void setSubsuprc(int subsuprc){
		this.subsuprc = subsuprc;
	}

	public String getMedicd(){
		return this.medicd;
	}

	public String getCicdnm(){
		return this.cicdnm;
	}

	public String getCimgtcd2(){
		return this.cimgtcd2;
	}

	public int getSubsuprc(){
		return this.subsuprc;
	}
}

/* 작성시간 : Mon Dec 29 14:35:59 KST 2003 */