/***************************************************************************************************
* 파일명 : .java
* 기능 :  원가관리 - 매체별 손익현황
* 작성일자 : 2011-07-12
* 작성자 : 노상현
***************************************************************************************************/
/***************************************************************************************************
* 수정내역 : 
* 수정자 :
* 수정일자 :
* 백업 : 
***************************************************************************************************/


package chosun.ciis.mc.cost.rec;

import java.sql.*;
import chosun.ciis.mc.cost.dm.*;
import chosun.ciis.mc.cost.ds.*;

/**
 * 원가관리 - 매체별 손익현황
 */

public class MC_COST_3164_LCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String gubun1;
	public String sort_key1;
	public String gubun2;
	public String gubun3;
	public String ajsumamt_m01;
	public String aj11amt_m01;
	public String aj13amt_m01;
	public String aj19amt_m01;
	public String ajsub1sum_m01;
	public String aj21amt_m01;
	public String aj22amt_m01;
	public String aj23amt_m01;
	public String aj24amt_m01;
	public String aj27amt_m01;
	public String aj31amt_m01;
	public String aj41amt_m01;
	public String aj42amt_m01;
	public String aj49amt_m01;
	public String ajsub2sum_m01;
	public String aj61amt_m01;
	public String aj71amt_m01;
	public String aj81amt_m01;
	public String ajexamt_m01;

	public MC_COST_3164_LCURLISTRecord(){}

	public void setGubun1(String gubun1){
		this.gubun1 = gubun1;
	}

	public void setSort_key1(String sort_key1){
		this.sort_key1 = sort_key1;
	}

	public void setGubun2(String gubun2){
		this.gubun2 = gubun2;
	}

	public void setGubun3(String gubun3){
		this.gubun3 = gubun3;
	}

	public void setAjsumamt_m01(String ajsumamt_m01){
		this.ajsumamt_m01 = ajsumamt_m01;
	}

	public void setAj11amt_m01(String aj11amt_m01){
		this.aj11amt_m01 = aj11amt_m01;
	}

	public void setAj13amt_m01(String aj13amt_m01){
		this.aj13amt_m01 = aj13amt_m01;
	}

	public void setAj19amt_m01(String aj19amt_m01){
		this.aj19amt_m01 = aj19amt_m01;
	}

	public void setAjsub1sum_m01(String ajsub1sum_m01){
		this.ajsub1sum_m01 = ajsub1sum_m01;
	}

	public void setAj21amt_m01(String aj21amt_m01){
		this.aj21amt_m01 = aj21amt_m01;
	}

	public void setAj22amt_m01(String aj22amt_m01){
		this.aj22amt_m01 = aj22amt_m01;
	}

	public void setAj23amt_m01(String aj23amt_m01){
		this.aj23amt_m01 = aj23amt_m01;
	}

	public void setAj24amt_m01(String aj24amt_m01){
		this.aj24amt_m01 = aj24amt_m01;
	}

	public void setAj27amt_m01(String aj27amt_m01){
		this.aj27amt_m01 = aj27amt_m01;
	}

	public void setAj31amt_m01(String aj31amt_m01){
		this.aj31amt_m01 = aj31amt_m01;
	}

	public void setAj41amt_m01(String aj41amt_m01){
		this.aj41amt_m01 = aj41amt_m01;
	}

	public void setAj42amt_m01(String aj42amt_m01){
		this.aj42amt_m01 = aj42amt_m01;
	}

	public void setAj49amt_m01(String aj49amt_m01){
		this.aj49amt_m01 = aj49amt_m01;
	}

	public void setAjsub2sum_m01(String ajsub2sum_m01){
		this.ajsub2sum_m01 = ajsub2sum_m01;
	}

	public void setAj61amt_m01(String aj61amt_m01){
		this.aj61amt_m01 = aj61amt_m01;
	}

	public void setAj71amt_m01(String aj71amt_m01){
		this.aj71amt_m01 = aj71amt_m01;
	}

	public void setAj81amt_m01(String aj81amt_m01){
		this.aj81amt_m01 = aj81amt_m01;
	}

	public void setAjexamt_m01(String ajexamt_m01){
		this.ajexamt_m01 = ajexamt_m01;
	}

	public String getGubun1(){
		return this.gubun1;
	}

	public String getSort_key1(){
		return this.sort_key1;
	}

	public String getGubun2(){
		return this.gubun2;
	}

	public String getGubun3(){
		return this.gubun3;
	}

	public String getAjsumamt_m01(){
		return this.ajsumamt_m01;
	}

	public String getAj11amt_m01(){
		return this.aj11amt_m01;
	}

	public String getAj13amt_m01(){
		return this.aj13amt_m01;
	}

	public String getAj19amt_m01(){
		return this.aj19amt_m01;
	}

	public String getAjsub1sum_m01(){
		return this.ajsub1sum_m01;
	}

	public String getAj21amt_m01(){
		return this.aj21amt_m01;
	}

	public String getAj22amt_m01(){
		return this.aj22amt_m01;
	}

	public String getAj23amt_m01(){
		return this.aj23amt_m01;
	}

	public String getAj24amt_m01(){
		return this.aj24amt_m01;
	}

	public String getAj27amt_m01(){
		return this.aj27amt_m01;
	}

	public String getAj31amt_m01(){
		return this.aj31amt_m01;
	}

	public String getAj41amt_m01(){
		return this.aj41amt_m01;
	}

	public String getAj42amt_m01(){
		return this.aj42amt_m01;
	}

	public String getAj49amt_m01(){
		return this.aj49amt_m01;
	}

	public String getAjsub2sum_m01(){
		return this.ajsub2sum_m01;
	}

	public String getAj61amt_m01(){
		return this.aj61amt_m01;
	}

	public String getAj71amt_m01(){
		return this.aj71amt_m01;
	}

	public String getAj81amt_m01(){
		return this.aj81amt_m01;
	}

	public String getAjexamt_m01(){
		return this.ajexamt_m01;
	}
}

/* 작성시간 : Wed Mar 28 15:34:37 KST 2012 */