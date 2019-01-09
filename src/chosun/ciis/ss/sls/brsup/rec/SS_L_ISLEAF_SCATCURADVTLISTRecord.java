/***************************************************************************************************
* 파일명 : .java
* 기능 : *지국지원-전단현황-리스트
* 작성일자 : 2009-09-06
* 작성자 : 김세웅
***************************************************************************************************/


package chosun.ciis.ss.sls.brsup.rec;

import java.sql.*;
import chosun.ciis.ss.sls.brsup.dm.*;
import chosun.ciis.ss.sls.brsup.ds.*;

/**
 * 지국지원-전단현황-리스트
 */

public class SS_L_ISLEAF_SCATCURADVTLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String advtlist;
	public String advttemp;

	public SS_L_ISLEAF_SCATCURADVTLISTRecord(){}

	public void setAdvtlist(String advtlist){
		this.advtlist = advtlist;
	}

	public void setAdvttemp(String advttemp){
		this.advttemp = advttemp;
	}

	public String getAdvtlist(){
		return this.advtlist;
	}

	public String getAdvttemp(){
		return this.advttemp;
	}
}

/* 작성시간 : Sun Sep 06 17:07:28 KST 2009 */