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


package chosun.ciis.mc.budg.dm;

import java.sql.*;
import oracle.jdbc.driver.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.mc.budg.ds.*;
import chosun.ciis.mc.budg.rec.*;

/**
 * 
 */


public class MC_BUDG_1083_IDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String cmpy_cd;
	public String mode;
	public String clas_cd1;
	public String clas_cd2;
	public String clas_cd3;
	public String clas_cd4;
	public String clas_nm;
	public String clas_abrv_nm;
	public String dtl_dstb_cd;
	public String incmg_pers;
	public String incmg_pers_ipadd;

	public MC_BUDG_1083_IDM(){}
	public MC_BUDG_1083_IDM(String cmpy_cd, String mode, String clas_cd1, String clas_cd2, String clas_cd3, String clas_cd4, String clas_nm, String clas_abrv_nm, String dtl_dstb_cd, String incmg_pers, String incmg_pers_ipadd){
		this.cmpy_cd = cmpy_cd;
		this.mode = mode;
		this.clas_cd1 = clas_cd1;
		this.clas_cd2 = clas_cd2;
		this.clas_cd3 = clas_cd3;
		this.clas_cd4 = clas_cd4;
		this.clas_nm = clas_nm;
		this.clas_abrv_nm = clas_abrv_nm;
		this.dtl_dstb_cd = dtl_dstb_cd;
		this.incmg_pers = incmg_pers;
		this.incmg_pers_ipadd = incmg_pers_ipadd;
	}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setMode(String mode){
		this.mode = mode;
	}

	public void setClas_cd1(String clas_cd1){
		this.clas_cd1 = clas_cd1;
	}

	public void setClas_cd2(String clas_cd2){
		this.clas_cd2 = clas_cd2;
	}

	public void setClas_cd3(String clas_cd3){
		this.clas_cd3 = clas_cd3;
	}

	public void setClas_cd4(String clas_cd4){
		this.clas_cd4 = clas_cd4;
	}

	public void setClas_nm(String clas_nm){
		this.clas_nm = clas_nm;
	}

	public void setClas_abrv_nm(String clas_abrv_nm){
		this.clas_abrv_nm = clas_abrv_nm;
	}

	public void setDtl_dstb_cd(String dtl_dstb_cd){
		this.dtl_dstb_cd = dtl_dstb_cd;
	}

	public void setIncmg_pers(String incmg_pers){
		this.incmg_pers = incmg_pers;
	}

	public void setIncmg_pers_ipadd(String incmg_pers_ipadd){
		this.incmg_pers_ipadd = incmg_pers_ipadd;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getMode(){
		return this.mode;
	}

	public String getClas_cd1(){
		return this.clas_cd1;
	}

	public String getClas_cd2(){
		return this.clas_cd2;
	}

	public String getClas_cd3(){
		return this.clas_cd3;
	}

	public String getClas_cd4(){
		return this.clas_cd4;
	}

	public String getClas_nm(){
		return this.clas_nm;
	}

	public String getClas_abrv_nm(){
		return this.clas_abrv_nm;
	}

	public String getDtl_dstb_cd(){
		return this.dtl_dstb_cd;
	}

	public String getIncmg_pers(){
		return this.incmg_pers;
	}

	public String getIncmg_pers_ipadd(){
		return this.incmg_pers_ipadd;
	}

	public String getSQL(){
		 return "{ call MISFNC.SP_MC_BUDG_1083_I(? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		MC_BUDG_1083_IDM dm = (MC_BUDG_1083_IDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.cmpy_cd);
		cstmt.setString(4, dm.mode);
		cstmt.setString(5, dm.clas_cd1);
		cstmt.setString(6, dm.clas_cd2);
		cstmt.setString(7, dm.clas_cd3);
		cstmt.setString(8, dm.clas_cd4);
		cstmt.setString(9, dm.clas_nm);
		cstmt.setString(10, dm.clas_abrv_nm);
		cstmt.setString(11, dm.dtl_dstb_cd);
		cstmt.setString(12, dm.incmg_pers);
		cstmt.setString(13, dm.incmg_pers_ipadd);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.mc.budg.ds.MC_BUDG_1083_IDataSet();
	}



	public void print(){
		System.out.println("SQL = " + this.getSQL());
		System.out.println("cmpy_cd = [" + getCmpy_cd() + "]");
		System.out.println("mode = [" + getMode() + "]");
		System.out.println("clas_cd1 = [" + getClas_cd1() + "]");
		System.out.println("clas_cd2 = [" + getClas_cd2() + "]");
		System.out.println("clas_cd3 = [" + getClas_cd3() + "]");
		System.out.println("clas_cd4 = [" + getClas_cd4() + "]");
		System.out.println("clas_nm = [" + getClas_nm() + "]");
		System.out.println("clas_abrv_nm = [" + getClas_abrv_nm() + "]");
		System.out.println("dtl_dstb_cd = [" + getDtl_dstb_cd() + "]");
		System.out.println("incmg_pers = [" + getIncmg_pers() + "]");
		System.out.println("incmg_pers_ipadd = [" + getIncmg_pers_ipadd() + "]");
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
String mode = req.getParameter("mode");
if( mode == null){
	System.out.println(this.toString+" : mode is null" );
}else{
	System.out.println(this.toString+" : mode is "+mode );
}
String clas_cd1 = req.getParameter("clas_cd1");
if( clas_cd1 == null){
	System.out.println(this.toString+" : clas_cd1 is null" );
}else{
	System.out.println(this.toString+" : clas_cd1 is "+clas_cd1 );
}
String clas_cd2 = req.getParameter("clas_cd2");
if( clas_cd2 == null){
	System.out.println(this.toString+" : clas_cd2 is null" );
}else{
	System.out.println(this.toString+" : clas_cd2 is "+clas_cd2 );
}
String clas_cd3 = req.getParameter("clas_cd3");
if( clas_cd3 == null){
	System.out.println(this.toString+" : clas_cd3 is null" );
}else{
	System.out.println(this.toString+" : clas_cd3 is "+clas_cd3 );
}
String clas_cd4 = req.getParameter("clas_cd4");
if( clas_cd4 == null){
	System.out.println(this.toString+" : clas_cd4 is null" );
}else{
	System.out.println(this.toString+" : clas_cd4 is "+clas_cd4 );
}
String clas_nm = req.getParameter("clas_nm");
if( clas_nm == null){
	System.out.println(this.toString+" : clas_nm is null" );
}else{
	System.out.println(this.toString+" : clas_nm is "+clas_nm );
}
String clas_abrv_nm = req.getParameter("clas_abrv_nm");
if( clas_abrv_nm == null){
	System.out.println(this.toString+" : clas_abrv_nm is null" );
}else{
	System.out.println(this.toString+" : clas_abrv_nm is "+clas_abrv_nm );
}
String dtl_dstb_cd = req.getParameter("dtl_dstb_cd");
if( dtl_dstb_cd == null){
	System.out.println(this.toString+" : dtl_dstb_cd is null" );
}else{
	System.out.println(this.toString+" : dtl_dstb_cd is "+dtl_dstb_cd );
}
String incmg_pers = req.getParameter("incmg_pers");
if( incmg_pers == null){
	System.out.println(this.toString+" : incmg_pers is null" );
}else{
	System.out.println(this.toString+" : incmg_pers is "+incmg_pers );
}
String incmg_pers_ipadd = req.getParameter("incmg_pers_ipadd");
if( incmg_pers_ipadd == null){
	System.out.println(this.toString+" : incmg_pers_ipadd is null" );
}else{
	System.out.println(this.toString+" : incmg_pers_ipadd is "+incmg_pers_ipadd );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.checkString(req.getParameter("cmpy_cd"));
String mode = Util.checkString(req.getParameter("mode"));
String clas_cd1 = Util.checkString(req.getParameter("clas_cd1"));
String clas_cd2 = Util.checkString(req.getParameter("clas_cd2"));
String clas_cd3 = Util.checkString(req.getParameter("clas_cd3"));
String clas_cd4 = Util.checkString(req.getParameter("clas_cd4"));
String clas_nm = Util.checkString(req.getParameter("clas_nm"));
String clas_abrv_nm = Util.checkString(req.getParameter("clas_abrv_nm"));
String dtl_dstb_cd = Util.checkString(req.getParameter("dtl_dstb_cd"));
String incmg_pers = Util.checkString(req.getParameter("incmg_pers"));
String incmg_pers_ipadd = Util.checkString(req.getParameter("incmg_pers_ipadd"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String mode = Util.Uni2Ksc(Util.checkString(req.getParameter("mode")));
String clas_cd1 = Util.Uni2Ksc(Util.checkString(req.getParameter("clas_cd1")));
String clas_cd2 = Util.Uni2Ksc(Util.checkString(req.getParameter("clas_cd2")));
String clas_cd3 = Util.Uni2Ksc(Util.checkString(req.getParameter("clas_cd3")));
String clas_cd4 = Util.Uni2Ksc(Util.checkString(req.getParameter("clas_cd4")));
String clas_nm = Util.Uni2Ksc(Util.checkString(req.getParameter("clas_nm")));
String clas_abrv_nm = Util.Uni2Ksc(Util.checkString(req.getParameter("clas_abrv_nm")));
String dtl_dstb_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("dtl_dstb_cd")));
String incmg_pers = Util.Uni2Ksc(Util.checkString(req.getParameter("incmg_pers")));
String incmg_pers_ipadd = Util.Uni2Ksc(Util.checkString(req.getParameter("incmg_pers_ipadd")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setCmpy_cd(cmpy_cd);
dm.setMode(mode);
dm.setClas_cd1(clas_cd1);
dm.setClas_cd2(clas_cd2);
dm.setClas_cd3(clas_cd3);
dm.setClas_cd4(clas_cd4);
dm.setClas_nm(clas_nm);
dm.setClas_abrv_nm(clas_abrv_nm);
dm.setDtl_dstb_cd(dtl_dstb_cd);
dm.setIncmg_pers(incmg_pers);
dm.setIncmg_pers_ipadd(incmg_pers_ipadd);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Mon Apr 13 20:41:13 KST 2009 */