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


package chosun.ciis.pr.sendmg.dm;

import java.sql.*;
import oracle.jdbc.driver.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.pr.sendmg.ds.*;
import chosun.ciis.pr.sendmg.rec.*;

/**
 * 
 */


public class _PR_SENDMG_1040_ADM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String cmpy_cd	= "";
	public String pr_dt		= "";
	public String cprdate	= "";
	public String cdmedia	= "";
	public String cpansu	= "";
	public String cdcntry	= "";
	public String iseqno	= "";
	public String ifdno		= "";
	public String cnmedia	= "";
	public String cncntry	= "";
	public String iprpage	= "";
	public String cprout	= "";
	public String cprfin	= "";
	public String lhdbusu	= "";
	public String laddbusu	= "";
	public String lprbusu	= "";
	public String lbabusu	= "";
	public String laddo	= "";
	public String lmins	= "";
	public String cdfact	= "";
	public String ctrans	= "";
	public String inpause	= "";
	public String crpause	= "";
	public String inabn	= "";
	public String crabn	= "";
	public String cpabn	= "";
	public String idanres1	= "";
	public String ijungres1	= "";
	public String idanres2		= "";
	public String ijungres2	= "";
	public String cdummy		= ""; 

	public _PR_SENDMG_1040_ADM(){}
	public _PR_SENDMG_1040_ADM(String pr_dt){
		this.pr_dt = pr_dt;
	}

	public void setPr_dt(String pr_dt){
		this.pr_dt = pr_dt;
	}
	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}
	public void setCprdate(String cprdate){
		this.cprdate = cprdate;
	}
	public void setCdmedia(String cdmedia){
		this.cdmedia = cdmedia;
	}
	public void setCpansu(String cpansu) {
		this.cpansu = cpansu;
	}
	public void setCdcntry(String cdcntry) {
		this.cdcntry = cdcntry;
	}
	public void setIseqno(String iseqno) {
		this.iseqno = iseqno;
	}
	public void setIfdno(String ifdno) {
		this.ifdno = ifdno;
	}
	public void setIprpage(String iprpage) {
		this.iprpage = iprpage;
	}
	public void setCprout(String cprout) {
		this.cprout = cprout;
	}
	public void setCprfin(String cprfin) {
		this.cprfin = cprfin;
	}
	public void setLhdbusu(String lhdbusu) {
		this.lhdbusu = lhdbusu;
	}
	public void setLaddbusu(String laddbusu) {
		this.laddbusu = laddbusu;
	}
	public void setLprbusu(String lprbusu) {
		this.lprbusu = lprbusu;
	}
	public void setLbabusu(String lbabusu) {
		this.lbabusu = lbabusu;
	}
	public void setLaddo(String laddo) {
		this.laddo = laddo;
	}
	public void setLmins(String lmins) {
		this.lmins = lmins;
	}
	public void setCdfact(String cdfact) {
		this.cdfact = cdfact;
	}
	public void setCtrans(String ctrans) {
		this.ctrans = ctrans;
	}
	public void setInpause(String inpause) {
		this.inpause = inpause;
	}
	public void setCrpause(String crpause) {
		this.crpause = crpause;
	}
	public void setInabn(String inabn) {
		this.inabn = inabn;
	}
	public void setCrabn(String crabn) {
		this.crabn = crabn;
	}
	public void setCpabn(String cpabn) {
		this.cpabn = cpabn;
	}
	public void setIdanres1(String idanres1) {
		this.idanres1 = idanres1;
	}
	public void setIjungres1(String ijungres1) {
		this.ijungres1 = ijungres1;
	}
	public void setIdanres2(String idanres2) {
		this.idanres2 = idanres2;
	}
	public void setIjungres2(String ijungres2) {
		this.ijungres2 = ijungres2;
	}
	public void setCdummy(String cdummy) {
		this.cdummy = cdummy;
	}
	

	public String getPr_dt(){
		return this.pr_dt;
	}
	public String getCmpy_cd(){
		return this.cmpy_cd;
	}
	public String getCdmedia(){
		return this.cdmedia;
	}
	public String getCprdate(){
		return this.cprdate;
	}
	public String getCpansu() {
		return cpansu;
	}
	public String getCdcntry() {
		return cdcntry;
	}
	public String getIseqno() {
		return iseqno;
	}
	public String getIfdno() {
		return ifdno;
	}
	public String getIprpage() {
		return iprpage;
	}
	public String getCprout() {
		return cprout;
	}
	public String getCprfin() {
		return cprfin;
	}
	public String getLhdbusu() {
		return lhdbusu;
	}
	public String getLaddbusu() {
		return laddbusu;
	}
	public String getLprbusu() {
		return lprbusu;
	}
	public String getLbabusu() {
		return lbabusu;
	}
	public String getLaddo() {
		return laddo;
	}
	public String getLmins() {
		return lmins;
	}
	public String getCdfact() {
		return cdfact;
	}
	public String getCtrans() {
		return ctrans;
	}
	public String getInpause() {
		return inpause;
	}
	public String getCrpause() {
		return crpause;
	}
	public String getInabn() {
		return inabn;
	}
	public String getCrabn() {
		return crabn;
	}
	public String getCpabn() {
		return cpabn;
	}
	public String getIdanres1() {
		return idanres1;
	}
	public String getIjungres1() {
		return ijungres1;
	}
	public String getIdanres2() {
		return idanres2;
	}
	public String getIjungres2() {
		return ijungres2;
	}
	public String getCdummy() {
		return cdummy;
	}
	
	public String getSQL(){
		 return "";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		PR_SENDMG_1040_ADM dm = (PR_SENDMG_1040_ADM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.pr_dt);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.pr.sendmg.ds.PR_SENDMG_1039_LDataSet();
	}



	public void print(){
		System.out.println("SQL = " + this.getSQL());
		System.out.println("cmpy_cd = [" + getCmpy_cd() + "]");
		System.out.println("pr_dt = [" + getPr_dt() + "]");
		System.out.println("cdmedia = [" + getCdmedia() + "]");
		System.out.println("cprdate = [" + getCprdate() + "]");
		System.out.println("cpansu = [" + getCpansu() + "]");
		System.out.println("cdcntry = [" + getCdcntry() + "]");
		System.out.println("iseqno = [" + getIseqno() + "]");
		System.out.println("ifdno = [" + getIfdno() + "]");
		System.out.println("iprpage = [" + getIprpage() + "]");
		System.out.println("cprout = [" + getCprout() + "]");
		System.out.println("cprfin = [" + getCprfin() + "]");
		System.out.println("lhdbusu = [" + getLhdbusu() + "]");
		System.out.println("laddbusu = [" + getLaddbusu() + "]");
		System.out.println("lprbusu = [" + getLprbusu() + "]");
		System.out.println("lbabusu = [" + getLbabusu() + "]");
	}
	
	
	
	
}
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리 및 결과확인 검사시 사용하십시오.

String send_dt = req.getParameter("send_dt");
if( send_dt == null){
	System.out.println(this.toString+" : send_dt is null" );
}else{
	System.out.println(this.toString+" : send_dt is "+send_dt );
}
String cmpy_cd = req.getParameter("cmpy_cd");
if( cmpy_cd == null){
	System.out.println(this.toString+" : cmpy_cd is null" );
}else{
	System.out.println(this.toString+" : cmpy_cd is "+cmpy_cd );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리시 사용하십시오.

String send_dt = Util.checkString(req.getParameter("send_dt"));
String cmpy_cd = Util.checkString(req.getParameter("cmpy_cd"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String send_dt = Util.Uni2Ksc(Util.checkString(req.getParameter("send_dt")));
String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setSend_dt(send_dt);
dm.setCmpy_cd(cmpy_cd);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Wed Apr 29 16:42:00 KST 2009 */