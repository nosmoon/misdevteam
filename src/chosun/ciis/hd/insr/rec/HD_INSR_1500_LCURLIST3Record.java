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


public class HD_INSR_1500_LCURLIST3Record extends java.lang.Object implements java.io.Serializable{

	public String tot_alon_sum_a;

	public HD_INSR_1500_LCURLIST3Record(){}

	public void setTot_alon_sum_a(String tot_alon_sum_a){
		this.tot_alon_sum_a = tot_alon_sum_a;
	}

	public String getTot_alon_sum_a(){
		return this.tot_alon_sum_a;
	}
}

/* 작성시간 : Fri May 08 17:22:24 KST 2009 */