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


package chosun.ciis.hd.srch.rec;

import java.sql.*;
import chosun.ciis.hd.srch.dm.*;
import chosun.ciis.hd.srch.ds.*;

/**
 * 
 */


public class HD_SRCH_1601_LCURLIST1Record extends java.lang.Object implements java.io.Serializable{

	public String wowlrdlftn2;
	public String duty_yydd;
	public String qlrmsrlrks2;
	public String rmsthrdlftn2;

	public HD_SRCH_1601_LCURLIST1Record(){}

	public void setWowlrdlftn2(String wowlrdlftn2){
		this.wowlrdlftn2 = wowlrdlftn2;
	}

	public void setDuty_yydd(String duty_yydd){
		this.duty_yydd = duty_yydd;
	}

	public void setQlrmsrlrks2(String qlrmsrlrks2){
		this.qlrmsrlrks2 = qlrmsrlrks2;
	}

	public void setRmsthrdlftn2(String rmsthrdlftn2){
		this.rmsthrdlftn2 = rmsthrdlftn2;
	}

	public String getWowlrdlftn2(){
		return this.wowlrdlftn2;
	}

	public String getDuty_yydd(){
		return this.duty_yydd;
	}

	public String getQlrmsrlrks2(){
		return this.qlrmsrlrks2;
	}

	public String getRmsthrdlftn2(){
		return this.rmsthrdlftn2;
	}
}

/* 작성시간 : Thu Oct 08 18:16:01 KST 2009 */