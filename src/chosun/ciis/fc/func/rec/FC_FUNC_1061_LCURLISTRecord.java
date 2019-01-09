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


public class FC_FUNC_1061_LCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String sbbsamt;

	public FC_FUNC_1061_LCURLISTRecord(){}

	public void setSbbsamt(String sbbsamt){
		this.sbbsamt = sbbsamt;
	}

	public String getSbbsamt(){
		return this.sbbsamt;
	}
}

/* 작성시간 : Mon Feb 16 13:52:21 KST 2009 */