/***************************************************************************************************
* ���ϸ� : .java
* ��� : ���ڿ��-������û
* �ۼ����� : 2007-05-22
* �ۼ��� : ��뼷
***************************************************************************************************/
/***************************************************************************************************
* �������� :
* ������ :
* �������� :
* ��� : 
***************************************************************************************************/


package chosun.ciis.is.agr.rec;

import java.sql.*;
import chosun.ciis.is.agr.dm.*;
import chosun.ciis.is.agr.ds.*;

/**
 * 
 */


public class IS_AGR_2420_LCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String t_no;
	public String indt_cd_nm;
	public String scat_dt_yy;
	public String cnt_01;
	public String cnt_02;
	public String cnt_03;
	public String cnt_04;
	public String cnt_05;
	public String cnt_06;
	public String cnt_07;
	public String cnt_08;
	public String cnt_09;
	public String cnt_10;
	public String cnt_11;
	public String cnt_12;
	public String qunt_01;
	public String qunt_02;
	public String qunt_03;
	public String qunt_04;
	public String qunt_05;
	public String qunt_06;
	public String qunt_07;
	public String qunt_08;
	public String qunt_09;
	public String qunt_10;
	public String qunt_11;
	public String qunt_12;
	public String suply_amt_01;
	public String suply_amt_02;
	public String suply_amt_03;
	public String suply_amt_04;
	public String suply_amt_05;
	public String suply_amt_06;
	public String suply_amt_07;
	public String suply_amt_08;
	public String suply_amt_09;
	public String suply_amt_10;
	public String suply_amt_11;
	public String suply_amt_12;
	public String cnt_tot;
	public String qunt_tot;
	public String suply_amt_tot;

	public IS_AGR_2420_LCURLISTRecord(){}

	public void setT_no(String t_no){
		this.t_no = t_no;
	}

	public void setIndt_cd_nm(String indt_cd_nm){
		this.indt_cd_nm = indt_cd_nm;
	}

	public void setScat_dt_yy(String scat_dt_yy){
		this.scat_dt_yy = scat_dt_yy;
	}

	public void setCnt_01(String cnt_01){
		this.cnt_01 = cnt_01;
	}

	public void setCnt_02(String cnt_02){
		this.cnt_02 = cnt_02;
	}

	public void setCnt_03(String cnt_03){
		this.cnt_03 = cnt_03;
	}

	public void setCnt_04(String cnt_04){
		this.cnt_04 = cnt_04;
	}

	public void setCnt_05(String cnt_05){
		this.cnt_05 = cnt_05;
	}

	public void setCnt_06(String cnt_06){
		this.cnt_06 = cnt_06;
	}

	public void setCnt_07(String cnt_07){
		this.cnt_07 = cnt_07;
	}

	public void setCnt_08(String cnt_08){
		this.cnt_08 = cnt_08;
	}

	public void setCnt_09(String cnt_09){
		this.cnt_09 = cnt_09;
	}

	public void setCnt_10(String cnt_10){
		this.cnt_10 = cnt_10;
	}

	public void setCnt_11(String cnt_11){
		this.cnt_11 = cnt_11;
	}

	public void setCnt_12(String cnt_12){
		this.cnt_12 = cnt_12;
	}

	public void setQunt_01(String qunt_01){
		this.qunt_01 = qunt_01;
	}

	public void setQunt_02(String qunt_02){
		this.qunt_02 = qunt_02;
	}

	public void setQunt_03(String qunt_03){
		this.qunt_03 = qunt_03;
	}

	public void setQunt_04(String qunt_04){
		this.qunt_04 = qunt_04;
	}

	public void setQunt_05(String qunt_05){
		this.qunt_05 = qunt_05;
	}

	public void setQunt_06(String qunt_06){
		this.qunt_06 = qunt_06;
	}

	public void setQunt_07(String qunt_07){
		this.qunt_07 = qunt_07;
	}

	public void setQunt_08(String qunt_08){
		this.qunt_08 = qunt_08;
	}

	public void setQunt_09(String qunt_09){
		this.qunt_09 = qunt_09;
	}

	public void setQunt_10(String qunt_10){
		this.qunt_10 = qunt_10;
	}

	public void setQunt_11(String qunt_11){
		this.qunt_11 = qunt_11;
	}

	public void setQunt_12(String qunt_12){
		this.qunt_12 = qunt_12;
	}

	public void setSuply_amt_01(String suply_amt_01){
		this.suply_amt_01 = suply_amt_01;
	}

	public void setSuply_amt_02(String suply_amt_02){
		this.suply_amt_02 = suply_amt_02;
	}

	public void setSuply_amt_03(String suply_amt_03){
		this.suply_amt_03 = suply_amt_03;
	}

	public void setSuply_amt_04(String suply_amt_04){
		this.suply_amt_04 = suply_amt_04;
	}

	public void setSuply_amt_05(String suply_amt_05){
		this.suply_amt_05 = suply_amt_05;
	}

	public void setSuply_amt_06(String suply_amt_06){
		this.suply_amt_06 = suply_amt_06;
	}

	public void setSuply_amt_07(String suply_amt_07){
		this.suply_amt_07 = suply_amt_07;
	}

	public void setSuply_amt_08(String suply_amt_08){
		this.suply_amt_08 = suply_amt_08;
	}

	public void setSuply_amt_09(String suply_amt_09){
		this.suply_amt_09 = suply_amt_09;
	}

	public void setSuply_amt_10(String suply_amt_10){
		this.suply_amt_10 = suply_amt_10;
	}

	public void setSuply_amt_11(String suply_amt_11){
		this.suply_amt_11 = suply_amt_11;
	}

	public void setSuply_amt_12(String suply_amt_12){
		this.suply_amt_12 = suply_amt_12;
	}

	public void setCnt_tot(String cnt_tot){
		this.cnt_tot = cnt_tot;
	}

	public void setQunt_tot(String qunt_tot){
		this.qunt_tot = qunt_tot;
	}

	public void setSuply_amt_tot(String suply_amt_tot){
		this.suply_amt_tot = suply_amt_tot;
	}

	public String getT_no(){
		return this.t_no;
	}

	public String getIndt_cd_nm(){
		return this.indt_cd_nm;
	}

	public String getScat_dt_yy(){
		return this.scat_dt_yy;
	}

	public String getCnt_01(){
		return this.cnt_01;
	}

	public String getCnt_02(){
		return this.cnt_02;
	}

	public String getCnt_03(){
		return this.cnt_03;
	}

	public String getCnt_04(){
		return this.cnt_04;
	}

	public String getCnt_05(){
		return this.cnt_05;
	}

	public String getCnt_06(){
		return this.cnt_06;
	}

	public String getCnt_07(){
		return this.cnt_07;
	}

	public String getCnt_08(){
		return this.cnt_08;
	}

	public String getCnt_09(){
		return this.cnt_09;
	}

	public String getCnt_10(){
		return this.cnt_10;
	}

	public String getCnt_11(){
		return this.cnt_11;
	}

	public String getCnt_12(){
		return this.cnt_12;
	}

	public String getQunt_01(){
		return this.qunt_01;
	}

	public String getQunt_02(){
		return this.qunt_02;
	}

	public String getQunt_03(){
		return this.qunt_03;
	}

	public String getQunt_04(){
		return this.qunt_04;
	}

	public String getQunt_05(){
		return this.qunt_05;
	}

	public String getQunt_06(){
		return this.qunt_06;
	}

	public String getQunt_07(){
		return this.qunt_07;
	}

	public String getQunt_08(){
		return this.qunt_08;
	}

	public String getQunt_09(){
		return this.qunt_09;
	}

	public String getQunt_10(){
		return this.qunt_10;
	}

	public String getQunt_11(){
		return this.qunt_11;
	}

	public String getQunt_12(){
		return this.qunt_12;
	}

	public String getSuply_amt_01(){
		return this.suply_amt_01;
	}

	public String getSuply_amt_02(){
		return this.suply_amt_02;
	}

	public String getSuply_amt_03(){
		return this.suply_amt_03;
	}

	public String getSuply_amt_04(){
		return this.suply_amt_04;
	}

	public String getSuply_amt_05(){
		return this.suply_amt_05;
	}

	public String getSuply_amt_06(){
		return this.suply_amt_06;
	}

	public String getSuply_amt_07(){
		return this.suply_amt_07;
	}

	public String getSuply_amt_08(){
		return this.suply_amt_08;
	}

	public String getSuply_amt_09(){
		return this.suply_amt_09;
	}

	public String getSuply_amt_10(){
		return this.suply_amt_10;
	}

	public String getSuply_amt_11(){
		return this.suply_amt_11;
	}

	public String getSuply_amt_12(){
		return this.suply_amt_12;
	}

	public String getCnt_tot(){
		return this.cnt_tot;
	}

	public String getQunt_tot(){
		return this.qunt_tot;
	}

	public String getSuply_amt_tot(){
		return this.suply_amt_tot;
	}
}

/* �ۼ��ð� : Fri Jun 01 11:07:33 KST 2012 */