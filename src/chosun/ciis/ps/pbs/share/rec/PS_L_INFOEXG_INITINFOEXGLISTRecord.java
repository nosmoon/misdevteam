/***************************************************************************************************
* 파일명 : PS_L_INFOEXG_INIT.java
* 기능 : 정보공유 게시판 - 공지사항,각종통계(확장목록,중재,불편접수,이사신청)
* 작성일자 : 2004-03-29
* 작성자 : 전현표
***************************************************************************************************/
/***************************************************************************************************
* 수정내역 :
* 수정자 :
* 수정일자 :
* 백업 :
***************************************************************************************************/


package chosun.ciis.ps.pbs.share.rec;

import java.sql.*;
import chosun.ciis.ps.pbs.share.dm.*;
import chosun.ciis.ps.pbs.share.ds.*;

/**
 * 출판국- 정보공유 게시판 공지사항,각종통계(확장목록,중재,불편접수,이사신청)
 *
 */

public class PS_L_INFOEXG_INITINFOEXGLISTRecord extends java.lang.Object implements java.io.Serializable{

	public int seq;
	public String clsf;
	public int answergrp;
	public int answerseq;
	public int answerlevl;
	public String notifrdt;
	public String notitodt;
	public String titl;
	public int brwscnt;
	public int recomcnt;
	public int dwloadcnt;
	public String deptcd;
	public String deptnm;
	public String filenm;
	public String filesize;
	public String incmgpers;
	public String incmgpersnm;
	public Timestamp incmgdt;
	public String rmsgexttcd;
	public String rmsgexttnm;
	public int rnum;

	public PS_L_INFOEXG_INITINFOEXGLISTRecord(){}

	public void setSeq(int seq){
		this.seq = seq;
	}

	public void setClsf(String clsf){
		this.clsf = clsf;
	}

	public void setAnswergrp(int answergrp){
		this.answergrp = answergrp;
	}

	public void setAnswerseq(int answerseq){
		this.answerseq = answerseq;
	}

	public void setAnswerlevl(int answerlevl){
		this.answerlevl = answerlevl;
	}

	public void setNotifrdt(String notifrdt){
		this.notifrdt = notifrdt;
	}

	public void setNotitodt(String notitodt){
		this.notitodt = notitodt;
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

	public void setFilenm(String filenm){
		this.filenm = filenm;
	}

	public void setFilesize(String filesize){
		this.filesize = filesize;
	}

	public void setIncmgpers(String incmgpers){
		this.incmgpers = incmgpers;
	}

	public void setIncmgpersnm(String incmgpersnm){
		this.incmgpersnm = incmgpersnm;
	}

	public void setIncmgdt(Timestamp incmgdt){
		this.incmgdt = incmgdt;
	}

	public void setRmsgexttcd(String rmsgexttcd){
		this.rmsgexttcd = rmsgexttcd;
	}

	public void setRmsgexttnm(String rmsgexttnm){
		this.rmsgexttnm = rmsgexttnm;
	}

	public void setRnum(int rnum){
		this.rnum = rnum;
	}

	public int getSeq(){
		return this.seq;
	}

	public String getClsf(){
		return this.clsf;
	}

	public int getAnswergrp(){
		return this.answergrp;
	}

	public int getAnswerseq(){
		return this.answerseq;
	}

	public int getAnswerlevl(){
		return this.answerlevl;
	}

	public String getNotifrdt(){
		return this.notifrdt;
	}

	public String getNotitodt(){
		return this.notitodt;
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

	public String getFilenm(){
		return this.filenm;
	}

	public String getFilesize(){
		return this.filesize;
	}

	public String getIncmgpers(){
		return this.incmgpers;
	}

	public String getIncmgpersnm(){
		return this.incmgpersnm;
	}

	public Timestamp getIncmgdt(){
		return this.incmgdt;
	}

	public String getRmsgexttcd(){
		return this.rmsgexttcd;
	}

	public String getRmsgexttnm(){
		return this.rmsgexttnm;
	}

	public int getRnum(){
		return this.rnum;
	}
}

/* 작성시간 : Tue Jul 25 16:28:23 KST 2006 */