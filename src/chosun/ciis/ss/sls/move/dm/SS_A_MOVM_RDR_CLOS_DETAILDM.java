/***************************************************************************************************
* 파일명 : .java
* 기능 : 
* 작성일자 : 
* 작성자 : 심정보
***************************************************************************************************/
/***************************************************************************************************
* 수정내역 :
* 수정자 :
* 수정일자 :
* 백업 : 
***************************************************************************************************/


package chosun.ciis.ss.sls.move.dm;

import java.sql.*;
import oracle.jdbc.driver.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.ss.sls.move.ds.*;
import chosun.ciis.ss.sls.move.rec.*;

/**
 * 
 */


public class SS_A_MOVM_RDR_CLOS_DETAILDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String incmgpers;
	public String regdt;
	public String regno;
	public String movmrdrtype;
	public String rstsubsmonths;
	public String ipju_aptcd;
	public String post_dlvyn;
	public String suspyn;
	public String rdr_val_gb;
	public String set_gb;
	public String jm_gb;
	public String linkalon_fix;
	public String saveflag;
	public String auto_gb;

	public SS_A_MOVM_RDR_CLOS_DETAILDM(){}
	public SS_A_MOVM_RDR_CLOS_DETAILDM(String incmgpers, String regdt, String regno, String movmrdrtype, String rstsubsmonths, String ipju_aptcd, String post_dlvyn, String suspyn, String rdr_val_gb, String set_gb, String jm_gb, String linkalon_fix, String saveflag, String auto_gb){
		this.incmgpers = incmgpers;
		this.regdt = regdt;
		this.regno = regno;
		this.movmrdrtype = movmrdrtype;
		this.rstsubsmonths = rstsubsmonths;
		this.ipju_aptcd = ipju_aptcd;
		this.post_dlvyn = post_dlvyn;
		this.suspyn = suspyn;
		this.rdr_val_gb = rdr_val_gb;
		this.set_gb = set_gb;
		this.jm_gb = jm_gb;
		this.linkalon_fix = linkalon_fix;
		this.saveflag = saveflag;
		this.auto_gb = auto_gb;
	}

	public void setIncmgpers(String incmgpers){
		this.incmgpers = incmgpers;
	}

	public void setRegdt(String regdt){
		this.regdt = regdt;
	}

	public void setRegno(String regno){
		this.regno = regno;
	}

	public void setMovmrdrtype(String movmrdrtype){
		this.movmrdrtype = movmrdrtype;
	}

	public void setRstsubsmonths(String rstsubsmonths){
		this.rstsubsmonths = rstsubsmonths;
	}

	public void setIpju_aptcd(String ipju_aptcd){
		this.ipju_aptcd = ipju_aptcd;
	}

	public void setPost_dlvyn(String post_dlvyn){
		this.post_dlvyn = post_dlvyn;
	}

	public void setSuspyn(String suspyn){
		this.suspyn = suspyn;
	}

	public void setRdr_val_gb(String rdr_val_gb){
		this.rdr_val_gb = rdr_val_gb;
	}

	public void setSet_gb(String set_gb){
		this.set_gb = set_gb;
	}

	public void setJm_gb(String jm_gb){
		this.jm_gb = jm_gb;
	}

	public void setLinkalon_fix(String linkalon_fix){
		this.linkalon_fix = linkalon_fix;
	}

	public void setSaveflag(String saveflag){
		this.saveflag = saveflag;
	}
	
	public void setAuto_gb(String auto_gb){
		this.auto_gb = auto_gb;
	}

	public String getIncmgpers(){
		return this.incmgpers;
	}

	public String getRegdt(){
		return this.regdt;
	}

	public String getRegno(){
		return this.regno;
	}

	public String getMovmrdrtype(){
		return this.movmrdrtype;
	}

	public String getRstsubsmonths(){
		return this.rstsubsmonths;
	}

	public String getIpju_aptcd(){
		return this.ipju_aptcd;
	}

	public String getPost_dlvyn(){
		return this.post_dlvyn;
	}

	public String getSuspyn(){
		return this.suspyn;
	}

	public String getRdr_val_gb(){
		return this.rdr_val_gb;
	}

	public String getSet_gb(){
		return this.set_gb;
	}

	public String getJm_gb(){
		return this.jm_gb;
	}

	public String getLinkalon_fix(){
		return this.linkalon_fix;
	}

	public String getSaveflag(){
		return this.saveflag;
	}
	
	public String getAuto_gb(){
		return this.auto_gb;
	}

	public String getSQL(){
		 return "{ call CRMSAL_COM.SP_SS_A_MOVM_RDR_CLOS_DETAIL(? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		SS_A_MOVM_RDR_CLOS_DETAILDM dm = (SS_A_MOVM_RDR_CLOS_DETAILDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.incmgpers);
		cstmt.setString(4, dm.regdt);
		cstmt.setString(5, dm.regno);
		cstmt.setString(6, dm.movmrdrtype);
		cstmt.setString(7, dm.rstsubsmonths);
		cstmt.setString(8, dm.ipju_aptcd);
		cstmt.setString(9, dm.post_dlvyn);
		cstmt.setString(10, dm.suspyn);
		cstmt.setString(11, dm.rdr_val_gb);
		cstmt.setString(12, dm.set_gb);
		cstmt.setString(13, dm.jm_gb);
		cstmt.setString(14, dm.linkalon_fix);
		cstmt.setString(15, dm.saveflag);
		cstmt.setString(16, dm.auto_gb);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.ss.sls.move.ds.SS_A_MOVM_RDR_CLOS_DETAILDataSet();
	}



	public void print(){
		System.out.println("SQL = " + this.getSQL());
		System.out.println("incmgpers = [" + getIncmgpers() + "]");
		System.out.println("regdt = [" + getRegdt() + "]");
		System.out.println("regno = [" + getRegno() + "]");
		System.out.println("movmrdrtype = [" + getMovmrdrtype() + "]");
		System.out.println("rstsubsmonths = [" + getRstsubsmonths() + "]");
		System.out.println("ipju_aptcd = [" + getIpju_aptcd() + "]");
		System.out.println("post_dlvyn = [" + getPost_dlvyn() + "]");
		System.out.println("suspyn = [" + getSuspyn() + "]");
		System.out.println("rdr_val_gb = [" + getRdr_val_gb() + "]");
		System.out.println("set_gb = [" + getSet_gb() + "]");
		System.out.println("jm_gb = [" + getJm_gb() + "]");
		System.out.println("linkalon_fix = [" + getLinkalon_fix() + "]");
		System.out.println("saveflag = [" + getSaveflag() + "]");
		System.out.println("auto_gb = [" + getAuto_gb() + "]");
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
String regdt = req.getParameter("regdt");
if( regdt == null){
	System.out.println(this.toString+" : regdt is null" );
}else{
	System.out.println(this.toString+" : regdt is "+regdt );
}
String regno = req.getParameter("regno");
if( regno == null){
	System.out.println(this.toString+" : regno is null" );
}else{
	System.out.println(this.toString+" : regno is "+regno );
}
String movmrdrtype = req.getParameter("movmrdrtype");
if( movmrdrtype == null){
	System.out.println(this.toString+" : movmrdrtype is null" );
}else{
	System.out.println(this.toString+" : movmrdrtype is "+movmrdrtype );
}
String rstsubsmonths = req.getParameter("rstsubsmonths");
if( rstsubsmonths == null){
	System.out.println(this.toString+" : rstsubsmonths is null" );
}else{
	System.out.println(this.toString+" : rstsubsmonths is "+rstsubsmonths );
}
String ipju_aptcd = req.getParameter("ipju_aptcd");
if( ipju_aptcd == null){
	System.out.println(this.toString+" : ipju_aptcd is null" );
}else{
	System.out.println(this.toString+" : ipju_aptcd is "+ipju_aptcd );
}
String post_dlvyn = req.getParameter("post_dlvyn");
if( post_dlvyn == null){
	System.out.println(this.toString+" : post_dlvyn is null" );
}else{
	System.out.println(this.toString+" : post_dlvyn is "+post_dlvyn );
}
String suspyn = req.getParameter("suspyn");
if( suspyn == null){
	System.out.println(this.toString+" : suspyn is null" );
}else{
	System.out.println(this.toString+" : suspyn is "+suspyn );
}
String rdr_val_gb = req.getParameter("rdr_val_gb");
if( rdr_val_gb == null){
	System.out.println(this.toString+" : rdr_val_gb is null" );
}else{
	System.out.println(this.toString+" : rdr_val_gb is "+rdr_val_gb );
}
String set_gb = req.getParameter("set_gb");
if( set_gb == null){
	System.out.println(this.toString+" : set_gb is null" );
}else{
	System.out.println(this.toString+" : set_gb is "+set_gb );
}
String jm_gb = req.getParameter("jm_gb");
if( jm_gb == null){
	System.out.println(this.toString+" : jm_gb is null" );
}else{
	System.out.println(this.toString+" : jm_gb is "+jm_gb );
}
String linkalon_fix = req.getParameter("linkalon_fix");
if( linkalon_fix == null){
	System.out.println(this.toString+" : linkalon_fix is null" );
}else{
	System.out.println(this.toString+" : linkalon_fix is "+linkalon_fix );
}
String saveflag = req.getParameter("saveflag");
if( saveflag == null){
	System.out.println(this.toString+" : saveflag is null" );
}else{
	System.out.println(this.toString+" : saveflag is "+saveflag );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리시 사용하십시오.

String incmgpers = Util.checkString(req.getParameter("incmgpers"));
String regdt = Util.checkString(req.getParameter("regdt"));
String regno = Util.checkString(req.getParameter("regno"));
String movmrdrtype = Util.checkString(req.getParameter("movmrdrtype"));
String rstsubsmonths = Util.checkString(req.getParameter("rstsubsmonths"));
String ipju_aptcd = Util.checkString(req.getParameter("ipju_aptcd"));
String post_dlvyn = Util.checkString(req.getParameter("post_dlvyn"));
String suspyn = Util.checkString(req.getParameter("suspyn"));
String rdr_val_gb = Util.checkString(req.getParameter("rdr_val_gb"));
String set_gb = Util.checkString(req.getParameter("set_gb"));
String jm_gb = Util.checkString(req.getParameter("jm_gb"));
String linkalon_fix = Util.checkString(req.getParameter("linkalon_fix"));
String saveflag = Util.checkString(req.getParameter("saveflag"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String incmgpers = Util.Uni2Ksc(Util.checkString(req.getParameter("incmgpers")));
String regdt = Util.Uni2Ksc(Util.checkString(req.getParameter("regdt")));
String regno = Util.Uni2Ksc(Util.checkString(req.getParameter("regno")));
String movmrdrtype = Util.Uni2Ksc(Util.checkString(req.getParameter("movmrdrtype")));
String rstsubsmonths = Util.Uni2Ksc(Util.checkString(req.getParameter("rstsubsmonths")));
String ipju_aptcd = Util.Uni2Ksc(Util.checkString(req.getParameter("ipju_aptcd")));
String post_dlvyn = Util.Uni2Ksc(Util.checkString(req.getParameter("post_dlvyn")));
String suspyn = Util.Uni2Ksc(Util.checkString(req.getParameter("suspyn")));
String rdr_val_gb = Util.Uni2Ksc(Util.checkString(req.getParameter("rdr_val_gb")));
String set_gb = Util.Uni2Ksc(Util.checkString(req.getParameter("set_gb")));
String jm_gb = Util.Uni2Ksc(Util.checkString(req.getParameter("jm_gb")));
String linkalon_fix = Util.Uni2Ksc(Util.checkString(req.getParameter("linkalon_fix")));
String saveflag = Util.Uni2Ksc(Util.checkString(req.getParameter("saveflag")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setIncmgpers(incmgpers);
dm.setRegdt(regdt);
dm.setRegno(regno);
dm.setMovmrdrtype(movmrdrtype);
dm.setRstsubsmonths(rstsubsmonths);
dm.setIpju_aptcd(ipju_aptcd);
dm.setPost_dlvyn(post_dlvyn);
dm.setSuspyn(suspyn);
dm.setRdr_val_gb(rdr_val_gb);
dm.setSet_gb(set_gb);
dm.setJm_gb(jm_gb);
dm.setLinkalon_fix(linkalon_fix);
dm.setSaveflag(saveflag);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Fri Jul 25 11:56:24 KST 2014 */