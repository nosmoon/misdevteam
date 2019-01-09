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


package chosun.ciis.sp.sal.dm;

import java.sql.*;
import oracle.jdbc.driver.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.sp.sal.ds.*;
import chosun.ciis.sp.sal.rec.*;

/**
 * 
 */


public class SP_SAL_2430_ADM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String cmpy_cd;
	public String mappli;
	public String auto_shift_clsf;
	public String dduc_clsf;
	public String dduc_clsf_e;
	public String bo_nm;
	public String bo_cd;
	public String req_amt;
	public String incmg_pers_ip;
	public String incmg_pers;

	public SP_SAL_2430_ADM(){}
	public SP_SAL_2430_ADM(String cmpy_cd, String mappli, String auto_shift_clsf, String dduc_clsf, String dduc_clsf_e, String bo_nm, String bo_cd, String req_amt, String incmg_pers_ip, String incmg_pers){
		this.cmpy_cd = cmpy_cd;
		this.mappli = mappli;
		this.auto_shift_clsf = auto_shift_clsf;
		this.dduc_clsf = dduc_clsf;
		this.dduc_clsf_e = dduc_clsf_e;
		this.bo_nm = bo_nm;
		this.bo_cd = bo_cd;
		this.req_amt = req_amt;
		this.incmg_pers_ip = incmg_pers_ip;
		this.incmg_pers = incmg_pers;
	}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setMappli(String mappli){
		this.mappli = mappli;
	}

	public void setAuto_shift_clsf(String auto_shift_clsf){
		this.auto_shift_clsf = auto_shift_clsf;
	}

	public void setDduc_clsf(String dduc_clsf){
		this.dduc_clsf = dduc_clsf;
	}

	public void setDduc_clsf_e(String dduc_clsf_e){
		this.dduc_clsf_e = dduc_clsf_e;
	}

	public void setBo_nm(String bo_nm){
		this.bo_nm = bo_nm;
	}

	public void setBo_cd(String bo_cd){
		this.bo_cd = bo_cd;
	}

	public void setReq_amt(String req_amt){
		this.req_amt = req_amt;
	}

	public void setIncmg_pers_ip(String incmg_pers_ip){
		this.incmg_pers_ip = incmg_pers_ip;
	}

	public void setIncmg_pers(String incmg_pers){
		this.incmg_pers = incmg_pers;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getMappli(){
		return this.mappli;
	}

	public String getAuto_shift_clsf(){
		return this.auto_shift_clsf;
	}

	public String getDduc_clsf(){
		return this.dduc_clsf;
	}

	public String getDduc_clsf_e(){
		return this.dduc_clsf_e;
	}

	public String getBo_nm(){
		return this.bo_nm;
	}

	public String getBo_cd(){
		return this.bo_cd;
	}

	public String getReq_amt(){
		return this.req_amt;
	}

	public String getIncmg_pers_ip(){
		return this.incmg_pers_ip;
	}

	public String getIncmg_pers(){
		return this.incmg_pers;
	}

	public String getSQL(){
		 return "{ call MISISP.SP_SP_SAL_2430_A(? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		SP_SAL_2430_ADM dm = (SP_SAL_2430_ADM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.cmpy_cd);
		cstmt.setString(4, dm.mappli);
		cstmt.setString(5, dm.auto_shift_clsf);
		cstmt.setString(6, dm.dduc_clsf);
		cstmt.setString(7, dm.dduc_clsf_e);
		cstmt.setString(8, dm.bo_nm);
		cstmt.setString(9, dm.bo_cd);
		cstmt.setString(10, dm.req_amt);
		cstmt.setString(11, dm.incmg_pers_ip);
		cstmt.setString(12, dm.incmg_pers);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.sp.sal.ds.SP_SAL_2430_ADataSet();
	}



	public void print(){
		System.out.println("SQL = " + this.getSQL());
		System.out.println("cmpy_cd = [" + getCmpy_cd() + "]");
		System.out.println("mappli = [" + getMappli() + "]");
		System.out.println("auto_shift_clsf = [" + getAuto_shift_clsf() + "]");
		System.out.println("dduc_clsf = [" + getDduc_clsf() + "]");
		System.out.println("dduc_clsf_e = [" + getDduc_clsf_e() + "]");
		System.out.println("bo_nm = [" + getBo_nm() + "]");
		System.out.println("bo_cd = [" + getBo_cd() + "]");
		System.out.println("req_amt = [" + getReq_amt() + "]");
		System.out.println("incmg_pers_ip = [" + getIncmg_pers_ip() + "]");
		System.out.println("incmg_pers = [" + getIncmg_pers() + "]");
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
String mappli = req.getParameter("mappli");
if( mappli == null){
	System.out.println(this.toString+" : mappli is null" );
}else{
	System.out.println(this.toString+" : mappli is "+mappli );
}
String auto_shift_clsf = req.getParameter("auto_shift_clsf");
if( auto_shift_clsf == null){
	System.out.println(this.toString+" : auto_shift_clsf is null" );
}else{
	System.out.println(this.toString+" : auto_shift_clsf is "+auto_shift_clsf );
}
String dduc_clsf = req.getParameter("dduc_clsf");
if( dduc_clsf == null){
	System.out.println(this.toString+" : dduc_clsf is null" );
}else{
	System.out.println(this.toString+" : dduc_clsf is "+dduc_clsf );
}
String dduc_clsf_e = req.getParameter("dduc_clsf_e");
if( dduc_clsf_e == null){
	System.out.println(this.toString+" : dduc_clsf_e is null" );
}else{
	System.out.println(this.toString+" : dduc_clsf_e is "+dduc_clsf_e );
}
String bo_nm = req.getParameter("bo_nm");
if( bo_nm == null){
	System.out.println(this.toString+" : bo_nm is null" );
}else{
	System.out.println(this.toString+" : bo_nm is "+bo_nm );
}
String bo_cd = req.getParameter("bo_cd");
if( bo_cd == null){
	System.out.println(this.toString+" : bo_cd is null" );
}else{
	System.out.println(this.toString+" : bo_cd is "+bo_cd );
}
String req_amt = req.getParameter("req_amt");
if( req_amt == null){
	System.out.println(this.toString+" : req_amt is null" );
}else{
	System.out.println(this.toString+" : req_amt is "+req_amt );
}
String incmg_pers_ip = req.getParameter("incmg_pers_ip");
if( incmg_pers_ip == null){
	System.out.println(this.toString+" : incmg_pers_ip is null" );
}else{
	System.out.println(this.toString+" : incmg_pers_ip is "+incmg_pers_ip );
}
String incmg_pers = req.getParameter("incmg_pers");
if( incmg_pers == null){
	System.out.println(this.toString+" : incmg_pers is null" );
}else{
	System.out.println(this.toString+" : incmg_pers is "+incmg_pers );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.checkString(req.getParameter("cmpy_cd"));
String mappli = Util.checkString(req.getParameter("mappli"));
String auto_shift_clsf = Util.checkString(req.getParameter("auto_shift_clsf"));
String dduc_clsf = Util.checkString(req.getParameter("dduc_clsf"));
String dduc_clsf_e = Util.checkString(req.getParameter("dduc_clsf_e"));
String bo_nm = Util.checkString(req.getParameter("bo_nm"));
String bo_cd = Util.checkString(req.getParameter("bo_cd"));
String req_amt = Util.checkString(req.getParameter("req_amt"));
String incmg_pers_ip = Util.checkString(req.getParameter("incmg_pers_ip"));
String incmg_pers = Util.checkString(req.getParameter("incmg_pers"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String mappli = Util.Uni2Ksc(Util.checkString(req.getParameter("mappli")));
String auto_shift_clsf = Util.Uni2Ksc(Util.checkString(req.getParameter("auto_shift_clsf")));
String dduc_clsf = Util.Uni2Ksc(Util.checkString(req.getParameter("dduc_clsf")));
String dduc_clsf_e = Util.Uni2Ksc(Util.checkString(req.getParameter("dduc_clsf_e")));
String bo_nm = Util.Uni2Ksc(Util.checkString(req.getParameter("bo_nm")));
String bo_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("bo_cd")));
String req_amt = Util.Uni2Ksc(Util.checkString(req.getParameter("req_amt")));
String incmg_pers_ip = Util.Uni2Ksc(Util.checkString(req.getParameter("incmg_pers_ip")));
String incmg_pers = Util.Uni2Ksc(Util.checkString(req.getParameter("incmg_pers")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setCmpy_cd(cmpy_cd);
dm.setMappli(mappli);
dm.setAuto_shift_clsf(auto_shift_clsf);
dm.setDduc_clsf(dduc_clsf);
dm.setDduc_clsf_e(dduc_clsf_e);
dm.setBo_nm(bo_nm);
dm.setBo_cd(bo_cd);
dm.setReq_amt(req_amt);
dm.setIncmg_pers_ip(incmg_pers_ip);
dm.setIncmg_pers(incmg_pers);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Wed Jul 18 14:51:41 KST 2012 */