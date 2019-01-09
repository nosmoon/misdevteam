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


package chosun.ciis.se.boi.rec;

import java.sql.*;
import chosun.ciis.se.boi.dm.*;
import chosun.ciis.se.boi.ds.*;

/**
 * 
 */


public class SE_BOI_1720_LCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String chrg_pers;
	public String area_cd;
	public String bo_nm;
	public String gbbcd;
	public String gseq;
	public String gjjnm;
	public String gmisuymd;
	public String gjida;
	public String giwja;
	public String ggybj;
	public String gjnbj;
	public String sbbcd;
	public String sseq;
	public String sjjnm;
	public String smisuymd;
	public String sjida;
	public String siwja;
	public String sgybj;
	public String sjnbj;
	public String hbbcd;
	public String hseq;
	public String hjjnm;
	public String hmisuymd;
	public String hjida;
	public String hiwja;
	public String hgybj;
	public String hjnbj;
	public String jdjp;
	public String jjida;
	public String jgybj;
	public String jjnbj;

	public SE_BOI_1720_LCURLISTRecord(){}

	public void setChrg_pers(String chrg_pers){
		this.chrg_pers = chrg_pers;
	}

	public void setArea_cd(String area_cd){
		this.area_cd = area_cd;
	}

	public void setBo_nm(String bo_nm){
		this.bo_nm = bo_nm;
	}

	public void setGbbcd(String gbbcd){
		this.gbbcd = gbbcd;
	}

	public void setGseq(String gseq){
		this.gseq = gseq;
	}

	public void setGjjnm(String gjjnm){
		this.gjjnm = gjjnm;
	}

	public void setGmisuymd(String gmisuymd){
		this.gmisuymd = gmisuymd;
	}

	public void setGjida(String gjida){
		this.gjida = gjida;
	}

	public void setGiwja(String giwja){
		this.giwja = giwja;
	}

	public void setGgybj(String ggybj){
		this.ggybj = ggybj;
	}

	public void setGjnbj(String gjnbj){
		this.gjnbj = gjnbj;
	}

	public void setSbbcd(String sbbcd){
		this.sbbcd = sbbcd;
	}

	public void setSseq(String sseq){
		this.sseq = sseq;
	}

	public void setSjjnm(String sjjnm){
		this.sjjnm = sjjnm;
	}

	public void setSmisuymd(String smisuymd){
		this.smisuymd = smisuymd;
	}

	public void setSjida(String sjida){
		this.sjida = sjida;
	}

	public void setSiwja(String siwja){
		this.siwja = siwja;
	}

	public void setSgybj(String sgybj){
		this.sgybj = sgybj;
	}

	public void setSjnbj(String sjnbj){
		this.sjnbj = sjnbj;
	}

	public void setHbbcd(String hbbcd){
		this.hbbcd = hbbcd;
	}

	public void setHseq(String hseq){
		this.hseq = hseq;
	}

	public void setHjjnm(String hjjnm){
		this.hjjnm = hjjnm;
	}

	public void setHmisuymd(String hmisuymd){
		this.hmisuymd = hmisuymd;
	}

	public void setHjida(String hjida){
		this.hjida = hjida;
	}

	public void setHiwja(String hiwja){
		this.hiwja = hiwja;
	}

	public void setHgybj(String hgybj){
		this.hgybj = hgybj;
	}

	public void setHjnbj(String hjnbj){
		this.hjnbj = hjnbj;
	}

	public void setJdjp(String jdjp){
		this.jdjp = jdjp;
	}

	public void setJjida(String jjida){
		this.jjida = jjida;
	}

	public void setJgybj(String jgybj){
		this.jgybj = jgybj;
	}

	public void setJjnbj(String jjnbj){
		this.jjnbj = jjnbj;
	}

	public String getChrg_pers(){
		return this.chrg_pers;
	}

	public String getArea_cd(){
		return this.area_cd;
	}

	public String getBo_nm(){
		return this.bo_nm;
	}

	public String getGbbcd(){
		return this.gbbcd;
	}

	public String getGseq(){
		return this.gseq;
	}

	public String getGjjnm(){
		return this.gjjnm;
	}

	public String getGmisuymd(){
		return this.gmisuymd;
	}

	public String getGjida(){
		return this.gjida;
	}

	public String getGiwja(){
		return this.giwja;
	}

	public String getGgybj(){
		return this.ggybj;
	}

	public String getGjnbj(){
		return this.gjnbj;
	}

	public String getSbbcd(){
		return this.sbbcd;
	}

	public String getSseq(){
		return this.sseq;
	}

	public String getSjjnm(){
		return this.sjjnm;
	}

	public String getSmisuymd(){
		return this.smisuymd;
	}

	public String getSjida(){
		return this.sjida;
	}

	public String getSiwja(){
		return this.siwja;
	}

	public String getSgybj(){
		return this.sgybj;
	}

	public String getSjnbj(){
		return this.sjnbj;
	}

	public String getHbbcd(){
		return this.hbbcd;
	}

	public String getHseq(){
		return this.hseq;
	}

	public String getHjjnm(){
		return this.hjjnm;
	}

	public String getHmisuymd(){
		return this.hmisuymd;
	}

	public String getHjida(){
		return this.hjida;
	}

	public String getHiwja(){
		return this.hiwja;
	}

	public String getHgybj(){
		return this.hgybj;
	}

	public String getHjnbj(){
		return this.hjnbj;
	}

	public String getJdjp(){
		return this.jdjp;
	}

	public String getJjida(){
		return this.jjida;
	}

	public String getJgybj(){
		return this.jgybj;
	}

	public String getJjnbj(){
		return this.jjnbj;
	}
}

/* 작성시간 : Wed May 20 17:18:34 KST 2009 */