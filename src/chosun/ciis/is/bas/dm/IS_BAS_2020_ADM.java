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


package chosun.ciis.is.bas.dm;

import java.sql.*;
import oracle.jdbc.driver.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.is.bas.ds.*;
import chosun.ciis.is.bas.rec.*;

/**
 * 
 */


public class IS_BAS_2020_ADM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String cmpy_cd;
	public String year;
	public String mode;
	public String trgt_mm;
	public String chrg_pers;
	public String dept_cd;
	public String sub_dept_cd;
	public String trgt_clamt;
	public String remk;
	public String incmg_pers;
	public String incmg_pers_ip;

	public IS_BAS_2020_ADM(){}
	public IS_BAS_2020_ADM(String cmpy_cd, String year, String mode, String trgt_mm, String chrg_pers, String dept_cd, String sub_dept_cd, String trgt_clamt, String remk, String incmg_pers, String incmg_pers_ip){
		this.cmpy_cd = cmpy_cd;
		this.year = year;
		this.mode = mode;
		this.trgt_mm = trgt_mm;
		this.chrg_pers = chrg_pers;
		this.dept_cd = dept_cd;
		this.sub_dept_cd = sub_dept_cd;
		this.trgt_clamt = trgt_clamt;
		this.remk = remk;
		this.incmg_pers = incmg_pers;
		this.incmg_pers_ip = incmg_pers_ip;
	}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setYear(String year){
		this.year = year;
	}

	public void setMode(String mode){
		this.mode = mode;
	}

	public void setTrgt_mm(String trgt_mm){
		this.trgt_mm = trgt_mm;
	}

	public void setChrg_pers(String chrg_pers){
		this.chrg_pers = chrg_pers;
	}

	public void setDept_cd(String dept_cd){
		this.dept_cd = dept_cd;
	}

	public void setSub_dept_cd(String sub_dept_cd){
		this.sub_dept_cd = sub_dept_cd;
	}

	public void setTrgt_clamt(String trgt_clamt){
		this.trgt_clamt = trgt_clamt;
	}

	public void setRemk(String remk){
		this.remk = remk;
	}

	public void setIncmg_pers(String incmg_pers){
		this.incmg_pers = incmg_pers;
	}

	public void setIncmg_pers_ip(String incmg_pers_ip){
		this.incmg_pers_ip = incmg_pers_ip;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getYear(){
		return this.year;
	}

	public String getMode(){
		return this.mode;
	}

	public String getTrgt_mm(){
		return this.trgt_mm;
	}

	public String getChrg_pers(){
		return this.chrg_pers;
	}

	public String getDept_cd(){
		return this.dept_cd;
	}

	public String getSub_dept_cd(){
		return this.sub_dept_cd;
	}

	public String getTrgt_clamt(){
		return this.trgt_clamt;
	}

	public String getRemk(){
		return this.remk;
	}

	public String getIncmg_pers(){
		return this.incmg_pers;
	}

	public String getIncmg_pers_ip(){
		return this.incmg_pers_ip;
	}

	public String getSQL(){
		 return "{ call MISISP.SP_IS_BAS_2020_A(? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		IS_BAS_2020_ADM dm = (IS_BAS_2020_ADM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.cmpy_cd);
		cstmt.setString(4, dm.year);
		cstmt.setString(5, dm.mode);
		cstmt.setString(6, dm.trgt_mm);
		cstmt.setString(7, dm.chrg_pers);
		cstmt.setString(8, dm.dept_cd);
		cstmt.setString(9, dm.sub_dept_cd);
		cstmt.setString(10, dm.trgt_clamt);
		cstmt.setString(11, dm.remk);
		cstmt.setString(12, dm.incmg_pers);
		cstmt.setString(13, dm.incmg_pers_ip);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.is.bas.ds.IS_BAS_2020_ADataSet();
	}



	public void print(){
		System.out.println("SQL = " + this.getSQL());
		System.out.println("cmpy_cd = [" + getCmpy_cd() + "]");
		System.out.println("year = [" + getYear() + "]");
		System.out.println("mode = [" + getMode() + "]");
		System.out.println("trgt_mm = [" + getTrgt_mm() + "]");
		System.out.println("chrg_pers = [" + getChrg_pers() + "]");
		System.out.println("dept_cd = [" + getDept_cd() + "]");
		System.out.println("sub_dept_cd = [" + getSub_dept_cd() + "]");
		System.out.println("trgt_clamt = [" + getTrgt_clamt() + "]");
		System.out.println("remk = [" + getRemk() + "]");
		System.out.println("incmg_pers = [" + getIncmg_pers() + "]");
		System.out.println("incmg_pers_ip = [" + getIncmg_pers_ip() + "]");
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
String year = req.getParameter("year");
if( year == null){
	System.out.println(this.toString+" : year is null" );
}else{
	System.out.println(this.toString+" : year is "+year );
}
String mode = req.getParameter("mode");
if( mode == null){
	System.out.println(this.toString+" : mode is null" );
}else{
	System.out.println(this.toString+" : mode is "+mode );
}
String trgt_mm = req.getParameter("trgt_mm");
if( trgt_mm == null){
	System.out.println(this.toString+" : trgt_mm is null" );
}else{
	System.out.println(this.toString+" : trgt_mm is "+trgt_mm );
}
String chrg_pers = req.getParameter("chrg_pers");
if( chrg_pers == null){
	System.out.println(this.toString+" : chrg_pers is null" );
}else{
	System.out.println(this.toString+" : chrg_pers is "+chrg_pers );
}
String dept_cd = req.getParameter("dept_cd");
if( dept_cd == null){
	System.out.println(this.toString+" : dept_cd is null" );
}else{
	System.out.println(this.toString+" : dept_cd is "+dept_cd );
}
String sub_dept_cd = req.getParameter("sub_dept_cd");
if( sub_dept_cd == null){
	System.out.println(this.toString+" : sub_dept_cd is null" );
}else{
	System.out.println(this.toString+" : sub_dept_cd is "+sub_dept_cd );
}
String trgt_clamt = req.getParameter("trgt_clamt");
if( trgt_clamt == null){
	System.out.println(this.toString+" : trgt_clamt is null" );
}else{
	System.out.println(this.toString+" : trgt_clamt is "+trgt_clamt );
}
String remk = req.getParameter("remk");
if( remk == null){
	System.out.println(this.toString+" : remk is null" );
}else{
	System.out.println(this.toString+" : remk is "+remk );
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
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.checkString(req.getParameter("cmpy_cd"));
String year = Util.checkString(req.getParameter("year"));
String mode = Util.checkString(req.getParameter("mode"));
String trgt_mm = Util.checkString(req.getParameter("trgt_mm"));
String chrg_pers = Util.checkString(req.getParameter("chrg_pers"));
String dept_cd = Util.checkString(req.getParameter("dept_cd"));
String sub_dept_cd = Util.checkString(req.getParameter("sub_dept_cd"));
String trgt_clamt = Util.checkString(req.getParameter("trgt_clamt"));
String remk = Util.checkString(req.getParameter("remk"));
String incmg_pers = Util.checkString(req.getParameter("incmg_pers"));
String incmg_pers_ip = Util.checkString(req.getParameter("incmg_pers_ip"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String year = Util.Uni2Ksc(Util.checkString(req.getParameter("year")));
String mode = Util.Uni2Ksc(Util.checkString(req.getParameter("mode")));
String trgt_mm = Util.Uni2Ksc(Util.checkString(req.getParameter("trgt_mm")));
String chrg_pers = Util.Uni2Ksc(Util.checkString(req.getParameter("chrg_pers")));
String dept_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("dept_cd")));
String sub_dept_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("sub_dept_cd")));
String trgt_clamt = Util.Uni2Ksc(Util.checkString(req.getParameter("trgt_clamt")));
String remk = Util.Uni2Ksc(Util.checkString(req.getParameter("remk")));
String incmg_pers = Util.Uni2Ksc(Util.checkString(req.getParameter("incmg_pers")));
String incmg_pers_ip = Util.Uni2Ksc(Util.checkString(req.getParameter("incmg_pers_ip")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setCmpy_cd(cmpy_cd);
dm.setYear(year);
dm.setMode(mode);
dm.setTrgt_mm(trgt_mm);
dm.setChrg_pers(chrg_pers);
dm.setDept_cd(dept_cd);
dm.setSub_dept_cd(sub_dept_cd);
dm.setTrgt_clamt(trgt_clamt);
dm.setRemk(remk);
dm.setIncmg_pers(incmg_pers);
dm.setIncmg_pers_ip(incmg_pers_ip);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Wed Apr 25 10:59:35 KST 2012 */