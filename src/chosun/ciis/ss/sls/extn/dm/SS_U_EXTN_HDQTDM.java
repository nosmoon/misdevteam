/***************************************************************************************************
* 파일명 : .java
* 기능 : 확장현황-본사확장-사원확장 계좌정보 업데이트
* 작성일자 : 2009-06-05
* 작성자 : 권정윤
***************************************************************************************************/


package chosun.ciis.ss.sls.extn.dm;

import java.sql.*;
import oracle.jdbc.driver.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.ss.sls.extn.ds.*;
import chosun.ciis.ss.sls.extn.rec.*;

/**
 * 확장현황-본사확장-사원확장 계좌정보 업데이트
 */

public class SS_U_EXTN_HDQTDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String uid;
	public String cmpycd;
	public String rdr_extndt;
	public String rdr_extnno;
	public String rdr_extncost;
	public String alonadjmyn;
	public String banknm;
	public String acctno;
	public String depspers;

	public SS_U_EXTN_HDQTDM(){}
	public SS_U_EXTN_HDQTDM(String uid, String cmpycd, String rdr_extndt, String rdr_extnno, String rdr_extncost, String alonadjmyn, String banknm, String acctno, String depspers){
		this.uid = uid;
		this.cmpycd = cmpycd;
		this.rdr_extndt = rdr_extndt;
		this.rdr_extnno = rdr_extnno;
		this.rdr_extncost = rdr_extncost;
		this.alonadjmyn = alonadjmyn;
		this.banknm = banknm;
		this.acctno = acctno;
		this.depspers = depspers;
	}

	public void setUid(String uid){
		this.uid = uid;
	}

	public void setCmpycd(String cmpycd){
		this.cmpycd = cmpycd;
	}

	public void setRdr_extndt(String rdr_extndt){
		this.rdr_extndt = rdr_extndt;
	}

	public void setRdr_extnno(String rdr_extnno){
		this.rdr_extnno = rdr_extnno;
	}

	public void setRdr_extncost(String rdr_extncost){
		this.rdr_extncost = rdr_extncost;
	}

	public void setAlonadjmyn(String alonadjmyn){
		this.alonadjmyn = alonadjmyn;
	}

	public void setBanknm(String banknm){
		this.banknm = banknm;
	}

	public void setAcctno(String acctno){
		this.acctno = acctno;
	}

	public void setDepspers(String depspers){
		this.depspers = depspers;
	}

	public String getUid(){
		return this.uid;
	}

	public String getCmpycd(){
		return this.cmpycd;
	}

	public String getRdr_extndt(){
		return this.rdr_extndt;
	}

	public String getRdr_extnno(){
		return this.rdr_extnno;
	}

	public String getRdr_extncost(){
		return this.rdr_extncost;
	}

	public String getAlonadjmyn(){
		return this.alonadjmyn;
	}

	public String getBanknm(){
		return this.banknm;
	}

	public String getAcctno(){
		return this.acctno;
	}

	public String getDepspers(){
		return this.depspers;
	}

	public String getSQL(){
		 return "{ call SP_SS_U_EXTN_HDQT( ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		SS_U_EXTN_HDQTDM dm = (SS_U_EXTN_HDQTDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.uid);
		cstmt.setString(4, dm.cmpycd);
		cstmt.setString(5, dm.rdr_extndt);
		cstmt.setString(6, dm.rdr_extnno);
		cstmt.setString(7, dm.rdr_extncost);
		cstmt.setString(8, dm.alonadjmyn);
		cstmt.setString(9, dm.banknm);
		cstmt.setString(10, dm.acctno);
		cstmt.setString(11, dm.depspers);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.ss.sls.extn.ds.SS_U_EXTN_HDQTDataSet();
	}
}
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리 및 결과확인 검사시 사용하십시오.

String uid = req.getParameter("uid");
if( uid == null){
	System.out.println(this.toString+" : uid is null" );
}else{
	System.out.println(this.toString+" : uid is "+uid );
}
String cmpycd = req.getParameter("cmpycd");
if( cmpycd == null){
	System.out.println(this.toString+" : cmpycd is null" );
}else{
	System.out.println(this.toString+" : cmpycd is "+cmpycd );
}
String rdr_extndt = req.getParameter("rdr_extndt");
if( rdr_extndt == null){
	System.out.println(this.toString+" : rdr_extndt is null" );
}else{
	System.out.println(this.toString+" : rdr_extndt is "+rdr_extndt );
}
String rdr_extnno = req.getParameter("rdr_extnno");
if( rdr_extnno == null){
	System.out.println(this.toString+" : rdr_extnno is null" );
}else{
	System.out.println(this.toString+" : rdr_extnno is "+rdr_extnno );
}
String rdr_extncost = req.getParameter("rdr_extncost");
if( rdr_extncost == null){
	System.out.println(this.toString+" : rdr_extncost is null" );
}else{
	System.out.println(this.toString+" : rdr_extncost is "+rdr_extncost );
}
String alonadjmyn = req.getParameter("alonadjmyn");
if( alonadjmyn == null){
	System.out.println(this.toString+" : alonadjmyn is null" );
}else{
	System.out.println(this.toString+" : alonadjmyn is "+alonadjmyn );
}
String banknm = req.getParameter("banknm");
if( banknm == null){
	System.out.println(this.toString+" : banknm is null" );
}else{
	System.out.println(this.toString+" : banknm is "+banknm );
}
String acctno = req.getParameter("acctno");
if( acctno == null){
	System.out.println(this.toString+" : acctno is null" );
}else{
	System.out.println(this.toString+" : acctno is "+acctno );
}
String depspers = req.getParameter("depspers");
if( depspers == null){
	System.out.println(this.toString+" : depspers is null" );
}else{
	System.out.println(this.toString+" : depspers is "+depspers );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리시 사용하십시오.

String uid = Util.checkString(req.getParameter("uid"));
String cmpycd = Util.checkString(req.getParameter("cmpycd"));
String rdr_extndt = Util.checkString(req.getParameter("rdr_extndt"));
String rdr_extnno = Util.checkString(req.getParameter("rdr_extnno"));
String rdr_extncost = Util.checkString(req.getParameter("rdr_extncost"));
String alonadjmyn = Util.checkString(req.getParameter("alonadjmyn"));
String banknm = Util.checkString(req.getParameter("banknm"));
String acctno = Util.checkString(req.getParameter("acctno"));
String depspers = Util.checkString(req.getParameter("depspers"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String uid = Util.Uni2Ksc(Util.checkString(req.getParameter("uid")));
String cmpycd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpycd")));
String rdr_extndt = Util.Uni2Ksc(Util.checkString(req.getParameter("rdr_extndt")));
String rdr_extnno = Util.Uni2Ksc(Util.checkString(req.getParameter("rdr_extnno")));
String rdr_extncost = Util.Uni2Ksc(Util.checkString(req.getParameter("rdr_extncost")));
String alonadjmyn = Util.Uni2Ksc(Util.checkString(req.getParameter("alonadjmyn")));
String banknm = Util.Uni2Ksc(Util.checkString(req.getParameter("banknm")));
String acctno = Util.Uni2Ksc(Util.checkString(req.getParameter("acctno")));
String depspers = Util.Uni2Ksc(Util.checkString(req.getParameter("depspers")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setUid(uid);
dm.setCmpycd(cmpycd);
dm.setRdr_extndt(rdr_extndt);
dm.setRdr_extnno(rdr_extnno);
dm.setRdr_extncost(rdr_extncost);
dm.setAlonadjmyn(alonadjmyn);
dm.setBanknm(banknm);
dm.setAcctno(acctno);
dm.setDepspers(depspers);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Fri Jun 05 12:07:06 KST 2009 */