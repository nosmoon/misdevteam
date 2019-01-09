/***************************************************************************************************
* 파일명 : .java
* 기능 : 
* 작성일자 : 
* 작성자 : 이태식
***************************************************************************************************/
/***************************************************************************************************
* 수정내역 : 
* 수정자 : 
* 수정일자 :
* 백업 : 
***************************************************************************************************/


package chosun.ciis.tn.bas.dm;

import java.sql.*;
import oracle.jdbc.driver.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.tn.bas.ds.*;
import chosun.ciis.tn.bas.rec.*;

/**
 * 
 */


public class TN_BAS_1102_ADM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String cmpy_cd;
	public String incmg_pers;
	public String deptidx;
	public String organidx;
	public String deptname;
	public String deptcategory;
	public String description;

	public TN_BAS_1102_ADM(){}
	public TN_BAS_1102_ADM(String cmpy_cd, String incmg_pers, String deptidx, String organidx, String deptname, String deptcategory, String description){
		this.cmpy_cd = cmpy_cd;
		this.incmg_pers = incmg_pers;
		this.deptidx = deptidx;
		this.organidx = organidx;
		this.deptname = deptname;
		this.deptcategory = deptcategory;
		this.description = description;
	}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setIncmg_pers(String incmg_pers){
		this.incmg_pers = incmg_pers;
	}

	public void setDeptidx(String deptidx){
		this.deptidx = deptidx;
	}

	public void setOrganidx(String organidx){
		this.organidx = organidx;
	}

	public void setDeptname(String deptname){
		this.deptname = deptname;
	}

	public void setDeptcategory(String deptcategory){
		this.deptcategory = deptcategory;
	}

	public void setDescription(String description){
		this.description = description;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getIncmg_pers(){
		return this.incmg_pers;
	}

	public String getDeptidx(){
		return this.deptidx;
	}

	public String getOrganidx(){
		return this.organidx;
	}

	public String getDeptname(){
		return this.deptname;
	}

	public String getDeptcategory(){
		return this.deptcategory;
	}

	public String getDescription(){
		return this.description;
	}

	public String getSQL(){
		 return "{ call MISTNN.SP_TN_BAS_1102_A(? ,? ,? ,? ,? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		TN_BAS_1102_ADM dm = (TN_BAS_1102_ADM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.cmpy_cd);
		cstmt.setString(4, dm.incmg_pers);
		cstmt.setString(5, dm.deptidx);
		cstmt.setString(6, dm.organidx);
		cstmt.setString(7, dm.deptname);
		cstmt.setString(8, dm.deptcategory);
		cstmt.setString(9, dm.description);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.tn.bas.ds.TN_BAS_1102_ADataSet();
	}



	public void print(){
		System.out.println("SQL = " + this.getSQL());
		System.out.println("cmpy_cd = [" + getCmpy_cd() + "]");
		System.out.println("incmg_pers = [" + getIncmg_pers() + "]");
		System.out.println("deptidx = [" + getDeptidx() + "]");
		System.out.println("organidx = [" + getOrganidx() + "]");
		System.out.println("deptname = [" + getDeptname() + "]");
		System.out.println("deptcategory = [" + getDeptcategory() + "]");
		System.out.println("description = [" + getDescription() + "]");
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
String incmg_pers = req.getParameter("incmg_pers");
if( incmg_pers == null){
	System.out.println(this.toString+" : incmg_pers is null" );
}else{
	System.out.println(this.toString+" : incmg_pers is "+incmg_pers );
}
String deptidx = req.getParameter("deptidx");
if( deptidx == null){
	System.out.println(this.toString+" : deptidx is null" );
}else{
	System.out.println(this.toString+" : deptidx is "+deptidx );
}
String organidx = req.getParameter("organidx");
if( organidx == null){
	System.out.println(this.toString+" : organidx is null" );
}else{
	System.out.println(this.toString+" : organidx is "+organidx );
}
String deptname = req.getParameter("deptname");
if( deptname == null){
	System.out.println(this.toString+" : deptname is null" );
}else{
	System.out.println(this.toString+" : deptname is "+deptname );
}
String deptcategory = req.getParameter("deptcategory");
if( deptcategory == null){
	System.out.println(this.toString+" : deptcategory is null" );
}else{
	System.out.println(this.toString+" : deptcategory is "+deptcategory );
}
String description = req.getParameter("description");
if( description == null){
	System.out.println(this.toString+" : description is null" );
}else{
	System.out.println(this.toString+" : description is "+description );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.checkString(req.getParameter("cmpy_cd"));
String incmg_pers = Util.checkString(req.getParameter("incmg_pers"));
String deptidx = Util.checkString(req.getParameter("deptidx"));
String organidx = Util.checkString(req.getParameter("organidx"));
String deptname = Util.checkString(req.getParameter("deptname"));
String deptcategory = Util.checkString(req.getParameter("deptcategory"));
String description = Util.checkString(req.getParameter("description"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String incmg_pers = Util.Uni2Ksc(Util.checkString(req.getParameter("incmg_pers")));
String deptidx = Util.Uni2Ksc(Util.checkString(req.getParameter("deptidx")));
String organidx = Util.Uni2Ksc(Util.checkString(req.getParameter("organidx")));
String deptname = Util.Uni2Ksc(Util.checkString(req.getParameter("deptname")));
String deptcategory = Util.Uni2Ksc(Util.checkString(req.getParameter("deptcategory")));
String description = Util.Uni2Ksc(Util.checkString(req.getParameter("description")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setCmpy_cd(cmpy_cd);
dm.setIncmg_pers(incmg_pers);
dm.setDeptidx(deptidx);
dm.setOrganidx(organidx);
dm.setDeptname(deptname);
dm.setDeptcategory(deptcategory);
dm.setDescription(description);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Wed Jun 22 18:08:40 KST 2016 */