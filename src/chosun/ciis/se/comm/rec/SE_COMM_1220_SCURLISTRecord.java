/***************************************************************************************************
* 파일명 : SE_COMM_1210_LCURLISTRecord
* 기능 :   노선구분코드
* 작성일자 : 2009.01.20
* 작성자 :   김대준
***************************************************************************************************/
/***************************************************************************************************
* 수정내역 :
* 수정자 :
* 수정일자 :
* 백업 : 
***************************************************************************************************/


package chosun.ciis.se.comm.rec;

import java.sql.*;
import chosun.ciis.se.comm.dm.*;
import chosun.ciis.se.comm.ds.*;

/**
 * 
 */


public class SE_COMM_1220_SCURLISTRecord extends java.lang.Object implements java.io.Serializable{
	
	public String route_cd;
	public String route_nm;
	public String route_rank;
	
	public SE_COMM_1220_SCURLISTRecord(){}
	
	public String getRoute_cd() {
		return route_cd;
	}



	public void setRoute_cd(String route_cd) {
		this.route_cd = route_cd;
	}



	public String getRoute_nm() {
		return route_nm;
	}



	public void setRoute_nm(String route_nm) {
		this.route_nm = route_nm;
	}



	public String getRoute_rank() {
		return route_rank;
	}



	public void setRoute_rank(String route_rank) {
		this.route_rank = route_rank;
	}


}

/* 작성시간 : Tue Jan 20 16:50:11 KST 2009 */