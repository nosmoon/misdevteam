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


package chosun.ciis.hd.insr.rec;

import java.sql.*;
import chosun.ciis.hd.insr.dm.*;
import chosun.ciis.hd.insr.ds.*;

/**
 * 
 */


public class HD_INSR_1500_LCURLIST9Record extends java.lang.Object implements java.io.Serializable{

	public String tot_sum_tm;

	public HD_INSR_1500_LCURLIST9Record(){}

	public void setTot_sum_tm(String tot_sum_tm){
		this.tot_sum_tm = tot_sum_tm;
	}

	public String getTot_sum_tm(){
		return this.tot_sum_tm;
	}
}

/* 작성시간 : Fri May 08 14:21:04 KST 2009 */