/***************************************************************************************************
* 파일명 : .java
* 기능 :  공통-세금계산서-상태조회(스마트빌)
* 작성일자 : 2010-05-18
* 작성자 : 노상현
***************************************************************************************************/
/***************************************************************************************************
* 수정내역 :
* 수정자 :
* 수정일자 :
* 백업 : 
***************************************************************************************************/


package chosun.ciis.co.smtb.dm;

import java.sql.*;
import oracle.jdbc.driver.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.co.smtb.ds.*;
import chosun.ciis.co.smtb.rec.*;

/**
 * 공통-세금계산서-상태조회(스마트빌)
 */


public class CO_SMTB_1031_LDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String cmpy_cd;
	public String supbuy_type;
	public String direction;
	public String dti_status;
	public String sup_bizplace_code;
	public String dti_wdate_fr;
	public String dti_wdate_to;
	public String com_regno;
	public String com_name;
	public String slip_clsf_cd;
	public String slip_occr_dt_fr;
	public String slip_occr_dt_to;
	public String dti_type;
	public String dtt_yn;
	public String incmg_pers_ip;
	public String incmg_pers;
	public String search_type;

	public CO_SMTB_1031_LDM(){}
	public CO_SMTB_1031_LDM(String cmpy_cd, String supbuy_type, String direction, String dti_status, String sup_bizplace_code, String dti_wdate_fr, String dti_wdate_to, String com_regno, String com_name, String slip_clsf_cd, String slip_occr_dt_fr, String slip_occr_dt_to, String dti_type, String dtt_yn, String incmg_pers_ip, String incmg_pers, String search_type){
		this.cmpy_cd = cmpy_cd;
		this.supbuy_type = supbuy_type;
		this.direction = direction;
		this.dti_status = dti_status;
		this.sup_bizplace_code = sup_bizplace_code;
		this.dti_wdate_fr = dti_wdate_fr;
		this.dti_wdate_to = dti_wdate_to;
		this.com_regno = com_regno;
		this.com_name = com_name;
		this.slip_clsf_cd = slip_clsf_cd;
		this.slip_occr_dt_fr = slip_occr_dt_fr;
		this.slip_occr_dt_to = slip_occr_dt_to;
		this.dti_type = dti_type;
		this.dtt_yn = dtt_yn;
		this.incmg_pers_ip = incmg_pers_ip;
		this.incmg_pers = incmg_pers;
		this.search_type = search_type;
	}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setSupbuy_type(String supbuy_type){
		this.supbuy_type = supbuy_type;
	}

	public void setDirection(String direction){
		this.direction = direction;
	}

	public void setDti_status(String dti_status){
		this.dti_status = dti_status;
	}

	public void setSup_bizplace_code(String sup_bizplace_code){
		this.sup_bizplace_code = sup_bizplace_code;
	}

	public void setDti_wdate_fr(String dti_wdate_fr){
		this.dti_wdate_fr = dti_wdate_fr;
	}

	public void setDti_wdate_to(String dti_wdate_to){
		this.dti_wdate_to = dti_wdate_to;
	}

	public void setCom_regno(String com_regno){
		this.com_regno = com_regno;
	}

	public void setCom_name(String com_name){
		this.com_name = com_name;
	}

	public void setSlip_clsf_cd(String slip_clsf_cd){
		this.slip_clsf_cd = slip_clsf_cd;
	}

	public void setSlip_occr_dt_fr(String slip_occr_dt_fr){
		this.slip_occr_dt_fr = slip_occr_dt_fr;
	}

	public void setSlip_occr_dt_to(String slip_occr_dt_to){
		this.slip_occr_dt_to = slip_occr_dt_to;
	}

	public void setDti_type(String dti_type){
		this.dti_type = dti_type;
	}

	public void setDtt_yn(String dtt_yn){
		this.dtt_yn = dtt_yn;
	}

	public void setIncmg_pers_ip(String incmg_pers_ip){
		this.incmg_pers_ip = incmg_pers_ip;
	}

	public void setIncmg_pers(String incmg_pers){
		this.incmg_pers = incmg_pers;
	}

	public void setSearch_type(String search_type){
		this.search_type = search_type;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getSupbuy_type(){
		return this.supbuy_type;
	}

	public String getDirection(){
		return this.direction;
	}

	public String getDti_status(){
		return this.dti_status;
	}

	public String getSup_bizplace_code(){
		return this.sup_bizplace_code;
	}

	public String getDti_wdate_fr(){
		return this.dti_wdate_fr;
	}

	public String getDti_wdate_to(){
		return this.dti_wdate_to;
	}

	public String getCom_regno(){
		return this.com_regno;
	}

	public String getCom_name(){
		return this.com_name;
	}

	public String getSlip_clsf_cd(){
		return this.slip_clsf_cd;
	}

	public String getSlip_occr_dt_fr(){
		return this.slip_occr_dt_fr;
	}

	public String getSlip_occr_dt_to(){
		return this.slip_occr_dt_to;
	}

	public String getDti_type(){
		return this.dti_type;
	}

	public String getDtt_yn(){
		return this.dtt_yn;
	}

	public String getIncmg_pers_ip(){
		return this.incmg_pers_ip;
	}

	public String getIncmg_pers(){
		return this.incmg_pers;
	}

	public String getSearch_type(){
		return this.search_type;
	}

	public String getSQL(){
		 return "{ call MISCOM.SP_CO_SMTB_1031_L(? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		CO_SMTB_1031_LDM dm = (CO_SMTB_1031_LDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.cmpy_cd);
		cstmt.setString(4, dm.supbuy_type);
		cstmt.setString(5, dm.direction);
		cstmt.setString(6, dm.dti_status);
		cstmt.setString(7, dm.sup_bizplace_code);
		cstmt.setString(8, dm.dti_wdate_fr);
		cstmt.setString(9, dm.dti_wdate_to);
		cstmt.setString(10, dm.com_regno);
		cstmt.setString(11, dm.com_name);
		cstmt.setString(12, dm.slip_clsf_cd);
		cstmt.setString(13, dm.slip_occr_dt_fr);
		cstmt.setString(14, dm.slip_occr_dt_to);
		cstmt.setString(15, dm.dti_type);
		cstmt.setString(16, dm.dtt_yn);
		cstmt.setString(17, dm.incmg_pers_ip);
		cstmt.setString(18, dm.incmg_pers);
		cstmt.setString(19, dm.search_type);
		cstmt.registerOutParameter(20, OracleTypes.CURSOR);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.co.smtb.ds.CO_SMTB_1031_LDataSet();
	}



	public void print(){
		System.out.println("SQL = " + this.getSQL());
		System.out.println("cmpy_cd = [" + getCmpy_cd() + "]");
		System.out.println("supbuy_type = [" + getSupbuy_type() + "]");
		System.out.println("direction = [" + getDirection() + "]");
		System.out.println("dti_status = [" + getDti_status() + "]");
		System.out.println("sup_bizplace_code = [" + getSup_bizplace_code() + "]");
		System.out.println("dti_wdate_fr = [" + getDti_wdate_fr() + "]");
		System.out.println("dti_wdate_to = [" + getDti_wdate_to() + "]");
		System.out.println("com_regno = [" + getCom_regno() + "]");
		System.out.println("com_name = [" + getCom_name() + "]");
		System.out.println("slip_clsf_cd = [" + getSlip_clsf_cd() + "]");
		System.out.println("slip_occr_dt_fr = [" + getSlip_occr_dt_fr() + "]");
		System.out.println("slip_occr_dt_to = [" + getSlip_occr_dt_to() + "]");
		System.out.println("dti_type = [" + getDti_type() + "]");
		System.out.println("dtt_yn = [" + getDtt_yn() + "]");
		System.out.println("incmg_pers_ip = [" + getIncmg_pers_ip() + "]");
		System.out.println("incmg_pers = [" + getIncmg_pers() + "]");
		System.out.println("search_type = [" + getSearch_type() + "]");
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
String supbuy_type = req.getParameter("supbuy_type");
if( supbuy_type == null){
	System.out.println(this.toString+" : supbuy_type is null" );
}else{
	System.out.println(this.toString+" : supbuy_type is "+supbuy_type );
}
String direction = req.getParameter("direction");
if( direction == null){
	System.out.println(this.toString+" : direction is null" );
}else{
	System.out.println(this.toString+" : direction is "+direction );
}
String dti_status = req.getParameter("dti_status");
if( dti_status == null){
	System.out.println(this.toString+" : dti_status is null" );
}else{
	System.out.println(this.toString+" : dti_status is "+dti_status );
}
String sup_bizplace_code = req.getParameter("sup_bizplace_code");
if( sup_bizplace_code == null){
	System.out.println(this.toString+" : sup_bizplace_code is null" );
}else{
	System.out.println(this.toString+" : sup_bizplace_code is "+sup_bizplace_code );
}
String dti_wdate_fr = req.getParameter("dti_wdate_fr");
if( dti_wdate_fr == null){
	System.out.println(this.toString+" : dti_wdate_fr is null" );
}else{
	System.out.println(this.toString+" : dti_wdate_fr is "+dti_wdate_fr );
}
String dti_wdate_to = req.getParameter("dti_wdate_to");
if( dti_wdate_to == null){
	System.out.println(this.toString+" : dti_wdate_to is null" );
}else{
	System.out.println(this.toString+" : dti_wdate_to is "+dti_wdate_to );
}
String com_regno = req.getParameter("com_regno");
if( com_regno == null){
	System.out.println(this.toString+" : com_regno is null" );
}else{
	System.out.println(this.toString+" : com_regno is "+com_regno );
}
String com_name = req.getParameter("com_name");
if( com_name == null){
	System.out.println(this.toString+" : com_name is null" );
}else{
	System.out.println(this.toString+" : com_name is "+com_name );
}
String slip_clsf_cd = req.getParameter("slip_clsf_cd");
if( slip_clsf_cd == null){
	System.out.println(this.toString+" : slip_clsf_cd is null" );
}else{
	System.out.println(this.toString+" : slip_clsf_cd is "+slip_clsf_cd );
}
String slip_occr_dt_fr = req.getParameter("slip_occr_dt_fr");
if( slip_occr_dt_fr == null){
	System.out.println(this.toString+" : slip_occr_dt_fr is null" );
}else{
	System.out.println(this.toString+" : slip_occr_dt_fr is "+slip_occr_dt_fr );
}
String slip_occr_dt_to = req.getParameter("slip_occr_dt_to");
if( slip_occr_dt_to == null){
	System.out.println(this.toString+" : slip_occr_dt_to is null" );
}else{
	System.out.println(this.toString+" : slip_occr_dt_to is "+slip_occr_dt_to );
}
String dti_type = req.getParameter("dti_type");
if( dti_type == null){
	System.out.println(this.toString+" : dti_type is null" );
}else{
	System.out.println(this.toString+" : dti_type is "+dti_type );
}
String dtt_yn = req.getParameter("dtt_yn");
if( dtt_yn == null){
	System.out.println(this.toString+" : dtt_yn is null" );
}else{
	System.out.println(this.toString+" : dtt_yn is "+dtt_yn );
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
String search_type = req.getParameter("search_type");
if( search_type == null){
	System.out.println(this.toString+" : search_type is null" );
}else{
	System.out.println(this.toString+" : search_type is "+search_type );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.checkString(req.getParameter("cmpy_cd"));
String supbuy_type = Util.checkString(req.getParameter("supbuy_type"));
String direction = Util.checkString(req.getParameter("direction"));
String dti_status = Util.checkString(req.getParameter("dti_status"));
String sup_bizplace_code = Util.checkString(req.getParameter("sup_bizplace_code"));
String dti_wdate_fr = Util.checkString(req.getParameter("dti_wdate_fr"));
String dti_wdate_to = Util.checkString(req.getParameter("dti_wdate_to"));
String com_regno = Util.checkString(req.getParameter("com_regno"));
String com_name = Util.checkString(req.getParameter("com_name"));
String slip_clsf_cd = Util.checkString(req.getParameter("slip_clsf_cd"));
String slip_occr_dt_fr = Util.checkString(req.getParameter("slip_occr_dt_fr"));
String slip_occr_dt_to = Util.checkString(req.getParameter("slip_occr_dt_to"));
String dti_type = Util.checkString(req.getParameter("dti_type"));
String dtt_yn = Util.checkString(req.getParameter("dtt_yn"));
String incmg_pers_ip = Util.checkString(req.getParameter("incmg_pers_ip"));
String incmg_pers = Util.checkString(req.getParameter("incmg_pers"));
String search_type = Util.checkString(req.getParameter("search_type"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String supbuy_type = Util.Uni2Ksc(Util.checkString(req.getParameter("supbuy_type")));
String direction = Util.Uni2Ksc(Util.checkString(req.getParameter("direction")));
String dti_status = Util.Uni2Ksc(Util.checkString(req.getParameter("dti_status")));
String sup_bizplace_code = Util.Uni2Ksc(Util.checkString(req.getParameter("sup_bizplace_code")));
String dti_wdate_fr = Util.Uni2Ksc(Util.checkString(req.getParameter("dti_wdate_fr")));
String dti_wdate_to = Util.Uni2Ksc(Util.checkString(req.getParameter("dti_wdate_to")));
String com_regno = Util.Uni2Ksc(Util.checkString(req.getParameter("com_regno")));
String com_name = Util.Uni2Ksc(Util.checkString(req.getParameter("com_name")));
String slip_clsf_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("slip_clsf_cd")));
String slip_occr_dt_fr = Util.Uni2Ksc(Util.checkString(req.getParameter("slip_occr_dt_fr")));
String slip_occr_dt_to = Util.Uni2Ksc(Util.checkString(req.getParameter("slip_occr_dt_to")));
String dti_type = Util.Uni2Ksc(Util.checkString(req.getParameter("dti_type")));
String dtt_yn = Util.Uni2Ksc(Util.checkString(req.getParameter("dtt_yn")));
String incmg_pers_ip = Util.Uni2Ksc(Util.checkString(req.getParameter("incmg_pers_ip")));
String incmg_pers = Util.Uni2Ksc(Util.checkString(req.getParameter("incmg_pers")));
String search_type = Util.Uni2Ksc(Util.checkString(req.getParameter("search_type")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setCmpy_cd(cmpy_cd);
dm.setSupbuy_type(supbuy_type);
dm.setDirection(direction);
dm.setDti_status(dti_status);
dm.setSup_bizplace_code(sup_bizplace_code);
dm.setDti_wdate_fr(dti_wdate_fr);
dm.setDti_wdate_to(dti_wdate_to);
dm.setCom_regno(com_regno);
dm.setCom_name(com_name);
dm.setSlip_clsf_cd(slip_clsf_cd);
dm.setSlip_occr_dt_fr(slip_occr_dt_fr);
dm.setSlip_occr_dt_to(slip_occr_dt_to);
dm.setDti_type(dti_type);
dm.setDtt_yn(dtt_yn);
dm.setIncmg_pers_ip(incmg_pers_ip);
dm.setIncmg_pers(incmg_pers);
dm.setSearch_type(search_type);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Tue May 18 17:41:18 KST 2010 */