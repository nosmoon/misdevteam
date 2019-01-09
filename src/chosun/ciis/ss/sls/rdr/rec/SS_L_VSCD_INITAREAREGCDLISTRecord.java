/***************************************************************************************************
* 파일명 : SS_L_VSCD_INITAREAREGCDLISTRecord.java
* 기능 : 독자현황-VacationStop-초기화면-휴가지권역코드 목록을 위한 Record
* 작성일자 : 2004-03-20
* 작성자 : 김대섭
***************************************************************************************************/
/***************************************************************************************************
* 수정내역 :
* 수정자 :
* 수정일자 :
* 백업 : 
***************************************************************************************************/

package chosun.ciis.ss.sls.rdr.rec;

import java.sql.*;
import chosun.ciis.ss.sls.rdr.dm.*;
import chosun.ciis.ss.sls.rdr.ds.*;

/**
 * 독자현황-VacationStop-초기화면-휴가지권역코드 목록을 위한 Record
 */

public class SS_L_VSCD_INITAREAREGCDLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String vaca_arearegncd;
	public String vaca_arearegnnm;

	public SS_L_VSCD_INITAREAREGCDLISTRecord(){}

	public void setVaca_arearegncd(String vaca_arearegncd){
		this.vaca_arearegncd = vaca_arearegncd;
	}

	public void setVaca_arearegnnm(String vaca_arearegnnm){
		this.vaca_arearegnnm = vaca_arearegnnm;
	}

	public String getVaca_arearegncd(){
		return this.vaca_arearegncd;
	}

	public String getVaca_arearegnnm(){
		return this.vaca_arearegnnm;
	}
}

/* 작성시간 : Fri Mar 26 19:42:26 KST 2004 */