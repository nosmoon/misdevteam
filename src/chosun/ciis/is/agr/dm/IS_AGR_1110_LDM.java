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


package chosun.ciis.is.agr.dm;

import java.sql.*;
import oracle.jdbc.driver.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.is.agr.ds.*;
import chosun.ciis.is.agr.rec.*;

/**
 * 
 */


public class IS_AGR_1110_LDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String cmpy_cd;
	public String scat_dt_fr;
	public String scat_dt_to;
	public String dept_cd;
	public String sub_dept_cd;
	public String chrg_pers;
	public String dlco_clsf_cd_seq;
	public String advcs_cd;
	public String indt_cd;
	public String sale_clsf;
	public String spc_sale_clsf;
	public String std_cd;
	public String rvord_type;
	public String advt_nm;
	public String suply_pers_erplace_cd;
	public String fix_yn;
	public String purc_dlco_clsf_cd_seq;
	public String asnt_dstc_cd;
	public String incmg_pers;

	public IS_AGR_1110_LDM(){}
	public IS_AGR_1110_LDM(String cmpy_cd, String scat_dt_fr, String scat_dt_to, String dept_cd, String sub_dept_cd, String chrg_pers, String dlco_clsf_cd_seq, String advcs_cd, String indt_cd, String sale_clsf, String spc_sale_clsf, String std_cd, String rvord_type, String advt_nm, String suply_pers_erplace_cd, String fix_yn, String purc_dlco_clsf_cd_seq, String asnt_dstc_cd, String incmg_pers){
		this.cmpy_cd = cmpy_cd;
		this.scat_dt_fr = scat_dt_fr;
		this.scat_dt_to = scat_dt_to;
		this.dept_cd = dept_cd;
		this.sub_dept_cd = sub_dept_cd;
		this.chrg_pers = chrg_pers;
		this.dlco_clsf_cd_seq = dlco_clsf_cd_seq;
		this.advcs_cd = advcs_cd;
		this.indt_cd = indt_cd;
		this.sale_clsf = sale_clsf;
		this.spc_sale_clsf = spc_sale_clsf;
		this.std_cd = std_cd;
		this.rvord_type = rvord_type;
		this.advt_nm = advt_nm;
		this.suply_pers_erplace_cd = suply_pers_erplace_cd;
		this.fix_yn = fix_yn;
		this.purc_dlco_clsf_cd_seq = purc_dlco_clsf_cd_seq;
		this.asnt_dstc_cd = asnt_dstc_cd;
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

	public void setDlco_clsf_cd_seq(String dlco_clsf_cd_seq){
		this.dlco_clsf_cd_seq = dlco_clsf_cd_seq;
	}

	public void setAdvcs_cd(String advcs_cd){
		this.advcs_cd = advcs_cd;
	}

	public void setIndt_cd(String indt_cd){
		this.indt_cd = indt_cd;
	}

	public void setSale_clsf(String sale_clsf){
		this.sale_clsf = sale_clsf;
	}

	public void setSpc_sale_clsf(String spc_sale_clsf){
		this.spc_sale_clsf = spc_sale_clsf;
	}

	public void setStd_cd(String std_cd){
		this.std_cd = std_cd;
	}

	public void setRvord_type(String rvord_type){
		this.rvord_type = rvord_type;
	}

	public void setAdvt_nm(String advt_nm){
		this.advt_nm = advt_nm;
	}

	public void setSuply_pers_erplace_cd(String suply_pers_erplace_cd){
		this.suply_pers_erplace_cd = suply_pers_erplace_cd;
	}

	public void setFix_yn(String fix_yn){
		this.fix_yn = fix_yn;
	}

	public void setPurc_dlco_clsf_cd_seq(String purc_dlco_clsf_cd_seq){
		this.purc_dlco_clsf_cd_seq = purc_dlco_clsf_cd_seq;
	}

	public void setAsnt_dstc_cd(String asnt_dstc_cd){
		this.asnt_dstc_cd = asnt_dstc_cd;
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

	public String getDlco_clsf_cd_seq(){
		return this.dlco_clsf_cd_seq;
	}

	public String getAdvcs_cd(){
		return this.advcs_cd;
	}

	public String getIndt_cd(){
		return this.indt_cd;
	}

	public String getSale_clsf(){
		return this.sale_clsf;
	}

	public String getSpc_sale_clsf(){
		return this.spc_sale_clsf;
	}

	public String getStd_cd(){
		return this.std_cd;
	}

	public String getRvord_type(){
		return this.rvord_type;
	}

	public String getAdvt_nm(){
		return this.advt_nm;
	}

	public String getSuply_pers_erplace_cd(){
		return this.suply_pers_erplace_cd;
	}

	public String getFix_yn(){
		return this.fix_yn;
	}

	public String getPurc_dlco_clsf_cd_seq(){
		return this.purc_dlco_clsf_cd_seq;
	}

	public String getAsnt_dstc_cd(){
		return this.asnt_dstc_cd;
	}

	public String getIncmg_pers(){
		return this.incmg_pers;
	}

	public String getSQL(){
		 return "{ call MISISP.SP_IS_AGR_1110_L(? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		IS_AGR_1110_LDM dm = (IS_AGR_1110_LDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.cmpy_cd);
		cstmt.setString(4, dm.scat_dt_fr);
		cstmt.setString(5, dm.scat_dt_to);
		cstmt.setString(6, dm.dept_cd);
		cstmt.setString(7, dm.sub_dept_cd);
		cstmt.setString(8, dm.chrg_pers);
		cstmt.setString(9, dm.dlco_clsf_cd_seq);
		cstmt.setString(10, dm.advcs_cd);
		cstmt.setString(11, dm.indt_cd);
		cstmt.setString(12, dm.sale_clsf);
		cstmt.setString(13, dm.spc_sale_clsf);
		cstmt.setString(14, dm.std_cd);
		cstmt.setString(15, dm.rvord_type);
		cstmt.setString(16, dm.advt_nm);
		cstmt.setString(17, dm.suply_pers_erplace_cd);
		cstmt.setString(18, dm.fix_yn);
		cstmt.setString(19, dm.purc_dlco_clsf_cd_seq);
		cstmt.setString(20, dm.asnt_dstc_cd);
		cstmt.setString(21, dm.incmg_pers);
		cstmt.registerOutParameter(22, OracleTypes.CURSOR);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.is.agr.ds.IS_AGR_1110_LDataSet();
	}



	public void print(){
		System.out.println("SQL = " + this.getSQL());
		System.out.println("cmpy_cd = [" + getCmpy_cd() + "]");
		System.out.println("scat_dt_fr = [" + getScat_dt_fr() + "]");
		System.out.println("scat_dt_to = [" + getScat_dt_to() + "]");
		System.out.println("dept_cd = [" + getDept_cd() + "]");
		System.out.println("sub_dept_cd = [" + getSub_dept_cd() + "]");
		System.out.println("chrg_pers = [" + getChrg_pers() + "]");
		System.out.println("dlco_clsf_cd_seq = [" + getDlco_clsf_cd_seq() + "]");
		System.out.println("advcs_cd = [" + getAdvcs_cd() + "]");
		System.out.println("indt_cd = [" + getIndt_cd() + "]");
		System.out.println("sale_clsf = [" + getSale_clsf() + "]");
		System.out.println("spc_sale_clsf = [" + getSpc_sale_clsf() + "]");
		System.out.println("std_cd = [" + getStd_cd() + "]");
		System.out.println("rvord_type = [" + getRvord_type() + "]");
		System.out.println("advt_nm = [" + getAdvt_nm() + "]");
		System.out.println("suply_pers_erplace_cd = [" + getSuply_pers_erplace_cd() + "]");
		System.out.println("fix_yn = [" + getFix_yn() + "]");
		System.out.println("purc_dlco_clsf_cd_seq = [" + getPurc_dlco_clsf_cd_seq() + "]");
		System.out.println("asnt_dstc_cd = [" + getAsnt_dstc_cd() + "]");
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
String dlco_clsf_cd_seq = req.getParameter("dlco_clsf_cd_seq");
if( dlco_clsf_cd_seq == null){
	System.out.println(this.toString+" : dlco_clsf_cd_seq is null" );
}else{
	System.out.println(this.toString+" : dlco_clsf_cd_seq is "+dlco_clsf_cd_seq );
}
String advcs_cd = req.getParameter("advcs_cd");
if( advcs_cd == null){
	System.out.println(this.toString+" : advcs_cd is null" );
}else{
	System.out.println(this.toString+" : advcs_cd is "+advcs_cd );
}
String indt_cd = req.getParameter("indt_cd");
if( indt_cd == null){
	System.out.println(this.toString+" : indt_cd is null" );
}else{
	System.out.println(this.toString+" : indt_cd is "+indt_cd );
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
String std_cd = req.getParameter("std_cd");
if( std_cd == null){
	System.out.println(this.toString+" : std_cd is null" );
}else{
	System.out.println(this.toString+" : std_cd is "+std_cd );
}
String rvord_type = req.getParameter("rvord_type");
if( rvord_type == null){
	System.out.println(this.toString+" : rvord_type is null" );
}else{
	System.out.println(this.toString+" : rvord_type is "+rvord_type );
}
String advt_nm = req.getParameter("advt_nm");
if( advt_nm == null){
	System.out.println(this.toString+" : advt_nm is null" );
}else{
	System.out.println(this.toString+" : advt_nm is "+advt_nm );
}
String suply_pers_erplace_cd = req.getParameter("suply_pers_erplace_cd");
if( suply_pers_erplace_cd == null){
	System.out.println(this.toString+" : suply_pers_erplace_cd is null" );
}else{
	System.out.println(this.toString+" : suply_pers_erplace_cd is "+suply_pers_erplace_cd );
}
String fix_yn = req.getParameter("fix_yn");
if( fix_yn == null){
	System.out.println(this.toString+" : fix_yn is null" );
}else{
	System.out.println(this.toString+" : fix_yn is "+fix_yn );
}
String purc_dlco_clsf_cd_seq = req.getParameter("purc_dlco_clsf_cd_seq");
if( purc_dlco_clsf_cd_seq == null){
	System.out.println(this.toString+" : purc_dlco_clsf_cd_seq is null" );
}else{
	System.out.println(this.toString+" : purc_dlco_clsf_cd_seq is "+purc_dlco_clsf_cd_seq );
}
String asnt_dstc_cd = req.getParameter("asnt_dstc_cd");
if( asnt_dstc_cd == null){
	System.out.println(this.toString+" : asnt_dstc_cd is null" );
}else{
	System.out.println(this.toString+" : asnt_dstc_cd is "+asnt_dstc_cd );
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
String dlco_clsf_cd_seq = Util.checkString(req.getParameter("dlco_clsf_cd_seq"));
String advcs_cd = Util.checkString(req.getParameter("advcs_cd"));
String indt_cd = Util.checkString(req.getParameter("indt_cd"));
String sale_clsf = Util.checkString(req.getParameter("sale_clsf"));
String spc_sale_clsf = Util.checkString(req.getParameter("spc_sale_clsf"));
String std_cd = Util.checkString(req.getParameter("std_cd"));
String rvord_type = Util.checkString(req.getParameter("rvord_type"));
String advt_nm = Util.checkString(req.getParameter("advt_nm"));
String suply_pers_erplace_cd = Util.checkString(req.getParameter("suply_pers_erplace_cd"));
String fix_yn = Util.checkString(req.getParameter("fix_yn"));
String purc_dlco_clsf_cd_seq = Util.checkString(req.getParameter("purc_dlco_clsf_cd_seq"));
String asnt_dstc_cd = Util.checkString(req.getParameter("asnt_dstc_cd"));
String incmg_pers = Util.checkString(req.getParameter("incmg_pers"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String scat_dt_fr = Util.Uni2Ksc(Util.checkString(req.getParameter("scat_dt_fr")));
String scat_dt_to = Util.Uni2Ksc(Util.checkString(req.getParameter("scat_dt_to")));
String dept_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("dept_cd")));
String sub_dept_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("sub_dept_cd")));
String chrg_pers = Util.Uni2Ksc(Util.checkString(req.getParameter("chrg_pers")));
String dlco_clsf_cd_seq = Util.Uni2Ksc(Util.checkString(req.getParameter("dlco_clsf_cd_seq")));
String advcs_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("advcs_cd")));
String indt_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("indt_cd")));
String sale_clsf = Util.Uni2Ksc(Util.checkString(req.getParameter("sale_clsf")));
String spc_sale_clsf = Util.Uni2Ksc(Util.checkString(req.getParameter("spc_sale_clsf")));
String std_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("std_cd")));
String rvord_type = Util.Uni2Ksc(Util.checkString(req.getParameter("rvord_type")));
String advt_nm = Util.Uni2Ksc(Util.checkString(req.getParameter("advt_nm")));
String suply_pers_erplace_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("suply_pers_erplace_cd")));
String fix_yn = Util.Uni2Ksc(Util.checkString(req.getParameter("fix_yn")));
String purc_dlco_clsf_cd_seq = Util.Uni2Ksc(Util.checkString(req.getParameter("purc_dlco_clsf_cd_seq")));
String asnt_dstc_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("asnt_dstc_cd")));
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
dm.setDlco_clsf_cd_seq(dlco_clsf_cd_seq);
dm.setAdvcs_cd(advcs_cd);
dm.setIndt_cd(indt_cd);
dm.setSale_clsf(sale_clsf);
dm.setSpc_sale_clsf(spc_sale_clsf);
dm.setStd_cd(std_cd);
dm.setRvord_type(rvord_type);
dm.setAdvt_nm(advt_nm);
dm.setSuply_pers_erplace_cd(suply_pers_erplace_cd);
dm.setFix_yn(fix_yn);
dm.setPurc_dlco_clsf_cd_seq(purc_dlco_clsf_cd_seq);
dm.setAsnt_dstc_cd(asnt_dstc_cd);
dm.setIncmg_pers(incmg_pers);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Tue May 08 17:52:43 KST 2012 */