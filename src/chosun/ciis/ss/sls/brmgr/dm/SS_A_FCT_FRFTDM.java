/***************************************************************************************************
* 파일명 : .java
* 기능 : 지국경영-공정위 위약금 입력 화면
* 작성일자 : 2004-03-24
* 작성자 : 김성규
***************************************************************************************************/
/***************************************************************************************************
* 수정내역 :
* 수정자 :
* 수정일자 :
* 백업 : 
***************************************************************************************************/


package chosun.ciis.ss.sls.brmgr.dm;

import java.sql.*;
import oracle.jdbc.driver.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.ss.sls.brmgr.ds.*;
import chosun.ciis.ss.sls.brmgr.rec.*;

/**
 * 지국경영-공정위 위약금 입력 화면
 *
 */


public class SS_A_FCT_FRFTDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String accflag;
	public String incmgpers;
	public String deptcd;
	public String areacd;
	public String bocd;
	public long viltnoit;
	public String impndt;
	public String rdrnm;
	public long frftimpnamt;
	public long resamt;
	public String delbocom;
	public String viltresn;
	public long hdqtrcpmamt;
	public String hdqtrcpmdt;
	public long hdqtun_pymtamt;
	public long borcpmamt;
	public String borcpmdt;
	public long boun_pymtamt;

	public SS_A_FCT_FRFTDM(){}
	public SS_A_FCT_FRFTDM(String accflag, String incmgpers, String deptcd, String areacd, String bocd, long viltnoit, String impndt, String rdrnm, long frftimpnamt, long resamt, String delbocom, String viltresn, long hdqtrcpmamt, String hdqtrcpmdt, long hdqtun_pymtamt, long borcpmamt, String borcpmdt, long boun_pymtamt){
		this.accflag = accflag;
		this.incmgpers = incmgpers;
		this.deptcd = deptcd;
		this.areacd = areacd;
		this.bocd = bocd;
		this.viltnoit = viltnoit;
		this.impndt = impndt;
		this.rdrnm = rdrnm;
		this.frftimpnamt = frftimpnamt;
		this.resamt = resamt;
		this.delbocom = delbocom;
		this.viltresn = viltresn;
		this.hdqtrcpmamt = hdqtrcpmamt;
		this.hdqtrcpmdt = hdqtrcpmdt;
		this.hdqtun_pymtamt = hdqtun_pymtamt;
		this.borcpmamt = borcpmamt;
		this.borcpmdt = borcpmdt;
		this.boun_pymtamt = boun_pymtamt;
	}

	public void setAccflag(String accflag){
		this.accflag = accflag;
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

	public void setViltnoit(long viltnoit){
		this.viltnoit = viltnoit;
	}

	public void setImpndt(String impndt){
		this.impndt = impndt;
	}

	public void setRdrnm(String rdrnm){
		this.rdrnm = rdrnm;
	}

	public void setFrftimpnamt(long frftimpnamt){
		this.frftimpnamt = frftimpnamt;
	}

	public void setResamt(long resamt){
		this.resamt = resamt;
	}

	public void setDelbocom(String delbocom){
		this.delbocom = delbocom;
	}

	public void setViltresn(String viltresn){
		this.viltresn = viltresn;
	}

	public void setHdqtrcpmamt(long hdqtrcpmamt){
		this.hdqtrcpmamt = hdqtrcpmamt;
	}

	public void setHdqtrcpmdt(String hdqtrcpmdt){
		this.hdqtrcpmdt = hdqtrcpmdt;
	}

	public void setHdqtun_pymtamt(long hdqtun_pymtamt){
		this.hdqtun_pymtamt = hdqtun_pymtamt;
	}

	public void setBorcpmamt(long borcpmamt){
		this.borcpmamt = borcpmamt;
	}

	public void setBorcpmdt(String borcpmdt){
		this.borcpmdt = borcpmdt;
	}

	public void setBoun_pymtamt(long boun_pymtamt){
		this.boun_pymtamt = boun_pymtamt;
	}

	public String getAccflag(){
		return this.accflag;
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

	public long getViltnoit(){
		return this.viltnoit;
	}

	public String getImpndt(){
		return this.impndt;
	}

	public String getRdrnm(){
		return this.rdrnm;
	}

	public long getFrftimpnamt(){
		return this.frftimpnamt;
	}

	public long getResamt(){
		return this.resamt;
	}

	public String getDelbocom(){
		return this.delbocom;
	}

	public String getViltresn(){
		return this.viltresn;
	}

	public long getHdqtrcpmamt(){
		return this.hdqtrcpmamt;
	}

	public String getHdqtrcpmdt(){
		return this.hdqtrcpmdt;
	}

	public long getHdqtun_pymtamt(){
		return this.hdqtun_pymtamt;
	}

	public long getBorcpmamt(){
		return this.borcpmamt;
	}

	public String getBorcpmdt(){
		return this.borcpmdt;
	}

	public long getBoun_pymtamt(){
		return this.boun_pymtamt;
	}

	public String getSQL(){
		 return "{ call SP_SS_A_FCT_FRFT( ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		SS_A_FCT_FRFTDM dm = (SS_A_FCT_FRFTDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.accflag);
		cstmt.setString(4, dm.incmgpers);
		cstmt.setString(5, dm.deptcd);
		cstmt.setString(6, dm.areacd);
		cstmt.setString(7, dm.bocd);
		cstmt.setLong(8, dm.viltnoit);
		cstmt.setString(9, dm.impndt);
		cstmt.setString(10, dm.rdrnm);
		cstmt.setLong(11, dm.frftimpnamt);
		cstmt.setLong(12, dm.resamt);
		cstmt.setString(13, dm.delbocom);
		cstmt.setString(14, dm.viltresn);
		cstmt.setLong(15, dm.hdqtrcpmamt);
		cstmt.setString(16, dm.hdqtrcpmdt);
		cstmt.setLong(17, dm.hdqtun_pymtamt);
		cstmt.setLong(18, dm.borcpmamt);
		cstmt.setString(19, dm.borcpmdt);
		cstmt.setLong(20, dm.boun_pymtamt);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.ss.sls.brmgr.ds.SS_A_FCT_FRFTDataSet();
	}
}
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리 및 결과확인 검사시 사용하십시오.

String accflag = req.getParameter("accflag");
if( accflag == null){
	System.out.println(this.toString+" : accflag is null" );
}else{
	System.out.println(this.toString+" : accflag is "+accflag );
}
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
String viltnoit = req.getParameter("viltnoit");
if( viltnoit == null){
	System.out.println(this.toString+" : viltnoit is null" );
}else{
	System.out.println(this.toString+" : viltnoit is "+viltnoit );
}
String impndt = req.getParameter("impndt");
if( impndt == null){
	System.out.println(this.toString+" : impndt is null" );
}else{
	System.out.println(this.toString+" : impndt is "+impndt );
}
String rdrnm = req.getParameter("rdrnm");
if( rdrnm == null){
	System.out.println(this.toString+" : rdrnm is null" );
}else{
	System.out.println(this.toString+" : rdrnm is "+rdrnm );
}
String frftimpnamt = req.getParameter("frftimpnamt");
if( frftimpnamt == null){
	System.out.println(this.toString+" : frftimpnamt is null" );
}else{
	System.out.println(this.toString+" : frftimpnamt is "+frftimpnamt );
}
String resamt = req.getParameter("resamt");
if( resamt == null){
	System.out.println(this.toString+" : resamt is null" );
}else{
	System.out.println(this.toString+" : resamt is "+resamt );
}
String delbocom = req.getParameter("delbocom");
if( delbocom == null){
	System.out.println(this.toString+" : delbocom is null" );
}else{
	System.out.println(this.toString+" : delbocom is "+delbocom );
}
String viltresn = req.getParameter("viltresn");
if( viltresn == null){
	System.out.println(this.toString+" : viltresn is null" );
}else{
	System.out.println(this.toString+" : viltresn is "+viltresn );
}
String hdqtrcpmamt = req.getParameter("hdqtrcpmamt");
if( hdqtrcpmamt == null){
	System.out.println(this.toString+" : hdqtrcpmamt is null" );
}else{
	System.out.println(this.toString+" : hdqtrcpmamt is "+hdqtrcpmamt );
}
String hdqtrcpmdt = req.getParameter("hdqtrcpmdt");
if( hdqtrcpmdt == null){
	System.out.println(this.toString+" : hdqtrcpmdt is null" );
}else{
	System.out.println(this.toString+" : hdqtrcpmdt is "+hdqtrcpmdt );
}
String hdqtun_pymtamt = req.getParameter("hdqtun_pymtamt");
if( hdqtun_pymtamt == null){
	System.out.println(this.toString+" : hdqtun_pymtamt is null" );
}else{
	System.out.println(this.toString+" : hdqtun_pymtamt is "+hdqtun_pymtamt );
}
String borcpmamt = req.getParameter("borcpmamt");
if( borcpmamt == null){
	System.out.println(this.toString+" : borcpmamt is null" );
}else{
	System.out.println(this.toString+" : borcpmamt is "+borcpmamt );
}
String borcpmdt = req.getParameter("borcpmdt");
if( borcpmdt == null){
	System.out.println(this.toString+" : borcpmdt is null" );
}else{
	System.out.println(this.toString+" : borcpmdt is "+borcpmdt );
}
String boun_pymtamt = req.getParameter("boun_pymtamt");
if( boun_pymtamt == null){
	System.out.println(this.toString+" : boun_pymtamt is null" );
}else{
	System.out.println(this.toString+" : boun_pymtamt is "+boun_pymtamt );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리시 사용하십시오.

String accflag = Util.checkString(req.getParameter("accflag"));
String incmgpers = Util.checkString(req.getParameter("incmgpers"));
String deptcd = Util.checkString(req.getParameter("deptcd"));
String areacd = Util.checkString(req.getParameter("areacd"));
String bocd = Util.checkString(req.getParameter("bocd"));
String viltnoit = Util.checkString(req.getParameter("viltnoit"));
String impndt = Util.checkString(req.getParameter("impndt"));
String rdrnm = Util.checkString(req.getParameter("rdrnm"));
String frftimpnamt = Util.checkString(req.getParameter("frftimpnamt"));
String resamt = Util.checkString(req.getParameter("resamt"));
String delbocom = Util.checkString(req.getParameter("delbocom"));
String viltresn = Util.checkString(req.getParameter("viltresn"));
String hdqtrcpmamt = Util.checkString(req.getParameter("hdqtrcpmamt"));
String hdqtrcpmdt = Util.checkString(req.getParameter("hdqtrcpmdt"));
String hdqtun_pymtamt = Util.checkString(req.getParameter("hdqtun_pymtamt"));
String borcpmamt = Util.checkString(req.getParameter("borcpmamt"));
String borcpmdt = Util.checkString(req.getParameter("borcpmdt"));
String boun_pymtamt = Util.checkString(req.getParameter("boun_pymtamt"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String accflag = Util.Uni2Ksc(Util.checkString(req.getParameter("accflag")));
String incmgpers = Util.Uni2Ksc(Util.checkString(req.getParameter("incmgpers")));
String deptcd = Util.Uni2Ksc(Util.checkString(req.getParameter("deptcd")));
String areacd = Util.Uni2Ksc(Util.checkString(req.getParameter("areacd")));
String bocd = Util.Uni2Ksc(Util.checkString(req.getParameter("bocd")));
String viltnoit = Util.Uni2Ksc(Util.checkString(req.getParameter("viltnoit")));
String impndt = Util.Uni2Ksc(Util.checkString(req.getParameter("impndt")));
String rdrnm = Util.Uni2Ksc(Util.checkString(req.getParameter("rdrnm")));
String frftimpnamt = Util.Uni2Ksc(Util.checkString(req.getParameter("frftimpnamt")));
String resamt = Util.Uni2Ksc(Util.checkString(req.getParameter("resamt")));
String delbocom = Util.Uni2Ksc(Util.checkString(req.getParameter("delbocom")));
String viltresn = Util.Uni2Ksc(Util.checkString(req.getParameter("viltresn")));
String hdqtrcpmamt = Util.Uni2Ksc(Util.checkString(req.getParameter("hdqtrcpmamt")));
String hdqtrcpmdt = Util.Uni2Ksc(Util.checkString(req.getParameter("hdqtrcpmdt")));
String hdqtun_pymtamt = Util.Uni2Ksc(Util.checkString(req.getParameter("hdqtun_pymtamt")));
String borcpmamt = Util.Uni2Ksc(Util.checkString(req.getParameter("borcpmamt")));
String borcpmdt = Util.Uni2Ksc(Util.checkString(req.getParameter("borcpmdt")));
String boun_pymtamt = Util.Uni2Ksc(Util.checkString(req.getParameter("boun_pymtamt")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setAccflag(accflag);
dm.setIncmgpers(incmgpers);
dm.setDeptcd(deptcd);
dm.setAreacd(areacd);
dm.setBocd(bocd);
dm.setViltnoit(viltnoit);
dm.setImpndt(impndt);
dm.setRdrnm(rdrnm);
dm.setFrftimpnamt(frftimpnamt);
dm.setResamt(resamt);
dm.setDelbocom(delbocom);
dm.setViltresn(viltresn);
dm.setHdqtrcpmamt(hdqtrcpmamt);
dm.setHdqtrcpmdt(hdqtrcpmdt);
dm.setHdqtun_pymtamt(hdqtun_pymtamt);
dm.setBorcpmamt(borcpmamt);
dm.setBorcpmdt(borcpmdt);
dm.setBoun_pymtamt(boun_pymtamt);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Wed Mar 24 16:23:59 KST 2004 */