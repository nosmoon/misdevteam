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


public class HD_INSR_1600_LCURLIST4Record extends java.lang.Object implements java.io.Serializable{

	public String bns_human_sum_tm;

	public HD_INSR_1600_LCURLIST4Record(){}

	public void setBns_human_sum_tm(String bns_human_sum_tm){
		this.bns_human_sum_tm = bns_human_sum_tm;
	}

	public String getBns_human_sum_tm(){
		return this.bns_human_sum_tm;
	}
}

/* 작성시간 : Fri May 08 17:51:17 KST 2009 */