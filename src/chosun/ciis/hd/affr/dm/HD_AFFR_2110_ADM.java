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


package chosun.ciis.hd.affr.dm;

import java.sql.*;
import oracle.jdbc.driver.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.hd.affr.ds.*;
import chosun.ciis.hd.affr.rec.*;

/**
 * 
 */


public class HD_AFFR_2110_ADM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String mode;
	public String cmpy_cd;
	public String emp_lcls_cd;
	public String congr_condl_cd;
	public String aply_basi_dt;
	public String congr_condl_fee;
	public String art_flower;
	public String ofcr_congr_condl_fee;
	public String ofcr_art_flower;
	public String incmg_pers_ipadd;
	public String incmg_pers;

	public HD_AFFR_2110_ADM(){}
	public HD_AFFR_2110_ADM(String mode, String cmpy_cd, String emp_lcls_cd, String congr_condl_cd, String aply_basi_dt, String congr_condl_fee, String art_flower, String ofcr_congr_condl_fee, String ofcr_art_flower, String incmg_pers_ipadd, String incmg_pers){
		this.mode = mode;
		this.cmpy_cd = cmpy_cd;
		this.emp_lcls_cd = emp_lcls_cd;
		this.congr_condl_cd = congr_condl_cd;
		this.aply_basi_dt = aply_basi_dt;
		this.congr_condl_fee = congr_condl_fee;
		this.art_flower = art_flower;
		this.ofcr_congr_condl_fee = ofcr_congr_condl_fee;
		this.ofcr_art_flower = ofcr_art_flower;
		this.incmg_pers_ipadd = incmg_pers_ipadd;
		this.incmg_pers = incmg_pers;
	}

	public void setMode(String mode){
		this.mode = mode;
	}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setEmp_lcls_cd(String emp_lcls_cd){
		this.emp_lcls_cd = emp_lcls_cd;
	}

	public void setCongr_condl_cd(String congr_condl_cd){
		this.congr_condl_cd = congr_condl_cd;
	}

	public void setAply_basi_dt(String aply_basi_dt){
		this.aply_basi_dt = aply_basi_dt;
	}

	public void setCongr_condl_fee(String congr_condl_fee){
		this.congr_condl_fee = congr_condl_fee;
	}

	public void setArt_flower(String art_flower){
		this.art_flower = art_flower;
	}

	public void setOfcr_congr_condl_fee(String ofcr_congr_condl_fee){
		this.ofcr_congr_condl_fee = ofcr_congr_condl_fee;
	}

	public void setOfcr_art_flower(String ofcr_art_flower){
		this.ofcr_art_flower = ofcr_art_flower;
	}

	public void setIncmg_pers_ipadd(String incmg_pers_ipadd){
		this.incmg_pers_ipadd = incmg_pers_ipadd;
	}

	public void setIncmg_pers(String incmg_pers){
		this.incmg_pers = incmg_pers;
	}

	public String getMode(){
		return this.mode;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getEmp_lcls_cd(){
		return this.emp_lcls_cd;
	}

	public String getCongr_condl_cd(){
		return this.congr_condl_cd;
	}

	public String getAply_basi_dt(){
		return this.aply_basi_dt;
	}

	public String getCongr_condl_fee(){
		return this.congr_condl_fee;
	}

	public String getArt_flower(){
		return this.art_flower;
	}

	public String getOfcr_congr_condl_fee(){
		return this.ofcr_congr_condl_fee;
	}

	public String getOfcr_art_flower(){
		return this.ofcr_art_flower;
	}

	public String getIncmg_pers_ipadd(){
		return this.incmg_pers_ipadd;
	}

	public String getIncmg_pers(){
		return this.incmg_pers;
	}

	public String getSQL(){
		 return "{ call MISHDL.SP_HD_AFFR_2110_A(? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		HD_AFFR_2110_ADM dm = (HD_AFFR_2110_ADM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.mode);
		cstmt.setString(4, dm.cmpy_cd);
		cstmt.setString(5, dm.emp_lcls_cd);
		cstmt.setString(6, dm.congr_condl_cd);
		cstmt.setString(7, dm.aply_basi_dt);
		cstmt.setString(8, dm.congr_condl_fee);
		cstmt.setString(9, dm.art_flower);
		cstmt.setString(10, dm.ofcr_congr_condl_fee);
		cstmt.setString(11, dm.ofcr_art_flower);
		cstmt.setString(12, dm.incmg_pers_ipadd);
		cstmt.setString(13, dm.incmg_pers);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.hd.affr.ds.HD_AFFR_2110_ADataSet();
	}



	public void print(){
		System.out.println("SQL = " + this.getSQL());
		System.out.println("mode = [" + getMode() + "]");
		System.out.println("cmpy_cd = [" + getCmpy_cd() + "]");
		System.out.println("emp_lcls_cd = [" + getEmp_lcls_cd() + "]");
		System.out.println("congr_condl_cd = [" + getCongr_condl_cd() + "]");
		System.out.println("aply_basi_dt = [" + getAply_basi_dt() + "]");
		System.out.println("congr_condl_fee = [" + getCongr_condl_fee() + "]");
		System.out.println("art_flower = [" + getArt_flower() + "]");
		System.out.println("ofcr_congr_condl_fee = [" + getOfcr_congr_condl_fee() + "]");
		System.out.println("ofcr_art_flower = [" + getOfcr_art_flower() + "]");
		System.out.println("incmg_pers_ipadd = [" + getIncmg_pers_ipadd() + "]");
		System.out.println("incmg_pers = [" + getIncmg_pers() + "]");
	}
}
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리 및 결과확인 검사시 사용하십시오.

String mode = req.getParameter("mode");
if( mode == null){
	System.out.println(this.toString+" : mode is null" );
}else{
	System.out.println(this.toString+" : mode is "+mode );
}
String cmpy_cd = req.getParameter("cmpy_cd");
if( cmpy_cd == null){
	System.out.println(this.toString+" : cmpy_cd is null" );
}else{
	System.out.println(this.toString+" : cmpy_cd is "+cmpy_cd );
}
String emp_lcls_cd = req.getParameter("emp_lcls_cd");
if( emp_lcls_cd == null){
	System.out.println(this.toString+" : emp_lcls_cd is null" );
}else{
	System.out.println(this.toString+" : emp_lcls_cd is "+emp_lcls_cd );
}
String congr_condl_cd = req.getParameter("congr_condl_cd");
if( congr_condl_cd == null){
	System.out.println(this.toString+" : congr_condl_cd is null" );
}else{
	System.out.println(this.toString+" : congr_condl_cd is "+congr_condl_cd );
}
String aply_basi_dt = req.getParameter("aply_basi_dt");
if( aply_basi_dt == null){
	System.out.println(this.toString+" : aply_basi_dt is null" );
}else{
	System.out.println(this.toString+" : aply_basi_dt is "+aply_basi_dt );
}
String congr_condl_fee = req.getParameter("congr_condl_fee");
if( congr_condl_fee == null){
	System.out.println(this.toString+" : congr_condl_fee is null" );
}else{
	System.out.println(this.toString+" : congr_condl_fee is "+congr_condl_fee );
}
String art_flower = req.getParameter("art_flower");
if( art_flower == null){
	System.out.println(this.toString+" : art_flower is null" );
}else{
	System.out.println(this.toString+" : art_flower is "+art_flower );
}
String ofcr_congr_condl_fee = req.getParameter("ofcr_congr_condl_fee");
if( ofcr_congr_condl_fee == null){
	System.out.println(this.toString+" : ofcr_congr_condl_fee is null" );
}else{
	System.out.println(this.toString+" : ofcr_congr_condl_fee is "+ofcr_congr_condl_fee );
}
String ofcr_art_flower = req.getParameter("ofcr_art_flower");
if( ofcr_art_flower == null){
	System.out.println(this.toString+" : ofcr_art_flower is null" );
}else{
	System.out.println(this.toString+" : ofcr_art_flower is "+ofcr_art_flower );
}
String incmg_pers_ipadd = req.getParameter("incmg_pers_ipadd");
if( incmg_pers_ipadd == null){
	System.out.println(this.toString+" : incmg_pers_ipadd is null" );
}else{
	System.out.println(this.toString+" : incmg_pers_ipadd is "+incmg_pers_ipadd );
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

String mode = Util.checkString(req.getParameter("mode"));
String cmpy_cd = Util.checkString(req.getParameter("cmpy_cd"));
String emp_lcls_cd = Util.checkString(req.getParameter("emp_lcls_cd"));
String congr_condl_cd = Util.checkString(req.getParameter("congr_condl_cd"));
String aply_basi_dt = Util.checkString(req.getParameter("aply_basi_dt"));
String congr_condl_fee = Util.checkString(req.getParameter("congr_condl_fee"));
String art_flower = Util.checkString(req.getParameter("art_flower"));
String ofcr_congr_condl_fee = Util.checkString(req.getParameter("ofcr_congr_condl_fee"));
String ofcr_art_flower = Util.checkString(req.getParameter("ofcr_art_flower"));
String incmg_pers_ipadd = Util.checkString(req.getParameter("incmg_pers_ipadd"));
String incmg_pers = Util.checkString(req.getParameter("incmg_pers"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String mode = Util.Uni2Ksc(Util.checkString(req.getParameter("mode")));
String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String emp_lcls_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("emp_lcls_cd")));
String congr_condl_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("congr_condl_cd")));
String aply_basi_dt = Util.Uni2Ksc(Util.checkString(req.getParameter("aply_basi_dt")));
String congr_condl_fee = Util.Uni2Ksc(Util.checkString(req.getParameter("congr_condl_fee")));
String art_flower = Util.Uni2Ksc(Util.checkString(req.getParameter("art_flower")));
String ofcr_congr_condl_fee = Util.Uni2Ksc(Util.checkString(req.getParameter("ofcr_congr_condl_fee")));
String ofcr_art_flower = Util.Uni2Ksc(Util.checkString(req.getParameter("ofcr_art_flower")));
String incmg_pers_ipadd = Util.Uni2Ksc(Util.checkString(req.getParameter("incmg_pers_ipadd")));
String incmg_pers = Util.Uni2Ksc(Util.checkString(req.getParameter("incmg_pers")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setMode(mode);
dm.setCmpy_cd(cmpy_cd);
dm.setEmp_lcls_cd(emp_lcls_cd);
dm.setCongr_condl_cd(congr_condl_cd);
dm.setAply_basi_dt(aply_basi_dt);
dm.setCongr_condl_fee(congr_condl_fee);
dm.setArt_flower(art_flower);
dm.setOfcr_congr_condl_fee(ofcr_congr_condl_fee);
dm.setOfcr_art_flower(ofcr_art_flower);
dm.setIncmg_pers_ipadd(incmg_pers_ipadd);
dm.setIncmg_pers(incmg_pers);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Mon Jul 20 21:20:11 KST 2009 */