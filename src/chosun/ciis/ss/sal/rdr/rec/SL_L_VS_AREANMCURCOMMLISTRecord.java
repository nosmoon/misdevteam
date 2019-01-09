/***************************************************************************************************
* 파일명 : SL_L_VS_AREANMCURCOMMLISTRecord.java
* 기능 : 독자-VacationStop-휴가지배달지역 목록을 위한 Record
* 작성일자 : 2004-01-20
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
 * 독자-VacationStop-휴가지배달지역 목록을 위한 Record
 */


public class SL_L_VS_AREANMCURCOMMLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String vaca_areacd;
	public String vaca_areanm;

	public SL_L_VS_AREANMCURCOMMLISTRecord(){}

	public void setVaca_areacd(String vaca_areacd){
		this.vaca_areacd = vaca_areacd;
	}

	public void setVaca_areanm(String vaca_areanm){
		this.vaca_areanm = vaca_areanm;
	}

	public String getVaca_areacd(){
		return this.vaca_areacd;
	}

	public String getVaca_areanm(){
		return this.vaca_areanm;
	}
}

/* 작성시간 : Mon Jan 26 11:59:10 KST 2004 */