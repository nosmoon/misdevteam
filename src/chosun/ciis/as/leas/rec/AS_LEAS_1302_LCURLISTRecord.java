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


package chosun.ciis.as.leas.rec;

import java.sql.*;
import chosun.ciis.as.leas.dm.*;
import chosun.ciis.as.leas.ds.*;

/**
 * 
 */
 

public class AS_LEAS_1302_LCURLISTRecord extends java.lang.Object implements java.io.Serializable{
 
	
	public String occr_seq;

	public AS_LEAS_1302_LCURLISTRecord(){}

	public void setOccr_seq(String occr_seq){
		this.occr_seq = occr_seq;
	}

	public String getOccr_seq(){
		return this.occr_seq;
	}
	
}

/* 작성시간 : Thu May 28 10:02:27 KST 2009 */