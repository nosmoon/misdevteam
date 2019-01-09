/***************************************************************************************************
* 파일명 : 
* 기능 : 
* 작성일자 : 
* 작성자 : 
***************************************************************************************************/
/***************************************************************************************************
* 수정내역 :
* 수정자 :
* 수정일자 :
* 백업 : 
***************************************************************************************************/


package chosun.ciis.pl.bas.dm;

import java.sql.*;
import oracle.jdbc.driver.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.pl.bas.ds.*;
import chosun.ciis.pl.bas.rec.*;

/**
 * 
 */


public class PL_BAS_1130_ADM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String work_flag;
	public String cmpy_cd;
	public String incmg_pers;
	public String incmg_pers_ip;
	public String medi_cd;
	public String medi_ser_no;
	public String medi_nm;
	public String issu_cmpy;
	public String medi_clsf;
	public String basi_yymm;
	public String reg_dt;
	public String issu_clsf;
	public String uprc;
	public String dcrate;
	public String cont_clas;
	public String author;
	public String type;
	public String std;
	public String page;
	public String unit;
	public String unit_wgt;
	public String absence_clsf;
	public String absence_dt;
	public String cover_modl;
	public String seri_cd;
	public String seri_nm;
	public String cont;
	public String vexc_medi_ser_no;
	public String remk;

	public PL_BAS_1130_ADM(){}
	public PL_BAS_1130_ADM(String work_flag, String cmpy_cd, String incmg_pers, String incmg_pers_ip, String medi_cd, String medi_ser_no, String medi_nm, String issu_cmpy, String medi_clsf, String basi_yymm, String reg_dt, String issu_clsf, String uprc, String dcrate, String cont_clas, String author, String type, String std, String page, String unit, String unit_wgt, String absence_clsf, String absence_dt, String cover_modl, String seri_cd, String seri_nm, String cont, String vexc_medi_ser_no, String remk){
		this.work_flag = work_flag;
		this.cmpy_cd = cmpy_cd;
		this.incmg_pers = incmg_pers;
		this.incmg_pers_ip = incmg_pers_ip;
		this.medi_cd = medi_cd;
		this.medi_ser_no = medi_ser_no;
		this.medi_nm = medi_nm;
		this.issu_cmpy = issu_cmpy;
		this.medi_clsf = medi_clsf;
		this.basi_yymm = basi_yymm;
		this.reg_dt = reg_dt;
		this.issu_clsf = issu_clsf;
		this.uprc = uprc;
		this.dcrate = dcrate;
		this.cont_clas = cont_clas;
		this.author = author;
		this.type = type;
		this.std = std;
		this.page = page;
		this.unit = unit;
		this.unit_wgt = unit_wgt;
		this.absence_clsf = absence_clsf;
		this.absence_dt = absence_dt;
		this.cover_modl = cover_modl;
		this.seri_cd = seri_cd;
		this.seri_nm = seri_nm;
		this.cont = cont;
		this.vexc_medi_ser_no = vexc_medi_ser_no;
		this.remk = remk;
	}

	public void setWork_flag(String work_flag){
		this.work_flag = work_flag;
	}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setIncmg_pers(String incmg_pers){
		this.incmg_pers = incmg_pers;
	}

	public void setIncmg_pers_ip(String incmg_pers_ip){
		this.incmg_pers_ip = incmg_pers_ip;
	}

	public void setMedi_cd(String medi_cd){
		this.medi_cd = medi_cd;
	}

	public void setMedi_ser_no(String medi_ser_no){
		this.medi_ser_no = medi_ser_no;
	}

	public void setMedi_nm(String medi_nm){
		this.medi_nm = medi_nm;
	}

	public void setIssu_cmpy(String issu_cmpy){
		this.issu_cmpy = issu_cmpy;
	}

	public void setMedi_clsf(String medi_clsf){
		this.medi_clsf = medi_clsf;
	}

	public void setBasi_yymm(String basi_yymm){
		this.basi_yymm = basi_yymm;
	}

	public void setReg_dt(String reg_dt){
		this.reg_dt = reg_dt;
	}

	public void setIssu_clsf(String issu_clsf){
		this.issu_clsf = issu_clsf;
	}

	public void setUprc(String uprc){
		this.uprc = uprc;
	}

	public void setDcrate(String dcrate){
		this.dcrate = dcrate;
	}

	public void setCont_clas(String cont_clas){
		this.cont_clas = cont_clas;
	}

	public void setAuthor(String author){
		this.author = author;
	}

	public void setType(String type){
		this.type = type;
	}

	public void setStd(String std){
		this.std = std;
	}

	public void setPage(String page){
		this.page = page;
	}

	public void setUnit(String unit){
		this.unit = unit;
	}

	public void setUnit_wgt(String unit_wgt){
		this.unit_wgt = unit_wgt;
	}

	public void setAbsence_clsf(String absence_clsf){
		this.absence_clsf = absence_clsf;
	}

	public void setAbsence_dt(String absence_dt){
		this.absence_dt = absence_dt;
	}

	public void setCover_modl(String cover_modl){
		this.cover_modl = cover_modl;
	}

	public void setSeri_cd(String seri_cd){
		this.seri_cd = seri_cd;
	}

	public void setSeri_nm(String seri_nm){
		this.seri_nm = seri_nm;
	}

	public void setCont(String cont){
		this.cont = cont;
	}

	public void setVexc_medi_ser_no(String vexc_medi_ser_no){
		this.vexc_medi_ser_no = vexc_medi_ser_no;
	}

	public void setRemk(String remk){
		this.remk = remk;
	}

	public String getWork_flag(){
		return this.work_flag;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getIncmg_pers(){
		return this.incmg_pers;
	}

	public String getIncmg_pers_ip(){
		return this.incmg_pers_ip;
	}

	public String getMedi_cd(){
		return this.medi_cd;
	}

	public String getMedi_ser_no(){
		return this.medi_ser_no;
	}

	public String getMedi_nm(){
		return this.medi_nm;
	}

	public String getIssu_cmpy(){
		return this.issu_cmpy;
	}

	public String getMedi_clsf(){
		return this.medi_clsf;
	}

	public String getBasi_yymm(){
		return this.basi_yymm;
	}

	public String getReg_dt(){
		return this.reg_dt;
	}

	public String getIssu_clsf(){
		return this.issu_clsf;
	}

	public String getUprc(){
		return this.uprc;
	}

	public String getDcrate(){
		return this.dcrate;
	}

	public String getCont_clas(){
		return this.cont_clas;
	}

	public String getAuthor(){
		return this.author;
	}

	public String getType(){
		return this.type;
	}

	public String getStd(){
		return this.std;
	}

	public String getPage(){
		return this.page;
	}

	public String getUnit(){
		return this.unit;
	}

	public String getUnit_wgt(){
		return this.unit_wgt;
	}

	public String getAbsence_clsf(){
		return this.absence_clsf;
	}

	public String getAbsence_dt(){
		return this.absence_dt;
	}

	public String getCover_modl(){
		return this.cover_modl;
	}

	public String getSeri_cd(){
		return this.seri_cd;
	}

	public String getSeri_nm(){
		return this.seri_nm;
	}

	public String getCont(){
		return this.cont;
	}

	public String getVexc_medi_ser_no(){
		return this.vexc_medi_ser_no;
	}

	public String getRemk(){
		return this.remk;
	}

	public String getSQL(){
		 return "{ call CRMSAL_COM.SP_PL_BAS_1130_A(? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		PL_BAS_1130_ADM dm = (PL_BAS_1130_ADM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.work_flag);
		cstmt.setString(4, dm.cmpy_cd);
		cstmt.setString(5, dm.incmg_pers);
		cstmt.setString(6, dm.incmg_pers_ip);
		cstmt.setString(7, dm.medi_cd);
		cstmt.setString(8, dm.medi_ser_no);
		cstmt.setString(9, dm.medi_nm);
		cstmt.setString(10, dm.issu_cmpy);
		cstmt.setString(11, dm.medi_clsf);
		cstmt.setString(12, dm.basi_yymm);
		cstmt.setString(13, dm.reg_dt);
		cstmt.setString(14, dm.issu_clsf);
		cstmt.setString(15, dm.uprc);
		cstmt.setString(16, dm.dcrate);
		cstmt.setString(17, dm.cont_clas);
		cstmt.setString(18, dm.author);
		cstmt.setString(19, dm.type);
		cstmt.setString(20, dm.std);
		cstmt.setString(21, dm.page);
		cstmt.setString(22, dm.unit);
		cstmt.setString(23, dm.unit_wgt);
		cstmt.setString(24, dm.absence_clsf);
		cstmt.setString(25, dm.absence_dt);
		cstmt.setString(26, dm.cover_modl);
		cstmt.setString(27, dm.seri_cd);
		cstmt.setString(28, dm.seri_nm);
		cstmt.setString(29, dm.cont);
		cstmt.setString(30, dm.vexc_medi_ser_no);
		cstmt.setString(31, dm.remk);
		cstmt.registerOutParameter(32, Types.VARCHAR);
		cstmt.registerOutParameter(33, Types.VARCHAR);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.pl.bas.ds.PL_BAS_1130_ADataSet();
	}



    public void print(){
        System.out.println("work_flag = " + getWork_flag());
        System.out.println("cmpy_cd = " + getCmpy_cd());
        System.out.println("incmg_pers = " + getIncmg_pers());
        System.out.println("incmg_pers_ip = " + getIncmg_pers_ip());
        System.out.println("medi_cd = " + getMedi_cd());
        System.out.println("medi_ser_no = " + getMedi_ser_no());
        System.out.println("medi_nm = " + getMedi_nm());
        System.out.println("issu_cmpy = " + getIssu_cmpy());
        System.out.println("medi_clsf = " + getMedi_clsf());
        System.out.println("basi_yymm = " + getBasi_yymm());
        System.out.println("reg_dt = " + getReg_dt());
        System.out.println("issu_clsf = " + getIssu_clsf());
        System.out.println("uprc = " + getUprc());
        System.out.println("dcrate = " + getDcrate());
        System.out.println("cont_clas = " + getCont_clas());
        System.out.println("author = " + getAuthor());
        System.out.println("type = " + getType());
        System.out.println("std = " + getStd());
        System.out.println("page = " + getPage());
        System.out.println("unit = " + getUnit());
        System.out.println("unit_wgt = " + getUnit_wgt());
        System.out.println("absence_clsf = " + getAbsence_clsf());
        System.out.println("absence_dt = " + getAbsence_dt());
        System.out.println("cover_modl = " + getCover_modl());
        System.out.println("seri_cd = " + getSeri_cd());
        System.out.println("seri_nm = " + getSeri_nm());
        System.out.println("cont = " + getCont());
        System.out.println("vexc_medi_ser_no = " + getVexc_medi_ser_no());
        System.out.println("remk = " + getRemk());
    }
}
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리 및 결과확인 검사시 사용하십시오.

String work_flag = req.getParameter("work_flag");
if( work_flag == null){
	System.out.println(this.toString+" : work_flag is null" );
}else{
	System.out.println(this.toString+" : work_flag is "+work_flag );
}
String cmpy_cd = req.getParameter("cmpy_cd");
if( cmpy_cd == null){
	System.out.println(this.toString+" : cmpy_cd is null" );
}else{
	System.out.println(this.toString+" : cmpy_cd is "+cmpy_cd );
}
String incmg_pers = req.getParameter("incmg_pers");
if( incmg_pers == null){
	System.out.println(this.toString+" : incmg_pers is null" );
}else{
	System.out.println(this.toString+" : incmg_pers is "+incmg_pers );
}
String incmg_pers_ip = req.getParameter("incmg_pers_ip");
if( incmg_pers_ip == null){
	System.out.println(this.toString+" : incmg_pers_ip is null" );
}else{
	System.out.println(this.toString+" : incmg_pers_ip is "+incmg_pers_ip );
}
String medi_cd = req.getParameter("medi_cd");
if( medi_cd == null){
	System.out.println(this.toString+" : medi_cd is null" );
}else{
	System.out.println(this.toString+" : medi_cd is "+medi_cd );
}
String medi_ser_no = req.getParameter("medi_ser_no");
if( medi_ser_no == null){
	System.out.println(this.toString+" : medi_ser_no is null" );
}else{
	System.out.println(this.toString+" : medi_ser_no is "+medi_ser_no );
}
String medi_nm = req.getParameter("medi_nm");
if( medi_nm == null){
	System.out.println(this.toString+" : medi_nm is null" );
}else{
	System.out.println(this.toString+" : medi_nm is "+medi_nm );
}
String issu_cmpy = req.getParameter("issu_cmpy");
if( issu_cmpy == null){
	System.out.println(this.toString+" : issu_cmpy is null" );
}else{
	System.out.println(this.toString+" : issu_cmpy is "+issu_cmpy );
}
String medi_clsf = req.getParameter("medi_clsf");
if( medi_clsf == null){
	System.out.println(this.toString+" : medi_clsf is null" );
}else{
	System.out.println(this.toString+" : medi_clsf is "+medi_clsf );
}
String basi_yymm = req.getParameter("basi_yymm");
if( basi_yymm == null){
	System.out.println(this.toString+" : basi_yymm is null" );
}else{
	System.out.println(this.toString+" : basi_yymm is "+basi_yymm );
}
String reg_dt = req.getParameter("reg_dt");
if( reg_dt == null){
	System.out.println(this.toString+" : reg_dt is null" );
}else{
	System.out.println(this.toString+" : reg_dt is "+reg_dt );
}
String issu_clsf = req.getParameter("issu_clsf");
if( issu_clsf == null){
	System.out.println(this.toString+" : issu_clsf is null" );
}else{
	System.out.println(this.toString+" : issu_clsf is "+issu_clsf );
}
String uprc = req.getParameter("uprc");
if( uprc == null){
	System.out.println(this.toString+" : uprc is null" );
}else{
	System.out.println(this.toString+" : uprc is "+uprc );
}
String dcrate = req.getParameter("dcrate");
if( dcrate == null){
	System.out.println(this.toString+" : dcrate is null" );
}else{
	System.out.println(this.toString+" : dcrate is "+dcrate );
}
String cont_clas = req.getParameter("cont_clas");
if( cont_clas == null){
	System.out.println(this.toString+" : cont_clas is null" );
}else{
	System.out.println(this.toString+" : cont_clas is "+cont_clas );
}
String author = req.getParameter("author");
if( author == null){
	System.out.println(this.toString+" : author is null" );
}else{
	System.out.println(this.toString+" : author is "+author );
}
String type = req.getParameter("type");
if( type == null){
	System.out.println(this.toString+" : type is null" );
}else{
	System.out.println(this.toString+" : type is "+type );
}
String std = req.getParameter("std");
if( std == null){
	System.out.println(this.toString+" : std is null" );
}else{
	System.out.println(this.toString+" : std is "+std );
}
String page = req.getParameter("page");
if( page == null){
	System.out.println(this.toString+" : page is null" );
}else{
	System.out.println(this.toString+" : page is "+page );
}
String unit = req.getParameter("unit");
if( unit == null){
	System.out.println(this.toString+" : unit is null" );
}else{
	System.out.println(this.toString+" : unit is "+unit );
}
String unit_wgt = req.getParameter("unit_wgt");
if( unit_wgt == null){
	System.out.println(this.toString+" : unit_wgt is null" );
}else{
	System.out.println(this.toString+" : unit_wgt is "+unit_wgt );
}
String absence_clsf = req.getParameter("absence_clsf");
if( absence_clsf == null){
	System.out.println(this.toString+" : absence_clsf is null" );
}else{
	System.out.println(this.toString+" : absence_clsf is "+absence_clsf );
}
String absence_dt = req.getParameter("absence_dt");
if( absence_dt == null){
	System.out.println(this.toString+" : absence_dt is null" );
}else{
	System.out.println(this.toString+" : absence_dt is "+absence_dt );
}
String cover_modl = req.getParameter("cover_modl");
if( cover_modl == null){
	System.out.println(this.toString+" : cover_modl is null" );
}else{
	System.out.println(this.toString+" : cover_modl is "+cover_modl );
}
String seri_cd = req.getParameter("seri_cd");
if( seri_cd == null){
	System.out.println(this.toString+" : seri_cd is null" );
}else{
	System.out.println(this.toString+" : seri_cd is "+seri_cd );
}
String seri_nm = req.getParameter("seri_nm");
if( seri_nm == null){
	System.out.println(this.toString+" : seri_nm is null" );
}else{
	System.out.println(this.toString+" : seri_nm is "+seri_nm );
}
String cont = req.getParameter("cont");
if( cont == null){
	System.out.println(this.toString+" : cont is null" );
}else{
	System.out.println(this.toString+" : cont is "+cont );
}
String vexc_medi_ser_no = req.getParameter("vexc_medi_ser_no");
if( vexc_medi_ser_no == null){
	System.out.println(this.toString+" : vexc_medi_ser_no is null" );
}else{
	System.out.println(this.toString+" : vexc_medi_ser_no is "+vexc_medi_ser_no );
}
String remk = req.getParameter("remk");
if( remk == null){
	System.out.println(this.toString+" : remk is null" );
}else{
	System.out.println(this.toString+" : remk is "+remk );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리시 사용하십시오.

String work_flag = Util.checkString(req.getParameter("work_flag"));
String cmpy_cd = Util.checkString(req.getParameter("cmpy_cd"));
String incmg_pers = Util.checkString(req.getParameter("incmg_pers"));
String incmg_pers_ip = Util.checkString(req.getParameter("incmg_pers_ip"));
String medi_cd = Util.checkString(req.getParameter("medi_cd"));
String medi_ser_no = Util.checkString(req.getParameter("medi_ser_no"));
String medi_nm = Util.checkString(req.getParameter("medi_nm"));
String issu_cmpy = Util.checkString(req.getParameter("issu_cmpy"));
String medi_clsf = Util.checkString(req.getParameter("medi_clsf"));
String basi_yymm = Util.checkString(req.getParameter("basi_yymm"));
String reg_dt = Util.checkString(req.getParameter("reg_dt"));
String issu_clsf = Util.checkString(req.getParameter("issu_clsf"));
String uprc = Util.checkString(req.getParameter("uprc"));
String dcrate = Util.checkString(req.getParameter("dcrate"));
String cont_clas = Util.checkString(req.getParameter("cont_clas"));
String author = Util.checkString(req.getParameter("author"));
String type = Util.checkString(req.getParameter("type"));
String std = Util.checkString(req.getParameter("std"));
String page = Util.checkString(req.getParameter("page"));
String unit = Util.checkString(req.getParameter("unit"));
String unit_wgt = Util.checkString(req.getParameter("unit_wgt"));
String absence_clsf = Util.checkString(req.getParameter("absence_clsf"));
String absence_dt = Util.checkString(req.getParameter("absence_dt"));
String cover_modl = Util.checkString(req.getParameter("cover_modl"));
String seri_cd = Util.checkString(req.getParameter("seri_cd"));
String seri_nm = Util.checkString(req.getParameter("seri_nm"));
String cont = Util.checkString(req.getParameter("cont"));
String vexc_medi_ser_no = Util.checkString(req.getParameter("vexc_medi_ser_no"));
String remk = Util.checkString(req.getParameter("remk"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String work_flag = Util.Uni2Ksc(Util.checkString(req.getParameter("work_flag")));
String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String incmg_pers = Util.Uni2Ksc(Util.checkString(req.getParameter("incmg_pers")));
String incmg_pers_ip = Util.Uni2Ksc(Util.checkString(req.getParameter("incmg_pers_ip")));
String medi_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("medi_cd")));
String medi_ser_no = Util.Uni2Ksc(Util.checkString(req.getParameter("medi_ser_no")));
String medi_nm = Util.Uni2Ksc(Util.checkString(req.getParameter("medi_nm")));
String issu_cmpy = Util.Uni2Ksc(Util.checkString(req.getParameter("issu_cmpy")));
String medi_clsf = Util.Uni2Ksc(Util.checkString(req.getParameter("medi_clsf")));
String basi_yymm = Util.Uni2Ksc(Util.checkString(req.getParameter("basi_yymm")));
String reg_dt = Util.Uni2Ksc(Util.checkString(req.getParameter("reg_dt")));
String issu_clsf = Util.Uni2Ksc(Util.checkString(req.getParameter("issu_clsf")));
String uprc = Util.Uni2Ksc(Util.checkString(req.getParameter("uprc")));
String dcrate = Util.Uni2Ksc(Util.checkString(req.getParameter("dcrate")));
String cont_clas = Util.Uni2Ksc(Util.checkString(req.getParameter("cont_clas")));
String author = Util.Uni2Ksc(Util.checkString(req.getParameter("author")));
String type = Util.Uni2Ksc(Util.checkString(req.getParameter("type")));
String std = Util.Uni2Ksc(Util.checkString(req.getParameter("std")));
String page = Util.Uni2Ksc(Util.checkString(req.getParameter("page")));
String unit = Util.Uni2Ksc(Util.checkString(req.getParameter("unit")));
String unit_wgt = Util.Uni2Ksc(Util.checkString(req.getParameter("unit_wgt")));
String absence_clsf = Util.Uni2Ksc(Util.checkString(req.getParameter("absence_clsf")));
String absence_dt = Util.Uni2Ksc(Util.checkString(req.getParameter("absence_dt")));
String cover_modl = Util.Uni2Ksc(Util.checkString(req.getParameter("cover_modl")));
String seri_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("seri_cd")));
String seri_nm = Util.Uni2Ksc(Util.checkString(req.getParameter("seri_nm")));
String cont = Util.Uni2Ksc(Util.checkString(req.getParameter("cont")));
String vexc_medi_ser_no = Util.Uni2Ksc(Util.checkString(req.getParameter("vexc_medi_ser_no")));
String remk = Util.Uni2Ksc(Util.checkString(req.getParameter("remk")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setWork_flag(work_flag);
dm.setCmpy_cd(cmpy_cd);
dm.setIncmg_pers(incmg_pers);
dm.setIncmg_pers_ip(incmg_pers_ip);
dm.setMedi_cd(medi_cd);
dm.setMedi_ser_no(medi_ser_no);
dm.setMedi_nm(medi_nm);
dm.setIssu_cmpy(issu_cmpy);
dm.setMedi_clsf(medi_clsf);
dm.setBasi_yymm(basi_yymm);
dm.setReg_dt(reg_dt);
dm.setIssu_clsf(issu_clsf);
dm.setUprc(uprc);
dm.setDcrate(dcrate);
dm.setCont_clas(cont_clas);
dm.setAuthor(author);
dm.setType(type);
dm.setStd(std);
dm.setPage(page);
dm.setUnit(unit);
dm.setUnit_wgt(unit_wgt);
dm.setAbsence_clsf(absence_clsf);
dm.setAbsence_dt(absence_dt);
dm.setCover_modl(cover_modl);
dm.setSeri_cd(seri_cd);
dm.setSeri_nm(seri_nm);
dm.setCont(cont);
dm.setVexc_medi_ser_no(vexc_medi_ser_no);
dm.setRemk(remk);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Mon Mar 16 21:48:55 KST 2009 */