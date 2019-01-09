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


package chosun.ciis.mc.budg.dm;

import java.sql.*;
import oracle.jdbc.driver.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.mc.budg.ds.*;
import chosun.ciis.mc.budg.rec.*;

/**
 * 
 */


public class MC_BUDG_2125_DDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String cmpy_cd;
	public String work_tag;
	public String budg_yyyy;
	public String dept_cd;
	public String work_no;
	public String evnt_cd;
	public String use_dept_cd;
	public String grid1_mode;
	public String grid1_rownum;
	public String grid1_seq;
	public String grid1_budg_cd;
	public String incmg_pers;
	public String chg_pers;
	public String incmg_pers_ipadd;

	public MC_BUDG_2125_DDM(){}
	public MC_BUDG_2125_DDM(String cmpy_cd, String work_tag, String budg_yyyy, String dept_cd, String work_no, String evnt_cd, String use_dept_cd, String grid1_mode, String grid1_rownum, String grid1_seq, String grid1_budg_cd, String incmg_pers, String chg_pers, String incmg_pers_ipadd){
		this.cmpy_cd = cmpy_cd;
		this.work_tag = work_tag;
		this.budg_yyyy = budg_yyyy;
		this.dept_cd = dept_cd;
		this.work_no = work_no;
		this.evnt_cd = evnt_cd;
		this.use_dept_cd = use_dept_cd;
		this.grid1_mode = grid1_mode;
		this.grid1_rownum = grid1_rownum;
		this.grid1_seq = grid1_seq;
		this.grid1_budg_cd = grid1_budg_cd;
		this.incmg_pers = incmg_pers;
		this.chg_pers = chg_pers;
		this.incmg_pers_ipadd = incmg_pers_ipadd;
	}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setWork_tag(String work_tag){
		this.work_tag = work_tag;
	}

	public void setBudg_yyyy(String budg_yyyy){
		this.budg_yyyy = budg_yyyy;
	}

	public void setDept_cd(String dept_cd){
		this.dept_cd = dept_cd;
	}

	public void setWork_no(String work_no){
		this.work_no = work_no;
	}

	public void setEvnt_cd(String evnt_cd){
		this.evnt_cd = evnt_cd;
	}

	public void setUse_dept_cd(String use_dept_cd){
		this.use_dept_cd = use_dept_cd;
	}

	public void setGrid1_mode(String grid1_mode){
		this.grid1_mode = grid1_mode;
	}

	public void setGrid1_rownum(String grid1_rownum){
		this.grid1_rownum = grid1_rownum;
	}

	public void setGrid1_seq(String grid1_seq){
		this.grid1_seq = grid1_seq;
	}

	public void setGrid1_budg_cd(String grid1_budg_cd){
		this.grid1_budg_cd = grid1_budg_cd;
	}

	public void setIncmg_pers(String incmg_pers){
		this.incmg_pers = incmg_pers;
	}

	public void setChg_pers(String chg_pers){
		this.chg_pers = chg_pers;
	}

	public void setIncmg_pers_ipadd(String incmg_pers_ipadd){
		this.incmg_pers_ipadd = incmg_pers_ipadd;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getWork_tag(){
		return this.work_tag;
	}

	public String getBudg_yyyy(){
		return this.budg_yyyy;
	}

	public String getDept_cd(){
		return this.dept_cd;
	}

	public String getWork_no(){
		return this.work_no;
	}

	public String getEvnt_cd(){
		return this.evnt_cd;
	}

	public String getUse_dept_cd(){
		return this.use_dept_cd;
	}

	public String getGrid1_mode(){
		return this.grid1_mode;
	}

	public String getGrid1_rownum(){
		return this.grid1_rownum;
	}

	public String getGrid1_seq(){
		return this.grid1_seq;
	}

	public String getGrid1_budg_cd(){
		return this.grid1_budg_cd;
	}

	public String getIncmg_pers(){
		return this.incmg_pers;
	}

	public String getChg_pers(){
		return this.chg_pers;
	}

	public String getIncmg_pers_ipadd(){
		return this.incmg_pers_ipadd;
	}

	public String getSQL(){
		 return "{ call MISFNC.SP_MC_BUDG_2125_D(? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		MC_BUDG_2125_DDM dm = (MC_BUDG_2125_DDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.cmpy_cd);
		cstmt.setString(4, dm.work_tag);
		cstmt.setString(5, dm.budg_yyyy);
		cstmt.setString(6, dm.dept_cd);
		cstmt.setString(7, dm.work_no);
		cstmt.setString(8, dm.evnt_cd);
		cstmt.setString(9, dm.use_dept_cd);
		cstmt.setString(10, dm.grid1_mode);
		cstmt.setString(11, dm.grid1_rownum);
		cstmt.setString(12, dm.grid1_seq);
		cstmt.setString(13, dm.grid1_budg_cd);
		cstmt.setString(14, dm.incmg_pers);
		cstmt.setString(15, dm.chg_pers);
		cstmt.setString(16, dm.incmg_pers_ipadd);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.mc.budg.ds.MC_BUDG_2125_DDataSet();
	}



	public void print(){
		System.out.println("SQL = " + this.getSQL());
		System.out.println("cmpy_cd = [" + getCmpy_cd() + "]");
		System.out.println("work_tag = [" + getWork_tag() + "]");
		System.out.println("budg_yyyy = [" + getBudg_yyyy() + "]");
		System.out.println("dept_cd = [" + getDept_cd() + "]");
		System.out.println("work_no = [" + getWork_no() + "]");
		System.out.println("evnt_cd = [" + getEvnt_cd() + "]");
		System.out.println("use_dept_cd = [" + getUse_dept_cd() + "]");
		System.out.println("grid1_mode = [" + getGrid1_mode() + "]");
		System.out.println("grid1_rownum = [" + getGrid1_rownum() + "]");
		System.out.println("grid1_seq = [" + getGrid1_seq() + "]");
		System.out.println("grid1_budg_cd = [" + getGrid1_budg_cd() + "]");
		System.out.println("incmg_pers = [" + getIncmg_pers() + "]");
		System.out.println("chg_pers = [" + getChg_pers() + "]");
		System.out.println("incmg_pers_ipadd = [" + getIncmg_pers_ipadd() + "]");
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
String work_tag = req.getParameter("work_tag");
if( work_tag == null){
	System.out.println(this.toString+" : work_tag is null" );
}else{
	System.out.println(this.toString+" : work_tag is "+work_tag );
}
String budg_yyyy = req.getParameter("budg_yyyy");
if( budg_yyyy == null){
	System.out.println(this.toString+" : budg_yyyy is null" );
}else{
	System.out.println(this.toString+" : budg_yyyy is "+budg_yyyy );
}
String dept_cd = req.getParameter("dept_cd");
if( dept_cd == null){
	System.out.println(this.toString+" : dept_cd is null" );
}else{
	System.out.println(this.toString+" : dept_cd is "+dept_cd );
}
String work_no = req.getParameter("work_no");
if( work_no == null){
	System.out.println(this.toString+" : work_no is null" );
}else{
	System.out.println(this.toString+" : work_no is "+work_no );
}
String evnt_cd = req.getParameter("evnt_cd");
if( evnt_cd == null){
	System.out.println(this.toString+" : evnt_cd is null" );
}else{
	System.out.println(this.toString+" : evnt_cd is "+evnt_cd );
}
String use_dept_cd = req.getParameter("use_dept_cd");
if( use_dept_cd == null){
	System.out.println(this.toString+" : use_dept_cd is null" );
}else{
	System.out.println(this.toString+" : use_dept_cd is "+use_dept_cd );
}
String grid1_mode = req.getParameter("grid1_mode");
if( grid1_mode == null){
	System.out.println(this.toString+" : grid1_mode is null" );
}else{
	System.out.println(this.toString+" : grid1_mode is "+grid1_mode );
}
String grid1_rownum = req.getParameter("grid1_rownum");
if( grid1_rownum == null){
	System.out.println(this.toString+" : grid1_rownum is null" );
}else{
	System.out.println(this.toString+" : grid1_rownum is "+grid1_rownum );
}
String grid1_seq = req.getParameter("grid1_seq");
if( grid1_seq == null){
	System.out.println(this.toString+" : grid1_seq is null" );
}else{
	System.out.println(this.toString+" : grid1_seq is "+grid1_seq );
}
String grid1_budg_cd = req.getParameter("grid1_budg_cd");
if( grid1_budg_cd == null){
	System.out.println(this.toString+" : grid1_budg_cd is null" );
}else{
	System.out.println(this.toString+" : grid1_budg_cd is "+grid1_budg_cd );
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
String incmg_pers_ipadd = req.getParameter("incmg_pers_ipadd");
if( incmg_pers_ipadd == null){
	System.out.println(this.toString+" : incmg_pers_ipadd is null" );
}else{
	System.out.println(this.toString+" : incmg_pers_ipadd is "+incmg_pers_ipadd );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.checkString(req.getParameter("cmpy_cd"));
String work_tag = Util.checkString(req.getParameter("work_tag"));
String budg_yyyy = Util.checkString(req.getParameter("budg_yyyy"));
String dept_cd = Util.checkString(req.getParameter("dept_cd"));
String work_no = Util.checkString(req.getParameter("work_no"));
String evnt_cd = Util.checkString(req.getParameter("evnt_cd"));
String use_dept_cd = Util.checkString(req.getParameter("use_dept_cd"));
String grid1_mode = Util.checkString(req.getParameter("grid1_mode"));
String grid1_rownum = Util.checkString(req.getParameter("grid1_rownum"));
String grid1_seq = Util.checkString(req.getParameter("grid1_seq"));
String grid1_budg_cd = Util.checkString(req.getParameter("grid1_budg_cd"));
String incmg_pers = Util.checkString(req.getParameter("incmg_pers"));
String chg_pers = Util.checkString(req.getParameter("chg_pers"));
String incmg_pers_ipadd = Util.checkString(req.getParameter("incmg_pers_ipadd"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String work_tag = Util.Uni2Ksc(Util.checkString(req.getParameter("work_tag")));
String budg_yyyy = Util.Uni2Ksc(Util.checkString(req.getParameter("budg_yyyy")));
String dept_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("dept_cd")));
String work_no = Util.Uni2Ksc(Util.checkString(req.getParameter("work_no")));
String evnt_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("evnt_cd")));
String use_dept_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("use_dept_cd")));
String grid1_mode = Util.Uni2Ksc(Util.checkString(req.getParameter("grid1_mode")));
String grid1_rownum = Util.Uni2Ksc(Util.checkString(req.getParameter("grid1_rownum")));
String grid1_seq = Util.Uni2Ksc(Util.checkString(req.getParameter("grid1_seq")));
String grid1_budg_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("grid1_budg_cd")));
String incmg_pers = Util.Uni2Ksc(Util.checkString(req.getParameter("incmg_pers")));
String chg_pers = Util.Uni2Ksc(Util.checkString(req.getParameter("chg_pers")));
String incmg_pers_ipadd = Util.Uni2Ksc(Util.checkString(req.getParameter("incmg_pers_ipadd")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setCmpy_cd(cmpy_cd);
dm.setWork_tag(work_tag);
dm.setBudg_yyyy(budg_yyyy);
dm.setDept_cd(dept_cd);
dm.setWork_no(work_no);
dm.setEvnt_cd(evnt_cd);
dm.setUse_dept_cd(use_dept_cd);
dm.setGrid1_mode(grid1_mode);
dm.setGrid1_rownum(grid1_rownum);
dm.setGrid1_seq(grid1_seq);
dm.setGrid1_budg_cd(grid1_budg_cd);
dm.setIncmg_pers(incmg_pers);
dm.setChg_pers(chg_pers);
dm.setIncmg_pers_ipadd(incmg_pers_ipadd);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Wed May 27 16:06:20 KST 2009 */