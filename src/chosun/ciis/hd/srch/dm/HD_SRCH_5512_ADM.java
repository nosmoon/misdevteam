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


package chosun.ciis.hd.srch.dm;

import java.sql.*;
import oracle.jdbc.driver.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.hd.srch.ds.*;
import chosun.ciis.hd.srch.rec.*;

/**
 * 
 */


public class HD_SRCH_5512_ADM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String cmpy_cd;
	public String basi_dt;
	public String head_clsf_00_01;
	public String head_clsf_01_01;
	public String head_clsf_01_02;
	public String gridtitle;
	public String yymm;
	public String human_resour_1;
	public String human_resour_2;
	public String tot_nops_cnt;
	public String emp_clsf_30_cnt;
	public String emp_ratio;
	public String emp_fml_cnt;
	public String mode;
	public String text_tag;
	public String incmg_pers;
	public String chg_pers;

	public HD_SRCH_5512_ADM(){}
	public HD_SRCH_5512_ADM(String cmpy_cd, String basi_dt, String head_clsf_00_01, String head_clsf_01_01, String head_clsf_01_02, String gridtitle, String yymm, String human_resour_1, String human_resour_2, String tot_nops_cnt, String emp_clsf_30_cnt, String emp_ratio, String emp_fml_cnt, String mode, String text_tag, String incmg_pers, String chg_pers){
		this.cmpy_cd = cmpy_cd;
		this.basi_dt = basi_dt;
		this.head_clsf_00_01 = head_clsf_00_01;
		this.head_clsf_01_01 = head_clsf_01_01;
		this.head_clsf_01_02 = head_clsf_01_02;
		this.gridtitle = gridtitle;
		this.yymm = yymm;
		this.human_resour_1 = human_resour_1;
		this.human_resour_2 = human_resour_2;
		this.tot_nops_cnt = tot_nops_cnt;
		this.emp_clsf_30_cnt = emp_clsf_30_cnt;
		this.emp_ratio = emp_ratio;
		this.emp_fml_cnt = emp_fml_cnt;
		this.mode = mode;
		this.text_tag = text_tag;
		this.incmg_pers = incmg_pers;
		this.chg_pers = chg_pers;
	}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setBasi_dt(String basi_dt){
		this.basi_dt = basi_dt;
	}

	public void setHead_clsf_00_01(String head_clsf_00_01){
		this.head_clsf_00_01 = head_clsf_00_01;
	}

	public void setHead_clsf_01_01(String head_clsf_01_01){
		this.head_clsf_01_01 = head_clsf_01_01;
	}

	public void setHead_clsf_01_02(String head_clsf_01_02){
		this.head_clsf_01_02 = head_clsf_01_02;
	}

	public void setGridtitle(String gridtitle){
		this.gridtitle = gridtitle;
	}

	public void setYymm(String yymm){
		this.yymm = yymm;
	}

	public void setHuman_resour_1(String human_resour_1){
		this.human_resour_1 = human_resour_1;
	}

	public void setHuman_resour_2(String human_resour_2){
		this.human_resour_2 = human_resour_2;
	}

	public void setTot_nops_cnt(String tot_nops_cnt){
		this.tot_nops_cnt = tot_nops_cnt;
	}

	public void setEmp_clsf_30_cnt(String emp_clsf_30_cnt){
		this.emp_clsf_30_cnt = emp_clsf_30_cnt;
	}

	public void setEmp_ratio(String emp_ratio){
		this.emp_ratio = emp_ratio;
	}

	public void setEmp_fml_cnt(String emp_fml_cnt){
		this.emp_fml_cnt = emp_fml_cnt;
	}

	public void setMode(String mode){
		this.mode = mode;
	}

	public void setText_tag(String text_tag){
		this.text_tag = text_tag;
	}

	public void setIncmg_pers(String incmg_pers){
		this.incmg_pers = incmg_pers;
	}

	public void setChg_pers(String chg_pers){
		this.chg_pers = chg_pers;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getBasi_dt(){
		return this.basi_dt;
	}

	public String getHead_clsf_00_01(){
		return this.head_clsf_00_01;
	}

	public String getHead_clsf_01_01(){
		return this.head_clsf_01_01;
	}

	public String getHead_clsf_01_02(){
		return this.head_clsf_01_02;
	}

	public String getGridtitle(){
		return this.gridtitle;
	}

	public String getYymm(){
		return this.yymm;
	}

	public String getHuman_resour_1(){
		return this.human_resour_1;
	}

	public String getHuman_resour_2(){
		return this.human_resour_2;
	}

	public String getTot_nops_cnt(){
		return this.tot_nops_cnt;
	}

	public String getEmp_clsf_30_cnt(){
		return this.emp_clsf_30_cnt;
	}

	public String getEmp_ratio(){
		return this.emp_ratio;
	}

	public String getEmp_fml_cnt(){
		return this.emp_fml_cnt;
	}

	public String getMode(){
		return this.mode;
	}

	public String getText_tag(){
		return this.text_tag;
	}

	public String getIncmg_pers(){
		return this.incmg_pers;
	}

	public String getChg_pers(){
		return this.chg_pers;
	}

	public String getSQL(){
		 return "{ call MISHDL.SP_HD_SRCH_5512_A(? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		HD_SRCH_5512_ADM dm = (HD_SRCH_5512_ADM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.registerOutParameter(3, Types.VARCHAR);
		cstmt.setString(4, dm.cmpy_cd);
		cstmt.setString(5, dm.basi_dt);
		cstmt.setString(6, dm.head_clsf_00_01);
		cstmt.setString(7, dm.head_clsf_01_01);
		cstmt.setString(8, dm.head_clsf_01_02);
		cstmt.setString(9, dm.gridtitle);
		cstmt.setString(10, dm.yymm);
		cstmt.setString(11, dm.human_resour_1);
		cstmt.setString(12, dm.human_resour_2);
		cstmt.setString(13, dm.tot_nops_cnt);
		cstmt.setString(14, dm.emp_clsf_30_cnt);
		cstmt.setString(15, dm.emp_ratio);
		cstmt.setString(16, dm.emp_fml_cnt);
		cstmt.setString(17, dm.mode);
		cstmt.setString(18, dm.text_tag);
		cstmt.setString(19, dm.incmg_pers);
		cstmt.setString(20, dm.chg_pers);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.hd.srch.ds.HD_SRCH_5512_ADataSet();
	}



	public void print(){
		System.out.println("SQL = " + this.getSQL());
		System.out.println("cmpy_cd = [" + getCmpy_cd() + "]");
		System.out.println("basi_dt = [" + getBasi_dt() + "]");
		System.out.println("head_clsf_00_01 = [" + getHead_clsf_00_01() + "]");
		System.out.println("head_clsf_01_01 = [" + getHead_clsf_01_01() + "]");
		System.out.println("head_clsf_01_02 = [" + getHead_clsf_01_02() + "]");
		System.out.println("gridtitle = [" + getGridtitle() + "]");
		System.out.println("yymm = [" + getYymm() + "]");
		System.out.println("human_resour_1 = [" + getHuman_resour_1() + "]");
		System.out.println("human_resour_2 = [" + getHuman_resour_2() + "]");
		System.out.println("tot_nops_cnt = [" + getTot_nops_cnt() + "]");
		System.out.println("emp_clsf_30_cnt = [" + getEmp_clsf_30_cnt() + "]");
		System.out.println("emp_ratio = [" + getEmp_ratio() + "]");
		System.out.println("emp_fml_cnt = [" + getEmp_fml_cnt() + "]");
		System.out.println("mode = [" + getMode() + "]");
		System.out.println("text_tag = [" + getText_tag() + "]");
		System.out.println("incmg_pers = [" + getIncmg_pers() + "]");
		System.out.println("chg_pers = [" + getChg_pers() + "]");
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
String basi_dt = req.getParameter("basi_dt");
if( basi_dt == null){
	System.out.println(this.toString+" : basi_dt is null" );
}else{
	System.out.println(this.toString+" : basi_dt is "+basi_dt );
}
String head_clsf_00_01 = req.getParameter("head_clsf_00_01");
if( head_clsf_00_01 == null){
	System.out.println(this.toString+" : head_clsf_00_01 is null" );
}else{
	System.out.println(this.toString+" : head_clsf_00_01 is "+head_clsf_00_01 );
}
String head_clsf_01_01 = req.getParameter("head_clsf_01_01");
if( head_clsf_01_01 == null){
	System.out.println(this.toString+" : head_clsf_01_01 is null" );
}else{
	System.out.println(this.toString+" : head_clsf_01_01 is "+head_clsf_01_01 );
}
String head_clsf_01_02 = req.getParameter("head_clsf_01_02");
if( head_clsf_01_02 == null){
	System.out.println(this.toString+" : head_clsf_01_02 is null" );
}else{
	System.out.println(this.toString+" : head_clsf_01_02 is "+head_clsf_01_02 );
}
String gridtitle = req.getParameter("gridtitle");
if( gridtitle == null){
	System.out.println(this.toString+" : gridtitle is null" );
}else{
	System.out.println(this.toString+" : gridtitle is "+gridtitle );
}
String yymm = req.getParameter("yymm");
if( yymm == null){
	System.out.println(this.toString+" : yymm is null" );
}else{
	System.out.println(this.toString+" : yymm is "+yymm );
}
String human_resour_1 = req.getParameter("human_resour_1");
if( human_resour_1 == null){
	System.out.println(this.toString+" : human_resour_1 is null" );
}else{
	System.out.println(this.toString+" : human_resour_1 is "+human_resour_1 );
}
String human_resour_2 = req.getParameter("human_resour_2");
if( human_resour_2 == null){
	System.out.println(this.toString+" : human_resour_2 is null" );
}else{
	System.out.println(this.toString+" : human_resour_2 is "+human_resour_2 );
}
String tot_nops_cnt = req.getParameter("tot_nops_cnt");
if( tot_nops_cnt == null){
	System.out.println(this.toString+" : tot_nops_cnt is null" );
}else{
	System.out.println(this.toString+" : tot_nops_cnt is "+tot_nops_cnt );
}
String emp_clsf_30_cnt = req.getParameter("emp_clsf_30_cnt");
if( emp_clsf_30_cnt == null){
	System.out.println(this.toString+" : emp_clsf_30_cnt is null" );
}else{
	System.out.println(this.toString+" : emp_clsf_30_cnt is "+emp_clsf_30_cnt );
}
String emp_ratio = req.getParameter("emp_ratio");
if( emp_ratio == null){
	System.out.println(this.toString+" : emp_ratio is null" );
}else{
	System.out.println(this.toString+" : emp_ratio is "+emp_ratio );
}
String emp_fml_cnt = req.getParameter("emp_fml_cnt");
if( emp_fml_cnt == null){
	System.out.println(this.toString+" : emp_fml_cnt is null" );
}else{
	System.out.println(this.toString+" : emp_fml_cnt is "+emp_fml_cnt );
}
String mode = req.getParameter("mode");
if( mode == null){
	System.out.println(this.toString+" : mode is null" );
}else{
	System.out.println(this.toString+" : mode is "+mode );
}
String text_tag = req.getParameter("text_tag");
if( text_tag == null){
	System.out.println(this.toString+" : text_tag is null" );
}else{
	System.out.println(this.toString+" : text_tag is "+text_tag );
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

String cmpy_cd = Util.checkString(req.getParameter("cmpy_cd"));
String basi_dt = Util.checkString(req.getParameter("basi_dt"));
String head_clsf_00_01 = Util.checkString(req.getParameter("head_clsf_00_01"));
String head_clsf_01_01 = Util.checkString(req.getParameter("head_clsf_01_01"));
String head_clsf_01_02 = Util.checkString(req.getParameter("head_clsf_01_02"));
String gridtitle = Util.checkString(req.getParameter("gridtitle"));
String yymm = Util.checkString(req.getParameter("yymm"));
String human_resour_1 = Util.checkString(req.getParameter("human_resour_1"));
String human_resour_2 = Util.checkString(req.getParameter("human_resour_2"));
String tot_nops_cnt = Util.checkString(req.getParameter("tot_nops_cnt"));
String emp_clsf_30_cnt = Util.checkString(req.getParameter("emp_clsf_30_cnt"));
String emp_ratio = Util.checkString(req.getParameter("emp_ratio"));
String emp_fml_cnt = Util.checkString(req.getParameter("emp_fml_cnt"));
String mode = Util.checkString(req.getParameter("mode"));
String text_tag = Util.checkString(req.getParameter("text_tag"));
String incmg_pers = Util.checkString(req.getParameter("incmg_pers"));
String chg_pers = Util.checkString(req.getParameter("chg_pers"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String basi_dt = Util.Uni2Ksc(Util.checkString(req.getParameter("basi_dt")));
String head_clsf_00_01 = Util.Uni2Ksc(Util.checkString(req.getParameter("head_clsf_00_01")));
String head_clsf_01_01 = Util.Uni2Ksc(Util.checkString(req.getParameter("head_clsf_01_01")));
String head_clsf_01_02 = Util.Uni2Ksc(Util.checkString(req.getParameter("head_clsf_01_02")));
String gridtitle = Util.Uni2Ksc(Util.checkString(req.getParameter("gridtitle")));
String yymm = Util.Uni2Ksc(Util.checkString(req.getParameter("yymm")));
String human_resour_1 = Util.Uni2Ksc(Util.checkString(req.getParameter("human_resour_1")));
String human_resour_2 = Util.Uni2Ksc(Util.checkString(req.getParameter("human_resour_2")));
String tot_nops_cnt = Util.Uni2Ksc(Util.checkString(req.getParameter("tot_nops_cnt")));
String emp_clsf_30_cnt = Util.Uni2Ksc(Util.checkString(req.getParameter("emp_clsf_30_cnt")));
String emp_ratio = Util.Uni2Ksc(Util.checkString(req.getParameter("emp_ratio")));
String emp_fml_cnt = Util.Uni2Ksc(Util.checkString(req.getParameter("emp_fml_cnt")));
String mode = Util.Uni2Ksc(Util.checkString(req.getParameter("mode")));
String text_tag = Util.Uni2Ksc(Util.checkString(req.getParameter("text_tag")));
String incmg_pers = Util.Uni2Ksc(Util.checkString(req.getParameter("incmg_pers")));
String chg_pers = Util.Uni2Ksc(Util.checkString(req.getParameter("chg_pers")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setCmpy_cd(cmpy_cd);
dm.setBasi_dt(basi_dt);
dm.setHead_clsf_00_01(head_clsf_00_01);
dm.setHead_clsf_01_01(head_clsf_01_01);
dm.setHead_clsf_01_02(head_clsf_01_02);
dm.setGridtitle(gridtitle);
dm.setYymm(yymm);
dm.setHuman_resour_1(human_resour_1);
dm.setHuman_resour_2(human_resour_2);
dm.setTot_nops_cnt(tot_nops_cnt);
dm.setEmp_clsf_30_cnt(emp_clsf_30_cnt);
dm.setEmp_ratio(emp_ratio);
dm.setEmp_fml_cnt(emp_fml_cnt);
dm.setMode(mode);
dm.setText_tag(text_tag);
dm.setIncmg_pers(incmg_pers);
dm.setChg_pers(chg_pers);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Thu Nov 15 18:37:56 KST 2018 */