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


public class HD_INFO_1043_ADM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String mode;
	public String cmpy_cd;
	public String emp_no;
	public String army_clsf_cd;
	public String forc_clsi_cd;
	public String army_svc_cd;
	public String cmmd_army_part_cd;
	public String sold_main_spc_cd;
	public String crps_spc_cd;
	public String army_cd;
	public String cls_cd;
	public String forc_no;
	public String in_army_dt;
	public String out_army_dt;
	public String out_army_resn_cd;
	public String army_un_finsh_resn_cd;
	public String rsv_forc_form_cd;
	public String rsv_forc_form_dt;
	public String incmg_pers_ipadd;
	public String incmg_pers;
	public String chg_pers;

	public HD_INFO_1043_ADM(){}
	public HD_INFO_1043_ADM(String mode, String cmpy_cd, String emp_no, String army_clsf_cd, String forc_clsi_cd, String army_svc_cd, String cmmd_army_part_cd, String sold_main_spc_cd, String crps_spc_cd, String army_cd, String cls_cd, String forc_no, String in_army_dt, String out_army_dt, String out_army_resn_cd, String army_un_finsh_resn_cd, String rsv_forc_form_cd, String rsv_forc_form_dt, String incmg_pers_ipadd, String incmg_pers, String chg_pers){
		this.mode = mode;
		this.cmpy_cd = cmpy_cd;
		this.emp_no = emp_no;
		this.army_clsf_cd = army_clsf_cd;
		this.forc_clsi_cd = forc_clsi_cd;
		this.army_svc_cd = army_svc_cd;
		this.cmmd_army_part_cd = cmmd_army_part_cd;
		this.sold_main_spc_cd = sold_main_spc_cd;
		this.crps_spc_cd = crps_spc_cd;
		this.army_cd = army_cd;
		this.cls_cd = cls_cd;
		this.forc_no = forc_no;
		this.in_army_dt = in_army_dt;
		this.out_army_dt = out_army_dt;
		this.out_army_resn_cd = out_army_resn_cd;
		this.army_un_finsh_resn_cd = army_un_finsh_resn_cd;
		this.rsv_forc_form_cd = rsv_forc_form_cd;
		this.rsv_forc_form_dt = rsv_forc_form_dt;
		this.incmg_pers_ipadd = incmg_pers_ipadd;
		this.incmg_pers = incmg_pers;
		this.chg_pers = chg_pers;
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

	public void setArmy_clsf_cd(String army_clsf_cd){
		this.army_clsf_cd = army_clsf_cd;
	}

	public void setForc_clsi_cd(String forc_clsi_cd){
		this.forc_clsi_cd = forc_clsi_cd;
	}

	public void setArmy_svc_cd(String army_svc_cd){
		this.army_svc_cd = army_svc_cd;
	}

	public void setCmmd_army_part_cd(String cmmd_army_part_cd){
		this.cmmd_army_part_cd = cmmd_army_part_cd;
	}

	public void setSold_main_spc_cd(String sold_main_spc_cd){
		this.sold_main_spc_cd = sold_main_spc_cd;
	}

	public void setCrps_spc_cd(String crps_spc_cd){
		this.crps_spc_cd = crps_spc_cd;
	}

	public void setArmy_cd(String army_cd){
		this.army_cd = army_cd;
	}

	public void setCls_cd(String cls_cd){
		this.cls_cd = cls_cd;
	}

	public void setForc_no(String forc_no){
		this.forc_no = forc_no;
	}

	public void setIn_army_dt(String in_army_dt){
		this.in_army_dt = in_army_dt;
	}

	public void setOut_army_dt(String out_army_dt){
		this.out_army_dt = out_army_dt;
	}

	public void setOut_army_resn_cd(String out_army_resn_cd){
		this.out_army_resn_cd = out_army_resn_cd;
	}

	public void setArmy_un_finsh_resn_cd(String army_un_finsh_resn_cd){
		this.army_un_finsh_resn_cd = army_un_finsh_resn_cd;
	}

	public void setRsv_forc_form_cd(String rsv_forc_form_cd){
		this.rsv_forc_form_cd = rsv_forc_form_cd;
	}

	public void setRsv_forc_form_dt(String rsv_forc_form_dt){
		this.rsv_forc_form_dt = rsv_forc_form_dt;
	}

	public void setIncmg_pers_ipadd(String incmg_pers_ipadd){
		this.incmg_pers_ipadd = incmg_pers_ipadd;
	}

	public void setIncmg_pers(String incmg_pers){
		this.incmg_pers = incmg_pers;
	}

	public void setChg_pers(String chg_pers){
		this.chg_pers = chg_pers;
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

	public String getArmy_clsf_cd(){
		return this.army_clsf_cd;
	}

	public String getForc_clsi_cd(){
		return this.forc_clsi_cd;
	}

	public String getArmy_svc_cd(){
		return this.army_svc_cd;
	}

	public String getCmmd_army_part_cd(){
		return this.cmmd_army_part_cd;
	}

	public String getSold_main_spc_cd(){
		return this.sold_main_spc_cd;
	}

	public String getCrps_spc_cd(){
		return this.crps_spc_cd;
	}

	public String getArmy_cd(){
		return this.army_cd;
	}

	public String getCls_cd(){
		return this.cls_cd;
	}

	public String getForc_no(){
		return this.forc_no;
	}

	public String getIn_army_dt(){
		return this.in_army_dt;
	}

	public String getOut_army_dt(){
		return this.out_army_dt;
	}

	public String getOut_army_resn_cd(){
		return this.out_army_resn_cd;
	}

	public String getArmy_un_finsh_resn_cd(){
		return this.army_un_finsh_resn_cd;
	}

	public String getRsv_forc_form_cd(){
		return this.rsv_forc_form_cd;
	}

	public String getRsv_forc_form_dt(){
		return this.rsv_forc_form_dt;
	}

	public String getIncmg_pers_ipadd(){
		return this.incmg_pers_ipadd;
	}

	public String getIncmg_pers(){
		return this.incmg_pers;
	}

	public String getChg_pers(){
		return this.chg_pers;
	}

	public String getSQL(){
		 return "{ call MISHDL.SP_HD_INFO_1043_A(? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		HD_INFO_1043_ADM dm = (HD_INFO_1043_ADM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.mode);
		cstmt.setString(4, dm.cmpy_cd);
		cstmt.setString(5, dm.emp_no);
		cstmt.setString(6, dm.army_clsf_cd);
		cstmt.setString(7, dm.forc_clsi_cd);
		cstmt.setString(8, dm.army_svc_cd);
		cstmt.setString(9, dm.cmmd_army_part_cd);
		cstmt.setString(10, dm.sold_main_spc_cd);
		cstmt.setString(11, dm.crps_spc_cd);
		cstmt.setString(12, dm.army_cd);
		cstmt.setString(13, dm.cls_cd);
		cstmt.setString(14, dm.forc_no);
		cstmt.setString(15, dm.in_army_dt);
		cstmt.setString(16, dm.out_army_dt);
		cstmt.setString(17, dm.out_army_resn_cd);
		cstmt.setString(18, dm.army_un_finsh_resn_cd);
		cstmt.setString(19, dm.rsv_forc_form_cd);
		cstmt.setString(20, dm.rsv_forc_form_dt);
		cstmt.setString(21, dm.incmg_pers_ipadd);
		cstmt.setString(22, dm.incmg_pers);
		cstmt.setString(23, dm.chg_pers);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.hd.info.ds.HD_INFO_1043_ADataSet();
	}



    public void print(){
        System.out.println("mode = " + getMode());
        System.out.println("cmpy_cd = " + getCmpy_cd());
        System.out.println("emp_no = " + getEmp_no());
        System.out.println("army_clsf_cd = " + getArmy_clsf_cd());
        System.out.println("forc_clsi_cd = " + getForc_clsi_cd());
        System.out.println("army_svc_cd = " + getArmy_svc_cd());
        System.out.println("cmmd_army_part_cd = " + getCmmd_army_part_cd());
        System.out.println("sold_main_spc_cd = " + getSold_main_spc_cd());
        System.out.println("crps_spc_cd = " + getCrps_spc_cd());
        System.out.println("army_cd = " + getArmy_cd());
        System.out.println("cls_cd = " + getCls_cd());
        System.out.println("forc_no = " + getForc_no());
        System.out.println("in_army_dt = " + getIn_army_dt());
        System.out.println("out_army_dt = " + getOut_army_dt());
        System.out.println("out_army_resn_cd = " + getOut_army_resn_cd());
        System.out.println("army_un_finsh_resn_cd = " + getArmy_un_finsh_resn_cd());
        System.out.println("rsv_forc_form_cd = " + getRsv_forc_form_cd());
        System.out.println("rsv_forc_form_dt = " + getRsv_forc_form_dt());
        System.out.println("incmg_pers_ipadd = " + getIncmg_pers_ipadd());
        System.out.println("incmg_pers = " + getIncmg_pers());
        System.out.println("chg_pers = " + getChg_pers());
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
String army_clsf_cd = req.getParameter("army_clsf_cd");
if( army_clsf_cd == null){
	System.out.println(this.toString+" : army_clsf_cd is null" );
}else{
	System.out.println(this.toString+" : army_clsf_cd is "+army_clsf_cd );
}
String forc_clsi_cd = req.getParameter("forc_clsi_cd");
if( forc_clsi_cd == null){
	System.out.println(this.toString+" : forc_clsi_cd is null" );
}else{
	System.out.println(this.toString+" : forc_clsi_cd is "+forc_clsi_cd );
}
String army_svc_cd = req.getParameter("army_svc_cd");
if( army_svc_cd == null){
	System.out.println(this.toString+" : army_svc_cd is null" );
}else{
	System.out.println(this.toString+" : army_svc_cd is "+army_svc_cd );
}
String cmmd_army_part_cd = req.getParameter("cmmd_army_part_cd");
if( cmmd_army_part_cd == null){
	System.out.println(this.toString+" : cmmd_army_part_cd is null" );
}else{
	System.out.println(this.toString+" : cmmd_army_part_cd is "+cmmd_army_part_cd );
}
String sold_main_spc_cd = req.getParameter("sold_main_spc_cd");
if( sold_main_spc_cd == null){
	System.out.println(this.toString+" : sold_main_spc_cd is null" );
}else{
	System.out.println(this.toString+" : sold_main_spc_cd is "+sold_main_spc_cd );
}
String crps_spc_cd = req.getParameter("crps_spc_cd");
if( crps_spc_cd == null){
	System.out.println(this.toString+" : crps_spc_cd is null" );
}else{
	System.out.println(this.toString+" : crps_spc_cd is "+crps_spc_cd );
}
String army_cd = req.getParameter("army_cd");
if( army_cd == null){
	System.out.println(this.toString+" : army_cd is null" );
}else{
	System.out.println(this.toString+" : army_cd is "+army_cd );
}
String cls_cd = req.getParameter("cls_cd");
if( cls_cd == null){
	System.out.println(this.toString+" : cls_cd is null" );
}else{
	System.out.println(this.toString+" : cls_cd is "+cls_cd );
}
String forc_no = req.getParameter("forc_no");
if( forc_no == null){
	System.out.println(this.toString+" : forc_no is null" );
}else{
	System.out.println(this.toString+" : forc_no is "+forc_no );
}
String in_army_dt = req.getParameter("in_army_dt");
if( in_army_dt == null){
	System.out.println(this.toString+" : in_army_dt is null" );
}else{
	System.out.println(this.toString+" : in_army_dt is "+in_army_dt );
}
String out_army_dt = req.getParameter("out_army_dt");
if( out_army_dt == null){
	System.out.println(this.toString+" : out_army_dt is null" );
}else{
	System.out.println(this.toString+" : out_army_dt is "+out_army_dt );
}
String out_army_resn_cd = req.getParameter("out_army_resn_cd");
if( out_army_resn_cd == null){
	System.out.println(this.toString+" : out_army_resn_cd is null" );
}else{
	System.out.println(this.toString+" : out_army_resn_cd is "+out_army_resn_cd );
}
String army_un_finsh_resn_cd = req.getParameter("army_un_finsh_resn_cd");
if( army_un_finsh_resn_cd == null){
	System.out.println(this.toString+" : army_un_finsh_resn_cd is null" );
}else{
	System.out.println(this.toString+" : army_un_finsh_resn_cd is "+army_un_finsh_resn_cd );
}
String rsv_forc_form_cd = req.getParameter("rsv_forc_form_cd");
if( rsv_forc_form_cd == null){
	System.out.println(this.toString+" : rsv_forc_form_cd is null" );
}else{
	System.out.println(this.toString+" : rsv_forc_form_cd is "+rsv_forc_form_cd );
}
String rsv_forc_form_dt = req.getParameter("rsv_forc_form_dt");
if( rsv_forc_form_dt == null){
	System.out.println(this.toString+" : rsv_forc_form_dt is null" );
}else{
	System.out.println(this.toString+" : rsv_forc_form_dt is "+rsv_forc_form_dt );
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
String chg_pers = req.getParameter("chg_pers");
if( chg_pers == null){
	System.out.println(this.toString+" : chg_pers is null" );
}else{
	System.out.println(this.toString+" : chg_pers is "+chg_pers );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리시 사용하십시오.

String mode = Util.checkString(req.getParameter("mode"));
String cmpy_cd = Util.checkString(req.getParameter("cmpy_cd"));
String emp_no = Util.checkString(req.getParameter("emp_no"));
String army_clsf_cd = Util.checkString(req.getParameter("army_clsf_cd"));
String forc_clsi_cd = Util.checkString(req.getParameter("forc_clsi_cd"));
String army_svc_cd = Util.checkString(req.getParameter("army_svc_cd"));
String cmmd_army_part_cd = Util.checkString(req.getParameter("cmmd_army_part_cd"));
String sold_main_spc_cd = Util.checkString(req.getParameter("sold_main_spc_cd"));
String crps_spc_cd = Util.checkString(req.getParameter("crps_spc_cd"));
String army_cd = Util.checkString(req.getParameter("army_cd"));
String cls_cd = Util.checkString(req.getParameter("cls_cd"));
String forc_no = Util.checkString(req.getParameter("forc_no"));
String in_army_dt = Util.checkString(req.getParameter("in_army_dt"));
String out_army_dt = Util.checkString(req.getParameter("out_army_dt"));
String out_army_resn_cd = Util.checkString(req.getParameter("out_army_resn_cd"));
String army_un_finsh_resn_cd = Util.checkString(req.getParameter("army_un_finsh_resn_cd"));
String rsv_forc_form_cd = Util.checkString(req.getParameter("rsv_forc_form_cd"));
String rsv_forc_form_dt = Util.checkString(req.getParameter("rsv_forc_form_dt"));
String incmg_pers_ipadd = Util.checkString(req.getParameter("incmg_pers_ipadd"));
String incmg_pers = Util.checkString(req.getParameter("incmg_pers"));
String chg_pers = Util.checkString(req.getParameter("chg_pers"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String mode = Util.Uni2Ksc(Util.checkString(req.getParameter("mode")));
String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String emp_no = Util.Uni2Ksc(Util.checkString(req.getParameter("emp_no")));
String army_clsf_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("army_clsf_cd")));
String forc_clsi_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("forc_clsi_cd")));
String army_svc_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("army_svc_cd")));
String cmmd_army_part_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmmd_army_part_cd")));
String sold_main_spc_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("sold_main_spc_cd")));
String crps_spc_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("crps_spc_cd")));
String army_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("army_cd")));
String cls_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cls_cd")));
String forc_no = Util.Uni2Ksc(Util.checkString(req.getParameter("forc_no")));
String in_army_dt = Util.Uni2Ksc(Util.checkString(req.getParameter("in_army_dt")));
String out_army_dt = Util.Uni2Ksc(Util.checkString(req.getParameter("out_army_dt")));
String out_army_resn_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("out_army_resn_cd")));
String army_un_finsh_resn_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("army_un_finsh_resn_cd")));
String rsv_forc_form_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("rsv_forc_form_cd")));
String rsv_forc_form_dt = Util.Uni2Ksc(Util.checkString(req.getParameter("rsv_forc_form_dt")));
String incmg_pers_ipadd = Util.Uni2Ksc(Util.checkString(req.getParameter("incmg_pers_ipadd")));
String incmg_pers = Util.Uni2Ksc(Util.checkString(req.getParameter("incmg_pers")));
String chg_pers = Util.Uni2Ksc(Util.checkString(req.getParameter("chg_pers")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setMode(mode);
dm.setCmpy_cd(cmpy_cd);
dm.setEmp_no(emp_no);
dm.setArmy_clsf_cd(army_clsf_cd);
dm.setForc_clsi_cd(forc_clsi_cd);
dm.setArmy_svc_cd(army_svc_cd);
dm.setCmmd_army_part_cd(cmmd_army_part_cd);
dm.setSold_main_spc_cd(sold_main_spc_cd);
dm.setCrps_spc_cd(crps_spc_cd);
dm.setArmy_cd(army_cd);
dm.setCls_cd(cls_cd);
dm.setForc_no(forc_no);
dm.setIn_army_dt(in_army_dt);
dm.setOut_army_dt(out_army_dt);
dm.setOut_army_resn_cd(out_army_resn_cd);
dm.setArmy_un_finsh_resn_cd(army_un_finsh_resn_cd);
dm.setRsv_forc_form_cd(rsv_forc_form_cd);
dm.setRsv_forc_form_dt(rsv_forc_form_dt);
dm.setIncmg_pers_ipadd(incmg_pers_ipadd);
dm.setIncmg_pers(incmg_pers);
dm.setChg_pers(chg_pers);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Wed Mar 11 11:08:35 KST 2009 */