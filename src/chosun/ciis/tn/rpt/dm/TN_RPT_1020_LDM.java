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


package chosun.ciis.tn.rpt.dm;

import java.sql.*;
import oracle.jdbc.driver.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.tn.rpt.ds.*;
import chosun.ciis.tn.rpt.rec.*;

/**
 * 
 */


public class TN_RPT_1020_LDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String cmpy_cd;
	public String yyyymm;
	public String start_fr_dt;
	public String end_to_dt;
	public String deptidx;
	public String type_gb;

	public TN_RPT_1020_LDM(){}
	public TN_RPT_1020_LDM(String cmpy_cd, String yyyymm, String start_fr_dt, String end_to_dt, String deptidx, String type_gb){
		this.cmpy_cd = cmpy_cd;
		this.yyyymm = yyyymm;
		this.start_fr_dt = start_fr_dt;
		this.end_to_dt = end_to_dt;
		this.deptidx = deptidx;
		this.type_gb = type_gb;
	}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setYyyymm(String yyyymm){
		this.yyyymm = yyyymm;
	}

	public void setStart_fr_dt(String start_fr_dt){
		this.start_fr_dt = start_fr_dt;
	}

	public void setEnd_to_dt(String end_to_dt){
		this.end_to_dt = end_to_dt;
	}

	public void setDeptidx(String deptidx){
		this.deptidx = deptidx;
	}

	public void setType_gb(String type_gb){
		this.type_gb = type_gb;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getYyyymm(){
		return this.yyyymm;
	}

	public String getStart_fr_dt(){
		return this.start_fr_dt;
	}

	public String getEnd_to_dt(){
		return this.end_to_dt;
	}

	public String getDeptidx(){
		return this.deptidx;
	}

	public String getType_gb(){
		return this.type_gb;
	}

	public String getSQL(){
		 return "{ call MISTNN.SP_TN_RPT_1020_L(? ,? ,? ,? ,? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		TN_RPT_1020_LDM dm = (TN_RPT_1020_LDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.cmpy_cd);
		cstmt.setString(4, dm.yyyymm);
		cstmt.setString(5, dm.start_fr_dt);
		cstmt.setString(6, dm.end_to_dt);
		cstmt.setString(7, dm.deptidx);
		cstmt.setString(8, dm.type_gb);
		cstmt.registerOutParameter(9, OracleTypes.CURSOR);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.tn.rpt.ds.TN_RPT_1020_LDataSet();
	}



	public void print(){
		System.out.println("SQL = " + this.getSQL());
		System.out.println("cmpy_cd = [" + getCmpy_cd() + "]");
		System.out.println("yyyymm = [" + getYyyymm() + "]");
		System.out.println("start_fr_dt = [" + getStart_fr_dt() + "]");
		System.out.println("end_to_dt = [" + getEnd_to_dt() + "]");
		System.out.println("deptidx = [" + getDeptidx() + "]");
		System.out.println("type_gb = [" + getType_gb() + "]");
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
String yyyymm = req.getParameter("yyyymm");
if( yyyymm == null){
	System.out.println(this.toString+" : yyyymm is null" );
}else{
	System.out.println(this.toString+" : yyyymm is "+yyyymm );
}
String start_fr_dt = req.getParameter("start_fr_dt");
if( start_fr_dt == null){
	System.out.println(this.toString+" : start_fr_dt is null" );
}else{
	System.out.println(this.toString+" : start_fr_dt is "+start_fr_dt );
}
String end_to_dt = req.getParameter("end_to_dt");
if( end_to_dt == null){
	System.out.println(this.toString+" : end_to_dt is null" );
}else{
	System.out.println(this.toString+" : end_to_dt is "+end_to_dt );
}
String deptidx = req.getParameter("deptidx");
if( deptidx == null){
	System.out.println(this.toString+" : deptidx is null" );
}else{
	System.out.println(this.toString+" : deptidx is "+deptidx );
}
String type_gb = req.getParameter("type_gb");
if( type_gb == null){
	System.out.println(this.toString+" : type_gb is null" );
}else{
	System.out.println(this.toString+" : type_gb is "+type_gb );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.checkString(req.getParameter("cmpy_cd"));
String yyyymm = Util.checkString(req.getParameter("yyyymm"));
String start_fr_dt = Util.checkString(req.getParameter("start_fr_dt"));
String end_to_dt = Util.checkString(req.getParameter("end_to_dt"));
String deptidx = Util.checkString(req.getParameter("deptidx"));
String type_gb = Util.checkString(req.getParameter("type_gb"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String yyyymm = Util.Uni2Ksc(Util.checkString(req.getParameter("yyyymm")));
String start_fr_dt = Util.Uni2Ksc(Util.checkString(req.getParameter("start_fr_dt")));
String end_to_dt = Util.Uni2Ksc(Util.checkString(req.getParameter("end_to_dt")));
String deptidx = Util.Uni2Ksc(Util.checkString(req.getParameter("deptidx")));
String type_gb = Util.Uni2Ksc(Util.checkString(req.getParameter("type_gb")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setCmpy_cd(cmpy_cd);
dm.setYyyymm(yyyymm);
dm.setStart_fr_dt(start_fr_dt);
dm.setEnd_to_dt(end_to_dt);
dm.setDeptidx(deptidx);
dm.setType_gb(type_gb);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Mon Aug 29 11:14:43 KST 2016 */