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


package chosun.ciis.pr.papmake.dm;

import java.sql.*;
import oracle.jdbc.driver.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.pr.papmake.ds.*;
import chosun.ciis.pr.papmake.rec.*;

/**
 * 
 */


public class PR_PAPMAKE_6040_ADM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String mode;
	public String cmpy_cd;
	public String dept_cd;
	public String slip_proc_dt;
	public String slip_proc_seq;
	public String total;
	public String vat_total;
	public String gubun;
	public String sub_rumn;
	public String prt;
	public String prt_total;
	public String make;
	public String make_total;
	public String pre_code;
	public String delco_no;
	public String yymm;
	public String fac_clsf;
	public String incmg_pers_ipadd;
	public String emp_no;
	public String incmg_pers;

	public PR_PAPMAKE_6040_ADM(){}
	public PR_PAPMAKE_6040_ADM(String mode, String cmpy_cd, String dept_cd, String slip_proc_dt, String slip_proc_seq, String total, String vat_total, String gubun, String sub_rumn, String prt, String prt_total, String make, String make_total, String pre_code, String delco_no, String yymm, String fac_clsf, String incmg_pers_ipadd, String emp_no, String incmg_pers){
		this.mode = mode;
		this.cmpy_cd = cmpy_cd;
		this.dept_cd = dept_cd;
		this.slip_proc_dt = slip_proc_dt;
		this.slip_proc_seq = slip_proc_seq;
		this.total = total;
		this.vat_total = vat_total;
		this.gubun = gubun;
		this.sub_rumn = sub_rumn;
		this.prt = prt;
		this.prt_total = prt_total;
		this.make = make;
		this.make_total = make_total;
		this.pre_code = pre_code;
		this.delco_no = delco_no;
		this.yymm = yymm;
		this.fac_clsf = fac_clsf;
		this.incmg_pers_ipadd = incmg_pers_ipadd;
		this.emp_no = emp_no;
		this.incmg_pers = incmg_pers;
	}

	public void setMode(String mode){
		this.mode = mode;
	}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setDept_cd(String dept_cd){
		this.dept_cd = dept_cd;
	}

	public void setSlip_proc_dt(String slip_proc_dt){
		this.slip_proc_dt = slip_proc_dt;
	}

	public void setSlip_proc_seq(String slip_proc_seq){
		this.slip_proc_seq = slip_proc_seq;
	}

	public void setTotal(String total){
		this.total = total;
	}

	public void setVat_total(String vat_total){
		this.vat_total = vat_total;
	}

	public void setGubun(String gubun){
		this.gubun = gubun;
	}

	public void setSub_rumn(String sub_rumn){
		this.sub_rumn = sub_rumn;
	}

	public void setPrt(String prt){
		this.prt = prt;
	}

	public void setPrt_total(String prt_total){
		this.prt_total = prt_total;
	}

	public void setMake(String make){
		this.make = make;
	}

	public void setMake_total(String make_total){
		this.make_total = make_total;
	}

	public void setPre_code(String pre_code){
		this.pre_code = pre_code;
	}

	public void setDelco_no(String delco_no){
		this.delco_no = delco_no;
	}

	public void setYymm(String yymm){
		this.yymm = yymm;
	}

	public void setFac_clsf(String fac_clsf){
		this.fac_clsf = fac_clsf;
	}

	public void setIncmg_pers_ipadd(String incmg_pers_ipadd){
		this.incmg_pers_ipadd = incmg_pers_ipadd;
	}

	public void setEmp_no(String emp_no){
		this.emp_no = emp_no;
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

	public String getDept_cd(){
		return this.dept_cd;
	}

	public String getSlip_proc_dt(){
		return this.slip_proc_dt;
	}

	public String getSlip_proc_seq(){
		return this.slip_proc_seq;
	}

	public String getTotal(){
		return this.total;
	}

	public String getVat_total(){
		return this.vat_total;
	}

	public String getGubun(){
		return this.gubun;
	}

	public String getSub_rumn(){
		return this.sub_rumn;
	}

	public String getPrt(){
		return this.prt;
	}

	public String getPrt_total(){
		return this.prt_total;
	}

	public String getMake(){
		return this.make;
	}

	public String getMake_total(){
		return this.make_total;
	}

	public String getPre_code(){
		return this.pre_code;
	}

	public String getDelco_no(){
		return this.delco_no;
	}

	public String getYymm(){
		return this.yymm;
	}

	public String getFac_clsf(){
		return this.fac_clsf;
	}

	public String getIncmg_pers_ipadd(){
		return this.incmg_pers_ipadd;
	}

	public String getEmp_no(){
		return this.emp_no;
	}

	public String getIncmg_pers(){
		return this.incmg_pers;
	}

	public String getSQL(){
		 return "{ call MISMAT.SP_PR_PAPMAKE_6040_A(? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		PR_PAPMAKE_6040_ADM dm = (PR_PAPMAKE_6040_ADM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.mode);
		cstmt.setString(4, dm.cmpy_cd);
		cstmt.setString(5, dm.dept_cd);
		cstmt.setString(6, dm.slip_proc_dt);
		cstmt.setString(7, dm.slip_proc_seq);
		cstmt.setString(8, dm.total);
		cstmt.setString(9, dm.vat_total);
		cstmt.setString(10, dm.gubun);
		cstmt.setString(11, dm.sub_rumn);
		cstmt.setString(12, dm.prt);
		cstmt.setString(13, dm.prt_total);
		cstmt.setString(14, dm.make);
		cstmt.setString(15, dm.make_total);
		cstmt.setString(16, dm.pre_code);
		cstmt.setString(17, dm.delco_no);
		cstmt.setString(18, dm.yymm);
		cstmt.setString(19, dm.fac_clsf);
		cstmt.setString(20, dm.incmg_pers_ipadd);
		cstmt.setString(21, dm.emp_no);
		cstmt.setString(22, dm.incmg_pers);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.pr.papmake.ds.PR_PAPMAKE_6040_ADataSet();
	}



	public void print(){
		System.out.println("SQL = " + this.getSQL());
		System.out.println("mode = [" + getMode() + "]");
		System.out.println("cmpy_cd = [" + getCmpy_cd() + "]");
		System.out.println("dept_cd = [" + getDept_cd() + "]");
		System.out.println("slip_proc_dt = [" + getSlip_proc_dt() + "]");
		System.out.println("slip_proc_seq = [" + getSlip_proc_seq() + "]");
		System.out.println("total = [" + getTotal() + "]");
		System.out.println("vat_total = [" + getVat_total() + "]");
		System.out.println("gubun = [" + getGubun() + "]");
		System.out.println("sub_rumn = [" + getSub_rumn() + "]");
		System.out.println("prt = [" + getPrt() + "]");
		System.out.println("prt_total = [" + getPrt_total() + "]");
		System.out.println("make = [" + getMake() + "]");
		System.out.println("make_total = [" + getMake_total() + "]");
		System.out.println("pre_code = [" + getPre_code() + "]");
		System.out.println("delco_no = [" + getDelco_no() + "]");
		System.out.println("yymm = [" + getYymm() + "]");
		System.out.println("fac_clsf = [" + getFac_clsf() + "]");
		System.out.println("incmg_pers_ipadd = [" + getIncmg_pers_ipadd() + "]");
		System.out.println("emp_no = [" + getEmp_no() + "]");
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
String dept_cd = req.getParameter("dept_cd");
if( dept_cd == null){
	System.out.println(this.toString+" : dept_cd is null" );
}else{
	System.out.println(this.toString+" : dept_cd is "+dept_cd );
}
String slip_proc_dt = req.getParameter("slip_proc_dt");
if( slip_proc_dt == null){
	System.out.println(this.toString+" : slip_proc_dt is null" );
}else{
	System.out.println(this.toString+" : slip_proc_dt is "+slip_proc_dt );
}
String slip_proc_seq = req.getParameter("slip_proc_seq");
if( slip_proc_seq == null){
	System.out.println(this.toString+" : slip_proc_seq is null" );
}else{
	System.out.println(this.toString+" : slip_proc_seq is "+slip_proc_seq );
}
String total = req.getParameter("total");
if( total == null){
	System.out.println(this.toString+" : total is null" );
}else{
	System.out.println(this.toString+" : total is "+total );
}
String vat_total = req.getParameter("vat_total");
if( vat_total == null){
	System.out.println(this.toString+" : vat_total is null" );
}else{
	System.out.println(this.toString+" : vat_total is "+vat_total );
}
String gubun = req.getParameter("gubun");
if( gubun == null){
	System.out.println(this.toString+" : gubun is null" );
}else{
	System.out.println(this.toString+" : gubun is "+gubun );
}
String sub_rumn = req.getParameter("sub_rumn");
if( sub_rumn == null){
	System.out.println(this.toString+" : sub_rumn is null" );
}else{
	System.out.println(this.toString+" : sub_rumn is "+sub_rumn );
}
String prt = req.getParameter("prt");
if( prt == null){
	System.out.println(this.toString+" : prt is null" );
}else{
	System.out.println(this.toString+" : prt is "+prt );
}
String prt_total = req.getParameter("prt_total");
if( prt_total == null){
	System.out.println(this.toString+" : prt_total is null" );
}else{
	System.out.println(this.toString+" : prt_total is "+prt_total );
}
String make = req.getParameter("make");
if( make == null){
	System.out.println(this.toString+" : make is null" );
}else{
	System.out.println(this.toString+" : make is "+make );
}
String make_total = req.getParameter("make_total");
if( make_total == null){
	System.out.println(this.toString+" : make_total is null" );
}else{
	System.out.println(this.toString+" : make_total is "+make_total );
}
String pre_code = req.getParameter("pre_code");
if( pre_code == null){
	System.out.println(this.toString+" : pre_code is null" );
}else{
	System.out.println(this.toString+" : pre_code is "+pre_code );
}
String delco_no = req.getParameter("delco_no");
if( delco_no == null){
	System.out.println(this.toString+" : delco_no is null" );
}else{
	System.out.println(this.toString+" : delco_no is "+delco_no );
}
String yymm = req.getParameter("yymm");
if( yymm == null){
	System.out.println(this.toString+" : yymm is null" );
}else{
	System.out.println(this.toString+" : yymm is "+yymm );
}
String fac_clsf = req.getParameter("fac_clsf");
if( fac_clsf == null){
	System.out.println(this.toString+" : fac_clsf is null" );
}else{
	System.out.println(this.toString+" : fac_clsf is "+fac_clsf );
}
String incmg_pers_ipadd = req.getParameter("incmg_pers_ipadd");
if( incmg_pers_ipadd == null){
	System.out.println(this.toString+" : incmg_pers_ipadd is null" );
}else{
	System.out.println(this.toString+" : incmg_pers_ipadd is "+incmg_pers_ipadd );
}
String emp_no = req.getParameter("emp_no");
if( emp_no == null){
	System.out.println(this.toString+" : emp_no is null" );
}else{
	System.out.println(this.toString+" : emp_no is "+emp_no );
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
String dept_cd = Util.checkString(req.getParameter("dept_cd"));
String slip_proc_dt = Util.checkString(req.getParameter("slip_proc_dt"));
String slip_proc_seq = Util.checkString(req.getParameter("slip_proc_seq"));
String total = Util.checkString(req.getParameter("total"));
String vat_total = Util.checkString(req.getParameter("vat_total"));
String gubun = Util.checkString(req.getParameter("gubun"));
String sub_rumn = Util.checkString(req.getParameter("sub_rumn"));
String prt = Util.checkString(req.getParameter("prt"));
String prt_total = Util.checkString(req.getParameter("prt_total"));
String make = Util.checkString(req.getParameter("make"));
String make_total = Util.checkString(req.getParameter("make_total"));
String pre_code = Util.checkString(req.getParameter("pre_code"));
String delco_no = Util.checkString(req.getParameter("delco_no"));
String yymm = Util.checkString(req.getParameter("yymm"));
String fac_clsf = Util.checkString(req.getParameter("fac_clsf"));
String incmg_pers_ipadd = Util.checkString(req.getParameter("incmg_pers_ipadd"));
String emp_no = Util.checkString(req.getParameter("emp_no"));
String incmg_pers = Util.checkString(req.getParameter("incmg_pers"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String mode = Util.Uni2Ksc(Util.checkString(req.getParameter("mode")));
String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String dept_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("dept_cd")));
String slip_proc_dt = Util.Uni2Ksc(Util.checkString(req.getParameter("slip_proc_dt")));
String slip_proc_seq = Util.Uni2Ksc(Util.checkString(req.getParameter("slip_proc_seq")));
String total = Util.Uni2Ksc(Util.checkString(req.getParameter("total")));
String vat_total = Util.Uni2Ksc(Util.checkString(req.getParameter("vat_total")));
String gubun = Util.Uni2Ksc(Util.checkString(req.getParameter("gubun")));
String sub_rumn = Util.Uni2Ksc(Util.checkString(req.getParameter("sub_rumn")));
String prt = Util.Uni2Ksc(Util.checkString(req.getParameter("prt")));
String prt_total = Util.Uni2Ksc(Util.checkString(req.getParameter("prt_total")));
String make = Util.Uni2Ksc(Util.checkString(req.getParameter("make")));
String make_total = Util.Uni2Ksc(Util.checkString(req.getParameter("make_total")));
String pre_code = Util.Uni2Ksc(Util.checkString(req.getParameter("pre_code")));
String delco_no = Util.Uni2Ksc(Util.checkString(req.getParameter("delco_no")));
String yymm = Util.Uni2Ksc(Util.checkString(req.getParameter("yymm")));
String fac_clsf = Util.Uni2Ksc(Util.checkString(req.getParameter("fac_clsf")));
String incmg_pers_ipadd = Util.Uni2Ksc(Util.checkString(req.getParameter("incmg_pers_ipadd")));
String emp_no = Util.Uni2Ksc(Util.checkString(req.getParameter("emp_no")));
String incmg_pers = Util.Uni2Ksc(Util.checkString(req.getParameter("incmg_pers")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setMode(mode);
dm.setCmpy_cd(cmpy_cd);
dm.setDept_cd(dept_cd);
dm.setSlip_proc_dt(slip_proc_dt);
dm.setSlip_proc_seq(slip_proc_seq);
dm.setTotal(total);
dm.setVat_total(vat_total);
dm.setGubun(gubun);
dm.setSub_rumn(sub_rumn);
dm.setPrt(prt);
dm.setPrt_total(prt_total);
dm.setMake(make);
dm.setMake_total(make_total);
dm.setPre_code(pre_code);
dm.setDelco_no(delco_no);
dm.setYymm(yymm);
dm.setFac_clsf(fac_clsf);
dm.setIncmg_pers_ipadd(incmg_pers_ipadd);
dm.setEmp_no(emp_no);
dm.setIncmg_pers(incmg_pers);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Sun May 31 18:54:31 KST 2009 */