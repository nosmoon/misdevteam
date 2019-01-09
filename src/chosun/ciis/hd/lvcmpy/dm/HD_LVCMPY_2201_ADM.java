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


package chosun.ciis.hd.lvcmpy.dm;

import java.sql.*;
import oracle.jdbc.driver.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.hd.lvcmpy.ds.*;
import chosun.ciis.hd.lvcmpy.rec.*;

/**
 * 
 */


public class HD_LVCMPY_2201_ADM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String mode;
	public String cmpy_cd;
	public String emp_no;
	public String cmpy_nm;
	public String ern;
	public String impt_saly;
	public String impt_bns;
	public String aprv_bns_tot_amt;
	public String non_tax_work;
	public String non_tax_prod;
	public String non_tax_frnc;
	public String non_tax_etc;
	public String hosp_insr_fee;
	public String np_pymt_amt;
	public String emp_insr_fee;
	public String deci_incm_tax;
	public String deci_res_tax;
	public String seq;
	public String incmg_pers_ipadd;
	public String incmg_pers;

	public HD_LVCMPY_2201_ADM(){}
	public HD_LVCMPY_2201_ADM(String mode, String cmpy_cd, String emp_no, String cmpy_nm, String ern, String impt_saly, String impt_bns, String aprv_bns_tot_amt, String non_tax_work, String non_tax_prod, String non_tax_frnc, String non_tax_etc, String hosp_insr_fee, String np_pymt_amt, String emp_insr_fee, String deci_incm_tax, String deci_res_tax, String seq, String incmg_pers_ipadd, String incmg_pers){
		this.mode = mode;
		this.cmpy_cd = cmpy_cd;
		this.emp_no = emp_no;
		this.cmpy_nm = cmpy_nm;
		this.ern = ern;
		this.impt_saly = impt_saly;
		this.impt_bns = impt_bns;
		this.aprv_bns_tot_amt = aprv_bns_tot_amt;
		this.non_tax_work = non_tax_work;
		this.non_tax_prod = non_tax_prod;
		this.non_tax_frnc = non_tax_frnc;
		this.non_tax_etc = non_tax_etc;
		this.hosp_insr_fee = hosp_insr_fee;
		this.np_pymt_amt = np_pymt_amt;
		this.emp_insr_fee = emp_insr_fee;
		this.deci_incm_tax = deci_incm_tax;
		this.deci_res_tax = deci_res_tax;
		this.seq = seq;
		this.incmg_pers_ipadd = incmg_pers_ipadd;
		this.incmg_pers = incmg_pers;
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

	public void setCmpy_nm(String cmpy_nm){
		this.cmpy_nm = cmpy_nm;
	}

	public void setErn(String ern){
		this.ern = ern;
	}

	public void setImpt_saly(String impt_saly){
		this.impt_saly = impt_saly;
	}

	public void setImpt_bns(String impt_bns){
		this.impt_bns = impt_bns;
	}

	public void setAprv_bns_tot_amt(String aprv_bns_tot_amt){
		this.aprv_bns_tot_amt = aprv_bns_tot_amt;
	}

	public void setNon_tax_work(String non_tax_work){
		this.non_tax_work = non_tax_work;
	}

	public void setNon_tax_prod(String non_tax_prod){
		this.non_tax_prod = non_tax_prod;
	}

	public void setNon_tax_frnc(String non_tax_frnc){
		this.non_tax_frnc = non_tax_frnc;
	}

	public void setNon_tax_etc(String non_tax_etc){
		this.non_tax_etc = non_tax_etc;
	}

	public void setHosp_insr_fee(String hosp_insr_fee){
		this.hosp_insr_fee = hosp_insr_fee;
	}

	public void setNp_pymt_amt(String np_pymt_amt){
		this.np_pymt_amt = np_pymt_amt;
	}

	public void setEmp_insr_fee(String emp_insr_fee){
		this.emp_insr_fee = emp_insr_fee;
	}

	public void setDeci_incm_tax(String deci_incm_tax){
		this.deci_incm_tax = deci_incm_tax;
	}

	public void setDeci_res_tax(String deci_res_tax){
		this.deci_res_tax = deci_res_tax;
	}

	public void setSeq(String seq){
		this.seq = seq;
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

	public String getEmp_no(){
		return this.emp_no;
	}

	public String getCmpy_nm(){
		return this.cmpy_nm;
	}

	public String getErn(){
		return this.ern;
	}

	public String getImpt_saly(){
		return this.impt_saly;
	}

	public String getImpt_bns(){
		return this.impt_bns;
	}

	public String getAprv_bns_tot_amt(){
		return this.aprv_bns_tot_amt;
	}

	public String getNon_tax_work(){
		return this.non_tax_work;
	}

	public String getNon_tax_prod(){
		return this.non_tax_prod;
	}

	public String getNon_tax_frnc(){
		return this.non_tax_frnc;
	}

	public String getNon_tax_etc(){
		return this.non_tax_etc;
	}

	public String getHosp_insr_fee(){
		return this.hosp_insr_fee;
	}

	public String getNp_pymt_amt(){
		return this.np_pymt_amt;
	}

	public String getEmp_insr_fee(){
		return this.emp_insr_fee;
	}

	public String getDeci_incm_tax(){
		return this.deci_incm_tax;
	}

	public String getDeci_res_tax(){
		return this.deci_res_tax;
	}

	public String getSeq(){
		return this.seq;
	}

	public String getIncmg_pers_ipadd(){
		return this.incmg_pers_ipadd;
	}

	public String getIncmg_pers(){
		return this.incmg_pers;
	}

	public String getSQL(){
		 return "{ call MISHDL.SP_HD_LVCMPY_2201_A(? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		HD_LVCMPY_2201_ADM dm = (HD_LVCMPY_2201_ADM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.mode);
		cstmt.setString(4, dm.cmpy_cd);
		cstmt.setString(5, dm.emp_no);
		cstmt.setString(6, dm.cmpy_nm);
		cstmt.setString(7, dm.ern);
		cstmt.setString(8, dm.impt_saly);
		cstmt.setString(9, dm.impt_bns);
		cstmt.setString(10, dm.aprv_bns_tot_amt);
		cstmt.setString(11, dm.non_tax_work);
		cstmt.setString(12, dm.non_tax_prod);
		cstmt.setString(13, dm.non_tax_frnc);
		cstmt.setString(14, dm.non_tax_etc);
		cstmt.setString(15, dm.hosp_insr_fee);
		cstmt.setString(16, dm.np_pymt_amt);
		cstmt.setString(17, dm.emp_insr_fee);
		cstmt.setString(18, dm.deci_incm_tax);
		cstmt.setString(19, dm.deci_res_tax);
		cstmt.setString(20, dm.seq);
		cstmt.setString(21, dm.incmg_pers_ipadd);
		cstmt.setString(22, dm.incmg_pers);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.hd.lvcmpy.ds.HD_LVCMPY_2201_ADataSet();
	}



	public void print(){
		System.out.println("SQL = " + this.getSQL());
		System.out.println("mode = [" + getMode() + "]");
		System.out.println("cmpy_cd = [" + getCmpy_cd() + "]");
		System.out.println("emp_no = [" + getEmp_no() + "]");
		System.out.println("cmpy_nm = [" + getCmpy_nm() + "]");
		System.out.println("ern = [" + getErn() + "]");
		System.out.println("impt_saly = [" + getImpt_saly() + "]");
		System.out.println("impt_bns = [" + getImpt_bns() + "]");
		System.out.println("aprv_bns_tot_amt = [" + getAprv_bns_tot_amt() + "]");
		System.out.println("non_tax_work = [" + getNon_tax_work() + "]");
		System.out.println("non_tax_prod = [" + getNon_tax_prod() + "]");
		System.out.println("non_tax_frnc = [" + getNon_tax_frnc() + "]");
		System.out.println("non_tax_etc = [" + getNon_tax_etc() + "]");
		System.out.println("hosp_insr_fee = [" + getHosp_insr_fee() + "]");
		System.out.println("np_pymt_amt = [" + getNp_pymt_amt() + "]");
		System.out.println("emp_insr_fee = [" + getEmp_insr_fee() + "]");
		System.out.println("deci_incm_tax = [" + getDeci_incm_tax() + "]");
		System.out.println("deci_res_tax = [" + getDeci_res_tax() + "]");
		System.out.println("seq = [" + getSeq() + "]");
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
String emp_no = req.getParameter("emp_no");
if( emp_no == null){
	System.out.println(this.toString+" : emp_no is null" );
}else{
	System.out.println(this.toString+" : emp_no is "+emp_no );
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
String impt_saly = req.getParameter("impt_saly");
if( impt_saly == null){
	System.out.println(this.toString+" : impt_saly is null" );
}else{
	System.out.println(this.toString+" : impt_saly is "+impt_saly );
}
String impt_bns = req.getParameter("impt_bns");
if( impt_bns == null){
	System.out.println(this.toString+" : impt_bns is null" );
}else{
	System.out.println(this.toString+" : impt_bns is "+impt_bns );
}
String aprv_bns_tot_amt = req.getParameter("aprv_bns_tot_amt");
if( aprv_bns_tot_amt == null){
	System.out.println(this.toString+" : aprv_bns_tot_amt is null" );
}else{
	System.out.println(this.toString+" : aprv_bns_tot_amt is "+aprv_bns_tot_amt );
}
String non_tax_work = req.getParameter("non_tax_work");
if( non_tax_work == null){
	System.out.println(this.toString+" : non_tax_work is null" );
}else{
	System.out.println(this.toString+" : non_tax_work is "+non_tax_work );
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
String non_tax_etc = req.getParameter("non_tax_etc");
if( non_tax_etc == null){
	System.out.println(this.toString+" : non_tax_etc is null" );
}else{
	System.out.println(this.toString+" : non_tax_etc is "+non_tax_etc );
}
String hosp_insr_fee = req.getParameter("hosp_insr_fee");
if( hosp_insr_fee == null){
	System.out.println(this.toString+" : hosp_insr_fee is null" );
}else{
	System.out.println(this.toString+" : hosp_insr_fee is "+hosp_insr_fee );
}
String np_pymt_amt = req.getParameter("np_pymt_amt");
if( np_pymt_amt == null){
	System.out.println(this.toString+" : np_pymt_amt is null" );
}else{
	System.out.println(this.toString+" : np_pymt_amt is "+np_pymt_amt );
}
String emp_insr_fee = req.getParameter("emp_insr_fee");
if( emp_insr_fee == null){
	System.out.println(this.toString+" : emp_insr_fee is null" );
}else{
	System.out.println(this.toString+" : emp_insr_fee is "+emp_insr_fee );
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
String seq = req.getParameter("seq");
if( seq == null){
	System.out.println(this.toString+" : seq is null" );
}else{
	System.out.println(this.toString+" : seq is "+seq );
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
String emp_no = Util.checkString(req.getParameter("emp_no"));
String cmpy_nm = Util.checkString(req.getParameter("cmpy_nm"));
String ern = Util.checkString(req.getParameter("ern"));
String impt_saly = Util.checkString(req.getParameter("impt_saly"));
String impt_bns = Util.checkString(req.getParameter("impt_bns"));
String aprv_bns_tot_amt = Util.checkString(req.getParameter("aprv_bns_tot_amt"));
String non_tax_work = Util.checkString(req.getParameter("non_tax_work"));
String non_tax_prod = Util.checkString(req.getParameter("non_tax_prod"));
String non_tax_frnc = Util.checkString(req.getParameter("non_tax_frnc"));
String non_tax_etc = Util.checkString(req.getParameter("non_tax_etc"));
String hosp_insr_fee = Util.checkString(req.getParameter("hosp_insr_fee"));
String np_pymt_amt = Util.checkString(req.getParameter("np_pymt_amt"));
String emp_insr_fee = Util.checkString(req.getParameter("emp_insr_fee"));
String deci_incm_tax = Util.checkString(req.getParameter("deci_incm_tax"));
String deci_res_tax = Util.checkString(req.getParameter("deci_res_tax"));
String seq = Util.checkString(req.getParameter("seq"));
String incmg_pers_ipadd = Util.checkString(req.getParameter("incmg_pers_ipadd"));
String incmg_pers = Util.checkString(req.getParameter("incmg_pers"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String mode = Util.Uni2Ksc(Util.checkString(req.getParameter("mode")));
String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String emp_no = Util.Uni2Ksc(Util.checkString(req.getParameter("emp_no")));
String cmpy_nm = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_nm")));
String ern = Util.Uni2Ksc(Util.checkString(req.getParameter("ern")));
String impt_saly = Util.Uni2Ksc(Util.checkString(req.getParameter("impt_saly")));
String impt_bns = Util.Uni2Ksc(Util.checkString(req.getParameter("impt_bns")));
String aprv_bns_tot_amt = Util.Uni2Ksc(Util.checkString(req.getParameter("aprv_bns_tot_amt")));
String non_tax_work = Util.Uni2Ksc(Util.checkString(req.getParameter("non_tax_work")));
String non_tax_prod = Util.Uni2Ksc(Util.checkString(req.getParameter("non_tax_prod")));
String non_tax_frnc = Util.Uni2Ksc(Util.checkString(req.getParameter("non_tax_frnc")));
String non_tax_etc = Util.Uni2Ksc(Util.checkString(req.getParameter("non_tax_etc")));
String hosp_insr_fee = Util.Uni2Ksc(Util.checkString(req.getParameter("hosp_insr_fee")));
String np_pymt_amt = Util.Uni2Ksc(Util.checkString(req.getParameter("np_pymt_amt")));
String emp_insr_fee = Util.Uni2Ksc(Util.checkString(req.getParameter("emp_insr_fee")));
String deci_incm_tax = Util.Uni2Ksc(Util.checkString(req.getParameter("deci_incm_tax")));
String deci_res_tax = Util.Uni2Ksc(Util.checkString(req.getParameter("deci_res_tax")));
String seq = Util.Uni2Ksc(Util.checkString(req.getParameter("seq")));
String incmg_pers_ipadd = Util.Uni2Ksc(Util.checkString(req.getParameter("incmg_pers_ipadd")));
String incmg_pers = Util.Uni2Ksc(Util.checkString(req.getParameter("incmg_pers")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setMode(mode);
dm.setCmpy_cd(cmpy_cd);
dm.setEmp_no(emp_no);
dm.setCmpy_nm(cmpy_nm);
dm.setErn(ern);
dm.setImpt_saly(impt_saly);
dm.setImpt_bns(impt_bns);
dm.setAprv_bns_tot_amt(aprv_bns_tot_amt);
dm.setNon_tax_work(non_tax_work);
dm.setNon_tax_prod(non_tax_prod);
dm.setNon_tax_frnc(non_tax_frnc);
dm.setNon_tax_etc(non_tax_etc);
dm.setHosp_insr_fee(hosp_insr_fee);
dm.setNp_pymt_amt(np_pymt_amt);
dm.setEmp_insr_fee(emp_insr_fee);
dm.setDeci_incm_tax(deci_incm_tax);
dm.setDeci_res_tax(deci_res_tax);
dm.setSeq(seq);
dm.setIncmg_pers_ipadd(incmg_pers_ipadd);
dm.setIncmg_pers(incmg_pers);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Thu May 07 11:37:41 KST 2009 */