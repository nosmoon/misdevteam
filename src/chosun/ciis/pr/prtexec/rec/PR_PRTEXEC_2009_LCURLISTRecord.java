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


package chosun.ciis.pr.prtexec.rec;

import java.sql.*;
import chosun.ciis.pr.prtexec.dm.*;
import chosun.ciis.pr.prtexec.ds.*;

/**
 * 
 */


public class PR_PRTEXEC_2009_LCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String occr_dt;
	public String seq;
	public String medi_cd;
	public String medi_nm;
	public String sect_cd;
	public String sect_nm;
	public String pcnt;
	public String clr_pcnt;
	public String new_flag;
	public String pcnt_2;
	public String clr_pcnt_2;
	public String prt_dt;
	public String prt_tm;
	public String add_prt_seq;
	public String std;
	public String dual_out_clsf;
	public String tm_in_yn;
	public String remk;

	public PR_PRTEXEC_2009_LCURLISTRecord(){}

	public void setOccr_dt(String occr_dt){
		this.occr_dt = occr_dt;
	}

	public void setSeq(String seq){
		this.seq = seq;
	}

	public void setMedi_cd(String medi_cd){
		this.medi_cd = medi_cd;
	}

	public void setMedi_nm(String medi_nm){
		this.medi_nm = medi_nm;
	}

	public void setSect_cd(String sect_cd){
		this.sect_cd = sect_cd;
	}

	public void setSect_nm(String sect_nm){
		this.sect_nm = sect_nm;
	}

	public void setPcnt(String pcnt){
		this.pcnt = pcnt;
	}

	public void setClr_pcnt(String clr_pcnt){
		this.clr_pcnt = clr_pcnt;
	}

	public void setNew_flag(String new_flag){
		this.new_flag = new_flag;
	}

	public void setPcnt_2(String pcnt_2){
		this.pcnt_2 = pcnt_2;
	}

	public void setClr_pcnt_2(String clr_pcnt_2){
		this.clr_pcnt_2 = clr_pcnt_2;
	}

	public void setPrt_dt(String prt_dt){
		this.prt_dt = prt_dt;
	}

	public void setPrt_tm(String prt_tm){
		this.prt_tm = prt_tm;
	}

	public void setAdd_prt_seq(String add_prt_seq){
		this.add_prt_seq = add_prt_seq;
	}

	public void setStd(String std){
		this.std = std;
	}

	public void setDual_out_clsf(String dual_out_clsf){
		this.dual_out_clsf = dual_out_clsf;
	}

	public void setTm_in_yn(String tm_in_yn){
		this.tm_in_yn = tm_in_yn;
	}

	public void setRemk(String remk){
		this.remk = remk;
	}

	public String getOccr_dt(){
		return this.occr_dt;
	}

	public String getSeq(){
		return this.seq;
	}

	public String getMedi_cd(){
		return this.medi_cd;
	}

	public String getMedi_nm(){
		return this.medi_nm;
	}

	public String getSect_cd(){
		return this.sect_cd;
	}

	public String getSect_nm(){
		return this.sect_nm;
	}

	public String getPcnt(){
		return this.pcnt;
	}

	public String getClr_pcnt(){
		return this.clr_pcnt;
	}

	public String getNew_flag(){
		return this.new_flag;
	}

	public String getPcnt_2(){
		return this.pcnt_2;
	}

	public String getClr_pcnt_2(){
		return this.clr_pcnt_2;
	}

	public String getPrt_dt(){
		return this.prt_dt;
	}

	public String getPrt_tm(){
		return this.prt_tm;
	}

	public String getAdd_prt_seq(){
		return this.add_prt_seq;
	}

	public String getStd(){
		return this.std;
	}

	public String getDual_out_clsf(){
		return this.dual_out_clsf;
	}

	public String getTm_in_yn(){
		return this.tm_in_yn;
	}

	public String getRemk(){
		return this.remk;
	}
}

/* 작성시간 : Tue Jul 07 21:54:17 KST 2009 */