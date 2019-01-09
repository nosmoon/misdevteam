/***************************************************************************************************
* 파일명 : SL_S_VSVACA_AREAREGNCURRecord.java
* 기능 : 독자-VacationStop관리-상세
* 작성일자 : 2004-04-01
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
 * 독자-VacationStop관리-상세
 *
 */

public class SL_S_VSVACA_AREAREGNCURRecord extends java.lang.Object implements java.io.Serializable{

	public String vaca_arearegncd;
	public String vaca_arearegnnm;

	public SL_S_VSVACA_AREAREGNCURRecord(){}

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

/* 작성시간 : Fri Apr 02 00:04:31 KST 2004 */