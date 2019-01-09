/***************************************************************************************************
* 파일명 : SS_L_OUTRPT_INITDM.java
* 기능 : 정보공유-일지및보고서-출장보고서-초기화면-목록을 위한 DM
* 작성일자 : 2004-04-24
* 작성자 : 김대섭
***************************************************************************************************/
/***************************************************************************************************
* 수정내역 :
* 수정자 :
* 수정일자 :
* 백업 : 
***************************************************************************************************/

package chosun.ciis.ss.sls.share.dm;

import java.sql.*;
import oracle.jdbc.driver.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.ss.sls.share.ds.*;
import chosun.ciis.ss.sls.share.rec.*;

/**
 * 정보공유-일지및보고서-출장보고서-초기화면-목록을 위한 DM
 */

public class SS_L_OUTRPT_INITDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String cmpycd;
	public String jobcd;
	public String uid;
	public String deptcd;
	public String areacd;
	public String sb_dealdeptcd;
	public String sb_areacd;
	public String deptplacyn;
	public long pageno;
	public long pagesize;

	public SS_L_OUTRPT_INITDM(){}
	public SS_L_OUTRPT_INITDM(String cmpycd, String jobcd, String uid, String deptcd, String areacd, String sb_dealdeptcd, String sb_areacd, String deptplacyn, long pageno, long pagesize){
		this.cmpycd = cmpycd;
		this.jobcd = jobcd;
		this.uid = uid;
		this.deptcd = deptcd;
		this.areacd = areacd;
		this.sb_dealdeptcd = sb_dealdeptcd;
		this.sb_areacd = sb_areacd;
		this.deptplacyn = deptplacyn;
		this.pageno = pageno;
		this.pagesize = pagesize;
	}

	public void setCmpycd(String cmpycd){
		this.cmpycd = cmpycd;
	}

	public void setJobcd(String jobcd){
		this.jobcd = jobcd;
	}

	public void setUid(String uid){
		this.uid = uid;
	}

	public void setDeptcd(String deptcd){
		this.deptcd = deptcd;
	}

	public void setAreacd(String areacd){
		this.areacd = areacd;
	}

	public void setSb_dealdeptcd(String sb_dealdeptcd){
		this.sb_dealdeptcd = sb_dealdeptcd;
	}

	public void setSb_areacd(String sb_areacd){
		this.sb_areacd = sb_areacd;
	}

	public void setDeptplacyn(String deptplacyn){
		this.deptplacyn = deptplacyn;
	}

	public void setPageno(long pageno){
		this.pageno = pageno;
	}

	public void setPagesize(long pagesize){
		this.pagesize = pagesize;
	}

	public String getCmpycd(){
		return this.cmpycd;
	}

	public String getJobcd(){
		return this.jobcd;
	}

	public String getUid(){
		return this.uid;
	}

	public String getDeptcd(){
		return this.deptcd;
	}

	public String getAreacd(){
		return this.areacd;
	}

	public String getSb_dealdeptcd(){
		return this.sb_dealdeptcd;
	}

	public String getSb_areacd(){
		return this.sb_areacd;
	}

	public String getDeptplacyn(){
		return this.deptplacyn;
	}

	public long getPageno(){
		return this.pageno;
	}

	public long getPagesize(){
		return this.pagesize;
	}

	public String getSQL(){
		 return "{ call SP_SS_L_OUTRPT_INIT( ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		SS_L_OUTRPT_INITDM dm = (SS_L_OUTRPT_INITDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.cmpycd);
		cstmt.setString(4, dm.jobcd);
		cstmt.setString(5, dm.uid);
		cstmt.setString(6, dm.deptcd);
		cstmt.setString(7, dm.areacd);
		cstmt.setString(8, dm.sb_dealdeptcd);
		cstmt.setString(9, dm.sb_areacd);
		cstmt.setString(10, dm.deptplacyn);
		cstmt.setLong(11, dm.pageno);
		cstmt.setLong(12, dm.pagesize);
		cstmt.registerOutParameter(13, Types.INTEGER);
		cstmt.registerOutParameter(14, OracleTypes.CURSOR);
		cstmt.registerOutParameter(15, OracleTypes.CURSOR);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.ss.sls.share.ds.SS_L_OUTRPT_INITDataSet();
	}
}
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리 및 결과확인 검사시 사용하십시오.

String cmpycd = req.getParameter("cmpycd");
if( cmpycd == null){
	System.out.println(this.toString+" : cmpycd is null" );
}else{
	System.out.println(this.toString+" : cmpycd is "+cmpycd );
}
String jobcd = req.getParameter("jobcd");
if( jobcd == null){
	System.out.println(this.toString+" : jobcd is null" );
}else{
	System.out.println(this.toString+" : jobcd is "+jobcd );
}
String uid = req.getParameter("uid");
if( uid == null){
	System.out.println(this.toString+" : uid is null" );
}else{
	System.out.println(this.toString+" : uid is "+uid );
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
String sb_dealdeptcd = req.getParameter("sb_dealdeptcd");
if( sb_dealdeptcd == null){
	System.out.println(this.toString+" : sb_dealdeptcd is null" );
}else{
	System.out.println(this.toString+" : sb_dealdeptcd is "+sb_dealdeptcd );
}
String sb_areacd = req.getParameter("sb_areacd");
if( sb_areacd == null){
	System.out.println(this.toString+" : sb_areacd is null" );
}else{
	System.out.println(this.toString+" : sb_areacd is "+sb_areacd );
}
String deptplacyn = req.getParameter("deptplacyn");
if( deptplacyn == null){
	System.out.println(this.toString+" : deptplacyn is null" );
}else{
	System.out.println(this.toString+" : deptplacyn is "+deptplacyn );
}
String pageno = req.getParameter("pageno");
if( pageno == null){
	System.out.println(this.toString+" : pageno is null" );
}else{
	System.out.println(this.toString+" : pageno is "+pageno );
}
String pagesize = req.getParameter("pagesize");
if( pagesize == null){
	System.out.println(this.toString+" : pagesize is null" );
}else{
	System.out.println(this.toString+" : pagesize is "+pagesize );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리시 사용하십시오.

String cmpycd = Util.checkString(req.getParameter("cmpycd"));
String jobcd = Util.checkString(req.getParameter("jobcd"));
String uid = Util.checkString(req.getParameter("uid"));
String deptcd = Util.checkString(req.getParameter("deptcd"));
String areacd = Util.checkString(req.getParameter("areacd"));
String sb_dealdeptcd = Util.checkString(req.getParameter("sb_dealdeptcd"));
String sb_areacd = Util.checkString(req.getParameter("sb_areacd"));
String deptplacyn = Util.checkString(req.getParameter("deptplacyn"));
String pageno = Util.checkString(req.getParameter("pageno"));
String pagesize = Util.checkString(req.getParameter("pagesize"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String cmpycd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpycd")));
String jobcd = Util.Uni2Ksc(Util.checkString(req.getParameter("jobcd")));
String uid = Util.Uni2Ksc(Util.checkString(req.getParameter("uid")));
String deptcd = Util.Uni2Ksc(Util.checkString(req.getParameter("deptcd")));
String areacd = Util.Uni2Ksc(Util.checkString(req.getParameter("areacd")));
String sb_dealdeptcd = Util.Uni2Ksc(Util.checkString(req.getParameter("sb_dealdeptcd")));
String sb_areacd = Util.Uni2Ksc(Util.checkString(req.getParameter("sb_areacd")));
String deptplacyn = Util.Uni2Ksc(Util.checkString(req.getParameter("deptplacyn")));
String pageno = Util.Uni2Ksc(Util.checkString(req.getParameter("pageno")));
String pagesize = Util.Uni2Ksc(Util.checkString(req.getParameter("pagesize")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setCmpycd(cmpycd);
dm.setJobcd(jobcd);
dm.setUid(uid);
dm.setDeptcd(deptcd);
dm.setAreacd(areacd);
dm.setSb_dealdeptcd(sb_dealdeptcd);
dm.setSb_areacd(sb_areacd);
dm.setDeptplacyn(deptplacyn);
dm.setPageno(pageno);
dm.setPagesize(pagesize);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Fri Jun 11 01:31:21 KST 2004 */