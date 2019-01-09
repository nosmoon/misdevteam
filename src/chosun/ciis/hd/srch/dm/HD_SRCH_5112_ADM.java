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


public class HD_SRCH_5112_ADM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String cmpy_cd;
	public String basi_dt;
	public String gridtitle;
	public String clas_clsf;
	public String emp_clsf;
	public String prv_nops;
	public String this_nops;
	public String cmpr_nops;
	public String text_tag;
	public String incmg_pers;
	public String chg_pers;
	public String flag;

	public HD_SRCH_5112_ADM(){}
	public HD_SRCH_5112_ADM(String cmpy_cd, String basi_dt, String gridtitle, String clas_clsf, String emp_clsf, String prv_nops, String this_nops, String cmpr_nops, String text_tag, String incmg_pers, String chg_pers, String flag){
		this.cmpy_cd = cmpy_cd;
		this.basi_dt = basi_dt;
		this.gridtitle = gridtitle;
		this.clas_clsf = clas_clsf;
		this.emp_clsf = emp_clsf;
		this.prv_nops = prv_nops;
		this.this_nops = this_nops;
		this.cmpr_nops = cmpr_nops;
		this.text_tag = text_tag;
		this.incmg_pers = incmg_pers;
		this.chg_pers = chg_pers;
		this.flag = flag;
	}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setBasi_dt(String basi_dt){
		this.basi_dt = basi_dt;
	}

	public void setGridtitle(String gridtitle){
		this.gridtitle = gridtitle;
	}

	public void setClas_clsf(String clas_clsf){
		this.clas_clsf = clas_clsf;
	}

	public void setEmp_clsf(String emp_clsf){
		this.emp_clsf = emp_clsf;
	}

	public void setPrv_nops(String prv_nops){
		this.prv_nops = prv_nops;
	}

	public void setThis_nops(String this_nops){
		this.this_nops = this_nops;
	}

	public void setCmpr_nops(String cmpr_nops){
		this.cmpr_nops = cmpr_nops;
	}

	public void setTag1(String text_tag){
		this.text_tag = text_tag;
	}

	public void setIncmg_pers(String incmg_pers){
		this.incmg_pers = incmg_pers;
	}

	public void setChg_pers(String chg_pers){
		this.chg_pers = chg_pers;
	}

	public void setFlag(String flag){
		this.flag = flag;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getBasi_dt(){
		return this.basi_dt;
	}

	public String getGridtitle(){
		return this.gridtitle;
	}

	public String getClas_clsf(){
		return this.clas_clsf;
	}

	public String getEmp_clsf(){
		return this.emp_clsf;
	}

	public String getPrv_nops(){
		return this.prv_nops;
	}

	public String getThis_nops(){
		return this.this_nops;
	}

	public String getCmpr_nops(){
		return this.cmpr_nops;
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

	public String getFlag(){
		return this.flag;
	}

	public String getSQL(){
		 return "{ call MISHDL.SP_HD_SRCH_5112_A(? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		HD_SRCH_5112_ADM dm = (HD_SRCH_5112_ADM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.registerOutParameter(3, Types.VARCHAR);
		cstmt.setString(4, dm.cmpy_cd);
		cstmt.setString(5, dm.basi_dt);
		cstmt.setString(6, dm.gridtitle);
		cstmt.setString(7, dm.clas_clsf);
		cstmt.setString(8, dm.emp_clsf);
		cstmt.setString(9, dm.prv_nops);
		cstmt.setString(10, dm.this_nops);
		cstmt.setString(11, dm.cmpr_nops);
		cstmt.setString(12, dm.text_tag);
		cstmt.setString(13, dm.incmg_pers);
		cstmt.setString(14, dm.chg_pers);
		cstmt.setString(15, dm.flag);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.hd.srch.ds.HD_SRCH_5112_ADataSet();
	}



	public void print(){
		System.out.println("SQL = " + this.getSQL());
		System.out.println("cmpy_cd = [" + getCmpy_cd() + "]");
		System.out.println("basi_dt = [" + getBasi_dt() + "]");
		System.out.println("gridtitle = [" + getGridtitle() + "]");
		System.out.println("clas_clsf = [" + getClas_clsf() + "]");
		System.out.println("emp_clsf = [" + getEmp_clsf() + "]");
		System.out.println("prv_nops = [" + getPrv_nops() + "]");
		System.out.println("this_nops = [" + getThis_nops() + "]");
		System.out.println("cmpr_nops = [" + getCmpr_nops() + "]");
		System.out.println("tag1 = [" + getText_tag() + "]");
		System.out.println("incmg_pers = [" + getIncmg_pers() + "]");
		System.out.println("chg_pers = [" + getChg_pers() + "]");
		System.out.println("flag = [" + getFlag() + "]");
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
String gridtitle = req.getParameter("gridtitle");
if( gridtitle == null){
	System.out.println(this.toString+" : gridtitle is null" );
}else{
	System.out.println(this.toString+" : gridtitle is "+gridtitle );
}
String clas_clsf = req.getParameter("clas_clsf");
if( clas_clsf == null){
	System.out.println(this.toString+" : clas_clsf is null" );
}else{
	System.out.println(this.toString+" : clas_clsf is "+clas_clsf );
}
String emp_clsf = req.getParameter("emp_clsf");
if( emp_clsf == null){
	System.out.println(this.toString+" : emp_clsf is null" );
}else{
	System.out.println(this.toString+" : emp_clsf is "+emp_clsf );
}
String prv_nops = req.getParameter("prv_nops");
if( prv_nops == null){
	System.out.println(this.toString+" : prv_nops is null" );
}else{
	System.out.println(this.toString+" : prv_nops is "+prv_nops );
}
String this_nops = req.getParameter("this_nops");
if( this_nops == null){
	System.out.println(this.toString+" : this_nops is null" );
}else{
	System.out.println(this.toString+" : this_nops is "+this_nops );
}
String cmpr_nops = req.getParameter("cmpr_nops");
if( cmpr_nops == null){
	System.out.println(this.toString+" : cmpr_nops is null" );
}else{
	System.out.println(this.toString+" : cmpr_nops is "+cmpr_nops );
}
String tag1 = req.getParameter("tag1");
if( tag1 == null){
	System.out.println(this.toString+" : tag1 is null" );
}else{
	System.out.println(this.toString+" : tag1 is "+tag1 );
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
String flag = req.getParameter("flag");
if( flag == null){
	System.out.println(this.toString+" : flag is null" );
}else{
	System.out.println(this.toString+" : flag is "+flag );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.checkString(req.getParameter("cmpy_cd"));
String basi_dt = Util.checkString(req.getParameter("basi_dt"));
String gridtitle = Util.checkString(req.getParameter("gridtitle"));
String clas_clsf = Util.checkString(req.getParameter("clas_clsf"));
String emp_clsf = Util.checkString(req.getParameter("emp_clsf"));
String prv_nops = Util.checkString(req.getParameter("prv_nops"));
String this_nops = Util.checkString(req.getParameter("this_nops"));
String cmpr_nops = Util.checkString(req.getParameter("cmpr_nops"));
String tag1 = Util.checkString(req.getParameter("tag1"));
String incmg_pers = Util.checkString(req.getParameter("incmg_pers"));
String chg_pers = Util.checkString(req.getParameter("chg_pers"));
String flag = Util.checkString(req.getParameter("flag"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String basi_dt = Util.Uni2Ksc(Util.checkString(req.getParameter("basi_dt")));
String gridtitle = Util.Uni2Ksc(Util.checkString(req.getParameter("gridtitle")));
String clas_clsf = Util.Uni2Ksc(Util.checkString(req.getParameter("clas_clsf")));
String emp_clsf = Util.Uni2Ksc(Util.checkString(req.getParameter("emp_clsf")));
String prv_nops = Util.Uni2Ksc(Util.checkString(req.getParameter("prv_nops")));
String this_nops = Util.Uni2Ksc(Util.checkString(req.getParameter("this_nops")));
String cmpr_nops = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpr_nops")));
String tag1 = Util.Uni2Ksc(Util.checkString(req.getParameter("tag1")));
String incmg_pers = Util.Uni2Ksc(Util.checkString(req.getParameter("incmg_pers")));
String chg_pers = Util.Uni2Ksc(Util.checkString(req.getParameter("chg_pers")));
String flag = Util.Uni2Ksc(Util.checkString(req.getParameter("flag")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setCmpy_cd(cmpy_cd);
dm.setBasi_dt(basi_dt);
dm.setGridtitle(gridtitle);
dm.setClas_clsf(clas_clsf);
dm.setEmp_clsf(emp_clsf);
dm.setPrv_nops(prv_nops);
dm.setThis_nops(this_nops);
dm.setCmpr_nops(cmpr_nops);
dm.setTag1(tag1);
dm.setIncmg_pers(incmg_pers);
dm.setChg_pers(chg_pers);
dm.setFlag(flag);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Fri Jun 01 17:25:41 KST 2018 */