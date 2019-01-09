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


package chosun.ciis.hd.info.dm;

import java.sql.*;
import oracle.jdbc.driver.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.hd.info.ds.*;
import chosun.ciis.hd.info.rec.*;

/**
 * 
 */


public class HD_INFO_1093_ADM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String mode;
	public String cmpy_cd;
	public String emp_no;
	public String prtct_obj_clsf_cd;
	public String prtct_obj_pers_no;
	public String prtct_grad_cd;
	public String prtct_obj_relatn;
	public String prtct_obj_relatn_rshp_cd;
	public String prtct_appmt_ofbld_cd;
	public String gurt_insr_entr_dt;
	public String gurt_insr_mtry_dt;
	public String gurt_insr_amt;
	public String gurt_insr_no;
	public String incmg_pers_ipadd;
	public String incmg_pers;

	public HD_INFO_1093_ADM(){}
	public HD_INFO_1093_ADM(String mode, String cmpy_cd, String emp_no, String prtct_obj_clsf_cd, String prtct_obj_pers_no, String prtct_grad_cd, String prtct_obj_relatn, String prtct_obj_relatn_rshp_cd, String prtct_appmt_ofbld_cd, String gurt_insr_entr_dt, String gurt_insr_mtry_dt, String gurt_insr_amt, String gurt_insr_no, String incmg_pers_ipadd, String incmg_pers){
		this.mode = mode;
		this.cmpy_cd = cmpy_cd;
		this.emp_no = emp_no;
		this.prtct_obj_clsf_cd = prtct_obj_clsf_cd;
		this.prtct_obj_pers_no = prtct_obj_pers_no;
		this.prtct_grad_cd = prtct_grad_cd;
		this.prtct_obj_relatn = prtct_obj_relatn;
		this.prtct_obj_relatn_rshp_cd = prtct_obj_relatn_rshp_cd;
		this.prtct_appmt_ofbld_cd = prtct_appmt_ofbld_cd;
		this.gurt_insr_entr_dt = gurt_insr_entr_dt;
		this.gurt_insr_mtry_dt = gurt_insr_mtry_dt;
		this.gurt_insr_amt = gurt_insr_amt;
		this.gurt_insr_no = gurt_insr_no;
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

	public void setPrtct_obj_clsf_cd(String prtct_obj_clsf_cd){
		this.prtct_obj_clsf_cd = prtct_obj_clsf_cd;
	}

	public void setPrtct_obj_pers_no(String prtct_obj_pers_no){
		this.prtct_obj_pers_no = prtct_obj_pers_no;
	}

	public void setPrtct_grad_cd(String prtct_grad_cd){
		this.prtct_grad_cd = prtct_grad_cd;
	}

	public void setPrtct_obj_relatn(String prtct_obj_relatn){
		this.prtct_obj_relatn = prtct_obj_relatn;
	}

	public void setPrtct_obj_relatn_rshp_cd(String prtct_obj_relatn_rshp_cd){
		this.prtct_obj_relatn_rshp_cd = prtct_obj_relatn_rshp_cd;
	}

	public void setPrtct_appmt_ofbld_cd(String prtct_appmt_ofbld_cd){
		this.prtct_appmt_ofbld_cd = prtct_appmt_ofbld_cd;
	}

	public void setGurt_insr_entr_dt(String gurt_insr_entr_dt){
		this.gurt_insr_entr_dt = gurt_insr_entr_dt;
	}

	public void setGurt_insr_mtry_dt(String gurt_insr_mtry_dt){
		this.gurt_insr_mtry_dt = gurt_insr_mtry_dt;
	}

	public void setGurt_insr_amt(String gurt_insr_amt){
		this.gurt_insr_amt = gurt_insr_amt;
	}

	public void setGurt_insr_no(String gurt_insr_no){
		this.gurt_insr_no = gurt_insr_no;
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

	public String getPrtct_obj_clsf_cd(){
		return this.prtct_obj_clsf_cd;
	}

	public String getPrtct_obj_pers_no(){
		return this.prtct_obj_pers_no;
	}

	public String getPrtct_grad_cd(){
		return this.prtct_grad_cd;
	}

	public String getPrtct_obj_relatn(){
		return this.prtct_obj_relatn;
	}

	public String getPrtct_obj_relatn_rshp_cd(){
		return this.prtct_obj_relatn_rshp_cd;
	}

	public String getPrtct_appmt_ofbld_cd(){
		return this.prtct_appmt_ofbld_cd;
	}

	public String getGurt_insr_entr_dt(){
		return this.gurt_insr_entr_dt;
	}

	public String getGurt_insr_mtry_dt(){
		return this.gurt_insr_mtry_dt;
	}

	public String getGurt_insr_amt(){
		return this.gurt_insr_amt;
	}

	public String getGurt_insr_no(){
		return this.gurt_insr_no;
	}

	public String getIncmg_pers_ipadd(){
		return this.incmg_pers_ipadd;
	}

	public String getIncmg_pers(){
		return this.incmg_pers;
	}

	public String getSQL(){
		 return "{ call MISHDL.SP_HD_INFO_1093_A(? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		HD_INFO_1093_ADM dm = (HD_INFO_1093_ADM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.mode);
		cstmt.setString(4, dm.cmpy_cd);
		cstmt.setString(5, dm.emp_no);
		cstmt.setString(6, dm.prtct_obj_clsf_cd);
		cstmt.setString(7, dm.prtct_obj_pers_no);
		cstmt.setString(8, dm.prtct_grad_cd);
		cstmt.setString(9, dm.prtct_obj_relatn);
		cstmt.setString(10, dm.prtct_obj_relatn_rshp_cd);
		cstmt.setString(11, dm.prtct_appmt_ofbld_cd);
		cstmt.setString(12, dm.gurt_insr_entr_dt);
		cstmt.setString(13, dm.gurt_insr_mtry_dt);
		cstmt.setString(14, dm.gurt_insr_amt);
		cstmt.setString(15, dm.gurt_insr_no);
		cstmt.setString(16, dm.incmg_pers_ipadd);
		cstmt.setString(17, dm.incmg_pers);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.hd.info.ds.HD_INFO_1093_ADataSet();
	}



    public void print(){
        System.out.println("mode = " + getMode());
        System.out.println("cmpy_cd = " + getCmpy_cd());
        System.out.println("emp_no = " + getEmp_no());
        System.out.println("prtct_obj_clsf_cd = " + getPrtct_obj_clsf_cd());
        System.out.println("prtct_obj_pers_no = " + getPrtct_obj_pers_no());
        System.out.println("prtct_grad_cd = " + getPrtct_grad_cd());
        System.out.println("prtct_obj_relatn = " + getPrtct_obj_relatn());
        System.out.println("prtct_obj_relatn_rshp_cd = " + getPrtct_obj_relatn_rshp_cd());
        System.out.println("prtct_appmt_ofbld_cd = " + getPrtct_appmt_ofbld_cd());
        System.out.println("gurt_insr_entr_dt = " + getGurt_insr_entr_dt());
        System.out.println("gurt_insr_mtry_dt = " + getGurt_insr_mtry_dt());
        System.out.println("gurt_insr_amt = " + getGurt_insr_amt());
        System.out.println("gurt_insr_no = " + getGurt_insr_no());
        System.out.println("incmg_pers_ipadd = " + getIncmg_pers_ipadd());
        System.out.println("incmg_pers = " + getIncmg_pers());
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
String prtct_obj_clsf_cd = req.getParameter("prtct_obj_clsf_cd");
if( prtct_obj_clsf_cd == null){
	System.out.println(this.toString+" : prtct_obj_clsf_cd is null" );
}else{
	System.out.println(this.toString+" : prtct_obj_clsf_cd is "+prtct_obj_clsf_cd );
}
String prtct_obj_pers_no = req.getParameter("prtct_obj_pers_no");
if( prtct_obj_pers_no == null){
	System.out.println(this.toString+" : prtct_obj_pers_no is null" );
}else{
	System.out.println(this.toString+" : prtct_obj_pers_no is "+prtct_obj_pers_no );
}
String prtct_grad_cd = req.getParameter("prtct_grad_cd");
if( prtct_grad_cd == null){
	System.out.println(this.toString+" : prtct_grad_cd is null" );
}else{
	System.out.println(this.toString+" : prtct_grad_cd is "+prtct_grad_cd );
}
String prtct_obj_relatn = req.getParameter("prtct_obj_relatn");
if( prtct_obj_relatn == null){
	System.out.println(this.toString+" : prtct_obj_relatn is null" );
}else{
	System.out.println(this.toString+" : prtct_obj_relatn is "+prtct_obj_relatn );
}
String prtct_obj_relatn_rshp_cd = req.getParameter("prtct_obj_relatn_rshp_cd");
if( prtct_obj_relatn_rshp_cd == null){
	System.out.println(this.toString+" : prtct_obj_relatn_rshp_cd is null" );
}else{
	System.out.println(this.toString+" : prtct_obj_relatn_rshp_cd is "+prtct_obj_relatn_rshp_cd );
}
String prtct_appmt_ofbld_cd = req.getParameter("prtct_appmt_ofbld_cd");
if( prtct_appmt_ofbld_cd == null){
	System.out.println(this.toString+" : prtct_appmt_ofbld_cd is null" );
}else{
	System.out.println(this.toString+" : prtct_appmt_ofbld_cd is "+prtct_appmt_ofbld_cd );
}
String gurt_insr_entr_dt = req.getParameter("gurt_insr_entr_dt");
if( gurt_insr_entr_dt == null){
	System.out.println(this.toString+" : gurt_insr_entr_dt is null" );
}else{
	System.out.println(this.toString+" : gurt_insr_entr_dt is "+gurt_insr_entr_dt );
}
String gurt_insr_mtry_dt = req.getParameter("gurt_insr_mtry_dt");
if( gurt_insr_mtry_dt == null){
	System.out.println(this.toString+" : gurt_insr_mtry_dt is null" );
}else{
	System.out.println(this.toString+" : gurt_insr_mtry_dt is "+gurt_insr_mtry_dt );
}
String gurt_insr_amt = req.getParameter("gurt_insr_amt");
if( gurt_insr_amt == null){
	System.out.println(this.toString+" : gurt_insr_amt is null" );
}else{
	System.out.println(this.toString+" : gurt_insr_amt is "+gurt_insr_amt );
}
String gurt_insr_no = req.getParameter("gurt_insr_no");
if( gurt_insr_no == null){
	System.out.println(this.toString+" : gurt_insr_no is null" );
}else{
	System.out.println(this.toString+" : gurt_insr_no is "+gurt_insr_no );
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
String prtct_obj_clsf_cd = Util.checkString(req.getParameter("prtct_obj_clsf_cd"));
String prtct_obj_pers_no = Util.checkString(req.getParameter("prtct_obj_pers_no"));
String prtct_grad_cd = Util.checkString(req.getParameter("prtct_grad_cd"));
String prtct_obj_relatn = Util.checkString(req.getParameter("prtct_obj_relatn"));
String prtct_obj_relatn_rshp_cd = Util.checkString(req.getParameter("prtct_obj_relatn_rshp_cd"));
String prtct_appmt_ofbld_cd = Util.checkString(req.getParameter("prtct_appmt_ofbld_cd"));
String gurt_insr_entr_dt = Util.checkString(req.getParameter("gurt_insr_entr_dt"));
String gurt_insr_mtry_dt = Util.checkString(req.getParameter("gurt_insr_mtry_dt"));
String gurt_insr_amt = Util.checkString(req.getParameter("gurt_insr_amt"));
String gurt_insr_no = Util.checkString(req.getParameter("gurt_insr_no"));
String incmg_pers_ipadd = Util.checkString(req.getParameter("incmg_pers_ipadd"));
String incmg_pers = Util.checkString(req.getParameter("incmg_pers"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String mode = Util.Uni2Ksc(Util.checkString(req.getParameter("mode")));
String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String emp_no = Util.Uni2Ksc(Util.checkString(req.getParameter("emp_no")));
String prtct_obj_clsf_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("prtct_obj_clsf_cd")));
String prtct_obj_pers_no = Util.Uni2Ksc(Util.checkString(req.getParameter("prtct_obj_pers_no")));
String prtct_grad_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("prtct_grad_cd")));
String prtct_obj_relatn = Util.Uni2Ksc(Util.checkString(req.getParameter("prtct_obj_relatn")));
String prtct_obj_relatn_rshp_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("prtct_obj_relatn_rshp_cd")));
String prtct_appmt_ofbld_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("prtct_appmt_ofbld_cd")));
String gurt_insr_entr_dt = Util.Uni2Ksc(Util.checkString(req.getParameter("gurt_insr_entr_dt")));
String gurt_insr_mtry_dt = Util.Uni2Ksc(Util.checkString(req.getParameter("gurt_insr_mtry_dt")));
String gurt_insr_amt = Util.Uni2Ksc(Util.checkString(req.getParameter("gurt_insr_amt")));
String gurt_insr_no = Util.Uni2Ksc(Util.checkString(req.getParameter("gurt_insr_no")));
String incmg_pers_ipadd = Util.Uni2Ksc(Util.checkString(req.getParameter("incmg_pers_ipadd")));
String incmg_pers = Util.Uni2Ksc(Util.checkString(req.getParameter("incmg_pers")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setMode(mode);
dm.setCmpy_cd(cmpy_cd);
dm.setEmp_no(emp_no);
dm.setPrtct_obj_clsf_cd(prtct_obj_clsf_cd);
dm.setPrtct_obj_pers_no(prtct_obj_pers_no);
dm.setPrtct_grad_cd(prtct_grad_cd);
dm.setPrtct_obj_relatn(prtct_obj_relatn);
dm.setPrtct_obj_relatn_rshp_cd(prtct_obj_relatn_rshp_cd);
dm.setPrtct_appmt_ofbld_cd(prtct_appmt_ofbld_cd);
dm.setGurt_insr_entr_dt(gurt_insr_entr_dt);
dm.setGurt_insr_mtry_dt(gurt_insr_mtry_dt);
dm.setGurt_insr_amt(gurt_insr_amt);
dm.setGurt_insr_no(gurt_insr_no);
dm.setIncmg_pers_ipadd(incmg_pers_ipadd);
dm.setIncmg_pers(incmg_pers);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Wed Mar 11 11:34:35 KST 2009 */