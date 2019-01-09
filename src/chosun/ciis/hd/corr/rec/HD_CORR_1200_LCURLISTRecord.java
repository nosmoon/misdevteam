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


package chosun.ciis.hd.corr.rec;

import java.sql.*;
import chosun.ciis.hd.corr.dm.*;
import chosun.ciis.hd.corr.ds.*;

/**
 * 
 */


public class HD_CORR_1200_LCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String pay_yymm;
	public String seq;
	public String emp_no;
	public String flnm;
	public String dept_cd;
	public String dept_nm;
	public String dty_cd;
	public String dty_nm;
	public String posi_cd;
	public String posi_nm;
	public String natn_cd;
	public String natn_nm;
	public String duty_area;
	public String duty_area_nm;
	public String total_sum;
	public String cd_10;
	public String cd_12;
	public String cd_14;
	public String cd_16;
	public String cd_18;
	public String cd_20;
	public String cd_22;
	public String cd_24;
	public String cd_26;
	public String cd_28;
	public String cd_30;
	public String cd_32;
	public String cd_34;
	public String cd_36;
	public String cd_38;
	public String cd_40;
	public String cd_42;
	public String cd_44;
	public String cd_46;
	public String cd_48;
	public String cd_50;
	public String cd_52;
	public String cd_54;
	public String cd_56;

	public HD_CORR_1200_LCURLISTRecord(){}

	public void setPay_yymm(String pay_yymm){
		this.pay_yymm = pay_yymm;
	}

	public void setSeq(String seq){
		this.seq = seq;
	}

	public void setEmp_no(String emp_no){
		this.emp_no = emp_no;
	}

	public void setFlnm(String flnm){
		this.flnm = flnm;
	}

	public void setDept_cd(String dept_cd){
		this.dept_cd = dept_cd;
	}

	public void setDept_nm(String dept_nm){
		this.dept_nm = dept_nm;
	}

	public void setDty_cd(String dty_cd){
		this.dty_cd = dty_cd;
	}

	public void setDty_nm(String dty_nm){
		this.dty_nm = dty_nm;
	}

	public void setPosi_cd(String posi_cd){
		this.posi_cd = posi_cd;
	}

	public void setPosi_nm(String posi_nm){
		this.posi_nm = posi_nm;
	}

	public void setNatn_cd(String natn_cd){
		this.natn_cd = natn_cd;
	}

	public void setNatn_nm(String natn_nm){
		this.natn_nm = natn_nm;
	}

	public void setDuty_area(String duty_area){
		this.duty_area = duty_area;
	}

	public void setDuty_area_nm(String duty_area_nm){
		this.duty_area_nm = duty_area_nm;
	}

	public void setTotal_sum(String total_sum){
		this.total_sum = total_sum;
	}

	public void setCd_10(String cd_10){
		this.cd_10 = cd_10;
	}

	public void setCd_12(String cd_12){
		this.cd_12 = cd_12;
	}

	public void setCd_14(String cd_14){
		this.cd_14 = cd_14;
	}

	public void setCd_16(String cd_16){
		this.cd_16 = cd_16;
	}

	public void setCd_18(String cd_18){
		this.cd_18 = cd_18;
	}

	public void setCd_20(String cd_20){
		this.cd_20 = cd_20;
	}

	public void setCd_22(String cd_22){
		this.cd_22 = cd_22;
	}

	public void setCd_24(String cd_24){
		this.cd_24 = cd_24;
	}

	public void setCd_26(String cd_26){
		this.cd_26 = cd_26;
	}

	public void setCd_28(String cd_28){
		this.cd_28 = cd_28;
	}

	public void setCd_30(String cd_30){
		this.cd_30 = cd_30;
	}

	public void setCd_32(String cd_32){
		this.cd_32 = cd_32;
	}

	public void setCd_34(String cd_34){
		this.cd_34 = cd_34;
	}

	public void setCd_36(String cd_36){
		this.cd_36 = cd_36;
	}

	public void setCd_38(String cd_38){
		this.cd_38 = cd_38;
	}

	public void setCd_40(String cd_40){
		this.cd_40 = cd_40;
	}

	public void setCd_42(String cd_42){
		this.cd_42 = cd_42;
	}

	public void setCd_44(String cd_44){
		this.cd_44 = cd_44;
	}

	public void setCd_46(String cd_46){
		this.cd_46 = cd_46;
	}

	public void setCd_48(String cd_48){
		this.cd_48 = cd_48;
	}

	public void setCd_50(String cd_50){
		this.cd_50 = cd_50;
	}

	public void setCd_52(String cd_52){
		this.cd_52 = cd_52;
	}

	public void setCd_54(String cd_54){
		this.cd_54 = cd_54;
	}

	public void setCd_56(String cd_56){
		this.cd_56 = cd_56;
	}

	public String getPay_yymm(){
		return this.pay_yymm;
	}	
	
	public String getSeq(){
		return this.seq;
	}

	public String getEmp_no(){
		return this.emp_no;
	}

	public String getFlnm(){
		return this.flnm;
	}

	public String getDept_cd(){
		return this.dept_cd;
	}

	public String getDept_nm(){
		return this.dept_nm;
	}

	public String getDty_cd(){
		return this.dty_cd;
	}

	public String getDty_nm(){
		return this.dty_nm;
	}

	public String getPosi_cd(){
		return this.posi_cd;
	}

	public String getPosi_nm(){
		return this.posi_nm;
	}

	public String getNatn_cd(){
		return this.natn_cd;
	}

	public String getNatn_nm(){
		return this.natn_nm;
	}

	public String getDuty_area(){
		return this.duty_area;
	}

	public String getDuty_area_nm(){
		return this.duty_area_nm;
	}

	public String getTotal_sum(){
		return this.total_sum;
	}

	public String getCd_10(){
		return this.cd_10;
	}

	public String getCd_12(){
		return this.cd_12;
	}

	public String getCd_14(){
		return this.cd_14;
	}

	public String getCd_16(){
		return this.cd_16;
	}

	public String getCd_18(){
		return this.cd_18;
	}

	public String getCd_20(){
		return this.cd_20;
	}

	public String getCd_22(){
		return this.cd_22;
	}

	public String getCd_24(){
		return this.cd_24;
	}

	public String getCd_26(){
		return this.cd_26;
	}

	public String getCd_28(){
		return this.cd_28;
	}

	public String getCd_30(){
		return this.cd_30;
	}

	public String getCd_32(){
		return this.cd_32;
	}

	public String getCd_34(){
		return this.cd_34;
	}

	public String getCd_36(){
		return this.cd_36;
	}

	public String getCd_38(){
		return this.cd_38;
	}

	public String getCd_40(){
		return this.cd_40;
	}

	public String getCd_42(){
		return this.cd_42;
	}

	public String getCd_44(){
		return this.cd_44;
	}

	public String getCd_46(){
		return this.cd_46;
	}

	public String getCd_48(){
		return this.cd_48;
	}

	public String getCd_50(){
		return this.cd_50;
	}

	public String getCd_52(){
		return this.cd_52;
	}

	public String getCd_54(){
		return this.cd_54;
	}

	public String getCd_56(){
		return this.cd_56;
	}
}

/* 작성시간 : Mon Apr 13 10:02:19 KST 2009 */