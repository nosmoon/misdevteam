/***************************************************************************************************
* 파일명		: 
* 기능		:
* 작성일자	: 
* 작성자		: 
***************************************************************************************************/
/***************************************************************************************************
* 수정내역	: 
* 수정자		:   
* 수정일자	: 
* 백업		: 
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

public class HD_AFFR_4101_ADM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String in_cmpy_cd;
	public String in_aply_yy;
	public String act_flag;
	public String dept_cd;
	public String emp_no;
	public String in_cmpy_dt;
	public String lvcmpy_dt;
	public String frdt;
	public String stop_dt;
	public String cont_svc_yys;
	public String rest_vaca_yys_clsf;
	public String base_pont;
	public String faml_pont;
	public String cont_svc_pont;
	public String rest_pont;
	public String dty_taem_chf_un_norm;
	public String dty_comite_memb;
	public String pont_tot;
	public String use_pont;
	public String rsrt_amt;
	public String cmpy_cd;
	public String aply_yy;
	public String u_ipadd;
	public String u_id;
	public String mode;

	public HD_AFFR_4101_ADM(){}
	public HD_AFFR_4101_ADM(String in_cmpy_cd, String in_aply_yy, String act_flag, String dept_cd, String emp_no, String in_cmpy_dt, String lvcmpy_dt, String frdt, String stop_dt, String cont_svc_yys, String rest_vaca_yys_clsf, String base_pont, String faml_pont, String cont_svc_pont, String rest_pont, String dty_taem_chf_un_norm, String dty_comite_memb, String pont_tot, String use_pont, String rsrt_amt, String cmpy_cd, String aply_yy, String u_ipadd, String u_id, String mode){
		this.in_cmpy_cd = in_cmpy_cd;
		this.in_aply_yy = in_aply_yy;
		this.act_flag = act_flag;
		this.dept_cd = dept_cd;
		this.emp_no = emp_no;
		this.in_cmpy_dt = in_cmpy_dt;
		this.lvcmpy_dt = lvcmpy_dt;
		this.frdt = frdt;
		this.stop_dt = stop_dt;
		this.cont_svc_yys = cont_svc_yys;
		this.rest_vaca_yys_clsf = rest_vaca_yys_clsf;
		this.base_pont = base_pont;
		this.faml_pont = faml_pont;
		this.cont_svc_pont = cont_svc_pont;
		this.rest_pont = rest_pont;
		this.dty_taem_chf_un_norm = dty_taem_chf_un_norm;
		this.dty_comite_memb = dty_comite_memb;
		this.pont_tot = pont_tot;
		this.use_pont = use_pont;
		this.rsrt_amt = rsrt_amt;
		this.cmpy_cd = cmpy_cd;
		this.aply_yy = aply_yy;
		this.u_ipadd = u_ipadd;
		this.u_id = u_id;
		this.mode = mode;
	}

	public void setIn_cmpy_cd(String in_cmpy_cd){
		this.in_cmpy_cd = in_cmpy_cd;
	}

	public void setIn_aply_yy(String in_aply_yy){
		this.in_aply_yy = in_aply_yy;
	}

	public void setAct_flag(String act_flag){
		this.act_flag = act_flag;
	}

	public void setDept_cd(String dept_cd){
		this.dept_cd = dept_cd;
	}

	public void setEmp_no(String emp_no){
		this.emp_no = emp_no;
	}

	public void setIn_cmpy_dt(String in_cmpy_dt){
		this.in_cmpy_dt = in_cmpy_dt;
	}

	public void setLvcmpy_dt(String lvcmpy_dt){
		this.lvcmpy_dt = lvcmpy_dt;
	}

	public void setFrdt(String frdt){
		this.frdt = frdt;
	}

	public void setStop_dt(String stop_dt){
		this.stop_dt = stop_dt;
	}

	public void setCont_svc_yys(String cont_svc_yys){
		this.cont_svc_yys = cont_svc_yys;
	}

	public void setRest_vaca_yys_clsf(String rest_vaca_yys_clsf){
		this.rest_vaca_yys_clsf = rest_vaca_yys_clsf;
	}

	public void setBase_pont(String base_pont){
		this.base_pont = base_pont;
	}

	public void setFaml_pont(String faml_pont){
		this.faml_pont = faml_pont;
	}

	public void setCont_svc_pont(String cont_svc_pont){
		this.cont_svc_pont = cont_svc_pont;
	}

	public void setRest_pont(String rest_pont){
		this.rest_pont = rest_pont;
	}

	public void setDty_taem_chf_un_norm(String dty_taem_chf_un_norm){
		this.dty_taem_chf_un_norm = dty_taem_chf_un_norm;
	}

	public void setDty_comite_memb(String dty_comite_memb){
		this.dty_comite_memb = dty_comite_memb;
	}

	public void setPont_tot(String pont_tot){
		this.pont_tot = pont_tot;
	}

	public void setUse_pont(String use_pont){
		this.use_pont = use_pont;
	}

	public void setRsrt_amt(String rsrt_amt){
		this.rsrt_amt = rsrt_amt;
	}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setAply_yy(String aply_yy){
		this.aply_yy = aply_yy;
	}

	public void setU_ipadd(String u_ipadd){
		this.u_ipadd = u_ipadd;
	}

	public void setU_id(String u_id){
		this.u_id = u_id;
	}

	public void setMode(String mode){
		this.mode = mode;
	}

	public String getIn_cmpy_cd(){
		return this.in_cmpy_cd;
	}

	public String getIn_aply_yy(){
		return this.in_aply_yy;
	}

	public String getAct_flag(){
		return this.act_flag;
	}

	public String getDept_cd(){
		return this.dept_cd;
	}

	public String getEmp_no(){
		return this.emp_no;
	}

	public String getIn_cmpy_dt(){
		return this.in_cmpy_dt;
	}

	public String getLvcmpy_dt(){
		return this.lvcmpy_dt;
	}

	public String getFrdt(){
		return this.frdt;
	}

	public String getStop_dt(){
		return this.stop_dt;
	}

	public String getCont_svc_yys(){
		return this.cont_svc_yys;
	}

	public String getRest_vaca_yys_clsf(){
		return this.rest_vaca_yys_clsf;
	}

	public String getBase_pont(){
		return this.base_pont;
	}

	public String getFaml_pont(){
		return this.faml_pont;
	}

	public String getCont_svc_pont(){
		return this.cont_svc_pont;
	}

	public String getRest_pont(){
		return this.rest_pont;
	}

	public String getDty_taem_chf_un_norm(){
		return this.dty_taem_chf_un_norm;
	}

	public String getDty_comite_memb(){
		return this.dty_comite_memb;
	}

	public String getPont_tot(){
		return this.pont_tot;
	}

	public String getUse_pont(){
		return this.use_pont;
	}

	public String getRsrt_amt(){
		return this.rsrt_amt;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getAply_yy(){
		return this.aply_yy;
	}

	public String getU_ipadd(){
		return this.u_ipadd;
	}

	public String getU_id(){
		return this.u_id;
	}

	public String getMode(){
		return this.mode;
	}

	public String getSQL(){
		 return "{ call MISHDL.SP_HD_AFFR_4101_A(? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		HD_AFFR_4101_ADM dm = (HD_AFFR_4101_ADM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.in_cmpy_cd);
		cstmt.setString(4, dm.in_aply_yy);
		cstmt.setString(5, dm.act_flag);
		cstmt.setString(6, dm.dept_cd);
		cstmt.setString(7, dm.emp_no);
		cstmt.setString(8, dm.in_cmpy_dt);
		cstmt.setString(9, dm.lvcmpy_dt);
		cstmt.setString(10, dm.frdt);
		cstmt.setString(11, dm.stop_dt);
		cstmt.setString(12, dm.cont_svc_yys);
		cstmt.setString(13, dm.rest_vaca_yys_clsf);
		cstmt.setString(14, dm.base_pont);
		cstmt.setString(15, dm.faml_pont);
		cstmt.setString(16, dm.cont_svc_pont);
		cstmt.setString(17, dm.rest_pont);
		cstmt.setString(18, dm.dty_taem_chf_un_norm);
		cstmt.setString(19, dm.dty_comite_memb);
		cstmt.setString(20, dm.pont_tot);
		cstmt.setString(21, dm.use_pont);
		cstmt.setString(22, dm.rsrt_amt);
		cstmt.setString(23, dm.cmpy_cd);
		cstmt.setString(24, dm.aply_yy);
		cstmt.setString(25, dm.u_ipadd);
		cstmt.setString(26, dm.u_id);
		cstmt.setString(27, dm.mode);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.hd.affr.ds.HD_AFFR_4101_ADataSet();
	}



    public void print(){
        System.out.println("in_cmpy_cd = " + getIn_cmpy_cd());
        System.out.println("in_aply_yy = " + getIn_aply_yy());
        System.out.println("act_flag = " + getAct_flag());
        System.out.println("dept_cd = " + getDept_cd());
        System.out.println("emp_no = " + getEmp_no());
        System.out.println("in_cmpy_dt = " + getIn_cmpy_dt());
        System.out.println("lvcmpy_dt = " + getLvcmpy_dt());
        System.out.println("frdt = " + getFrdt());
        System.out.println("stop_dt = " + getStop_dt());
        System.out.println("cont_svc_yys = " + getCont_svc_yys());
        System.out.println("rest_vaca_yys_clsf = " + getRest_vaca_yys_clsf());
        System.out.println("base_pont = " + getBase_pont());
        System.out.println("faml_pont = " + getFaml_pont());
        System.out.println("cont_svc_pont = " + getCont_svc_pont());
        System.out.println("rest_pont = " + getRest_pont());
        System.out.println("dty_taem_chf_un_norm = " + getDty_taem_chf_un_norm());
        System.out.println("dty_comite_memb = " + getDty_comite_memb());
        System.out.println("pont_tot = " + getPont_tot());
        System.out.println("use_pont = " + getUse_pont());
        System.out.println("rsrt_amt = " + getRsrt_amt());
        System.out.println("cmpy_cd = " + getCmpy_cd());
        System.out.println("aply_yy = " + getAply_yy());
        System.out.println("u_ipadd = " + getU_ipadd());
        System.out.println("u_id = " + getU_id());
        System.out.println("mode = " + getMode());
    }
}
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리 및 결과확인 검사시 사용하십시오.

String in_cmpy_cd = req.getParameter("in_cmpy_cd");
if( in_cmpy_cd == null){
	System.out.println(this.toString+" : in_cmpy_cd is null" );
}else{
	System.out.println(this.toString+" : in_cmpy_cd is "+in_cmpy_cd );
}
String in_aply_yy = req.getParameter("in_aply_yy");
if( in_aply_yy == null){
	System.out.println(this.toString+" : in_aply_yy is null" );
}else{
	System.out.println(this.toString+" : in_aply_yy is "+in_aply_yy );
}
String act_flag = req.getParameter("act_flag");
if( act_flag == null){
	System.out.println(this.toString+" : act_flag is null" );
}else{
	System.out.println(this.toString+" : act_flag is "+act_flag );
}
String dept_cd = req.getParameter("dept_cd");
if( dept_cd == null){
	System.out.println(this.toString+" : dept_cd is null" );
}else{
	System.out.println(this.toString+" : dept_cd is "+dept_cd );
}
String emp_no = req.getParameter("emp_no");
if( emp_no == null){
	System.out.println(this.toString+" : emp_no is null" );
}else{
	System.out.println(this.toString+" : emp_no is "+emp_no );
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
String frdt = req.getParameter("frdt");
if( frdt == null){
	System.out.println(this.toString+" : frdt is null" );
}else{
	System.out.println(this.toString+" : frdt is "+frdt );
}
String stop_dt = req.getParameter("stop_dt");
if( stop_dt == null){
	System.out.println(this.toString+" : stop_dt is null" );
}else{
	System.out.println(this.toString+" : stop_dt is "+stop_dt );
}
String cont_svc_yys = req.getParameter("cont_svc_yys");
if( cont_svc_yys == null){
	System.out.println(this.toString+" : cont_svc_yys is null" );
}else{
	System.out.println(this.toString+" : cont_svc_yys is "+cont_svc_yys );
}
String rest_vaca_yys_clsf = req.getParameter("rest_vaca_yys_clsf");
if( rest_vaca_yys_clsf == null){
	System.out.println(this.toString+" : rest_vaca_yys_clsf is null" );
}else{
	System.out.println(this.toString+" : rest_vaca_yys_clsf is "+rest_vaca_yys_clsf );
}
String base_pont = req.getParameter("base_pont");
if( base_pont == null){
	System.out.println(this.toString+" : base_pont is null" );
}else{
	System.out.println(this.toString+" : base_pont is "+base_pont );
}
String faml_pont = req.getParameter("faml_pont");
if( faml_pont == null){
	System.out.println(this.toString+" : faml_pont is null" );
}else{
	System.out.println(this.toString+" : faml_pont is "+faml_pont );
}
String cont_svc_pont = req.getParameter("cont_svc_pont");
if( cont_svc_pont == null){
	System.out.println(this.toString+" : cont_svc_pont is null" );
}else{
	System.out.println(this.toString+" : cont_svc_pont is "+cont_svc_pont );
}
String rest_pont = req.getParameter("rest_pont");
if( rest_pont == null){
	System.out.println(this.toString+" : rest_pont is null" );
}else{
	System.out.println(this.toString+" : rest_pont is "+rest_pont );
}
String dty_taem_chf_un_norm = req.getParameter("dty_taem_chf_un_norm");
if( dty_taem_chf_un_norm == null){
	System.out.println(this.toString+" : dty_taem_chf_un_norm is null" );
}else{
	System.out.println(this.toString+" : dty_taem_chf_un_norm is "+dty_taem_chf_un_norm );
}
String dty_comite_memb = req.getParameter("dty_comite_memb");
if( dty_comite_memb == null){
	System.out.println(this.toString+" : dty_comite_memb is null" );
}else{
	System.out.println(this.toString+" : dty_comite_memb is "+dty_comite_memb );
}
String pont_tot = req.getParameter("pont_tot");
if( pont_tot == null){
	System.out.println(this.toString+" : pont_tot is null" );
}else{
	System.out.println(this.toString+" : pont_tot is "+pont_tot );
}
String use_pont = req.getParameter("use_pont");
if( use_pont == null){
	System.out.println(this.toString+" : use_pont is null" );
}else{
	System.out.println(this.toString+" : use_pont is "+use_pont );
}
String rsrt_amt = req.getParameter("rsrt_amt");
if( rsrt_amt == null){
	System.out.println(this.toString+" : rsrt_amt is null" );
}else{
	System.out.println(this.toString+" : rsrt_amt is "+rsrt_amt );
}
String cmpy_cd = req.getParameter("cmpy_cd");
if( cmpy_cd == null){
	System.out.println(this.toString+" : cmpy_cd is null" );
}else{
	System.out.println(this.toString+" : cmpy_cd is "+cmpy_cd );
}
String aply_yy = req.getParameter("aply_yy");
if( aply_yy == null){
	System.out.println(this.toString+" : aply_yy is null" );
}else{
	System.out.println(this.toString+" : aply_yy is "+aply_yy );
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
String mode = req.getParameter("mode");
if( mode == null){
	System.out.println(this.toString+" : mode is null" );
}else{
	System.out.println(this.toString+" : mode is "+mode );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리시 사용하십시오.

String in_cmpy_cd = Util.checkString(req.getParameter("in_cmpy_cd"));
String in_aply_yy = Util.checkString(req.getParameter("in_aply_yy"));
String act_flag = Util.checkString(req.getParameter("act_flag"));
String dept_cd = Util.checkString(req.getParameter("dept_cd"));
String emp_no = Util.checkString(req.getParameter("emp_no"));
String in_cmpy_dt = Util.checkString(req.getParameter("in_cmpy_dt"));
String lvcmpy_dt = Util.checkString(req.getParameter("lvcmpy_dt"));
String frdt = Util.checkString(req.getParameter("frdt"));
String stop_dt = Util.checkString(req.getParameter("stop_dt"));
String cont_svc_yys = Util.checkString(req.getParameter("cont_svc_yys"));
String rest_vaca_yys_clsf = Util.checkString(req.getParameter("rest_vaca_yys_clsf"));
String base_pont = Util.checkString(req.getParameter("base_pont"));
String faml_pont = Util.checkString(req.getParameter("faml_pont"));
String cont_svc_pont = Util.checkString(req.getParameter("cont_svc_pont"));
String rest_pont = Util.checkString(req.getParameter("rest_pont"));
String dty_taem_chf_un_norm = Util.checkString(req.getParameter("dty_taem_chf_un_norm"));
String dty_comite_memb = Util.checkString(req.getParameter("dty_comite_memb"));
String pont_tot = Util.checkString(req.getParameter("pont_tot"));
String use_pont = Util.checkString(req.getParameter("use_pont"));
String rsrt_amt = Util.checkString(req.getParameter("rsrt_amt"));
String cmpy_cd = Util.checkString(req.getParameter("cmpy_cd"));
String aply_yy = Util.checkString(req.getParameter("aply_yy"));
String u_ipadd = Util.checkString(req.getParameter("u_ipadd"));
String u_id = Util.checkString(req.getParameter("u_id"));
String mode = Util.checkString(req.getParameter("mode"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String in_cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("in_cmpy_cd")));
String in_aply_yy = Util.Uni2Ksc(Util.checkString(req.getParameter("in_aply_yy")));
String act_flag = Util.Uni2Ksc(Util.checkString(req.getParameter("act_flag")));
String dept_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("dept_cd")));
String emp_no = Util.Uni2Ksc(Util.checkString(req.getParameter("emp_no")));
String in_cmpy_dt = Util.Uni2Ksc(Util.checkString(req.getParameter("in_cmpy_dt")));
String lvcmpy_dt = Util.Uni2Ksc(Util.checkString(req.getParameter("lvcmpy_dt")));
String frdt = Util.Uni2Ksc(Util.checkString(req.getParameter("frdt")));
String stop_dt = Util.Uni2Ksc(Util.checkString(req.getParameter("stop_dt")));
String cont_svc_yys = Util.Uni2Ksc(Util.checkString(req.getParameter("cont_svc_yys")));
String rest_vaca_yys_clsf = Util.Uni2Ksc(Util.checkString(req.getParameter("rest_vaca_yys_clsf")));
String base_pont = Util.Uni2Ksc(Util.checkString(req.getParameter("base_pont")));
String faml_pont = Util.Uni2Ksc(Util.checkString(req.getParameter("faml_pont")));
String cont_svc_pont = Util.Uni2Ksc(Util.checkString(req.getParameter("cont_svc_pont")));
String rest_pont = Util.Uni2Ksc(Util.checkString(req.getParameter("rest_pont")));
String dty_taem_chf_un_norm = Util.Uni2Ksc(Util.checkString(req.getParameter("dty_taem_chf_un_norm")));
String dty_comite_memb = Util.Uni2Ksc(Util.checkString(req.getParameter("dty_comite_memb")));
String pont_tot = Util.Uni2Ksc(Util.checkString(req.getParameter("pont_tot")));
String use_pont = Util.Uni2Ksc(Util.checkString(req.getParameter("use_pont")));
String rsrt_amt = Util.Uni2Ksc(Util.checkString(req.getParameter("rsrt_amt")));
String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String aply_yy = Util.Uni2Ksc(Util.checkString(req.getParameter("aply_yy")));
String u_ipadd = Util.Uni2Ksc(Util.checkString(req.getParameter("u_ipadd")));
String u_id = Util.Uni2Ksc(Util.checkString(req.getParameter("u_id")));
String mode = Util.Uni2Ksc(Util.checkString(req.getParameter("mode")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setIn_cmpy_cd(in_cmpy_cd);
dm.setIn_aply_yy(in_aply_yy);
dm.setAct_flag(act_flag);
dm.setDept_cd(dept_cd);
dm.setEmp_no(emp_no);
dm.setIn_cmpy_dt(in_cmpy_dt);
dm.setLvcmpy_dt(lvcmpy_dt);
dm.setFrdt(frdt);
dm.setStop_dt(stop_dt);
dm.setCont_svc_yys(cont_svc_yys);
dm.setRest_vaca_yys_clsf(rest_vaca_yys_clsf);
dm.setBase_pont(base_pont);
dm.setFaml_pont(faml_pont);
dm.setCont_svc_pont(cont_svc_pont);
dm.setRest_pont(rest_pont);
dm.setDty_taem_chf_un_norm(dty_taem_chf_un_norm);
dm.setDty_comite_memb(dty_comite_memb);
dm.setPont_tot(pont_tot);
dm.setUse_pont(use_pont);
dm.setRsrt_amt(rsrt_amt);
dm.setCmpy_cd(cmpy_cd);
dm.setAply_yy(aply_yy);
dm.setU_ipadd(u_ipadd);
dm.setU_id(u_id);
dm.setMode(mode);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Fri Jul 10 14:52:09 KST 2009 */