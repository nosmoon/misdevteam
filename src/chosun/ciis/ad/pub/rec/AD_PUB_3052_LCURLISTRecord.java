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


package chosun.ciis.ad.pub.rec;

import java.sql.*;
import chosun.ciis.ad.pub.dm.*;
import chosun.ciis.ad.pub.ds.*;

/**
 * 
 */


public class AD_PUB_3052_LCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String grp_cmpy_cd;
	public String grp_cmpy_nm;
	public String advt_fee_1;
	public String advt_fee_2;
	public String suply_amt_1;
	public String suply_amt_2;
	public String suply_amt_3;
	public String suply_amt_4;
	public String suply_amt_5;
	public String suply_amt_6;
	public String suply_amt_7;
	public String hap1;
	public String advt_fee_11;
	public String advt_fee_22;
	public String suply_amt_11;
	public String suply_amt_22;
	public String suply_amt_33;
	public String suply_amt_44;
	public String suply_amt_55;
	public String suply_amt_66;
	public String suply_amt_77;
	public String hap2;
	public String diff;
	public String diff_ratio;

	public AD_PUB_3052_LCURLISTRecord(){}

	public void setGrp_cmpy_cd(String grp_cmpy_cd){
		this.grp_cmpy_cd = grp_cmpy_cd;
	}

	public void setGrp_cmpy_nm(String grp_cmpy_nm){
		this.grp_cmpy_nm = grp_cmpy_nm;
	}

	public void setAdvt_fee_1(String advt_fee_1){
		this.advt_fee_1 = advt_fee_1;
	}

	public void setAdvt_fee_2(String advt_fee_2){
		this.advt_fee_2 = advt_fee_2;
	}

	public void setSuply_amt_1(String suply_amt_1){
		this.suply_amt_1 = suply_amt_1;
	}

	public void setSuply_amt_2(String suply_amt_2){
		this.suply_amt_2 = suply_amt_2;
	}

	public void setSuply_amt_3(String suply_amt_3){
		this.suply_amt_3 = suply_amt_3;
	}

	public void setSuply_amt_4(String suply_amt_4){
		this.suply_amt_4 = suply_amt_4;
	}

	public void setSuply_amt_5(String suply_amt_5){
		this.suply_amt_5 = suply_amt_5;
	}

	public void setSuply_amt_6(String suply_amt_6){
		this.suply_amt_6 = suply_amt_6;
	}

	public void setSuply_amt_7(String suply_amt_7){
		this.suply_amt_7 = suply_amt_7;
	}

	public void setHap1(String hap1){
		this.hap1 = hap1;
	}

	public void setAdvt_fee_11(String advt_fee_11){
		this.advt_fee_11 = advt_fee_11;
	}

	public void setAdvt_fee_22(String advt_fee_22){
		this.advt_fee_22 = advt_fee_22;
	}

	public void setSuply_amt_11(String suply_amt_11){
		this.suply_amt_11 = suply_amt_11;
	}

	public void setSuply_amt_22(String suply_amt_22){
		this.suply_amt_22 = suply_amt_22;
	}

	public void setSuply_amt_33(String suply_amt_33){
		this.suply_amt_33 = suply_amt_33;
	}

	public void setSuply_amt_44(String suply_amt_44){
		this.suply_amt_44 = suply_amt_44;
	}

	public void setSuply_amt_55(String suply_amt_55){
		this.suply_amt_55 = suply_amt_55;
	}

	public void setSuply_amt_66(String suply_amt_66){
		this.suply_amt_66 = suply_amt_66;
	}

	public void setSuply_amt_77(String suply_amt_77){
		this.suply_amt_77 = suply_amt_77;
	}

	public void setHap2(String hap2){
		this.hap2 = hap2;
	}

	public void setDiff(String diff){
		this.diff = diff;
	}

	public void setDiff_ratio(String diff_ratio){
		this.diff_ratio = diff_ratio;
	}

	public String getGrp_cmpy_cd(){
		return this.grp_cmpy_cd;
	}

	public String getGrp_cmpy_nm(){
		return this.grp_cmpy_nm;
	}

	public String getAdvt_fee_1(){
		return this.advt_fee_1;
	}

	public String getAdvt_fee_2(){
		return this.advt_fee_2;
	}

	public String getSuply_amt_1(){
		return this.suply_amt_1;
	}

	public String getSuply_amt_2(){
		return this.suply_amt_2;
	}

	public String getSuply_amt_3(){
		return this.suply_amt_3;
	}

	public String getSuply_amt_4(){
		return this.suply_amt_4;
	}

	public String getSuply_amt_5(){
		return this.suply_amt_5;
	}

	public String getSuply_amt_6(){
		return this.suply_amt_6;
	}

	public String getSuply_amt_7(){
		return this.suply_amt_7;
	}

	public String getHap1(){
		return this.hap1;
	}

	public String getAdvt_fee_11(){
		return this.advt_fee_11;
	}

	public String getAdvt_fee_22(){
		return this.advt_fee_22;
	}

	public String getSuply_amt_11(){
		return this.suply_amt_11;
	}

	public String getSuply_amt_22(){
		return this.suply_amt_22;
	}

	public String getSuply_amt_33(){
		return this.suply_amt_33;
	}

	public String getSuply_amt_44(){
		return this.suply_amt_44;
	}

	public String getSuply_amt_55(){
		return this.suply_amt_55;
	}

	public String getSuply_amt_66(){
		return this.suply_amt_66;
	}

	public String getSuply_amt_77(){
		return this.suply_amt_77;
	}

	public String getHap2(){
		return this.hap2;
	}

	public String getDiff(){
		return this.diff;
	}

	public String getDiff_ratio(){
		return this.diff_ratio;
	}
}

/* 작성시간 : Mon May 22 16:58:42 KST 2017 */