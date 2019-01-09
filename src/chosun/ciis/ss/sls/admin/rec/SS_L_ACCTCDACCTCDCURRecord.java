/***************************************************************************************************
* 파일명 : SS_L_ACCTCDACCTCDCURRecord.java
* 기능 : 관리자-계정코드-목록을 위한 Record
* 작성일자 : 2004-04-24
* 작성자 : 김대섭
***************************************************************************************************/
/***************************************************************************************************
* 수정내역 :
* 수정자 :
* 수정일자 :
* 백업 : 
***************************************************************************************************/


package chosun.ciis.ss.sls.admin.rec;

import java.sql.*;
import chosun.ciis.ss.sls.admin.dm.*;
import chosun.ciis.ss.sls.admin.ds.*;

/**
 * 관리자-계정코드-목록을 위한 Record
 */


public class SS_L_ACCTCDACCTCDCURRecord extends java.lang.Object implements java.io.Serializable{

	public String acctcd;
	public String acctnm;
	public String imptexpnclsf;
	public String leaf_inyn;
	public String empadvyn;

	public SS_L_ACCTCDACCTCDCURRecord(){}

	public void setAcctcd(String acctcd){
		this.acctcd = acctcd;
	}

	public void setAcctnm(String acctnm){
		this.acctnm = acctnm;
	}

	public void setImptexpnclsf(String imptexpnclsf){
		this.imptexpnclsf = imptexpnclsf;
	}

	public void setLeaf_inyn(String leaf_inyn){
		this.leaf_inyn = leaf_inyn;
	}

	public void setEmpadvyn(String empadvyn){
		this.empadvyn = empadvyn;
	}

	public String getAcctcd(){
		return this.acctcd;
	}

	public String getAcctnm(){
		return this.acctnm;
	}

	public String getImptexpnclsf(){
		return this.imptexpnclsf;
	}

	public String getLeaf_inyn(){
		return this.leaf_inyn;
	}

	public String getEmpadvyn(){
		return this.empadvyn;
	}
}

/* 작성시간 : Sat Jul 03 17:32:28 KST 2004 */