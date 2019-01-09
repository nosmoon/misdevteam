/***************************************************************************************************
* 파일명 : SS_L_ANNC_SLSDM.java
* 기능 : 정보공유-실시간 판매국공지-목록을 위한 DM
* 작성일자 : 2004-07-20
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
 * 정보공유-실시간 판매국공지-목록을 위한 DM
 */


public class SS_L_ANNC_SLSDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String jobcd;
	public String cmpycd;
	public String uid;
	public String sb_areacd;
	public String sb_dealdeptcd;
	public String deptcd;
	public String selldeptcd;

	public SS_L_ANNC_SLSDM(){}
	public SS_L_ANNC_SLSDM(String jobcd, String cmpycd, String uid, String sb_areacd, String sb_dealdeptcd, String deptcd, String selldeptcd){
		this.jobcd = jobcd;
		this.cmpycd = cmpycd;
		this.uid = uid;
		this.sb_areacd = sb_areacd;
		this.sb_dealdeptcd = sb_dealdeptcd;
		this.deptcd = deptcd;
		this.selldeptcd = selldeptcd;
	}

	public void setJobcd(String jobcd){
		this.jobcd = jobcd;
	}

	public void setCmpycd(String cmpycd){
		this.cmpycd = cmpycd;
	}

	public void setUid(String uid){
		this.uid = uid;
	}

	public void setSb_areacd(String sb_areacd){
		this.sb_areacd = sb_areacd;
	}

	public void setSb_dealdeptcd(String sb_dealdeptcd){
		this.sb_dealdeptcd = sb_dealdeptcd;
	}

	public void setDeptcd(String deptcd){
		this.deptcd = deptcd;
	}

	public void setSelldeptcd(String selldeptcd){
		this.selldeptcd = selldeptcd;
	}

	public String getJobcd(){
		return this.jobcd;
	}

	public String getCmpycd(){
		return this.cmpycd;
	}

	public String getUid(){
		return this.uid;
	}

	public String getSb_areacd(){
		return this.sb_areacd;
	}

	public String getSb_dealdeptcd(){
		return this.sb_dealdeptcd;
	}

	public String getDeptcd(){
		return this.deptcd;
	}

	public String getSelldeptcd(){
		return this.selldeptcd;
	}

	public String getSQL(){
		 return "{ call SP_SS_L_ANNC_SLS( ?, ?, ?, ?, ?, ?, ?, ?, ?, ?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		SS_L_ANNC_SLSDM dm = (SS_L_ANNC_SLSDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.jobcd);
		cstmt.setString(4, dm.cmpycd);
		cstmt.setString(5, dm.uid);
		cstmt.setString(6, dm.sb_areacd);
		cstmt.setString(7, dm.sb_dealdeptcd);
		cstmt.setString(8, dm.deptcd);
		cstmt.setString(9, dm.selldeptcd);
		cstmt.registerOutParameter(10, OracleTypes.CURSOR);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.ss.sls.share.ds.SS_L_ANNC_SLSDataSet();
	}
}
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리 및 결과확인 검사시 사용하십시오.

String jobcd = req.getParameter("jobcd");
if( jobcd == null){
	System.out.println(this.toString+" : jobcd is null" );
}else{
	System.out.println(this.toString+" : jobcd is "+jobcd );
}
String cmpycd = req.getParameter("cmpycd");
if( cmpycd == null){
	System.out.println(this.toString+" : cmpycd is null" );
}else{
	System.out.println(this.toString+" : cmpycd is "+cmpycd );
}
String uid = req.getParameter("uid");
if( uid == null){
	System.out.println(this.toString+" : uid is null" );
}else{
	System.out.println(this.toString+" : uid is "+uid );
}
String sb_areacd = req.getParameter("sb_areacd");
if( sb_areacd == null){
	System.out.println(this.toString+" : sb_areacd is null" );
}else{
	System.out.println(this.toString+" : sb_areacd is "+sb_areacd );
}
String sb_dealdeptcd = req.getParameter("sb_dealdeptcd");
if( sb_dealdeptcd == null){
	System.out.println(this.toString+" : sb_dealdeptcd is null" );
}else{
	System.out.println(this.toString+" : sb_dealdeptcd is "+sb_dealdeptcd );
}
String deptcd = req.getParameter("deptcd");
if( deptcd == null){
	System.out.println(this.toString+" : deptcd is null" );
}else{
	System.out.println(this.toString+" : deptcd is "+deptcd );
}
String selldeptcd = req.getParameter("selldeptcd");
if( selldeptcd == null){
	System.out.println(this.toString+" : selldeptcd is null" );
}else{
	System.out.println(this.toString+" : selldeptcd is "+selldeptcd );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리시 사용하십시오.

String jobcd = Util.checkString(req.getParameter("jobcd"));
String cmpycd = Util.checkString(req.getParameter("cmpycd"));
String uid = Util.checkString(req.getParameter("uid"));
String sb_areacd = Util.checkString(req.getParameter("sb_areacd"));
String sb_dealdeptcd = Util.checkString(req.getParameter("sb_dealdeptcd"));
String deptcd = Util.checkString(req.getParameter("deptcd"));
String selldeptcd = Util.checkString(req.getParameter("selldeptcd"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String jobcd = Util.Uni2Ksc(Util.checkString(req.getParameter("jobcd")));
String cmpycd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpycd")));
String uid = Util.Uni2Ksc(Util.checkString(req.getParameter("uid")));
String sb_areacd = Util.Uni2Ksc(Util.checkString(req.getParameter("sb_areacd")));
String sb_dealdeptcd = Util.Uni2Ksc(Util.checkString(req.getParameter("sb_dealdeptcd")));
String deptcd = Util.Uni2Ksc(Util.checkString(req.getParameter("deptcd")));
String selldeptcd = Util.Uni2Ksc(Util.checkString(req.getParameter("selldeptcd")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setJobcd(jobcd);
dm.setCmpycd(cmpycd);
dm.setUid(uid);
dm.setSb_areacd(sb_areacd);
dm.setSb_dealdeptcd(sb_dealdeptcd);
dm.setDeptcd(deptcd);
dm.setSelldeptcd(selldeptcd);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Tue Jul 20 19:34:37 KST 2004 */