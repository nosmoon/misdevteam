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


package chosun.ciis.hd.appmt.dm;

import java.sql.*;
import oracle.jdbc.driver.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.hd.appmt.ds.*;
import chosun.ciis.hd.appmt.rec.*;

/**
 * 
 */


public class HD_APPMT_1102_UDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String save;
	public String mode;
	public String cmpy_cd;
	public String emp_no;
	public String flnm;
	public String base_saly;
	public String posk_saly;
	public String dty_alon;
	public String posk_alon;
	public String care_alon;
	public String food_alon;
	public String tax_jrnst;
	public String auto_driv_alon;
	public String evngt_saly;
	public String saly_stot;
	public String appmt_cd;
	public String appmt_dt;
	public String seq;
	public String occr_dt;
	public String incmg_pers;

	public HD_APPMT_1102_UDM(){}
	public HD_APPMT_1102_UDM(String save, String mode, String cmpy_cd, String emp_no, String flnm, String base_saly, String posk_saly, String dty_alon, String posk_alon, String care_alon, String food_alon, String tax_jrnst, String auto_driv_alon, String evngt_saly, String saly_stot, String appmt_cd, String appmt_dt, String seq, String occr_dt, String incmg_pers){
		this.save = save;
		this.mode = mode;
		this.cmpy_cd = cmpy_cd;
		this.emp_no = emp_no;
		this.flnm = flnm;
		this.base_saly = base_saly;
		this.posk_saly = posk_saly;
		this.dty_alon = dty_alon;
		this.posk_alon = posk_alon;
		this.care_alon = care_alon;
		this.food_alon = food_alon;
		this.tax_jrnst = tax_jrnst;
		this.auto_driv_alon = auto_driv_alon;
		this.evngt_saly = evngt_saly;
		this.saly_stot = saly_stot;
		this.appmt_cd = appmt_cd;
		this.appmt_dt = appmt_dt;
		this.seq = seq;
		this.occr_dt = occr_dt;
		this.incmg_pers = incmg_pers;
	}

	public void setSave(String save){
		this.save = save;
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

	public void setFlnm(String flnm){
		this.flnm = flnm;
	}

	public void setBase_saly(String base_saly){
		this.base_saly = base_saly;
	}

	public void setPosk_saly(String posk_saly){
		this.posk_saly = posk_saly;
	}

	public void setDty_alon(String dty_alon){
		this.dty_alon = dty_alon;
	}

	public void setPosk_alon(String posk_alon){
		this.posk_alon = posk_alon;
	}

	public void setCare_alon(String care_alon){
		this.care_alon = care_alon;
	}

	public void setFood_alon(String food_alon){
		this.food_alon = food_alon;
	}

	public void setTax_jrnst(String tax_jrnst){
		this.tax_jrnst = tax_jrnst;
	}

	public void setAuto_driv_alon(String auto_driv_alon){
		this.auto_driv_alon = auto_driv_alon;
	}

	public void setEvngt_saly(String evngt_saly){
		this.evngt_saly = evngt_saly;
	}

	public void setSaly_stot(String saly_stot){
		this.saly_stot = saly_stot;
	}

	public void setAppmt_cd(String appmt_cd){
		this.appmt_cd = appmt_cd;
	}

	public void setAppmt_dt(String appmt_dt){
		this.appmt_dt = appmt_dt;
	}

	public void setSeq(String seq){
		this.seq = seq;
	}

	public void setOccr_dt(String occr_dt){
		this.occr_dt = occr_dt;
	}

	public void setIncmg_pers(String incmg_pers){
		this.incmg_pers = incmg_pers;
	}

	public String getSave(){
		return this.save;
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

	public String getFlnm(){
		return this.flnm;
	}

	public String getBase_saly(){
		return this.base_saly;
	}

	public String getPosk_saly(){
		return this.posk_saly;
	}

	public String getDty_alon(){
		return this.dty_alon;
	}

	public String getPosk_alon(){
		return this.posk_alon;
	}

	public String getCare_alon(){
		return this.care_alon;
	}

	public String getFood_alon(){
		return this.food_alon;
	}

	public String getTax_jrnst(){
		return this.tax_jrnst;
	}

	public String getAuto_driv_alon(){
		return this.auto_driv_alon;
	}

	public String getEvngt_saly(){
		return this.evngt_saly;
	}

	public String getSaly_stot(){
		return this.saly_stot;
	}

	public String getAppmt_cd(){
		return this.appmt_cd;
	}

	public String getAppmt_dt(){
		return this.appmt_dt;
	}

	public String getSeq(){
		return this.seq;
	}

	public String getOccr_dt(){
		return this.occr_dt;
	}

	public String getIncmg_pers(){
		return this.incmg_pers;
	}

	public String getSQL(){
		 return "{ call MISHDL.SP_HD_APPMT_1102_U(? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		HD_APPMT_1102_UDM dm = (HD_APPMT_1102_UDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.save);
		cstmt.setString(4, dm.mode);
		cstmt.setString(5, dm.cmpy_cd);
		cstmt.setString(6, dm.emp_no);
		cstmt.setString(7, dm.flnm);
		cstmt.setString(8, dm.base_saly);
		cstmt.setString(9, dm.posk_saly);
		cstmt.setString(10, dm.dty_alon);
		cstmt.setString(11, dm.posk_alon);
		cstmt.setString(12, dm.care_alon);
		cstmt.setString(13, dm.food_alon);
		cstmt.setString(14, dm.tax_jrnst);
		cstmt.setString(15, dm.auto_driv_alon);
		cstmt.setString(16, dm.evngt_saly);
		cstmt.setString(17, dm.saly_stot);
		cstmt.setString(18, dm.appmt_cd);
		cstmt.setString(19, dm.appmt_dt);
		cstmt.setString(20, dm.seq);
		cstmt.setString(21, dm.occr_dt);
		cstmt.setString(22, dm.incmg_pers);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.hd.appmt.ds.HD_APPMT_1102_UDataSet();
	}



	public void print(){
		System.out.println("SQL = " + this.getSQL());
		System.out.println("save = [" + getSave() + "]");
		System.out.println("mode = [" + getMode() + "]");
		System.out.println("cmpy_cd = [" + getCmpy_cd() + "]");
		System.out.println("emp_no = [" + getEmp_no() + "]");
		System.out.println("flnm = [" + getFlnm() + "]");
		System.out.println("base_saly = [" + getBase_saly() + "]");
		System.out.println("posk_saly = [" + getPosk_saly() + "]");
		System.out.println("dty_alon = [" + getDty_alon() + "]");
		System.out.println("posk_alon = [" + getPosk_alon() + "]");
		System.out.println("care_alon = [" + getCare_alon() + "]");
		System.out.println("food_alon = [" + getFood_alon() + "]");
		System.out.println("tax_jrnst = [" + getTax_jrnst() + "]");
		System.out.println("auto_driv_alon = [" + getAuto_driv_alon() + "]");
		System.out.println("evngt_saly = [" + getEvngt_saly() + "]");
		System.out.println("saly_stot = [" + getSaly_stot() + "]");
		System.out.println("appmt_cd = [" + getAppmt_cd() + "]");
		System.out.println("appmt_dt = [" + getAppmt_dt() + "]");
		System.out.println("seq = [" + getSeq() + "]");
		System.out.println("occr_dt = [" + getOccr_dt() + "]");
		System.out.println("incmg_pers = [" + getIncmg_pers() + "]");
	}
}
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리 및 결과확인 검사시 사용하십시오.

String save = req.getParameter("save");
if( save == null){
	System.out.println(this.toString+" : save is null" );
}else{
	System.out.println(this.toString+" : save is "+save );
}
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
String flnm = req.getParameter("flnm");
if( flnm == null){
	System.out.println(this.toString+" : flnm is null" );
}else{
	System.out.println(this.toString+" : flnm is "+flnm );
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
String care_alon = req.getParameter("care_alon");
if( care_alon == null){
	System.out.println(this.toString+" : care_alon is null" );
}else{
	System.out.println(this.toString+" : care_alon is "+care_alon );
}
String food_alon = req.getParameter("food_alon");
if( food_alon == null){
	System.out.println(this.toString+" : food_alon is null" );
}else{
	System.out.println(this.toString+" : food_alon is "+food_alon );
}
String tax_jrnst = req.getParameter("tax_jrnst");
if( tax_jrnst == null){
	System.out.println(this.toString+" : tax_jrnst is null" );
}else{
	System.out.println(this.toString+" : tax_jrnst is "+tax_jrnst );
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
String saly_stot = req.getParameter("saly_stot");
if( saly_stot == null){
	System.out.println(this.toString+" : saly_stot is null" );
}else{
	System.out.println(this.toString+" : saly_stot is "+saly_stot );
}
String appmt_cd = req.getParameter("appmt_cd");
if( appmt_cd == null){
	System.out.println(this.toString+" : appmt_cd is null" );
}else{
	System.out.println(this.toString+" : appmt_cd is "+appmt_cd );
}
String appmt_dt = req.getParameter("appmt_dt");
if( appmt_dt == null){
	System.out.println(this.toString+" : appmt_dt is null" );
}else{
	System.out.println(this.toString+" : appmt_dt is "+appmt_dt );
}
String seq = req.getParameter("seq");
if( seq == null){
	System.out.println(this.toString+" : seq is null" );
}else{
	System.out.println(this.toString+" : seq is "+seq );
}
String occr_dt = req.getParameter("occr_dt");
if( occr_dt == null){
	System.out.println(this.toString+" : occr_dt is null" );
}else{
	System.out.println(this.toString+" : occr_dt is "+occr_dt );
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

String save = Util.checkString(req.getParameter("save"));
String mode = Util.checkString(req.getParameter("mode"));
String cmpy_cd = Util.checkString(req.getParameter("cmpy_cd"));
String emp_no = Util.checkString(req.getParameter("emp_no"));
String flnm = Util.checkString(req.getParameter("flnm"));
String base_saly = Util.checkString(req.getParameter("base_saly"));
String posk_saly = Util.checkString(req.getParameter("posk_saly"));
String dty_alon = Util.checkString(req.getParameter("dty_alon"));
String posk_alon = Util.checkString(req.getParameter("posk_alon"));
String care_alon = Util.checkString(req.getParameter("care_alon"));
String food_alon = Util.checkString(req.getParameter("food_alon"));
String tax_jrnst = Util.checkString(req.getParameter("tax_jrnst"));
String auto_driv_alon = Util.checkString(req.getParameter("auto_driv_alon"));
String evngt_saly = Util.checkString(req.getParameter("evngt_saly"));
String saly_stot = Util.checkString(req.getParameter("saly_stot"));
String appmt_cd = Util.checkString(req.getParameter("appmt_cd"));
String appmt_dt = Util.checkString(req.getParameter("appmt_dt"));
String seq = Util.checkString(req.getParameter("seq"));
String occr_dt = Util.checkString(req.getParameter("occr_dt"));
String incmg_pers = Util.checkString(req.getParameter("incmg_pers"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String save = Util.Uni2Ksc(Util.checkString(req.getParameter("save")));
String mode = Util.Uni2Ksc(Util.checkString(req.getParameter("mode")));
String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String emp_no = Util.Uni2Ksc(Util.checkString(req.getParameter("emp_no")));
String flnm = Util.Uni2Ksc(Util.checkString(req.getParameter("flnm")));
String base_saly = Util.Uni2Ksc(Util.checkString(req.getParameter("base_saly")));
String posk_saly = Util.Uni2Ksc(Util.checkString(req.getParameter("posk_saly")));
String dty_alon = Util.Uni2Ksc(Util.checkString(req.getParameter("dty_alon")));
String posk_alon = Util.Uni2Ksc(Util.checkString(req.getParameter("posk_alon")));
String care_alon = Util.Uni2Ksc(Util.checkString(req.getParameter("care_alon")));
String food_alon = Util.Uni2Ksc(Util.checkString(req.getParameter("food_alon")));
String tax_jrnst = Util.Uni2Ksc(Util.checkString(req.getParameter("tax_jrnst")));
String auto_driv_alon = Util.Uni2Ksc(Util.checkString(req.getParameter("auto_driv_alon")));
String evngt_saly = Util.Uni2Ksc(Util.checkString(req.getParameter("evngt_saly")));
String saly_stot = Util.Uni2Ksc(Util.checkString(req.getParameter("saly_stot")));
String appmt_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("appmt_cd")));
String appmt_dt = Util.Uni2Ksc(Util.checkString(req.getParameter("appmt_dt")));
String seq = Util.Uni2Ksc(Util.checkString(req.getParameter("seq")));
String occr_dt = Util.Uni2Ksc(Util.checkString(req.getParameter("occr_dt")));
String incmg_pers = Util.Uni2Ksc(Util.checkString(req.getParameter("incmg_pers")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setSave(save);
dm.setMode(mode);
dm.setCmpy_cd(cmpy_cd);
dm.setEmp_no(emp_no);
dm.setFlnm(flnm);
dm.setBase_saly(base_saly);
dm.setPosk_saly(posk_saly);
dm.setDty_alon(dty_alon);
dm.setPosk_alon(posk_alon);
dm.setCare_alon(care_alon);
dm.setFood_alon(food_alon);
dm.setTax_jrnst(tax_jrnst);
dm.setAuto_driv_alon(auto_driv_alon);
dm.setEvngt_saly(evngt_saly);
dm.setSaly_stot(saly_stot);
dm.setAppmt_cd(appmt_cd);
dm.setAppmt_dt(appmt_dt);
dm.setSeq(seq);
dm.setOccr_dt(occr_dt);
dm.setIncmg_pers(incmg_pers);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Tue Jun 17 13:49:03 KST 2014 */