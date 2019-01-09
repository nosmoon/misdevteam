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


public class MC_BUDG_6111_LCURLIST3Record extends java.lang.Object implements java.io.Serializable{

	public String fr_to_1;
	public String fr_to_2;

	public MC_BUDG_6111_LCURLIST3Record(){}

	public void setFr_to_1(String fr_to_1){
		this.fr_to_1 = fr_to_1;
	}

	public void setFr_to_2(String fr_to_2){
		this.fr_to_2 = fr_to_2;
	}

	public String getFr_to_1(){
		return this.fr_to_1;
	}

	public String getFr_to_2(){
		return this.fr_to_2;
	}
}

/* 작성시간 : Mon Apr 06 15:18:52 KST 2009 */