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


public class HD_SALY_1301_ADM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String cmpy_cd;
	public String mode;
	public String saly_yy;
	public String saly_no;
	public String emp_no;
	public String flnm;
	public String dept_cd;
	public String dty_cd;
	public String posi_cd;
	public String base_saly;
	public String posk_saly;
	public String real_pay_rgla_saly;
	public String prvmm_mstk_saly;
	public String excp_resn;
	public String incmg_pers_ipadd;
	public String incmg_pers;
	public String food_alon;
	public String care_alon;
	public String dty_alon;
	public String posk_alon;
	public String jrnst;
	public String auto_driv_alon;
	public String evngt_saly;

	public HD_SALY_1301_ADM(){}
	public HD_SALY_1301_ADM(String cmpy_cd, String mode, String saly_yy, String saly_no, String emp_no, String flnm, String dept_cd, String dty_cd, String posi_cd, String base_saly, String posk_saly, String real_pay_rgla_saly, String prvmm_mstk_saly, String excp_resn, String incmg_pers_ipadd, String incmg_pers, String food_alon, String care_alon, String dty_alon, String posk_alon, String jrnst, String auto_driv_alon, String evngt_saly){
		this.cmpy_cd = cmpy_cd;
		this.mode = mode;
		this.saly_yy = saly_yy;
		this.saly_no = saly_no;
		this.emp_no = emp_no;
		this.flnm = flnm;
		this.dept_cd = dept_cd;
		this.dty_cd = dty_cd;
		this.posi_cd = posi_cd;
		this.base_saly = base_saly;
		this.posk_saly = posk_saly;
		this.real_pay_rgla_saly = real_pay_rgla_saly;
		this.prvmm_mstk_saly = prvmm_mstk_saly;
		this.excp_resn = excp_resn;
		this.incmg_pers_ipadd = incmg_pers_ipadd;
		this.incmg_pers = incmg_pers;
		this.food_alon = food_alon;
		this.care_alon = care_alon;
		this.dty_alon = dty_alon;
		this.posk_alon = posk_alon;
		this.jrnst = jrnst;
		this.auto_driv_alon = auto_driv_alon;
		this.evngt_saly = evngt_saly;
	}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setMode(String mode){
		this.mode = mode;
	}

	public void setSaly_yy(String saly_yy){
		this.saly_yy = saly_yy;
	}

	public void setSaly_no(String saly_no){
		this.saly_no = saly_no;
	}

	public void setEmp_no(String emp_no){
		this.emp_no = emp_no;
	}

	public void setFlnm(String flnm){
		this.flnm = flnm;
	}

	public void setDept_cd(String dept_cd){
		this.dept_cd = dept_cd;
	}

	public void setDty_cd(String dty_cd){
		this.dty_cd = dty_cd;
	}

	public void setPosi_cd(String posi_cd){
		this.posi_cd = posi_cd;
	}

	public void setBase_saly(String base_saly){
		this.base_saly = base_saly;
	}

	public void setPosk_saly(String posk_saly){
		this.posk_saly = posk_saly;
	}

	public void setReal_pay_rgla_saly(String real_pay_rgla_saly){
		this.real_pay_rgla_saly = real_pay_rgla_saly;
	}

	public void setPrvmm_mstk_saly(String prvmm_mstk_saly){
		this.prvmm_mstk_saly = prvmm_mstk_saly;
	}

	public void setExcp_resn(String excp_resn){
		this.excp_resn = excp_resn;
	}

	public void setIncmg_pers_ipadd(String incmg_pers_ipadd){
		this.incmg_pers_ipadd = incmg_pers_ipadd;
	}

	public void setIncmg_pers(String incmg_pers){
		this.incmg_pers = incmg_pers;
	}

	public void setFood_alon(String food_alon){
		this.food_alon = food_alon;
	}

	public void setCare_alon(String care_alon){
		this.care_alon = care_alon;
	}

	public void setDty_alon(String dty_alon){
		this.dty_alon = dty_alon;
	}

	public void setPosk_alon(String posk_alon){
		this.posk_alon = posk_alon;
	}

	public void setJrnst(String jrnst){
		this.jrnst = jrnst;
	}

	public void setAuto_driv_alon(String auto_driv_alon){
		this.auto_driv_alon = auto_driv_alon;
	}

	public void setEvngt_saly(String evngt_saly){
		this.evngt_saly = evngt_saly;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getMode(){
		return this.mode;
	}

	public String getSaly_yy(){
		return this.saly_yy;
	}

	public String getSaly_no(){
		return this.saly_no;
	}

	public String getEmp_no(){
		return this.emp_no;
	}

	public String getFlnm(){
		return this.flnm;
	}

	public String getDept_cd(){
		return this.dept_cd;
	}

	public String getDty_cd(){
		return this.dty_cd;
	}

	public String getPosi_cd(){
		return this.posi_cd;
	}

	public String getBase_saly(){
		return this.base_saly;
	}

	public String getPosk_saly(){
		return this.posk_saly;
	}

	public String getReal_pay_rgla_saly(){
		return this.real_pay_rgla_saly;
	}

	public String getPrvmm_mstk_saly(){
		return this.prvmm_mstk_saly;
	}

	public String getExcp_resn(){
		return this.excp_resn;
	}

	public String getIncmg_pers_ipadd(){
		return this.incmg_pers_ipadd;
	}

	public String getIncmg_pers(){
		return this.incmg_pers;
	}

	public String getFood_alon(){
		return this.food_alon;
	}

	public String getCare_alon(){
		return this.care_alon;
	}

	public String getDty_alon(){
		return this.dty_alon;
	}

	public String getPosk_alon(){
		return this.posk_alon;
	}

	public String getJrnst(){
		return this.jrnst;
	}

	public String getAuto_driv_alon(){
		return this.auto_driv_alon;
	}

	public String getEvngt_saly(){
		return this.evngt_saly;
	}

	public String getSQL(){
		 return "{ call MISHDL.SP_HD_SALY_1301_A(? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		HD_SALY_1301_ADM dm = (HD_SALY_1301_ADM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.cmpy_cd);
		cstmt.setString(4, dm.mode);
		cstmt.setString(5, dm.saly_yy);
		cstmt.setString(6, dm.saly_no);
		cstmt.setString(7, dm.emp_no);
		cstmt.setString(8, dm.flnm);
		cstmt.setString(9, dm.dept_cd);
		cstmt.setString(10, dm.dty_cd);
		cstmt.setString(11, dm.posi_cd);
		cstmt.setString(12, dm.base_saly);
		cstmt.setString(13, dm.posk_saly);
		cstmt.setString(14, dm.real_pay_rgla_saly);
		cstmt.setString(15, dm.prvmm_mstk_saly);
		cstmt.setString(16, dm.excp_resn);
		cstmt.setString(17, dm.incmg_pers_ipadd);
		cstmt.setString(18, dm.incmg_pers);
		cstmt.setString(19, dm.food_alon);
		cstmt.setString(20, dm.care_alon);
		cstmt.setString(21, dm.dty_alon);
		cstmt.setString(22, dm.posk_alon);
		cstmt.setString(23, dm.jrnst);
		cstmt.setString(24, dm.auto_driv_alon);
		cstmt.setString(25, dm.evngt_saly);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.hd.saly.ds.HD_SALY_1301_ADataSet();
	}



	public void print(){
		System.out.println("SQL = " + this.getSQL());
		System.out.println("cmpy_cd = [" + getCmpy_cd() + "]");
		System.out.println("mode = [" + getMode() + "]");
		System.out.println("saly_yy = [" + getSaly_yy() + "]");
		System.out.println("saly_no = [" + getSaly_no() + "]");
		System.out.println("emp_no = [" + getEmp_no() + "]");
		System.out.println("flnm = [" + getFlnm() + "]");
		System.out.println("dept_cd = [" + getDept_cd() + "]");
		System.out.println("dty_cd = [" + getDty_cd() + "]");
		System.out.println("posi_cd = [" + getPosi_cd() + "]");
		System.out.println("base_saly = [" + getBase_saly() + "]");
		System.out.println("posk_saly = [" + getPosk_saly() + "]");
		System.out.println("real_pay_rgla_saly = [" + getReal_pay_rgla_saly() + "]");
		System.out.println("prvmm_mstk_saly = [" + getPrvmm_mstk_saly() + "]");
		System.out.println("excp_resn = [" + getExcp_resn() + "]");
		System.out.println("incmg_pers_ipadd = [" + getIncmg_pers_ipadd() + "]");
		System.out.println("incmg_pers = [" + getIncmg_pers() + "]");
		System.out.println("food_alon = [" + getFood_alon() + "]");
		System.out.println("care_alon = [" + getCare_alon() + "]");
		System.out.println("dty_alon = [" + getDty_alon() + "]");
		System.out.println("posk_alon = [" + getPosk_alon() + "]");
		System.out.println("jrnst = [" + getJrnst() + "]");
		System.out.println("auto_driv_alon = [" + getAuto_driv_alon() + "]");
		System.out.println("evngt_saly = [" + getEvngt_saly() + "]");
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
String mode = req.getParameter("mode");
if( mode == null){
	System.out.println(this.toString+" : mode is null" );
}else{
	System.out.println(this.toString+" : mode is "+mode );
}
String saly_yy = req.getParameter("saly_yy");
if( saly_yy == null){
	System.out.println(this.toString+" : saly_yy is null" );
}else{
	System.out.println(this.toString+" : saly_yy is "+saly_yy );
}
String saly_no = req.getParameter("saly_no");
if( saly_no == null){
	System.out.println(this.toString+" : saly_no is null" );
}else{
	System.out.println(this.toString+" : saly_no is "+saly_no );
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
String dept_cd = req.getParameter("dept_cd");
if( dept_cd == null){
	System.out.println(this.toString+" : dept_cd is null" );
}else{
	System.out.println(this.toString+" : dept_cd is "+dept_cd );
}
String dty_cd = req.getParameter("dty_cd");
if( dty_cd == null){
	System.out.println(this.toString+" : dty_cd is null" );
}else{
	System.out.println(this.toString+" : dty_cd is "+dty_cd );
}
String posi_cd = req.getParameter("posi_cd");
if( posi_cd == null){
	System.out.println(this.toString+" : posi_cd is null" );
}else{
	System.out.println(this.toString+" : posi_cd is "+posi_cd );
}
String base_saly = req.getParameter("base_saly");
if( base_saly == null){
	System.out.println(this.toString+" : base_saly is null" );
}else{
	System.out.println(this.toString+" : base_saly is "+base_saly );
}
String posk_saly = req.getParameter("posk_saly");
if( posk_saly == null){
	System.out.println(this.toString+" : posk_saly is null" );
}else{
	System.out.println(this.toString+" : posk_saly is "+posk_saly );
}
String real_pay_rgla_saly = req.getParameter("real_pay_rgla_saly");
if( real_pay_rgla_saly == null){
	System.out.println(this.toString+" : real_pay_rgla_saly is null" );
}else{
	System.out.println(this.toString+" : real_pay_rgla_saly is "+real_pay_rgla_saly );
}
String prvmm_mstk_saly = req.getParameter("prvmm_mstk_saly");
if( prvmm_mstk_saly == null){
	System.out.println(this.toString+" : prvmm_mstk_saly is null" );
}else{
	System.out.println(this.toString+" : prvmm_mstk_saly is "+prvmm_mstk_saly );
}
String excp_resn = req.getParameter("excp_resn");
if( excp_resn == null){
	System.out.println(this.toString+" : excp_resn is null" );
}else{
	System.out.println(this.toString+" : excp_resn is "+excp_resn );
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
String food_alon = req.getParameter("food_alon");
if( food_alon == null){
	System.out.println(this.toString+" : food_alon is null" );
}else{
	System.out.println(this.toString+" : food_alon is "+food_alon );
}
String care_alon = req.getParameter("care_alon");
if( care_alon == null){
	System.out.println(this.toString+" : care_alon is null" );
}else{
	System.out.println(this.toString+" : care_alon is "+care_alon );
}
String dty_alon = req.getParameter("dty_alon");
if( dty_alon == null){
	System.out.println(this.toString+" : dty_alon is null" );
}else{
	System.out.println(this.toString+" : dty_alon is "+dty_alon );
}
String posk_alon = req.getParameter("posk_alon");
if( posk_alon == null){
	System.out.println(this.toString+" : posk_alon is null" );
}else{
	System.out.println(this.toString+" : posk_alon is "+posk_alon );
}
String jrnst = req.getParameter("jrnst");
if( jrnst == null){
	System.out.println(this.toString+" : jrnst is null" );
}else{
	System.out.println(this.toString+" : jrnst is "+jrnst );
}
String auto_driv_alon = req.getParameter("auto_driv_alon");
if( auto_driv_alon == null){
	System.out.println(this.toString+" : auto_driv_alon is null" );
}else{
	System.out.println(this.toString+" : auto_driv_alon is "+auto_driv_alon );
}
String evngt_saly = req.getParameter("evngt_saly");
if( evngt_saly == null){
	System.out.println(this.toString+" : evngt_saly is null" );
}else{
	System.out.println(this.toString+" : evngt_saly is "+evngt_saly );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.checkString(req.getParameter("cmpy_cd"));
String mode = Util.checkString(req.getParameter("mode"));
String saly_yy = Util.checkString(req.getParameter("saly_yy"));
String saly_no = Util.checkString(req.getParameter("saly_no"));
String emp_no = Util.checkString(req.getParameter("emp_no"));
String flnm = Util.checkString(req.getParameter("flnm"));
String dept_cd = Util.checkString(req.getParameter("dept_cd"));
String dty_cd = Util.checkString(req.getParameter("dty_cd"));
String posi_cd = Util.checkString(req.getParameter("posi_cd"));
String base_saly = Util.checkString(req.getParameter("base_saly"));
String posk_saly = Util.checkString(req.getParameter("posk_saly"));
String real_pay_rgla_saly = Util.checkString(req.getParameter("real_pay_rgla_saly"));
String prvmm_mstk_saly = Util.checkString(req.getParameter("prvmm_mstk_saly"));
String excp_resn = Util.checkString(req.getParameter("excp_resn"));
String incmg_pers_ipadd = Util.checkString(req.getParameter("incmg_pers_ipadd"));
String incmg_pers = Util.checkString(req.getParameter("incmg_pers"));
String food_alon = Util.checkString(req.getParameter("food_alon"));
String care_alon = Util.checkString(req.getParameter("care_alon"));
String dty_alon = Util.checkString(req.getParameter("dty_alon"));
String posk_alon = Util.checkString(req.getParameter("posk_alon"));
String jrnst = Util.checkString(req.getParameter("jrnst"));
String auto_driv_alon = Util.checkString(req.getParameter("auto_driv_alon"));
String evngt_saly = Util.checkString(req.getParameter("evngt_saly"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String mode = Util.Uni2Ksc(Util.checkString(req.getParameter("mode")));
String saly_yy = Util.Uni2Ksc(Util.checkString(req.getParameter("saly_yy")));
String saly_no = Util.Uni2Ksc(Util.checkString(req.getParameter("saly_no")));
String emp_no = Util.Uni2Ksc(Util.checkString(req.getParameter("emp_no")));
String flnm = Util.Uni2Ksc(Util.checkString(req.getParameter("flnm")));
String dept_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("dept_cd")));
String dty_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("dty_cd")));
String posi_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("posi_cd")));
String base_saly = Util.Uni2Ksc(Util.checkString(req.getParameter("base_saly")));
String posk_saly = Util.Uni2Ksc(Util.checkString(req.getParameter("posk_saly")));
String real_pay_rgla_saly = Util.Uni2Ksc(Util.checkString(req.getParameter("real_pay_rgla_saly")));
String prvmm_mstk_saly = Util.Uni2Ksc(Util.checkString(req.getParameter("prvmm_mstk_saly")));
String excp_resn = Util.Uni2Ksc(Util.checkString(req.getParameter("excp_resn")));
String incmg_pers_ipadd = Util.Uni2Ksc(Util.checkString(req.getParameter("incmg_pers_ipadd")));
String incmg_pers = Util.Uni2Ksc(Util.checkString(req.getParameter("incmg_pers")));
String food_alon = Util.Uni2Ksc(Util.checkString(req.getParameter("food_alon")));
String care_alon = Util.Uni2Ksc(Util.checkString(req.getParameter("care_alon")));
String dty_alon = Util.Uni2Ksc(Util.checkString(req.getParameter("dty_alon")));
String posk_alon = Util.Uni2Ksc(Util.checkString(req.getParameter("posk_alon")));
String jrnst = Util.Uni2Ksc(Util.checkString(req.getParameter("jrnst")));
String auto_driv_alon = Util.Uni2Ksc(Util.checkString(req.getParameter("auto_driv_alon")));
String evngt_saly = Util.Uni2Ksc(Util.checkString(req.getParameter("evngt_saly")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setCmpy_cd(cmpy_cd);
dm.setMode(mode);
dm.setSaly_yy(saly_yy);
dm.setSaly_no(saly_no);
dm.setEmp_no(emp_no);
dm.setFlnm(flnm);
dm.setDept_cd(dept_cd);
dm.setDty_cd(dty_cd);
dm.setPosi_cd(posi_cd);
dm.setBase_saly(base_saly);
dm.setPosk_saly(posk_saly);
dm.setReal_pay_rgla_saly(real_pay_rgla_saly);
dm.setPrvmm_mstk_saly(prvmm_mstk_saly);
dm.setExcp_resn(excp_resn);
dm.setIncmg_pers_ipadd(incmg_pers_ipadd);
dm.setIncmg_pers(incmg_pers);
dm.setFood_alon(food_alon);
dm.setCare_alon(care_alon);
dm.setDty_alon(dty_alon);
dm.setPosk_alon(posk_alon);
dm.setJrnst(jrnst);
dm.setAuto_driv_alon(auto_driv_alon);
dm.setEvngt_saly(evngt_saly);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Wed Jun 18 14:11:40 KST 2014 */