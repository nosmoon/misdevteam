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


package chosun.ciis.hd.saly.dm;

import java.sql.*;
import oracle.jdbc.driver.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.hd.saly.ds.*;
import chosun.ciis.hd.saly.rec.*;

/**
 * 
 */


public class HD_SALY_4002_ADM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String mode;
	public String cmpy_cd;
	public String emp_no;
	public String lon_clsf_cd;
	public String lon_dt;
	public String flnm;
	public String repay_months;
	public String lon_prcp;
	public String yy_int_rate;
	public String lon_no;
	public String mm_pymt_dt;
	public String mm_pymt_prcp;
	public String pymt_acml_tms;
	public String rmn_amt;
	public String end_yn;
	public String end_dt;
	public String u_ipadd;
	public String u_id;

	public HD_SALY_4002_ADM(){}
	public HD_SALY_4002_ADM(String mode, String cmpy_cd, String emp_no, String lon_clsf_cd, String lon_dt, String flnm, String repay_months, String lon_prcp, String yy_int_rate, String lon_no, String mm_pymt_dt, String mm_pymt_prcp, String pymt_acml_tms, String rmn_amt, String end_yn, String end_dt, String u_ipadd, String u_id){
		this.mode = mode;
		this.cmpy_cd = cmpy_cd;
		this.emp_no = emp_no;
		this.lon_clsf_cd = lon_clsf_cd;
		this.lon_dt = lon_dt;
		this.flnm = flnm;
		this.repay_months = repay_months;
		this.lon_prcp = lon_prcp;
		this.yy_int_rate = yy_int_rate;
		this.lon_no = lon_no;
		this.mm_pymt_dt = mm_pymt_dt;
		this.mm_pymt_prcp = mm_pymt_prcp;
		this.pymt_acml_tms = pymt_acml_tms;
		this.rmn_amt = rmn_amt;
		this.end_yn = end_yn;
		this.end_dt = end_dt;
		this.u_ipadd = u_ipadd;
		this.u_id = u_id;
	}

	public void setMode(String mode){
		this.mode = mode;
	}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setEmp_no(String emp_no){
		this.emp_no = emp_no;
	}

	public void setLon_clsf_cd(String lon_clsf_cd){
		this.lon_clsf_cd = lon_clsf_cd;
	}

	public void setLon_dt(String lon_dt){
		this.lon_dt = lon_dt;
	}

	public void setFlnm(String flnm){
		this.flnm = flnm;
	}

	public void setRepay_months(String repay_months){
		this.repay_months = repay_months;
	}

	public void setLon_prcp(String lon_prcp){
		this.lon_prcp = lon_prcp;
	}

	public void setYy_int_rate(String yy_int_rate){
		this.yy_int_rate = yy_int_rate;
	}

	public void setLon_no(String lon_no){
		this.lon_no = lon_no;
	}

	public void setMm_pymt_dt(String mm_pymt_dt){
		this.mm_pymt_dt = mm_pymt_dt;
	}

	public void setMm_pymt_prcp(String mm_pymt_prcp){
		this.mm_pymt_prcp = mm_pymt_prcp;
	}

	public void setPymt_acml_tms(String pymt_acml_tms){
		this.pymt_acml_tms = pymt_acml_tms;
	}

	public void setRmn_amt(String rmn_amt){
		this.rmn_amt = rmn_amt;
	}

	public void setEnd_yn(String end_yn){
		this.end_yn = end_yn;
	}

	public void setEnd_dt(String end_dt){
		this.end_dt = end_dt;
	}

	public void setU_ipadd(String u_ipadd){
		this.u_ipadd = u_ipadd;
	}

	public void setU_id(String u_id){
		this.u_id = u_id;
	}

	public String getMode(){
		return this.mode;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getEmp_no(){
		return this.emp_no;
	}

	public String getLon_clsf_cd(){
		return this.lon_clsf_cd;
	}

	public String getLon_dt(){
		return this.lon_dt;
	}

	public String getFlnm(){
		return this.flnm;
	}

	public String getRepay_months(){
		return this.repay_months;
	}

	public String getLon_prcp(){
		return this.lon_prcp;
	}

	public String getYy_int_rate(){
		return this.yy_int_rate;
	}

	public String getLon_no(){
		return this.lon_no;
	}

	public String getMm_pymt_dt(){
		return this.mm_pymt_dt;
	}

	public String getMm_pymt_prcp(){
		return this.mm_pymt_prcp;
	}

	public String getPymt_acml_tms(){
		return this.pymt_acml_tms;
	}

	public String getRmn_amt(){
		return this.rmn_amt;
	}

	public String getEnd_yn(){
		return this.end_yn;
	}

	public String getEnd_dt(){
		return this.end_dt;
	}

	public String getU_ipadd(){
		return this.u_ipadd;
	}

	public String getU_id(){
		return this.u_id;
	}

	public String getSQL(){
		 return "{ call MISHDL.SP_HD_SALY_4002_A(? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		HD_SALY_4002_ADM dm = (HD_SALY_4002_ADM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.mode);
		cstmt.setString(4, dm.cmpy_cd);
		cstmt.setString(5, dm.emp_no);
		cstmt.setString(6, dm.lon_clsf_cd);
		cstmt.setString(7, dm.lon_dt);
		cstmt.setString(8, dm.flnm);
		cstmt.setString(9, dm.repay_months);
		cstmt.setString(10, dm.lon_prcp);
		cstmt.setString(11, dm.yy_int_rate);
		cstmt.setString(12, dm.lon_no);
		cstmt.setString(13, dm.mm_pymt_dt);
		cstmt.setString(14, dm.mm_pymt_prcp);
		cstmt.setString(15, dm.pymt_acml_tms);
		cstmt.setString(16, dm.rmn_amt);
		cstmt.setString(17, dm.end_yn);
		cstmt.setString(18, dm.end_dt);
		cstmt.setString(19, dm.u_ipadd);
		cstmt.setString(20, dm.u_id);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.hd.saly.ds.HD_SALY_4002_ADataSet();
	}



	public void print(){
		System.out.println("SQL = " + this.getSQL());
		System.out.println("mode = [" + getMode() + "]");
		System.out.println("cmpy_cd = [" + getCmpy_cd() + "]");
		System.out.println("emp_no = [" + getEmp_no() + "]");
		System.out.println("lon_clsf_cd = [" + getLon_clsf_cd() + "]");
		System.out.println("lon_dt = [" + getLon_dt() + "]");
		System.out.println("flnm = [" + getFlnm() + "]");
		System.out.println("repay_months = [" + getRepay_months() + "]");
		System.out.println("lon_prcp = [" + getLon_prcp() + "]");
		System.out.println("yy_int_rate = [" + getYy_int_rate() + "]");
		System.out.println("lon_no = [" + getLon_no() + "]");
		System.out.println("mm_pymt_dt = [" + getMm_pymt_dt() + "]");
		System.out.println("mm_pymt_prcp = [" + getMm_pymt_prcp() + "]");
		System.out.println("pymt_acml_tms = [" + getPymt_acml_tms() + "]");
		System.out.println("rmn_amt = [" + getRmn_amt() + "]");
		System.out.println("end_yn = [" + getEnd_yn() + "]");
		System.out.println("end_dt = [" + getEnd_dt() + "]");
		System.out.println("u_ipadd = [" + getU_ipadd() + "]");
		System.out.println("u_id = [" + getU_id() + "]");
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
String emp_no = req.getParameter("emp_no");
if( emp_no == null){
	System.out.println(this.toString+" : emp_no is null" );
}else{
	System.out.println(this.toString+" : emp_no is "+emp_no );
}
String lon_clsf_cd = req.getParameter("lon_clsf_cd");
if( lon_clsf_cd == null){
	System.out.println(this.toString+" : lon_clsf_cd is null" );
}else{
	System.out.println(this.toString+" : lon_clsf_cd is "+lon_clsf_cd );
}
String lon_dt = req.getParameter("lon_dt");
if( lon_dt == null){
	System.out.println(this.toString+" : lon_dt is null" );
}else{
	System.out.println(this.toString+" : lon_dt is "+lon_dt );
}
String flnm = req.getParameter("flnm");
if( flnm == null){
	System.out.println(this.toString+" : flnm is null" );
}else{
	System.out.println(this.toString+" : flnm is "+flnm );
}
String repay_months = req.getParameter("repay_months");
if( repay_months == null){
	System.out.println(this.toString+" : repay_months is null" );
}else{
	System.out.println(this.toString+" : repay_months is "+repay_months );
}
String lon_prcp = req.getParameter("lon_prcp");
if( lon_prcp == null){
	System.out.println(this.toString+" : lon_prcp is null" );
}else{
	System.out.println(this.toString+" : lon_prcp is "+lon_prcp );
}
String yy_int_rate = req.getParameter("yy_int_rate");
if( yy_int_rate == null){
	System.out.println(this.toString+" : yy_int_rate is null" );
}else{
	System.out.println(this.toString+" : yy_int_rate is "+yy_int_rate );
}
String lon_no = req.getParameter("lon_no");
if( lon_no == null){
	System.out.println(this.toString+" : lon_no is null" );
}else{
	System.out.println(this.toString+" : lon_no is "+lon_no );
}
String mm_pymt_dt = req.getParameter("mm_pymt_dt");
if( mm_pymt_dt == null){
	System.out.println(this.toString+" : mm_pymt_dt is null" );
}else{
	System.out.println(this.toString+" : mm_pymt_dt is "+mm_pymt_dt );
}
String mm_pymt_prcp = req.getParameter("mm_pymt_prcp");
if( mm_pymt_prcp == null){
	System.out.println(this.toString+" : mm_pymt_prcp is null" );
}else{
	System.out.println(this.toString+" : mm_pymt_prcp is "+mm_pymt_prcp );
}
String pymt_acml_tms = req.getParameter("pymt_acml_tms");
if( pymt_acml_tms == null){
	System.out.println(this.toString+" : pymt_acml_tms is null" );
}else{
	System.out.println(this.toString+" : pymt_acml_tms is "+pymt_acml_tms );
}
String rmn_amt = req.getParameter("rmn_amt");
if( rmn_amt == null){
	System.out.println(this.toString+" : rmn_amt is null" );
}else{
	System.out.println(this.toString+" : rmn_amt is "+rmn_amt );
}
String end_yn = req.getParameter("end_yn");
if( end_yn == null){
	System.out.println(this.toString+" : end_yn is null" );
}else{
	System.out.println(this.toString+" : end_yn is "+end_yn );
}
String end_dt = req.getParameter("end_dt");
if( end_dt == null){
	System.out.println(this.toString+" : end_dt is null" );
}else{
	System.out.println(this.toString+" : end_dt is "+end_dt );
}
String u_ipadd = req.getParameter("u_ipadd");
if( u_ipadd == null){
	System.out.println(this.toString+" : u_ipadd is null" );
}else{
	System.out.println(this.toString+" : u_ipadd is "+u_ipadd );
}
String u_id = req.getParameter("u_id");
if( u_id == null){
	System.out.println(this.toString+" : u_id is null" );
}else{
	System.out.println(this.toString+" : u_id is "+u_id );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리시 사용하십시오.

String mode = Util.checkString(req.getParameter("mode"));
String cmpy_cd = Util.checkString(req.getParameter("cmpy_cd"));
String emp_no = Util.checkString(req.getParameter("emp_no"));
String lon_clsf_cd = Util.checkString(req.getParameter("lon_clsf_cd"));
String lon_dt = Util.checkString(req.getParameter("lon_dt"));
String flnm = Util.checkString(req.getParameter("flnm"));
String repay_months = Util.checkString(req.getParameter("repay_months"));
String lon_prcp = Util.checkString(req.getParameter("lon_prcp"));
String yy_int_rate = Util.checkString(req.getParameter("yy_int_rate"));
String lon_no = Util.checkString(req.getParameter("lon_no"));
String mm_pymt_dt = Util.checkString(req.getParameter("mm_pymt_dt"));
String mm_pymt_prcp = Util.checkString(req.getParameter("mm_pymt_prcp"));
String pymt_acml_tms = Util.checkString(req.getParameter("pymt_acml_tms"));
String rmn_amt = Util.checkString(req.getParameter("rmn_amt"));
String end_yn = Util.checkString(req.getParameter("end_yn"));
String end_dt = Util.checkString(req.getParameter("end_dt"));
String u_ipadd = Util.checkString(req.getParameter("u_ipadd"));
String u_id = Util.checkString(req.getParameter("u_id"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String mode = Util.Uni2Ksc(Util.checkString(req.getParameter("mode")));
String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String emp_no = Util.Uni2Ksc(Util.checkString(req.getParameter("emp_no")));
String lon_clsf_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("lon_clsf_cd")));
String lon_dt = Util.Uni2Ksc(Util.checkString(req.getParameter("lon_dt")));
String flnm = Util.Uni2Ksc(Util.checkString(req.getParameter("flnm")));
String repay_months = Util.Uni2Ksc(Util.checkString(req.getParameter("repay_months")));
String lon_prcp = Util.Uni2Ksc(Util.checkString(req.getParameter("lon_prcp")));
String yy_int_rate = Util.Uni2Ksc(Util.checkString(req.getParameter("yy_int_rate")));
String lon_no = Util.Uni2Ksc(Util.checkString(req.getParameter("lon_no")));
String mm_pymt_dt = Util.Uni2Ksc(Util.checkString(req.getParameter("mm_pymt_dt")));
String mm_pymt_prcp = Util.Uni2Ksc(Util.checkString(req.getParameter("mm_pymt_prcp")));
String pymt_acml_tms = Util.Uni2Ksc(Util.checkString(req.getParameter("pymt_acml_tms")));
String rmn_amt = Util.Uni2Ksc(Util.checkString(req.getParameter("rmn_amt")));
String end_yn = Util.Uni2Ksc(Util.checkString(req.getParameter("end_yn")));
String end_dt = Util.Uni2Ksc(Util.checkString(req.getParameter("end_dt")));
String u_ipadd = Util.Uni2Ksc(Util.checkString(req.getParameter("u_ipadd")));
String u_id = Util.Uni2Ksc(Util.checkString(req.getParameter("u_id")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setMode(mode);
dm.setCmpy_cd(cmpy_cd);
dm.setEmp_no(emp_no);
dm.setLon_clsf_cd(lon_clsf_cd);
dm.setLon_dt(lon_dt);
dm.setFlnm(flnm);
dm.setRepay_months(repay_months);
dm.setLon_prcp(lon_prcp);
dm.setYy_int_rate(yy_int_rate);
dm.setLon_no(lon_no);
dm.setMm_pymt_dt(mm_pymt_dt);
dm.setMm_pymt_prcp(mm_pymt_prcp);
dm.setPymt_acml_tms(pymt_acml_tms);
dm.setRmn_amt(rmn_amt);
dm.setEnd_yn(end_yn);
dm.setEnd_dt(end_dt);
dm.setU_ipadd(u_ipadd);
dm.setU_id(u_id);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Wed May 13 20:25:13 KST 2009 */