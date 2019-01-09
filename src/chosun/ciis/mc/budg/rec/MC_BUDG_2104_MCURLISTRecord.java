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


public class MC_BUDG_2104_MCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String max_sub_cd;

	public MC_BUDG_2104_MCURLISTRecord(){}

	public void setMax_sub_cd(String max_sub_cd){
		this.max_sub_cd = max_sub_cd;
	}

	public String getMax_sub_cd(){
		return this.max_sub_cd;
	}
}

/* 작성시간 : Tue May 19 11:30:30 KST 2009 */