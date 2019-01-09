/***************************************************************************************************
* 파일명 : SS_L_NWSPITEM_CLSFCURCOMMLISTRecord.java
* 기능 : 지국지원-신문지원물품-물품목록을 위한 Record
* 작성일자 : 2004-01-20
* 작성자 : 김대섭
***************************************************************************************************/
/***************************************************************************************************
* 수정내역 :
* 수정자 :
* 수정일자 :
* 백업 :
***************************************************************************************************/

package chosun.ciis.ss.sls.brsup.rec;

import java.sql.*;
import chosun.ciis.ss.sls.brsup.dm.*;
import chosun.ciis.ss.sls.brsup.ds.*;

/**
 * 지국지원-신문지원물품-등록-물품목록을 위한 Record
 */

public class SS_L_NWSPITEM_CLSFCURCOMMLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String itemcd;
	public String itemnm;

	public SS_L_NWSPITEM_CLSFCURCOMMLISTRecord(){}

	public void setItemcd(String itemcd){
		this.itemcd = itemcd;
	}

	public void setItemnm(String itemnm){
		this.itemnm = itemnm;
	}

	public String getItemcd(){
		return this.itemcd;
	}

	public String getItemnm(){
		return this.itemnm;
	}
}

/* 작성시간 : Wed Jan 28 20:45:07 KST 2004 */