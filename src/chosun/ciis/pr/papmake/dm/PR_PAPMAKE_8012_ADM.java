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


public class PR_PAPMAKE_8012_ADM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String mst_mode;
	public String cmpy_cd;
	public String occr_dt;
	public String dcmt_no;
	public String dcmt_clsf;
	public String dcmt_nm;
	public String requ_dt;
	public String resp_dt;
	public String requ_pers;
	public String resp_pers;
	public String remk;
	public String remk2;
	public String dcmt_tp;
	public String tel_no;
	public String dept_cd;
	public String fac_clsf;
	public String incmg_pers_ipaddr;
	public String incmg_pers;
	public String chg_pers;

	public PR_PAPMAKE_8012_ADM(){}
	public PR_PAPMAKE_8012_ADM(String mst_mode, String cmpy_cd, String occr_dt, String dcmt_no, String dcmt_clsf, String dcmt_nm, String requ_dt, String resp_dt, String requ_pers, String resp_pers, String remk, String remk2, String dcmt_tp, String fac_clsf, String dept_cd, String tel_no, String incmg_pers_ipaddr, String incmg_pers, String chg_pers){
		this.mst_mode = mst_mode;
		this.cmpy_cd = cmpy_cd;
		this.occr_dt = occr_dt;
		this.dcmt_no = dcmt_no;
		this.dcmt_clsf = dcmt_clsf;
		this.dcmt_nm = dcmt_nm;
		this.requ_dt = requ_dt;
		this.resp_dt = resp_dt;
		this.requ_pers = requ_pers;
		this.resp_pers = resp_pers;
		this.remk = remk;
		this.remk2 = remk2;
		this.dcmt_tp = dcmt_tp;
		this.dept_cd = dept_cd;
		this.fac_clsf = fac_clsf;
		this.tel_no = tel_no;
		this.incmg_pers_ipaddr = incmg_pers_ipaddr;
		this.incmg_pers = incmg_pers;
		this.chg_pers = chg_pers;
	}

	public void setMst_mode(String mst_mode){
		this.mst_mode = mst_mode;
	}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setOccr_dt(String occr_dt){
		this.occr_dt = occr_dt;
	}

	public void setDcmt_no(String dcmt_no){
		this.dcmt_no = dcmt_no;
	}

	public void setDcmt_clsf(String dcmt_clsf){
		this.dcmt_clsf = dcmt_clsf;
	}

	public void setDcmt_nm(String dcmt_nm){
		this.dcmt_nm = dcmt_nm;
	}

	public void setRequ_dt(String requ_dt){
		this.requ_dt = requ_dt;
	}

	public void setResp_dt(String resp_dt){
		this.resp_dt = resp_dt;
	}

	public void setRequ_pers(String requ_pers){
		this.requ_pers = requ_pers;
	}

	public void setResp_pers(String resp_pers){
		this.resp_pers = resp_pers;
	}

	public void setRemk(String remk){
		this.remk = remk;
	}

	public void setRemk2(String remk2){
		this.remk2 = remk2;
	}
	
	public void setDcmt_tp(String dcmt_tp) {
		this.dcmt_tp = dcmt_tp;
	}
	
	public void setDept_cd(String dept_cd) {
		this.dept_cd = dept_cd;
	}
	
	public void setFac_clsf(String fac_clsf) {
		this.fac_clsf = fac_clsf;
	}
	
	public void setTel_no(String tel_no) {
		this.tel_no = tel_no;
	}
	
	public void setIncmg_pers_ipaddr(String incmg_pers_ipaddr){
		this.incmg_pers_ipaddr = incmg_pers_ipaddr;
	}

	public void setIncmg_pers(String incmg_pers){
		this.incmg_pers = incmg_pers;
	}

	public void setChg_pers(String chg_pers){
		this.chg_pers = chg_pers;
	}

	public String getMst_mode(){
		return this.mst_mode;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getOccr_dt(){
		return this.occr_dt;
	}

	public String getDcmt_no(){
		return this.dcmt_no;
	}

	public String getDcmt_clsf(){
		return this.dcmt_clsf;
	}

	public String getDcmt_nm(){
		return this.dcmt_nm;
	}

	public String getRequ_dt(){
		return this.requ_dt;
	}

	public String getResp_dt(){
		return this.resp_dt;
	}

	public String getRequ_pers(){
		return this.requ_pers;
	}

	public String getResp_pers(){
		return this.resp_pers;
	}

	public String getRemk(){
		return this.remk;
	}
	
	public String getRemk2(){
		return this.remk2;
	}
	
	public String getDcmt_tp() {
		return dcmt_tp;
	}
	
	public String getDept_cd() {
		return dept_cd;
	}
	
	public String getFac_clsf() {
		return fac_clsf;
	}
	
	public String getTel_no() {
		return tel_no;
	}
	
	public String getIncmg_pers_ipaddr(){
		return this.incmg_pers_ipaddr;
	}

	public String getIncmg_pers(){
		return this.incmg_pers;
	}

	public String getChg_pers(){
		return this.chg_pers;
	}

	public String getSQL(){
		 return "{ call MISMAT.SP_PR_PAPMAKE_8012_A(? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		PR_PAPMAKE_8012_ADM dm = (PR_PAPMAKE_8012_ADM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.mst_mode);
		cstmt.setString(4, dm.cmpy_cd);
		cstmt.setString(5, dm.occr_dt);
		cstmt.setString(6, dm.dcmt_no);
		cstmt.setString(7, dm.dcmt_clsf);
		cstmt.setString(8, dm.dcmt_nm);
		cstmt.setString(9, dm.requ_dt);
		cstmt.setString(10, dm.resp_dt);
		cstmt.setString(11, dm.requ_pers);
		cstmt.setString(12, dm.resp_pers);
		cstmt.setString(13, dm.remk);
		cstmt.setString(14, dm.remk2);
		cstmt.setString(15, dm.dcmt_tp);
		cstmt.setString(16, dm.fac_clsf);
		cstmt.setString(17, dm.dept_cd);
		cstmt.setString(18, dm.tel_no);
		cstmt.setString(19, dm.incmg_pers_ipaddr);
		cstmt.setString(20, dm.incmg_pers);
		cstmt.setString(21, dm.chg_pers);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.pr.papmake.ds.PR_PAPMAKE_8012_ADataSet();
	}



	public void print(){
		System.out.println("SQL = " + this.getSQL());
		System.out.println("mst_mode = [" + getMst_mode() + "]");
		System.out.println("cmpy_cd = [" + getCmpy_cd() + "]");
		System.out.println("occr_dt = [" + getOccr_dt() + "]");
		System.out.println("dcmt_no = [" + getDcmt_no() + "]");
		System.out.println("dcmt_clsf = [" + getDcmt_clsf() + "]");
		System.out.println("dcmt_nm = [" + getDcmt_nm() + "]");
		System.out.println("requ_dt = [" + getRequ_dt() + "]");
		System.out.println("resp_dt = [" + getResp_dt() + "]");
		System.out.println("requ_pers = [" + getRequ_pers() + "]");
		System.out.println("resp_pers = [" + getResp_pers() + "]");
		System.out.println("remk = [" + getRemk() + "]");
		System.out.println("remk2 = [" + getRemk2() + "]");
		System.out.println("dcmt_tp = [" + getDcmt_tp() + "]");
		System.out.println("fac_clsf = [" + getFac_clsf() + "]");
		System.out.println("dept_cd = [" + getDept_cd() + "]");
		System.out.println("tel_no = [" + getTel_no() + "]");
		System.out.println("incmg_pers_ipaddr = [" + getIncmg_pers_ipaddr() + "]");
		System.out.println("incmg_pers = [" + getIncmg_pers() + "]");
		System.out.println("chg_pers = [" + getChg_pers() + "]");
	}
}
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리 및 결과확인 검사시 사용하십시오.

String mst_mode = req.getParameter("mst_mode");
if( mst_mode == null){
	System.out.println(this.toString+" : mst_mode is null" );
}else{
	System.out.println(this.toString+" : mst_mode is "+mst_mode );
}
String cmpy_cd = req.getParameter("cmpy_cd");
if( cmpy_cd == null){
	System.out.println(this.toString+" : cmpy_cd is null" );
}else{
	System.out.println(this.toString+" : cmpy_cd is "+cmpy_cd );
}
String occr_dt = req.getParameter("occr_dt");
if( occr_dt == null){
	System.out.println(this.toString+" : occr_dt is null" );
}else{
	System.out.println(this.toString+" : occr_dt is "+occr_dt );
}
String dcmt_no = req.getParameter("dcmt_no");
if( dcmt_no == null){
	System.out.println(this.toString+" : dcmt_no is null" );
}else{
	System.out.println(this.toString+" : dcmt_no is "+dcmt_no );
}
String dcmt_clsf = req.getParameter("dcmt_clsf");
if( dcmt_clsf == null){
	System.out.println(this.toString+" : dcmt_clsf is null" );
}else{
	System.out.println(this.toString+" : dcmt_clsf is "+dcmt_clsf );
}
String dcmt_nm = req.getParameter("dcmt_nm");
if( dcmt_nm == null){
	System.out.println(this.toString+" : dcmt_nm is null" );
}else{
	System.out.println(this.toString+" : dcmt_nm is "+dcmt_nm );
}
String requ_dt = req.getParameter("requ_dt");
if( requ_dt == null){
	System.out.println(this.toString+" : requ_dt is null" );
}else{
	System.out.println(this.toString+" : requ_dt is "+requ_dt );
}
String resp_dt = req.getParameter("resp_dt");
if( resp_dt == null){
	System.out.println(this.toString+" : resp_dt is null" );
}else{
	System.out.println(this.toString+" : resp_dt is "+resp_dt );
}
String requ_pers = req.getParameter("requ_pers");
if( requ_pers == null){
	System.out.println(this.toString+" : requ_pers is null" );
}else{
	System.out.println(this.toString+" : requ_pers is "+requ_pers );
}
String resp_pers = req.getParameter("resp_pers");
if( resp_pers == null){
	System.out.println(this.toString+" : resp_pers is null" );
}else{
	System.out.println(this.toString+" : resp_pers is "+resp_pers );
}
String remk = req.getParameter("remk");
if( remk == null){
	System.out.println(this.toString+" : remk is null" );
}else{
	System.out.println(this.toString+" : remk is "+remk );
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
String chg_pers = req.getParameter("chg_pers");
if( chg_pers == null){
	System.out.println(this.toString+" : chg_pers is null" );
}else{
	System.out.println(this.toString+" : chg_pers is "+chg_pers );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리시 사용하십시오.

String mst_mode = Util.checkString(req.getParameter("mst_mode"));
String cmpy_cd = Util.checkString(req.getParameter("cmpy_cd"));
String occr_dt = Util.checkString(req.getParameter("occr_dt"));
String dcmt_no = Util.checkString(req.getParameter("dcmt_no"));
String dcmt_clsf = Util.checkString(req.getParameter("dcmt_clsf"));
String dcmt_nm = Util.checkString(req.getParameter("dcmt_nm"));
String requ_dt = Util.checkString(req.getParameter("requ_dt"));
String resp_dt = Util.checkString(req.getParameter("resp_dt"));
String requ_pers = Util.checkString(req.getParameter("requ_pers"));
String resp_pers = Util.checkString(req.getParameter("resp_pers"));
String remk = Util.checkString(req.getParameter("remk"));
String incmg_pers_ipaddr = Util.checkString(req.getParameter("incmg_pers_ipaddr"));
String incmg_pers = Util.checkString(req.getParameter("incmg_pers"));
String chg_pers = Util.checkString(req.getParameter("chg_pers"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String mst_mode = Util.Uni2Ksc(Util.checkString(req.getParameter("mst_mode")));
String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String occr_dt = Util.Uni2Ksc(Util.checkString(req.getParameter("occr_dt")));
String dcmt_no = Util.Uni2Ksc(Util.checkString(req.getParameter("dcmt_no")));
String dcmt_clsf = Util.Uni2Ksc(Util.checkString(req.getParameter("dcmt_clsf")));
String dcmt_nm = Util.Uni2Ksc(Util.checkString(req.getParameter("dcmt_nm")));
String requ_dt = Util.Uni2Ksc(Util.checkString(req.getParameter("requ_dt")));
String resp_dt = Util.Uni2Ksc(Util.checkString(req.getParameter("resp_dt")));
String requ_pers = Util.Uni2Ksc(Util.checkString(req.getParameter("requ_pers")));
String resp_pers = Util.Uni2Ksc(Util.checkString(req.getParameter("resp_pers")));
String remk = Util.Uni2Ksc(Util.checkString(req.getParameter("remk")));
String incmg_pers_ipaddr = Util.Uni2Ksc(Util.checkString(req.getParameter("incmg_pers_ipaddr")));
String incmg_pers = Util.Uni2Ksc(Util.checkString(req.getParameter("incmg_pers")));
String chg_pers = Util.Uni2Ksc(Util.checkString(req.getParameter("chg_pers")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setMst_mode(mst_mode);
dm.setCmpy_cd(cmpy_cd);
dm.setOccr_dt(occr_dt);
dm.setDcmt_no(dcmt_no);
dm.setDcmt_clsf(dcmt_clsf);
dm.setDcmt_nm(dcmt_nm);
dm.setRequ_dt(requ_dt);
dm.setResp_dt(resp_dt);
dm.setRequ_pers(requ_pers);
dm.setResp_pers(resp_pers);
dm.setRemk(remk);
dm.setIncmg_pers_ipaddr(incmg_pers_ipaddr);
dm.setIncmg_pers(incmg_pers);
dm.setChg_pers(chg_pers);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Fri Jul 22 15:03:22 KST 2016 */
