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


public class HD_SRCH_5122_ADM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String cmpy_cd;
	public String basi_dt;
	public String gridtitle;
	public String emp_clsf;
	public String dept_nops1;
	public String dept_nops2;
	public String dept_nops3;
	public String dept_nops4;
	public String dept_nops5;
	public String dept_nops6;
	public String dept_nops7;
	public String dept_nops8;
	public String dept_nops9;
	public String dept_nops10;
	public String sum_nops;
	public String ratio_nops;
	public String text_tag;
	public String incmg_pers;
	public String chg_pers;
	public String flag;

	public HD_SRCH_5122_ADM(){}
	public HD_SRCH_5122_ADM(String cmpy_cd, String basi_dt, String gridtitle, String emp_clsf, String dept_nops1, String dept_nops2, String dept_nops3, String dept_nops4, String dept_nops5, String dept_nops6, String dept_nops7, String dept_nops8, String dept_nops9, String dept_nops10, String sum_nops, String ratio_nops, String text_tag, String incmg_pers, String chg_pers, String flag){
		this.cmpy_cd = cmpy_cd;
		this.basi_dt = basi_dt;
		this.gridtitle = gridtitle;
		this.emp_clsf = emp_clsf;
		this.dept_nops1 = dept_nops1;
		this.dept_nops2 = dept_nops2;
		this.dept_nops3 = dept_nops3;
		this.dept_nops4 = dept_nops4;
		this.dept_nops5 = dept_nops5;
		this.dept_nops6 = dept_nops6;
		this.dept_nops7 = dept_nops7;
		this.dept_nops8 = dept_nops8;
		this.dept_nops9 = dept_nops9;
		this.dept_nops10 = dept_nops10;
		this.sum_nops = sum_nops;
		this.ratio_nops = ratio_nops;
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

	public void setEmp_clsf(String emp_clsf){
		this.emp_clsf = emp_clsf;
	}

	public void setDept_nops1(String dept_nops1){
		this.dept_nops1 = dept_nops1;
	}

	public void setDept_nops2(String dept_nops2){
		this.dept_nops2 = dept_nops2;
	}

	public void setDept_nops3(String dept_nops3){
		this.dept_nops3 = dept_nops3;
	}

	public void setDept_nops4(String dept_nops4){
		this.dept_nops4 = dept_nops4;
	}

	public void setDept_nops5(String dept_nops5){
		this.dept_nops5 = dept_nops5;
	}

	public void setDept_nops6(String dept_nops6){
		this.dept_nops6 = dept_nops6;
	}

	public void setDept_nops7(String dept_nops7){
		this.dept_nops7 = dept_nops7;
	}

	public void setDept_nops8(String dept_nops8){
		this.dept_nops8 = dept_nops8;
	}

	public void setDept_nops9(String dept_nops9){
		this.dept_nops9 = dept_nops9;
	}

	public void setDept_nops10(String dept_nops10){
		this.dept_nops10 = dept_nops10;
	}

	public void setSum_nops(String sum_nops){
		this.sum_nops = sum_nops;
	}

	public void setRatio_nops(String ratio_nops){
		this.ratio_nops = ratio_nops;
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

	public String getEmp_clsf(){
		return this.emp_clsf;
	}

	public String getDept_nops1(){
		return this.dept_nops1;
	}

	public String getDept_nops2(){
		return this.dept_nops2;
	}

	public String getDept_nops3(){
		return this.dept_nops3;
	}

	public String getDept_nops4(){
		return this.dept_nops4;
	}

	public String getDept_nops5(){
		return this.dept_nops5;
	}

	public String getDept_nops6(){
		return this.dept_nops6;
	}

	public String getDept_nops7(){
		return this.dept_nops7;
	}

	public String getDept_nops8(){
		return this.dept_nops8;
	}

	public String getDept_nops9(){
		return this.dept_nops9;
	}

	public String getDept_nops10(){
		return this.dept_nops10;
	}

	public String getSum_nops(){
		return this.sum_nops;
	}

	public String getRatio_nops(){
		return this.ratio_nops;
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
		 return "{ call MISHDL.SP_HD_SRCH_5122_A(? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		HD_SRCH_5122_ADM dm = (HD_SRCH_5122_ADM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.registerOutParameter(3, Types.VARCHAR);
		cstmt.setString(4, dm.cmpy_cd);
		cstmt.setString(5, dm.basi_dt);
		cstmt.setString(6, dm.gridtitle);
		cstmt.setString(7, dm.emp_clsf);
		cstmt.setString(8, dm.dept_nops1);
		cstmt.setString(9, dm.dept_nops2);
		cstmt.setString(10, dm.dept_nops3);
		cstmt.setString(11, dm.dept_nops4);
		cstmt.setString(12, dm.dept_nops5);
		cstmt.setString(13, dm.dept_nops6);
		cstmt.setString(14, dm.dept_nops7);
		cstmt.setString(15, dm.dept_nops8);
		cstmt.setString(16, dm.dept_nops9);
		cstmt.setString(17, dm.dept_nops10);
		cstmt.setString(18, dm.sum_nops);
		cstmt.setString(19, dm.ratio_nops);
		cstmt.setString(20, dm.text_tag);
		cstmt.setString(21, dm.incmg_pers);
		cstmt.setString(22, dm.chg_pers);
		cstmt.setString(23, dm.flag);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.hd.srch.ds.HD_SRCH_5122_ADataSet();
	}



	public void print(){
		System.out.println("SQL = " + this.getSQL());
		System.out.println("cmpy_cd = [" + getCmpy_cd() + "]");
		System.out.println("basi_dt = [" + getBasi_dt() + "]");
		System.out.println("gridtitle = [" + getGridtitle() + "]");
		System.out.println("emp_clsf = [" + getEmp_clsf() + "]");
		System.out.println("dept_nops1 = [" + getDept_nops1() + "]");
		System.out.println("dept_nops2 = [" + getDept_nops2() + "]");
		System.out.println("dept_nops3 = [" + getDept_nops3() + "]");
		System.out.println("dept_nops4 = [" + getDept_nops4() + "]");
		System.out.println("dept_nops5 = [" + getDept_nops5() + "]");
		System.out.println("dept_nops6 = [" + getDept_nops6() + "]");
		System.out.println("dept_nops7 = [" + getDept_nops7() + "]");
		System.out.println("dept_nops8 = [" + getDept_nops8() + "]");
		System.out.println("dept_nops9 = [" + getDept_nops9() + "]");
		System.out.println("dept_nops10 = [" + getDept_nops10() + "]");
		System.out.println("sum_nops = [" + getSum_nops() + "]");
		System.out.println("ratio_nops = [" + getRatio_nops() + "]");
		System.out.println("text_tag = [" + getText_tag() + "]");
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
String emp_clsf = req.getParameter("emp_clsf");
if( emp_clsf == null){
	System.out.println(this.toString+" : emp_clsf is null" );
}else{
	System.out.println(this.toString+" : emp_clsf is "+emp_clsf );
}
String dept_nops1 = req.getParameter("dept_nops1");
if( dept_nops1 == null){
	System.out.println(this.toString+" : dept_nops1 is null" );
}else{
	System.out.println(this.toString+" : dept_nops1 is "+dept_nops1 );
}
String dept_nops2 = req.getParameter("dept_nops2");
if( dept_nops2 == null){
	System.out.println(this.toString+" : dept_nops2 is null" );
}else{
	System.out.println(this.toString+" : dept_nops2 is "+dept_nops2 );
}
String dept_nops3 = req.getParameter("dept_nops3");
if( dept_nops3 == null){
	System.out.println(this.toString+" : dept_nops3 is null" );
}else{
	System.out.println(this.toString+" : dept_nops3 is "+dept_nops3 );
}
String dept_nops4 = req.getParameter("dept_nops4");
if( dept_nops4 == null){
	System.out.println(this.toString+" : dept_nops4 is null" );
}else{
	System.out.println(this.toString+" : dept_nops4 is "+dept_nops4 );
}
String dept_nops5 = req.getParameter("dept_nops5");
if( dept_nops5 == null){
	System.out.println(this.toString+" : dept_nops5 is null" );
}else{
	System.out.println(this.toString+" : dept_nops5 is "+dept_nops5 );
}
String dept_nops6 = req.getParameter("dept_nops6");
if( dept_nops6 == null){
	System.out.println(this.toString+" : dept_nops6 is null" );
}else{
	System.out.println(this.toString+" : dept_nops6 is "+dept_nops6 );
}
String dept_nops7 = req.getParameter("dept_nops7");
if( dept_nops7 == null){
	System.out.println(this.toString+" : dept_nops7 is null" );
}else{
	System.out.println(this.toString+" : dept_nops7 is "+dept_nops7 );
}
String dept_nops8 = req.getParameter("dept_nops8");
if( dept_nops8 == null){
	System.out.println(this.toString+" : dept_nops8 is null" );
}else{
	System.out.println(this.toString+" : dept_nops8 is "+dept_nops8 );
}
String dept_nops9 = req.getParameter("dept_nops9");
if( dept_nops9 == null){
	System.out.println(this.toString+" : dept_nops9 is null" );
}else{
	System.out.println(this.toString+" : dept_nops9 is "+dept_nops9 );
}
String dept_nops10 = req.getParameter("dept_nops10");
if( dept_nops10 == null){
	System.out.println(this.toString+" : dept_nops10 is null" );
}else{
	System.out.println(this.toString+" : dept_nops10 is "+dept_nops10 );
}
String sum_nops = req.getParameter("sum_nops");
if( sum_nops == null){
	System.out.println(this.toString+" : sum_nops is null" );
}else{
	System.out.println(this.toString+" : sum_nops is "+sum_nops );
}
String ratio_nops = req.getParameter("ratio_nops");
if( ratio_nops == null){
	System.out.println(this.toString+" : ratio_nops is null" );
}else{
	System.out.println(this.toString+" : ratio_nops is "+ratio_nops );
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
String emp_clsf = Util.checkString(req.getParameter("emp_clsf"));
String dept_nops1 = Util.checkString(req.getParameter("dept_nops1"));
String dept_nops2 = Util.checkString(req.getParameter("dept_nops2"));
String dept_nops3 = Util.checkString(req.getParameter("dept_nops3"));
String dept_nops4 = Util.checkString(req.getParameter("dept_nops4"));
String dept_nops5 = Util.checkString(req.getParameter("dept_nops5"));
String dept_nops6 = Util.checkString(req.getParameter("dept_nops6"));
String dept_nops7 = Util.checkString(req.getParameter("dept_nops7"));
String dept_nops8 = Util.checkString(req.getParameter("dept_nops8"));
String dept_nops9 = Util.checkString(req.getParameter("dept_nops9"));
String dept_nops10 = Util.checkString(req.getParameter("dept_nops10"));
String sum_nops = Util.checkString(req.getParameter("sum_nops"));
String ratio_nops = Util.checkString(req.getParameter("ratio_nops"));
String text_tag = Util.checkString(req.getParameter("text_tag"));
String incmg_pers = Util.checkString(req.getParameter("incmg_pers"));
String chg_pers = Util.checkString(req.getParameter("chg_pers"));
String flag = Util.checkString(req.getParameter("flag"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String basi_dt = Util.Uni2Ksc(Util.checkString(req.getParameter("basi_dt")));
String gridtitle = Util.Uni2Ksc(Util.checkString(req.getParameter("gridtitle")));
String emp_clsf = Util.Uni2Ksc(Util.checkString(req.getParameter("emp_clsf")));
String dept_nops1 = Util.Uni2Ksc(Util.checkString(req.getParameter("dept_nops1")));
String dept_nops2 = Util.Uni2Ksc(Util.checkString(req.getParameter("dept_nops2")));
String dept_nops3 = Util.Uni2Ksc(Util.checkString(req.getParameter("dept_nops3")));
String dept_nops4 = Util.Uni2Ksc(Util.checkString(req.getParameter("dept_nops4")));
String dept_nops5 = Util.Uni2Ksc(Util.checkString(req.getParameter("dept_nops5")));
String dept_nops6 = Util.Uni2Ksc(Util.checkString(req.getParameter("dept_nops6")));
String dept_nops7 = Util.Uni2Ksc(Util.checkString(req.getParameter("dept_nops7")));
String dept_nops8 = Util.Uni2Ksc(Util.checkString(req.getParameter("dept_nops8")));
String dept_nops9 = Util.Uni2Ksc(Util.checkString(req.getParameter("dept_nops9")));
String dept_nops10 = Util.Uni2Ksc(Util.checkString(req.getParameter("dept_nops10")));
String sum_nops = Util.Uni2Ksc(Util.checkString(req.getParameter("sum_nops")));
String ratio_nops = Util.Uni2Ksc(Util.checkString(req.getParameter("ratio_nops")));
String text_tag = Util.Uni2Ksc(Util.checkString(req.getParameter("text_tag")));
String incmg_pers = Util.Uni2Ksc(Util.checkString(req.getParameter("incmg_pers")));
String chg_pers = Util.Uni2Ksc(Util.checkString(req.getParameter("chg_pers")));
String flag = Util.Uni2Ksc(Util.checkString(req.getParameter("flag")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setCmpy_cd(cmpy_cd);
dm.setBasi_dt(basi_dt);
dm.setGridtitle(gridtitle);
dm.setEmp_clsf(emp_clsf);
dm.setDept_nops1(dept_nops1);
dm.setDept_nops2(dept_nops2);
dm.setDept_nops3(dept_nops3);
dm.setDept_nops4(dept_nops4);
dm.setDept_nops5(dept_nops5);
dm.setDept_nops6(dept_nops6);
dm.setDept_nops7(dept_nops7);
dm.setDept_nops8(dept_nops8);
dm.setDept_nops9(dept_nops9);
dm.setDept_nops10(dept_nops10);
dm.setSum_nops(sum_nops);
dm.setRatio_nops(ratio_nops);
dm.setText_tag(text_tag);
dm.setIncmg_pers(incmg_pers);
dm.setChg_pers(chg_pers);
dm.setFlag(flag);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Wed Nov 14 11:10:22 KST 2018 */