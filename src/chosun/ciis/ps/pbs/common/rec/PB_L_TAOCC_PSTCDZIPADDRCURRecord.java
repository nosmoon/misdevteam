/***************************************************************************************************
 * 파일명   : PB_L_TAOCC_PSTCDZIPADDRCURRecord.java
 * 기능     : 공통-우편번호 및 주소 찾기
 * 작성일자 : 2004-03-05
 * 작성자   : 김상옥
 **************************************************************************************************/
 /**************************************************************************************************
 * 수정내역 :
 * 수정자   :
 * 수정일자 :
 * 백업     :
 **************************************************************************************************/


package chosun.ciis.ps.pbs.common.rec;

import java.sql.*;
import chosun.ciis.ps.pbs.common.dm.*;
import chosun.ciis.ps.pbs.common.ds.*;

/**
 * 공통-우편번호 및 주소 찾기
 */

public class PB_L_TAOCC_PSTCDZIPADDRCURRecord extends java.lang.Object implements java.io.Serializable{

	public String juzipcd1;
	public String juzipcd2;
	public String juzipcd3;
	public String jujuso1;
	public String jujuso2;
	public String jujuso3;
	public String jujuso4;
	public String judoseo;
	public String jusaf;
	public String jusat;

	public PB_L_TAOCC_PSTCDZIPADDRCURRecord(){}

	public void setJuzipcd1(String juzipcd1){
		this.juzipcd1 = juzipcd1;
	}

	public void setJuzipcd2(String juzipcd2){
		this.juzipcd2 = juzipcd2;
	}

	public void setJuzipcd3(String juzipcd3){
		this.juzipcd3 = juzipcd3;
	}

	public void setJujuso1(String jujuso1){
		this.jujuso1 = jujuso1;
	}

	public void setJujuso2(String jujuso2){
		this.jujuso2 = jujuso2;
	}

	public void setJujuso3(String jujuso3){
		this.jujuso3 = jujuso3;
	}

	public void setJujuso4(String jujuso4){
		this.jujuso4 = jujuso4;
	}

	public void setJudoseo(String judoseo){
		this.judoseo = judoseo;
	}

	public void setJusaf(String jusaf){
		this.jusaf = jusaf;
	}

	public void setJusat(String jusat){
		this.jusat = jusat;
	}

	public String getJuzipcd1(){
		return this.juzipcd1;
	}

	public String getJuzipcd2(){
		return this.juzipcd2;
	}

	public String getJuzipcd3(){
		return this.juzipcd3;
	}

	public String getJujuso1(){
		return this.jujuso1;
	}

	public String getJujuso2(){
		return this.jujuso2;
	}

	public String getJujuso3(){
		return this.jujuso3;
	}

	public String getJujuso4(){
		return this.jujuso4;
	}

	public String getJudoseo(){
		return this.judoseo;
	}

	public String getJusaf(){
		return this.jusaf;
	}

	public String getJusat(){
		return this.jusat;
	}
}

/* 작성시간 : Fri Mar 05 14:46:19 KST 2004 */