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


package chosun.ciis.mc.budg.rec;

import java.sql.*;
import chosun.ciis.mc.budg.dm.*;
import chosun.ciis.mc.budg.ds.*;

/**
 * 
 */


public class MC_BUDG_6281_LCURLIST2Record extends java.lang.Object implements java.io.Serializable{

	public String pcnt;
	public String fee_1;
	public String fee_2;
	public String fee_3;
	public String fee_4;

	public MC_BUDG_6281_LCURLIST2Record(){}

	public void setPcnt(String pcnt){
		this.pcnt = pcnt;
	}

	public void setFee_1(String fee_1){
		this.fee_1 = fee_1;
	}

	public void setFee_2(String fee_2){
		this.fee_2 = fee_2;
	}

	public void setFee_3(String fee_3){
		this.fee_3 = fee_3;
	}

	public void setFee_4(String fee_4){
		this.fee_4 = fee_4;
	}

	public String getPcnt(){
		return this.pcnt;
	}

	public String getFee_1(){
		return this.fee_1;
	}

	public String getFee_2(){
		return this.fee_2;
	}

	public String getFee_3(){
		return this.fee_3;
	}

	public String getFee_4(){
		return this.fee_4;
	}
}

/* 작성시간 : Sat May 23 17:08:27 KST 2009 */