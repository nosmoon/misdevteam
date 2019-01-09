/***************************************************************************************************
* 파일명 : .java
* 기능 : 본사확장 이사독자 신청현황 저장 
* 작성일자 : 2009/09/23
* 작성자 : 권정윤
***************************************************************************************************/


package chosun.ciis.ss.sls.move.dm;

import java.sql.*;
import oracle.jdbc.driver.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.ss.sls.move.ds.*;
import chosun.ciis.ss.sls.move.rec.*;

/**
 * 본사확장 이사독자 신청현황 저장 
 */

public class SS_U_MOVM_RDRDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String uid;
	public String regdt_cnfm;
	public String regno_cnfm;
	public String movmlinkalon_plan_cnfm;
	public String movmlinkalon_fix_cnfm;
	public String movmrdrtype_cnfm;
	public String zip_cnfm;
	public String addr_cnfm;
	public String dtlsaddr_cnfm;
	public String movmzip_cnfm;
	public String movmaddr_cnfm;
	public String movmdtlsaddr_cnfm;
	public String trsfboremk_cnfm;
	public String acptboremk_cnfm;
	public String movmlinkalon_ptcr_cnfm;
	public String rstsubsmonths_cnfm;

	public SS_U_MOVM_RDRDM(){}
	public SS_U_MOVM_RDRDM(String uid, String regdt_cnfm, String regno_cnfm, String movmlinkalon_plan_cnfm, String movmlinkalon_fix_cnfm, String movmrdrtype_cnfm, String zip_cnfm, String addr_cnfm, String dtlsaddr_cnfm, String movmzip_cnfm, String movmaddr_cnfm, String movmdtlsaddr_cnfm, String trsfboremk_cnfm, String acptboremk_cnfm, String movmlinkalon_ptcr_cnfm, String rstsubsmonths_cnfm){
		this.uid = uid;
		this.regdt_cnfm = regdt_cnfm;
		this.regno_cnfm = regno_cnfm;
		this.movmlinkalon_plan_cnfm = movmlinkalon_plan_cnfm;
		this.movmlinkalon_fix_cnfm = movmlinkalon_fix_cnfm;
		this.movmrdrtype_cnfm = movmrdrtype_cnfm;
		this.zip_cnfm = zip_cnfm;
		this.addr_cnfm = addr_cnfm;
		this.dtlsaddr_cnfm = dtlsaddr_cnfm;
		this.movmzip_cnfm = movmzip_cnfm;
		this.movmaddr_cnfm = movmaddr_cnfm;
		this.movmdtlsaddr_cnfm = movmdtlsaddr_cnfm;
		this.trsfboremk_cnfm = trsfboremk_cnfm;
		this.acptboremk_cnfm = acptboremk_cnfm;
		this.movmlinkalon_ptcr_cnfm = movmlinkalon_ptcr_cnfm;
		this.rstsubsmonths_cnfm = rstsubsmonths_cnfm;
	}

	public void setUid(String uid){
		this.uid = uid;
	}

	public void setRegdt_cnfm(String regdt_cnfm){
		this.regdt_cnfm = regdt_cnfm;
	}

	public void setRegno_cnfm(String regno_cnfm){
		this.regno_cnfm = regno_cnfm;
	}

	public void setMovmlinkalon_plan_cnfm(String movmlinkalon_plan_cnfm){
		this.movmlinkalon_plan_cnfm = movmlinkalon_plan_cnfm;
	}

	public void setMovmlinkalon_fix_cnfm(String movmlinkalon_fix_cnfm){
		this.movmlinkalon_fix_cnfm = movmlinkalon_fix_cnfm;
	}

	public void setMovmrdrtype_cnfm(String movmrdrtype_cnfm){
		this.movmrdrtype_cnfm = movmrdrtype_cnfm;
	}

	public void setZip_cnfm(String zip_cnfm){
		this.zip_cnfm = zip_cnfm;
	}

	public void setAddr_cnfm(String addr_cnfm){
		this.addr_cnfm = addr_cnfm;
	}

	public void setDtlsaddr_cnfm(String dtlsaddr_cnfm){
		this.dtlsaddr_cnfm = dtlsaddr_cnfm;
	}

	public void setMovmzip_cnfm(String movmzip_cnfm){
		this.movmzip_cnfm = movmzip_cnfm;
	}

	public void setMovmaddr_cnfm(String movmaddr_cnfm){
		this.movmaddr_cnfm = movmaddr_cnfm;
	}

	public void setMovmdtlsaddr_cnfm(String movmdtlsaddr_cnfm){
		this.movmdtlsaddr_cnfm = movmdtlsaddr_cnfm;
	}

	public void setTrsfboremk_cnfm(String trsfboremk_cnfm){
		this.trsfboremk_cnfm = trsfboremk_cnfm;
	}

	public void setAcptboremk_cnfm(String acptboremk_cnfm){
		this.acptboremk_cnfm = acptboremk_cnfm;
	}

	public void setMovmlinkalon_ptcr_cnfm(String movmlinkalon_ptcr_cnfm){
		this.movmlinkalon_ptcr_cnfm = movmlinkalon_ptcr_cnfm;
	}

	public void setRstsubsmonths_cnfm(String rstsubsmonths_cnfm){
		this.rstsubsmonths_cnfm = rstsubsmonths_cnfm;
	}

	public String getUid(){
		return this.uid;
	}

	public String getRegdt_cnfm(){
		return this.regdt_cnfm;
	}

	public String getRegno_cnfm(){
		return this.regno_cnfm;
	}

	public String getMovmlinkalon_plan_cnfm(){
		return this.movmlinkalon_plan_cnfm;
	}

	public String getMovmlinkalon_fix_cnfm(){
		return this.movmlinkalon_fix_cnfm;
	}

	public String getMovmrdrtype_cnfm(){
		return this.movmrdrtype_cnfm;
	}

	public String getZip_cnfm(){
		return this.zip_cnfm;
	}

	public String getAddr_cnfm(){
		return this.addr_cnfm;
	}

	public String getDtlsaddr_cnfm(){
		return this.dtlsaddr_cnfm;
	}

	public String getMovmzip_cnfm(){
		return this.movmzip_cnfm;
	}

	public String getMovmaddr_cnfm(){
		return this.movmaddr_cnfm;
	}

	public String getMovmdtlsaddr_cnfm(){
		return this.movmdtlsaddr_cnfm;
	}

	public String getTrsfboremk_cnfm(){
		return this.trsfboremk_cnfm;
	}

	public String getAcptboremk_cnfm(){
		return this.acptboremk_cnfm;
	}

	public String getMovmlinkalon_ptcr_cnfm(){
		return this.movmlinkalon_ptcr_cnfm;
	}

	public String getRstsubsmonths_cnfm(){
		return this.rstsubsmonths_cnfm;
	}

	public String getSQL(){
		 return "{ call SP_SS_U_MOVM_RDR( ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		SS_U_MOVM_RDRDM dm = (SS_U_MOVM_RDRDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.uid);
		cstmt.setString(4, dm.regdt_cnfm);
		cstmt.setString(5, dm.regno_cnfm);
		cstmt.setString(6, dm.movmlinkalon_plan_cnfm);
		cstmt.setString(7, dm.movmlinkalon_fix_cnfm);
		cstmt.setString(8, dm.movmrdrtype_cnfm);
		cstmt.setString(9, dm.zip_cnfm);
		cstmt.setString(10, dm.addr_cnfm);
		cstmt.setString(11, dm.dtlsaddr_cnfm);
		cstmt.setString(12, dm.movmzip_cnfm);
		cstmt.setString(13, dm.movmaddr_cnfm);
		cstmt.setString(14, dm.movmdtlsaddr_cnfm);
		cstmt.setString(15, dm.trsfboremk_cnfm);
		cstmt.setString(16, dm.acptboremk_cnfm);
		cstmt.setString(17, dm.movmlinkalon_ptcr_cnfm);
		cstmt.setString(18, dm.rstsubsmonths_cnfm);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.ss.sls.move.ds.SS_U_MOVM_RDRDataSet();
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
String regdt_cnfm = req.getParameter("regdt_cnfm");
if( regdt_cnfm == null){
	System.out.println(this.toString+" : regdt_cnfm is null" );
}else{
	System.out.println(this.toString+" : regdt_cnfm is "+regdt_cnfm );
}
String regno_cnfm = req.getParameter("regno_cnfm");
if( regno_cnfm == null){
	System.out.println(this.toString+" : regno_cnfm is null" );
}else{
	System.out.println(this.toString+" : regno_cnfm is "+regno_cnfm );
}
String movmlinkalon_plan_cnfm = req.getParameter("movmlinkalon_plan_cnfm");
if( movmlinkalon_plan_cnfm == null){
	System.out.println(this.toString+" : movmlinkalon_plan_cnfm is null" );
}else{
	System.out.println(this.toString+" : movmlinkalon_plan_cnfm is "+movmlinkalon_plan_cnfm );
}
String movmlinkalon_fix_cnfm = req.getParameter("movmlinkalon_fix_cnfm");
if( movmlinkalon_fix_cnfm == null){
	System.out.println(this.toString+" : movmlinkalon_fix_cnfm is null" );
}else{
	System.out.println(this.toString+" : movmlinkalon_fix_cnfm is "+movmlinkalon_fix_cnfm );
}
String movmrdrtype_cnfm = req.getParameter("movmrdrtype_cnfm");
if( movmrdrtype_cnfm == null){
	System.out.println(this.toString+" : movmrdrtype_cnfm is null" );
}else{
	System.out.println(this.toString+" : movmrdrtype_cnfm is "+movmrdrtype_cnfm );
}
String zip_cnfm = req.getParameter("zip_cnfm");
if( zip_cnfm == null){
	System.out.println(this.toString+" : zip_cnfm is null" );
}else{
	System.out.println(this.toString+" : zip_cnfm is "+zip_cnfm );
}
String addr_cnfm = req.getParameter("addr_cnfm");
if( addr_cnfm == null){
	System.out.println(this.toString+" : addr_cnfm is null" );
}else{
	System.out.println(this.toString+" : addr_cnfm is "+addr_cnfm );
}
String dtlsaddr_cnfm = req.getParameter("dtlsaddr_cnfm");
if( dtlsaddr_cnfm == null){
	System.out.println(this.toString+" : dtlsaddr_cnfm is null" );
}else{
	System.out.println(this.toString+" : dtlsaddr_cnfm is "+dtlsaddr_cnfm );
}
String movmzip_cnfm = req.getParameter("movmzip_cnfm");
if( movmzip_cnfm == null){
	System.out.println(this.toString+" : movmzip_cnfm is null" );
}else{
	System.out.println(this.toString+" : movmzip_cnfm is "+movmzip_cnfm );
}
String movmaddr_cnfm = req.getParameter("movmaddr_cnfm");
if( movmaddr_cnfm == null){
	System.out.println(this.toString+" : movmaddr_cnfm is null" );
}else{
	System.out.println(this.toString+" : movmaddr_cnfm is "+movmaddr_cnfm );
}
String movmdtlsaddr_cnfm = req.getParameter("movmdtlsaddr_cnfm");
if( movmdtlsaddr_cnfm == null){
	System.out.println(this.toString+" : movmdtlsaddr_cnfm is null" );
}else{
	System.out.println(this.toString+" : movmdtlsaddr_cnfm is "+movmdtlsaddr_cnfm );
}
String trsfboremk_cnfm = req.getParameter("trsfboremk_cnfm");
if( trsfboremk_cnfm == null){
	System.out.println(this.toString+" : trsfboremk_cnfm is null" );
}else{
	System.out.println(this.toString+" : trsfboremk_cnfm is "+trsfboremk_cnfm );
}
String acptboremk_cnfm = req.getParameter("acptboremk_cnfm");
if( acptboremk_cnfm == null){
	System.out.println(this.toString+" : acptboremk_cnfm is null" );
}else{
	System.out.println(this.toString+" : acptboremk_cnfm is "+acptboremk_cnfm );
}
String movmlinkalon_ptcr_cnfm = req.getParameter("movmlinkalon_ptcr_cnfm");
if( movmlinkalon_ptcr_cnfm == null){
	System.out.println(this.toString+" : movmlinkalon_ptcr_cnfm is null" );
}else{
	System.out.println(this.toString+" : movmlinkalon_ptcr_cnfm is "+movmlinkalon_ptcr_cnfm );
}
String rstsubsmonths_cnfm = req.getParameter("rstsubsmonths_cnfm");
if( rstsubsmonths_cnfm == null){
	System.out.println(this.toString+" : rstsubsmonths_cnfm is null" );
}else{
	System.out.println(this.toString+" : rstsubsmonths_cnfm is "+rstsubsmonths_cnfm );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리시 사용하십시오.

String uid = Util.checkString(req.getParameter("uid"));
String regdt_cnfm = Util.checkString(req.getParameter("regdt_cnfm"));
String regno_cnfm = Util.checkString(req.getParameter("regno_cnfm"));
String movmlinkalon_plan_cnfm = Util.checkString(req.getParameter("movmlinkalon_plan_cnfm"));
String movmlinkalon_fix_cnfm = Util.checkString(req.getParameter("movmlinkalon_fix_cnfm"));
String movmrdrtype_cnfm = Util.checkString(req.getParameter("movmrdrtype_cnfm"));
String zip_cnfm = Util.checkString(req.getParameter("zip_cnfm"));
String addr_cnfm = Util.checkString(req.getParameter("addr_cnfm"));
String dtlsaddr_cnfm = Util.checkString(req.getParameter("dtlsaddr_cnfm"));
String movmzip_cnfm = Util.checkString(req.getParameter("movmzip_cnfm"));
String movmaddr_cnfm = Util.checkString(req.getParameter("movmaddr_cnfm"));
String movmdtlsaddr_cnfm = Util.checkString(req.getParameter("movmdtlsaddr_cnfm"));
String trsfboremk_cnfm = Util.checkString(req.getParameter("trsfboremk_cnfm"));
String acptboremk_cnfm = Util.checkString(req.getParameter("acptboremk_cnfm"));
String movmlinkalon_ptcr_cnfm = Util.checkString(req.getParameter("movmlinkalon_ptcr_cnfm"));
String rstsubsmonths_cnfm = Util.checkString(req.getParameter("rstsubsmonths_cnfm"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String uid = Util.Uni2Ksc(Util.checkString(req.getParameter("uid")));
String regdt_cnfm = Util.Uni2Ksc(Util.checkString(req.getParameter("regdt_cnfm")));
String regno_cnfm = Util.Uni2Ksc(Util.checkString(req.getParameter("regno_cnfm")));
String movmlinkalon_plan_cnfm = Util.Uni2Ksc(Util.checkString(req.getParameter("movmlinkalon_plan_cnfm")));
String movmlinkalon_fix_cnfm = Util.Uni2Ksc(Util.checkString(req.getParameter("movmlinkalon_fix_cnfm")));
String movmrdrtype_cnfm = Util.Uni2Ksc(Util.checkString(req.getParameter("movmrdrtype_cnfm")));
String zip_cnfm = Util.Uni2Ksc(Util.checkString(req.getParameter("zip_cnfm")));
String addr_cnfm = Util.Uni2Ksc(Util.checkString(req.getParameter("addr_cnfm")));
String dtlsaddr_cnfm = Util.Uni2Ksc(Util.checkString(req.getParameter("dtlsaddr_cnfm")));
String movmzip_cnfm = Util.Uni2Ksc(Util.checkString(req.getParameter("movmzip_cnfm")));
String movmaddr_cnfm = Util.Uni2Ksc(Util.checkString(req.getParameter("movmaddr_cnfm")));
String movmdtlsaddr_cnfm = Util.Uni2Ksc(Util.checkString(req.getParameter("movmdtlsaddr_cnfm")));
String trsfboremk_cnfm = Util.Uni2Ksc(Util.checkString(req.getParameter("trsfboremk_cnfm")));
String acptboremk_cnfm = Util.Uni2Ksc(Util.checkString(req.getParameter("acptboremk_cnfm")));
String movmlinkalon_ptcr_cnfm = Util.Uni2Ksc(Util.checkString(req.getParameter("movmlinkalon_ptcr_cnfm")));
String rstsubsmonths_cnfm = Util.Uni2Ksc(Util.checkString(req.getParameter("rstsubsmonths_cnfm")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setUid(uid);
dm.setRegdt_cnfm(regdt_cnfm);
dm.setRegno_cnfm(regno_cnfm);
dm.setMovmlinkalon_plan_cnfm(movmlinkalon_plan_cnfm);
dm.setMovmlinkalon_fix_cnfm(movmlinkalon_fix_cnfm);
dm.setMovmrdrtype_cnfm(movmrdrtype_cnfm);
dm.setZip_cnfm(zip_cnfm);
dm.setAddr_cnfm(addr_cnfm);
dm.setDtlsaddr_cnfm(dtlsaddr_cnfm);
dm.setMovmzip_cnfm(movmzip_cnfm);
dm.setMovmaddr_cnfm(movmaddr_cnfm);
dm.setMovmdtlsaddr_cnfm(movmdtlsaddr_cnfm);
dm.setTrsfboremk_cnfm(trsfboremk_cnfm);
dm.setAcptboremk_cnfm(acptboremk_cnfm);
dm.setMovmlinkalon_ptcr_cnfm(movmlinkalon_ptcr_cnfm);
dm.setRstsubsmonths_cnfm(rstsubsmonths_cnfm);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Wed Sep 23 15:05:12 KST 2009 */