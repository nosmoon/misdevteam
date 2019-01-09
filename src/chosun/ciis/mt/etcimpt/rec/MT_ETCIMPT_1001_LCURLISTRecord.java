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


package chosun.ciis.mt.etcimpt.rec;

import java.sql.*;
import chosun.ciis.mt.etcimpt.dm.*;
import chosun.ciis.mt.etcimpt.ds.*;

/**
 * 
 */


public class MT_ETCIMPT_1001_LCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String seq;

	public MT_ETCIMPT_1001_LCURLISTRecord(){}

	public void setSeq(String seq){
		this.seq = seq;
	}

	public String getSeq(){
		return this.seq;
	}
}

/* 작성시간 : Thu May 14 17:17:21 KST 2009 */