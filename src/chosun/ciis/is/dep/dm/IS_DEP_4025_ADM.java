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


package chosun.ciis.is.dep.dm;

import java.sql.*;
import oracle.jdbc.driver.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.is.dep.ds.*;
import chosun.ciis.is.dep.rec.*;

/**
 * 
 */


public class IS_DEP_4025_ADM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String cmpy_cd;
	public String tmnl_no;
	public String aprv_dt;
	public String branch_nm;
	public String card_no;
	public String req_amt;
	public String job_flg;
	public String aprv_no;
	public String card_cmpy_cd_nm;
	public String card_clsf_nm;
	public String incmg_pers_ip;
	public String incmg_pers;
	public String mode;

	public IS_DEP_4025_ADM(){}
	public IS_DEP_4025_ADM(String cmpy_cd, String tmnl_no, String aprv_dt, String branch_nm, String card_no, String req_amt, String job_flg, String aprv_no, String card_cmpy_cd_nm, String card_clsf_nm, String incmg_pers_ip, String incmg_pers, String mode){
		this.cmpy_cd = cmpy_cd;
		this.tmnl_no = tmnl_no;
		this.aprv_dt = aprv_dt;
		this.branch_nm = branch_nm;
		this.card_no = card_no;
		this.req_amt = req_amt;
		this.job_flg = job_flg;
		this.aprv_no = aprv_no;
		this.card_cmpy_cd_nm = card_cmpy_cd_nm;
		this.card_clsf_nm = card_clsf_nm;
		this.incmg_pers_ip = incmg_pers_ip;
		this.incmg_pers = incmg_pers;
		this.mode = mode;
	}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setTmnl_no(String tmnl_no){
		this.tmnl_no = tmnl_no;
	}

	public void setAprv_dt(String aprv_dt){
		this.aprv_dt = aprv_dt;
	}

	public void setBranch_nm(String branch_nm){
		this.branch_nm = branch_nm;
	}

	public void setCard_no(String card_no){
		this.card_no = card_no;
	}

	public void setReq_amt(String req_amt){
		this.req_amt = req_amt;
	}

	public void setJob_flg(String job_flg){
		this.job_flg = job_flg;
	}

	public void setAprv_no(String aprv_no){
		this.aprv_no = aprv_no;
	}

	public void setCard_cmpy_cd_nm(String card_cmpy_cd_nm){
		this.card_cmpy_cd_nm = card_cmpy_cd_nm;
	}

	public void setCard_clsf_nm(String card_clsf_nm){
		this.card_clsf_nm = card_clsf_nm;
	}

	public void setIncmg_pers_ip(String incmg_pers_ip){
		this.incmg_pers_ip = incmg_pers_ip;
	}

	public void setIncmg_pers(String incmg_pers){
		this.incmg_pers = incmg_pers;
	}

	public void setMode(String mode){
		this.mode = mode;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getTmnl_no(){
		return this.tmnl_no;
	}

	public String getAprv_dt(){
		return this.aprv_dt;
	}

	public String getBranch_nm(){
		return this.branch_nm;
	}

	public String getCard_no(){
		return this.card_no;
	}

	public String getReq_amt(){
		return this.req_amt;
	}

	public String getJob_flg(){
		return this.job_flg;
	}

	public String getAprv_no(){
		return this.aprv_no;
	}

	public String getCard_cmpy_cd_nm(){
		return this.card_cmpy_cd_nm;
	}

	public String getCard_clsf_nm(){
		return this.card_clsf_nm;
	}

	public String getIncmg_pers_ip(){
		return this.incmg_pers_ip;
	}

	public String getIncmg_pers(){
		return this.incmg_pers;
	}

	public String getMode(){
		return this.mode;
	}

	public String getSQL(){
		 return "{ call MISISP.SP_IS_DEP_4025_A(? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		IS_DEP_4025_ADM dm = (IS_DEP_4025_ADM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.cmpy_cd);
		cstmt.setString(4, dm.tmnl_no);
		cstmt.setString(5, dm.aprv_dt);
		cstmt.setString(6, dm.branch_nm);
		cstmt.setString(7, dm.card_no);
		cstmt.setString(8, dm.req_amt);
		cstmt.setString(9, dm.job_flg);
		cstmt.setString(10, dm.aprv_no);
		cstmt.setString(11, dm.card_cmpy_cd_nm);
		cstmt.setString(12, dm.card_clsf_nm);
		cstmt.setString(13, dm.incmg_pers_ip);
		cstmt.setString(14, dm.incmg_pers);
		cstmt.setString(15, dm.mode);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.is.dep.ds.IS_DEP_4025_ADataSet();
	}



	public void print(){
		System.out.println("SQL = " + this.getSQL());
		System.out.println("cmpy_cd = [" + getCmpy_cd() + "]");
		System.out.println("tmnl_no = [" + getTmnl_no() + "]");
		System.out.println("aprv_dt = [" + getAprv_dt() + "]");
		System.out.println("branch_nm = [" + getBranch_nm() + "]");
		System.out.println("card_no = [" + getCard_no() + "]");
		System.out.println("req_amt = [" + getReq_amt() + "]");
		System.out.println("job_flg = [" + getJob_flg() + "]");
		System.out.println("aprv_no = [" + getAprv_no() + "]");
		System.out.println("card_cmpy_cd_nm = [" + getCard_cmpy_cd_nm() + "]");
		System.out.println("card_clsf_nm = [" + getCard_clsf_nm() + "]");
		System.out.println("incmg_pers_ip = [" + getIncmg_pers_ip() + "]");
		System.out.println("incmg_pers = [" + getIncmg_pers() + "]");
		System.out.println("mode = [" + getMode() + "]");
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
String tmnl_no = req.getParameter("tmnl_no");
if( tmnl_no == null){
	System.out.println(this.toString+" : tmnl_no is null" );
}else{
	System.out.println(this.toString+" : tmnl_no is "+tmnl_no );
}
String aprv_dt = req.getParameter("aprv_dt");
if( aprv_dt == null){
	System.out.println(this.toString+" : aprv_dt is null" );
}else{
	System.out.println(this.toString+" : aprv_dt is "+aprv_dt );
}
String branch_nm = req.getParameter("branch_nm");
if( branch_nm == null){
	System.out.println(this.toString+" : branch_nm is null" );
}else{
	System.out.println(this.toString+" : branch_nm is "+branch_nm );
}
String card_no = req.getParameter("card_no");
if( card_no == null){
	System.out.println(this.toString+" : card_no is null" );
}else{
	System.out.println(this.toString+" : card_no is "+card_no );
}
String req_amt = req.getParameter("req_amt");
if( req_amt == null){
	System.out.println(this.toString+" : req_amt is null" );
}else{
	System.out.println(this.toString+" : req_amt is "+req_amt );
}
String job_flg = req.getParameter("job_flg");
if( job_flg == null){
	System.out.println(this.toString+" : job_flg is null" );
}else{
	System.out.println(this.toString+" : job_flg is "+job_flg );
}
String aprv_no = req.getParameter("aprv_no");
if( aprv_no == null){
	System.out.println(this.toString+" : aprv_no is null" );
}else{
	System.out.println(this.toString+" : aprv_no is "+aprv_no );
}
String card_cmpy_cd_nm = req.getParameter("card_cmpy_cd_nm");
if( card_cmpy_cd_nm == null){
	System.out.println(this.toString+" : card_cmpy_cd_nm is null" );
}else{
	System.out.println(this.toString+" : card_cmpy_cd_nm is "+card_cmpy_cd_nm );
}
String card_clsf_nm = req.getParameter("card_clsf_nm");
if( card_clsf_nm == null){
	System.out.println(this.toString+" : card_clsf_nm is null" );
}else{
	System.out.println(this.toString+" : card_clsf_nm is "+card_clsf_nm );
}
String incmg_pers_ip = req.getParameter("incmg_pers_ip");
if( incmg_pers_ip == null){
	System.out.println(this.toString+" : incmg_pers_ip is null" );
}else{
	System.out.println(this.toString+" : incmg_pers_ip is "+incmg_pers_ip );
}
String incmg_pers = req.getParameter("incmg_pers");
if( incmg_pers == null){
	System.out.println(this.toString+" : incmg_pers is null" );
}else{
	System.out.println(this.toString+" : incmg_pers is "+incmg_pers );
}
String mode = req.getParameter("mode");
if( mode == null){
	System.out.println(this.toString+" : mode is null" );
}else{
	System.out.println(this.toString+" : mode is "+mode );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.checkString(req.getParameter("cmpy_cd"));
String tmnl_no = Util.checkString(req.getParameter("tmnl_no"));
String aprv_dt = Util.checkString(req.getParameter("aprv_dt"));
String branch_nm = Util.checkString(req.getParameter("branch_nm"));
String card_no = Util.checkString(req.getParameter("card_no"));
String req_amt = Util.checkString(req.getParameter("req_amt"));
String job_flg = Util.checkString(req.getParameter("job_flg"));
String aprv_no = Util.checkString(req.getParameter("aprv_no"));
String card_cmpy_cd_nm = Util.checkString(req.getParameter("card_cmpy_cd_nm"));
String card_clsf_nm = Util.checkString(req.getParameter("card_clsf_nm"));
String incmg_pers_ip = Util.checkString(req.getParameter("incmg_pers_ip"));
String incmg_pers = Util.checkString(req.getParameter("incmg_pers"));
String mode = Util.checkString(req.getParameter("mode"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String tmnl_no = Util.Uni2Ksc(Util.checkString(req.getParameter("tmnl_no")));
String aprv_dt = Util.Uni2Ksc(Util.checkString(req.getParameter("aprv_dt")));
String branch_nm = Util.Uni2Ksc(Util.checkString(req.getParameter("branch_nm")));
String card_no = Util.Uni2Ksc(Util.checkString(req.getParameter("card_no")));
String req_amt = Util.Uni2Ksc(Util.checkString(req.getParameter("req_amt")));
String job_flg = Util.Uni2Ksc(Util.checkString(req.getParameter("job_flg")));
String aprv_no = Util.Uni2Ksc(Util.checkString(req.getParameter("aprv_no")));
String card_cmpy_cd_nm = Util.Uni2Ksc(Util.checkString(req.getParameter("card_cmpy_cd_nm")));
String card_clsf_nm = Util.Uni2Ksc(Util.checkString(req.getParameter("card_clsf_nm")));
String incmg_pers_ip = Util.Uni2Ksc(Util.checkString(req.getParameter("incmg_pers_ip")));
String incmg_pers = Util.Uni2Ksc(Util.checkString(req.getParameter("incmg_pers")));
String mode = Util.Uni2Ksc(Util.checkString(req.getParameter("mode")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setCmpy_cd(cmpy_cd);
dm.setTmnl_no(tmnl_no);
dm.setAprv_dt(aprv_dt);
dm.setBranch_nm(branch_nm);
dm.setCard_no(card_no);
dm.setReq_amt(req_amt);
dm.setJob_flg(job_flg);
dm.setAprv_no(aprv_no);
dm.setCard_cmpy_cd_nm(card_cmpy_cd_nm);
dm.setCard_clsf_nm(card_clsf_nm);
dm.setIncmg_pers_ip(incmg_pers_ip);
dm.setIncmg_pers(incmg_pers);
dm.setMode(mode);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Tue Jul 10 09:41:33 KST 2012 */