/***************************************************************************************************
* 파일명 : SL_L_MOVM_RDR_CNFM_INITADDRCDCURRecord.java
* 기능 : 독자-이사독자관리(인수)-초기화면 주주소코드,코드명 목록을 위한 Record 
* 작성일자 : 2004-01-14
* 작성자 : 김영윤
***************************************************************************************************/
/***************************************************************************************************
* 수정내역 :
* 수정자 :
* 수정일자 :
* 백업 : 
***************************************************************************************************/

package chosun.ciis.ss.sal.rdr.rec;

import java.sql.*;
import chosun.ciis.ss.sal.rdr.dm.*;
import chosun.ciis.ss.sal.rdr.ds.*;

/**
 * 독자-이사독자관리(인수)-초기화면 주주소코드,코드명 목록을 위한 Record 
 */

public class SL_L_MOVM_RDR_CNFM_INITADDRCDCURRecord extends java.lang.Object implements java.io.Serializable{

	public String addrcd;
	public String addrnm;
	public String resitypecd;

	public SL_L_MOVM_RDR_CNFM_INITADDRCDCURRecord(){}

	public void setAddrcd(String addrcd){
		this.addrcd = addrcd;
	}

	public void setAddrnm(String addrnm){
		this.addrnm = addrnm;
	}

	public void setResitypecd(String resitypecd){
		this.resitypecd = resitypecd;
	}

	public String getAddrcd(){
		return this.addrcd;
	}

	public String getAddrnm(){
		return this.addrnm;
	}

	public String getResitypecd(){
		return this.resitypecd;
	}
}

/* 작성시간 : Sun Jan 18 20:09:16 KST 2004 */