/***************************************************************************************************
* 파일명 : .java
* 기능 : 
* 작성일자 :
* 작성자 :
***************************************************************************************************/
/***************************************************************************************************
* 수정내역 :
* 수정자 :
* 수정일자 :
* 백업 : 
***************************************************************************************************/


package chosun.ciis.hd.lvcmpy.rec;

import java.sql.*;
import chosun.ciis.hd.lvcmpy.dm.*;
import chosun.ciis.hd.lvcmpy.ds.*;

/**
 * 
 */


public class HD_LVCMPY_2700_LCURLIST1Record extends java.lang.Object implements java.io.Serializable{

	public String in_slip_occr_dt;
	public String in_slip_seq;

	public HD_LVCMPY_2700_LCURLIST1Record(){}

	public void setIn_slip_occr_dt(String in_slip_occr_dt){
		this.in_slip_occr_dt = in_slip_occr_dt;
	}

	public void setIn_slip_seq(String in_slip_seq){
		this.in_slip_seq = in_slip_seq;
	}

	public String getIn_slip_occr_dt(){
		return this.in_slip_occr_dt;
	}

	public String getIn_slip_seq(){
		return this.in_slip_seq;
	}
}

/* 작성시간 : Thu Sep 08 14:21:57 KST 2011 */