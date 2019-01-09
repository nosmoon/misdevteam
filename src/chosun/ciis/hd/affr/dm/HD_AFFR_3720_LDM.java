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


public class HD_AFFR_3720_LDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String cmpy_cd;
	public String search_yyyymm;
	public String emp_no;
	public String cmpy_insr_cd;
	public String aplc_fr_dt;
	public String aplc_to_dt;
	public String pay_fr_dt;
	public String pay_to_dt;
	public String pay_clsf;
	public String lvcmpy_clsf;
	public String acpn_dt;
	public String org_clsf;

	public HD_AFFR_3720_LDM(){}
	public HD_AFFR_3720_LDM(String cmpy_cd, String search_yyyymm, String emp_no, String cmpy_insr_cd, String aplc_fr_dt, String aplc_to_dt, String pay_fr_dt, String pay_to_dt, String pay_clsf, String lvcmpy_clsf, String acpn_dt, String org_clsf){
		this.cmpy_cd = cmpy_cd;
		this.search_yyyymm = search_yyyymm;
		this.emp_no = emp_no;
		this.cmpy_insr_cd = cmpy_insr_cd;
		this.aplc_fr_dt = aplc_fr_dt;
		this.aplc_to_dt = aplc_to_dt;
		this.pay_fr_dt = pay_fr_dt;
		this.pay_to_dt = pay_to_dt;
		this.pay_clsf = pay_clsf;
		this.lvcmpy_clsf = lvcmpy_clsf;
		this.acpn_dt = acpn_dt;
		this.org_clsf = org_clsf;
	}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setSearch_yyyymm(String search_yyyymm){
		this.search_yyyymm = search_yyyymm;
	}

	public void setEmp_no(String emp_no){
		this.emp_no = emp_no;
	}

	public void setCmpy_insr_cd(String cmpy_insr_cd){
		this.cmpy_insr_cd = cmpy_insr_cd;
	}

	public void setAplc_fr_dt(String aplc_fr_dt){
		this.aplc_fr_dt = aplc_fr_dt;
	}

	public void setAplc_to_dt(String aplc_to_dt){
		this.aplc_to_dt = aplc_to_dt;
	}

	public void setPay_fr_dt(String pay_fr_dt){
		this.pay_fr_dt = pay_fr_dt;
	}

	public void setPay_to_dt(String pay_to_dt){
		this.pay_to_dt = pay_to_dt;
	}

	public void setPay_clsf(String pay_clsf){
		this.pay_clsf = pay_clsf;
	}

	public void setLvcmpy_clsf(String lvcmpy_clsf){
		this.lvcmpy_clsf = lvcmpy_clsf;
	}

	public void setAcpn_dt(String acpn_dt){
		this.acpn_dt = acpn_dt;
	}

	public void setOrg_clsf(String org_clsf){
		this.org_clsf = org_clsf;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getSearch_yyyymm(){
		return this.search_yyyymm;
	}

	public String getEmp_no(){
		return this.emp_no;
	}

	public String getCmpy_insr_cd(){
		return this.cmpy_insr_cd;
	}

	public String getAplc_fr_dt(){
		return this.aplc_fr_dt;
	}

	public String getAplc_to_dt(){
		return this.aplc_to_dt;
	}

	public String getPay_fr_dt(){
		return this.pay_fr_dt;
	}

	public String getPay_to_dt(){
		return this.pay_to_dt;
	}

	public String getPay_clsf(){
		return this.pay_clsf;
	}

	public String getLvcmpy_clsf(){
		return this.lvcmpy_clsf;
	}

	public String getAcpn_dt(){
		return this.acpn_dt;
	}

	public String getOrg_clsf(){
		return this.org_clsf;
	}

	public String getSQL(){
		 return "{ call MISHDL.SP_HD_AFFR_3720_L(? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		HD_AFFR_3720_LDM dm = (HD_AFFR_3720_LDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.cmpy_cd);
		cstmt.setString(4, dm.search_yyyymm);
		cstmt.setString(5, dm.emp_no);
		cstmt.setString(6, dm.cmpy_insr_cd);
		cstmt.setString(7, dm.aplc_fr_dt);
		cstmt.setString(8, dm.aplc_to_dt);
		cstmt.setString(9, dm.pay_fr_dt);
		cstmt.setString(10, dm.pay_to_dt);
		cstmt.setString(11, dm.pay_clsf);
		cstmt.setString(12, dm.lvcmpy_clsf);
		cstmt.setString(13, dm.acpn_dt);
		cstmt.setString(14, dm.org_clsf);
		cstmt.registerOutParameter(15, OracleTypes.CURSOR);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.hd.affr.ds.HD_AFFR_3720_LDataSet();
	}



	public void print(){
		System.out.println("SQL = " + this.getSQL());
		System.out.println("cmpy_cd = [" + getCmpy_cd() + "]");
		System.out.println("search_yyyymm = [" + getSearch_yyyymm() + "]");
		System.out.println("emp_no = [" + getEmp_no() + "]");
		System.out.println("cmpy_insr_cd = [" + getCmpy_insr_cd() + "]");
		System.out.println("aplc_fr_dt = [" + getAplc_fr_dt() + "]");
		System.out.println("aplc_to_dt = [" + getAplc_to_dt() + "]");
		System.out.println("pay_fr_dt = [" + getPay_fr_dt() + "]");
		System.out.println("pay_to_dt = [" + getPay_to_dt() + "]");
		System.out.println("pay_clsf = [" + getPay_clsf() + "]");
		System.out.println("lvcmpy_clsf = [" + getLvcmpy_clsf() + "]");
		System.out.println("acpn_dt = [" + getAcpn_dt() + "]");
		System.out.println("org_clsf = [" + getOrg_clsf() + "]");
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
String search_yyyymm = req.getParameter("search_yyyymm");
if( search_yyyymm == null){
	System.out.println(this.toString+" : search_yyyymm is null" );
}else{
	System.out.println(this.toString+" : search_yyyymm is "+search_yyyymm );
}
String emp_no = req.getParameter("emp_no");
if( emp_no == null){
	System.out.println(this.toString+" : emp_no is null" );
}else{
	System.out.println(this.toString+" : emp_no is "+emp_no );
}
String cmpy_insr_cd = req.getParameter("cmpy_insr_cd");
if( cmpy_insr_cd == null){
	System.out.println(this.toString+" : cmpy_insr_cd is null" );
}else{
	System.out.println(this.toString+" : cmpy_insr_cd is "+cmpy_insr_cd );
}
String aplc_fr_dt = req.getParameter("aplc_fr_dt");
if( aplc_fr_dt == null){
	System.out.println(this.toString+" : aplc_fr_dt is null" );
}else{
	System.out.println(this.toString+" : aplc_fr_dt is "+aplc_fr_dt );
}
String aplc_to_dt = req.getParameter("aplc_to_dt");
if( aplc_to_dt == null){
	System.out.println(this.toString+" : aplc_to_dt is null" );
}else{
	System.out.println(this.toString+" : aplc_to_dt is "+aplc_to_dt );
}
String pay_fr_dt = req.getParameter("pay_fr_dt");
if( pay_fr_dt == null){
	System.out.println(this.toString+" : pay_fr_dt is null" );
}else{
	System.out.println(this.toString+" : pay_fr_dt is "+pay_fr_dt );
}
String pay_to_dt = req.getParameter("pay_to_dt");
if( pay_to_dt == null){
	System.out.println(this.toString+" : pay_to_dt is null" );
}else{
	System.out.println(this.toString+" : pay_to_dt is "+pay_to_dt );
}
String pay_clsf = req.getParameter("pay_clsf");
if( pay_clsf == null){
	System.out.println(this.toString+" : pay_clsf is null" );
}else{
	System.out.println(this.toString+" : pay_clsf is "+pay_clsf );
}
String lvcmpy_clsf = req.getParameter("lvcmpy_clsf");
if( lvcmpy_clsf == null){
	System.out.println(this.toString+" : lvcmpy_clsf is null" );
}else{
	System.out.println(this.toString+" : lvcmpy_clsf is "+lvcmpy_clsf );
}
String acpn_dt = req.getParameter("acpn_dt");
if( acpn_dt == null){
	System.out.println(this.toString+" : acpn_dt is null" );
}else{
	System.out.println(this.toString+" : acpn_dt is "+acpn_dt );
}
String org_clsf = req.getParameter("org_clsf");
if( org_clsf == null){
	System.out.println(this.toString+" : org_clsf is null" );
}else{
	System.out.println(this.toString+" : org_clsf is "+org_clsf );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.checkString(req.getParameter("cmpy_cd"));
String search_yyyymm = Util.checkString(req.getParameter("search_yyyymm"));
String emp_no = Util.checkString(req.getParameter("emp_no"));
String cmpy_insr_cd = Util.checkString(req.getParameter("cmpy_insr_cd"));
String aplc_fr_dt = Util.checkString(req.getParameter("aplc_fr_dt"));
String aplc_to_dt = Util.checkString(req.getParameter("aplc_to_dt"));
String pay_fr_dt = Util.checkString(req.getParameter("pay_fr_dt"));
String pay_to_dt = Util.checkString(req.getParameter("pay_to_dt"));
String pay_clsf = Util.checkString(req.getParameter("pay_clsf"));
String lvcmpy_clsf = Util.checkString(req.getParameter("lvcmpy_clsf"));
String acpn_dt = Util.checkString(req.getParameter("acpn_dt"));
String org_clsf = Util.checkString(req.getParameter("org_clsf"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String search_yyyymm = Util.Uni2Ksc(Util.checkString(req.getParameter("search_yyyymm")));
String emp_no = Util.Uni2Ksc(Util.checkString(req.getParameter("emp_no")));
String cmpy_insr_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_insr_cd")));
String aplc_fr_dt = Util.Uni2Ksc(Util.checkString(req.getParameter("aplc_fr_dt")));
String aplc_to_dt = Util.Uni2Ksc(Util.checkString(req.getParameter("aplc_to_dt")));
String pay_fr_dt = Util.Uni2Ksc(Util.checkString(req.getParameter("pay_fr_dt")));
String pay_to_dt = Util.Uni2Ksc(Util.checkString(req.getParameter("pay_to_dt")));
String pay_clsf = Util.Uni2Ksc(Util.checkString(req.getParameter("pay_clsf")));
String lvcmpy_clsf = Util.Uni2Ksc(Util.checkString(req.getParameter("lvcmpy_clsf")));
String acpn_dt = Util.Uni2Ksc(Util.checkString(req.getParameter("acpn_dt")));
String org_clsf = Util.Uni2Ksc(Util.checkString(req.getParameter("org_clsf")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setCmpy_cd(cmpy_cd);
dm.setSearch_yyyymm(search_yyyymm);
dm.setEmp_no(emp_no);
dm.setCmpy_insr_cd(cmpy_insr_cd);
dm.setAplc_fr_dt(aplc_fr_dt);
dm.setAplc_to_dt(aplc_to_dt);
dm.setPay_fr_dt(pay_fr_dt);
dm.setPay_to_dt(pay_to_dt);
dm.setPay_clsf(pay_clsf);
dm.setLvcmpy_clsf(lvcmpy_clsf);
dm.setAcpn_dt(acpn_dt);
dm.setOrg_clsf(org_clsf);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Fri Jul 24 16:51:27 KST 2015 */