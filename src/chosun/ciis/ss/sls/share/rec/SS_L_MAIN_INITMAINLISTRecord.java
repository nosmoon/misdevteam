/***************************************************************************************************
 * 파일명   : SS_L_MAIN_INITMAINLISTRecord.java
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

public class SS_L_MAIN_INITMAINLISTRecord extends java.lang.Object implements java.io.Serializable{

	public int seq;
	public String clsf;
	public String notifrdt;
	public String notitodt;
	public Timestamp regdt;
	public Timestamp upddt;
	public String makepersid;
	public String makepersnm;
	public String titl;
	public int brwscnt;
	public int recomcnt;
	public int dwloadcnt;
	public String deptcd;
	public String deptnm;
	public String rmsgdept;
	public String rmsgarea;
	public String rmsgexttcd;
	public String filenm;
	public String filesize;

	public SS_L_MAIN_INITMAINLISTRecord(){}

	public void setSeq(int seq){
		this.seq = seq;
	}

	public void setClsf(String clsf){
		this.clsf = clsf;
	}

	public void setNotifrdt(String notifrdt){
		this.notifrdt = notifrdt;
	}

	public void setNotitodt(String notitodt){
		this.notitodt = notitodt;
	}

	public void setRegdt(Timestamp regdt){
		this.regdt = regdt;
	}

	public void setUpddt(Timestamp upddt){
		this.upddt = upddt;
	}

	public void setMakepersid(String makepersid){
		this.makepersid = makepersid;
	}

	public void setMakepersnm(String makepersnm){
		this.makepersnm = makepersnm;
	}

	public void setTitl(String titl){
		this.titl = titl;
	}

	public void setBrwscnt(int brwscnt){
		this.brwscnt = brwscnt;
	}

	public void setRecomcnt(int recomcnt){
		this.recomcnt = recomcnt;
	}

	public void setDwloadcnt(int dwloadcnt){
		this.dwloadcnt = dwloadcnt;
	}

	public void setDeptcd(String deptcd){
		this.deptcd = deptcd;
	}

	public void setDeptnm(String deptnm){
		this.deptnm = deptnm;
	}

	public void setRmsgdept(String rmsgdept){
		this.rmsgdept = rmsgdept;
	}

	public void setRmsgarea(String rmsgarea){
		this.rmsgarea = rmsgarea;
	}

	public void setRmsgexttcd(String rmsgexttcd){
		this.rmsgexttcd = rmsgexttcd;
	}

	public void setFilenm(String filenm){
		this.filenm = filenm;
	}

	public void setFilesize(String filesize){
		this.filesize = filesize;
	}

	public int getSeq(){
		return this.seq;
	}

	public String getClsf(){
		return this.clsf;
	}

	public String getNotifrdt(){
		return this.notifrdt;
	}

	public String getNotitodt(){
		return this.notitodt;
	}

	public Timestamp getRegdt(){
		return this.regdt;
	}

	public Timestamp getUpddt(){
		return this.upddt;
	}

	public String getMakepersid(){
		return this.makepersid;
	}

	public String getMakepersnm(){
		return this.makepersnm;
	}

	public String getTitl(){
		return this.titl;
	}

	public int getBrwscnt(){
		return this.brwscnt;
	}

	public int getRecomcnt(){
		return this.recomcnt;
	}

	public int getDwloadcnt(){
		return this.dwloadcnt;
	}

	public String getDeptcd(){
		return this.deptcd;
	}

	public String getDeptnm(){
		return this.deptnm;
	}

	public String getRmsgdept(){
		return this.rmsgdept;
	}

	public String getRmsgarea(){
		return this.rmsgarea;
	}

	public String getRmsgexttcd(){
		return this.rmsgexttcd;
	}

	public String getFilenm(){
		return this.filenm;
	}

	public String getFilesize(){
		return this.filesize;
	}
}

/* 작성시간 : Thu Apr 12 15:34:17 KST 2007 */