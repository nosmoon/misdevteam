/***************************************************************************************************
* 파일명 : SS_L_ASETCURCOMMLISTRecord.java
* 기능 : 지국Info-지국비품현황-현황 조회
* 작성일자 : 2004-01-29
* 작성자 : 고윤홍
***************************************************************************************************/
/***************************************************************************************************
* 수정내역 :
* 수정자 :
* 수정일자 :
* 백업 : 
***************************************************************************************************/


package chosun.ciis.ss.sls.brinfo.rec;

import java.sql.*;
import chosun.ciis.ss.sls.brinfo.dm.*;
import chosun.ciis.ss.sls.brinfo.ds.*;

/**
 * 지국Info-지국비품현황-현황 조회
 */

public class SS_L_ASETCURCOMMLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String bocd;
	public String deptcd;
	public String areacd;
	public String areanm;
	public String bonm;
	public String boknm;
	public String cd1;
	public String nm1;
	public int cnt1;
	public String cd2;
	public String nm2;
	public int cnt2;
	public String cd3;
	public String nm3;
	public int cnt3;
	public String cd4;
	public String nm4;
	public int cnt4;
	public String cd5;
	public String nm5;
	public int cnt5;
	public String cd6;
	public String nm6;
	public int cnt6;
	public String cd7;
	public String nm7;
	public int cnt7;
	public String cd8;
	public String nm8;
	public int cnt8;
	public String cd9;
	public String nm9;
	public int cnt9;
	public String cd10;
	public String nm10;
	public int cnt10;
	public int total;

	public SS_L_ASETCURCOMMLISTRecord(){}

	public void setBocd(String bocd){
		this.bocd = bocd;
	}

	public void setDeptcd(String deptcd){
		this.deptcd = deptcd;
	}

	public void setAreacd(String areacd){
		this.areacd = areacd;
	}

	public void setAreanm(String areanm){
		this.areanm = areanm;
	}

	public void setBonm(String bonm){
		this.bonm = bonm;
	}

	public void setBoknm(String boknm){
		this.boknm = boknm;
	}

	public void setCd1(String cd1){
		this.cd1 = cd1;
	}

	public void setNm1(String nm1){
		this.nm1 = nm1;
	}

	public void setCnt1(int cnt1){
		this.cnt1 = cnt1;
	}

	public void setCd2(String cd2){
		this.cd2 = cd2;
	}

	public void setNm2(String nm2){
		this.nm2 = nm2;
	}

	public void setCnt2(int cnt2){
		this.cnt2 = cnt2;
	}

	public void setCd3(String cd3){
		this.cd3 = cd3;
	}

	public void setNm3(String nm3){
		this.nm3 = nm3;
	}

	public void setCnt3(int cnt3){
		this.cnt3 = cnt3;
	}

	public void setCd4(String cd4){
		this.cd4 = cd4;
	}

	public void setNm4(String nm4){
		this.nm4 = nm4;
	}

	public void setCnt4(int cnt4){
		this.cnt4 = cnt4;
	}

	public void setCd5(String cd5){
		this.cd5 = cd5;
	}

	public void setNm5(String nm5){
		this.nm5 = nm5;
	}

	public void setCnt5(int cnt5){
		this.cnt5 = cnt5;
	}

	public void setCd6(String cd6){
		this.cd6 = cd6;
	}

	public void setNm6(String nm6){
		this.nm6 = nm6;
	}

	public void setCnt6(int cnt6){
		this.cnt6 = cnt6;
	}

	public void setCd7(String cd7){
		this.cd7 = cd7;
	}

	public void setNm7(String nm7){
		this.nm7 = nm7;
	}

	public void setCnt7(int cnt7){
		this.cnt7 = cnt7;
	}

	public void setCd8(String cd8){
		this.cd8 = cd8;
	}

	public void setNm8(String nm8){
		this.nm8 = nm8;
	}

	public void setCnt8(int cnt8){
		this.cnt8 = cnt8;
	}

	public void setCd9(String cd9){
		this.cd9 = cd9;
	}

	public void setNm9(String nm9){
		this.nm9 = nm9;
	}

	public void setCnt9(int cnt9){
		this.cnt9 = cnt9;
	}

	public void setCd10(String cd10){
		this.cd10 = cd10;
	}

	public void setNm10(String nm10){
		this.nm10 = nm10;
	}

	public void setCnt10(int cnt10){
		this.cnt10 = cnt10;
	}

	public void setTotal(int total){
		this.total = total;
	}

	public String getBocd(){
		return this.bocd;
	}

	public String getDeptcd(){
		return this.deptcd;
	}

	public String getAreacd(){
		return this.areacd;
	}

	public String getAreanm(){
		return this.areanm;
	}

	public String getBonm(){
		return this.bonm;
	}

	public String getBoknm(){
		return this.boknm;
	}

	public String getCd1(){
		return this.cd1;
	}

	public String getNm1(){
		return this.nm1;
	}

	public int getCnt1(){
		return this.cnt1;
	}

	public String getCd2(){
		return this.cd2;
	}

	public String getNm2(){
		return this.nm2;
	}

	public int getCnt2(){
		return this.cnt2;
	}

	public String getCd3(){
		return this.cd3;
	}

	public String getNm3(){
		return this.nm3;
	}

	public int getCnt3(){
		return this.cnt3;
	}

	public String getCd4(){
		return this.cd4;
	}

	public String getNm4(){
		return this.nm4;
	}

	public int getCnt4(){
		return this.cnt4;
	}

	public String getCd5(){
		return this.cd5;
	}

	public String getNm5(){
		return this.nm5;
	}

	public int getCnt5(){
		return this.cnt5;
	}

	public String getCd6(){
		return this.cd6;
	}

	public String getNm6(){
		return this.nm6;
	}

	public int getCnt6(){
		return this.cnt6;
	}

	public String getCd7(){
		return this.cd7;
	}

	public String getNm7(){
		return this.nm7;
	}

	public int getCnt7(){
		return this.cnt7;
	}

	public String getCd8(){
		return this.cd8;
	}

	public String getNm8(){
		return this.nm8;
	}

	public int getCnt8(){
		return this.cnt8;
	}

	public String getCd9(){
		return this.cd9;
	}

	public String getNm9(){
		return this.nm9;
	}

	public int getCnt9(){
		return this.cnt9;
	}

	public String getCd10(){
		return this.cd10;
	}

	public String getNm10(){
		return this.nm10;
	}

	public int getCnt10(){
		return this.cnt10;
	}

	public int getTotal(){
		return this.total;
	}
}

/* 작성시간 : Tue May 18 06:32:32 KST 2004 */