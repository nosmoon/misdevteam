/***************************************************************************************************
* 파일명 : SS_U_LEASAMTDM.java
* 기능 : 지국Info-전세지원금-저장을 위한 DM
* 작성일자 : 2004-04-24
* 작성자 : 김대섭
***************************************************************************************************/
/***************************************************************************************************
* 수정내역 :
* 수정자 :
* 수정일자 :
* 백업 : 
***************************************************************************************************/

package chosun.ciis.ss.sls.brinfo.dm;

import java.sql.*;
import oracle.jdbc.driver.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.ss.sls.brinfo.ds.*;
import chosun.ciis.ss.sls.brinfo.rec.*;

/**
 * 지국Info-전세지원금-저장을 위한 DM
 */

public class SS_U_LEASAMTDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String incmgpers;
	public String deptcd;
	public String areacd;
	public String bocd;
	public String seq;
	public String bondregiconf;
	public String bondregi;
	public String bondwarrp;
	public String leascntrp;
	public String leasregi;
	public String leasexch_note;
	public String leasloandeed;
	public String prvoffideciddocuyn;
	public String curroffideciddocuyn;
	public String prvhdqtdeciddocuyn;
	public String currhdqtdeciddocuyn;
	public String remk;

	public SS_U_LEASAMTDM(){}
	public SS_U_LEASAMTDM(String incmgpers, String deptcd, String areacd, String bocd, String seq, String bondregiconf, String bondregi, String bondwarrp, String leascntrp, String leasregi, String leasexch_note, String leasloandeed, String prvoffideciddocuyn, String curroffideciddocuyn, String prvhdqtdeciddocuyn, String currhdqtdeciddocuyn, String remk){
		this.incmgpers = incmgpers;
		this.deptcd = deptcd;
		this.areacd = areacd;
		this.bocd = bocd;
		this.seq = seq;
		this.bondregiconf = bondregiconf;
		this.bondregi = bondregi;
		this.bondwarrp = bondwarrp;
		this.leascntrp = leascntrp;
		this.leasregi = leasregi;
		this.leasexch_note = leasexch_note;
		this.leasloandeed = leasloandeed;
		this.prvoffideciddocuyn = prvoffideciddocuyn;
		this.curroffideciddocuyn = curroffideciddocuyn;
		this.prvhdqtdeciddocuyn = prvhdqtdeciddocuyn;
		this.currhdqtdeciddocuyn = currhdqtdeciddocuyn;
		this.remk = remk;
	}

	public void setIncmgpers(String incmgpers){
		this.incmgpers = incmgpers;
	}

	public void setDeptcd(String deptcd){
		this.deptcd = deptcd;
	}

	public void setAreacd(String areacd){
		this.areacd = areacd;
	}

	public void setBocd(String bocd){
		this.bocd = bocd;
	}

	public void setSeq(String seq){
		this.seq = seq;
	}

	public void setBondregiconf(String bondregiconf){
		this.bondregiconf = bondregiconf;
	}

	public void setBondregi(String bondregi){
		this.bondregi = bondregi;
	}

	public void setBondwarrp(String bondwarrp){
		this.bondwarrp = bondwarrp;
	}

	public void setLeascntrp(String leascntrp){
		this.leascntrp = leascntrp;
	}

	public void setLeasregi(String leasregi){
		this.leasregi = leasregi;
	}

	public void setLeasexch_note(String leasexch_note){
		this.leasexch_note = leasexch_note;
	}

	public void setLeasloandeed(String leasloandeed){
		this.leasloandeed = leasloandeed;
	}

	public void setPrvoffideciddocuyn(String prvoffideciddocuyn){
		this.prvoffideciddocuyn = prvoffideciddocuyn;
	}

	public void setCurroffideciddocuyn(String curroffideciddocuyn){
		this.curroffideciddocuyn = curroffideciddocuyn;
	}

	public void setPrvhdqtdeciddocuyn(String prvhdqtdeciddocuyn){
		this.prvhdqtdeciddocuyn = prvhdqtdeciddocuyn;
	}

	public void setCurrhdqtdeciddocuyn(String currhdqtdeciddocuyn){
		this.currhdqtdeciddocuyn = currhdqtdeciddocuyn;
	}

	public void setRemk(String remk){
		this.remk = remk;
	}

	public String getIncmgpers(){
		return this.incmgpers;
	}

	public String getDeptcd(){
		return this.deptcd;
	}

	public String getAreacd(){
		return this.areacd;
	}

	public String getBocd(){
		return this.bocd;
	}

	public String getSeq(){
		return this.seq;
	}

	public String getBondregiconf(){
		return this.bondregiconf;
	}

	public String getBondregi(){
		return this.bondregi;
	}

	public String getBondwarrp(){
		return this.bondwarrp;
	}

	public String getLeascntrp(){
		return this.leascntrp;
	}

	public String getLeasregi(){
		return this.leasregi;
	}

	public String getLeasexch_note(){
		return this.leasexch_note;
	}

	public String getLeasloandeed(){
		return this.leasloandeed;
	}

	public String getPrvoffideciddocuyn(){
		return this.prvoffideciddocuyn;
	}

	public String getCurroffideciddocuyn(){
		return this.curroffideciddocuyn;
	}

	public String getPrvhdqtdeciddocuyn(){
		return this.prvhdqtdeciddocuyn;
	}

	public String getCurrhdqtdeciddocuyn(){
		return this.currhdqtdeciddocuyn;
	}

	public String getRemk(){
		return this.remk;
	}

	public String getSQL(){
		 return "{ call SP_SS_U_LEASAMT( ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		SS_U_LEASAMTDM dm = (SS_U_LEASAMTDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.incmgpers);
		cstmt.setString(4, dm.deptcd);
		cstmt.setString(5, dm.areacd);
		cstmt.setString(6, dm.bocd);
		cstmt.setString(7, dm.seq);
		cstmt.setString(8, dm.bondregiconf);
		cstmt.setString(9, dm.bondregi);
		cstmt.setString(10, dm.bondwarrp);
		cstmt.setString(11, dm.leascntrp);
		cstmt.setString(12, dm.leasregi);
		cstmt.setString(13, dm.leasexch_note);
		cstmt.setString(14, dm.leasloandeed);
		cstmt.setString(15, dm.prvoffideciddocuyn);
		cstmt.setString(16, dm.curroffideciddocuyn);
		cstmt.setString(17, dm.prvhdqtdeciddocuyn);
		cstmt.setString(18, dm.currhdqtdeciddocuyn);
		cstmt.setString(19, dm.remk);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.ss.sls.brinfo.ds.SS_U_LEASAMTDataSet();
	}
}
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리 및 결과확인 검사시 사용하십시오.

String incmgpers = req.getParameter("incmgpers");
if( incmgpers == null){
	System.out.println(this.toString+" : incmgpers is null" );
}else{
	System.out.println(this.toString+" : incmgpers is "+incmgpers );
}
String deptcd = req.getParameter("deptcd");
if( deptcd == null){
	System.out.println(this.toString+" : deptcd is null" );
}else{
	System.out.println(this.toString+" : deptcd is "+deptcd );
}
String areacd = req.getParameter("areacd");
if( areacd == null){
	System.out.println(this.toString+" : areacd is null" );
}else{
	System.out.println(this.toString+" : areacd is "+areacd );
}
String bocd = req.getParameter("bocd");
if( bocd == null){
	System.out.println(this.toString+" : bocd is null" );
}else{
	System.out.println(this.toString+" : bocd is "+bocd );
}
String seq = req.getParameter("seq");
if( seq == null){
	System.out.println(this.toString+" : seq is null" );
}else{
	System.out.println(this.toString+" : seq is "+seq );
}
String bondregiconf = req.getParameter("bondregiconf");
if( bondregiconf == null){
	System.out.println(this.toString+" : bondregiconf is null" );
}else{
	System.out.println(this.toString+" : bondregiconf is "+bondregiconf );
}
String bondregi = req.getParameter("bondregi");
if( bondregi == null){
	System.out.println(this.toString+" : bondregi is null" );
}else{
	System.out.println(this.toString+" : bondregi is "+bondregi );
}
String bondwarrp = req.getParameter("bondwarrp");
if( bondwarrp == null){
	System.out.println(this.toString+" : bondwarrp is null" );
}else{
	System.out.println(this.toString+" : bondwarrp is "+bondwarrp );
}
String leascntrp = req.getParameter("leascntrp");
if( leascntrp == null){
	System.out.println(this.toString+" : leascntrp is null" );
}else{
	System.out.println(this.toString+" : leascntrp is "+leascntrp );
}
String leasregi = req.getParameter("leasregi");
if( leasregi == null){
	System.out.println(this.toString+" : leasregi is null" );
}else{
	System.out.println(this.toString+" : leasregi is "+leasregi );
}
String leasexch_note = req.getParameter("leasexch_note");
if( leasexch_note == null){
	System.out.println(this.toString+" : leasexch_note is null" );
}else{
	System.out.println(this.toString+" : leasexch_note is "+leasexch_note );
}
String leasloandeed = req.getParameter("leasloandeed");
if( leasloandeed == null){
	System.out.println(this.toString+" : leasloandeed is null" );
}else{
	System.out.println(this.toString+" : leasloandeed is "+leasloandeed );
}
String prvoffideciddocuyn = req.getParameter("prvoffideciddocuyn");
if( prvoffideciddocuyn == null){
	System.out.println(this.toString+" : prvoffideciddocuyn is null" );
}else{
	System.out.println(this.toString+" : prvoffideciddocuyn is "+prvoffideciddocuyn );
}
String curroffideciddocuyn = req.getParameter("curroffideciddocuyn");
if( curroffideciddocuyn == null){
	System.out.println(this.toString+" : curroffideciddocuyn is null" );
}else{
	System.out.println(this.toString+" : curroffideciddocuyn is "+curroffideciddocuyn );
}
String prvhdqtdeciddocuyn = req.getParameter("prvhdqtdeciddocuyn");
if( prvhdqtdeciddocuyn == null){
	System.out.println(this.toString+" : prvhdqtdeciddocuyn is null" );
}else{
	System.out.println(this.toString+" : prvhdqtdeciddocuyn is "+prvhdqtdeciddocuyn );
}
String currhdqtdeciddocuyn = req.getParameter("currhdqtdeciddocuyn");
if( currhdqtdeciddocuyn == null){
	System.out.println(this.toString+" : currhdqtdeciddocuyn is null" );
}else{
	System.out.println(this.toString+" : currhdqtdeciddocuyn is "+currhdqtdeciddocuyn );
}
String remk = req.getParameter("remk");
if( remk == null){
	System.out.println(this.toString+" : remk is null" );
}else{
	System.out.println(this.toString+" : remk is "+remk );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리시 사용하십시오.

String incmgpers = Util.checkString(req.getParameter("incmgpers"));
String deptcd = Util.checkString(req.getParameter("deptcd"));
String areacd = Util.checkString(req.getParameter("areacd"));
String bocd = Util.checkString(req.getParameter("bocd"));
String seq = Util.checkString(req.getParameter("seq"));
String bondregiconf = Util.checkString(req.getParameter("bondregiconf"));
String bondregi = Util.checkString(req.getParameter("bondregi"));
String bondwarrp = Util.checkString(req.getParameter("bondwarrp"));
String leascntrp = Util.checkString(req.getParameter("leascntrp"));
String leasregi = Util.checkString(req.getParameter("leasregi"));
String leasexch_note = Util.checkString(req.getParameter("leasexch_note"));
String leasloandeed = Util.checkString(req.getParameter("leasloandeed"));
String prvoffideciddocuyn = Util.checkString(req.getParameter("prvoffideciddocuyn"));
String curroffideciddocuyn = Util.checkString(req.getParameter("curroffideciddocuyn"));
String prvhdqtdeciddocuyn = Util.checkString(req.getParameter("prvhdqtdeciddocuyn"));
String currhdqtdeciddocuyn = Util.checkString(req.getParameter("currhdqtdeciddocuyn"));
String remk = Util.checkString(req.getParameter("remk"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String incmgpers = Util.Uni2Ksc(Util.checkString(req.getParameter("incmgpers")));
String deptcd = Util.Uni2Ksc(Util.checkString(req.getParameter("deptcd")));
String areacd = Util.Uni2Ksc(Util.checkString(req.getParameter("areacd")));
String bocd = Util.Uni2Ksc(Util.checkString(req.getParameter("bocd")));
String seq = Util.Uni2Ksc(Util.checkString(req.getParameter("seq")));
String bondregiconf = Util.Uni2Ksc(Util.checkString(req.getParameter("bondregiconf")));
String bondregi = Util.Uni2Ksc(Util.checkString(req.getParameter("bondregi")));
String bondwarrp = Util.Uni2Ksc(Util.checkString(req.getParameter("bondwarrp")));
String leascntrp = Util.Uni2Ksc(Util.checkString(req.getParameter("leascntrp")));
String leasregi = Util.Uni2Ksc(Util.checkString(req.getParameter("leasregi")));
String leasexch_note = Util.Uni2Ksc(Util.checkString(req.getParameter("leasexch_note")));
String leasloandeed = Util.Uni2Ksc(Util.checkString(req.getParameter("leasloandeed")));
String prvoffideciddocuyn = Util.Uni2Ksc(Util.checkString(req.getParameter("prvoffideciddocuyn")));
String curroffideciddocuyn = Util.Uni2Ksc(Util.checkString(req.getParameter("curroffideciddocuyn")));
String prvhdqtdeciddocuyn = Util.Uni2Ksc(Util.checkString(req.getParameter("prvhdqtdeciddocuyn")));
String currhdqtdeciddocuyn = Util.Uni2Ksc(Util.checkString(req.getParameter("currhdqtdeciddocuyn")));
String remk = Util.Uni2Ksc(Util.checkString(req.getParameter("remk")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setIncmgpers(incmgpers);
dm.setDeptcd(deptcd);
dm.setAreacd(areacd);
dm.setBocd(bocd);
dm.setSeq(seq);
dm.setBondregiconf(bondregiconf);
dm.setBondregi(bondregi);
dm.setBondwarrp(bondwarrp);
dm.setLeascntrp(leascntrp);
dm.setLeasregi(leasregi);
dm.setLeasexch_note(leasexch_note);
dm.setLeasloandeed(leasloandeed);
dm.setPrvoffideciddocuyn(prvoffideciddocuyn);
dm.setCurroffideciddocuyn(curroffideciddocuyn);
dm.setPrvhdqtdeciddocuyn(prvhdqtdeciddocuyn);
dm.setCurrhdqtdeciddocuyn(currhdqtdeciddocuyn);
dm.setRemk(remk);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Fri May 21 19:45:40 KST 2004 */