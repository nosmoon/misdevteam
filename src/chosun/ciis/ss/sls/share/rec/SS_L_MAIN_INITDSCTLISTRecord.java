/***************************************************************************************************
 * 파일명   : SS_L_MAIN_INITDSCTLISTRecord.java
 * 기능     : 판매국메인-초기화면
 * 작성일자 : 2007/04/12
 * 작성자   : 이혁
 **************************************************************************************************/
 


package chosun.ciis.ss.sls.share.rec;

import java.sql.*;
import chosun.ciis.ss.sls.share.dm.*;
import chosun.ciis.ss.sls.share.ds.*;

/**
**  SP_SS_L_MAIN_INIT
**/

public class SS_L_MAIN_INITDSCTLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String cd;
	public String nm;
	public int reg;
	public int cnfm;
	public int dscttypecd10;
	public int dscttypecd10cnfm;
	public int dscttypecd20;
	public int dscttypecd20cnfm;
	public int dscttypecd30;
	public int dscttypecd30cnfm;
	public int dscttypecd40;
	public int dscttypecd40cnfm;
	public int dscttypecd45;
	public int dscttypecd45cnfm;

	public SS_L_MAIN_INITDSCTLISTRecord(){}

	public void setCd(String cd){
		this.cd = cd;
	}

	public void setNm(String nm){
		this.nm = nm;
	}

	public void setReg(int reg){
		this.reg = reg;
	}

	public void setCnfm(int cnfm){
		this.cnfm = cnfm;
	}

	public void setDscttypecd10(int dscttypecd10){
		this.dscttypecd10 = dscttypecd10;
	}

	public void setDscttypecd10cnfm(int dscttypecd10cnfm){
		this.dscttypecd10cnfm = dscttypecd10cnfm;
	}

	public void setDscttypecd20(int dscttypecd20){
		this.dscttypecd20 = dscttypecd20;
	}

	public void setDscttypecd20cnfm(int dscttypecd20cnfm){
		this.dscttypecd20cnfm = dscttypecd20cnfm;
	}

	public void setDscttypecd30(int dscttypecd30){
		this.dscttypecd30 = dscttypecd30;
	}

	public void setDscttypecd30cnfm(int dscttypecd30cnfm){
		this.dscttypecd30cnfm = dscttypecd30cnfm;
	}

	public void setDscttypecd40(int dscttypecd40){
		this.dscttypecd40 = dscttypecd40;
	}

	public void setDscttypecd40cnfm(int dscttypecd40cnfm){
		this.dscttypecd40cnfm = dscttypecd40cnfm;
	}

	public void setDscttypecd45(int dscttypecd45){
		this.dscttypecd45 = dscttypecd45;
	}

	public void setDscttypecd45cnfm(int dscttypecd45cnfm){
		this.dscttypecd45cnfm = dscttypecd45cnfm;
	}

	public String getCd(){
		return this.cd;
	}

	public String getNm(){
		return this.nm;
	}

	public int getReg(){
		return this.reg;
	}

	public int getCnfm(){
		return this.cnfm;
	}

	public int getDscttypecd10(){
		return this.dscttypecd10;
	}

	public int getDscttypecd10cnfm(){
		return this.dscttypecd10cnfm;
	}

	public int getDscttypecd20(){
		return this.dscttypecd20;
	}

	public int getDscttypecd20cnfm(){
		return this.dscttypecd20cnfm;
	}

	public int getDscttypecd30(){
		return this.dscttypecd30;
	}

	public int getDscttypecd30cnfm(){
		return this.dscttypecd30cnfm;
	}

	public int getDscttypecd40(){
		return this.dscttypecd40;
	}

	public int getDscttypecd40cnfm(){
		return this.dscttypecd40cnfm;
	}

	public int getDscttypecd45(){
		return this.dscttypecd45;
	}

	public int getDscttypecd45cnfm(){
		return this.dscttypecd45cnfm;
	}
}

/* 작성시간 : Thu Apr 12 15:34:17 KST 2007 */