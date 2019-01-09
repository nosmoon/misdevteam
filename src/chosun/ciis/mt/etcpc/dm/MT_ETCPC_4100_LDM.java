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


package chosun.ciis.mt.etcpc.dm;

import java.sql.*;
import oracle.jdbc.driver.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.mt.etcpc.ds.*;
import chosun.ciis.mt.etcpc.rec.*;

/**
 * 
 */


public class MT_ETCPC_4100_LDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String cmpy_cd;
	public String modl_mang_no;
	public String use_pers_flnm;
	public String use_deptcd;
	public String wste_obj_item_yn;
	public String mchn_stat;
	public String lend_item_yn;
	public String rsrt_dt_fr;
	public String rsrt_dt_to;
	public String wste_dd_pers_fr;
	public String wste_dd_pers_to;
	public String pay_dt_fr;
	public String pay_dt_to;

	public MT_ETCPC_4100_LDM(){}
	public MT_ETCPC_4100_LDM(String cmpy_cd, String modl_mang_no, String use_pers_flnm, String use_deptcd, String wste_obj_item_yn, String mchn_stat, String lend_item_yn, String rsrt_dt_fr, String rsrt_dt_to, String wste_dd_pers_fr, String wste_dd_pers_to, String pay_dt_fr, String pay_dt_to){
		this.cmpy_cd = cmpy_cd;
		this.modl_mang_no = modl_mang_no;
		this.use_pers_flnm = use_pers_flnm;
		this.use_deptcd = use_deptcd;
		this.wste_obj_item_yn = wste_obj_item_yn;
		this.mchn_stat = mchn_stat;
		this.lend_item_yn = lend_item_yn;
		this.rsrt_dt_fr = rsrt_dt_fr;
		this.rsrt_dt_to = rsrt_dt_to;
		this.wste_dd_pers_fr = wste_dd_pers_fr;
		this.wste_dd_pers_to = wste_dd_pers_to;
		this.pay_dt_fr = pay_dt_fr;
		this.pay_dt_to = pay_dt_to;
	}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setModl_mang_no(String modl_mang_no){
		this.modl_mang_no = modl_mang_no;
	}

	public void setUse_pers_flnm(String use_pers_flnm){
		this.use_pers_flnm = use_pers_flnm;
	}

	public void setUse_deptcd(String use_deptcd){
		this.use_deptcd = use_deptcd;
	}

	public void setWste_obj_item_yn(String wste_obj_item_yn){
		this.wste_obj_item_yn = wste_obj_item_yn;
	}

	public void setMchn_stat(String mchn_stat){
		this.mchn_stat = mchn_stat;
	}

	public void setLend_item_yn(String lend_item_yn){
		this.lend_item_yn = lend_item_yn;
	}

	public void setRsrt_dt_fr(String rsrt_dt_fr){
		this.rsrt_dt_fr = rsrt_dt_fr;
	}

	public void setRsrt_dt_to(String rsrt_dt_to){
		this.rsrt_dt_to = rsrt_dt_to;
	}

	public void setWste_dd_pers_fr(String wste_dd_pers_fr){
		this.wste_dd_pers_fr = wste_dd_pers_fr;
	}

	public void setWste_dd_pers_to(String wste_dd_pers_to){
		this.wste_dd_pers_to = wste_dd_pers_to;
	}

	public void setPay_dt_fr(String pay_dt_fr){
		this.pay_dt_fr = pay_dt_fr;
	}

	public void setPay_dt_to(String pay_dt_to){
		this.pay_dt_to = pay_dt_to;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getModl_mang_no(){
		return this.modl_mang_no;
	}

	public String getUse_pers_flnm(){
		return this.use_pers_flnm;
	}

	public String getUse_deptcd(){
		return this.use_deptcd;
	}

	public String getWste_obj_item_yn(){
		return this.wste_obj_item_yn;
	}

	public String getMchn_stat(){
		return this.mchn_stat;
	}

	public String getLend_item_yn(){
		return this.lend_item_yn;
	}

	public String getRsrt_dt_fr(){
		return this.rsrt_dt_fr;
	}

	public String getRsrt_dt_to(){
		return this.rsrt_dt_to;
	}

	public String getWste_dd_pers_fr(){
		return this.wste_dd_pers_fr;
	}

	public String getWste_dd_pers_to(){
		return this.wste_dd_pers_to;
	}

	public String getPay_dt_fr(){
		return this.pay_dt_fr;
	}

	public String getPay_dt_to(){
		return this.pay_dt_to;
	}

	public String getSQL(){
		 return "{ call MISMAT.SP_MT_ETCPC_4100_L(? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		MT_ETCPC_4100_LDM dm = (MT_ETCPC_4100_LDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.cmpy_cd);
		cstmt.setString(4, dm.modl_mang_no);
		cstmt.setString(5, dm.use_pers_flnm);
		cstmt.setString(6, dm.use_deptcd);
		cstmt.setString(7, dm.wste_obj_item_yn);
		cstmt.setString(8, dm.mchn_stat);
		cstmt.setString(9, dm.lend_item_yn);
		cstmt.setString(10, dm.rsrt_dt_fr);
		cstmt.setString(11, dm.rsrt_dt_to);
		cstmt.setString(12, dm.wste_dd_pers_fr);
		cstmt.setString(13, dm.wste_dd_pers_to);
		cstmt.setString(14, dm.pay_dt_fr);
		cstmt.setString(15, dm.pay_dt_to);
		cstmt.registerOutParameter(16, OracleTypes.CURSOR);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.mt.etcpc.ds.MT_ETCPC_4100_LDataSet();
	}



	public void print(){
		System.out.println("SQL = " + this.getSQL());
		System.out.println("cmpy_cd = [" + getCmpy_cd() + "]");
		System.out.println("modl_mang_no = [" + getModl_mang_no() + "]");
		System.out.println("use_pers_flnm = [" + getUse_pers_flnm() + "]");
		System.out.println("use_deptcd = [" + getUse_deptcd() + "]");
		System.out.println("wste_obj_item_yn = [" + getWste_obj_item_yn() + "]");
		System.out.println("mchn_stat = [" + getMchn_stat() + "]");
		System.out.println("lend_item_yn = [" + getLend_item_yn() + "]");
		System.out.println("rsrt_dt_fr = [" + getRsrt_dt_fr() + "]");
		System.out.println("rsrt_dt_to = [" + getRsrt_dt_to() + "]");
		System.out.println("wste_dd_pers_fr = [" + getWste_dd_pers_fr() + "]");
		System.out.println("wste_dd_pers_to = [" + getWste_dd_pers_to() + "]");
		System.out.println("pay_dt_fr = [" + getPay_dt_fr() + "]");
		System.out.println("pay_dt_to = [" + getPay_dt_to() + "]");
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
String modl_mang_no = req.getParameter("modl_mang_no");
if( modl_mang_no == null){
	System.out.println(this.toString+" : modl_mang_no is null" );
}else{
	System.out.println(this.toString+" : modl_mang_no is "+modl_mang_no );
}
String use_pers_flnm = req.getParameter("use_pers_flnm");
if( use_pers_flnm == null){
	System.out.println(this.toString+" : use_pers_flnm is null" );
}else{
	System.out.println(this.toString+" : use_pers_flnm is "+use_pers_flnm );
}
String use_deptcd = req.getParameter("use_deptcd");
if( use_deptcd == null){
	System.out.println(this.toString+" : use_deptcd is null" );
}else{
	System.out.println(this.toString+" : use_deptcd is "+use_deptcd );
}
String wste_obj_item_yn = req.getParameter("wste_obj_item_yn");
if( wste_obj_item_yn == null){
	System.out.println(this.toString+" : wste_obj_item_yn is null" );
}else{
	System.out.println(this.toString+" : wste_obj_item_yn is "+wste_obj_item_yn );
}
String mchn_stat = req.getParameter("mchn_stat");
if( mchn_stat == null){
	System.out.println(this.toString+" : mchn_stat is null" );
}else{
	System.out.println(this.toString+" : mchn_stat is "+mchn_stat );
}
String lend_item_yn = req.getParameter("lend_item_yn");
if( lend_item_yn == null){
	System.out.println(this.toString+" : lend_item_yn is null" );
}else{
	System.out.println(this.toString+" : lend_item_yn is "+lend_item_yn );
}
String rsrt_dt_fr = req.getParameter("rsrt_dt_fr");
if( rsrt_dt_fr == null){
	System.out.println(this.toString+" : rsrt_dt_fr is null" );
}else{
	System.out.println(this.toString+" : rsrt_dt_fr is "+rsrt_dt_fr );
}
String rsrt_dt_to = req.getParameter("rsrt_dt_to");
if( rsrt_dt_to == null){
	System.out.println(this.toString+" : rsrt_dt_to is null" );
}else{
	System.out.println(this.toString+" : rsrt_dt_to is "+rsrt_dt_to );
}
String wste_dd_pers_fr = req.getParameter("wste_dd_pers_fr");
if( wste_dd_pers_fr == null){
	System.out.println(this.toString+" : wste_dd_pers_fr is null" );
}else{
	System.out.println(this.toString+" : wste_dd_pers_fr is "+wste_dd_pers_fr );
}
String wste_dd_pers_to = req.getParameter("wste_dd_pers_to");
if( wste_dd_pers_to == null){
	System.out.println(this.toString+" : wste_dd_pers_to is null" );
}else{
	System.out.println(this.toString+" : wste_dd_pers_to is "+wste_dd_pers_to );
}
String pay_dt_fr = req.getParameter("pay_dt_fr");
if( pay_dt_fr == null){
	System.out.println(this.toString+" : pay_dt_fr is null" );
}else{
	System.out.println(this.toString+" : pay_dt_fr is "+pay_dt_fr );
}
String pay_dt_to = req.getParameter("pay_dt_to");
if( pay_dt_to == null){
	System.out.println(this.toString+" : pay_dt_to is null" );
}else{
	System.out.println(this.toString+" : pay_dt_to is "+pay_dt_to );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.checkString(req.getParameter("cmpy_cd"));
String modl_mang_no = Util.checkString(req.getParameter("modl_mang_no"));
String use_pers_flnm = Util.checkString(req.getParameter("use_pers_flnm"));
String use_deptcd = Util.checkString(req.getParameter("use_deptcd"));
String wste_obj_item_yn = Util.checkString(req.getParameter("wste_obj_item_yn"));
String mchn_stat = Util.checkString(req.getParameter("mchn_stat"));
String lend_item_yn = Util.checkString(req.getParameter("lend_item_yn"));
String rsrt_dt_fr = Util.checkString(req.getParameter("rsrt_dt_fr"));
String rsrt_dt_to = Util.checkString(req.getParameter("rsrt_dt_to"));
String wste_dd_pers_fr = Util.checkString(req.getParameter("wste_dd_pers_fr"));
String wste_dd_pers_to = Util.checkString(req.getParameter("wste_dd_pers_to"));
String pay_dt_fr = Util.checkString(req.getParameter("pay_dt_fr"));
String pay_dt_to = Util.checkString(req.getParameter("pay_dt_to"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String modl_mang_no = Util.Uni2Ksc(Util.checkString(req.getParameter("modl_mang_no")));
String use_pers_flnm = Util.Uni2Ksc(Util.checkString(req.getParameter("use_pers_flnm")));
String use_deptcd = Util.Uni2Ksc(Util.checkString(req.getParameter("use_deptcd")));
String wste_obj_item_yn = Util.Uni2Ksc(Util.checkString(req.getParameter("wste_obj_item_yn")));
String mchn_stat = Util.Uni2Ksc(Util.checkString(req.getParameter("mchn_stat")));
String lend_item_yn = Util.Uni2Ksc(Util.checkString(req.getParameter("lend_item_yn")));
String rsrt_dt_fr = Util.Uni2Ksc(Util.checkString(req.getParameter("rsrt_dt_fr")));
String rsrt_dt_to = Util.Uni2Ksc(Util.checkString(req.getParameter("rsrt_dt_to")));
String wste_dd_pers_fr = Util.Uni2Ksc(Util.checkString(req.getParameter("wste_dd_pers_fr")));
String wste_dd_pers_to = Util.Uni2Ksc(Util.checkString(req.getParameter("wste_dd_pers_to")));
String pay_dt_fr = Util.Uni2Ksc(Util.checkString(req.getParameter("pay_dt_fr")));
String pay_dt_to = Util.Uni2Ksc(Util.checkString(req.getParameter("pay_dt_to")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setCmpy_cd(cmpy_cd);
dm.setModl_mang_no(modl_mang_no);
dm.setUse_pers_flnm(use_pers_flnm);
dm.setUse_deptcd(use_deptcd);
dm.setWste_obj_item_yn(wste_obj_item_yn);
dm.setMchn_stat(mchn_stat);
dm.setLend_item_yn(lend_item_yn);
dm.setRsrt_dt_fr(rsrt_dt_fr);
dm.setRsrt_dt_to(rsrt_dt_to);
dm.setWste_dd_pers_fr(wste_dd_pers_fr);
dm.setWste_dd_pers_to(wste_dd_pers_to);
dm.setPay_dt_fr(pay_dt_fr);
dm.setPay_dt_to(pay_dt_to);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Mon Mar 30 17:11:24 KST 2009 */