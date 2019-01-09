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


package chosun.ciis.hd.trip.rec;

import java.sql.*;
import chosun.ciis.hd.trip.dm.*;
import chosun.ciis.hd.trip.ds.*;

/**
 * 
 */


public class HD_TRIP_1307_LCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String day;

	public HD_TRIP_1307_LCURLISTRecord(){}

	public void setDay(String day){
		this.day = day;
	}

	public String getDay(){
		return this.day;
	}
}

/* 작성시간 : Sat Aug 22 13:16:50 KST 2009 */