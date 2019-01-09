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


package chosun.ciis.hd.evlu.rec;

import java.sql.*;
import chosun.ciis.hd.evlu.dm.*;
import chosun.ciis.hd.evlu.ds.*;

/**
 * 
 */


public class HD_EVLU_2101_LCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String evlu_pers_nops;
	public String s_nops_1tms;
	public String a_pls_nops_1tms;
	public String a_nops_1tms;
	public String s_nops_2tms;
	public String a_pls_nops_2tms;
	public String s_a_nops_2tms_sum;
	public String db_status;

	public HD_EVLU_2101_LCURLISTRecord(){}

	public void setEvlu_pers_nops(String evlu_pers_nops){
		this.evlu_pers_nops = evlu_pers_nops;
	}

	public void setS_nops_1tms(String s_nops_1tms){
		this.s_nops_1tms = s_nops_1tms;
	}

	public void setA_pls_nops_1tms(String a_pls_nops_1tms){
		this.a_pls_nops_1tms = a_pls_nops_1tms;
	}

	public void setA_nops_1tms(String a_nops_1tms){
		this.a_nops_1tms = a_nops_1tms;
	}

	public void setS_nops_2tms(String s_nops_2tms){
		this.s_nops_2tms = s_nops_2tms;
	}

	public void setA_pls_nops_2tms(String a_pls_nops_2tms){
		this.a_pls_nops_2tms = a_pls_nops_2tms;
	}

	public void setS_a_nops_2tms_sum(String s_a_nops_2tms_sum){
		this.s_a_nops_2tms_sum = s_a_nops_2tms_sum;
	}

	public void setDb_status(String db_status){
		this.db_status = db_status;
	}

	public String getEvlu_pers_nops(){
		return this.evlu_pers_nops;
	}

	public String getS_nops_1tms(){
		return this.s_nops_1tms;
	}

	public String getA_pls_nops_1tms(){
		return this.a_pls_nops_1tms;
	}

	public String getA_nops_1tms(){
		return this.a_nops_1tms;
	}

	public String getS_nops_2tms(){
		return this.s_nops_2tms;
	}

	public String getA_pls_nops_2tms(){
		return this.a_pls_nops_2tms;
	}

	public String getS_a_nops_2tms_sum(){
		return this.s_a_nops_2tms_sum;
	}

	public String getDb_status(){
		return this.db_status;
	}
}

/* 작성시간 : Thu Mar 06 16:14:20 KST 2014 */