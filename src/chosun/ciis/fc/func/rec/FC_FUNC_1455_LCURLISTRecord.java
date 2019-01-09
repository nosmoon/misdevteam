/***************************************************************************************************
* 파일명 : .java
* 기능 : 독자우대-구독신청
* 작성일자 : 2007-05-22
* 작성자 : 김대섭
***************************************************************************************************/
/***************************************************************************************************
* 수정내역 :
* 수정자 :
* 수정일자 :
* 백업 : 
***************************************************************************************************/


package chosun.ciis.fc.func.rec;

import java.sql.*;
import chosun.ciis.fc.func.dm.*;
import chosun.ciis.fc.func.ds.*;

/**
 * 
 */


public class FC_FUNC_1455_LCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String tot_cnt;

	public FC_FUNC_1455_LCURLISTRecord(){}

	public void setTot_cnt(String tot_cnt){
		this.tot_cnt = tot_cnt;
	}

	public String getTot_cnt(){
		return this.tot_cnt;
	}
}

/* 작성시간 : Mon Apr 06 20:12:19 KST 2009 */