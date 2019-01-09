/***************************************************************************************************
* 파일명 : .java
* 기능 : 판매시스템
* 작성일자 : 2009-02-18
* 작성자 : 배창희
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


public class SE_TRG_2010_LCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String dept_cd;
	public String dept_nm;
	public String part_cd;
	public String area_cd;
	public String chrg_pers;
	public String chrg_pers_nm;
	public String evlu_grp;
	public String base_val;
	public String trgt1;
	public String rslt1;
	public String attain_rate1;
	public String meda_rank1;
	public String trgt2;
	public String rslt2;
	public String attain_rate2;
	public String meda_rank2;
	public String trgt3;
	public String rslt3;
	public String attain_rate3;
	public String meda_rank3;
	public String trgt4;
	public String rslt4;
	public String attain_rate4;
	public String meda_rank4;
	public String trgt5;
	public String rslt5;
	public String attain_rate5;
	public String meda_rank5;
	public String trgt6;
	public String rslt6;
	public String attain_rate6;
	public String meda_rank6;
	public String rank_scor;
	public String rslt_scor;
	public String rvis_scor;

	public SE_TRG_2010_LCURLISTRecord(){}

	public void setDept_cd(String dept_cd){
		this.dept_cd = dept_cd;
	}

	public void setDept_nm(String dept_nm){
		this.dept_nm = dept_nm;
	}

	public void setPart_cd(String part_cd){
		this.part_cd = part_cd;
	}

	public void setArea_cd(String area_cd){
		this.area_cd = area_cd;
	}

	public void setChrg_pers(String chrg_pers){
		this.chrg_pers = chrg_pers;
	}

	public void setChrg_pers_nm(String chrg_pers_nm){
		this.chrg_pers_nm = chrg_pers_nm;
	}

	public void setEvlu_grp(String evlu_grp){
		this.evlu_grp = evlu_grp;
	}

	public void setBase_val(String base_val){
		this.base_val = base_val;
	}

	public void setTrgt1(String trgt1){
		this.trgt1 = trgt1;
	}

	public void setRslt1(String rslt1){
		this.rslt1 = rslt1;
	}

	public void setAttain_rate1(String attain_rate1){
		this.attain_rate1 = attain_rate1;
	}

	public void setMeda_rank1(String meda_rank1){
		this.meda_rank1 = meda_rank1;
	}

	public void setTrgt2(String trgt2){
		this.trgt2 = trgt2;
	}

	public void setRslt2(String rslt2){
		this.rslt2 = rslt2;
	}

	public void setAttain_rate2(String attain_rate2){
		this.attain_rate2 = attain_rate2;
	}

	public void setMeda_rank2(String meda_rank2){
		this.meda_rank2 = meda_rank2;
	}

	public void setTrgt3(String trgt3){
		this.trgt3 = trgt3;
	}

	public void setRslt3(String rslt3){
		this.rslt3 = rslt3;
	}

	public void setAttain_rate3(String attain_rate3){
		this.attain_rate3 = attain_rate3;
	}

	public void setMeda_rank3(String meda_rank3){
		this.meda_rank3 = meda_rank3;
	}

	public void setTrgt4(String trgt4){
		this.trgt4 = trgt4;
	}

	public void setRslt4(String rslt4){
		this.rslt4 = rslt4;
	}

	public void setAttain_rate4(String attain_rate4){
		this.attain_rate4 = attain_rate4;
	}

	public void setMeda_rank4(String meda_rank4){
		this.meda_rank4 = meda_rank4;
	}

	public void setTrgt5(String trgt5){
		this.trgt5 = trgt5;
	}

	public void setRslt5(String rslt5){
		this.rslt5 = rslt5;
	}

	public void setAttain_rate5(String attain_rate5){
		this.attain_rate5 = attain_rate5;
	}

	public void setMeda_rank5(String meda_rank5){
		this.meda_rank5 = meda_rank5;
	}

	public void setTrgt6(String trgt6){
		this.trgt6 = trgt6;
	}

	public void setRslt6(String rslt6){
		this.rslt6 = rslt6;
	}

	public void setAttain_rate6(String attain_rate6){
		this.attain_rate6 = attain_rate6;
	}

	public void setMeda_rank6(String meda_rank6){
		this.meda_rank6 = meda_rank6;
	}

	public void setRank_scor(String rank_scor){
		this.rank_scor = rank_scor;
	}

	public void setRslt_scor(String rslt_scor){
		this.rslt_scor = rslt_scor;
	}

	public void setRvis_scor(String rvis_scor){
		this.rvis_scor = rvis_scor;
	}

	public String getDept_cd(){
		return this.dept_cd;
	}

	public String getDept_nm(){
		return this.dept_nm;
	}

	public String getPart_cd(){
		return this.part_cd;
	}

	public String getArea_cd(){
		return this.area_cd;
	}

	public String getChrg_pers(){
		return this.chrg_pers;
	}

	public String getChrg_pers_nm(){
		return this.chrg_pers_nm;
	}

	public String getEvlu_grp(){
		return this.evlu_grp;
	}

	public String getBase_val(){
		return this.base_val;
	}

	public String getTrgt1(){
		return this.trgt1;
	}

	public String getRslt1(){
		return this.rslt1;
	}

	public String getAttain_rate1(){
		return this.attain_rate1;
	}

	public String getMeda_rank1(){
		return this.meda_rank1;
	}

	public String getTrgt2(){
		return this.trgt2;
	}

	public String getRslt2(){
		return this.rslt2;
	}

	public String getAttain_rate2(){
		return this.attain_rate2;
	}

	public String getMeda_rank2(){
		return this.meda_rank2;
	}

	public String getTrgt3(){
		return this.trgt3;
	}

	public String getRslt3(){
		return this.rslt3;
	}

	public String getAttain_rate3(){
		return this.attain_rate3;
	}

	public String getMeda_rank3(){
		return this.meda_rank3;
	}

	public String getTrgt4(){
		return this.trgt4;
	}

	public String getRslt4(){
		return this.rslt4;
	}

	public String getAttain_rate4(){
		return this.attain_rate4;
	}

	public String getMeda_rank4(){
		return this.meda_rank4;
	}

	public String getTrgt5(){
		return this.trgt5;
	}

	public String getRslt5(){
		return this.rslt5;
	}

	public String getAttain_rate5(){
		return this.attain_rate5;
	}

	public String getMeda_rank5(){
		return this.meda_rank5;
	}

	public String getTrgt6(){
		return this.trgt6;
	}

	public String getRslt6(){
		return this.rslt6;
	}

	public String getAttain_rate6(){
		return this.attain_rate6;
	}

	public String getMeda_rank6(){
		return this.meda_rank6;
	}

	public String getRank_scor(){
		return this.rank_scor;
	}

	public String getRslt_scor(){
		return this.rslt_scor;
	}

	public String getRvis_scor(){
		return this.rvis_scor;
	}
}

/* 작성시간 : Mon Jul 13 16:23:39 KST 2009 */