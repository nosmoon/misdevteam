/***************************************************************************************************
* 파일명 : .java
* 기능 :  공통-세금계산서-목록조회(스마트빌)
* 작성일자 : 2010-03-23
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
 * 공통-세금계산서-목록조회(스마트빌)
 */


public class CO_SMTB_1101_LDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String cmpy_cd;
	public String dti_wdate_fr;
	public String dti_wdate_to;
	public String sup_bizplace_code;
	public String com_regno;
	public String com_name;
	public String dti_type;
	public String dtt_yn;
	public String slip_yn;
	public String incmg_pers_ip;
	public String incmg_pers;

	public CO_SMTB_1101_LDM(){}
	public CO_SMTB_1101_LDM(String cmpy_cd, String dti_wdate_fr, String dti_wdate_to, String sup_bizplace_code, String com_regno, String com_name, String dti_type, String dtt_yn, String slip_yn, String incmg_pers_ip, String incmg_pers){
		this.cmpy_cd = cmpy_cd;
		this.dti_wdate_fr = dti_wdate_fr;
		this.dti_wdate_to = dti_wdate_to;
		this.sup_bizplace_code = sup_bizplace_code;
		this.com_regno = com_regno;
		this.com_name = com_name;
		this.dti_type = dti_type;
		this.dtt_yn = dtt_yn;
		this.slip_yn = slip_yn;
		this.incmg_pers_ip = incmg_pers_ip;
		this.incmg_pers = incmg_pers;
	}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setDti_wdate_fr(String dti_wdate_fr){
		this.dti_wdate_fr = dti_wdate_fr;
	}

	public void setDti_wdate_to(String dti_wdate_to){
		this.dti_wdate_to = dti_wdate_to;
	}

	public void setSup_bizplace_code(String sup_bizplace_code){
		this.sup_bizplace_code = sup_bizplace_code;
	}

	public void setCom_regno(String com_regno){
		this.com_regno = com_regno;
	}

	public void setCom_name(String com_name){
		this.com_name = com_name;
	}

	public void setDti_type(String dti_type){
		this.dti_type = dti_type;
	}

	public void setDtt_yn(String dtt_yn){
		this.dtt_yn = dtt_yn;
	}

	public void setSlip_yn(String slip_yn){
		this.slip_yn = slip_yn;
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

	public String getDti_wdate_fr(){
		return this.dti_wdate_fr;
	}

	public String getDti_wdate_to(){
		return this.dti_wdate_to;
	}

	public String getSup_bizplace_code(){
		return this.sup_bizplace_code;
	}

	public String getCom_regno(){
		return this.com_regno;
	}

	public String getCom_name(){
		return this.com_name;
	}

	public String getDti_type(){
		return this.dti_type;
	}

	public String getDtt_yn(){
		return this.dtt_yn;
	}

	public String getSlip_yn(){
		return this.slip_yn;
	}

	public String getIncmg_pers_ip(){
		return this.incmg_pers_ip;
	}

	public String getIncmg_pers(){
		return this.incmg_pers;
	}

	public String getSQL(){
		 return "{ call MISCOM.SP_CO_SMTB_1101_L(? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		CO_SMTB_1101_LDM dm = (CO_SMTB_1101_LDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.cmpy_cd);
		cstmt.setString(4, dm.dti_wdate_fr);
		cstmt.setString(5, dm.dti_wdate_to);
		cstmt.setString(6, dm.sup_bizplace_code);
		cstmt.setString(7, dm.com_regno);
		cstmt.setString(8, dm.com_name);
		cstmt.setString(9, dm.dti_type);
		cstmt.setString(10, dm.dtt_yn);
		cstmt.setString(11, dm.slip_yn);
		cstmt.setString(12, dm.incmg_pers_ip);
		cstmt.setString(13, dm.incmg_pers);
		cstmt.registerOutParameter(14, OracleTypes.CURSOR);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.co.smtb.ds.CO_SMTB_1101_LDataSet();
	}



	public void print(){
		System.out.println("SQL = " + this.getSQL());
		System.out.println("cmpy_cd = [" + getCmpy_cd() + "]");
		System.out.println("dti_wdate_fr = [" + getDti_wdate_fr() + "]");
		System.out.println("dti_wdate_to = [" + getDti_wdate_to() + "]");
		System.out.println("sup_bizplace_code = [" + getSup_bizplace_code() + "]");
		System.out.println("com_regno = [" + getCom_regno() + "]");
		System.out.println("com_name = [" + getCom_name() + "]");
		System.out.println("dti_type = [" + getDti_type() + "]");
		System.out.println("dtt_yn = [" + getDtt_yn() + "]");
		System.out.println("slip_yn = [" + getSlip_yn() + "]");
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
String sup_bizplace_code = req.getParameter("sup_bizplace_code");
if( sup_bizplace_code == null){
	System.out.println(this.toString+" : sup_bizplace_code is null" );
}else{
	System.out.println(this.toString+" : sup_bizplace_code is "+sup_bizplace_code );
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
String slip_yn = req.getParameter("slip_yn");
if( slip_yn == null){
	System.out.println(this.toString+" : slip_yn is null" );
}else{
	System.out.println(this.toString+" : slip_yn is "+slip_yn );
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
String dti_wdate_fr = Util.checkString(req.getParameter("dti_wdate_fr"));
String dti_wdate_to = Util.checkString(req.getParameter("dti_wdate_to"));
String sup_bizplace_code = Util.checkString(req.getParameter("sup_bizplace_code"));
String com_regno = Util.checkString(req.getParameter("com_regno"));
String com_name = Util.checkString(req.getParameter("com_name"));
String dti_type = Util.checkString(req.getParameter("dti_type"));
String dtt_yn = Util.checkString(req.getParameter("dtt_yn"));
String slip_yn = Util.checkString(req.getParameter("slip_yn"));
String incmg_pers_ip = Util.checkString(req.getParameter("incmg_pers_ip"));
String incmg_pers = Util.checkString(req.getParameter("incmg_pers"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String dti_wdate_fr = Util.Uni2Ksc(Util.checkString(req.getParameter("dti_wdate_fr")));
String dti_wdate_to = Util.Uni2Ksc(Util.checkString(req.getParameter("dti_wdate_to")));
String sup_bizplace_code = Util.Uni2Ksc(Util.checkString(req.getParameter("sup_bizplace_code")));
String com_regno = Util.Uni2Ksc(Util.checkString(req.getParameter("com_regno")));
String com_name = Util.Uni2Ksc(Util.checkString(req.getParameter("com_name")));
String dti_type = Util.Uni2Ksc(Util.checkString(req.getParameter("dti_type")));
String dtt_yn = Util.Uni2Ksc(Util.checkString(req.getParameter("dtt_yn")));
String slip_yn = Util.Uni2Ksc(Util.checkString(req.getParameter("slip_yn")));
String incmg_pers_ip = Util.Uni2Ksc(Util.checkString(req.getParameter("incmg_pers_ip")));
String incmg_pers = Util.Uni2Ksc(Util.checkString(req.getParameter("incmg_pers")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setCmpy_cd(cmpy_cd);
dm.setDti_wdate_fr(dti_wdate_fr);
dm.setDti_wdate_to(dti_wdate_to);
dm.setSup_bizplace_code(sup_bizplace_code);
dm.setCom_regno(com_regno);
dm.setCom_name(com_name);
dm.setDti_type(dti_type);
dm.setDtt_yn(dtt_yn);
dm.setSlip_yn(slip_yn);
dm.setIncmg_pers_ip(incmg_pers_ip);
dm.setIncmg_pers(incmg_pers);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Wed Apr 07 16:53:40 KST 2010 */