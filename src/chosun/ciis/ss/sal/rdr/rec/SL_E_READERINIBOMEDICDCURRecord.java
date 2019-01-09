/***************************************************************************************************
* 파일명 : SL_E_READERINIBOMEDICDCURRecord.java
* 기능 : 독자정보관리(초기화면)
* 작성일자 : 2004-05-20
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
 * 독자정보관리(초기화면)
 *
 */

public class SL_E_READERINIBOMEDICDCURRecord extends java.lang.Object implements java.io.Serializable{

	public String medicd;
	public String cicdnm;
	public String remk;
	public String areanwspyn;
	public int subsuprc;
	public String ciymgbcd;
	public String cicdgb;

	public SL_E_READERINIBOMEDICDCURRecord(){}

	public void setMedicd(String medicd){
		this.medicd = medicd;
	}

	public void setCicdnm(String cicdnm){
		this.cicdnm = cicdnm;
	}

	public void setRemk(String remk){
		this.remk = remk;
	}

	public void setAreanwspyn(String areanwspyn){
		this.areanwspyn = areanwspyn;
	}

	public void setSubsuprc(int subsuprc){
		this.subsuprc = subsuprc;
	}

	public void setCiymgbcd(String ciymgbcd){
		this.ciymgbcd = ciymgbcd;
	}

	public void setCicdgb(String cicdgb){
		this.cicdgb = cicdgb;
	}

	public String getMedicd(){
		return this.medicd;
	}

	public String getCicdnm(){
		return this.cicdnm;
	}

	public String getRemk(){
		return this.remk;
	}

	public String getAreanwspyn(){
		return this.areanwspyn;
	}

	public int getSubsuprc(){
		return this.subsuprc;
	}

	public String getCiymgbcd(){
		return this.ciymgbcd;
	}

	public String getCicdgb(){
		return this.cicdgb;
	}
}

/* 작성시간 : Sun May 30 16:06:43 KST 2004 */