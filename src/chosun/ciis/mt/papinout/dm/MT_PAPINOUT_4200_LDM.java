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


package chosun.ciis.mt.papinout.dm;

import java.sql.*;
import oracle.jdbc.driver.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.mt.papinout.ds.*;
import chosun.ciis.mt.papinout.rec.*;

/**
 * 
 */


public class MT_PAPINOUT_4200_LDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String cmpy_cd;
	public String make_un_norm_occr_dt_fr;
	public String make_un_norm_occr_dt_to;
	public String fac_clsf;
	public String rela_dept;
	public String now_trad_cd;
	public String caus_prd;
	public String caus_midl;
	public String order_cd;
	public String occr_dt_gubun;

	public MT_PAPINOUT_4200_LDM(){}
	public MT_PAPINOUT_4200_LDM(String cmpy_cd, String make_un_norm_occr_dt_fr, String make_un_norm_occr_dt_to, String fac_clsf, String rela_dept, String now_trad_cd, String caus_prd, String caus_midl, String order_cd, String occr_dt_gubun){
		this.cmpy_cd = cmpy_cd;
		this.make_un_norm_occr_dt_fr = make_un_norm_occr_dt_fr;
		this.make_un_norm_occr_dt_to = make_un_norm_occr_dt_to;
		this.fac_clsf = fac_clsf;
		this.rela_dept = rela_dept;
		this.now_trad_cd = now_trad_cd;
		this.caus_prd = caus_prd;
		this.caus_midl = caus_midl;
		this.order_cd = order_cd;
		this.occr_dt_gubun = occr_dt_gubun;
	}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setMake_un_norm_occr_dt_fr(String make_un_norm_occr_dt_fr){
		this.make_un_norm_occr_dt_fr = make_un_norm_occr_dt_fr;
	}

	public void setMake_un_norm_occr_dt_to(String make_un_norm_occr_dt_to){
		this.make_un_norm_occr_dt_to = make_un_norm_occr_dt_to;
	}

	public void setFac_clsf(String fac_clsf){
		this.fac_clsf = fac_clsf;
	}

	public void setRela_dept(String rela_dept){
		this.rela_dept = rela_dept;
	}

	public void setNow_trad_cd(String now_trad_cd){
		this.now_trad_cd = now_trad_cd;
	}

	public void setCaus_prd(String caus_prd){
		this.caus_prd = caus_prd;
	}

	public void setCaus_midl(String caus_midl){
		this.caus_midl = caus_midl;
	}

	public void setOrder_cd(String order_cd){
		this.order_cd = order_cd;
	}

	public void setOccr_dt_gubun(String occr_dt_gubun){
		this.occr_dt_gubun = occr_dt_gubun;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getMake_un_norm_occr_dt_fr(){
		return this.make_un_norm_occr_dt_fr;
	}

	public String getMake_un_norm_occr_dt_to(){
		return this.make_un_norm_occr_dt_to;
	}

	public String getFac_clsf(){
		return this.fac_clsf;
	}

	public String getRela_dept(){
		return this.rela_dept;
	}

	public String getNow_trad_cd(){
		return this.now_trad_cd;
	}

	public String getCaus_prd(){
		return this.caus_prd;
	}

	public String getCaus_midl(){
		return this.caus_midl;
	}

	public String getOrder_cd(){
		return this.order_cd;
	}

	public String getOccr_dt_gubun(){
		return this.occr_dt_gubun;
	}

	public String getSQL(){
		 return "{ call MISMAT.SP_MT_PAPINOUT_4200_L(? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		MT_PAPINOUT_4200_LDM dm = (MT_PAPINOUT_4200_LDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.cmpy_cd);
		cstmt.setString(4, dm.make_un_norm_occr_dt_fr);
		cstmt.setString(5, dm.make_un_norm_occr_dt_to);
		cstmt.setString(6, dm.fac_clsf);
		cstmt.setString(7, dm.rela_dept);
		cstmt.setString(8, dm.now_trad_cd);
		cstmt.setString(9, dm.caus_prd);
		cstmt.setString(10, dm.caus_midl);
		cstmt.setString(11, dm.order_cd);
		cstmt.setString(12, dm.occr_dt_gubun);
		cstmt.registerOutParameter(13, OracleTypes.CURSOR);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.mt.papinout.ds.MT_PAPINOUT_4200_LDataSet();
	}



	public void print(){
		System.out.println("SQL = " + this.getSQL());
		System.out.println("cmpy_cd = [" + getCmpy_cd() + "]");
		System.out.println("make_un_norm_occr_dt_fr = [" + getMake_un_norm_occr_dt_fr() + "]");
		System.out.println("make_un_norm_occr_dt_to = [" + getMake_un_norm_occr_dt_to() + "]");
		System.out.println("fac_clsf = [" + getFac_clsf() + "]");
		System.out.println("rela_dept = [" + getRela_dept() + "]");
		System.out.println("now_trad_cd = [" + getNow_trad_cd() + "]");
		System.out.println("caus_prd = [" + getCaus_prd() + "]");
		System.out.println("caus_midl = [" + getCaus_midl() + "]");
		System.out.println("order_cd = [" + getOrder_cd() + "]");
		System.out.println("occr_dt_gubun = [" + getOccr_dt_gubun() + "]");
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
String make_un_norm_occr_dt_fr = req.getParameter("make_un_norm_occr_dt_fr");
if( make_un_norm_occr_dt_fr == null){
	System.out.println(this.toString+" : make_un_norm_occr_dt_fr is null" );
}else{
	System.out.println(this.toString+" : make_un_norm_occr_dt_fr is "+make_un_norm_occr_dt_fr );
}
String make_un_norm_occr_dt_to = req.getParameter("make_un_norm_occr_dt_to");
if( make_un_norm_occr_dt_to == null){
	System.out.println(this.toString+" : make_un_norm_occr_dt_to is null" );
}else{
	System.out.println(this.toString+" : make_un_norm_occr_dt_to is "+make_un_norm_occr_dt_to );
}
String fac_clsf = req.getParameter("fac_clsf");
if( fac_clsf == null){
	System.out.println(this.toString+" : fac_clsf is null" );
}else{
	System.out.println(this.toString+" : fac_clsf is "+fac_clsf );
}
String rela_dept = req.getParameter("rela_dept");
if( rela_dept == null){
	System.out.println(this.toString+" : rela_dept is null" );
}else{
	System.out.println(this.toString+" : rela_dept is "+rela_dept );
}
String now_trad_cd = req.getParameter("now_trad_cd");
if( now_trad_cd == null){
	System.out.println(this.toString+" : now_trad_cd is null" );
}else{
	System.out.println(this.toString+" : now_trad_cd is "+now_trad_cd );
}
String caus_prd = req.getParameter("caus_prd");
if( caus_prd == null){
	System.out.println(this.toString+" : caus_prd is null" );
}else{
	System.out.println(this.toString+" : caus_prd is "+caus_prd );
}
String caus_midl = req.getParameter("caus_midl");
if( caus_midl == null){
	System.out.println(this.toString+" : caus_midl is null" );
}else{
	System.out.println(this.toString+" : caus_midl is "+caus_midl );
}
String order_cd = req.getParameter("order_cd");
if( order_cd == null){
	System.out.println(this.toString+" : order_cd is null" );
}else{
	System.out.println(this.toString+" : order_cd is "+order_cd );
}
String occr_dt_gubun = req.getParameter("occr_dt_gubun");
if( occr_dt_gubun == null){
	System.out.println(this.toString+" : occr_dt_gubun is null" );
}else{
	System.out.println(this.toString+" : occr_dt_gubun is "+occr_dt_gubun );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.checkString(req.getParameter("cmpy_cd"));
String make_un_norm_occr_dt_fr = Util.checkString(req.getParameter("make_un_norm_occr_dt_fr"));
String make_un_norm_occr_dt_to = Util.checkString(req.getParameter("make_un_norm_occr_dt_to"));
String fac_clsf = Util.checkString(req.getParameter("fac_clsf"));
String rela_dept = Util.checkString(req.getParameter("rela_dept"));
String now_trad_cd = Util.checkString(req.getParameter("now_trad_cd"));
String caus_prd = Util.checkString(req.getParameter("caus_prd"));
String caus_midl = Util.checkString(req.getParameter("caus_midl"));
String order_cd = Util.checkString(req.getParameter("order_cd"));
String occr_dt_gubun = Util.checkString(req.getParameter("occr_dt_gubun"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String make_un_norm_occr_dt_fr = Util.Uni2Ksc(Util.checkString(req.getParameter("make_un_norm_occr_dt_fr")));
String make_un_norm_occr_dt_to = Util.Uni2Ksc(Util.checkString(req.getParameter("make_un_norm_occr_dt_to")));
String fac_clsf = Util.Uni2Ksc(Util.checkString(req.getParameter("fac_clsf")));
String rela_dept = Util.Uni2Ksc(Util.checkString(req.getParameter("rela_dept")));
String now_trad_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("now_trad_cd")));
String caus_prd = Util.Uni2Ksc(Util.checkString(req.getParameter("caus_prd")));
String caus_midl = Util.Uni2Ksc(Util.checkString(req.getParameter("caus_midl")));
String order_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("order_cd")));
String occr_dt_gubun = Util.Uni2Ksc(Util.checkString(req.getParameter("occr_dt_gubun")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setCmpy_cd(cmpy_cd);
dm.setMake_un_norm_occr_dt_fr(make_un_norm_occr_dt_fr);
dm.setMake_un_norm_occr_dt_to(make_un_norm_occr_dt_to);
dm.setFac_clsf(fac_clsf);
dm.setRela_dept(rela_dept);
dm.setNow_trad_cd(now_trad_cd);
dm.setCaus_prd(caus_prd);
dm.setCaus_midl(caus_midl);
dm.setOrder_cd(order_cd);
dm.setOccr_dt_gubun(occr_dt_gubun);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Tue Apr 21 11:26:34 KST 2009 */