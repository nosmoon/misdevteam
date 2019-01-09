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


package chosun.ciis.mc.cost.dm;

import java.sql.*;
import oracle.jdbc.driver.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.mc.cost.ds.*;
import chosun.ciis.mc.cost.rec.*;

/**
 * 
 */


public class MC_COST_3181_LDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String cmpy_cd;
	public String kind;
	public String yymm_fr;
	public String yymm_to;
	public String dept_cd2;
	public String clas_cd;
	public String dept_len;
	public String clas_len;
	public String fixfee_yn;
	public String dstb_clsf_cd;

	public MC_COST_3181_LDM(){}
	public MC_COST_3181_LDM(String cmpy_cd, String kind, String yymm_fr, String yymm_to, String dept_cd2, String clas_cd, String dept_len, String clas_len, String fixfee_yn, String dstb_clsf_cd){
		this.cmpy_cd = cmpy_cd;
		this.kind = kind;
		this.yymm_fr = yymm_fr;
		this.yymm_to = yymm_to;
		this.dept_cd2 = dept_cd2;
		this.clas_cd = clas_cd;
		this.dept_len = dept_len;
		this.clas_len = clas_len;
		this.fixfee_yn = fixfee_yn;
		this.dstb_clsf_cd = dstb_clsf_cd;
	}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setKind(String kind){
		this.kind = kind;
	}

	public void setYymm_fr(String yymm_fr){
		this.yymm_fr = yymm_fr;
	}

	public void setYymm_to(String yymm_to){
		this.yymm_to = yymm_to;
	}

	public void setDept_cd2(String dept_cd2){
		this.dept_cd2 = dept_cd2;
	}

	public void setClas_cd(String clas_cd){
		this.clas_cd = clas_cd;
	}

	public void setDept_len(String dept_len){
		this.dept_len = dept_len;
	}

	public void setClas_len(String clas_len){
		this.clas_len = clas_len;
	}

	public void setFixfee_yn(String fixfee_yn){
		this.fixfee_yn = fixfee_yn;
	}

	public void setDstb_clsf_cd(String dstb_clsf_cd){
		this.dstb_clsf_cd = dstb_clsf_cd;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getKind(){
		return this.kind;
	}

	public String getYymm_fr(){
		return this.yymm_fr;
	}

	public String getYymm_to(){
		return this.yymm_to;
	}

	public String getDept_cd2(){
		return this.dept_cd2;
	}

	public String getClas_cd(){
		return this.clas_cd;
	}

	public String getDept_len(){
		return this.dept_len;
	}

	public String getClas_len(){
		return this.clas_len;
	}

	public String getFixfee_yn(){
		return this.fixfee_yn;
	}

	public String getDstb_clsf_cd(){
		return this.dstb_clsf_cd;
	}

	public String getSQL(){
		 return "{ call MISFNC.SP_MC_COST_3181_L(? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		MC_COST_3181_LDM dm = (MC_COST_3181_LDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.cmpy_cd);
		cstmt.setString(4, dm.kind);
		cstmt.setString(5, dm.yymm_fr);
		cstmt.setString(6, dm.yymm_to);
		cstmt.setString(7, dm.dept_cd2);
		cstmt.setString(8, dm.clas_cd);
		cstmt.setString(9, dm.dept_len);
		cstmt.setString(10, dm.clas_len);
		cstmt.setString(11, dm.fixfee_yn);
		cstmt.setString(12, dm.dstb_clsf_cd);
		cstmt.registerOutParameter(13, OracleTypes.CURSOR);
		cstmt.registerOutParameter(14, OracleTypes.CURSOR);
		cstmt.registerOutParameter(15, OracleTypes.CURSOR);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.mc.cost.ds.MC_COST_3181_LDataSet();
	}



	public void print(){
		System.out.println("SQL = " + this.getSQL());
		System.out.println("cmpy_cd = [" + getCmpy_cd() + "]");
		System.out.println("kind = [" + getKind() + "]");
		System.out.println("yymm_fr = [" + getYymm_fr() + "]");
		System.out.println("yymm_to = [" + getYymm_to() + "]");
		System.out.println("dept_cd2 = [" + getDept_cd2() + "]");
		System.out.println("clas_cd = [" + getClas_cd() + "]");
		System.out.println("dept_len = [" + getDept_len() + "]");
		System.out.println("clas_len = [" + getClas_len() + "]");
		System.out.println("fixfee_yn = [" + getFixfee_yn() + "]");
		System.out.println("dstb_clsf_cd = [" + getDstb_clsf_cd() + "]");
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
String kind = req.getParameter("kind");
if( kind == null){
	System.out.println(this.toString+" : kind is null" );
}else{
	System.out.println(this.toString+" : kind is "+kind );
}
String yymm_fr = req.getParameter("yymm_fr");
if( yymm_fr == null){
	System.out.println(this.toString+" : yymm_fr is null" );
}else{
	System.out.println(this.toString+" : yymm_fr is "+yymm_fr );
}
String yymm_to = req.getParameter("yymm_to");
if( yymm_to == null){
	System.out.println(this.toString+" : yymm_to is null" );
}else{
	System.out.println(this.toString+" : yymm_to is "+yymm_to );
}
String dept_cd2 = req.getParameter("dept_cd2");
if( dept_cd2 == null){
	System.out.println(this.toString+" : dept_cd2 is null" );
}else{
	System.out.println(this.toString+" : dept_cd2 is "+dept_cd2 );
}
String clas_cd = req.getParameter("clas_cd");
if( clas_cd == null){
	System.out.println(this.toString+" : clas_cd is null" );
}else{
	System.out.println(this.toString+" : clas_cd is "+clas_cd );
}
String dept_len = req.getParameter("dept_len");
if( dept_len == null){
	System.out.println(this.toString+" : dept_len is null" );
}else{
	System.out.println(this.toString+" : dept_len is "+dept_len );
}
String clas_len = req.getParameter("clas_len");
if( clas_len == null){
	System.out.println(this.toString+" : clas_len is null" );
}else{
	System.out.println(this.toString+" : clas_len is "+clas_len );
}
String fixfee_yn = req.getParameter("fixfee_yn");
if( fixfee_yn == null){
	System.out.println(this.toString+" : fixfee_yn is null" );
}else{
	System.out.println(this.toString+" : fixfee_yn is "+fixfee_yn );
}
String dstb_clsf_cd = req.getParameter("dstb_clsf_cd");
if( dstb_clsf_cd == null){
	System.out.println(this.toString+" : dstb_clsf_cd is null" );
}else{
	System.out.println(this.toString+" : dstb_clsf_cd is "+dstb_clsf_cd );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.checkString(req.getParameter("cmpy_cd"));
String kind = Util.checkString(req.getParameter("kind"));
String yymm_fr = Util.checkString(req.getParameter("yymm_fr"));
String yymm_to = Util.checkString(req.getParameter("yymm_to"));
String dept_cd2 = Util.checkString(req.getParameter("dept_cd2"));
String clas_cd = Util.checkString(req.getParameter("clas_cd"));
String dept_len = Util.checkString(req.getParameter("dept_len"));
String clas_len = Util.checkString(req.getParameter("clas_len"));
String fixfee_yn = Util.checkString(req.getParameter("fixfee_yn"));
String dstb_clsf_cd = Util.checkString(req.getParameter("dstb_clsf_cd"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String kind = Util.Uni2Ksc(Util.checkString(req.getParameter("kind")));
String yymm_fr = Util.Uni2Ksc(Util.checkString(req.getParameter("yymm_fr")));
String yymm_to = Util.Uni2Ksc(Util.checkString(req.getParameter("yymm_to")));
String dept_cd2 = Util.Uni2Ksc(Util.checkString(req.getParameter("dept_cd2")));
String clas_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("clas_cd")));
String dept_len = Util.Uni2Ksc(Util.checkString(req.getParameter("dept_len")));
String clas_len = Util.Uni2Ksc(Util.checkString(req.getParameter("clas_len")));
String fixfee_yn = Util.Uni2Ksc(Util.checkString(req.getParameter("fixfee_yn")));
String dstb_clsf_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("dstb_clsf_cd")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setCmpy_cd(cmpy_cd);
dm.setKind(kind);
dm.setYymm_fr(yymm_fr);
dm.setYymm_to(yymm_to);
dm.setDept_cd2(dept_cd2);
dm.setClas_cd(clas_cd);
dm.setDept_len(dept_len);
dm.setClas_len(clas_len);
dm.setFixfee_yn(fixfee_yn);
dm.setDstb_clsf_cd(dstb_clsf_cd);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Thu May 07 17:25:20 KST 2009 */