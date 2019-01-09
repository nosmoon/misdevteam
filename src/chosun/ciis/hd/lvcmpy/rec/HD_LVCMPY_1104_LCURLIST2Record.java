/***************************************************************************************************
* 파일명 : .java
* 기능 : 
* 작성일자 : 
* 작성자 : 이태식
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


public class HD_LVCMPY_1104_LCURLIST2Record extends java.lang.Object implements java.io.Serializable{

	public String saly_total_cnt;
	public String sum_total_saly1;
	public String sum_total_saly2;
	public String sum_total_yymm1;
	public String sum_total_yymm2;
	public String sum_total_hody1;
	public String sum_total_hody2;

	public HD_LVCMPY_1104_LCURLIST2Record(){}

	public void setSaly_total_cnt(String saly_total_cnt){
		this.saly_total_cnt = saly_total_cnt;
	}

	public void setSum_total_saly1(String sum_total_saly1){
		this.sum_total_saly1 = sum_total_saly1;
	}

	public void setSum_total_saly2(String sum_total_saly2){
		this.sum_total_saly2 = sum_total_saly2;
	}

	public void setSum_total_yymm1(String sum_total_yymm1){
		this.sum_total_yymm1 = sum_total_yymm1;
	}

	public void setSum_total_yymm2(String sum_total_yymm2){
		this.sum_total_yymm2 = sum_total_yymm2;
	}

	public void setSum_total_hody1(String sum_total_hody1){
		this.sum_total_hody1 = sum_total_hody1;
	}

	public void setSum_total_hody2(String sum_total_hody2){
		this.sum_total_hody2 = sum_total_hody2;
	}

	public String getSaly_total_cnt(){
		return this.saly_total_cnt;
	}

	public String getSum_total_saly1(){
		return this.sum_total_saly1;
	}

	public String getSum_total_saly2(){
		return this.sum_total_saly2;
	}

	public String getSum_total_yymm1(){
		return this.sum_total_yymm1;
	}

	public String getSum_total_yymm2(){
		return this.sum_total_yymm2;
	}

	public String getSum_total_hody1(){
		return this.sum_total_hody1;
	}

	public String getSum_total_hody2(){
		return this.sum_total_hody2;
	}
}

/* 작성시간 : Fri Nov 18 18:29:08 KST 2016 */