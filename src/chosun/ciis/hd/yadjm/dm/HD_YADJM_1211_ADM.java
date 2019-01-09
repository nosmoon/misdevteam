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


package chosun.ciis.hd.yadjm.dm;

import java.sql.*;
import oracle.jdbc.driver.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.hd.yadjm.ds.*;
import chosun.ciis.hd.yadjm.rec.*;

/**
 * 
 */


public class HD_YADJM_1211_ADM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String mode;
	public String cmpy_nm;
	public String ern;
	public String in_cmpy_dt;
	public String lvcmpy_dt;
	public String impt_saly;
	public String non_tax_prod;
	public String non_tax_frnc;
	public String deci_incm_tax;
	public String deci_res_tax;
	public String impt_bns;
	public String bns_incm_tax_tot_amt;
	public String bns_res_tax_tot_amt;
	public String bns_deci_farm_spc_tax;
	public String aprv_bns_tot_amt;
	public String stok_num_shet_prft_amt;
	public String np_pymt_amt;
	public String hosp_insr_fee;
	public String emp_insr_fee;
	public String etc_insr_fee;
	public String cmpy_cd;
	public String connect_ip;
	public String connect_userid;
	public String input_not;
	public String emp_no;
	public String flnm;
	public String adjm_rvrs_yy;
	public String seq;

	public HD_YADJM_1211_ADM(){}
	public HD_YADJM_1211_ADM(String mode, String cmpy_nm, String ern, String in_cmpy_dt, String lvcmpy_dt, String impt_saly, String non_tax_prod, String non_tax_frnc, String deci_incm_tax, String deci_res_tax, String impt_bns, String bns_incm_tax_tot_amt, String bns_res_tax_tot_amt, String bns_deci_farm_spc_tax, String aprv_bns_tot_amt, String stok_num_shet_prft_amt, String np_pymt_amt, String hosp_insr_fee, String emp_insr_fee, String etc_insr_fee, String cmpy_cd, String connect_ip, String connect_userid, String input_not, String emp_no, String flnm, String adjm_rvrs_yy, String seq){
		this.mode = mode;
		this.cmpy_nm = cmpy_nm;
		this.ern = ern;
		this.in_cmpy_dt = in_cmpy_dt;
		this.lvcmpy_dt = lvcmpy_dt;
		this.impt_saly = impt_saly;
		this.non_tax_prod = non_tax_prod;
		this.non_tax_frnc = non_tax_frnc;
		this.deci_incm_tax = deci_incm_tax;
		this.deci_res_tax = deci_res_tax;
		this.impt_bns = impt_bns;
		this.bns_incm_tax_tot_amt = bns_incm_tax_tot_amt;
		this.bns_res_tax_tot_amt = bns_res_tax_tot_amt;
		this.bns_deci_farm_spc_tax = bns_deci_farm_spc_tax;
		this.aprv_bns_tot_amt = aprv_bns_tot_amt;
		this.stok_num_shet_prft_amt = stok_num_shet_prft_amt;
		this.np_pymt_amt = np_pymt_amt;
		this.hosp_insr_fee = hosp_insr_fee;
		this.emp_insr_fee = emp_insr_fee;
		this.etc_insr_fee = etc_insr_fee;
		this.cmpy_cd = cmpy_cd;
		this.connect_ip = connect_ip;
		this.connect_userid = connect_userid;
		this.input_not = input_not;
		this.emp_no = emp_no;
		this.flnm = flnm;
		this.adjm_rvrs_yy = adjm_rvrs_yy;
		this.seq = seq;
	}

	public void setMode(String mode){
		this.mode = mode;
	}

	public void setCmpy_nm(String cmpy_nm){
		this.cmpy_nm = cmpy_nm;
	}

	public void setErn(String ern){
		this.ern = ern;
	}

	public void setIn_cmpy_dt(String in_cmpy_dt){
		this.in_cmpy_dt = in_cmpy_dt;
	}

	public void setLvcmpy_dt(String lvcmpy_dt){
		this.lvcmpy_dt = lvcmpy_dt;
	}

	public void setImpt_saly(String impt_saly){
		this.impt_saly = impt_saly;
	}

	public void setNon_tax_prod(String non_tax_prod){
		this.non_tax_prod = non_tax_prod;
	}

	public void setNon_tax_frnc(String non_tax_frnc){
		this.non_tax_frnc = non_tax_frnc;
	}

	public void setDeci_incm_tax(String deci_incm_tax){
		this.deci_incm_tax = deci_incm_tax;
	}

	public void setDeci_res_tax(String deci_res_tax){
		this.deci_res_tax = deci_res_tax;
	}

	public void setImpt_bns(String impt_bns){
		this.impt_bns = impt_bns;
	}

	public void setBns_incm_tax_tot_amt(String bns_incm_tax_tot_amt){
		this.bns_incm_tax_tot_amt = bns_incm_tax_tot_amt;
	}

	public void setBns_res_tax_tot_amt(String bns_res_tax_tot_amt){
		this.bns_res_tax_tot_amt = bns_res_tax_tot_amt;
	}

	public void setBns_deci_farm_spc_tax(String bns_deci_farm_spc_tax){
		this.bns_deci_farm_spc_tax = bns_deci_farm_spc_tax;
	}

	public void setAprv_bns_tot_amt(String aprv_bns_tot_amt){
		this.aprv_bns_tot_amt = aprv_bns_tot_amt;
	}

	public void setStok_num_shet_prft_amt(String stok_num_shet_prft_amt){
		this.stok_num_shet_prft_amt = stok_num_shet_prft_amt;
	}

	public void setNp_pymt_amt(String np_pymt_amt){
		this.np_pymt_amt = np_pymt_amt;
	}

	public void setHosp_insr_fee(String hosp_insr_fee){
		this.hosp_insr_fee = hosp_insr_fee;
	}

	public void setEmp_insr_fee(String emp_insr_fee){
		this.emp_insr_fee = emp_insr_fee;
	}

	public void setEtc_insr_fee(String etc_insr_fee){
		this.etc_insr_fee = etc_insr_fee;
	}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setConnect_ip(String connect_ip){
		this.connect_ip = connect_ip;
	}

	public void setConnect_userid(String connect_userid){
		this.connect_userid = connect_userid;
	}

	public void setInput_not(String input_not){
		this.input_not = input_not;
	}

	public void setEmp_no(String emp_no){
		this.emp_no = emp_no;
	}

	public void setFlnm(String flnm){
		this.flnm = flnm;
	}

	public void setAdjm_rvrs_yy(String adjm_rvrs_yy){
		this.adjm_rvrs_yy = adjm_rvrs_yy;
	}

	public void setSeq(String seq){
		this.seq = seq;
	}

	public String getMode(){
		return this.mode;
	}

	public String getCmpy_nm(){
		return this.cmpy_nm;
	}

	public String getErn(){
		return this.ern;
	}

	public String getIn_cmpy_dt(){
		return this.in_cmpy_dt;
	}

	public String getLvcmpy_dt(){
		return this.lvcmpy_dt;
	}

	public String getImpt_saly(){
		return this.impt_saly;
	}

	public String getNon_tax_prod(){
		return this.non_tax_prod;
	}

	public String getNon_tax_frnc(){
		return this.non_tax_frnc;
	}

	public String getDeci_incm_tax(){
		return this.deci_incm_tax;
	}

	public String getDeci_res_tax(){
		return this.deci_res_tax;
	}

	public String getImpt_bns(){
		return this.impt_bns;
	}

	public String getBns_incm_tax_tot_amt(){
		return this.bns_incm_tax_tot_amt;
	}

	public String getBns_res_tax_tot_amt(){
		return this.bns_res_tax_tot_amt;
	}

	public String getBns_deci_farm_spc_tax(){
		return this.bns_deci_farm_spc_tax;
	}

	public String getAprv_bns_tot_amt(){
		return this.aprv_bns_tot_amt;
	}

	public String getStok_num_shet_prft_amt(){
		return this.stok_num_shet_prft_amt;
	}

	public String getNp_pymt_amt(){
		return this.np_pymt_amt;
	}

	public String getHosp_insr_fee(){
		return this.hosp_insr_fee;
	}

	public String getEmp_insr_fee(){
		return this.emp_insr_fee;
	}

	public String getEtc_insr_fee(){
		return this.etc_insr_fee;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getConnect_ip(){
		return this.connect_ip;
	}

	public String getConnect_userid(){
		return this.connect_userid;
	}

	public String getInput_not(){
		return this.input_not;
	}

	public String getEmp_no(){
		return this.emp_no;
	}

	public String getFlnm(){
		return this.flnm;
	}

	public String getAdjm_rvrs_yy(){
		return this.adjm_rvrs_yy;
	}

	public String getSeq(){
		return this.seq;
	}

	public String getSQL(){
		 return "{ call MISHDL.SP_HD_YADJM_1211_A(? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		HD_YADJM_1211_ADM dm = (HD_YADJM_1211_ADM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.mode);
		cstmt.setString(4, dm.cmpy_nm);
		cstmt.setString(5, dm.ern);
		cstmt.setString(6, dm.in_cmpy_dt);
		cstmt.setString(7, dm.lvcmpy_dt);
		cstmt.setString(8, dm.impt_saly);
		cstmt.setString(9, dm.non_tax_prod);
		cstmt.setString(10, dm.non_tax_frnc);
		cstmt.setString(11, dm.deci_incm_tax);
		cstmt.setString(12, dm.deci_res_tax);
		cstmt.setString(13, dm.impt_bns);
		cstmt.setString(14, dm.bns_incm_tax_tot_amt);
		cstmt.setString(15, dm.bns_res_tax_tot_amt);
		cstmt.setString(16, dm.bns_deci_farm_spc_tax);
		cstmt.setString(17, dm.aprv_bns_tot_amt);
		cstmt.setString(18, dm.stok_num_shet_prft_amt);
		cstmt.setString(19, dm.np_pymt_amt);
		cstmt.setString(20, dm.hosp_insr_fee);
		cstmt.setString(21, dm.emp_insr_fee);
		cstmt.setString(22, dm.etc_insr_fee);
		cstmt.setString(23, dm.cmpy_cd);
		cstmt.setString(24, dm.connect_ip);
		cstmt.setString(25, dm.connect_userid);
		cstmt.setString(26, dm.input_not);
		cstmt.setString(27, dm.emp_no);
		cstmt.setString(28, dm.flnm);
		cstmt.setString(29, dm.adjm_rvrs_yy);
		cstmt.setString(30, dm.seq);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.hd.yadjm.ds.HD_YADJM_1211_ADataSet();
	}



	public void print(){
		System.out.println("SQL = " + this.getSQL());
		System.out.println("mode = [" + getMode() + "]");
		System.out.println("cmpy_nm = [" + getCmpy_nm() + "]");
		System.out.println("ern = [" + getErn() + "]");
		System.out.println("in_cmpy_dt = [" + getIn_cmpy_dt() + "]");
		System.out.println("lvcmpy_dt = [" + getLvcmpy_dt() + "]");
		System.out.println("impt_saly = [" + getImpt_saly() + "]");
		System.out.println("non_tax_prod = [" + getNon_tax_prod() + "]");
		System.out.println("non_tax_frnc = [" + getNon_tax_frnc() + "]");
		System.out.println("deci_incm_tax = [" + getDeci_incm_tax() + "]");
		System.out.println("deci_res_tax = [" + getDeci_res_tax() + "]");
		System.out.println("impt_bns = [" + getImpt_bns() + "]");
		System.out.println("bns_incm_tax_tot_amt = [" + getBns_incm_tax_tot_amt() + "]");
		System.out.println("bns_res_tax_tot_amt = [" + getBns_res_tax_tot_amt() + "]");
		System.out.println("bns_deci_farm_spc_tax = [" + getBns_deci_farm_spc_tax() + "]");
		System.out.println("aprv_bns_tot_amt = [" + getAprv_bns_tot_amt() + "]");
		System.out.println("stok_num_shet_prft_amt = [" + getStok_num_shet_prft_amt() + "]");
		System.out.println("np_pymt_amt = [" + getNp_pymt_amt() + "]");
		System.out.println("hosp_insr_fee = [" + getHosp_insr_fee() + "]");
		System.out.println("emp_insr_fee = [" + getEmp_insr_fee() + "]");
		System.out.println("etc_insr_fee = [" + getEtc_insr_fee() + "]");
		System.out.println("cmpy_cd = [" + getCmpy_cd() + "]");
		System.out.println("connect_ip = [" + getConnect_ip() + "]");
		System.out.println("connect_userid = [" + getConnect_userid() + "]");
		System.out.println("input_not = [" + getInput_not() + "]");
		System.out.println("emp_no = [" + getEmp_no() + "]");
		System.out.println("flnm = [" + getFlnm() + "]");
		System.out.println("adjm_rvrs_yy = [" + getAdjm_rvrs_yy() + "]");
		System.out.println("seq = [" + getSeq() + "]");
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
String cmpy_nm = req.getParameter("cmpy_nm");
if( cmpy_nm == null){
	System.out.println(this.toString+" : cmpy_nm is null" );
}else{
	System.out.println(this.toString+" : cmpy_nm is "+cmpy_nm );
}
String ern = req.getParameter("ern");
if( ern == null){
	System.out.println(this.toString+" : ern is null" );
}else{
	System.out.println(this.toString+" : ern is "+ern );
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
String impt_saly = req.getParameter("impt_saly");
if( impt_saly == null){
	System.out.println(this.toString+" : impt_saly is null" );
}else{
	System.out.println(this.toString+" : impt_saly is "+impt_saly );
}
String non_tax_prod = req.getParameter("non_tax_prod");
if( non_tax_prod == null){
	System.out.println(this.toString+" : non_tax_prod is null" );
}else{
	System.out.println(this.toString+" : non_tax_prod is "+non_tax_prod );
}
String non_tax_frnc = req.getParameter("non_tax_frnc");
if( non_tax_frnc == null){
	System.out.println(this.toString+" : non_tax_frnc is null" );
}else{
	System.out.println(this.toString+" : non_tax_frnc is "+non_tax_frnc );
}
String deci_incm_tax = req.getParameter("deci_incm_tax");
if( deci_incm_tax == null){
	System.out.println(this.toString+" : deci_incm_tax is null" );
}else{
	System.out.println(this.toString+" : deci_incm_tax is "+deci_incm_tax );
}
String deci_res_tax = req.getParameter("deci_res_tax");
if( deci_res_tax == null){
	System.out.println(this.toString+" : deci_res_tax is null" );
}else{
	System.out.println(this.toString+" : deci_res_tax is "+deci_res_tax );
}
String impt_bns = req.getParameter("impt_bns");
if( impt_bns == null){
	System.out.println(this.toString+" : impt_bns is null" );
}else{
	System.out.println(this.toString+" : impt_bns is "+impt_bns );
}
String bns_incm_tax_tot_amt = req.getParameter("bns_incm_tax_tot_amt");
if( bns_incm_tax_tot_amt == null){
	System.out.println(this.toString+" : bns_incm_tax_tot_amt is null" );
}else{
	System.out.println(this.toString+" : bns_incm_tax_tot_amt is "+bns_incm_tax_tot_amt );
}
String bns_res_tax_tot_amt = req.getParameter("bns_res_tax_tot_amt");
if( bns_res_tax_tot_amt == null){
	System.out.println(this.toString+" : bns_res_tax_tot_amt is null" );
}else{
	System.out.println(this.toString+" : bns_res_tax_tot_amt is "+bns_res_tax_tot_amt );
}
String bns_deci_farm_spc_tax = req.getParameter("bns_deci_farm_spc_tax");
if( bns_deci_farm_spc_tax == null){
	System.out.println(this.toString+" : bns_deci_farm_spc_tax is null" );
}else{
	System.out.println(this.toString+" : bns_deci_farm_spc_tax is "+bns_deci_farm_spc_tax );
}
String aprv_bns_tot_amt = req.getParameter("aprv_bns_tot_amt");
if( aprv_bns_tot_amt == null){
	System.out.println(this.toString+" : aprv_bns_tot_amt is null" );
}else{
	System.out.println(this.toString+" : aprv_bns_tot_amt is "+aprv_bns_tot_amt );
}
String stok_num_shet_prft_amt = req.getParameter("stok_num_shet_prft_amt");
if( stok_num_shet_prft_amt == null){
	System.out.println(this.toString+" : stok_num_shet_prft_amt is null" );
}else{
	System.out.println(this.toString+" : stok_num_shet_prft_amt is "+stok_num_shet_prft_amt );
}
String np_pymt_amt = req.getParameter("np_pymt_amt");
if( np_pymt_amt == null){
	System.out.println(this.toString+" : np_pymt_amt is null" );
}else{
	System.out.println(this.toString+" : np_pymt_amt is "+np_pymt_amt );
}
String hosp_insr_fee = req.getParameter("hosp_insr_fee");
if( hosp_insr_fee == null){
	System.out.println(this.toString+" : hosp_insr_fee is null" );
}else{
	System.out.println(this.toString+" : hosp_insr_fee is "+hosp_insr_fee );
}
String emp_insr_fee = req.getParameter("emp_insr_fee");
if( emp_insr_fee == null){
	System.out.println(this.toString+" : emp_insr_fee is null" );
}else{
	System.out.println(this.toString+" : emp_insr_fee is "+emp_insr_fee );
}
String etc_insr_fee = req.getParameter("etc_insr_fee");
if( etc_insr_fee == null){
	System.out.println(this.toString+" : etc_insr_fee is null" );
}else{
	System.out.println(this.toString+" : etc_insr_fee is "+etc_insr_fee );
}
String cmpy_cd = req.getParameter("cmpy_cd");
if( cmpy_cd == null){
	System.out.println(this.toString+" : cmpy_cd is null" );
}else{
	System.out.println(this.toString+" : cmpy_cd is "+cmpy_cd );
}
String connect_ip = req.getParameter("connect_ip");
if( connect_ip == null){
	System.out.println(this.toString+" : connect_ip is null" );
}else{
	System.out.println(this.toString+" : connect_ip is "+connect_ip );
}
String connect_userid = req.getParameter("connect_userid");
if( connect_userid == null){
	System.out.println(this.toString+" : connect_userid is null" );
}else{
	System.out.println(this.toString+" : connect_userid is "+connect_userid );
}
String input_not = req.getParameter("input_not");
if( input_not == null){
	System.out.println(this.toString+" : input_not is null" );
}else{
	System.out.println(this.toString+" : input_not is "+input_not );
}
String emp_no = req.getParameter("emp_no");
if( emp_no == null){
	System.out.println(this.toString+" : emp_no is null" );
}else{
	System.out.println(this.toString+" : emp_no is "+emp_no );
}
String flnm = req.getParameter("flnm");
if( flnm == null){
	System.out.println(this.toString+" : flnm is null" );
}else{
	System.out.println(this.toString+" : flnm is "+flnm );
}
String adjm_rvrs_yy = req.getParameter("adjm_rvrs_yy");
if( adjm_rvrs_yy == null){
	System.out.println(this.toString+" : adjm_rvrs_yy is null" );
}else{
	System.out.println(this.toString+" : adjm_rvrs_yy is "+adjm_rvrs_yy );
}
String seq = req.getParameter("seq");
if( seq == null){
	System.out.println(this.toString+" : seq is null" );
}else{
	System.out.println(this.toString+" : seq is "+seq );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리시 사용하십시오.

String mode = Util.checkString(req.getParameter("mode"));
String cmpy_nm = Util.checkString(req.getParameter("cmpy_nm"));
String ern = Util.checkString(req.getParameter("ern"));
String in_cmpy_dt = Util.checkString(req.getParameter("in_cmpy_dt"));
String lvcmpy_dt = Util.checkString(req.getParameter("lvcmpy_dt"));
String impt_saly = Util.checkString(req.getParameter("impt_saly"));
String non_tax_prod = Util.checkString(req.getParameter("non_tax_prod"));
String non_tax_frnc = Util.checkString(req.getParameter("non_tax_frnc"));
String deci_incm_tax = Util.checkString(req.getParameter("deci_incm_tax"));
String deci_res_tax = Util.checkString(req.getParameter("deci_res_tax"));
String impt_bns = Util.checkString(req.getParameter("impt_bns"));
String bns_incm_tax_tot_amt = Util.checkString(req.getParameter("bns_incm_tax_tot_amt"));
String bns_res_tax_tot_amt = Util.checkString(req.getParameter("bns_res_tax_tot_amt"));
String bns_deci_farm_spc_tax = Util.checkString(req.getParameter("bns_deci_farm_spc_tax"));
String aprv_bns_tot_amt = Util.checkString(req.getParameter("aprv_bns_tot_amt"));
String stok_num_shet_prft_amt = Util.checkString(req.getParameter("stok_num_shet_prft_amt"));
String np_pymt_amt = Util.checkString(req.getParameter("np_pymt_amt"));
String hosp_insr_fee = Util.checkString(req.getParameter("hosp_insr_fee"));
String emp_insr_fee = Util.checkString(req.getParameter("emp_insr_fee"));
String etc_insr_fee = Util.checkString(req.getParameter("etc_insr_fee"));
String cmpy_cd = Util.checkString(req.getParameter("cmpy_cd"));
String connect_ip = Util.checkString(req.getParameter("connect_ip"));
String connect_userid = Util.checkString(req.getParameter("connect_userid"));
String input_not = Util.checkString(req.getParameter("input_not"));
String emp_no = Util.checkString(req.getParameter("emp_no"));
String flnm = Util.checkString(req.getParameter("flnm"));
String adjm_rvrs_yy = Util.checkString(req.getParameter("adjm_rvrs_yy"));
String seq = Util.checkString(req.getParameter("seq"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String mode = Util.Uni2Ksc(Util.checkString(req.getParameter("mode")));
String cmpy_nm = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_nm")));
String ern = Util.Uni2Ksc(Util.checkString(req.getParameter("ern")));
String in_cmpy_dt = Util.Uni2Ksc(Util.checkString(req.getParameter("in_cmpy_dt")));
String lvcmpy_dt = Util.Uni2Ksc(Util.checkString(req.getParameter("lvcmpy_dt")));
String impt_saly = Util.Uni2Ksc(Util.checkString(req.getParameter("impt_saly")));
String non_tax_prod = Util.Uni2Ksc(Util.checkString(req.getParameter("non_tax_prod")));
String non_tax_frnc = Util.Uni2Ksc(Util.checkString(req.getParameter("non_tax_frnc")));
String deci_incm_tax = Util.Uni2Ksc(Util.checkString(req.getParameter("deci_incm_tax")));
String deci_res_tax = Util.Uni2Ksc(Util.checkString(req.getParameter("deci_res_tax")));
String impt_bns = Util.Uni2Ksc(Util.checkString(req.getParameter("impt_bns")));
String bns_incm_tax_tot_amt = Util.Uni2Ksc(Util.checkString(req.getParameter("bns_incm_tax_tot_amt")));
String bns_res_tax_tot_amt = Util.Uni2Ksc(Util.checkString(req.getParameter("bns_res_tax_tot_amt")));
String bns_deci_farm_spc_tax = Util.Uni2Ksc(Util.checkString(req.getParameter("bns_deci_farm_spc_tax")));
String aprv_bns_tot_amt = Util.Uni2Ksc(Util.checkString(req.getParameter("aprv_bns_tot_amt")));
String stok_num_shet_prft_amt = Util.Uni2Ksc(Util.checkString(req.getParameter("stok_num_shet_prft_amt")));
String np_pymt_amt = Util.Uni2Ksc(Util.checkString(req.getParameter("np_pymt_amt")));
String hosp_insr_fee = Util.Uni2Ksc(Util.checkString(req.getParameter("hosp_insr_fee")));
String emp_insr_fee = Util.Uni2Ksc(Util.checkString(req.getParameter("emp_insr_fee")));
String etc_insr_fee = Util.Uni2Ksc(Util.checkString(req.getParameter("etc_insr_fee")));
String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String connect_ip = Util.Uni2Ksc(Util.checkString(req.getParameter("connect_ip")));
String connect_userid = Util.Uni2Ksc(Util.checkString(req.getParameter("connect_userid")));
String input_not = Util.Uni2Ksc(Util.checkString(req.getParameter("input_not")));
String emp_no = Util.Uni2Ksc(Util.checkString(req.getParameter("emp_no")));
String flnm = Util.Uni2Ksc(Util.checkString(req.getParameter("flnm")));
String adjm_rvrs_yy = Util.Uni2Ksc(Util.checkString(req.getParameter("adjm_rvrs_yy")));
String seq = Util.Uni2Ksc(Util.checkString(req.getParameter("seq")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setMode(mode);
dm.setCmpy_nm(cmpy_nm);
dm.setErn(ern);
dm.setIn_cmpy_dt(in_cmpy_dt);
dm.setLvcmpy_dt(lvcmpy_dt);
dm.setImpt_saly(impt_saly);
dm.setNon_tax_prod(non_tax_prod);
dm.setNon_tax_frnc(non_tax_frnc);
dm.setDeci_incm_tax(deci_incm_tax);
dm.setDeci_res_tax(deci_res_tax);
dm.setImpt_bns(impt_bns);
dm.setBns_incm_tax_tot_amt(bns_incm_tax_tot_amt);
dm.setBns_res_tax_tot_amt(bns_res_tax_tot_amt);
dm.setBns_deci_farm_spc_tax(bns_deci_farm_spc_tax);
dm.setAprv_bns_tot_amt(aprv_bns_tot_amt);
dm.setStok_num_shet_prft_amt(stok_num_shet_prft_amt);
dm.setNp_pymt_amt(np_pymt_amt);
dm.setHosp_insr_fee(hosp_insr_fee);
dm.setEmp_insr_fee(emp_insr_fee);
dm.setEtc_insr_fee(etc_insr_fee);
dm.setCmpy_cd(cmpy_cd);
dm.setConnect_ip(connect_ip);
dm.setConnect_userid(connect_userid);
dm.setInput_not(input_not);
dm.setEmp_no(emp_no);
dm.setFlnm(flnm);
dm.setAdjm_rvrs_yy(adjm_rvrs_yy);
dm.setSeq(seq);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Fri Feb 01 17:44:26 KST 2013 */