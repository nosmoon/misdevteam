/***************************************************************************************************
 * 파일명   : SS_S_BO_HEADBOHEAD_DTLRecord.java
 * 기능     : 지국info-지국장정보-상세조회
 * 작성일자 : 2007/01/11
 * 작성자   : 이혁
 **************************************************************************************************/
 


package chosun.ciis.ss.sls.brinfo.rec;

import java.sql.*;
import chosun.ciis.ss.sls.brinfo.dm.*;
import chosun.ciis.ss.sls.brinfo.ds.*;

/**
**  SP_SS_S_BO_HEAD
**/

public class SS_S_BO_HEADBOHEAD_DTLRecord extends java.lang.Object implements java.io.Serializable{

	public String jmjgbbcd;
	public String bonm;
	public String bo_headnm;
	public String jmgycymd;
	public String jmhycymd;
	public String prn;
	public String lastschir;
	public String lastschirnm;
	public String nativ;
	public String nativnm;
	public String hby;
	public String spc;
	public String relg;
	public String drink;
	public String smok;
	public String jmgystgb;
	public String zip;
	public String addr;
	public String dtlsaddr;
	public String tel_no1;
	public String tel_no2;
	public String tel_no3;
	public String ptph_no1;
	public String ptph_no2;
	public String ptph_no3;

	public SS_S_BO_HEADBOHEAD_DTLRecord(){}

	public void setJmjgbbcd(String jmjgbbcd){
		this.jmjgbbcd = jmjgbbcd;
	}

	public void setBonm(String bonm){
		this.bonm = bonm;
	}

	public void setBo_headnm(String bo_headnm){
		this.bo_headnm = bo_headnm;
	}

	public void setJmgycymd(String jmgycymd){
		this.jmgycymd = jmgycymd;
	}

	public void setJmhycymd(String jmhycymd){
		this.jmhycymd = jmhycymd;
	}

	public void setPrn(String prn){
		this.prn = prn;
	}

	public void setLastschir(String lastschir){
		this.lastschir = lastschir;
	}

	public void setLastschirnm(String lastschirnm){
		this.lastschirnm = lastschirnm;
	}

	public void setNativ(String nativ){
		this.nativ = nativ;
	}

	public void setNativnm(String nativnm){
		this.nativnm = nativnm;
	}

	public void setHby(String hby){
		this.hby = hby;
	}

	public void setSpc(String spc){
		this.spc = spc;
	}

	public void setRelg(String relg){
		this.relg = relg;
	}

	public void setDrink(String drink){
		this.drink = drink;
	}

	public void setSmok(String smok){
		this.smok = smok;
	}

	public void setJmgystgb(String jmgystgb){
		this.jmgystgb = jmgystgb;
	}

	public void setZip(String zip){
		this.zip = zip;
	}

	public void setAddr(String addr){
		this.addr = addr;
	}

	public void setDtlsaddr(String dtlsaddr){
		this.dtlsaddr = dtlsaddr;
	}

	public void setTel_no1(String tel_no1){
		this.tel_no1 = tel_no1;
	}

	public void setTel_no2(String tel_no2){
		this.tel_no2 = tel_no2;
	}

	public void setTel_no3(String tel_no3){
		this.tel_no3 = tel_no3;
	}

	public void setPtph_no1(String ptph_no1){
		this.ptph_no1 = ptph_no1;
	}

	public void setPtph_no2(String ptph_no2){
		this.ptph_no2 = ptph_no2;
	}

	public void setPtph_no3(String ptph_no3){
		this.ptph_no3 = ptph_no3;
	}

	public String getJmjgbbcd(){
		return this.jmjgbbcd;
	}

	public String getBonm(){
		return this.bonm;
	}

	public String getBo_headnm(){
		return this.bo_headnm;
	}

	public String getJmgycymd(){
		return this.jmgycymd;
	}

	public String getJmhycymd(){
		return this.jmhycymd;
	}

	public String getPrn(){
		return this.prn;
	}

	public String getLastschir(){
		return this.lastschir;
	}

	public String getLastschirnm(){
		return this.lastschirnm;
	}

	public String getNativ(){
		return this.nativ;
	}

	public String getNativnm(){
		return this.nativnm;
	}

	public String getHby(){
		return this.hby;
	}

	public String getSpc(){
		return this.spc;
	}

	public String getRelg(){
		return this.relg;
	}

	public String getDrink(){
		return this.drink;
	}

	public String getSmok(){
		return this.smok;
	}

	public String getJmgystgb(){
		return this.jmgystgb;
	}

	public String getZip(){
		return this.zip;
	}

	public String getAddr(){
		return this.addr;
	}

	public String getDtlsaddr(){
		return this.dtlsaddr;
	}

	public String getTel_no1(){
		return this.tel_no1;
	}

	public String getTel_no2(){
		return this.tel_no2;
	}

	public String getTel_no3(){
		return this.tel_no3;
	}

	public String getPtph_no1(){
		return this.ptph_no1;
	}

	public String getPtph_no2(){
		return this.ptph_no2;
	}

	public String getPtph_no3(){
		return this.ptph_no3;
	}
}

/* 작성시간 : Thu Jan 11 14:52:18 KST 2007 */