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


public class HD_TRIP_1104_LCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String busi_trip_cost;

	public HD_TRIP_1104_LCURLISTRecord(){}

	public void setBusi_trip_cost(String busi_trip_cost){
		this.busi_trip_cost = busi_trip_cost;
	}

	public String getBusi_trip_cost(){
		return this.busi_trip_cost;
	}
}

/* 작성시간 : Tue Apr 07 17:20:02 KST 2009 */