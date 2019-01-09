/***************************************************************************************************
* 파일명 : 
* 기능 : 
* 작성일자 : 
* 작성자 : 
***************************************************************************************************/
/***************************************************************************************************
* 수정내역 :
* 수정자 :
* 수정일자 :
* 백업 : 
***************************************************************************************************/


package chosun.ciis.se.trg.rec;

import java.sql.*;
import chosun.ciis.se.trg.dm.*;
import chosun.ciis.se.trg.ds.*;

/**
 * 
 */


public class SE_TRG_1220_LCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String trgt_clsf;
	public String trgt_clsf_nm;
	public String trgt_01;
	public String rslt_01;
	public String trgt_02;
	public String rslt_02;
	public String trgt_03;
	public String rslt_03;
	public String trgt_04;
	public String rslt_04;
	public String trgt_05;
	public String rslt_05;
	public String trgt_06;
	public String rslt_06;
	public String trgt_07;
	public String rslt_07;
	public String trgt_08;
	public String rslt_08;
	public String trgt_09;
	public String rslt_09;
	public String trgt_10;
	public String rslt_10;
	public String trgt_11;
	public String rslt_11;
	public String trgt_12;
	public String rslt_12;
	public String trgt_sum;
	public String rslt_sum;

	public SE_TRG_1220_LCURLISTRecord(){}

	public void setTrgt_clsf(String trgt_clsf){
		this.trgt_clsf = trgt_clsf;
	}

	public void setTrgt_clsf_nm(String trgt_clsf_nm){
		this.trgt_clsf_nm = trgt_clsf_nm;
	}

	public void setTrgt_01(String trgt_01){
		this.trgt_01 = trgt_01;
	}

	public void setRslt_01(String rslt_01){
		this.rslt_01 = rslt_01;
	}

	public void setTrgt_02(String trgt_02){
		this.trgt_02 = trgt_02;
	}

	public void setRslt_02(String rslt_02){
		this.rslt_02 = rslt_02;
	}

	public void setTrgt_03(String trgt_03){
		this.trgt_03 = trgt_03;
	}

	public void setRslt_03(String rslt_03){
		this.rslt_03 = rslt_03;
	}

	public void setTrgt_04(String trgt_04){
		this.trgt_04 = trgt_04;
	}

	public void setRslt_04(String rslt_04){
		this.rslt_04 = rslt_04;
	}

	public void setTrgt_05(String trgt_05){
		this.trgt_05 = trgt_05;
	}

	public void setRslt_05(String rslt_05){
		this.rslt_05 = rslt_05;
	}

	public void setTrgt_06(String trgt_06){
		this.trgt_06 = trgt_06;
	}

	public void setRslt_06(String rslt_06){
		this.rslt_06 = rslt_06;
	}

	public void setTrgt_07(String trgt_07){
		this.trgt_07 = trgt_07;
	}

	public void setRslt_07(String rslt_07){
		this.rslt_07 = rslt_07;
	}

	public void setTrgt_08(String trgt_08){
		this.trgt_08 = trgt_08;
	}

	public void setRslt_08(String rslt_08){
		this.rslt_08 = rslt_08;
	}

	public void setTrgt_09(String trgt_09){
		this.trgt_09 = trgt_09;
	}

	public void setRslt_09(String rslt_09){
		this.rslt_09 = rslt_09;
	}

	public void setTrgt_10(String trgt_10){
		this.trgt_10 = trgt_10;
	}

	public void setRslt_10(String rslt_10){
		this.rslt_10 = rslt_10;
	}

	public void setTrgt_11(String trgt_11){
		this.trgt_11 = trgt_11;
	}

	public void setRslt_11(String rslt_11){
		this.rslt_11 = rslt_11;
	}

	public void setTrgt_12(String trgt_12){
		this.trgt_12 = trgt_12;
	}

	public void setRslt_12(String rslt_12){
		this.rslt_12 = rslt_12;
	}

	public void setTrgt_sum(String trgt_sum){
		this.trgt_sum = trgt_sum;
	}

	public void setRslt_sum(String rslt_sum){
		this.rslt_sum = rslt_sum;
	}

	public String getTrgt_clsf(){
		return this.trgt_clsf;
	}

	public String getTrgt_clsf_nm(){
		return this.trgt_clsf_nm;
	}

	public String getTrgt_01(){
		return this.trgt_01;
	}

	public String getRslt_01(){
		return this.rslt_01;
	}

	public String getTrgt_02(){
		return this.trgt_02;
	}

	public String getRslt_02(){
		return this.rslt_02;
	}

	public String getTrgt_03(){
		return this.trgt_03;
	}

	public String getRslt_03(){
		return this.rslt_03;
	}

	public String getTrgt_04(){
		return this.trgt_04;
	}

	public String getRslt_04(){
		return this.rslt_04;
	}

	public String getTrgt_05(){
		return this.trgt_05;
	}

	public String getRslt_05(){
		return this.rslt_05;
	}

	public String getTrgt_06(){
		return this.trgt_06;
	}

	public String getRslt_06(){
		return this.rslt_06;
	}

	public String getTrgt_07(){
		return this.trgt_07;
	}

	public String getRslt_07(){
		return this.rslt_07;
	}

	public String getTrgt_08(){
		return this.trgt_08;
	}

	public String getRslt_08(){
		return this.rslt_08;
	}

	public String getTrgt_09(){
		return this.trgt_09;
	}

	public String getRslt_09(){
		return this.rslt_09;
	}

	public String getTrgt_10(){
		return this.trgt_10;
	}

	public String getRslt_10(){
		return this.rslt_10;
	}

	public String getTrgt_11(){
		return this.trgt_11;
	}

	public String getRslt_11(){
		return this.rslt_11;
	}

	public String getTrgt_12(){
		return this.trgt_12;
	}

	public String getRslt_12(){
		return this.rslt_12;
	}

	public String getTrgt_sum(){
		return this.trgt_sum;
	}

	public String getRslt_sum(){
		return this.rslt_sum;
	}
}

/* 작성시간 : Wed Sep 09 19:53:23 KST 2009 */