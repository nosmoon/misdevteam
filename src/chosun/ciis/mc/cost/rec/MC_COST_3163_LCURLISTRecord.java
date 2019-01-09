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

public class MC_COST_3163_LCURLISTRecord extends java.lang.Object implements java.io.Serializable{

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
	public String aj11amt_m02;
	public String aj13amt_m02;
	public String aj19amt_m02;
	public String ajsub1sum_m02;
	public String aj21amt_m02;
	public String aj22amt_m02;
	public String aj23amt_m02;
	public String aj24amt_m02;
	public String aj27amt_m02;
	public String aj31amt_m02;
	public String aj41amt_m02;
	public String aj42amt_m02;
	public String aj49amt_m02;
	public String ajsub2sum_m02;
	public String aj61amt_m02;
	public String aj71amt_m02;
	public String aj81amt_m02;
	public String ajexamt_m02;
	public String aj11amt_m03;
	public String aj13amt_m03;
	public String aj19amt_m03;
	public String ajsub1sum_m03;
	public String aj21amt_m03;
	public String aj22amt_m03;
	public String aj23amt_m03;
	public String aj24amt_m03;
	public String aj27amt_m03;
	public String aj31amt_m03;
	public String aj41amt_m03;
	public String aj42amt_m03;
	public String aj49amt_m03;
	public String ajsub2sum_m03;
	public String aj61amt_m03;
	public String aj71amt_m03;
	public String aj81amt_m03;
	public String ajexamt_m03;
	public String aj11amt_m04;
	public String aj13amt_m04;
	public String aj19amt_m04;
	public String ajsub1sum_m04;
	public String aj21amt_m04;
	public String aj22amt_m04;
	public String aj23amt_m04;
	public String aj24amt_m04;
	public String aj27amt_m04;
	public String aj31amt_m04;
	public String aj41amt_m04;
	public String aj42amt_m04;
	public String aj49amt_m04;
	public String ajsub2sum_m04;
	public String aj61amt_m04;
	public String aj71amt_m04;
	public String aj81amt_m04;
	public String ajexamt_m04;
	public String aj11amt_m05;
	public String aj13amt_m05;
	public String aj19amt_m05;
	public String ajsub1sum_m05;
	public String aj21amt_m05;
	public String aj22amt_m05;
	public String aj23amt_m05;
	public String aj24amt_m05;
	public String aj27amt_m05;
	public String aj31amt_m05;
	public String aj41amt_m05;
	public String aj42amt_m05;
	public String aj49amt_m05;
	public String ajsub2sum_m05;
	public String aj61amt_m05;
	public String aj71amt_m05;
	public String aj81amt_m05;
	public String ajexamt_m05;
	public String aj11amt_m06;
	public String aj13amt_m06;
	public String aj19amt_m06;
	public String ajsub1sum_m06;
	public String aj21amt_m06;
	public String aj22amt_m06;
	public String aj23amt_m06;
	public String aj24amt_m06;
	public String aj27amt_m06;
	public String aj31amt_m06;
	public String aj41amt_m06;
	public String aj42amt_m06;
	public String aj49amt_m06;
	public String ajsub2sum_m06;
	public String aj61amt_m06;
	public String aj71amt_m06;
	public String aj81amt_m06;
	public String ajexamt_m06;

	public MC_COST_3163_LCURLISTRecord(){}

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

	public void setAj11amt_m02(String aj11amt_m02){
		this.aj11amt_m02 = aj11amt_m02;
	}

	public void setAj13amt_m02(String aj13amt_m02){
		this.aj13amt_m02 = aj13amt_m02;
	}

	public void setAj19amt_m02(String aj19amt_m02){
		this.aj19amt_m02 = aj19amt_m02;
	}

	public void setAjsub1sum_m02(String ajsub1sum_m02){
		this.ajsub1sum_m02 = ajsub1sum_m02;
	}

	public void setAj21amt_m02(String aj21amt_m02){
		this.aj21amt_m02 = aj21amt_m02;
	}

	public void setAj22amt_m02(String aj22amt_m02){
		this.aj22amt_m02 = aj22amt_m02;
	}

	public void setAj23amt_m02(String aj23amt_m02){
		this.aj23amt_m02 = aj23amt_m02;
	}

	public void setAj24amt_m02(String aj24amt_m02){
		this.aj24amt_m02 = aj24amt_m02;
	}

	public void setAj27amt_m02(String aj27amt_m02){
		this.aj27amt_m02 = aj27amt_m02;
	}

	public void setAj31amt_m02(String aj31amt_m02){
		this.aj31amt_m02 = aj31amt_m02;
	}

	public void setAj41amt_m02(String aj41amt_m02){
		this.aj41amt_m02 = aj41amt_m02;
	}

	public void setAj42amt_m02(String aj42amt_m02){
		this.aj42amt_m02 = aj42amt_m02;
	}

	public void setAj49amt_m02(String aj49amt_m02){
		this.aj49amt_m02 = aj49amt_m02;
	}

	public void setAjsub2sum_m02(String ajsub2sum_m02){
		this.ajsub2sum_m02 = ajsub2sum_m02;
	}

	public void setAj61amt_m02(String aj61amt_m02){
		this.aj61amt_m02 = aj61amt_m02;
	}

	public void setAj71amt_m02(String aj71amt_m02){
		this.aj71amt_m02 = aj71amt_m02;
	}

	public void setAj81amt_m02(String aj81amt_m02){
		this.aj81amt_m02 = aj81amt_m02;
	}

	public void setAjexamt_m02(String ajexamt_m02){
		this.ajexamt_m02 = ajexamt_m02;
	}

	public void setAj11amt_m03(String aj11amt_m03){
		this.aj11amt_m03 = aj11amt_m03;
	}

	public void setAj13amt_m03(String aj13amt_m03){
		this.aj13amt_m03 = aj13amt_m03;
	}

	public void setAj19amt_m03(String aj19amt_m03){
		this.aj19amt_m03 = aj19amt_m03;
	}

	public void setAjsub1sum_m03(String ajsub1sum_m03){
		this.ajsub1sum_m03 = ajsub1sum_m03;
	}

	public void setAj21amt_m03(String aj21amt_m03){
		this.aj21amt_m03 = aj21amt_m03;
	}

	public void setAj22amt_m03(String aj22amt_m03){
		this.aj22amt_m03 = aj22amt_m03;
	}

	public void setAj23amt_m03(String aj23amt_m03){
		this.aj23amt_m03 = aj23amt_m03;
	}

	public void setAj24amt_m03(String aj24amt_m03){
		this.aj24amt_m03 = aj24amt_m03;
	}

	public void setAj27amt_m03(String aj27amt_m03){
		this.aj27amt_m03 = aj27amt_m03;
	}

	public void setAj31amt_m03(String aj31amt_m03){
		this.aj31amt_m03 = aj31amt_m03;
	}

	public void setAj41amt_m03(String aj41amt_m03){
		this.aj41amt_m03 = aj41amt_m03;
	}

	public void setAj42amt_m03(String aj42amt_m03){
		this.aj42amt_m03 = aj42amt_m03;
	}

	public void setAj49amt_m03(String aj49amt_m03){
		this.aj49amt_m03 = aj49amt_m03;
	}

	public void setAjsub2sum_m03(String ajsub2sum_m03){
		this.ajsub2sum_m03 = ajsub2sum_m03;
	}

	public void setAj61amt_m03(String aj61amt_m03){
		this.aj61amt_m03 = aj61amt_m03;
	}

	public void setAj71amt_m03(String aj71amt_m03){
		this.aj71amt_m03 = aj71amt_m03;
	}

	public void setAj81amt_m03(String aj81amt_m03){
		this.aj81amt_m03 = aj81amt_m03;
	}

	public void setAjexamt_m03(String ajexamt_m03){
		this.ajexamt_m03 = ajexamt_m03;
	}

	public void setAj11amt_m04(String aj11amt_m04){
		this.aj11amt_m04 = aj11amt_m04;
	}

	public void setAj13amt_m04(String aj13amt_m04){
		this.aj13amt_m04 = aj13amt_m04;
	}

	public void setAj19amt_m04(String aj19amt_m04){
		this.aj19amt_m04 = aj19amt_m04;
	}

	public void setAjsub1sum_m04(String ajsub1sum_m04){
		this.ajsub1sum_m04 = ajsub1sum_m04;
	}

	public void setAj21amt_m04(String aj21amt_m04){
		this.aj21amt_m04 = aj21amt_m04;
	}

	public void setAj22amt_m04(String aj22amt_m04){
		this.aj22amt_m04 = aj22amt_m04;
	}

	public void setAj23amt_m04(String aj23amt_m04){
		this.aj23amt_m04 = aj23amt_m04;
	}

	public void setAj24amt_m04(String aj24amt_m04){
		this.aj24amt_m04 = aj24amt_m04;
	}

	public void setAj27amt_m04(String aj27amt_m04){
		this.aj27amt_m04 = aj27amt_m04;
	}

	public void setAj31amt_m04(String aj31amt_m04){
		this.aj31amt_m04 = aj31amt_m04;
	}

	public void setAj41amt_m04(String aj41amt_m04){
		this.aj41amt_m04 = aj41amt_m04;
	}

	public void setAj42amt_m04(String aj42amt_m04){
		this.aj42amt_m04 = aj42amt_m04;
	}

	public void setAj49amt_m04(String aj49amt_m04){
		this.aj49amt_m04 = aj49amt_m04;
	}

	public void setAjsub2sum_m04(String ajsub2sum_m04){
		this.ajsub2sum_m04 = ajsub2sum_m04;
	}

	public void setAj61amt_m04(String aj61amt_m04){
		this.aj61amt_m04 = aj61amt_m04;
	}

	public void setAj71amt_m04(String aj71amt_m04){
		this.aj71amt_m04 = aj71amt_m04;
	}

	public void setAj81amt_m04(String aj81amt_m04){
		this.aj81amt_m04 = aj81amt_m04;
	}

	public void setAjexamt_m04(String ajexamt_m04){
		this.ajexamt_m04 = ajexamt_m04;
	}

	public void setAj11amt_m05(String aj11amt_m05){
		this.aj11amt_m05 = aj11amt_m05;
	}

	public void setAj13amt_m05(String aj13amt_m05){
		this.aj13amt_m05 = aj13amt_m05;
	}

	public void setAj19amt_m05(String aj19amt_m05){
		this.aj19amt_m05 = aj19amt_m05;
	}

	public void setAjsub1sum_m05(String ajsub1sum_m05){
		this.ajsub1sum_m05 = ajsub1sum_m05;
	}

	public void setAj21amt_m05(String aj21amt_m05){
		this.aj21amt_m05 = aj21amt_m05;
	}

	public void setAj22amt_m05(String aj22amt_m05){
		this.aj22amt_m05 = aj22amt_m05;
	}

	public void setAj23amt_m05(String aj23amt_m05){
		this.aj23amt_m05 = aj23amt_m05;
	}

	public void setAj24amt_m05(String aj24amt_m05){
		this.aj24amt_m05 = aj24amt_m05;
	}

	public void setAj27amt_m05(String aj27amt_m05){
		this.aj27amt_m05 = aj27amt_m05;
	}

	public void setAj31amt_m05(String aj31amt_m05){
		this.aj31amt_m05 = aj31amt_m05;
	}

	public void setAj41amt_m05(String aj41amt_m05){
		this.aj41amt_m05 = aj41amt_m05;
	}

	public void setAj42amt_m05(String aj42amt_m05){
		this.aj42amt_m05 = aj42amt_m05;
	}

	public void setAj49amt_m05(String aj49amt_m05){
		this.aj49amt_m05 = aj49amt_m05;
	}

	public void setAjsub2sum_m05(String ajsub2sum_m05){
		this.ajsub2sum_m05 = ajsub2sum_m05;
	}

	public void setAj61amt_m05(String aj61amt_m05){
		this.aj61amt_m05 = aj61amt_m05;
	}

	public void setAj71amt_m05(String aj71amt_m05){
		this.aj71amt_m05 = aj71amt_m05;
	}

	public void setAj81amt_m05(String aj81amt_m05){
		this.aj81amt_m05 = aj81amt_m05;
	}

	public void setAjexamt_m05(String ajexamt_m05){
		this.ajexamt_m05 = ajexamt_m05;
	}

	public void setAj11amt_m06(String aj11amt_m06){
		this.aj11amt_m06 = aj11amt_m06;
	}

	public void setAj13amt_m06(String aj13amt_m06){
		this.aj13amt_m06 = aj13amt_m06;
	}

	public void setAj19amt_m06(String aj19amt_m06){
		this.aj19amt_m06 = aj19amt_m06;
	}

	public void setAjsub1sum_m06(String ajsub1sum_m06){
		this.ajsub1sum_m06 = ajsub1sum_m06;
	}

	public void setAj21amt_m06(String aj21amt_m06){
		this.aj21amt_m06 = aj21amt_m06;
	}

	public void setAj22amt_m06(String aj22amt_m06){
		this.aj22amt_m06 = aj22amt_m06;
	}

	public void setAj23amt_m06(String aj23amt_m06){
		this.aj23amt_m06 = aj23amt_m06;
	}

	public void setAj24amt_m06(String aj24amt_m06){
		this.aj24amt_m06 = aj24amt_m06;
	}

	public void setAj27amt_m06(String aj27amt_m06){
		this.aj27amt_m06 = aj27amt_m06;
	}

	public void setAj31amt_m06(String aj31amt_m06){
		this.aj31amt_m06 = aj31amt_m06;
	}

	public void setAj41amt_m06(String aj41amt_m06){
		this.aj41amt_m06 = aj41amt_m06;
	}

	public void setAj42amt_m06(String aj42amt_m06){
		this.aj42amt_m06 = aj42amt_m06;
	}

	public void setAj49amt_m06(String aj49amt_m06){
		this.aj49amt_m06 = aj49amt_m06;
	}

	public void setAjsub2sum_m06(String ajsub2sum_m06){
		this.ajsub2sum_m06 = ajsub2sum_m06;
	}

	public void setAj61amt_m06(String aj61amt_m06){
		this.aj61amt_m06 = aj61amt_m06;
	}

	public void setAj71amt_m06(String aj71amt_m06){
		this.aj71amt_m06 = aj71amt_m06;
	}

	public void setAj81amt_m06(String aj81amt_m06){
		this.aj81amt_m06 = aj81amt_m06;
	}

	public void setAjexamt_m06(String ajexamt_m06){
		this.ajexamt_m06 = ajexamt_m06;
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

	public String getAj11amt_m02(){
		return this.aj11amt_m02;
	}

	public String getAj13amt_m02(){
		return this.aj13amt_m02;
	}

	public String getAj19amt_m02(){
		return this.aj19amt_m02;
	}

	public String getAjsub1sum_m02(){
		return this.ajsub1sum_m02;
	}

	public String getAj21amt_m02(){
		return this.aj21amt_m02;
	}

	public String getAj22amt_m02(){
		return this.aj22amt_m02;
	}

	public String getAj23amt_m02(){
		return this.aj23amt_m02;
	}

	public String getAj24amt_m02(){
		return this.aj24amt_m02;
	}

	public String getAj27amt_m02(){
		return this.aj27amt_m02;
	}

	public String getAj31amt_m02(){
		return this.aj31amt_m02;
	}

	public String getAj41amt_m02(){
		return this.aj41amt_m02;
	}

	public String getAj42amt_m02(){
		return this.aj42amt_m02;
	}

	public String getAj49amt_m02(){
		return this.aj49amt_m02;
	}

	public String getAjsub2sum_m02(){
		return this.ajsub2sum_m02;
	}

	public String getAj61amt_m02(){
		return this.aj61amt_m02;
	}

	public String getAj71amt_m02(){
		return this.aj71amt_m02;
	}

	public String getAj81amt_m02(){
		return this.aj81amt_m02;
	}

	public String getAjexamt_m02(){
		return this.ajexamt_m02;
	}

	public String getAj11amt_m03(){
		return this.aj11amt_m03;
	}

	public String getAj13amt_m03(){
		return this.aj13amt_m03;
	}

	public String getAj19amt_m03(){
		return this.aj19amt_m03;
	}

	public String getAjsub1sum_m03(){
		return this.ajsub1sum_m03;
	}

	public String getAj21amt_m03(){
		return this.aj21amt_m03;
	}

	public String getAj22amt_m03(){
		return this.aj22amt_m03;
	}

	public String getAj23amt_m03(){
		return this.aj23amt_m03;
	}

	public String getAj24amt_m03(){
		return this.aj24amt_m03;
	}

	public String getAj27amt_m03(){
		return this.aj27amt_m03;
	}

	public String getAj31amt_m03(){
		return this.aj31amt_m03;
	}

	public String getAj41amt_m03(){
		return this.aj41amt_m03;
	}

	public String getAj42amt_m03(){
		return this.aj42amt_m03;
	}

	public String getAj49amt_m03(){
		return this.aj49amt_m03;
	}

	public String getAjsub2sum_m03(){
		return this.ajsub2sum_m03;
	}

	public String getAj61amt_m03(){
		return this.aj61amt_m03;
	}

	public String getAj71amt_m03(){
		return this.aj71amt_m03;
	}

	public String getAj81amt_m03(){
		return this.aj81amt_m03;
	}

	public String getAjexamt_m03(){
		return this.ajexamt_m03;
	}

	public String getAj11amt_m04(){
		return this.aj11amt_m04;
	}

	public String getAj13amt_m04(){
		return this.aj13amt_m04;
	}

	public String getAj19amt_m04(){
		return this.aj19amt_m04;
	}

	public String getAjsub1sum_m04(){
		return this.ajsub1sum_m04;
	}

	public String getAj21amt_m04(){
		return this.aj21amt_m04;
	}

	public String getAj22amt_m04(){
		return this.aj22amt_m04;
	}

	public String getAj23amt_m04(){
		return this.aj23amt_m04;
	}

	public String getAj24amt_m04(){
		return this.aj24amt_m04;
	}

	public String getAj27amt_m04(){
		return this.aj27amt_m04;
	}

	public String getAj31amt_m04(){
		return this.aj31amt_m04;
	}

	public String getAj41amt_m04(){
		return this.aj41amt_m04;
	}

	public String getAj42amt_m04(){
		return this.aj42amt_m04;
	}

	public String getAj49amt_m04(){
		return this.aj49amt_m04;
	}

	public String getAjsub2sum_m04(){
		return this.ajsub2sum_m04;
	}

	public String getAj61amt_m04(){
		return this.aj61amt_m04;
	}

	public String getAj71amt_m04(){
		return this.aj71amt_m04;
	}

	public String getAj81amt_m04(){
		return this.aj81amt_m04;
	}

	public String getAjexamt_m04(){
		return this.ajexamt_m04;
	}

	public String getAj11amt_m05(){
		return this.aj11amt_m05;
	}

	public String getAj13amt_m05(){
		return this.aj13amt_m05;
	}

	public String getAj19amt_m05(){
		return this.aj19amt_m05;
	}

	public String getAjsub1sum_m05(){
		return this.ajsub1sum_m05;
	}

	public String getAj21amt_m05(){
		return this.aj21amt_m05;
	}

	public String getAj22amt_m05(){
		return this.aj22amt_m05;
	}

	public String getAj23amt_m05(){
		return this.aj23amt_m05;
	}

	public String getAj24amt_m05(){
		return this.aj24amt_m05;
	}

	public String getAj27amt_m05(){
		return this.aj27amt_m05;
	}

	public String getAj31amt_m05(){
		return this.aj31amt_m05;
	}

	public String getAj41amt_m05(){
		return this.aj41amt_m05;
	}

	public String getAj42amt_m05(){
		return this.aj42amt_m05;
	}

	public String getAj49amt_m05(){
		return this.aj49amt_m05;
	}

	public String getAjsub2sum_m05(){
		return this.ajsub2sum_m05;
	}

	public String getAj61amt_m05(){
		return this.aj61amt_m05;
	}

	public String getAj71amt_m05(){
		return this.aj71amt_m05;
	}

	public String getAj81amt_m05(){
		return this.aj81amt_m05;
	}

	public String getAjexamt_m05(){
		return this.ajexamt_m05;
	}

	public String getAj11amt_m06(){
		return this.aj11amt_m06;
	}

	public String getAj13amt_m06(){
		return this.aj13amt_m06;
	}

	public String getAj19amt_m06(){
		return this.aj19amt_m06;
	}

	public String getAjsub1sum_m06(){
		return this.ajsub1sum_m06;
	}

	public String getAj21amt_m06(){
		return this.aj21amt_m06;
	}

	public String getAj22amt_m06(){
		return this.aj22amt_m06;
	}

	public String getAj23amt_m06(){
		return this.aj23amt_m06;
	}

	public String getAj24amt_m06(){
		return this.aj24amt_m06;
	}

	public String getAj27amt_m06(){
		return this.aj27amt_m06;
	}

	public String getAj31amt_m06(){
		return this.aj31amt_m06;
	}

	public String getAj41amt_m06(){
		return this.aj41amt_m06;
	}

	public String getAj42amt_m06(){
		return this.aj42amt_m06;
	}

	public String getAj49amt_m06(){
		return this.aj49amt_m06;
	}

	public String getAjsub2sum_m06(){
		return this.ajsub2sum_m06;
	}

	public String getAj61amt_m06(){
		return this.aj61amt_m06;
	}

	public String getAj71amt_m06(){
		return this.aj71amt_m06;
	}

	public String getAj81amt_m06(){
		return this.aj81amt_m06;
	}

	public String getAjexamt_m06(){
		return this.ajexamt_m06;
	}
}

/* 작성시간 : Wed Mar 28 15:34:37 KST 2012 */