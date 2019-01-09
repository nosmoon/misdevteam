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


package chosun.ciis.is.rpt.dm;

import java.sql.*;
import oracle.jdbc.driver.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.is.rpt.ds.*;
import chosun.ciis.is.rpt.rec.*;

/**
 * 
 */


public class IS_RPT_2510_LDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String cmpy_cd;
	public String scat_dt_fr;
	public String scat_dt_to;
	public String dept_cd;
	public String sub_dept_cd;
	public String chrg_pers;
	public String sale_clsf;
	public String spc_sale_clsf;
	public String spc_sale_clsf_n;
	public String purc_dlco_no;
	public String purc_dlco_clsf;
	public String sido;
	public String gu;
	public String incmg_pers;

	public IS_RPT_2510_LDM(){}
	public IS_RPT_2510_LDM(String cmpy_cd, String scat_dt_fr, String scat_dt_to, String dept_cd, String sub_dept_cd, String chrg_pers, String sale_clsf, String spc_sale_clsf, String spc_sale_clsf_n, String purc_dlco_no, String purc_dlco_clsf, String sido, String gu, String incmg_pers){
		this.cmpy_cd = cmpy_cd;
		this.scat_dt_fr = scat_dt_fr;
		this.scat_dt_to = scat_dt_to;
		this.dept_cd = dept_cd;
		this.sub_dept_cd = sub_dept_cd;
		this.chrg_pers = chrg_pers;
		this.sale_clsf = sale_clsf;
		this.spc_sale_clsf = spc_sale_clsf;
		this.spc_sale_clsf_n = spc_sale_clsf_n;
		this.purc_dlco_no = purc_dlco_no;
		this.purc_dlco_clsf = purc_dlco_clsf;
		this.sido = sido;
		this.gu = gu;
		this.incmg_pers = incmg_pers;
	}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setScat_dt_fr(String scat_dt_fr){
		this.scat_dt_fr = scat_dt_fr;
	}

	public void setScat_dt_to(String scat_dt_to){
		this.scat_dt_to = scat_dt_to;
	}

	public void setDept_cd(String dept_cd){
		this.dept_cd = dept_cd;
	}

	public void setSub_dept_cd(String sub_dept_cd){
		this.sub_dept_cd = sub_dept_cd;
	}

	public void setChrg_pers(String chrg_pers){
		this.chrg_pers = chrg_pers;
	}

	public void setSale_clsf(String sale_clsf){
		this.sale_clsf = sale_clsf;
	}

	public void setSpc_sale_clsf(String spc_sale_clsf){
		this.spc_sale_clsf = spc_sale_clsf;
	}

	public void setSpc_sale_clsf_n(String spc_sale_clsf_n){
		this.spc_sale_clsf_n = spc_sale_clsf_n;
	}

	public void setPurc_dlco_no(String purc_dlco_no){
		this.purc_dlco_no = purc_dlco_no;
	}

	public void setPurc_dlco_clsf(String purc_dlco_clsf){
		this.purc_dlco_clsf = purc_dlco_clsf;
	}

	public void setSido(String sido){
		this.sido = sido;
	}

	public void setGu(String gu){
		this.gu = gu;
	}

	public void setIncmg_pers(String incmg_pers){
		this.incmg_pers = incmg_pers;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getScat_dt_fr(){
		return this.scat_dt_fr;
	}

	public String getScat_dt_to(){
		return this.scat_dt_to;
	}

	public String getDept_cd(){
		return this.dept_cd;
	}

	public String getSub_dept_cd(){
		return this.sub_dept_cd;
	}

	public String getChrg_pers(){
		return this.chrg_pers;
	}

	public String getSale_clsf(){
		return this.sale_clsf;
	}

	public String getSpc_sale_clsf(){
		return this.spc_sale_clsf;
	}

	public String getSpc_sale_clsf_n(){
		return this.spc_sale_clsf_n;
	}

	public String getPurc_dlco_no(){
		return this.purc_dlco_no;
	}

	public String getPurc_dlco_clsf(){
		return this.purc_dlco_clsf;
	}

	public String getSido(){
		return this.sido;
	}

	public String getGu(){
		return this.gu;
	}

	public String getIncmg_pers(){
		return this.incmg_pers;
	}

	public String getSQL(){
		 return "{ call MISISP.SP_IS_RPT_2510_L(? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		IS_RPT_2510_LDM dm = (IS_RPT_2510_LDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.cmpy_cd);
		cstmt.setString(4, dm.scat_dt_fr);
		cstmt.setString(5, dm.scat_dt_to);
		cstmt.setString(6, dm.dept_cd);
		cstmt.setString(7, dm.sub_dept_cd);
		cstmt.setString(8, dm.chrg_pers);
		cstmt.setString(9, dm.sale_clsf);
		cstmt.setString(10, dm.spc_sale_clsf);
		cstmt.setString(11, dm.spc_sale_clsf_n);
		cstmt.setString(12, dm.purc_dlco_no);
		cstmt.setString(13, dm.purc_dlco_clsf);
		cstmt.setString(14, dm.sido);
		cstmt.setString(15, dm.gu);
		cstmt.setString(16, dm.incmg_pers);
		cstmt.registerOutParameter(17, OracleTypes.CURSOR);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.is.rpt.ds.IS_RPT_2510_LDataSet();
	}



	public void print(){
		System.out.println("SQL = " + this.getSQL());
		System.out.println("cmpy_cd = [" + getCmpy_cd() + "]");
		System.out.println("scat_dt_fr = [" + getScat_dt_fr() + "]");
		System.out.println("scat_dt_to = [" + getScat_dt_to() + "]");
		System.out.println("dept_cd = [" + getDept_cd() + "]");
		System.out.println("sub_dept_cd = [" + getSub_dept_cd() + "]");
		System.out.println("chrg_pers = [" + getChrg_pers() + "]");
		System.out.println("sale_clsf = [" + getSale_clsf() + "]");
		System.out.println("spc_sale_clsf = [" + getSpc_sale_clsf() + "]");
		System.out.println("spc_sale_clsf_n = [" + getSpc_sale_clsf_n() + "]");
		System.out.println("purc_dlco_no = [" + getPurc_dlco_no() + "]");
		System.out.println("purc_dlco_clsf = [" + getPurc_dlco_clsf() + "]");
		System.out.println("sido = [" + getSido() + "]");
		System.out.println("gu = [" + getGu() + "]");
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
String scat_dt_fr = req.getParameter("scat_dt_fr");
if( scat_dt_fr == null){
	System.out.println(this.toString+" : scat_dt_fr is null" );
}else{
	System.out.println(this.toString+" : scat_dt_fr is "+scat_dt_fr );
}
String scat_dt_to = req.getParameter("scat_dt_to");
if( scat_dt_to == null){
	System.out.println(this.toString+" : scat_dt_to is null" );
}else{
	System.out.println(this.toString+" : scat_dt_to is "+scat_dt_to );
}
String dept_cd = req.getParameter("dept_cd");
if( dept_cd == null){
	System.out.println(this.toString+" : dept_cd is null" );
}else{
	System.out.println(this.toString+" : dept_cd is "+dept_cd );
}
String sub_dept_cd = req.getParameter("sub_dept_cd");
if( sub_dept_cd == null){
	System.out.println(this.toString+" : sub_dept_cd is null" );
}else{
	System.out.println(this.toString+" : sub_dept_cd is "+sub_dept_cd );
}
String chrg_pers = req.getParameter("chrg_pers");
if( chrg_pers == null){
	System.out.println(this.toString+" : chrg_pers is null" );
}else{
	System.out.println(this.toString+" : chrg_pers is "+chrg_pers );
}
String sale_clsf = req.getParameter("sale_clsf");
if( sale_clsf == null){
	System.out.println(this.toString+" : sale_clsf is null" );
}else{
	System.out.println(this.toString+" : sale_clsf is "+sale_clsf );
}
String spc_sale_clsf = req.getParameter("spc_sale_clsf");
if( spc_sale_clsf == null){
	System.out.println(this.toString+" : spc_sale_clsf is null" );
}else{
	System.out.println(this.toString+" : spc_sale_clsf is "+spc_sale_clsf );
}
String spc_sale_clsf_n = req.getParameter("spc_sale_clsf_n");
if( spc_sale_clsf_n == null){
	System.out.println(this.toString+" : spc_sale_clsf_n is null" );
}else{
	System.out.println(this.toString+" : spc_sale_clsf_n is "+spc_sale_clsf_n );
}
String purc_dlco_no = req.getParameter("purc_dlco_no");
if( purc_dlco_no == null){
	System.out.println(this.toString+" : purc_dlco_no is null" );
}else{
	System.out.println(this.toString+" : purc_dlco_no is "+purc_dlco_no );
}
String purc_dlco_clsf = req.getParameter("purc_dlco_clsf");
if( purc_dlco_clsf == null){
	System.out.println(this.toString+" : purc_dlco_clsf is null" );
}else{
	System.out.println(this.toString+" : purc_dlco_clsf is "+purc_dlco_clsf );
}
String sido = req.getParameter("sido");
if( sido == null){
	System.out.println(this.toString+" : sido is null" );
}else{
	System.out.println(this.toString+" : sido is "+sido );
}
String gu = req.getParameter("gu");
if( gu == null){
	System.out.println(this.toString+" : gu is null" );
}else{
	System.out.println(this.toString+" : gu is "+gu );
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
String scat_dt_fr = Util.checkString(req.getParameter("scat_dt_fr"));
String scat_dt_to = Util.checkString(req.getParameter("scat_dt_to"));
String dept_cd = Util.checkString(req.getParameter("dept_cd"));
String sub_dept_cd = Util.checkString(req.getParameter("sub_dept_cd"));
String chrg_pers = Util.checkString(req.getParameter("chrg_pers"));
String sale_clsf = Util.checkString(req.getParameter("sale_clsf"));
String spc_sale_clsf = Util.checkString(req.getParameter("spc_sale_clsf"));
String spc_sale_clsf_n = Util.checkString(req.getParameter("spc_sale_clsf_n"));
String purc_dlco_no = Util.checkString(req.getParameter("purc_dlco_no"));
String purc_dlco_clsf = Util.checkString(req.getParameter("purc_dlco_clsf"));
String sido = Util.checkString(req.getParameter("sido"));
String gu = Util.checkString(req.getParameter("gu"));
String incmg_pers = Util.checkString(req.getParameter("incmg_pers"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String scat_dt_fr = Util.Uni2Ksc(Util.checkString(req.getParameter("scat_dt_fr")));
String scat_dt_to = Util.Uni2Ksc(Util.checkString(req.getParameter("scat_dt_to")));
String dept_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("dept_cd")));
String sub_dept_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("sub_dept_cd")));
String chrg_pers = Util.Uni2Ksc(Util.checkString(req.getParameter("chrg_pers")));
String sale_clsf = Util.Uni2Ksc(Util.checkString(req.getParameter("sale_clsf")));
String spc_sale_clsf = Util.Uni2Ksc(Util.checkString(req.getParameter("spc_sale_clsf")));
String spc_sale_clsf_n = Util.Uni2Ksc(Util.checkString(req.getParameter("spc_sale_clsf_n")));
String purc_dlco_no = Util.Uni2Ksc(Util.checkString(req.getParameter("purc_dlco_no")));
String purc_dlco_clsf = Util.Uni2Ksc(Util.checkString(req.getParameter("purc_dlco_clsf")));
String sido = Util.Uni2Ksc(Util.checkString(req.getParameter("sido")));
String gu = Util.Uni2Ksc(Util.checkString(req.getParameter("gu")));
String incmg_pers = Util.Uni2Ksc(Util.checkString(req.getParameter("incmg_pers")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setCmpy_cd(cmpy_cd);
dm.setScat_dt_fr(scat_dt_fr);
dm.setScat_dt_to(scat_dt_to);
dm.setDept_cd(dept_cd);
dm.setSub_dept_cd(sub_dept_cd);
dm.setChrg_pers(chrg_pers);
dm.setSale_clsf(sale_clsf);
dm.setSpc_sale_clsf(spc_sale_clsf);
dm.setSpc_sale_clsf_n(spc_sale_clsf_n);
dm.setPurc_dlco_no(purc_dlco_no);
dm.setPurc_dlco_clsf(purc_dlco_clsf);
dm.setSido(sido);
dm.setGu(gu);
dm.setIncmg_pers(incmg_pers);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Mon Jun 04 21:05:39 KST 2012 */