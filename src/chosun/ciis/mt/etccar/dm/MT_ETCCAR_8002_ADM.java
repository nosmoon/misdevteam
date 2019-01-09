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


package chosun.ciis.mt.etccar.dm;

import java.sql.*;
import oracle.jdbc.driver.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.mt.etccar.ds.*;
import chosun.ciis.mt.etccar.rec.*;

/**
 * 
 */


public class MT_ETCCAR_8002_ADM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String cmpy_cd;
	public String drvr_cd;
	public String drvr_nm;
	public String tel_no;
	public String in_cmpy_dt;
	public String lvcmpy_dt;
	public String use_yn;
	public String incmg_pers_ipaddr;
	public String incmg_pers;
	public String gubun;

	public MT_ETCCAR_8002_ADM(){}
	public MT_ETCCAR_8002_ADM(String cmpy_cd, String drvr_cd, String drvr_nm, String tel_no, String in_cmpy_dt, String lvcmpy_dt, String use_yn, String incmg_pers_ipaddr, String incmg_pers, String gubun){
		this.cmpy_cd = cmpy_cd;
		this.drvr_cd = drvr_cd;
		this.drvr_nm = drvr_nm;
		this.tel_no = tel_no;
		this.in_cmpy_dt = in_cmpy_dt;
		this.lvcmpy_dt = lvcmpy_dt;
		this.use_yn = use_yn;
		this.incmg_pers_ipaddr = incmg_pers_ipaddr;
		this.incmg_pers = incmg_pers;
		this.gubun = gubun;
	}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setDrvr_cd(String drvr_cd){
		this.drvr_cd = drvr_cd;
	}

	public void setDrvr_nm(String drvr_nm){
		this.drvr_nm = drvr_nm;
	}

	public void setTel_no(String tel_no){
		this.tel_no = tel_no;
	}

	public void setIn_cmpy_dt(String in_cmpy_dt){
		this.in_cmpy_dt = in_cmpy_dt;
	}

	public void setLvcmpy_dt(String lvcmpy_dt){
		this.lvcmpy_dt = lvcmpy_dt;
	}

	public void setUse_yn(String use_yn){
		this.use_yn = use_yn;
	}

	public void setIncmg_pers_ipaddr(String incmg_pers_ipaddr){
		this.incmg_pers_ipaddr = incmg_pers_ipaddr;
	}

	public void setIncmg_pers(String incmg_pers){
		this.incmg_pers = incmg_pers;
	}

	public void setGubun(String gubun){
		this.gubun = gubun;
	}
	
	public String getCmpy_cd(){
		return this.cmpy_cd;
	}
	
	public String getDrvr_cd(){
		return this.drvr_cd;
	}

	public String getDrvr_nm(){
		return this.drvr_nm;
	}

	public String getTel_no(){
		return this.tel_no;
	}

	public String getIn_cmpy_dt(){
		return this.in_cmpy_dt;
	}

	public String getLvcmpy_dt(){
		return this.lvcmpy_dt;
	}

	public String getUse_yn(){
		return this.use_yn;
	}

	public String getIncmg_pers_ipaddr(){
		return this.incmg_pers_ipaddr;
	}

	public String getIncmg_pers(){
		return this.incmg_pers;
	}

	public String getGubun(){
		return this.gubun;
	}

	public String getSQL(){
		 return "{ call MISMAT.SP_MT_ETCCAR_8002_A(?, ? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		MT_ETCCAR_8002_ADM dm = (MT_ETCCAR_8002_ADM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.cmpy_cd);
		cstmt.setString(4, dm.drvr_cd);
		cstmt.setString(5, dm.drvr_nm);
		cstmt.setString(6, dm.tel_no);
		cstmt.setString(7, dm.in_cmpy_dt);
		cstmt.setString(8, dm.lvcmpy_dt);
		cstmt.setString(9, dm.use_yn);
		cstmt.setString(10, dm.incmg_pers_ipaddr);
		cstmt.setString(11, dm.incmg_pers);
		cstmt.setString(12, dm.gubun);
		cstmt.registerOutParameter(13, OracleTypes.CURSOR);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.mt.etccar.ds.MT_ETCCAR_8002_ADataSet();
	}



	public void print(){
		System.out.println("SQL = " + this.getSQL());
		System.out.println("cmpy_cd = [" + getCmpy_cd() + "]");
		System.out.println("drvr_cd = [" + getDrvr_cd() + "]");
		System.out.println("drvr_nm = [" + getDrvr_nm() + "]");
		System.out.println("tel_no = [" + getTel_no() + "]");
		System.out.println("in_cmpy_dt = [" + getIn_cmpy_dt() + "]");
		System.out.println("lvcmpy_dt = [" + getLvcmpy_dt() + "]");
		System.out.println("use_yn = [" + getUse_yn() + "]");
		System.out.println("incmg_pers_ipaddr = [" + getIncmg_pers_ipaddr() + "]");
		System.out.println("incmg_pers = [" + getIncmg_pers() + "]");
		System.out.println("gubun = [" + getGubun() + "]");
	}
}
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리 및 결과확인 검사시 사용하십시오.

String driver_cd = req.getParameter("driver_cd");
if( driver_cd == null){
	System.out.println(this.toString+" : driver_cd is null" );
}else{
	System.out.println(this.toString+" : driver_cd is "+driver_cd );
}
String driver_nm = req.getParameter("driver_nm");
if( driver_nm == null){
	System.out.println(this.toString+" : driver_nm is null" );
}else{
	System.out.println(this.toString+" : driver_nm is "+driver_nm );
}
String tel_no = req.getParameter("tel_no");
if( tel_no == null){
	System.out.println(this.toString+" : tel_no is null" );
}else{
	System.out.println(this.toString+" : tel_no is "+tel_no );
}
String in_cmpy_dt = req.getParameter("in_cmpy_dt");
if( in_cmpy_dt == null){
	System.out.println(this.toString+" : in_cmpy_dt is null" );
}else{
	System.out.println(this.toString+" : in_cmpy_dt is "+in_cmpy_dt );
}
String lvcmpy_dt = req.getParameter("lvcmpy_dt");
if( lvcmpy_dt == null){
	System.out.println(this.toString+" : lvcmpy_dt is null" );
}else{
	System.out.println(this.toString+" : lvcmpy_dt is "+lvcmpy_dt );
}
String use_yn = req.getParameter("use_yn");
if( use_yn == null){
	System.out.println(this.toString+" : use_yn is null" );
}else{
	System.out.println(this.toString+" : use_yn is "+use_yn );
}
String incmg_pers_ipaddr = req.getParameter("incmg_pers_ipaddr");
if( incmg_pers_ipaddr == null){
	System.out.println(this.toString+" : incmg_pers_ipaddr is null" );
}else{
	System.out.println(this.toString+" : incmg_pers_ipaddr is "+incmg_pers_ipaddr );
}
String incmg_pers = req.getParameter("incmg_pers");
if( incmg_pers == null){
	System.out.println(this.toString+" : incmg_pers is null" );
}else{
	System.out.println(this.toString+" : incmg_pers is "+incmg_pers );
}
String gubun = req.getParameter("gubun");
if( gubun == null){
	System.out.println(this.toString+" : gubun is null" );
}else{
	System.out.println(this.toString+" : gubun is "+gubun );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리시 사용하십시오.

String driver_cd = Util.checkString(req.getParameter("driver_cd"));
String driver_nm = Util.checkString(req.getParameter("driver_nm"));
String tel_no = Util.checkString(req.getParameter("tel_no"));
String in_cmpy_dt = Util.checkString(req.getParameter("in_cmpy_dt"));
String lvcmpy_dt = Util.checkString(req.getParameter("lvcmpy_dt"));
String use_yn = Util.checkString(req.getParameter("use_yn"));
String incmg_pers_ipaddr = Util.checkString(req.getParameter("incmg_pers_ipaddr"));
String incmg_pers = Util.checkString(req.getParameter("incmg_pers"));
String gubun = Util.checkString(req.getParameter("gubun"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String driver_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("driver_cd")));
String driver_nm = Util.Uni2Ksc(Util.checkString(req.getParameter("driver_nm")));
String tel_no = Util.Uni2Ksc(Util.checkString(req.getParameter("tel_no")));
String in_cmpy_dt = Util.Uni2Ksc(Util.checkString(req.getParameter("in_cmpy_dt")));
String lvcmpy_dt = Util.Uni2Ksc(Util.checkString(req.getParameter("lvcmpy_dt")));
String use_yn = Util.Uni2Ksc(Util.checkString(req.getParameter("use_yn")));
String incmg_pers_ipaddr = Util.Uni2Ksc(Util.checkString(req.getParameter("incmg_pers_ipaddr")));
String incmg_pers = Util.Uni2Ksc(Util.checkString(req.getParameter("incmg_pers")));
String gubun = Util.Uni2Ksc(Util.checkString(req.getParameter("gubun")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setDriver_cd(driver_cd);
dm.setDriver_nm(driver_nm);
dm.setTel_no(tel_no);
dm.setIn_cmpy_dt(in_cmpy_dt);
dm.setLvcmpy_dt(lvcmpy_dt);
dm.setUse_yn(use_yn);
dm.setIncmg_pers_ipaddr(incmg_pers_ipaddr);
dm.setIncmg_pers(incmg_pers);
dm.setGubun(gubun);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Wed Aug 22 16:18:11 KST 2012 */