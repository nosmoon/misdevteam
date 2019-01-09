/***************************************************************************************************
* 파일명 : PR_SENDMG_1040_LCURLISTRecord.java
* 기능 : 발송데이터 조회
* 작성일자 : 2009-05-11
* 작성자 : 양정녕
***************************************************************************************************/
/***************************************************************************************************
* 수정내역 :
* 수정자 :
* 수정일자 :
* 백업 : 
***************************************************************************************************/


package chosun.ciis.pr.sendmg.rec;

import java.sql.*;
import chosun.ciis.pr.sendmg.dm.*;
import chosun.ciis.pr.sendmg.ds.*;

/**
 * 
 */


public class PR_SENDMG_1039_LCURLISTRecord extends java.lang.Object implements java.io.Serializable{
	
	public String cprdate;
	public String cdmedia;
	public String cpansu;
	public String cdcntry;
	public String iseqno;
	public String ifdno;
	public String cnmedia;
	public String cncntry;
	public String iprpage;
	public String cprout;
	public String cprfin;
	public String lhdbusu;
	public String laddbusu;
	public String lprbusu;
	public String lbabusu;
	public String laddo;
	public String lmins;
	public String cdfact;
	public String ctrans;
	public String inpause;
	public String crpause;
	public String inabn;
	public String crabn;
	public String cpabn;
	public String idanres1;
	public String ijungres1;
	public String idanres2;
	public String ijungres2;
	public String cdummy;


	public PR_SENDMG_1039_LCURLISTRecord(){}

	public String getCprdate() {
		return cprdate;
	}

	public void setCprdate(String cprdate) {
		this.cprdate = cprdate;
	}

	public String getCdmedia() {
		return cdmedia;
	}

	public void setCdmedia(String cdmedia) {
		this.cdmedia = cdmedia;
	}

	public String getCpansu() {
		return cpansu;
	}

	public void setCpansu(String cpansu) {
		this.cpansu = cpansu;
	}

	public String getCdcntry() {
		return cdcntry;
	}

	public void setCdcntry(String cdcntry) {
		this.cdcntry = cdcntry;
	}

	public String getIseqno() {
		return iseqno;
	}

	public void setIseqno(String iseqno) {
		this.iseqno = iseqno;
	}

	public String getIfdno() {
		return ifdno;
	}

	public void setIfdno(String ifdno) {
		this.ifdno = ifdno;
	}

	public String getCnmedia() {
		return cnmedia;
	}

	public void setCnmedia(String cnmedia) {
		this.cnmedia = cnmedia;
	}

	public String getCncntry() {
		return cncntry;
	}

	public void setCncntry(String cncntry) {
		this.cncntry = cncntry;
	}

	public String getIprpage() {
		return iprpage;
	}

	public void setIprpage(String iprpage) {
		this.iprpage = iprpage;
	}

	public String getCprout() {
		return cprout;
	}

	public void setCprout(String cprout) {
		this.cprout = cprout;
	}

	public String getCprfin() {
		return cprfin;
	}

	public void setCprfin(String cprfin) {
		this.cprfin = cprfin;
	}

	public String getLhdbusu() {
		return lhdbusu;
	}

	public void setLhdbusu(String lhdbusu) {
		this.lhdbusu = lhdbusu;
	}

	public String getLaddbusu() {
		return laddbusu;
	}

	public void setLaddbusu(String laddbusu) {
		this.laddbusu = laddbusu;
	}

	public String getLprbusu() {
		return lprbusu;
	}

	public void setLprbusu(String lprbusu) {
		this.lprbusu = lprbusu;
	}

	public String getLbabusu() {
		return lbabusu;
	}

	public void setLbabusu(String lbabusu) {
		this.lbabusu = lbabusu;
	}

	public String getLaddo() {
		return laddo;
	}

	public void setLaddo(String laddo) {
		this.laddo = laddo;
	}

	public String getLmins() {
		return lmins;
	}

	public void setLmins(String lmins) {
		this.lmins = lmins;
	}

	public String getCdfact() {
		return cdfact;
	}

	public void setCdfact(String cdfact) {
		this.cdfact = cdfact;
	}

	public String getCtrans() {
		return ctrans;
	}

	public void setCtrans(String ctrans) {
		this.ctrans = ctrans;
	}

	public String getInpause() {
		return inpause;
	}

	public void setInpause(String inpause) {
		this.inpause = inpause;
	}

	public String getCrpause() {
		return crpause;
	}

	public void setCrpause(String crpause) {
		this.crpause = crpause;
	}

	public String getInabn() {
		return inabn;
	}

	public void setInabn(String inabn) {
		this.inabn = inabn;
	}

	public String getCrabn() {
		return crabn;
	}

	public void setCrabn(String crabn) {
		this.crabn = crabn;
	}

	public String getCpabn() {
		return cpabn;
	}

	public void setCpabn(String cpabn) {
		this.cpabn = cpabn;
	}

	public String getIdanres1() {
		return idanres1;
	}

	public void setIdanres1(String idanres1) {
		this.idanres1 = idanres1;
	}

	public String getIjungres1() {
		return ijungres1;
	}

	public void setIjungres1(String ijungres1) {
		this.ijungres1 = ijungres1;
	}

	public String getIdanres2() {
		return idanres2;
	}

	public void setIdanres2(String idanres2) {
		this.idanres2 = idanres2;
	}

	public String getIjungres2() {
		return ijungres2;
	}

	public void setIjungres2(String ijungres2) {
		this.ijungres2 = ijungres2;
	}

	public String getCdummy() {
		return cdummy;
	}

	public void setCdummy(String cdummy) {
		this.cdummy = cdummy;
	}
}

/* 작성시간 : Wed Apr 29 16:41:59 KST 2009 */