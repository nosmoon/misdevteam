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


package chosun.ciis.mt.etcpc.dm;

import java.sql.*;
import oracle.jdbc.driver.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.mt.etcpc.ds.*;
import chosun.ciis.mt.etcpc.rec.*;

/**
 * 
 */


public class MT_ETCPC_3002_ADM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String cmpy_cd;
	public String swmang_no;
	public String swnm;
	public String swkind;
	public String swver;
	public String use_usag;
	public String buy_dt;
	public String buy_draft_dept;
	public String buy_draft_no;
	public String swlics_cnt;
	public String make_cmpy;
	public String gds_key;
	public String lics_certi_no;
	public String remk;
	public String incmg_pers_ipaddr;
	public String incmg_pers;
	public String gubun;

	public MT_ETCPC_3002_ADM(){}
	public MT_ETCPC_3002_ADM(String cmpy_cd, String swmang_no, String swnm, String swkind, String swver, String use_usag, String buy_dt, String buy_draft_dept, String buy_draft_no, String swlics_cnt, String make_cmpy, String gds_key, String lics_certi_no, String remk, String incmg_pers_ipaddr, String incmg_pers, String gubun){
		this.cmpy_cd = cmpy_cd;
		this.swmang_no = swmang_no;
		this.swnm = swnm;
		this.swkind = swkind;
		this.swver = swver;
		this.use_usag = use_usag;
		this.buy_dt = buy_dt;
		this.buy_draft_dept = buy_draft_dept;
		this.buy_draft_no = buy_draft_no;
		this.swlics_cnt = swlics_cnt;
		this.make_cmpy = make_cmpy;
		this.gds_key = gds_key;
		this.lics_certi_no = lics_certi_no;
		this.remk = remk;
		this.incmg_pers_ipaddr = incmg_pers_ipaddr;
		this.incmg_pers = incmg_pers;
		this.gubun = gubun;
	}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setSwmang_no(String swmang_no){
		this.swmang_no = swmang_no;
	}

	public void setSwnm(String swnm){
		this.swnm = swnm;
	}

	public void setSwkind(String swkind){
		this.swkind = swkind;
	}

	public void setSwver(String swver){
		this.swver = swver;
	}

	public void setUse_usag(String use_usag){
		this.use_usag = use_usag;
	}

	public void setBuy_dt(String buy_dt){
		this.buy_dt = buy_dt;
	}

	public void setBuy_draft_dept(String buy_draft_dept){
		this.buy_draft_dept = buy_draft_dept;
	}

	public void setBuy_draft_no(String buy_draft_no){
		this.buy_draft_no = buy_draft_no;
	}

	public void setSwlics_cnt(String swlics_cnt){
		this.swlics_cnt = swlics_cnt;
	}

	public void setMake_cmpy(String make_cmpy){
		this.make_cmpy = make_cmpy;
	}

	public void setGds_key(String gds_key){
		this.gds_key = gds_key;
	}

	public void setLics_certi_no(String lics_certi_no){
		this.lics_certi_no = lics_certi_no;
	}

	public void setRemk(String remk){
		this.remk = remk;
	}

	public void setIncmg_pers_ipaddr(String incmg_pers_ipaddr){
		this.incmg_pers_ipaddr = incmg_pers_ipaddr;
	}

	public void setIncmg_pers(String incmg_pers){
		this.incmg_pers = incmg_pers;
	}

	public void setGubun(String gubun){
		this.gubun = gubun;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getSwmang_no(){
		return this.swmang_no;
	}

	public String getSwnm(){
		return this.swnm;
	}

	public String getSwkind(){
		return this.swkind;
	}

	public String getSwver(){
		return this.swver;
	}

	public String getUse_usag(){
		return this.use_usag;
	}

	public String getBuy_dt(){
		return this.buy_dt;
	}

	public String getBuy_draft_dept(){
		return this.buy_draft_dept;
	}

	public String getBuy_draft_no(){
		return this.buy_draft_no;
	}

	public String getSwlics_cnt(){
		return this.swlics_cnt;
	}

	public String getMake_cmpy(){
		return this.make_cmpy;
	}

	public String getGds_key(){
		return this.gds_key;
	}

	public String getLics_certi_no(){
		return this.lics_certi_no;
	}

	public String getRemk(){
		return this.remk;
	}

	public String getIncmg_pers_ipaddr(){
		return this.incmg_pers_ipaddr;
	}

	public String getIncmg_pers(){
		return this.incmg_pers;
	}

	public String getGubun(){
		return this.gubun;
	}

	public String getSQL(){
		 return "{ call MISMAT.SP_MT_ETCPC_3002_A(? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		MT_ETCPC_3002_ADM dm = (MT_ETCPC_3002_ADM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.cmpy_cd);
		cstmt.setString(4, dm.swmang_no);
		cstmt.setString(5, dm.swnm);
		cstmt.setString(6, dm.swkind);
		cstmt.setString(7, dm.swver);
		cstmt.setString(8, dm.use_usag);
		cstmt.setString(9, dm.buy_dt);
		cstmt.setString(10, dm.buy_draft_dept);
		cstmt.setString(11, dm.buy_draft_no);
		cstmt.setString(12, dm.swlics_cnt);
		cstmt.setString(13, dm.make_cmpy);
		cstmt.setString(14, dm.gds_key);
		cstmt.setString(15, dm.lics_certi_no);
		cstmt.setString(16, dm.remk);
		cstmt.setString(17, dm.incmg_pers_ipaddr);
		cstmt.setString(18, dm.incmg_pers);
		cstmt.setString(19, dm.gubun);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.mt.etcpc.ds.MT_ETCPC_3002_ADataSet();
	}



	public void print(){
		System.out.println("SQL = " + this.getSQL());
		System.out.println("cmpy_cd = [" + getCmpy_cd() + "]");
		System.out.println("swmang_no = [" + getSwmang_no() + "]");
		System.out.println("swnm = [" + getSwnm() + "]");
		System.out.println("swkind = [" + getSwkind() + "]");
		System.out.println("swver = [" + getSwver() + "]");
		System.out.println("use_usag = [" + getUse_usag() + "]");
		System.out.println("buy_dt = [" + getBuy_dt() + "]");
		System.out.println("buy_draft_dept = [" + getBuy_draft_dept() + "]");
		System.out.println("buy_draft_no = [" + getBuy_draft_no() + "]");
		System.out.println("swlics_cnt = [" + getSwlics_cnt() + "]");
		System.out.println("make_cmpy = [" + getMake_cmpy() + "]");
		System.out.println("gds_key = [" + getGds_key() + "]");
		System.out.println("lics_certi_no = [" + getLics_certi_no() + "]");
		System.out.println("remk = [" + getRemk() + "]");
		System.out.println("incmg_pers_ipaddr = [" + getIncmg_pers_ipaddr() + "]");
		System.out.println("incmg_pers = [" + getIncmg_pers() + "]");
		System.out.println("gubun = [" + getGubun() + "]");
	}
}
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리 및 결과확인 검사시 사용하십시오.

String cmpy_cd = req.getParameter("cmpy_cd");
if( cmpy_cd == null){
	System.out.println(this.toString+" : cmpy_cd is null" );
}else{
	System.out.println(this.toString+" : cmpy_cd is "+cmpy_cd );
}
String swmang_no = req.getParameter("swmang_no");
if( swmang_no == null){
	System.out.println(this.toString+" : swmang_no is null" );
}else{
	System.out.println(this.toString+" : swmang_no is "+swmang_no );
}
String swnm = req.getParameter("swnm");
if( swnm == null){
	System.out.println(this.toString+" : swnm is null" );
}else{
	System.out.println(this.toString+" : swnm is "+swnm );
}
String swkind = req.getParameter("swkind");
if( swkind == null){
	System.out.println(this.toString+" : swkind is null" );
}else{
	System.out.println(this.toString+" : swkind is "+swkind );
}
String swver = req.getParameter("swver");
if( swver == null){
	System.out.println(this.toString+" : swver is null" );
}else{
	System.out.println(this.toString+" : swver is "+swver );
}
String use_usag = req.getParameter("use_usag");
if( use_usag == null){
	System.out.println(this.toString+" : use_usag is null" );
}else{
	System.out.println(this.toString+" : use_usag is "+use_usag );
}
String buy_dt = req.getParameter("buy_dt");
if( buy_dt == null){
	System.out.println(this.toString+" : buy_dt is null" );
}else{
	System.out.println(this.toString+" : buy_dt is "+buy_dt );
}
String buy_draft_dept = req.getParameter("buy_draft_dept");
if( buy_draft_dept == null){
	System.out.println(this.toString+" : buy_draft_dept is null" );
}else{
	System.out.println(this.toString+" : buy_draft_dept is "+buy_draft_dept );
}
String buy_draft_no = req.getParameter("buy_draft_no");
if( buy_draft_no == null){
	System.out.println(this.toString+" : buy_draft_no is null" );
}else{
	System.out.println(this.toString+" : buy_draft_no is "+buy_draft_no );
}
String swlics_cnt = req.getParameter("swlics_cnt");
if( swlics_cnt == null){
	System.out.println(this.toString+" : swlics_cnt is null" );
}else{
	System.out.println(this.toString+" : swlics_cnt is "+swlics_cnt );
}
String make_cmpy = req.getParameter("make_cmpy");
if( make_cmpy == null){
	System.out.println(this.toString+" : make_cmpy is null" );
}else{
	System.out.println(this.toString+" : make_cmpy is "+make_cmpy );
}
String gds_key = req.getParameter("gds_key");
if( gds_key == null){
	System.out.println(this.toString+" : gds_key is null" );
}else{
	System.out.println(this.toString+" : gds_key is "+gds_key );
}
String lics_certi_no = req.getParameter("lics_certi_no");
if( lics_certi_no == null){
	System.out.println(this.toString+" : lics_certi_no is null" );
}else{
	System.out.println(this.toString+" : lics_certi_no is "+lics_certi_no );
}
String remk = req.getParameter("remk");
if( remk == null){
	System.out.println(this.toString+" : remk is null" );
}else{
	System.out.println(this.toString+" : remk is "+remk );
}
String incmg_pers_ipaddr = req.getParameter("incmg_pers_ipaddr");
if( incmg_pers_ipaddr == null){
	System.out.println(this.toString+" : incmg_pers_ipaddr is null" );
}else{
	System.out.println(this.toString+" : incmg_pers_ipaddr is "+incmg_pers_ipaddr );
}
String incmg_pers = req.getParameter("incmg_pers");
if( incmg_pers == null){
	System.out.println(this.toString+" : incmg_pers is null" );
}else{
	System.out.println(this.toString+" : incmg_pers is "+incmg_pers );
}
String gubun = req.getParameter("gubun");
if( gubun == null){
	System.out.println(this.toString+" : gubun is null" );
}else{
	System.out.println(this.toString+" : gubun is "+gubun );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.checkString(req.getParameter("cmpy_cd"));
String swmang_no = Util.checkString(req.getParameter("swmang_no"));
String swnm = Util.checkString(req.getParameter("swnm"));
String swkind = Util.checkString(req.getParameter("swkind"));
String swver = Util.checkString(req.getParameter("swver"));
String use_usag = Util.checkString(req.getParameter("use_usag"));
String buy_dt = Util.checkString(req.getParameter("buy_dt"));
String buy_draft_dept = Util.checkString(req.getParameter("buy_draft_dept"));
String buy_draft_no = Util.checkString(req.getParameter("buy_draft_no"));
String swlics_cnt = Util.checkString(req.getParameter("swlics_cnt"));
String make_cmpy = Util.checkString(req.getParameter("make_cmpy"));
String gds_key = Util.checkString(req.getParameter("gds_key"));
String lics_certi_no = Util.checkString(req.getParameter("lics_certi_no"));
String remk = Util.checkString(req.getParameter("remk"));
String incmg_pers_ipaddr = Util.checkString(req.getParameter("incmg_pers_ipaddr"));
String incmg_pers = Util.checkString(req.getParameter("incmg_pers"));
String gubun = Util.checkString(req.getParameter("gubun"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String swmang_no = Util.Uni2Ksc(Util.checkString(req.getParameter("swmang_no")));
String swnm = Util.Uni2Ksc(Util.checkString(req.getParameter("swnm")));
String swkind = Util.Uni2Ksc(Util.checkString(req.getParameter("swkind")));
String swver = Util.Uni2Ksc(Util.checkString(req.getParameter("swver")));
String use_usag = Util.Uni2Ksc(Util.checkString(req.getParameter("use_usag")));
String buy_dt = Util.Uni2Ksc(Util.checkString(req.getParameter("buy_dt")));
String buy_draft_dept = Util.Uni2Ksc(Util.checkString(req.getParameter("buy_draft_dept")));
String buy_draft_no = Util.Uni2Ksc(Util.checkString(req.getParameter("buy_draft_no")));
String swlics_cnt = Util.Uni2Ksc(Util.checkString(req.getParameter("swlics_cnt")));
String make_cmpy = Util.Uni2Ksc(Util.checkString(req.getParameter("make_cmpy")));
String gds_key = Util.Uni2Ksc(Util.checkString(req.getParameter("gds_key")));
String lics_certi_no = Util.Uni2Ksc(Util.checkString(req.getParameter("lics_certi_no")));
String remk = Util.Uni2Ksc(Util.checkString(req.getParameter("remk")));
String incmg_pers_ipaddr = Util.Uni2Ksc(Util.checkString(req.getParameter("incmg_pers_ipaddr")));
String incmg_pers = Util.Uni2Ksc(Util.checkString(req.getParameter("incmg_pers")));
String gubun = Util.Uni2Ksc(Util.checkString(req.getParameter("gubun")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setCmpy_cd(cmpy_cd);
dm.setSwmang_no(swmang_no);
dm.setSwnm(swnm);
dm.setSwkind(swkind);
dm.setSwver(swver);
dm.setUse_usag(use_usag);
dm.setBuy_dt(buy_dt);
dm.setBuy_draft_dept(buy_draft_dept);
dm.setBuy_draft_no(buy_draft_no);
dm.setSwlics_cnt(swlics_cnt);
dm.setMake_cmpy(make_cmpy);
dm.setGds_key(gds_key);
dm.setLics_certi_no(lics_certi_no);
dm.setRemk(remk);
dm.setIncmg_pers_ipaddr(incmg_pers_ipaddr);
dm.setIncmg_pers(incmg_pers);
dm.setGubun(gubun);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Thu Mar 26 21:47:23 KST 2009 */